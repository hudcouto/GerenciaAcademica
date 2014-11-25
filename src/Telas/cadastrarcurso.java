/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import SistemaUniversitario.Curso;
import SistemaUniversitario.Excecoes;
import SistemaUniversitario.Extensao;
import SistemaUniversitario.Graduacao;
import SistemaUniversitario.Turma;
import SistemaUniversitario.TurmaExtensao;
import SistemaUniversitario.TurmaGraduacao;
import static Telas.TelaPrincipal.listaBDCurso;
import static Telas.TelaPrincipal.listaBDTurma;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Maquina 8
 */
public class cadastrarcurso extends javax.swing.JInternalFrame {

    
    public DefaultComboBoxModel ComboBoxModelExtensaoPeriodo = new DefaultComboBoxModel();
    public DefaultTableModel TableModelExtensaoPeriodo = new DefaultTableModel();
    public ArrayList<Turma> listaGraduacao = new ArrayList<Turma>();
    public ArrayList<Turma> listaExtensao = new ArrayList<Turma>();
    public ArrayList<Turma> listaTemp = new ArrayList<Turma>();
    
    /**
     * Creates new form cadastrarcurso
     */
    public cadastrarcurso() {
        initComponents();
        
        for (Turma t: listaBDTurma){
            if (t instanceof TurmaExtensao){
                listaExtensao.add(t);
            }
            if (t instanceof TurmaGraduacao){
                listaGraduacao.add(t);
            }
            
        }
        
        jRadioButtonExtensaoActionPerformed(null);
        
        TableModelExtensaoPeriodo.addColumn("Código");
        TableModelExtensaoPeriodo.addColumn("Nome");
        preencherComboBoxExtensao();
        inicializarTableModelExtensaoPeriodo();
        carregarJtable(-1);
        jComboBoxExtensaoPeriodo.setModel(ComboBoxModelExtensaoPeriodo);
    }
    
    
     private void preencherComboBoxExtensao (){
        
        ComboBoxModelExtensaoPeriodo.removeAllElements();
      
             for (Turma t: listaBDTurma){
                 if (t instanceof TurmaExtensao){
                     ComboBoxModelExtensaoPeriodo.addElement(t.getCodigo());
                 }
             }
             
        }
        
    private void preencherComboBoxGraduacao (){
        
        ComboBoxModelExtensaoPeriodo.removeAllElements();
        for (Turma t: listaBDTurma){
                 if (t instanceof TurmaGraduacao){
                     ComboBoxModelExtensaoPeriodo.addElement(t.getCodigo());
                 }
             }

    }
    
    private void inicializarTableModelExtensaoPeriodo(){

        jTableExtensaoPeriodo.setModel(TableModelExtensaoPeriodo);
        for (int i=0; i < TableModelExtensaoPeriodo.getRowCount(); i++){
            TableModelExtensaoPeriodo.removeRow(i);
        }
        jTableExtensaoPeriodo.removeAll();
        
    }
    
    private void carregarJtable (int ItemSelecionado){
        listaTemp.clear();
        if (jRadioButtonExtensao.isSelected()){
            for (int i = 0; i < listaExtensao.size(); i++){
                if (ItemSelecionado == i){  
                    for (int j = 0; j < jTableExtensaoPeriodo.getRowCount() ;  j++){
                        if (jTableExtensaoPeriodo.getModel().getValueAt(j, 0).equals(String.valueOf(listaExtensao.get(i).getCodigo()))){
                        //JOptionPane.showMessageDialog(this,"já tem o bacana.");
                            return;
                        }
                    }
                    listaTemp.add(listaExtensao.get(i));
                    TableModelExtensaoPeriodo.addRow(new String []{
                    String.valueOf(listaExtensao.get(i).getCodigo()),
                    listaExtensao.get(i).getProfessor(),
                    });
                }
            }
        }
        if (jRadioButtonGraducao.isSelected()){
            for (int i = 0; i < listaGraduacao.size(); i++){
                if (ItemSelecionado == i){  
                    for (int j = 0; j < jTableExtensaoPeriodo.getRowCount() ;  j++){
                        if (jTableExtensaoPeriodo.getModel().getValueAt(j, 0).equals(String.valueOf(listaGraduacao.get(i).getCodigo()))){
                        //JOptionPane.showMessageDialog(this,"já tem o bacana.");
                            return;
                        }
                    }
                    listaTemp.add(listaGraduacao.get(i));
                    TableModelExtensaoPeriodo.addRow(new String []{
                    String.valueOf(listaGraduacao.get(i).getCodigo()),
                    listaGraduacao.get(i).getProfessor(),
                    });
                }
            }
        }
    }
            /*   }
            if (jRadioButtonGraducao.isSelected()){
            
            }
            for (int i = 0; i < listaBDTurma.size(); i++){
            if (ItemSelecionado == i){
            for (int j = 0; j < jTableExtensaoPeriodo.getRowCount() ;  j++){
            if (jTableExtensaoPeriodo.getModel().getValueAt(j, 0).equals(String.valueOf(listaBDTurma.get(i).getCodigo()))){
            //JOptionPane.showMessageDialog(this,"já tem o bacana.");
            return;
            }
            }
            TableModelExtensaoPeriodo.addRow(new String []{
            String.valueOf(listaBDTurma.get(i).getCodigo()),
            listaBDTurma.get(i).getProfessor(),
            });
            return;
            }
            }
            }*/
    
