/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.curso.open.swing.view;

import br.com.curso.open.swing.controller.FuncionarioGridController;
import br.com.curso.open.swing.util.Util;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import javax.swing.text.MaskFormatter;
import org.openswing.swing.client.GridControl;
import org.openswing.swing.lookup.client.LookupController;


/**
 *
 * @author diego
 */
public class FuncionarioView extends javax.swing.JFrame {

    /**
     * Creates new form FuncionarioView
     */
    public FuncionarioView() {
        initComponents();        
        this.organizarDomain();
        this.organizarMascaras();
        this.organizarLookup();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        filterButton1 = new org.openswing.swing.client.FilterButton();
        editButton1 = new org.openswing.swing.client.EditButton();
        deleteButton1 = new org.openswing.swing.client.DeleteButton();
        saveButton1 = new org.openswing.swing.client.SaveButton();
        insertButton1 = new org.openswing.swing.client.InsertButton();
        reloadButton1 = new org.openswing.swing.client.ReloadButton();
        jPanel2 = new javax.swing.JPanel();
        gridControlFuncionario = new org.openswing.swing.client.GridControl();
        textColumnNome = new org.openswing.swing.table.columns.client.TextColumn();
        comboColumnSexo = new org.openswing.swing.table.columns.client.ComboColumn();
        currencyColumnSalario = new org.openswing.swing.table.columns.client.CurrencyColumn();
        dateColumnDataEntrada = new org.openswing.swing.table.columns.client.DateColumn();
        dateColumnDataSaida = new org.openswing.swing.table.columns.client.DateColumn();
        textColumnCidade = new org.openswing.swing.table.columns.client.TextColumn();
        textColumnLogradouro = new org.openswing.swing.table.columns.client.TextColumn();
        textColumnNumero = new org.openswing.swing.table.columns.client.TextColumn();
        textColumnComplemento = new org.openswing.swing.table.columns.client.TextColumn();
        textColumnBairro = new org.openswing.swing.table.columns.client.TextColumn();
        comboColumnUf = new org.openswing.swing.table.columns.client.ComboColumn();
        formattedTextColumnCep = new org.openswing.swing.table.columns.client.FormattedTextColumn();
        codLookupColumnCargo = new org.openswing.swing.table.columns.client.CodLookupColumn();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel1.setMinimumSize(new java.awt.Dimension(40, 40));
        jPanel1.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel1.add(filterButton1);
        jPanel1.add(editButton1);
        jPanel1.add(deleteButton1);
        jPanel1.add(saveButton1);
        jPanel1.add(insertButton1);
        jPanel1.add(reloadButton1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(40, 40));
        jPanel2.setMinimumSize(new java.awt.Dimension(40, 40));
        jPanel2.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        gridControlFuncionario.setDeleteButton(this.deleteButton1);
        gridControlFuncionario.setEditButton(this.editButton1);
        gridControlFuncionario.setFilterButton(this.filterButton1);
        gridControlFuncionario.setInsertButton(this.insertButton1);
        gridControlFuncionario.setReloadButton(this.reloadButton1);
        gridControlFuncionario.setSaveButton(this.saveButton1);
        gridControlFuncionario.setSingleExpandableRow(true);
        gridControlFuncionario.setValueObjectClassName("br.com.curso.open.swing.vo.FuncionarioVo");

        textColumnNome.setColumnFilterable(true);
        textColumnNome.setColumnName("nome");
        textColumnNome.setColumnSortable(true);
        textColumnNome.setEditableOnEdit(true);
        textColumnNome.setEditableOnInsert(true);
        textColumnNome.setHeaderColumnName("Nome");
        gridControlFuncionario.getColumnContainer().add(textColumnNome);

        comboColumnSexo.setColumnFilterable(true);
        comboColumnSexo.setColumnName("sexo");
        comboColumnSexo.setColumnSortable(true);
        comboColumnSexo.setEditableOnEdit(true);
        comboColumnSexo.setEditableOnInsert(true);
        comboColumnSexo.setHeaderColumnName("Sexo");
        gridControlFuncionario.getColumnContainer().add(comboColumnSexo);

        currencyColumnSalario.setColumnFilterable(true);
        currencyColumnSalario.setColumnName("salario");
        currencyColumnSalario.setColumnRequired(false);
        currencyColumnSalario.setColumnSortable(true);
        currencyColumnSalario.setEditableOnEdit(true);
        currencyColumnSalario.setEditableOnInsert(true);
        currencyColumnSalario.setHeaderColumnName("Salário");
        gridControlFuncionario.getColumnContainer().add(currencyColumnSalario);

        dateColumnDataEntrada.setColumnFilterable(true);
        dateColumnDataEntrada.setColumnName("data_de_entrada");
        dateColumnDataEntrada.setColumnSortable(true);
        dateColumnDataEntrada.setEditableOnEdit(true);
        dateColumnDataEntrada.setEditableOnInsert(true);
        dateColumnDataEntrada.setHeaderColumnName("Data de Entrada");
        gridControlFuncionario.getColumnContainer().add(dateColumnDataEntrada);

        dateColumnDataSaida.setColumnFilterable(true);
        dateColumnDataSaida.setColumnName("data_de_saida");
        dateColumnDataSaida.setColumnRequired(false);
        dateColumnDataSaida.setColumnSortable(true);
        dateColumnDataSaida.setEditableOnEdit(true);
        dateColumnDataSaida.setEditableOnInsert(true);
        dateColumnDataSaida.setHeaderColumnName("Data de Saida");
        gridControlFuncionario.getColumnContainer().add(dateColumnDataSaida);

        textColumnCidade.setColumnFilterable(true);
        textColumnCidade.setColumnName("cidade");
        textColumnCidade.setColumnSortable(true);
        textColumnCidade.setEditableOnEdit(true);
        textColumnCidade.setEditableOnInsert(true);
        textColumnCidade.setHeaderColumnName("Cidade");
        gridControlFuncionario.getColumnContainer().add(textColumnCidade);

        textColumnLogradouro.setColumnFilterable(true);
        textColumnLogradouro.setColumnName("logradouro");
        textColumnLogradouro.setColumnSortable(true);
        textColumnLogradouro.setEditableOnEdit(true);
        textColumnLogradouro.setEditableOnInsert(true);
        textColumnLogradouro.setHeaderColumnName("Logradouro");
        gridControlFuncionario.getColumnContainer().add(textColumnLogradouro);

        textColumnNumero.setColumnFilterable(true);
        textColumnNumero.setColumnName("numero");
        textColumnNumero.setColumnRequired(false);
        textColumnNumero.setColumnSortable(true);
        textColumnNumero.setEditableOnEdit(true);
        textColumnNumero.setEditableOnInsert(true);
        textColumnNumero.setHeaderColumnName("Numero");
        gridControlFuncionario.getColumnContainer().add(textColumnNumero);

        textColumnComplemento.setColumnFilterable(true);
        textColumnComplemento.setColumnName("complemento");
        textColumnComplemento.setColumnRequired(false);
        textColumnComplemento.setColumnSortable(true);
        textColumnComplemento.setEditableOnEdit(true);
        textColumnComplemento.setEditableOnInsert(true);
        textColumnComplemento.setHeaderColumnName("Complemento");
        gridControlFuncionario.getColumnContainer().add(textColumnComplemento);

        textColumnBairro.setColumnFilterable(true);
        textColumnBairro.setColumnName("bairro");
        textColumnBairro.setColumnSortable(true);
        textColumnBairro.setEditableOnEdit(true);
        textColumnBairro.setEditableOnInsert(true);
        textColumnBairro.setHeaderColumnName("Bairro");
        gridControlFuncionario.getColumnContainer().add(textColumnBairro);

        comboColumnUf.setColumnFilterable(true);
        comboColumnUf.setColumnName("uf");
        comboColumnUf.setColumnSortable(true);
        comboColumnUf.setEditableOnEdit(true);
        comboColumnUf.setEditableOnInsert(true);
        comboColumnUf.setHeaderColumnName("UF");
        comboColumnUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboColumnUfActionPerformed(evt);
            }
        });
        gridControlFuncionario.getColumnContainer().add(comboColumnUf);

        formattedTextColumnCep.setColumnFilterable(true);
        formattedTextColumnCep.setColumnName("cep");
        formattedTextColumnCep.setColumnRequired(false);
        formattedTextColumnCep.setColumnSortable(true);
        formattedTextColumnCep.setEditableOnEdit(true);
        formattedTextColumnCep.setEditableOnInsert(true);
        formattedTextColumnCep.setHeaderColumnName("CEP");
        gridControlFuncionario.getColumnContainer().add(formattedTextColumnCep);

        codLookupColumnCargo.setColumnFilterable(true);
        codLookupColumnCargo.setColumnName("cargo");
        codLookupColumnCargo.setColumnRequired(false);
        codLookupColumnCargo.setColumnSortable(true);
        codLookupColumnCargo.setEditableOnEdit(true);
        codLookupColumnCargo.setEditableOnInsert(true);
        codLookupColumnCargo.setEnableCodBox(false);
        codLookupColumnCargo.setHeaderColumnName("Cargo");
        gridControlFuncionario.getColumnContainer().add(codLookupColumnCargo);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(gridControlFuncionario, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel2, gridBagConstraints);

        setSize(new java.awt.Dimension(681, 308));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboColumnUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboColumnUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboColumnUfActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionarioGridController();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.openswing.swing.table.columns.client.CodLookupColumn codLookupColumnCargo;
    private org.openswing.swing.table.columns.client.ComboColumn comboColumnSexo;
    private org.openswing.swing.table.columns.client.ComboColumn comboColumnUf;
    private org.openswing.swing.table.columns.client.CurrencyColumn currencyColumnSalario;
    private org.openswing.swing.table.columns.client.DateColumn dateColumnDataEntrada;
    private org.openswing.swing.table.columns.client.DateColumn dateColumnDataSaida;
    private org.openswing.swing.client.DeleteButton deleteButton1;
    private org.openswing.swing.client.EditButton editButton1;
    private org.openswing.swing.client.FilterButton filterButton1;
    private org.openswing.swing.table.columns.client.FormattedTextColumn formattedTextColumnCep;
    private org.openswing.swing.client.GridControl gridControlFuncionario;
    private org.openswing.swing.client.InsertButton insertButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private org.openswing.swing.client.ReloadButton reloadButton1;
    private org.openswing.swing.client.SaveButton saveButton1;
    private org.openswing.swing.table.columns.client.TextColumn textColumnBairro;
    private org.openswing.swing.table.columns.client.TextColumn textColumnCidade;
    private org.openswing.swing.table.columns.client.TextColumn textColumnComplemento;
    private org.openswing.swing.table.columns.client.TextColumn textColumnLogradouro;
    private org.openswing.swing.table.columns.client.TextColumn textColumnNome;
    private org.openswing.swing.table.columns.client.TextColumn textColumnNumero;
    // End of variables declaration//GEN-END:variables
    private void organizarDomain() {
        
        this.comboColumnSexo.setDomainId("SEXO");
        this.comboColumnUf.setDomainId("UF");
    }

    
    private void organizarMascaras() {
        
        try {
            
            MaskFormatter mascara = new MaskFormatter("##.###-###");
            mascara.setPlaceholderCharacter('_');
            mascara.setValidCharacters("0123456789");
            this.formattedTextColumnCep.setFormatter(mascara);
        } catch (Exception ex) {
            
            Logger.getLogger(FuncionarioView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void organizarLookup() {
        
        this.codLookupColumnCargo.setLookupController(new LookupController());
    }
    
    public GridControl getGridControlFuncionario() {
        
        return gridControlFuncionario;
    }

}

