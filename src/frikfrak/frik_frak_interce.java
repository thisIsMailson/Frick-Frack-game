package frikfrak;
 
import java.awt.Color;
import java.awt.Desktop;
import javax.swing.JOptionPane;

public class frik_frak_interce extends javax.swing.JFrame {

    int xx, xy, cont = 0, jogada = 0, vitX = 0, vitO = 0, empt = 0; 

    public frik_frak_interce() {
        initComponents();
            bt01.setEnabled(false);
            bt02.setEnabled(false);
            bt03.setEnabled(false);
            bt04.setEnabled(false);
            bt05.setEnabled(false);
            bt06.setEnabled(false);
            bt07.setEnabled(false);
            bt08.setEnabled(false);
            bt09.setEnabled(false);
            lblInfo.setVisible(false);
    }

    public void vez() {
        if (cont % 2 == 0) {
            lblInfo.setText("É a vez da peça X");
        } else {
            lblInfo.setText("É a vez da peça O");
        }
    }

    /**
     *
     * @return
     */
    public boolean podeColocarPeca() {
        return jogada < 6;
    }

    public boolean ganhou() {
        //Condicoes para ganhar
        if (bt01.getText().equals("X") && bt02.getText().equals("X") && bt03.getText().equals("X")) {
            bt01.setForeground(Color.RED);
            bt02.setForeground(Color.RED);
            bt03.setForeground(Color.RED);
            vitX+=1;
            lblVitX.setText(vitX+"");
            return true;
        } else if (bt01.getText().equals("O") && bt02.getText().equals("O") && bt03.getText().equals("O")) {
            bt01.setForeground(Color.RED);
            bt02.setForeground(Color.RED);
            bt03.setForeground(Color.RED);
            vitO+=1;
            lblVitO.setText(vitO+"");
            return true;
        }
        if (bt04.getText().equals("X") && bt05.getText().equals("X") && bt06.getText().equals("X")) {
            bt04.setForeground(Color.RED);
            bt05.setForeground(Color.RED);
            bt06.setForeground(Color.RED);
            vitX+=1;
            lblVitX.setText(vitX+"");
            return true;
        } else if (bt04.getText().equals("O") && bt05.getText().equals("O") && bt06.getText().equals("O")) {
            bt04.setForeground(Color.RED);
            bt05.setForeground(Color.RED);
            bt06.setForeground(Color.RED);
            vitO+=1;
            lblVitO.setText(vitO+"");
            return true;
        }
        if (bt07.getText().equals("X") && bt08.getText().equals("X") && bt09.getText().equals("X")) {
            bt07.setForeground(Color.RED);
            bt08.setForeground(Color.RED);
            bt09.setForeground(Color.RED);
            vitX+=1;
            lblVitX.setText(vitX+"");
            return true;
        } else if (bt07.getText().equals("O") && bt08.getText().equals("O") && bt09.getText().equals("O")) {
            bt07.setForeground(Color.RED);
            bt08.setForeground(Color.RED);
            bt09.setForeground(Color.RED);
            vitO+=1;
            lblVitO.setText(vitO+"");
            return true;
        }
        if (bt01.getText().equals("X") && bt04.getText().equals("X") && bt07.getText().equals("X")) {
            bt01.setForeground(Color.RED);
            bt04.setForeground(Color.RED);
            bt07.setForeground(Color.RED);
            vitX+=1;
            lblVitX.setText(vitX+"");
            return true;
        } else if (bt01.getText().equals("O") && bt04.getText().equals("O") && bt07.getText().equals("O")) {
            bt01.setForeground(Color.RED);
            bt04.setForeground(Color.RED);
            bt07.setForeground(Color.RED);
            vitO+=1;
            lblVitO.setText(vitO+"");
            return true;
        }
        if (bt02.getText().equals("X") && bt05.getText().equals("X") && bt08.getText().equals("X")) {
            bt02.setForeground(Color.RED);
            bt05.setForeground(Color.RED);
            bt08.setForeground(Color.RED);
            vitX+=1;
            lblVitX.setText(vitX+"");
            return true;
        } else if (bt02.getText().equals("O") && bt05.getText().equals("O") && bt08.getText().equals("O")) {
            bt02.setForeground(Color.RED);
            bt05.setForeground(Color.RED);
            bt08.setForeground(Color.RED);
            vitO+=1;
            lblVitO.setText(vitO+"");
            return true;
        }
        if (bt03.getText().equals("X") && bt06.getText().equals("X") && bt09.getText().equals("X")) {
            bt03.setForeground(Color.RED);
            bt06.setForeground(Color.RED);
            bt09.setForeground(Color.RED);
            vitX+=1;
            lblVitX.setText(vitX+"");
            return true;
        } else if (bt03.getText().equals("O") && bt06.getText().equals("O") && bt09.getText().equals("O")) {
            bt03.setForeground(Color.RED);
            bt06.setForeground(Color.RED);
            bt09.setForeground(Color.RED);
            vitO+=1;
            lblVitO.setText(vitO+"");
            return true;
        }
        if (bt09.getText().equals("X") && bt05.getText().equals("X") && bt01.getText().equals("X")) {
            bt01.setForeground(Color.RED);
            bt05.setForeground(Color.RED);
            bt09.setForeground(Color.RED);
            vitX+=1;
            lblVitX.setText(vitX+"");
            return true;
        } else if (bt01.getText().equals("O") && bt05.getText().equals("O") && bt09.getText().equals("O")) {
            bt01.setForeground(Color.RED);
            bt05.setForeground(Color.RED);
            bt09.setForeground(Color.RED);
            vitO+=1;
            lblVitO.setText(vitO+"");
            return true;
        }
        if (bt07.getText().equals("X") && bt05.getText().equals("X") && bt03.getText().equals("X")) {
            bt07.setForeground(Color.RED);
            bt05.setForeground(Color.RED);
            bt03.setForeground(Color.RED);
            vitX+=1;
            lblVitX.setText(vitX+"");
            return true;
        } else if (bt03.getText().equals("O") && bt05.getText().equals("O") && bt07.getText().equals("O")) {
            bt07.setForeground(Color.RED);
            bt05.setForeground(Color.RED);
            bt03.setForeground(Color.RED);
            vitO+=1;
            lblVitO.setText(vitO+"");
            return true;
        }
        return false;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Separador = new javax.swing.JSplitPane();
        painelBase = new javax.swing.JPanel();
        painelTab = new javax.swing.JPanel();
        bt01 = new javax.swing.JButton();
        bt02 = new javax.swing.JButton();
        bt04 = new javax.swing.JButton();
        bt05 = new javax.swing.JButton();
        bt06 = new javax.swing.JButton();
        bt07 = new javax.swing.JButton();
        bt03 = new javax.swing.JButton();
        bt08 = new javax.swing.JButton();
        bt09 = new javax.swing.JButton();
        PainelInfo = new javax.swing.JPanel();
        lblInfo = new javax.swing.JLabel();
        painelInfoJgo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        lblEmpate = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblVitO = new javax.swing.JLabel();
        lblVitX = new javax.swing.JLabel();
        btNovoJogo = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btSairJogo = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        painelCabeçalho = new javax.swing.JPanel();
        btCLose = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btMin = new javax.swing.JLabel();
        lblNomeJogo = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btSobre = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        painelBase.setBackground(new java.awt.Color(153, 153, 153));
        painelBase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 5));
        painelBase.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                painelBaseMouseDragged(evt);
            }
        });
        painelBase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                painelBaseMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                painelBaseMouseReleased(evt);
            }
        });
        painelBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelTab.setBackground(new java.awt.Color(204, 204, 204));
        painelTab.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

        bt01.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt01.setForeground(new java.awt.Color(0, 102, 204));
        bt01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt01MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt01MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bt01MouseReleased(evt);
            }
        });
        bt01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt01ActionPerformed(evt);
            }
        });

        bt02.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt02.setForeground(new java.awt.Color(0, 102, 204));
        bt02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bt02MouseReleased(evt);
            }
        });
        bt02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt02ActionPerformed(evt);
            }
        });

        bt04.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt04.setForeground(new java.awt.Color(0, 102, 204));
        bt04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bt04MouseReleased(evt);
            }
        });
        bt04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt04ActionPerformed(evt);
            }
        });

        bt05.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt05.setForeground(new java.awt.Color(0, 102, 204));
        bt05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bt05MouseReleased(evt);
            }
        });
        bt05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt05ActionPerformed(evt);
            }
        });

        bt06.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt06.setForeground(new java.awt.Color(0, 102, 204));
        bt06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bt06MouseReleased(evt);
            }
        });
        bt06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt06ActionPerformed(evt);
            }
        });

        bt07.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt07.setForeground(new java.awt.Color(0, 102, 204));
        bt07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bt07MouseReleased(evt);
            }
        });
        bt07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt07ActionPerformed(evt);
            }
        });

        bt03.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt03.setForeground(new java.awt.Color(0, 102, 204));
        bt03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bt03MouseReleased(evt);
            }
        });
        bt03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt03ActionPerformed(evt);
            }
        });

        bt08.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt08.setForeground(new java.awt.Color(0, 102, 204));
        bt08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bt08MouseReleased(evt);
            }
        });
        bt08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt08ActionPerformed(evt);
            }
        });

        bt09.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt09.setForeground(new java.awt.Color(0, 102, 204));
        bt09.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bt09MouseReleased(evt);
            }
        });
        bt09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt09ActionPerformed(evt);
            }
        });

        PainelInfo.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout PainelInfoLayout = new javax.swing.GroupLayout(PainelInfo);
        PainelInfo.setLayout(PainelInfoLayout);
        PainelInfoLayout.setHorizontalGroup(
            PainelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        PainelInfoLayout.setVerticalGroup(
            PainelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout painelTabLayout = new javax.swing.GroupLayout(painelTab);
        painelTab.setLayout(painelTabLayout);
        painelTabLayout.setHorizontalGroup(
            painelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(painelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PainelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelTabLayout.createSequentialGroup()
                        .addGroup(painelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt04, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt01, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt07, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelTabLayout.createSequentialGroup()
                                .addComponent(bt08, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt09, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelTabLayout.createSequentialGroup()
                                .addComponent(bt05, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt06, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelTabLayout.createSequentialGroup()
                                .addComponent(bt02, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt03, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        painelTabLayout.setVerticalGroup(
            painelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(painelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt02, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt03, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt01, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(painelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt05, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt04, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt06, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt07, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt09, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt08, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PainelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        painelBase.add(painelTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 330, 340));

        painelInfoJgo.setBackground(new java.awt.Color(204, 204, 204));
        painelInfoJgo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Informação do jogo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Jogador 1:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Número Vitórias:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Número Vitórias:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Jogador 2:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Número de Empates:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Símbolo O");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Símbolo X");

        lblVitO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        lblVitX.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout painelInfoJgoLayout = new javax.swing.GroupLayout(painelInfoJgo);
        painelInfoJgo.setLayout(painelInfoJgoLayout);
        painelInfoJgoLayout.setHorizontalGroup(
            painelInfoJgoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInfoJgoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelInfoJgoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addGroup(painelInfoJgoLayout.createSequentialGroup()
                        .addGroup(painelInfoJgoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelInfoJgoLayout.createSequentialGroup()
                                .addGroup(painelInfoJgoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(painelInfoJgoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelInfoJgoLayout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(lblVitX))
                                    .addGroup(painelInfoJgoLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7))))
                            .addGroup(painelInfoJgoLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblEmpate))
                            .addGroup(painelInfoJgoLayout.createSequentialGroup()
                                .addGroup(painelInfoJgoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(painelInfoJgoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(lblVitO))))
                        .addGap(0, 43, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelInfoJgoLayout.setVerticalGroup(
            painelInfoJgoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInfoJgoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelInfoJgoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(painelInfoJgoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblVitX))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelInfoJgoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(painelInfoJgoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblVitO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelInfoJgoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblEmpate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelBase.add(painelInfoJgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 240, -1));

        btNovoJogo.setBackground(new java.awt.Color(102, 102, 102));
        btNovoJogo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), java.awt.Color.gray, new java.awt.Color(255, 255, 255), java.awt.Color.gray));
        btNovoJogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btNovoJogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btNovoJogoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btNovoJogoMousePressed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("NOVO JOGO");

        javax.swing.GroupLayout btNovoJogoLayout = new javax.swing.GroupLayout(btNovoJogo);
        btNovoJogo.setLayout(btNovoJogoLayout);
        btNovoJogoLayout.setHorizontalGroup(
            btNovoJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btNovoJogoLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(44, 44, 44)
                .addComponent(jLabel9)
                .addGap(0, 46, Short.MAX_VALUE))
        );
        btNovoJogoLayout.setVerticalGroup(
            btNovoJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btNovoJogoLayout.createSequentialGroup()
                .addGroup(btNovoJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(btNovoJogoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)))
                .addContainerGap())
        );

        painelBase.add(btNovoJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 180, 40));

        btSairJogo.setBackground(new java.awt.Color(102, 102, 102));
        btSairJogo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), java.awt.Color.gray, new java.awt.Color(255, 255, 255), java.awt.Color.gray));
        btSairJogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSairJogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSairJogoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btSairJogoMousePressed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("SAIR DO JOGO");

        javax.swing.GroupLayout btSairJogoLayout = new javax.swing.GroupLayout(btSairJogo);
        btSairJogo.setLayout(btSairJogoLayout);
        btSairJogoLayout.setHorizontalGroup(
            btSairJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btSairJogoLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(35, 35, 35))
        );
        btSairJogoLayout.setVerticalGroup(
            btSairJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btSairJogoLayout.createSequentialGroup()
                .addGroup(btSairJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(btSairJogoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)))
                .addContainerGap())
        );

        painelBase.add(btSairJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 180, 40));

        painelCabeçalho.setBackground(new java.awt.Color(51, 51, 51));
        painelCabeçalho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        btCLose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close-window-32.png"))); // NOI18N
        btCLose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCLose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCLoseMouseClicked(evt);
            }
        });

        btMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/minimize-window-32.png"))); // NOI18N
        btMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btMinMouseClicked(evt);
            }
        });

        lblNomeJogo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNomeJogo.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeJogo.setText("FrickFrack");
        lblNomeJogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNomeJogoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelCabeçalhoLayout = new javax.swing.GroupLayout(painelCabeçalho);
        painelCabeçalho.setLayout(painelCabeçalhoLayout);
        painelCabeçalhoLayout.setHorizontalGroup(
            painelCabeçalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCabeçalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCabeçalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator3)
                    .addComponent(lblNomeJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 361, Short.MAX_VALUE)
                .addComponent(btMin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCLose)
                .addContainerGap())
        );
        painelCabeçalhoLayout.setVerticalGroup(
            painelCabeçalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCabeçalhoLayout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addGroup(painelCabeçalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCabeçalhoLayout.createSequentialGroup()
                        .addComponent(btCLose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5))
                    .addGroup(painelCabeçalhoLayout.createSequentialGroup()
                        .addGroup(painelCabeçalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNomeJogo)
                            .addComponent(btMin, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        painelBase.add(painelCabeçalho, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 580, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("© MAILSON_VARELA ");
        painelBase.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, -1, 20));

        btSobre.setBackground(new java.awt.Color(102, 102, 102));
        btSobre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), java.awt.Color.gray, new java.awt.Color(255, 255, 255), java.awt.Color.gray));
        btSobre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSobreMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btSobreMousePressed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("SOBRE");

        javax.swing.GroupLayout btSobreLayout = new javax.swing.GroupLayout(btSobre);
        btSobre.setLayout(btSobreLayout);
        btSobreLayout.setHorizontalGroup(
            btSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btSobreLayout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(64, 64, 64)
                .addComponent(jLabel14)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        btSobreLayout.setVerticalGroup(
            btSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btSobreLayout.createSequentialGroup()
                .addGroup(btSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(btSobreLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)))
                .addContainerGap())
        );

        painelBase.add(btSobre, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 180, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBase, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBase, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void painelBaseMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBaseMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_painelBaseMouseDragged

    private void painelBaseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBaseMousePressed
        setOpacity((float) 0.7);
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_painelBaseMousePressed

    private void painelBaseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBaseMouseReleased
        setOpacity((float) 1.0);
    }//GEN-LAST:event_painelBaseMouseReleased

    private void bt01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt01ActionPerformed
        if (podeColocarPeca()) {
            if (!bt01.getText().equals("")) {
                lblInfo.setText("Jogada inválida");
            } else if (bt01.getText().equals("")) {
                if (cont % 2 == 0) {
                    bt01.setText("X");
                    cont += 1;
                    jogada += 1;
                } else if (cont % 2 != 0) {
                    bt01.setText("O");
                    cont += 1;
                    jogada += 1;
                }
            }
        } else {
            lblInfo.setText("Sem pecas");
            if (cont % 2 == 0 && bt01.getText().equals("X")) {
                bt01.setText("");
                jogada -= 1;
            } else if (cont % 2 != 0 && bt01.getText().equals("O")) {
                bt01.setText("");
                jogada -= 1;
            }
        }

    }//GEN-LAST:event_bt01ActionPerformed

    private void bt02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt02ActionPerformed
        if (podeColocarPeca()) {
            if (!"".equals(bt02.getText())) {
                lblInfo.setText("Jogada inválida");
            } else if (bt02.getText().equals("")) {
                if (cont % 2 == 0) {
                    bt02.setText("X");
                    cont += 1;
                    jogada += 1;
                } else if (cont % 2 != 0) {
                    bt02.setText("O");
                    cont += 1;
                    jogada += 1;
                }
            }
        } else {
            lblInfo.setText("Sem pecas");
            if (cont % 2 == 0 && bt02.getText().equals("X")) {
                bt02.setText("");
                jogada -= 1;
            } else if (cont % 2 != 0 && bt02.getText().equals("O")) {
                bt02.setText("");
                jogada -= 1;
            }
        }
    }//GEN-LAST:event_bt02ActionPerformed

    private void bt04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt04ActionPerformed
        if (podeColocarPeca()) {
            if (!"".equals(bt04.getText())) {
                lblInfo.setText("Jogada inválida");
            } else if (bt04.getText().equals("")) {
                if (cont % 2 == 0) {
                    bt04.setText("X");
                    cont += 1;
                    jogada += 1;
                } else if (cont % 2 != 0) {
                    bt04.setText("O");
                    cont += 1;
                    jogada += 1;
                }
            }
        } else {
            lblInfo.setText("Sem pecas");
            if (cont % 2 == 0 && bt04.getText().equals("X")) {
                bt04.setText("");
                jogada -= 1;
            } else if (cont % 2 != 0 && bt04.getText().equals("O")) {
                bt04.setText("");
                jogada -= 1;
            }
        }
    }//GEN-LAST:event_bt04ActionPerformed

    private void bt05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt05ActionPerformed
        if (podeColocarPeca()) {
            if (!"".equals(bt05.getText())) {
                lblInfo.setText("Jogada inválida");
            } else if (bt05.getText().equals("")) {
                if (cont % 2 == 0) {
                    bt05.setText("X");
                    cont += 1;
                    jogada += 1;
                } else if (cont % 2 != 0) {
                    bt05.setText("O");
                    cont += 1;
                    jogada += 1;
                }
            }
        } else {
            lblInfo.setText("Sem pecas");
            if (cont % 2 == 0 && bt05.getText().equals("X")) {
                bt05.setText("");
                jogada -= 1;
            } else if (cont % 2 != 0 && bt05.getText().equals("O")) {
                bt05.setText("");
                jogada -= 1;
            }
        }
    }//GEN-LAST:event_bt05ActionPerformed

    private void bt06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt06ActionPerformed
        if (podeColocarPeca()) {
            if (!"".equals(bt06.getText())) {
                lblInfo.setText("Jogada inválida");
            } else if (bt06.getText().equals("")) {
                if (cont % 2 == 0) {
                    bt06.setText("X");
                    cont += 1;
                    jogada += 1;
                } else if (cont % 2 != 0) {
                    bt06.setText("O");
                    cont += 1;
                    jogada += 1;
                }
            }
        } else {
            lblInfo.setText("Sem pecas");
            if (cont % 2 == 0 && bt06.getText().equals("X")) {
                bt06.setText("");
                jogada -= 1;
            } else if (cont % 2 != 0 && bt06.getText().equals("O")) {
                bt06.setText("");
                jogada -= 1;
            }
        }
    }//GEN-LAST:event_bt06ActionPerformed

    private void bt07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt07ActionPerformed
        if (podeColocarPeca()) {
            if (!"".equals(bt07.getText())) {
                lblInfo.setText("Jogada inválida");
            } else if (bt07.getText().equals("")) {
                if (cont % 2 == 0) {
                    bt07.setText("X");
                    cont += 1;
                    jogada += 1;
                } else if (cont % 2 != 0) {
                    bt07.setText("O");
                    cont += 1;
                    jogada += 1;
                }
            }
        } else {
            lblInfo.setText("Sem pecas");
            if (cont % 2 == 0 && bt07.getText().equals("X")) {
                bt07.setText("");
                jogada -= 1;
            } else if (cont % 2 != 0 && bt07.getText().equals("O")) {
                bt07.setText("");
                jogada -= 1;
            }
        }
    }//GEN-LAST:event_bt07ActionPerformed

    private void bt03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt03ActionPerformed
        if (podeColocarPeca()) {
            if (!"".equals(bt03.getText())) {
                lblInfo.setText("Jogada inválida");
            } else if (bt03.getText().equals("")) {
                if (cont % 2 == 0) {
                    bt03.setText("X");
                    cont += 1;
                    jogada += 1;
                } else if (cont % 2 != 0) {
                    bt03.setText("O");
                    cont += 1;
                    jogada += 1;
                }
            }
        } else {
            lblInfo.setText("Sem pecas");
            if (cont % 2 == 0 && bt03.getText().equals("X")) {
                bt03.setText("");
                jogada -= 1;
            } else if (cont % 2 != 0 && bt03.getText().equals("O")) {
                bt03.setText("");
                jogada -= 1;
            }
        }
    }//GEN-LAST:event_bt03ActionPerformed

    private void bt08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt08ActionPerformed
        if (podeColocarPeca()) {
            if (!"".equals(bt08.getText())) {
                lblInfo.setText("Jogada inválida");
            } else if (bt08.getText().equals("")) {
                if (cont % 2 == 0) {
                    bt08.setText("X");
                    cont += 1;
                    jogada += 1;
                } else if (cont % 2 != 0) {
                    bt08.setText("O");
                    cont += 1;
                    jogada += 1;
                }
            }
        } else {
            lblInfo.setText("Sem pecas");
            if (cont % 2 == 0 && bt08.getText().equals("X")) {
                bt08.setText("");
                jogada -= 1;
            } else if (cont % 2 != 0 && bt08.getText().equals("O")) {
                bt08.setText("");
                jogada -= 1;
            }
        }
    }//GEN-LAST:event_bt08ActionPerformed

    private void bt09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt09ActionPerformed
        if (podeColocarPeca()) {
            if (!"".equals(bt09.getText())) {
                lblInfo.setText("Jogada inválida");
            } else if (bt09.getText().equals("")) {
                if (cont % 2 == 0) {
                    bt09.setText("X");
                    cont += 1;
                    jogada += 1;
                } else if (cont % 2 != 0) {
                    bt09.setText("O");
                    cont += 1;
                    jogada += 1;
                }
            }
        } else {
            lblInfo.setText("Sem pecas");
            if (cont % 2 == 0 && bt09.getText().equals("X")) {
                bt09.setText("");
                jogada -= 1;
            } else if (cont % 2 != 0 && bt09.getText().equals("O")) {
                bt09.setText("");
                jogada -= 1;
            }
        }
    }//GEN-LAST:event_bt09ActionPerformed

    private void bt03MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt03MouseReleased
        if (ganhou()) {
            lblInfo.setText("O jogador " + bt03.getText() + " ganhou!");
            bt01.setEnabled(false);
            bt02.setEnabled(false);
            bt03.setEnabled(false);
            bt04.setEnabled(false);
            bt05.setEnabled(false);
            bt06.setEnabled(false);
            bt07.setEnabled(false);
            bt08.setEnabled(false);
            bt09.setEnabled(false);
        }
        if (podeColocarPeca()) {
            vez();
        }
    }//GEN-LAST:event_bt03MouseReleased

    private void bt06MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt06MouseReleased
        if (ganhou()) {
            lblInfo.setText("O jogador " + bt06.getText() + " ganhou!");
            bt01.setEnabled(false);
            bt02.setEnabled(false);
            bt03.setEnabled(false);
            bt04.setEnabled(false);
            bt05.setEnabled(false);
            bt06.setEnabled(false);
            bt07.setEnabled(false);
            bt08.setEnabled(false);
            bt09.setEnabled(false);
        }
        if (podeColocarPeca()) {
            vez();
        }
    }//GEN-LAST:event_bt06MouseReleased

    private void bt01MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt01MouseReleased
        if (ganhou()) {
            lblInfo.setText("O jogador " + bt01.getText() + " ganhou!");
            bt01.setEnabled(false);
            bt02.setEnabled(false);
            bt03.setEnabled(false);
            bt04.setEnabled(false);
            bt05.setEnabled(false);
            bt06.setEnabled(false);
            bt07.setEnabled(false);
            bt08.setEnabled(false);
            bt09.setEnabled(false);
        }
        if (podeColocarPeca()) {
            vez();
        }
    }//GEN-LAST:event_bt01MouseReleased

    private void bt02MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt02MouseReleased
        if (ganhou()) {
            lblInfo.setText("O jogador " + bt02.getText() + " ganhou!");
            bt01.setEnabled(false);
            bt02.setEnabled(false);
            bt03.setEnabled(false);
            bt04.setEnabled(false);
            bt05.setEnabled(false);
            bt06.setEnabled(false);
            bt07.setEnabled(false);
            bt08.setEnabled(false);
            bt09.setEnabled(false);
        }
        if (podeColocarPeca()) {
            vez();
        }
    }//GEN-LAST:event_bt02MouseReleased

    private void bt04MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt04MouseReleased
        if (ganhou()) {
            lblInfo.setText("O jogador " + bt04.getText() + " ganhou!");
            bt01.setEnabled(false);
            bt02.setEnabled(false);
            bt03.setEnabled(false);
            bt04.setEnabled(false);
            bt05.setEnabled(false);
            bt06.setEnabled(false);
            bt07.setEnabled(false);
            bt08.setEnabled(false);
            bt09.setEnabled(false);
        }
        if (podeColocarPeca()) {
            vez();
        }
    }//GEN-LAST:event_bt04MouseReleased

    private void bt05MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt05MouseReleased
        if (ganhou()) {
            lblInfo.setText("O jogador " + bt05.getText() + " ganhou!");
            bt01.setEnabled(false);
            bt02.setEnabled(false);
            bt03.setEnabled(false);
            bt04.setEnabled(false);
            bt05.setEnabled(false);
            bt06.setEnabled(false);
            bt07.setEnabled(false);
            bt08.setEnabled(false);
            bt09.setEnabled(false);
        }
        if (podeColocarPeca()) {
            vez();
        }
    }//GEN-LAST:event_bt05MouseReleased

    private void bt07MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt07MouseReleased
        if (ganhou()) {
            lblInfo.setText("O jogador " + bt07.getText() + " ganhou!");
            bt01.setEnabled(false);
            bt02.setEnabled(false);
            bt03.setEnabled(false);
            bt04.setEnabled(false);
            bt05.setEnabled(false);
            bt06.setEnabled(false);
            bt07.setEnabled(false);
            bt08.setEnabled(false);
            bt09.setEnabled(false);
        }
        if (podeColocarPeca()) {
            vez();
        }
    }//GEN-LAST:event_bt07MouseReleased

    private void bt08MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt08MouseReleased
        if (ganhou()) {
            lblInfo.setText("O jogador " + bt08.getText() + " ganhou!");
            bt01.setEnabled(false);
            bt02.setEnabled(false);
            bt03.setEnabled(false);
            bt04.setEnabled(false);
            bt05.setEnabled(false);
            bt06.setEnabled(false);
            bt07.setEnabled(false);
            bt08.setEnabled(false);
            bt09.setEnabled(false);
        }
        if (podeColocarPeca()) {
            vez();
        }
    }//GEN-LAST:event_bt08MouseReleased

    private void bt09MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt09MouseReleased
        if (ganhou()) {
            lblInfo.setText("O jogador " + bt09.getText() + " ganhou!");
            bt01.setEnabled(false);
            bt02.setEnabled(false);
            bt03.setEnabled(false);
            bt04.setEnabled(false);
            bt05.setEnabled(false);
            bt06.setEnabled(false);
            bt07.setEnabled(false);
            bt08.setEnabled(false);
            bt09.setEnabled(false);
        }
        if (podeColocarPeca()) {
            vez();
        }
    }//GEN-LAST:event_bt09MouseReleased

    private void bt01MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt01MouseExited

    }//GEN-LAST:event_bt01MouseExited

    private void bt01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt01MouseClicked

    }//GEN-LAST:event_bt01MouseClicked

    private void btNovoJogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNovoJogoMouseClicked
            bt01.setEnabled(true);
            bt02.setEnabled(true);
            bt03.setEnabled(true);
            bt04.setEnabled(true);
            bt05.setEnabled(true);
            bt06.setEnabled(true);
            bt07.setEnabled(true);
            bt08.setEnabled(true);
            bt09.setEnabled(true);
            
            lblInfo.setVisible(true);            
            
            bt01.setText("");
            bt02.setText("");
            bt03.setText("");
            bt04.setText("");
            bt05.setText("");
            bt06.setText("");
            bt07.setText("");
            bt08.setText("");
            bt09.setText("");
            cont   = 0;
            jogada = 0;
            
            if(!ganhou() && cont!=0){
                empt += 1;
                lblEmpate.setText(empt+"");
            }
            bt01.setForeground(Color.BLUE);
            bt02.setForeground(Color.BLUE);
            bt03.setForeground(Color.BLUE);
            bt04.setForeground(Color.BLUE);
            bt05.setForeground(Color.BLUE);
            bt06.setForeground(Color.BLUE);
            bt07.setForeground(Color.BLUE);
            bt08.setForeground(Color.BLUE);
            bt09.setForeground(Color.BLUE);
            vez();
    }//GEN-LAST:event_btNovoJogoMouseClicked

    private void btNovoJogoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNovoJogoMousePressed
        
    }//GEN-LAST:event_btNovoJogoMousePressed

    private void btSairJogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairJogoMouseClicked
        Object[] options = {"Não", "Sim"};
        int opcao = 0;
        if (opcao == 0 || opcao == -1) {
            opcao = JOptionPane.showOptionDialog(null, "Tens a certeza?", "                                     SAIR", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);

        }
        if (opcao == 1) {
            System.exit(0);            
        }
    }//GEN-LAST:event_btSairJogoMouseClicked

    private void btSairJogoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairJogoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSairJogoMousePressed

    private void btCLoseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCLoseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btCLoseMouseClicked

    private void btMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMinMouseClicked
        this.setState(frik_frak_interce.ICONIFIED);
    }//GEN-LAST:event_btMinMouseClicked

    private void lblNomeJogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNomeJogoMouseClicked
    }//GEN-LAST:event_lblNomeJogoMouseClicked

    private void btSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSobreMouseClicked
        try {
            Desktop.getDesktop().open(new java.io.File("File/info_frik_frak.txt"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btSobreMouseClicked

    private void btSobreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSobreMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSobreMousePressed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frik_frak_interce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frik_frak_interce().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelInfo;
    private javax.swing.JSplitPane Separador;
    private javax.swing.JButton bt01;
    private javax.swing.JButton bt02;
    private javax.swing.JButton bt03;
    private javax.swing.JButton bt04;
    private javax.swing.JButton bt05;
    private javax.swing.JButton bt06;
    private javax.swing.JButton bt07;
    private javax.swing.JButton bt08;
    private javax.swing.JButton bt09;
    private javax.swing.JLabel btCLose;
    private javax.swing.JLabel btMin;
    private javax.swing.JPanel btNovoJogo;
    private javax.swing.JPanel btSairJogo;
    private javax.swing.JPanel btSobre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblEmpate;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblNomeJogo;
    private javax.swing.JLabel lblVitO;
    private javax.swing.JLabel lblVitX;
    private javax.swing.JPanel painelBase;
    private javax.swing.JPanel painelCabeçalho;
    private javax.swing.JPanel painelInfoJgo;
    private javax.swing.JPanel painelTab;
    // End of variables declaration//GEN-END:variables
}
