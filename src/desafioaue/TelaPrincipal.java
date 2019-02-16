package desafioaue;

import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Jnome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CBMasculino = new javax.swing.JCheckBox();
        CBFeminino = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        Jcidade = new javax.swing.JTextField();
        incluir = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        Bcontar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tlista = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tanalise = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome");

        jLabel2.setText("Sexo");

        CBMasculino.setText("Masculino");

        CBFeminino.setText("Feminino");

        jLabel3.setText("Cidade");

        incluir.setText("Incluir");
        incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incluirActionPerformed(evt);
            }
        });

        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        Bcontar.setText("Contar No de Contato por Cidade");
        Bcontar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcontarActionPerformed(evt);
            }
        });

        Tlista.setColumns(20);
        Tlista.setRows(5);
        jScrollPane1.setViewportView(Tlista);

        Tanalise.setColumns(20);
        Tanalise.setRows(5);
        jScrollPane3.setViewportView(Tanalise);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CBMasculino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CBFeminino)
                                        .addGap(211, 211, 211))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Jcidade)
                                        .addGap(207, 207, 207))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Jnome))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(incluir)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(alterar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(excluir)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bcontar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Jnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(CBMasculino)
                            .addComponent(CBFeminino))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Jcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(incluir)
                            .addComponent(alterar)
                            .addComponent(excluir)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bcontar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Jnome.getAccessibleContext().setAccessibleName("Jnome");
        Jcidade.getAccessibleContext().setAccessibleName("cidade");
        Bcontar.getAccessibleContext().setAccessibleName("contar");
        jScrollPane1.getAccessibleContext().setAccessibleName("lista");
        jScrollPane3.getAccessibleContext().setAccessibleName("resultado");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void incluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incluirActionPerformed
        String nome = Jnome.getText();
        String cidade = Jcidade.getText();
        String sexo = null;
        if (CBMasculino.equals(true)){
            sexo = "H";
        }else if (CBFeminino.equals(true)){
            sexo = "M";
        }
        Calendar c = Calendar.getInstance();
        int dia = c.get(Calendar.DAY_OF_MONTH);
        int mes = c.get(Calendar.MONTH);
        int ano = c.get(Calendar.YEAR);
        
        Random rand = new Random();
        int codigo = rand.nextInt();
        if(codigo < 0){
            codigo = rand.nextInt();
        }
        
        Contato contato = new Contato(codigo, nome, cidade, sexo, dia, mes ,ano);
        try {
            ContatoDAO.getInstance().save(contato);
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Tlista.append(codigo + " " + nome + "\n");
    }//GEN-LAST:event_incluirActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        String nome = Jnome.getText();
        String cidade = Jcidade.getText();
        
        try {
            ContatoDAO.getInstance().update(nome, cidade);
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_alterarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        String nome = Jnome.getText();
        
        try {
            ContatoDAO.getInstance().delete(nome);
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_excluirActionPerformed

    private void BcontarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcontarActionPerformed
        ArrayList<String> cidade = new ArrayList();
        Tanalise.append("Analise dos contatos \n");
        int total = 0;
        int mulher = 0;
        int homen = 0;
        try {
            total = ContatoDAO.getInstance().contar();
            mulher = ContatoDAO.getInstance().contarMulher();
            homen = ContatoDAO.getInstance().contarHomenes();
            cidade = ContatoDAO.getInstance().findCidade();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        Tanalise.append("Numero de contatos no banco de dados: " + total + "," + homen + " Homens e " +  mulher + "Mulher \n");
        for(int i =0; i < cidade.size(); i++){
            Tanalise.append("Cotatos em " + cidade.get(i) + "\n");
            int totalPorCidade = 0;
            ArrayList<Integer> meses = new ArrayList();
            try {
                meses = ContatoDAO.getInstance().mesPorCidade(cidade.get(i));
                totalPorCidade = ContatoDAO.getInstance().totalPorCidade(cidade.get(i));
            } catch (SQLException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            for(int j = 0; j < meses.size(); j++){
                int totalNoMes = 0;
                int totalHomens = 0;
                int totalMulher = 0;
                try {
                    totalNoMes = ContatoDAO.getInstance().totalPorMes(cidade.get(i),meses.get(j));
                    totalHomens = ContatoDAO.getInstance().totalHomensPorCidadeMes(cidade.get(i),meses.get(j));
                    totalMulher = ContatoDAO.getInstance().totalMulherPorCidadeMes(cidade.get(i),meses.get(j));
                } catch (SQLException ex) {
                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
                Tanalise.append(meses.get(j) + ": " + totalNoMes + ", " + totalHomens + " hmens e " + totalMulher + " mulheres \n");
            }
            Tanalise.append("Total: " + totalPorCidade);
        }
    }//GEN-LAST:event_BcontarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcontar;
    private javax.swing.JCheckBox CBFeminino;
    private javax.swing.JCheckBox CBMasculino;
    private javax.swing.JTextField Jcidade;
    private javax.swing.JTextField Jnome;
    private javax.swing.JTextArea Tanalise;
    private javax.swing.JTextArea Tlista;
    private javax.swing.JButton alterar;
    private javax.swing.JButton excluir;
    private javax.swing.JButton incluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
