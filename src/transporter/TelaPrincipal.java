package transporter;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {
    
    protected static List<Passageiro> passageiros = new ArrayList<>();
    protected static List<Cidade> cidades = new ArrayList<>();
    protected static List<Passagem> passagens = new ArrayList<>();
    protected static JButton[] botoesPoltronas = new JButton[40];

    public TelaPrincipal() {
        initComponents();
        myInitComponents();
        
        this.setTitle("Transporter");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public static void atualizarCorPoltrona () {
        for (int i = 0; i < botoesPoltronas.length; i++) {
            JButton btn = botoesPoltronas[i];
            if (verificaPoltrona(i+1)) {
                btn.setBackground(Color.red);
            } else {
                btn.setBackground(Color.green);
            }
        }
    }
    
    private void inicializarArrayDeBotoes() {
        botoesPoltronas[0] = btnPoltrona1;
        botoesPoltronas[1] = btnPoltrona2;
        botoesPoltronas[2] = btnPoltrona3;
        botoesPoltronas[3] = btnPoltrona4;
        botoesPoltronas[4] = btnPoltrona5;
        botoesPoltronas[5] = btnPoltrona6;
        botoesPoltronas[6] = btnPoltrona7;
        botoesPoltronas[7] = btnPoltrona8;
        botoesPoltronas[8] = btnPoltrona9;
        botoesPoltronas[9] = btnPoltrona10;
        botoesPoltronas[10] = btnPoltrona11;
        botoesPoltronas[11] = btnPoltrona12;
        botoesPoltronas[12] = btnPoltrona13;
        botoesPoltronas[13] = btnPoltrona14;
        botoesPoltronas[14] = btnPoltrona15;
        botoesPoltronas[15] = btnPoltrona16;
        botoesPoltronas[16] = btnPoltrona17;
        botoesPoltronas[17] = btnPoltrona18;
        botoesPoltronas[18] = btnPoltrona19;
        botoesPoltronas[19] = btnPoltrona20;
        botoesPoltronas[20] = btnPoltrona21;
        botoesPoltronas[21] = btnPoltrona22;
        botoesPoltronas[22] = btnPoltrona23;
        botoesPoltronas[23] = btnPoltrona24;
        botoesPoltronas[24] = btnPoltrona25;
        botoesPoltronas[25] = btnPoltrona26;
        botoesPoltronas[26] = btnPoltrona27;
        botoesPoltronas[27] = btnPoltrona28;
        botoesPoltronas[28] = btnPoltrona29;
        botoesPoltronas[29] = btnPoltrona30;
        botoesPoltronas[30] = btnPoltrona31;
        botoesPoltronas[31] = btnPoltrona32;
        botoesPoltronas[32] = btnPoltrona33;
        botoesPoltronas[33] = btnPoltrona34;
        botoesPoltronas[34] = btnPoltrona35;
        botoesPoltronas[35] = btnPoltrona36;
        botoesPoltronas[36] = btnPoltrona37;
        botoesPoltronas[37] = btnPoltrona38;
        botoesPoltronas[38] = btnPoltrona39;
        botoesPoltronas[39] = btnPoltrona40;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPoltrona1 = new javax.swing.JButton();
        btnPoltrona2 = new javax.swing.JButton();
        btnPoltrona3 = new javax.swing.JButton();
        btnPoltrona4 = new javax.swing.JButton();
        btnPoltrona5 = new javax.swing.JButton();
        btnPoltrona6 = new javax.swing.JButton();
        btnPoltrona7 = new javax.swing.JButton();
        btnPoltrona8 = new javax.swing.JButton();
        btnPoltrona9 = new javax.swing.JButton();
        btnPoltrona10 = new javax.swing.JButton();
        btnPoltrona11 = new javax.swing.JButton();
        btnPoltrona12 = new javax.swing.JButton();
        btnPoltrona13 = new javax.swing.JButton();
        btnPoltrona14 = new javax.swing.JButton();
        btnPoltrona15 = new javax.swing.JButton();
        btnPoltrona16 = new javax.swing.JButton();
        btnPoltrona17 = new javax.swing.JButton();
        btnPoltrona18 = new javax.swing.JButton();
        btnPoltrona19 = new javax.swing.JButton();
        btnPoltrona20 = new javax.swing.JButton();
        btnPoltrona21 = new javax.swing.JButton();
        btnPoltrona22 = new javax.swing.JButton();
        btnPoltrona23 = new javax.swing.JButton();
        btnPoltrona24 = new javax.swing.JButton();
        btnPoltrona25 = new javax.swing.JButton();
        btnPoltrona26 = new javax.swing.JButton();
        btnPoltrona27 = new javax.swing.JButton();
        btnPoltrona28 = new javax.swing.JButton();
        btnPoltrona29 = new javax.swing.JButton();
        btnPoltrona30 = new javax.swing.JButton();
        btnPoltrona31 = new javax.swing.JButton();
        btnPoltrona32 = new javax.swing.JButton();
        btnPoltrona33 = new javax.swing.JButton();
        btnPoltrona34 = new javax.swing.JButton();
        btnPoltrona35 = new javax.swing.JButton();
        btnPoltrona36 = new javax.swing.JButton();
        btnPoltrona37 = new javax.swing.JButton();
        btnPoltrona38 = new javax.swing.JButton();
        btnPoltrona39 = new javax.swing.JButton();
        btnPoltrona40 = new javax.swing.JButton();
        imgOnibus = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menuBarra1 = new javax.swing.JMenuBar();
        menuPassageiros1 = new javax.swing.JMenu();
        menuPassageirosItem1 = new javax.swing.JMenuItem();
        menuPassageirosItem2 = new javax.swing.JMenuItem();
        menuCidades1 = new javax.swing.JMenu();
        menuCidadesItem1 = new javax.swing.JMenuItem();
        menuCidadesItem2 = new javax.swing.JMenuItem();
        menuPassagens1 = new javax.swing.JMenu();
        menuPassagensItem1 = new javax.swing.JMenuItem();
        menuPassagensItem2 = new javax.swing.JMenuItem();
        menuPassagensItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPoltrona1.setText("01");
        btnPoltrona1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 60, 60));

        btnPoltrona2.setText("02");
        btnPoltrona2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 60, 60));

        btnPoltrona3.setText("03");
        btnPoltrona3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 60, 60));

        btnPoltrona4.setText("04");
        btnPoltrona4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 60, 60));

        btnPoltrona5.setText("05");
        btnPoltrona5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 60, 60));

        btnPoltrona6.setText("06");
        btnPoltrona6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 60, 60));

        btnPoltrona7.setText("07");
        btnPoltrona7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 60, 60));

        btnPoltrona8.setText("08");
        btnPoltrona8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona8ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 60, 60));

        btnPoltrona9.setText("09");
        btnPoltrona9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona9ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 60, 60));

        btnPoltrona10.setText("10");
        btnPoltrona10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona10ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 60, 60));

        btnPoltrona11.setText("11");
        btnPoltrona11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 60, 60));

        btnPoltrona12.setText("12");
        btnPoltrona12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona12ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 60, 60));

        btnPoltrona13.setText("13");
        btnPoltrona13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona13ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 60, 60));

        btnPoltrona14.setText("14");
        btnPoltrona14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona14ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 60, 60));

        btnPoltrona15.setText("15");
        btnPoltrona15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona15ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 60, 60));

        btnPoltrona16.setText("16");
        btnPoltrona16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona16ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona16, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 60, 60));

        btnPoltrona17.setText("17");
        btnPoltrona17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona17ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona17, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 60, 60));

        btnPoltrona18.setText("18");
        btnPoltrona18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona18ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona18, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 60, 60));

        btnPoltrona19.setText("19");
        btnPoltrona19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona19ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona19, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 60, 60));

        btnPoltrona20.setText("20");
        btnPoltrona20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona20ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona20, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 60, 60));

        btnPoltrona21.setText("21");
        btnPoltrona21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona21ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona21, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, 60, 60));

        btnPoltrona22.setText("22");
        btnPoltrona22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona22ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona22, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, 60, 60));

        btnPoltrona23.setText("23");
        btnPoltrona23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona23ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona23, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 60, 60));

        btnPoltrona24.setText("24");
        btnPoltrona24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona24ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona24, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 60, 60));

        btnPoltrona25.setText("25");
        btnPoltrona25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona25ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona25, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, 60, 60));

        btnPoltrona26.setText("26");
        btnPoltrona26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona26ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona26, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, 60, 60));

        btnPoltrona27.setText("27");
        btnPoltrona27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona27ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona27, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 60, 60));

        btnPoltrona28.setText("28");
        btnPoltrona28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona28ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona28, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 60, 60));

        btnPoltrona29.setText("29");
        btnPoltrona29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona29ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona29, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 390, 60, 60));

        btnPoltrona30.setText("30");
        btnPoltrona30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona30ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona30, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 320, 60, 60));

        btnPoltrona31.setText("31");
        btnPoltrona31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona31ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona31, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 120, 60, 60));

        btnPoltrona32.setText("32");
        btnPoltrona32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona32ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona32, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 190, 60, 60));

        btnPoltrona33.setText("33");
        btnPoltrona33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona33ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona33, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 390, 60, 60));

        btnPoltrona34.setText("34");
        btnPoltrona34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona34ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona34, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 320, 60, 60));

        btnPoltrona35.setText("35");
        btnPoltrona35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona35ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona35, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 120, 60, 60));

        btnPoltrona36.setText("36");
        btnPoltrona36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona36ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona36, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 190, 60, 60));

        btnPoltrona37.setText("37");
        btnPoltrona37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona37ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona37, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 390, 60, 60));

        btnPoltrona38.setText("38");
        btnPoltrona38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona38ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona38, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 320, 60, 60));

        btnPoltrona39.setText("39");
        btnPoltrona39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona39ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona39, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 120, 60, 60));

        btnPoltrona40.setText("40");
        btnPoltrona40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoltrona40ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoltrona40, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 190, 60, 60));

        imgOnibus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/onibusContorno2.png"))); // NOI18N
        getContentPane().add(imgOnibus, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 74, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Ribeirão Preto x São Paulo - 20/05/2025");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        menuPassageiros1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/group.png"))); // NOI18N
        menuPassageiros1.setText("Passageiros");

        menuPassageirosItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_add.png"))); // NOI18N
        menuPassageirosItem1.setText("Cadastrar Novo Passageiro");
        menuPassageirosItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPassageirosItem1ActionPerformed(evt);
            }
        });
        menuPassageiros1.add(menuPassageirosItem1);

        menuPassageirosItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book_open.png"))); // NOI18N
        menuPassageirosItem2.setText("Listar Passageiros");
        menuPassageirosItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPassageirosItem2ActionPerformed(evt);
            }
        });
        menuPassageiros1.add(menuPassageirosItem2);

        menuBarra1.add(menuPassageiros1);

        menuCidades1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/map.png"))); // NOI18N
        menuCidades1.setText("Cidades");

        menuCidadesItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/map_add.png"))); // NOI18N
        menuCidadesItem1.setText("Cadastrar Nova Cidade");
        menuCidadesItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCidadesItem1ActionPerformed(evt);
            }
        });
        menuCidades1.add(menuCidadesItem1);

        menuCidadesItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book_open.png"))); // NOI18N
        menuCidadesItem2.setText("Listar Cidades");
        menuCidadesItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCidadesItem2ActionPerformed(evt);
            }
        });
        menuCidades1.add(menuCidadesItem2);

        menuBarra1.add(menuCidades1);

        menuPassagens1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/script.png"))); // NOI18N
        menuPassagens1.setText("Passagens");
        menuPassagens1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPassagens1ActionPerformed(evt);
            }
        });

        menuPassagensItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/script_add.png"))); // NOI18N
        menuPassagensItem1.setText("Vender Passagem");
        menuPassagensItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPassagensItem1ActionPerformed(evt);
            }
        });
        menuPassagens1.add(menuPassagensItem1);

        menuPassagensItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/script_delete.png"))); // NOI18N
        menuPassagensItem2.setText("Cancelar Passagem");
        menuPassagensItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPassagensItem2ActionPerformed(evt);
            }
        });
        menuPassagens1.add(menuPassagensItem2);

        menuPassagensItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book_open.png"))); // NOI18N
        menuPassagensItem3.setText("Listar Passagens Vendidas");
        menuPassagensItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPassagensItem3ActionPerformed(evt);
            }
        });
        menuPassagens1.add(menuPassagensItem3);

        menuBarra1.add(menuPassagens1);

        setJMenuBar(menuBarra1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void myInitComponents() {
        inicializarArrayDeBotoes();
        atualizarCorPoltrona();
        
        JMenuItem menuSobre = new JMenuItem("Sobre");
        menuSobre.setIcon(new ImageIcon(getClass().getResource("/imagens/help.png")));
        menuSobre.addActionListener(evt -> {
            TelaSobre telaSobre = new TelaSobre();
            telaSobre.setVisible(true);
        });
        menuSobre.setPreferredSize(new Dimension(80, 22));
        menuSobre.setMaximumSize(new Dimension(80, 22));
        menuBarra1.add(menuSobre);
        }
    
    private static boolean verificaPoltrona (int poltrona) {
        for (Passagem p : passagens) {
            if (p.getPoltrona() == poltrona) {
                return true;
            }
        }
        return false;
    }
    
    private void btnPoltrona1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona1ActionPerformed
        if (verificaPoltrona(1)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            } 
            
        }
    }//GEN-LAST:event_btnPoltrona1ActionPerformed

    private void menuPassageirosItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPassageirosItem1ActionPerformed

        TelaCadastroPassageiro telaCadPassageiro = new TelaCadastroPassageiro();
        telaCadPassageiro.setVisible(true);

    }//GEN-LAST:event_menuPassageirosItem1ActionPerformed

    private void menuPassageirosItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPassageirosItem2ActionPerformed

        TelaVisualizarPassageiros telaVisPass = new TelaVisualizarPassageiros();
        telaVisPass.setVisible(true);

    }//GEN-LAST:event_menuPassageirosItem2ActionPerformed

    private void menuCidadesItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCidadesItem1ActionPerformed

        TelaCadastroCidade telaCadCidade = new TelaCadastroCidade();
        telaCadCidade.setVisible(true);

    }//GEN-LAST:event_menuCidadesItem1ActionPerformed

    private void menuCidadesItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCidadesItem2ActionPerformed

        TelaVisualizarCidades telaVisCid = new TelaVisualizarCidades();
        telaVisCid.setVisible(true);

    }//GEN-LAST:event_menuCidadesItem2ActionPerformed

    private void menuPassagensItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPassagensItem1ActionPerformed

        TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
        telaVenPas.setVisible(true);

    }//GEN-LAST:event_menuPassagensItem1ActionPerformed

    private void menuPassagensItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPassagensItem3ActionPerformed
        TelaVisualizarPassagens telaVisPas = new TelaVisualizarPassagens();
        telaVisPas.setVisible(true);
    }//GEN-LAST:event_menuPassagensItem3ActionPerformed

    private void menuPassagens1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPassagens1ActionPerformed

    }//GEN-LAST:event_menuPassagens1ActionPerformed

    private void btnPoltrona2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona2ActionPerformed
        if (verificaPoltrona(2)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona2ActionPerformed

    private void btnPoltrona3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona3ActionPerformed
        if (verificaPoltrona(3)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona3ActionPerformed

    private void btnPoltrona4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona4ActionPerformed
        if (verificaPoltrona(4)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona4ActionPerformed

    private void btnPoltrona5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona5ActionPerformed
        if (verificaPoltrona(5)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona5ActionPerformed

    private void btnPoltrona6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona6ActionPerformed
        if (verificaPoltrona(6)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona6ActionPerformed

    private void btnPoltrona7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona7ActionPerformed
                if (verificaPoltrona(7)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona7ActionPerformed

    private void btnPoltrona8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona8ActionPerformed
                if (verificaPoltrona(8)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona8ActionPerformed

    private void btnPoltrona9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona9ActionPerformed
                if (verificaPoltrona(9)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona9ActionPerformed

    private void btnPoltrona10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona10ActionPerformed
                if (verificaPoltrona(10)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona10ActionPerformed

    private void btnPoltrona11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona11ActionPerformed
                if (verificaPoltrona(11)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona11ActionPerformed

    private void btnPoltrona12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona12ActionPerformed
                if (verificaPoltrona(12)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona12ActionPerformed

    private void btnPoltrona13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona13ActionPerformed
                if (verificaPoltrona(13)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona13ActionPerformed

    private void btnPoltrona14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona14ActionPerformed
                if (verificaPoltrona(14)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona14ActionPerformed

    private void btnPoltrona15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona15ActionPerformed
                if (verificaPoltrona(15)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona15ActionPerformed

    private void btnPoltrona16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona16ActionPerformed
                if (verificaPoltrona(16)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona16ActionPerformed

    private void btnPoltrona17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona17ActionPerformed
                if (verificaPoltrona(17)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona17ActionPerformed

    private void btnPoltrona18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona18ActionPerformed
                if (verificaPoltrona(18)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona18ActionPerformed

    private void btnPoltrona19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona19ActionPerformed
                if (verificaPoltrona(19)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona19ActionPerformed

    private void btnPoltrona20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona20ActionPerformed
                if (verificaPoltrona(20)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona20ActionPerformed

    private void btnPoltrona21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona21ActionPerformed
                if (verificaPoltrona(21)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona21ActionPerformed

    private void btnPoltrona22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona22ActionPerformed
                if (verificaPoltrona(22)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona22ActionPerformed

    private void btnPoltrona23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona23ActionPerformed
                if (verificaPoltrona(23)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona23ActionPerformed

    private void btnPoltrona24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona24ActionPerformed
                if (verificaPoltrona(24)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona24ActionPerformed

    private void btnPoltrona25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona25ActionPerformed
                if (verificaPoltrona(25)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona25ActionPerformed

    private void btnPoltrona26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona26ActionPerformed
                if (verificaPoltrona(26)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona26ActionPerformed

    private void btnPoltrona27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona27ActionPerformed
                if (verificaPoltrona(27)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona27ActionPerformed

    private void btnPoltrona28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona28ActionPerformed
                if (verificaPoltrona(28)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona28ActionPerformed

    private void btnPoltrona29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona29ActionPerformed
                if (verificaPoltrona(29)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona29ActionPerformed

    private void btnPoltrona30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona30ActionPerformed
                if (verificaPoltrona(30)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona30ActionPerformed

    private void btnPoltrona31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona31ActionPerformed
                if (verificaPoltrona(31)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona31ActionPerformed

    private void btnPoltrona32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona32ActionPerformed
                if (verificaPoltrona(32)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona32ActionPerformed

    private void btnPoltrona33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona33ActionPerformed
                if (verificaPoltrona(33)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona33ActionPerformed

    private void btnPoltrona34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona34ActionPerformed
                if (verificaPoltrona(34)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona34ActionPerformed

    private void btnPoltrona35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona35ActionPerformed
                if (verificaPoltrona(35)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona35ActionPerformed

    private void btnPoltrona36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona36ActionPerformed
                if (verificaPoltrona(36)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona36ActionPerformed

    private void btnPoltrona37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona37ActionPerformed
                if (verificaPoltrona(37)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona37ActionPerformed

    private void btnPoltrona38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona38ActionPerformed
                if (verificaPoltrona(38)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona38ActionPerformed

    private void btnPoltrona39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona39ActionPerformed
        if (verificaPoltrona(39)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona39ActionPerformed

    private void btnPoltrona40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoltrona40ActionPerformed
        if (verificaPoltrona(40)) {
            JOptionPane.showMessageDialog(null, 
                    String.format("Poltrona ocupada!")
            );
        } else {
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Poltrona livre.\nDeseja realizar uma venda?",
                    "Poltrona livre",
                    JOptionPane.YES_NO_OPTION
            );
            
            if (resposta == JOptionPane.YES_OPTION) {
                TelaVendaPassagem telaVenPas = new TelaVendaPassagem();
                telaVenPas.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPoltrona40ActionPerformed

    private void menuPassagensItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPassagensItem2ActionPerformed
        String poltronaCancel = JOptionPane.showInputDialog(null,
                   "Informe a poltrona que será liberada:",
                   "Cancelar passagem",
                   JOptionPane.QUESTION_MESSAGE);
           try {
               int poltrona = Integer.parseInt(poltronaCancel);
               if (poltrona < 1 || poltrona > 40) {
                   JOptionPane.showMessageDialog(null, "Número de poltrona inválido");
               } else {
                   if (verificaPoltrona(poltrona)) {
                       int resposta = JOptionPane.showConfirmDialog(null,
                               String.format("Deseja realmente cancelar passagem da poltrona %d?", poltrona),
                               "Cancelar passagem",
                               JOptionPane.YES_NO_OPTION
                       );

                       if (resposta == JOptionPane.YES_OPTION) {
                           Iterator<Passagem> iterator = passagens.iterator();
                           while (iterator.hasNext()) {
                               Passagem p = iterator.next();
                               if (p.getPoltrona() == poltrona) {
                                   iterator.remove();
                                   JOptionPane.showMessageDialog(null, "Passagem cancelada com sucesso!");
                                   atualizarCorPoltrona();
                                   break;
                               }
                           }
                       }
                   } else {
                       JOptionPane.showMessageDialog(null, "Não há passagem emitida na poltrona informada");
                   }
               }
           } catch (NumberFormatException e) {
               JOptionPane.showMessageDialog(null,
                       "Número de poltrona inválido",
                       "Erro",
                       JOptionPane.ERROR_MESSAGE);
           }
    }//GEN-LAST:event_menuPassagensItem2ActionPerformed

    public static void main(String args[]) {
        Passageiro p01 = new Passageiro("Jair Leão", "451.356.415-12", "jairleao@gmail.com");
        Passageiro p02 = new Passageiro("Matheus Bacha", "354.456.854-96", "matheusbacha@gmail.com");
        Passageiro p03 = new Passageiro("Fernanda Silva", "258.369.147-85", "fernandasilva@gmail.com");
        Passageiro p04 = new Passageiro("Carlos Santos", "159.753.486-21", "carlossantos@gmail.com");
        Passageiro p05 = new Passageiro("Beatriz Souza", "357.951.268-33", "beatrizsouza@gmail.com");
        Passageiro p06 = new Passageiro("Ricardo Martins", "468.321.579-44", "ricardomartins@gmail.com");
        Passageiro p07 = new Passageiro("Juliana Mendes", "789.654.123-55", "julianamendes@gmail.com");
        Passageiro p08 = new Passageiro("Gabriel Rocha", "123.987.654-77", "gabrielrocha@gmail.com");
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
        
        Passagem pg01 = new Passagem("Ribeirão Preto", "São Paulo", "20/05/2025", 03,"Jair Leão", "451.356.415-12");
        Passagem pg02 = new Passagem("Ribeirão Preto", "São Paulo", "20/05/2025", 07, "Matheus Bacha", "354.456.854-96");
        Passagem pg03 = new Passagem("Ribeirão Preto", "São Paulo", "20/05/2025", 18, "Fernanda Silva", "258.369.147-85");
        Passagem pg04 = new Passagem("Ribeirão Preto", "São Paulo", "20/05/2025", 23, "Carlos Santos", "159.753.486-21");
        Passagem pg05 = new Passagem("Ribeirão Preto", "São Paulo", "20/05/2025", 24, "Beatriz Souza", "357.951.268-33");
        Passagem pg06 = new Passagem("Ribeirão Preto", "São Paulo", "20/05/2025", 33, "Ricardo Martins", "468.321.579-44");
        Passagem pg07 = new Passagem("Ribeirão Preto", "São Paulo", "20/05/2025", 40, "Juliana Mendes","789.654.123-55");
        TelaPrincipal.passagens.add(pg01);
        TelaPrincipal.passagens.add(pg02);
        TelaPrincipal.passagens.add(pg03);
        TelaPrincipal.passagens.add(pg04);
        TelaPrincipal.passagens.add(pg05);
        TelaPrincipal.passagens.add(pg06);
        TelaPrincipal.passagens.add(pg07);
        
        
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPoltrona1;
    private javax.swing.JButton btnPoltrona10;
    private javax.swing.JButton btnPoltrona11;
    private javax.swing.JButton btnPoltrona12;
    private javax.swing.JButton btnPoltrona13;
    private javax.swing.JButton btnPoltrona14;
    private javax.swing.JButton btnPoltrona15;
    private javax.swing.JButton btnPoltrona16;
    private javax.swing.JButton btnPoltrona17;
    private javax.swing.JButton btnPoltrona18;
    private javax.swing.JButton btnPoltrona19;
    private javax.swing.JButton btnPoltrona2;
    private javax.swing.JButton btnPoltrona20;
    private javax.swing.JButton btnPoltrona21;
    private javax.swing.JButton btnPoltrona22;
    private javax.swing.JButton btnPoltrona23;
    private javax.swing.JButton btnPoltrona24;
    private javax.swing.JButton btnPoltrona25;
    private javax.swing.JButton btnPoltrona26;
    private javax.swing.JButton btnPoltrona27;
    private javax.swing.JButton btnPoltrona28;
    private javax.swing.JButton btnPoltrona29;
    private javax.swing.JButton btnPoltrona3;
    private javax.swing.JButton btnPoltrona30;
    private javax.swing.JButton btnPoltrona31;
    private javax.swing.JButton btnPoltrona32;
    private javax.swing.JButton btnPoltrona33;
    private javax.swing.JButton btnPoltrona34;
    private javax.swing.JButton btnPoltrona35;
    private javax.swing.JButton btnPoltrona36;
    private javax.swing.JButton btnPoltrona37;
    private javax.swing.JButton btnPoltrona38;
    private javax.swing.JButton btnPoltrona39;
    private javax.swing.JButton btnPoltrona4;
    private javax.swing.JButton btnPoltrona40;
    private javax.swing.JButton btnPoltrona5;
    private javax.swing.JButton btnPoltrona6;
    private javax.swing.JButton btnPoltrona7;
    private javax.swing.JButton btnPoltrona8;
    private javax.swing.JButton btnPoltrona9;
    private javax.swing.JLabel imgOnibus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar menuBarra1;
    private javax.swing.JMenu menuCidades1;
    private javax.swing.JMenuItem menuCidadesItem1;
    private javax.swing.JMenuItem menuCidadesItem2;
    private javax.swing.JMenu menuPassageiros1;
    private javax.swing.JMenuItem menuPassageirosItem1;
    private javax.swing.JMenuItem menuPassageirosItem2;
    private javax.swing.JMenu menuPassagens1;
    private javax.swing.JMenuItem menuPassagensItem1;
    private javax.swing.JMenuItem menuPassagensItem2;
    private javax.swing.JMenuItem menuPassagensItem3;
    // End of variables declaration//GEN-END:variables
}
