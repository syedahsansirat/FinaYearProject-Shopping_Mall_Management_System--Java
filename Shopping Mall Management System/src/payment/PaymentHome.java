/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payment;

import adminPanelAndMainFrame.FirstFrame;
import javax.swing.ImageIcon;

/**
 *
 * @author Sirat
 */
public class PaymentHome extends javax.swing.JFrame {

    /**
     * Creates new form PaymentHome
     */
    public PaymentHome() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        ImageIcon icon=new ImageIcon("Image/logo.png");
        setIconImage(icon.getImage());
        setTitle("Shopping Mall Management System");
        setResizable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rentButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        iconLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        homeMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(null);

        rentButton.setText("Pay A Month Rent");
        rentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(rentButton);
        rentButton.setBounds(110, 20, 177, 77);

        viewButton.setText("Shop's Rent History");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });
        getContentPane().add(viewButton);
        viewButton.setBounds(110, 120, 171, 80);

        iconLabel.setIcon(new javax.swing.ImageIcon("D:\\Project 2 Work\\Application\\Shopping Mall Management System\\Image\\pink.GIF")); // NOI18N
        getContentPane().add(iconLabel);
        iconLabel.setBounds(-20, -30, 430, 330);

        homeMenu.setText("Home");
        homeMenu.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                homeMenuMenuSelected(evt);
            }
        });
        jMenuBar1.add(homeMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentButtonActionPerformed
        PayRent ob = new PayRent();
        this.dispose();
    }//GEN-LAST:event_rentButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        new PreViewPayment();
        this.dispose();
    }//GEN-LAST:event_viewButtonActionPerformed

    private void homeMenuMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_homeMenuMenuSelected
        new FirstFrame();
        this.dispose();
    }//GEN-LAST:event_homeMenuMenuSelected

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
            java.util.logging.Logger.getLogger(PaymentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu homeMenu;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton rentButton;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}