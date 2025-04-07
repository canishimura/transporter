package transporter;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaCadastroPassageiro extends javax.swing.JFrame {

    public TelaCadastroPassageiro() {
        initComponents();
        
        this.setTitle("Cadastro de Passageiro");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCadastroPassageiro = new javax.swing.JPanel();
        lblCadastroPassageiroNome = new javax.swing.JLabel();
        lblCadastroPassageiroCPF = new javax.swing.JLabel();
        lblCadastroPassageiroEmail = new javax.swing.JLabel();
        txtCadastroPassageiroNome = new javax.swing.JTextField();
        txtCadastroPassageiroEmail = new javax.swing.JTextField();
        btnCadastroPassageiroSalvar = new javax.swing.JButton();
        txtCadastroPassageiroCPF = new javax.swing.JFormattedTextField();
        btnCadastroPassageiroCancelar = new javax.swing.JButton();
        lblCadastroPassageiros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCadastroPassageiroNome.setText("Nome");

        lblCadastroPassageiroCPF.setText("CPF");

        lblCadastroPassageiroEmail.setText("E-mail");

        btnCadastroPassageiroSalvar.setText("Salvar");
        btnCadastroPassageiroSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroPassageiroSalvarActionPerformed(evt);
            }
        });

        try {
            txtCadastroPassageiroCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnCadastroPassageiroCancelar.setText("Cancelar");
        btnCadastroPassageiroCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroPassageiroCancelarActionPerformed(evt);
            }
        });

        lblCadastroPassageiros.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCadastroPassageiros.setText("Cadastro de Passageiro");

        javax.swing.GroupLayout pnlCadastroPassageiroLayout = new javax.swing.GroupLayout(pnlCadastroPassageiro);
        pnlCadastroPassageiro.setLayout(pnlCadastroPassageiroLayout);
        pnlCadastroPassageiroLayout.setHorizontalGroup(
            pnlCadastroPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroPassageiroLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlCadastroPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCadastroPassageiros)
                    .addGroup(pnlCadastroPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblCadastroPassageiroNome, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCadastroPassageiroCPF, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCadastroPassageiroEmail, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCadastroPassageiroNome, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCadastroPassageiroEmail, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCadastroPassageiroCPF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                        .addGroup(pnlCadastroPassageiroLayout.createSequentialGroup()
                            .addComponent(btnCadastroPassageiroSalvar)
                            .addGap(18, 18, 18)
                            .addComponent(btnCadastroPassageiroCancelar))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        pnlCadastroPassageiroLayout.setVerticalGroup(
            pnlCadastroPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroPassageiroLayout.createSequentialGroup()
                .addComponent(lblCadastroPassageiros)
                .addGap(13, 13, 13)
                .addComponent(lblCadastroPassageiroNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCadastroPassageiroNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCadastroPassageiroCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCadastroPassageiroCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCadastroPassageiroEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCadastroPassageiroEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(pnlCadastroPassageiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastroPassageiroCancelar)
                    .addComponent(btnCadastroPassageiroSalvar))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCadastroPassageiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCadastroPassageiro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroPassageiroSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroPassageiroSalvarActionPerformed

        String nome = txtCadastroPassageiroNome.getText();
        String cpf = txtCadastroPassageiroCPF.getText();
        String email = txtCadastroPassageiroEmail.getText();

        TelaPrincipal.passageiros.add(
            new Passageiro(nome, cpf, email)
        );

        JOptionPane.showMessageDialog(null,
            "Cadastro realizado com sucesso!"
        );

        this.dispose();
    }//GEN-LAST:event_btnCadastroPassageiroSalvarActionPerformed

    private void btnCadastroPassageiroCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroPassageiroCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCadastroPassageiroCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroPassageiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPassageiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPassageiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPassageiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroPassageiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastroPassageiroCancelar;
    private javax.swing.JButton btnCadastroPassageiroSalvar;
    private javax.swing.JLabel lblCadastroPassageiroCPF;
    private javax.swing.JLabel lblCadastroPassageiroEmail;
    private javax.swing.JLabel lblCadastroPassageiroNome;
    private javax.swing.JLabel lblCadastroPassageiros;
    private javax.swing.JPanel pnlCadastroPassageiro;
    private javax.swing.JFormattedTextField txtCadastroPassageiroCPF;
    private javax.swing.JTextField txtCadastroPassageiroEmail;
    private javax.swing.JTextField txtCadastroPassageiroNome;
    // End of variables declaration//GEN-END:variables
}
