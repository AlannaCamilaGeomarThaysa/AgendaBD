package agendabd;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Cadastro extends javax.swing.JFrame {

   
    public Cadastro() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        campoFone = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        botaoSalvar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoEndereco = new javax.swing.JTextField();
        caixaEstado = new javax.swing.JComboBox();
        botaoPesquisar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        campoCodigo = new javax.swing.JTextField();
        botaoAbrir = new javax.swing.JButton();
        botaoAlterar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        caixaCidade = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("CADASTRO DE CONTATOS");

        jLabel2.setText("Nome:");

        jLabel3.setText("Fone:");

        jLabel4.setText("Email:");

        botaoSalvar.setText("SALVAR");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        jLabel5.setText("Endereço:");

        jLabel7.setText("Estado:");

        caixaEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaEstadoActionPerformed(evt);
            }
        });

        botaoPesquisar.setText("PESQUISAR");
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });

        jLabel8.setText("Código:");

        campoCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoCodigoKeyPressed(evt);
            }
        });

        botaoAbrir.setText("ABRIR");
        botaoAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAbrirActionPerformed(evt);
            }
        });

        botaoAlterar.setText("ALTERAR");
        botaoAlterar.setEnabled(false);
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
            }
        });

        botaoExcluir.setText("EXCLUIR");
        botaoExcluir.setEnabled(false);
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        jLabel9.setText("Cidade:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoEndereco)
                            .addComponent(caixaEstado, 0, 203, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoFone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoNome)
                            .addComponent(campoEmail)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campoCodigo)
                                .addGap(18, 18, 18)
                                .addComponent(botaoAbrir))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botaoPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(botaoSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(30, 30, 30)
                        .addComponent(caixaCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAbrir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(caixaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(caixaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvar)
                    .addComponent(botaoPesquisar)
                    .addComponent(botaoAlterar))
                .addGap(18, 18, 18)
                .addComponent(botaoExcluir)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed

        Connection conn
                = Conexao.getConexao();

        String comando
                = "INSERT INTO contato VALUES(null,?,?,?,?,?,?)";

        try {

            PreparedStatement ps
                    = conn.prepareStatement(comando);

            ps.setString(1, campoNome.getText());
            ps.setString(2, campoFone.getText());
            ps.setString(3, campoEmail.getText());
            ps.setString(4, campoEndereco.getText());
            ps.setString(5, caixaCidade.getSelectedItem().toString());
            ps.setString(6, caixaEstado.getSelectedItem().toString());

            ps.execute();

            JOptionPane.showMessageDialog(null, "INSERIDO COM SUCESSO!");

            campoNome.setText("");  
            campoFone.setText("");
            campoEmail.setText("");
            campoEndereco.setText("");
            caixaCidade.removeAllItems();
            caixaEstado.setSelectedIndex(-1);

        } catch (Exception e) {
            System.out.println("ERRO!");
            e.printStackTrace();
        }

    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAbrirActionPerformed

        String comando = "SELECT * FROM contato WHERE id = " + campoCodigo.getText();

        try {

            Connection conn = Conexao.getConexao();

            PreparedStatement ps = conn.prepareStatement(comando);

            ResultSet res = ps.executeQuery();

            if (res.next()) {
                //colocar dados nos campos
                campoNome.setText(res.getString("nome"));
                campoFone.setText(res.getString("fone"));
                campoEmail.setText(res.getString("email"));
                campoEndereco.setText(res.getString("endereco"));
                caixaEstado.setSelectedItem(
                        res.getString("estado"));
                caixaCidade.setSelectedItem(res.getString("cidade"));

                campoCodigo.setEnabled(false);
                botaoAbrir.setEnabled(false);
                botaoSalvar.setEnabled(false);

                botaoAlterar.setEnabled(true);
                botaoExcluir.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(
                        null, "CÓDIGO NÃO EXISTE!");
            }//fim-else

        } catch (Exception e) {
            e.printStackTrace();
        }//fim-catch


    }//GEN-LAST:event_botaoAbrirActionPerformed

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed

        Connection conn
                = Conexao.getConexao();

        String comando
                = "UPDATE contato SET nome = ?, "
                + "fone = ?,"
                + "email = ?,"
                + "endereco = ?,"
                + "cidade = ?,"
                + "estado = ? "
                + "WHERE id = ?";

        try {

            PreparedStatement ps
                    = conn.prepareStatement(comando);

            ps.setString(1, campoNome.getText());
            ps.setString(2, campoFone.getText());
            ps.setString(3, campoEmail.getText());
            ps.setString(4, campoEndereco.getText());
            ps.setString(5, caixaCidade.getSelectedItem().toString());
            ps.setString(6,
                    caixaEstado.getSelectedItem().toString());
            ps.setString(7, campoCodigo.getText());

            ps.execute();

            JOptionPane.showMessageDialog(null,
                    "ATUALIZADO COM SUCESSO!");

            campoNome.setText("");  //limpar campos
            campoFone.setText("");
            campoEmail.setText("");
            campoEndereco.setText("");
            caixaCidade.removeAllItems();
            caixaEstado.setSelectedIndex(-1);

            campoCodigo.setEnabled(true);
            botaoAbrir.setEnabled(true);
            botaoSalvar.setEnabled(true);

            botaoAlterar.setEnabled(false);
            botaoExcluir.setEnabled(false);

        } catch (Exception e) {
            System.out.println("ERRO!");
            e.printStackTrace();
        }


    }//GEN-LAST:event_botaoAlterarActionPerformed

    private void campoCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCodigoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            botaoAbrirActionPerformed(null);
        }
    }//GEN-LAST:event_campoCodigoKeyPressed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed

        int resposta = JOptionPane.showConfirmDialog(
                null, "DESEJA REALMENTE EXCLUIR?",
                "Confirmação", JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {

            String comando = "DELETE FROM contato WHERE id = "
                    + campoCodigo.getText();
            Connection conn = Conexao.getConexao();

            try {
                PreparedStatement ps
                        = conn.prepareStatement(comando);

                ps.execute();

                JOptionPane.showMessageDialog(null,
                        "EXCLUIDO COM SUCESSO");

                campoNome.setText("");  //limpar campos
                campoFone.setText("");
                campoEmail.setText("");
                campoEndereco.setText("");
                caixaCidade.removeAllItems();
                caixaEstado.setSelectedIndex(-1);

                campoCodigo.setEnabled(true);
                botaoAbrir.setEnabled(true);
                botaoSalvar.setEnabled(true);

                botaoAlterar.setEnabled(false);
                botaoExcluir.setEnabled(false);

            } catch (Exception e) {
                e.printStackTrace();
            }//fim-catch
        }//fim-if        
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Connection conn = Conexao.getConexao();
        try {
            PreparedStatement ps = conn.prepareStatement(
                    "SELECT * FROM estado ORDER BY nome");
            ResultSet res = ps.executeQuery();
            while (res.next()) {
                caixaEstado.addItem(res.getString("nome"));
            }//fim-while            
            caixaEstado.setSelectedIndex(-1);
            caixaCidade.removeAllItems();
        } catch (Exception e) {
            e.printStackTrace();
        }//fim-catch
    }//GEN-LAST:event_formWindowOpened

    private void caixaEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaEstadoActionPerformed
        if (caixaEstado.getSelectedIndex() != -1) {

            String comando
                    = "SELECT cidade.nome AS nome "
                    + "FROM estado, cidade "
                    + "WHERE estado.id = cidade.estado "
                    + "AND estado.nome = ? ORDER BY nome";
            Connection conn = Conexao.getConexao();
            try {
                PreparedStatement ps
                        = conn.prepareStatement(comando);
                ps.setString(1,
                        caixaEstado.getSelectedItem().toString());
                ResultSet res = ps.executeQuery();
                caixaCidade.removeAllItems();
                while (res.next()) {
                    caixaCidade.addItem(res.getString("nome"));
                }//fim-while

            } catch (Exception e) {
                e.printStackTrace();
            }//fim-catch

        }//fim-if
    }//GEN-LAST:event_caixaEstadoActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        Pesquisa p = new Pesquisa();
        p.setVisible(true);
    }//GEN-LAST:event_botaoPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAbrir;
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JComboBox caixaCidade;
    private javax.swing.JComboBox caixaEstado;
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoFone;
    private javax.swing.JTextField campoNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
