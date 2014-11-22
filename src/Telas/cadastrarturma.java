/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import SistemaUniversitario.Aluno;
import SistemaUniversitario.Excecoes;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author Maquina 8
 */
public class cadastrarturma extends javax.swing.JInternalFrame {
       
    public DefaultListModel listModelAluno = new DefaultListModel();
    public DefaultListModel listModelTurma = new DefaultListModel();
    //ArrayList<Aluno> listAluno = new ArrayList<Aluno>();
    /**
     * Creates new form cadastrarturma
     */
    public cadastrarturma() {
        initComponents();
        //jTextFieldCod.setText("1");
        //listAluno.add(new Aluno(1, "Fulano", "end"));
        //listAluno.add(new Aluno(2, "Ciclano", "end"));
        //listAluno.add(new Aluno(3, "Beltrano", "end"));
        
        String formatarArray = new String();  
        for (Aluno a : TelaPrincipal.listaBDAluno) {
                formatarArray = a.getMatricula() + " - " +  a.getNome();
                listModelAluno.addElement(a.getNome());  
            }  
        jListAluno.setModel(listModelAluno);
       
    }
    
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jLabelProf = new javax.swing.JLabel();
        jTextFieldProf = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListAluno = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListTurma = new javax.swing.JList();
        jButtonInsert = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastrar Turma");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Turma", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bodoni MT", 0, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Código:");

        jTextFieldCod.setEditable(false);

        jLabelProf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelProf.setText("Professor: ");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleção de Alunos"));

        jListAluno.setToolTipText("");
        jScrollPane1.setViewportView(jListAluno);

        jListTurma.setToolTipText("");
        jScrollPane2.setViewportView(jListTurma);

        jButtonInsert.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonInsert.setText(">>");
        jButtonInsert.setAlignmentY(0.0F);
        jButtonInsert.setBorder(null);
        jButtonInsert.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonInsert.setMargin(null);
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });

        jButtonDelete.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonDelete.setText("<<");
        jButtonDelete.setAlignmentY(0.0F);
        jButtonDelete.setBorder(null);
        jButtonDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDelete.setMargin(null);
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jButtonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelProf)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCod)
                            .addComponent(jTextFieldProf))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelProf)
                    .addComponent(jTextFieldProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonPesquisar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonLimpar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        pesquisaAluno tela = new pesquisaAluno();
        tela.setVisible(true);
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        
        try {
            if (jTextFieldProf.getText().isEmpty()){
                throw new Excecoes(6001, "Campo Professor obrigatório");
            }
            
           
            
        } catch (NumberFormatException ex){
        JOptionPane.showMessageDialog(this, "Campo {} inválido!\n" + ex.getMessage());
  
        } catch (Excecoes ex) {
        JOptionPane.showMessageDialog(this,ex.getMessage());
        }
        
        /*try{
        //Validações de obrigatoriedade dos campos.
        if (jTextFieldNome.getText().isEmpty()){
        throw new Excecoes(9001, "Campo Nome obrigatório");
        }
        if (jTextFieldMat.getText().isEmpty()){
        throw new Excecoes(9001, "Campo Matrícula obrigatório");
        }
        if (jTextFieldEnd.getText().isEmpty()){
        throw new Excecoes(9001, "Campo Endereço obrigatório");
        }
        
        //conversao String -> int
        int mat = Integer.parseInt(jTextFieldMat.getText());
        
        //pesquisa de matrícula concorrente.
        for(Aluno a: listaBDAluno){
        if (a.getMatricula() == mat){
        throw new Excecoes(9002,"Matrícula já existente");
        }
        }
        
        //instancia da classe Aluno.
        listaBDAluno.add(new Aluno(mat, jTextFieldNome.getText(), jTextFieldEnd.getText()));
        JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!");
        jButtonLimparActionPerformed(evt);
        
        } catch (NumberFormatException ex){
        JOptionPane.showMessageDialog(this, "Campo Matrícula inválido!\n" + ex.getMessage());
        } catch (Excecoes ex) {
        JOptionPane.showMessageDialog(this,ex.getMessage());
        }*/
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextFieldCod.setText(null);
        jTextFieldProf.setText(null);
        //jTextFieldMat.setText(null);
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        //JOptionPane.showMessageDialog(this,jListAluno.getSelectedValue());
        //jListTurma.add("teste", this);
        
        if (jListAluno.getSelectedIndex() == -1){
            return;
        }
        
        //perguntar se esse cara aqui jListAluno.getSelectedIndex()).getNome() tá no jlistTurma ou no listModelTurma
        
        for(int i = 0; i< listModelTurma.getSize() ; i++){
            if (listModelTurma.getElementAt(i).equals(jListAluno.getSelectedValue()) ){
                //JOptionPane.showMessageDialog(this,"Já existe: " + listModelTurma.getElementAt(i) + "\n" + jListAluno.getSelectedValue() );
                return;
            }
        }
        
        listModelTurma.addElement(TelaPrincipal.listaBDAluno.get(jListAluno.getSelectedIndex()).getNome());
        jListTurma.setModel(listModelTurma);
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        if (jListTurma.getSelectedIndex() == -1){
            return;
        }
        
        listModelTurma.remove(jListTurma.getSelectedIndex());
        jListTurma.setModel(listModelTurma);
    }//GEN-LAST:event_jButtonDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelProf;
    private javax.swing.JList jListAluno;
    private javax.swing.JList jListTurma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldProf;
    // End of variables declaration//GEN-END:variables
}
