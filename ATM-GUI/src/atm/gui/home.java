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
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        b4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        b7 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Soria", 1, 18)); // NOI18N
        jLabel2.setText("International Bank");

        b4.setText(">");

        jLabel9.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabel9.setText("TRANSFER");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Soria", 0, 18)); // NOI18N
        jLabel1.setText("what would you like to do?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 50, 200, 60);

        jLabel3.setFont(new java.awt.Font("Soria", 1, 18)); // NOI18N
        jLabel3.setText("Dear Customer,");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 0, 150, 60);

        jLabel4.setFont(new java.awt.Font("Soria", 1, 18)); // NOI18N
        jLabel4.setText("International Bank");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(290, 260, 150, 40);

        b2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b2.setText(">");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(360, 110, 60, 30);

        b3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b3.setText(">");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(360, 180, 60, 30);

        b5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b5.setText("<");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5);
        b5.setBounds(10, 120, 60, 30);

        b6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b6.setText("<");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6);
        b6.setBounds(10, 180, 60, 30);

        jLabel5.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabel5.setText("HELP");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 230, 50, 30);

        jLabel6.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabel6.setText("WIDRAWAL");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(280, 110, 70, 30);

        jLabel7.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabel7.setText("BALANCE INFO");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(80, 120, 110, 30);

        jLabel8.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabel8.setText("TRANSFER");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(280, 180, 70, 30);

        b7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b7.setText("?");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7);
        b7.setBounds(210, 230, 60, 30);

        jLabel10.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabel10.setText("DEPOSIT");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(80, 180, 70, 30);

        setSize(new java.awt.Dimension(458, 336));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        widrawal wid = new widrawal();
            dispose();
        wid.setVisible(true);
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        transfer fer = new transfer();
            dispose();
        fer.setVisible(true);
    }//GEN-LAST:event_b3ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        balance ce = new balance();
            dispose();
        ce.setVisible(true);
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
       deposit fer = new deposit();
            dispose();
        fer.setVisible(true);
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        JOptionPane.showMessageDialog(null,"How to utilize\n[1] Input the right PIN\n[2] Do transaction correctly as your choice\n[3] Spend money wisely\n ","INFO",1);
    }//GEN-LAST:event_b7ActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
