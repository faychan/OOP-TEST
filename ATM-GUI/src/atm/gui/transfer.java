/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.gui;

import javax.swing.JOptionPane;

/**
 *
 * @author Faychan
 */
public class transfer extends javax.swing.JFrame {
    public int mo = new balance().mo; 
    String in,un;
    /**
     * Creates new form transfer
     */
    public transfer() {
        initComponents();
        in = "";
        un = "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        b6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        bok = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel3.setText("Rek Account");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(240, 50, 150, 60);

        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });
        getContentPane().add(tf1);
        tf1.setBounds(310, 100, 280, 40);

        b6.setText("<");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6);
        b6.setBounds(20, 110, 40, 30);

        jLabel8.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabel8.setText("Back");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(80, 110, 110, 30);

        jLabel4.setFont(new java.awt.Font("Soria", 1, 18)); // NOI18N
        jLabel4.setText("TRANSFER");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(370, -10, 150, 60);

        tf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf2ActionPerformed(evt);
            }
        });
        getContentPane().add(tf2);
        tf2.setBounds(310, 200, 280, 40);

        jLabel5.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel5.setText("Amount of Transfer");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(220, 150, 180, 60);

        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(340, 260, 60, 50);

        b3.setText("2");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(410, 260, 60, 50);

        b4.setText("3");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4);
        b4.setBounds(480, 260, 60, 50);

        b7.setText("6");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7);
        b7.setBounds(480, 320, 60, 50);

        b8.setText("5");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8);
        b8.setBounds(410, 320, 60, 50);

        b9.setText("4");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        getContentPane().add(b9);
        b9.setBounds(340, 320, 60, 50);

        b10.setText("7");
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        getContentPane().add(b10);
        b10.setBounds(340, 380, 60, 50);

        b11.setText("8");
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });
        getContentPane().add(b11);
        b11.setBounds(410, 380, 60, 50);

        b12.setText("9");
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });
        getContentPane().add(b12);
        b12.setBounds(480, 380, 60, 50);

        bok.setText("OK");
        bok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bokActionPerformed(evt);
            }
        });
        getContentPane().add(bok);
        bok.setBounds(480, 440, 60, 50);

        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });
        getContentPane().add(b0);
        b0.setBounds(410, 440, 60, 50);

        bc.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        bc.setText("RESET");
        bc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcActionPerformed(evt);
            }
        });
        getContentPane().add(bc);
        bc.setBounds(340, 440, 60, 50);

        setSize(new java.awt.Dimension(654, 559));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void tf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
       if(in.length() < 8 ){
            in += "1";
            tf1.setText(in);
        } else {
            un += "1";
            tf2.setText(un);
        }
        
    }//GEN-LAST:event_b1ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        
        if(in.length() < 8 ){
            in += "2";
            tf1.setText(in);
        } else {
            un += "3";
            tf2.setText(un);
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        if(in.length() < 8 ){
            in += "3";
            tf1.setText(in);
        } else {
            un += "3";
            tf2.setText(un);
        }
    }//GEN-LAST:event_b4ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
       if(in.length() < 8 ){
            in += "6";
            tf1.setText(in);
        } else {
            un += "6";
            tf2.setText(un);
        }
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        if(in.length() < 8 ){
            in += "5";
            tf1.setText(in);
        } else {
            un += "5";
            tf2.setText(un);
        }
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        if(in.length() < 8 ){
            in += "4";
            tf1.setText(in);
        } else {
            un += "4";
            tf2.setText(un);
        }
    }//GEN-LAST:event_b9ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        if(in.length() < 8 ){
            in += "7"; 
            tf1.setText(in);
        } else {
            un += "7";
            tf2.setText(un);
        }
    }//GEN-LAST:event_b10ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        if(in.length() < 8 ){
            in += "8";
            tf1.setText(in);
        } else {
            un += "8";
            tf2.setText(un);
        }
    }//GEN-LAST:event_b11ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        if(in.length() < 8 ){
            in += "9";
            tf1.setText(in);
        } else {
            un += "9";
            tf2.setText(un);
        }
    }//GEN-LAST:event_b12ActionPerformed

    private void bokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bokActionPerformed
        int t; String r;
        r = tf1.getText();
        t = Integer.parseInt(tf2.getText());
        
        if(t>mo)
                JOptionPane.showMessageDialog(null, 
                    "Balance amount is not enough\n"
                            + "please deposit",
                    "Transaction Failed",0);
        else {
                mo = mo-t; 
                new balance().mo = this.mo;
                JOptionPane.showMessageDialog(null, "Transferred to "+r+" with the amount of "+t+"\nBalance Amount Remaining: Rp."+mo);
                if(mo<=100000)
                    JOptionPane.showMessageDialog(null, "Minimum Balance Amount must be Rp100.000,00"+
                            "Do deposit soon to avoid account closure","CAUTION",2);
            }
        
        
//        int t = Integer.parseInt(tf2.getText());
//        int r = Integer.parseInt(tf1.getText());
//
//        if(!(tf1.getText().equals("")&&tf2.getText().equals(""))){
//            
//        
//            if(t>this.mo){
//                JOptionPane.showMessageDialog(null, "Balance amount is not enough\n" + "please deposit", "Transaction Failed",0);
//            }
//            else {
//                this.mo -= t;
//                new balance().mo = this.mo;
//                
//            }
//        } else {
//               JOptionPane.showMessageDialog(null, "Transferred to with the amount of "+t+"\nBalance Amount Remaining: Rp."+mo);
//        }
    }//GEN-LAST:event_bokActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
       
        if(in.length() < 8 ){
             in += "0";
            tf1.setText(in);
        } else {
            un += "0";
            tf2.setText(un);
        }
    }//GEN-LAST:event_b0ActionPerformed

    private void bcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcActionPerformed
        home hm = new home();
        dispose();
        hm.setVisible(true);
    }//GEN-LAST:event_bcActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        this.dispose();
        home hm = new home();
        hm.setVisible(true);
    }//GEN-LAST:event_b6ActionPerformed

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
            java.util.logging.Logger.getLogger(transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transfer().setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bc;
    private javax.swing.JButton bok;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    // End of variables declaration//GEN-END:variables
}
