package agendabd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Devolucao extends javax.swing.JFrame {

    
    public Devolucao() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        caixaEmprestados = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("DEVOLUÇÃO");

        jLabel2.setText("Item/Amigo:");

        jButton1.setText("DEVOLVER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(caixaEmprestados, 0, 257, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(caixaEmprestados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        abrirEmprestados();
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String idemprestimo = 
        caixaEmprestados.getSelectedItem()
                .toString().substring(0,4);
                
        String comando1 = 
        "UPDATE emprestimo "
        + "SET dataretorno = CURDATE() "
        + "WHERE id = " + idemprestimo;
        
        String comando2 = 
        "SELECT idcatalogo FROM emprestimo "
        + "WHERE id = " + idemprestimo;
        
        String comando3 = 
        "UPDATE catalogo SET emprestado = 0 " +
        "WHERE id = ?";
        
        try{
            Connection conn = Conexao.getConexao();
            
            PreparedStatement ps1 = 
                    conn.prepareStatement(comando1);
            ps1.execute();
            
            PreparedStatement ps2 = 
                    conn.prepareStatement(comando2);
            ResultSet res = ps2.executeQuery();
            
            //pegar o id do catalogo
            res.next();
            String idcatalogo = res.getString("idcatalogo");
            
            PreparedStatement ps3 = 
                    conn.prepareStatement(comando3);
            ps3.setString(1,idcatalogo);
            ps3.execute();
            
            JOptionPane.showMessageDialog(null,
                    "DEVOLVIDO COM SUCESSO");
            abrirEmprestados();
        }catch(Exception e){
            e.printStackTrace();
        }//fim-catch
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    void abrirEmprestados(){
        
        Connection conn = Conexao.getConexao();
        
        String comando = 
        "SELECT emprestimo.id, contato.nome, " +
        "catalogo.titulo " +
        "FROM emprestimo, contato, catalogo " +
        "WHERE emprestimo.idcontato = contato.id " +
        "AND emprestimo.idcatalogo = catalogo.id " +
        "AND emprestimo.dataretorno IS NULL " +
        "ORDER BY nome, titulo";
        
        try{
            PreparedStatement ps =
                    conn.prepareStatement(comando);
            
            ResultSet res = ps.executeQuery();
            
            caixaEmprestados.removeAllItems();
            
            while(res.next()){
                caixaEmprestados.addItem(
                String.format("%04d", res.getInt("id")) 
                + " - " +
                res.getString("nome") + " - " +
                res.getString("titulo"));
            }//fim-while
            
        }catch(Exception e){
            e.printStackTrace();
        }//fim-catch
    }//fim-abrirEmprestados
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Devolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Devolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Devolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Devolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Devolucao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox caixaEmprestados;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
