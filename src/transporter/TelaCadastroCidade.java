package transporter;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaCadastroCidade extends javax.swing.JFrame {

    public TelaCadastroCidade() {
        initComponents();
        
        this.setTitle("Cadastro de Cidade");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCadastroCidade = new javax.swing.JPanel();
        lblCadastroCidadeCidade = new javax.swing.JLabel();
        lblCadastroCidadeEstado = new javax.swing.JLabel();
        lblCadastroCidadeCI = new javax.swing.JLabel();
        txtCadastroCidadeCidade = new javax.swing.JTextField();
        txtCadastroCidadeCI = new javax.swing.JTextField();
        txtCadastroCidadeEstado = new javax.swing.JTextField();
        btnCadastroCidadeSalvar = new javax.swing.JButton();
        btnCadastroCidadeCancelar = new javax.swing.JButton();
        lblCadastroCidades = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCadastroCidadeCidade.setText("Cidade");

        lblCadastroCidadeEstado.setText("Código Identificador");

        lblCadastroCidadeCI.setText("Estado");

        btnCadastroCidadeSalvar.setText("Salvar");
        btnCadastroCidadeSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroCidadeSalvarActionPerformed(evt);
            }
        });

        btnCadastroCidadeCancelar.setText("Cancelar");
        btnCadastroCidadeCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroCidadeCancelarActionPerformed(evt);
            }
        });

        lblCadastroCidades.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCadastroCidades.setText("Cadastro de Cidade");

        javax.swing.GroupLayout pnlCadastroCidadeLayout = new javax.swing.GroupLayout(pnlCadastroCidade);
        pnlCadastroCidade.setLayout(pnlCadastroCidadeLayout);
        pnlCadastroCidadeLayout.setHorizontalGroup(
            pnlCadastroCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroCidadeLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlCadastroCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCadastroCidades)
                    .addGroup(pnlCadastroCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblCadastroCidadeCidade)
                        .addComponent(txtCadastroCidadeCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroCidadeLayout.createSequentialGroup()
                            .addGroup(pnlCadastroCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCadastroCidadeCI)
                                .addComponent(txtCadastroCidadeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlCadastroCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCadastroCidadeEstado)
                                .addComponent(txtCadastroCidadeCI, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroCidadeLayout.createSequentialGroup()
                            .addComponent(btnCadastroCidadeSalvar)
                            .addGap(18, 18, 18)
                            .addComponent(btnCadastroCidadeCancelar))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        pnlCadastroCidadeLayout.setVerticalGroup(
            pnlCadastroCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroCidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadastroCidades)
                .addGap(13, 13, 13)
                .addComponent(lblCadastroCidadeCidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCadastroCidadeCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlCadastroCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCadastroCidadeEstado)
                    .addComponent(lblCadastroCidadeCI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCadastroCidadeCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCadastroCidadeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(pnlCadastroCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastroCidadeCancelar)
                    .addComponent(btnCadastroCidadeSalvar))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCadastroCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(pnlCadastroCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroCidadeSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroCidadeSalvarActionPerformed
        String cidade = txtCadastroCidadeCidade.getText();
        String estado = txtCadastroCidadeEstado.getText();
        int codigo = Integer.parseInt(txtCadastroCidadeCI.getText());

        TelaPrincipal.cidades.add(
            new Cidade(cidade, estado, codigo)
        );

        JOptionPane.showMessageDialog(null,
            "Cadastro realizado com sucesso!"
        );

        this.dispose();
    }//GEN-LAST:event_btnCadastroCidadeSalvarActionPerformed

    private void btnCadastroCidadeCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroCidadeCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCadastroCidadeCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroCidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastroCidadeCancelar;
    private javax.swing.JButton btnCadastroCidadeSalvar;
    private javax.swing.JLabel lblCadastroCidadeCI;
    private javax.swing.JLabel lblCadastroCidadeCidade;
    private javax.swing.JLabel lblCadastroCidadeEstado;
    private javax.swing.JLabel lblCadastroCidades;
    private javax.swing.JPanel pnlCadastroCidade;
    private javax.swing.JTextField txtCadastroCidadeCI;
    private javax.swing.JTextField txtCadastroCidadeCidade;
    private javax.swing.JTextField txtCadastroCidadeEstado;
    // End of variables declaration//GEN-END:variables
}
