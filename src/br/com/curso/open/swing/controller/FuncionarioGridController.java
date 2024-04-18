/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.curso.open.swing.controller;

import br.com.curso.open.swing.view.FuncionarioView;
import java.util.ArrayList;
import java.util.Map;
import org.openswing.swing.client.GridControl;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.VOListResponse;
import org.openswing.swing.table.client.GridController;
import org.openswing.swing.table.java.GridDataLocator;

/**
 *
 * @author diego
 */
public class FuncionarioGridController extends GridController implements GridDataLocator{
    public FuncionarioView view;
    
    public FuncionarioGridController() {
        this.view = new FuncionarioView();
        this.view.setVisible(true);
    }
    
    
    @Override
    public Response loadData(int action, int startIndex, Map filteredColumns, ArrayList currentSortedColumns, ArrayList currentSortedVersusColumns, Class valueObjectType, Map otherGridParams) {
        return new VOListResponse();
    }

    public FuncionarioView getView() {
        return view;
    }
}
