/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.curso.open.swing.controller;

import br.com.curso.open.swing.dao.FuncionarioDao;
import br.com.curso.open.swing.util.Util;
import br.com.curso.open.swing.view.FuncionarioView;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.openswing.swing.client.GridControl;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.VOListResponse;
import org.openswing.swing.message.send.java.GridParams;
import org.openswing.swing.table.client.GridController;

import org.openswing.swing.table.java.GridDataLocator;

/**
 *
 * @author diego
 */
public class FuncionarioGridController extends GridController implements GridDataLocator {

    public FuncionarioView view;
    public FuncionarioDao funcionarioDao = new FuncionarioDao();

    public FuncionarioGridController() {
        this.view = new FuncionarioView();
        this.view.getGridControlFuncionario().setController(FuncionarioGridController.this);
        this.view.getGridControlFuncionario().setGridDataLocator(FuncionarioGridController.this);
        this.view.setVisible(true);
        this.view.getGridControlFuncionario().getTable().setDimensionFilterDialog(new Dimension(480, 500)); //set filter component size
    }

    @Override
    public Response loadData(int action,
            int startIndex,
            Map filteredColumns,
            ArrayList currentSortedColumns,
            ArrayList currentSortedVersusColumns,
            Class valueObjectType,
            Map otherGridParams) {

        filteredColumns = Util.ajustaFiltro(filteredColumns);

        GridParams gridParams = new GridParams(
                action,
                startIndex,
                filteredColumns,
                currentSortedColumns,
                currentSortedVersusColumns,
                new HashMap()
        );

        return this.funcionarioDao.loadData(gridParams);
    }

    @Override
    public Response insertRecords(int[] rowNumbers, ArrayList newValueObjects) throws Exception {

        return this.funcionarioDao.insertRecords(newValueObjects);
    }

    @Override
    public Response updateRecords(int[] rowNumbers, ArrayList oldPersistentObjects, ArrayList persistentObjects) throws Exception {

        return this.funcionarioDao.updateRecords(persistentObjects);
    }

    @Override
    public Response deleteRecords(ArrayList persistentObjects) throws Exception {

        return this.funcionarioDao.deleteRecords(persistentObjects);
    }

    @Override
    public void afterInsertGrid(GridControl grid) {

        grid.reloadData();
    }

    public FuncionarioView getView() {
        return view;
    }
}
