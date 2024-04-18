    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.curso.open.swing.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.openswing.swing.client.GridControl;
import org.openswing.swing.message.send.java.FilterWhereClause;
import org.openswing.swing.util.java.Consts;

/**
 *
 * @author diego
 */
public abstract class Util {
    private static Alerta objAlerta;
    
    public static Alerta getAlerta() {
        if (objAlerta == null) {
            objAlerta = new Alerta();
        }
        return objAlerta;
    }
        public static Map ajustaFiltro(Map filteredColumns) {

        Iterator it = filteredColumns.keySet().iterator();
        String attributeName;
        String auxiliar;

        while (it.hasNext()) {

            attributeName = it.next().toString();

            FilterWhereClause[] filtro = (FilterWhereClause[]) filteredColumns.get(attributeName);

            if (!filtro[0].getOperator().equals(Consts.IS_NOT_NULL) && !filtro[0].getOperator().equals(Consts.IS_NULL) && !(filtro[0].getValue() instanceof ArrayList)
                    && (filtro[0].getValue() == null || filtro[0].getValue().toString().equals("[]"))) {

                switch (filtro[0].getOperator()) {
                    case Consts.EQ:
                        filtro[0].setOperator(Consts.IS_NULL);
                        break;
                    case Consts.NEQ:
                        filtro[0].setOperator(Consts.IS_NOT_NULL);
                        break;
                    default:
                        filteredColumns.remove(attributeName);
                        break;
                }

            } else if (filtro[0].getOperator() != null || !filtro[0].getOperator().trim().equals("")) {

                if (filtro[0].getOperator().trim().equalsIgnoreCase("ilike") || filtro[0].getOperator().trim().equalsIgnoreCase("like")) {

                    auxiliar = filtro[0].getValue().toString();

                    if (auxiliar.trim().equals("") || (!auxiliar.substring(0, 1).equals("%")
                            && !auxiliar.substring(auxiliar.length() - 1, auxiliar.length()).equals("%"))) {

                        auxiliar = "%" + auxiliar + "%";
                        filtro[0].setValue(auxiliar);
                        filteredColumns.put(attributeName, filtro);
                    }
                }
            }
        }

        return filteredColumns;
    }

    public static ArrayList carregarColunas(GridControl gridControl) {

        ArrayList colunas = new ArrayList();
        for (int i = 0; i < gridControl.getColumnContainer().getComponentCount(); i++) {

            colunas.add(gridControl.getColumnContainer().getComponent(i));
        }
        return colunas;
    }

}
