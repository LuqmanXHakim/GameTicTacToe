/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author ibnua
 */
public class Main extends javax.swing.JFrame {

    private String mulai = "X";
    private int scoreP1 = 0;
    private int scoreP2 = 0;
    
    public Main() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
    }
    
    private void gameScore() {
        p1.setText(String.valueOf(scoreP1));
        p2.setText(String.valueOf(scoreP2));
    }
    
    // pilih pemain
    private void pilihPemain() {
        if (mulai.equalsIgnoreCase("X")) {
            mulai = "O";
        } else {
            mulai = "X";
        }
    }
    
    // pemenang
    private void pemenang() {
        String b1 = btn1.getText();
        String b2 = btn2.getText();
        String b3 = btn3.getText();
        String b4 = btn4.getText();
        String b5 = btn5.getText();
        String b6 = btn6.getText();
        String b7 = btn7.getText();
        String b8 = btn8.getText();
        String b9 = btn9.getText();
        
        // Pemenang X
        // Baris 1
        if (b1 == ("X") && b2 == ("X") && b3 == ("X")) {
            JOptionPane.showMessageDialog(this, "Pemenangnya P1");
            scoreP1++;
            gameScore();
            
            btn1.setBackground(Color.blue);
            btn2.setBackground(Color.blue);
            btn3.setBackground(Color.blue);
            
        }
        // Baris 2
        if (b4 == ("X") && b5 == ("X") && b6 == ("X")) {
            JOptionPane.showMessageDialog(this, "Pemenangnya P1");
            scoreP1++;
            gameScore();
            
            btn4.setBackground(Color.blue);
            btn5.setBackground(Color.blue);
            btn6.setBackground(Color.blue);
            
        }
        // Baris 3
        if (b7 == ("X") && b8 == ("X") && b9 == ("X")) {
            JOptionPane.showMessageDialog(this, "Pemenangnya P1");
            scoreP1++;
            gameScore();
            
            btn7.setBackground(Color.blue);
            btn8.setBackground(Color.blue);
            btn9.setBackground(Color.blue);
            
        }
        // Kolom 1
        if (b1 == ("X") && b4 == ("X") && b7 == ("X")) {
            JOptionPane.showMessageDialog(this, "Pemenangnya P1");
            scoreP1++;
            gameScore();
            
            btn1.setBackground(Color.blue);
            btn4.setBackground(Color.blue);
            btn7.setBackground(Color.blue);
            
        }
        // Kolom 2
        if (b2 == ("X") && b5 == ("X") && b8 == ("X")) {
            JOptionPane.showMessageDialog(this, "Pemenangnya P1");
            scoreP1++;
            gameScore();
            
            btn2.setBackground(Color.blue);
            btn5.setBackground(Color.blue);
            btn8.setBackground(Color.blue);
            
        }
        // Kolom 3
        if (b3 == ("X") && b6 == ("X") && b9 == ("X")) {
            JOptionPane.showMessageDialog(this, "Pemenangnya P1");
            scoreP1++;
            gameScore();
            
            btn3.setBackground(Color.blue);
            btn6.setBackground(Color.blue);
            btn9.setBackground(Color.blue);
            
        }
        // Miring 1
        if (b1 == ("X") && b5 == ("X") && b9 == ("X")) {
            JOptionPane.showMessageDialog(this, "Pemenangnya P1");
            scoreP1++;
            gameScore();
            
            btn1.setBackground(Color.blue);
            btn5.setBackground(Color.blue);
            btn9.setBackground(Color.blue);
            
        }
        // Miring 2
        if (b3 == ("X") && b5 == ("X") && b7 == ("X")) {
            JOptionPane.showMessageDialog(this, "Pemenangnya P1");
            scoreP1++;
            gameScore();
            
            btn3.setBackground(Color.blue);
            btn5.setBackground(Color.blue);
            btn7.setBackground(Color.blue);
            
        }
        
        
        // Pemenang O
        // Baris 1
        if (b1 == ("O") && b2 == ("O") && b3 == ("O")) {
            JOptionPane.showMessageDialog(this, "Pemenangnya P2");
            scoreP2++;
            gameScore();
            
            btn1.setBackground(Color.blue);
            btn2.setBackground(Color.blue);
            btn3.setBackground(Color.blue);
            
        }
        // Baris 2
        if (b4 == ("O") && b5 == ("O") && b6 == ("O")) {
            JOptionPane.showMessageDialog(this, "Pemenangnya P2");
            scoreP2++;
            gameScore();
            
            btn4.setBackground(Color.blue);
            btn5.setBackground(Color.blue);
            btn6.setBackground(Color.blue);
            
        }
        // Baris 3
        if (b7 == ("O") && b8 == ("O") && b9 == ("O")) {
            JOptionPane.showMessageDialog(this, "Pemenangnya P2");
            scoreP2++;
            gameScore();
            
            btn7.setBackground(Color.blue);
            btn8.setBackground(Color.blue);
            btn9.setBackground(Color.blue);
            
        }
        // Kolom 1
        if (b1 == ("O") && b4 == ("O") && b7 == ("O")) {
            JOptionPane.showMessageDialog(this, "Pemenangnya P2");
            scoreP2++;
            gameScore();
            
            btn1.setBackground(Color.blue);
            btn4.setBackground(Color.blue);
            btn7.setBackground(Color.blue);
            
        }
        // Kolom 2
        if (b2 == ("O") && b5 == ("O") && b8 == ("O")) {
            JOptionPane.showMessageDialog(this, "Pemenangnya P2");
            scoreP2++;
            gameScore();
            
            btn2.setBackground(Color.blue);
            btn5.setBackground(Color.blue);
            btn8.setBackground(Color.blue);
            
        }
        // Kolom 3
        if (b3 == ("O") && b6 == ("O") && b9 == ("O")) {
            JOptionPane.showMessageDialog(this, "Pemenangnya P2");
            scoreP2++;
            gameScore();
            
            btn3.setBackground(Color.blue);
            btn6.setBackground(Color.blue);
            btn9.setBackground(Color.blue);
            
        }
        // Miring 1
        if (b1 == ("O") && b5 == ("O") && b9 == ("O")) {
            JOptionPane.showMessageDialog(this, "Pemenangnya P2");
            scoreP2++;
            gameScore();
            
            btn1.setBackground(Color.blue);
            btn5.setBackground(Color.blue);
            btn9.setBackground(Color.blue);
            
        }
        // Miring 2
        if (b3 == ("O") && b5 == ("O") && b7 == ("O")) {
            JOptionPane.showMessageDialog(this, "Pemenangnya P2");
            scoreP2++;
            gameScore();
            
            btn3.setBackground(Color.blue);
            btn5.setBackground(Color.blue);
            btn7.setBackground(Color.blue);
            
        }
        
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        p1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("E41202411");

        btn1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn_reset.setBackground(new java.awt.Color(255, 51, 51));
        btn_reset.setForeground(new java.awt.Color(255, 255, 255));
        btn_reset.setText("RESET");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_exit.setBackground(new java.awt.Color(0, 255, 0));
        btn_exit.setForeground(new java.awt.Color(255, 255, 255));
        btn_exit.setText("EXIT");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        p1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1.setText("0");

        p2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2.setText("0");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("P1");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("P2");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("TIC TAC TOE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_reset, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_exit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p1)
                            .addComponent(p2))
                        .addGap(31, 31, 31)
                        .addComponent(btn_reset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_exit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        System.exit(0);
    }                                        

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        btn1.setText(null);
        btn2.setText(null);
        btn3.setText(null);
        btn4.setText(null);
        btn5.setText(null);
        btn6.setText(null);
        btn7.setText(null);
        btn8.setText(null);
        btn9.setText(null);
        
        btn1.setBackground(Color.LIGHT_GRAY);
        btn2.setBackground(Color.LIGHT_GRAY);
        btn3.setBackground(Color.LIGHT_GRAY);
        btn4.setBackground(Color.LIGHT_GRAY);
        btn5.setBackground(Color.LIGHT_GRAY);
        btn6.setBackground(Color.LIGHT_GRAY);
        btn7.setBackground(Color.LIGHT_GRAY);
        btn8.setBackground(Color.LIGHT_GRAY);
        btn9.setBackground(Color.LIGHT_GRAY);
        
    }                                         

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        btn1.setText(mulai);
        if (mulai.equalsIgnoreCase("X")) {
            btn1.setForeground(Color.blue);
        } else {
            btn1.setForeground(Color.red);
        }
        pilihPemain();
        pemenang();
    }                                    

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        btn2.setText(mulai);
        if (mulai.equalsIgnoreCase("X")) {
            btn2.setForeground(Color.blue);
        } else {
            btn2.setForeground(Color.red);
        }
        pilihPemain();
        pemenang();
    }                                    

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        btn3.setText(mulai);
        if (mulai.equalsIgnoreCase("X")) {
            btn3.setForeground(Color.blue);
        } else {
            btn3.setForeground(Color.red);
        }
        pilihPemain();
        pemenang();
    }                                    

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        btn6.setText(mulai);
        if (mulai.equalsIgnoreCase("X")) {
            btn6.setForeground(Color.blue);
        } else {
            btn6.setForeground(Color.red);
        }
        pilihPemain();
        pemenang();
    }                                    

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        btn4.setText(mulai);
        if (mulai.equalsIgnoreCase("X")) {
            btn4.setForeground(Color.blue);
        } else {
            btn4.setForeground(Color.red);
        }
        pilihPemain();
        pemenang();
    }                                    

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        btn5.setText(mulai);
        if (mulai.equalsIgnoreCase("X")) {
            btn5.setForeground(Color.blue);
        } else {
            btn5.setForeground(Color.red);
        }
        pilihPemain();
        pemenang();
    }                                    

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        btn7.setText(mulai);
        if (mulai.equalsIgnoreCase("X")) {
            btn7.setForeground(Color.blue);
        } else {
            btn7.setForeground(Color.red);
        }
        pilihPemain();
        pemenang();
    }                                    

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        btn8.setText(mulai);
        if (mulai.equalsIgnoreCase("X")) {
            btn8.setForeground(Color.blue);
        } else {
            btn8.setForeground(Color.red);
        }
        pilihPemain();
        pemenang();
    }                                    

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        btn9.setText(mulai);
        if (mulai.equalsIgnoreCase("X")) {
            btn9.setForeground(Color.blue);
        } else {
            btn9.setForeground(Color.red);
        }
        pilihPemain();
        pemenang();
    }                                    

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    // End of variables declaration                   
}
