package transporter;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaVendaPassagem extends javax.swing.JFrame {

    private Passageiro buscarPassageiro(String nome, String cpf) {
        for (Passageiro p : TelaPrincipal.passageiros) {
            if (p.getNome().equalsIgnoreCase(nome) && p.getCpf().equalsIgnoreCase(cpf)) {
                return p;
            }
        }
        return null;
    }
    
    private Cidade buscarCidadeOrigem (String cidadeOrigem) {
        for (Cidade co : TelaPrincipal.cidades) {
            if(co.getCidade().equalsIgnoreCase(cidadeOrigem)){
                return co;
            }
        }
        return null;
    }
    
    private Cidade buscarCidadeDestino (String cidadeDestino) {
        for (Cidade cd : TelaPrincipal.cidades) {
            if(cd.getCidade().equalsIgnoreCase(cidadeDestino)){
                return cd;
            }
        }
        return null;
    }
    
    private boolean verificaPoltrona (int poltrona) {
        for (Passagem p : TelaPrincipal.passagens) {
            if (p.getPoltrona() == poltrona) {
                return true;
            }
        }
        return false;
    }
    
    private void venderPassagem() {
        
        String cidadeOrigem = txtCidadeOrigem.getText();
        String cidadeDestino = txtCidadeDestino.getText();
        int poltrona = Integer.parseInt(txtPoltrona.getText());
        String data = txtData.getText();
        String passageiro = txtPassageiro.getText();
        String cpf = txtCPF.getText();
        
        try {
            poltrona = Integer.parseInt(txtPoltrona.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Número de poltrona inváilido","Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Cidade origem = buscarCidadeOrigem(cidadeOrigem);
        if (origem == null){
            JOptionPane.showMessageDialog(null, "Cidade de origem não cadastrada!");
            return;
        } 
        
        
        Cidade destino = buscarCidadeDestino(cidadeDestino);
        if (destino == null){
            JOptionPane.showMessageDialog(null, "Cidade de destino não cadastrada!");
            return;
        }
        
        Passageiro pass = buscarPassageiro(passageiro, cpf);
        if (pass == null) {
            JOptionPane.showMessageDialog(null, "Passageiro não cadastrado");
            return;
        }
        
        
        if (verificaPoltrona(poltrona)) {
            JOptionPane.showMessageDialog(this, "Poltrona já está ocupada!");
            return;
        }
        
        
        Passagem novaPassagem = new Passagem(cidadeOrigem, cidadeDestino, data, poltrona, passageiro, cpf);
        TelaPrincipal.passagens.add(novaPassagem);
        TelaPrincipal.atualizarCorPoltrona();
        JOptionPane.showMessageDialog(null, "Passagem vendida com sucesso.");
    
    }
    
    public TelaVendaPassagem() {
        initComponents();
        
        this.setTitle("Venda de Passagem");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPassageiro = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblCPF = new javax.swing.JLabel();
        txtCidadeDestino = new javax.swing.JTextField();
        txtCidadeOrigem = new javax.swing.JTextField();
        txtPoltrona = new javax.swing.JTextField();
        lblCidadeDestino = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        txtData = new javax.swing.JFormattedTextField();
        lblVendaPassagens = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtPassageiro = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        lblPoltrona = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblCidadeOrigem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPassageiro.setText("Passageiro");

        jButton1.setText("Vender");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblCPF.setText("CPF");

        txtCidadeDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeDestinoActionPerformed(evt);
            }
        });

        lblCidadeDestino.setText("Cidade de Destino");

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblVendaPassagens.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblVendaPassagens.setText("Venda de Passagens");

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblPoltrona.setText("Poltrona");

        lblData.setText("Data");

        lblCidadeOrigem.setText("Cidade de Origem");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCidadeOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCidadeDestino)
                        .addComponent(txtCidadeDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCidadeOrigem)
                                .addComponent(lblData)
                                .addComponent(lblPassageiro)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(82, 82, 82)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPoltrona)
                                .addComponent(txtPoltrona, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(lblVendaPassagens))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCPF)
                        .addComponent(txtPassageiro, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblVendaPassagens)
                .addGap(18, 18, 18)
                .addComponent(lblCidadeOrigem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCidadeOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCidadeDestino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCidadeDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData)
                    .addComponent(lblPoltrona))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPoltrona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(lblPassageiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassageiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        venderPassagem();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCidadeDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeDestinoActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVendaPassagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVendaPassagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVendaPassagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVendaPassagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVendaPassagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCidadeDestino;
    private javax.swing.JLabel lblCidadeOrigem;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblPassageiro;
    private javax.swing.JLabel lblPoltrona;
    private javax.swing.JLabel lblVendaPassagens;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCidadeDestino;
    private javax.swing.JTextField txtCidadeOrigem;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtPassageiro;
    private javax.swing.JTextField txtPoltrona;
    // End of variables declaration//GEN-END:variables
}