     public void setPosicao (){
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonExcluir = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelTurma = new javax.swing.JLabel();
        jComboBoxExtensaoPeriodo = new javax.swing.JComboBox();
        jLabelCarga = new javax.swing.JLabel();
        jTextFieldCarga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableExtensaoPeriodo = new javax.swing.JTable();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jTextFieldCod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCoord = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDp = new javax.swing.JTextField();
        jRadioButtonExtensao = new javax.swing.JRadioButton();
        jRadioButtonGraducao = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Cadastrar Curso");

        jButtonExcluir.setText("Excluir");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ListaExtensãoPeríodo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bodoni MT", 0, 14))); // NOI18N

        jLabelTurma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTurma.setText("Extensão");

        jComboBoxExtensaoPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxExtensaoPeriodoActionPerformed(evt);
            }
        });

        jLabelCarga.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCarga.setText("Carga Horária: ");

        jTableExtensaoPeriodo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableExtensaoPeriodo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelTurma)
                        .addGap(16, 16, 16)
                        .addComponent(jComboBoxExtensaoPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabelCarga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCarga))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCarga)
                        .addComponent(jTextFieldCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxExtensaoPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelTurma)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButtonPesquisar.setText("Pesquisar");

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Código do Curso: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nome do Curso: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Coordenador: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Departamento: ");

        jRadioButtonExtensao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButtonExtensao.setText("Extensão");
        jRadioButtonExtensao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonExtensaoActionPerformed(evt);
            }
        });

        jRadioButtonGraducao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButtonGraducao.setText("Graduação");
        jRadioButtonGraducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonGraducaoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Tipo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNome)
                            .addComponent(jTextFieldCoord)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonGraducao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonExtensao)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextFieldDp))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jRadioButtonGraducao)
                    .addComponent(jRadioButtonExtensao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldCoord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldDp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonPesquisar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonLimpar))
                .addGap(20, 20, 20))
        );

        setBounds(0, 0, 571, 508);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        // TODO add your handling code here:
        jTextFieldCarga.setText(null);
        jTextFieldCod.setText(null);
        jTextFieldCoord.setText(null);
        jTextFieldDp.setText(null);
        jTextFieldNome.setText(null);
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jRadioButtonGraducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonGraducaoActionPerformed
        jRadioButtonExtensao.setSelected(false);
        jRadioButtonGraducao.setSelected(true);
        jLabelCarga.setText("Turno:");
        jLabelTurma.setText("Período:");
        preencherComboBoxGraduacao();
        for (int i=0; i < TableModelExtensaoPeriodo.getRowCount(); i++){
            TableModelExtensaoPeriodo.removeRow(i);
        }
        inicializarTableModelExtensaoPeriodo();

    }//GEN-LAST:event_jRadioButtonGraducaoActionPerformed

    private void jRadioButtonExtensaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonExtensaoActionPerformed
        // TODO add your handling code here:
        jRadioButtonExtensao.setSelected(true);
        jRadioButtonGraducao.setSelected(false);
        jLabelCarga.setText("Carga Horária:");
        jLabelTurma.setText("Extensao:");
        preencherComboBoxExtensao();
        for (int i=0; i < TableModelExtensaoPeriodo.getRowCount(); i++){
            TableModelExtensaoPeriodo.removeRow(i);
        }
        inicializarTableModelExtensaoPeriodo();
        
    }//GEN-LAST:event_jRadioButtonExtensaoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        
        try {
            if (jTextFieldNome.getText().isEmpty()){
                throw new Excecoes (1001, "Campo nome obrigatório");
            }  
            if (jTextFieldCod.getText().isEmpty()){
                throw new Excecoes (1002, "Campo código obrigatório");
            }
            if (jTextFieldCoord.getText().isEmpty()){
                throw new Excecoes (1003, "Campo coordenador obrigatório");
            } 
            if (jTextFieldDp.getText().isEmpty()){
                throw new Excecoes (1004, "Campo departamento obrigatório");
            }  

            for (Curso c: listaBDCurso){
                if (c.getCodCurso().equals(jTextFieldCod.getText())){
                   throw new Excecoes (1005, "Código já existente.");
                }
            }
            
            
            if (jRadioButtonExtensao.isSelected()){

                int cargaHorario = Integer.parseInt(jTextFieldCarga.getText());

                Extensao e = new Extensao(cargaHorario, jTextFieldCod.getText(), jTextFieldDp.getText(), jTextFieldNome.getText(), jTextFieldCoord.getText());
                
                    e.setListaExtensaoPeriodo(listaTemp);
                listaBDCurso.add(e);

            }else{
                Graduacao d = new Graduacao(jTextFieldCarga.getText(), jTextFieldCod.getText(), jTextFieldDp.getText(), jTextFieldNome.getText(), jTextFieldCoord.getText());
                d.setListaExtensaoPeriodo(listaTemp);
                listaBDCurso.add(d);

            }
            JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!");
                jButtonLimparActionPerformed(evt);

        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Campo inválido!\n" + ex.getMessage());
        } catch (Excecoes ex) {
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jComboBoxExtensaoPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxExtensaoPeriodoActionPerformed
        carregarJtable(jComboBoxExtensaoPeriodo.getSelectedIndex());
    }//GEN-LAST:event_jComboBoxExtensaoPeriodoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxExtensaoPeriodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCarga;
    private javax.swing.JLabel jLabelTurma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonExtensao;
    private javax.swing.JRadioButton jRadioButtonGraducao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableExtensaoPeriodo;
    private javax.swing.JTextField jTextFieldCarga;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldCoord;
    private javax.swing.JTextField jTextFieldDp;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
