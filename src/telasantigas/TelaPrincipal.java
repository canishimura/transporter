package transporter;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TelaPrincipal extends javax.swing.JFrame {

    protected static List<Passageiro> passageiros = new ArrayList<>();
    protected static List<Cidade> cidades = new ArrayList<>();
    protected static List<Passagem> passagens = new ArrayList<>();

    
    
    public TelaPrincipal(JDesktopPane dpnlPrincipal, JMenuBar menuBarra, JMenu menuCidades, JMenuItem menuCidadesItem1, JMenuItem menuCidadesItem2, JMenu menuPassageiros, JMenuItem menuPassageirosItem1, JMenuItem menuPassageirosItem2, JMenu menuPassagens, JMenuItem menuPassagensItem1, JMenuItem menuPassagensItem2, JMenuItem menuPassagensItem3, JMenu menuSobre) throws HeadlessException {
        this.dpnlPrincipal = dpnlPrincipal;
        this.menuBarra = menuBarra;
        this.menuCidades = menuCidades;
        this.menuCidadesItem1 = menuCidadesItem1;
        this.menuCidadesItem2 = menuCidadesItem2;
        this.menuPassageiros = menuPassageiros;
        this.menuPassageirosItem10 = menuPassageirosItem1;
        this.menuPassageirosItem20 = menuPassageirosItem2;
        this.menuPassagens = menuPassagens;
        this.menuPassagensItem1 = menuPassagensItem1;
        this.menuPassagensItem2 = menuPassagensItem2;
        this.menuPassagensItem3 = menuPassagensItem3;
        this.menuSobre = menuSobre;
    }
    
    public TelaPrincipal() {
        initComponents();
        
        this.setTitle("Menu");
        this.setResizable(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgOnibus = new javax.swing.JLabel();
        dpnlPrincipal = new javax.swing.JDesktopPane();
        menuBarra = new javax.swing.JMenuBar();
        menuPassageiros = new javax.swing.JMenu();
        menuPassageirosItem10 = new javax.swing.JMenuItem();
        menuPassageirosItem20 = new javax.swing.JMenuItem();
        menuCidades = new javax.swing.JMenu();
        menuCidadesItem1 = new javax.swing.JMenuItem();
        menuCidadesItem2 = new javax.swing.JMenuItem();
        menuPassagens = new javax.swing.JMenu();
        menuPassagensItem1 = new javax.swing.JMenuItem();
        menuPassagensItem2 = new javax.swing.JMenuItem();
        menuPassagensItem3 = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgOnibus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/onibusContorno2.png"))); // NOI18N
        getContentPane().add(imgOnibus, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 133, -1, -1));

        dpnlPrincipal.setPreferredSize(new java.awt.Dimension(600, 800));
        dpnlPrincipal.setRequestFocusEnabled(false);

        javax.swing.GroupLayout dpnlPrincipalLayout = new javax.swing.GroupLayout(dpnlPrincipal);
        dpnlPrincipal.setLayout(dpnlPrincipalLayout);
        dpnlPrincipalLayout.setHorizontalGroup(
            dpnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        dpnlPrincipalLayout.setVerticalGroup(
            dpnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
        );

        getContentPane().add(dpnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 689));

        menuPassageiros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/group.png"))); // NOI18N
        menuPassageiros.setText("Passageiros");

        menuPassageirosItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_add.png"))); // NOI18N
        menuPassageirosItem10.setText("Cadastrar Novo Passageiro");
        menuPassageirosItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPassageirosItem10ActionPerformed(evt);
            }
        });
        menuPassageiros.add(menuPassageirosItem10);

        menuPassageirosItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book_open.png"))); // NOI18N
        menuPassageirosItem20.setText("Listar Passageiros");
        menuPassageirosItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPassageirosItem20ActionPerformed(evt);
            }
        });
        menuPassageiros.add(menuPassageirosItem20);

        menuBarra.add(menuPassageiros);

        menuCidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/map.png"))); // NOI18N
        menuCidades.setText("Cidades");

        menuCidadesItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/map_add.png"))); // NOI18N
        menuCidadesItem1.setText("Cadastrar Nova Cidade");
        menuCidadesItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCidadesItem1ActionPerformed(evt);
            }
        });
        menuCidades.add(menuCidadesItem1);

        menuCidadesItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book_open.png"))); // NOI18N
        menuCidadesItem2.setText("Listar Cidades");
        menuCidadesItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCidadesItem2ActionPerformed(evt);
            }
        });
        menuCidades.add(menuCidadesItem2);

        menuBarra.add(menuCidades);

        menuPassagens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/script.png"))); // NOI18N
        menuPassagens.setText("Passagens");
        menuPassagens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPassagensActionPerformed(evt);
            }
        });

        menuPassagensItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/script_add.png"))); // NOI18N
        menuPassagensItem1.setText("Vender Passagem");
        menuPassagensItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPassagensItem1ActionPerformed(evt);
            }
        });
        menuPassagens.add(menuPassagensItem1);

        menuPassagensItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/script_delete.png"))); // NOI18N
        menuPassagensItem2.setText("Cancelar Passagem");
        menuPassagens.add(menuPassagensItem2);

        menuPassagensItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book_open.png"))); // NOI18N
        menuPassagensItem3.setText("Listar Passagens Vendidas");
        menuPassagensItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPassagensItem3ActionPerformed(evt);
            }
        });
        menuPassagens.add(menuPassagensItem3);

        menuBarra.add(menuPassagens);

        menuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/help.png"))); // NOI18N
        menuSobre.setText("Sobre");
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });
        menuBarra.add(menuSobre);

        setJMenuBar(menuBarra);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuCidadesItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCidadesItem1ActionPerformed
        
        TelaCadastroCidade telaCadCidade = new TelaCadastroCidade();
        dpnlPrincipal.add(telaCadCidade);
        telaCadCidade.setVisible(true);
        
    }//GEN-LAST:event_menuCidadesItem1ActionPerformed

    private void menuPassageirosItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPassageirosItem20ActionPerformed
        
        TelaVisualizarPassageiros telaVisPass = new TelaVisualizarPassageiros();
        dpnlPrincipal.add(telaVisPass);
        telaVisPass.setVisible(true);
        

    }//GEN-LAST:event_menuPassageirosItem20ActionPerformed

    private void menuPassageirosItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPassageirosItem10ActionPerformed
        
        TelaCadastroPassageiro telaCadPassageiro = new TelaCadastroPassageiro();
        dpnlPrincipal.add(telaCadPassageiro);
        telaCadPassageiro.setVisible(true);
        
    }//GEN-LAST:event_menuPassageirosItem10ActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
        
        TelaSobre telaSobre = new TelaSobre();
        dpnlPrincipal.add(telaSobre);
        telaSobre.setVisible(true);
        
    }//GEN-LAST:event_menuSobreActionPerformed

    private void menuCidadesItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCidadesItem2ActionPerformed
        
        TelaVisualizarCidades telaVisCid = new TelaVisualizarCidades();
        dpnlPrincipal.add(telaVisCid);
        telaVisCid.setVisible(true);
        
    }//GEN-LAST:event_menuCidadesItem2ActionPerformed

    private void menuPassagensItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPassagensItem1ActionPerformed
        
        TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
        dpnlPrincipal.add(telaVenPas);
        telaVenPas.setVisible(true);
        
    }//GEN-LAST:event_menuPassagensItem1ActionPerformed

    private void menuPassagensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPassagensActionPerformed
        
       
        
    }//GEN-LAST:event_menuPassagensActionPerformed

    private void menuPassagensItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPassagensItem3ActionPerformed
        TelaVisualizarPassagens telaVisPas = new TelaVisualizarPassagens();
        dpnlPrincipal.add(telaVisPas);
        telaVisPas.setVisible(true);
    }//GEN-LAST:event_menuPassagensItem3ActionPerformed

    
    public static void main(String args[]) {
        Passageiro p01 = new Passageiro("Jair", "451.356.415-12", "jairleao@gmail.com");
        Passageiro p02 = new Passageiro("Matheus", "354.456.854-96", "matheusbacha@gmail.com");
        Passageiro p03 = new Passageiro("Fernanda", "258.369.147-85", "fernandasilva@gmail.com");
        Passageiro p04 = new Passageiro("Carlos", "159.753.486-21", "carlossantos@gmail.com");
        Passageiro p05 = new Passageiro("Beatriz", "357.951.268-33", "beatrizsouza@gmail.com");
        Passageiro p06 = new Passageiro("Ricardo", "468.321.579-44", "ricardomartins@gmail.com");
        Passageiro p07 = new Passageiro("Juliana", "789.654.123-55", "julianamendes@gmail.com");
        Passageiro p08 = new Passageiro("Gabriel", "123.987.654-77", "gabrielrocha@gmail.com");
        TelaPrincipal.passageiros.add(p01);
        TelaPrincipal.passageiros.add(p02);
        TelaPrincipal.passageiros.add(p03);
        TelaPrincipal.passageiros.add(p04);
        TelaPrincipal.passageiros.add(p05);
        TelaPrincipal.passageiros.add(p06);
        TelaPrincipal.passageiros.add(p07);
        TelaPrincipal.passageiros.add(p08);
        
        Cidade c01 = new Cidade("São Paulo", "SP", 3550308);
        Cidade c02 = new Cidade("Ribeirão Preto", "SP", 3543402);
        Cidade c03 = new Cidade("Curitiba", "PR", 4106902);
        Cidade c04 = new Cidade("Belo Horizonte", "MG", 3106200);
        Cidade c05 = new Cidade("Porto Alegre", "RS", 4314902);
        Cidade c06 = new Cidade("Brasília", "DF", 5300108);
        Cidade c07 = new Cidade("Salvador", "BA", 2927408);
        Cidade c08 = new Cidade("Londrina", "PR", 4113700);
        TelaPrincipal.cidades.add(c01);
        TelaPrincipal.cidades.add(c02);
        TelaPrincipal.cidades.add(c03);
        TelaPrincipal.cidades.add(c04);
        TelaPrincipal.cidades.add(c05);
        TelaPrincipal.cidades.add(c06);
        TelaPrincipal.cidades.add(c07);
        TelaPrincipal.cidades.add(c08);
        
        
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpnlPrincipal;
    private javax.swing.JLabel imgOnibus;
    private javax.swing.JMenuBar menuBarra;
    private javax.swing.JMenu menuCidades;
    private javax.swing.JMenuItem menuCidadesItem1;
    private javax.swing.JMenuItem menuCidadesItem2;
    private javax.swing.JMenu menuPassageiros;
    private javax.swing.JMenuItem menuPassageirosItem10;
    private javax.swing.JMenuItem menuPassageirosItem20;
    private javax.swing.JMenu menuPassagens;
    private javax.swing.JMenuItem menuPassagensItem1;
    private javax.swing.JMenuItem menuPassagensItem2;
    private javax.swing.JMenuItem menuPassagensItem3;
    private javax.swing.JMenu menuSobre;
    // End of variables declaration//GEN-END:variables
}
