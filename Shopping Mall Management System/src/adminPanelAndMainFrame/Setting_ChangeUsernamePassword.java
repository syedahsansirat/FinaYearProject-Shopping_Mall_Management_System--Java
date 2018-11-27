package adminPanelAndMainFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sirat
 */
import databaseStuffs.DatabaseMethods.*;
import static databaseStuffs.DatabaseMethods.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import screenshot.WriteLog;

public class Setting_ChangeUsernamePassword extends javax.swing.JFrame {

    /**
     * Creates new form Setting_ChangeUsernamePassword
     */
    public Setting_ChangeUsernamePassword() {
        initComponents();
        ImageIcon icon=new ImageIcon("Image/logo.png");
        setIconImage(icon.getImage());
        setTitle("Shopping Mall Management System");
        setVisible(true);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        oldUsernameLabel = new javax.swing.JLabel();
        oldPasswordLabel = new javax.swing.JLabel();
        newUsernameLabel = new javax.swing.JLabel();
        newPasswordLabel = new javax.swing.JLabel();
        oldUsernameTextField = new javax.swing.JTextField();
        oldPasswordTextField = new javax.swing.JTextField();
        newUsernameTextField = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();
        newPasswordTextField = new javax.swing.JTextField();
        changeButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        backMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Change UserName And Password");
        setMinimumSize(new java.awt.Dimension(450, 320));
        getContentPane().setLayout(null);

        oldUsernameLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        oldUsernameLabel.setText("Old Username");
        getContentPane().add(oldUsernameLabel);
        oldUsernameLabel.setBounds(61, 40, 88, 17);

        oldPasswordLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        oldPasswordLabel.setText("Old Password");
        getContentPane().add(oldPasswordLabel);
        oldPasswordLabel.setBounds(67, 78, 82, 17);

        newUsernameLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        newUsernameLabel.setText("New Username");
        getContentPane().add(newUsernameLabel);
        newUsernameLabel.setBounds(58, 141, 91, 17);

        newPasswordLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        newPasswordLabel.setText("New Password");
        getContentPane().add(newPasswordLabel);
        newPasswordLabel.setBounds(64, 179, 85, 17);

        oldUsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldUsernameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(oldUsernameTextField);
        oldUsernameTextField.setBounds(230, 39, 97, 20);
        getContentPane().add(oldPasswordTextField);
        oldPasswordTextField.setBounds(230, 77, 97, 20);
        getContentPane().add(newUsernameTextField);
        newUsernameTextField.setBounds(230, 138, 97, 20);

        deleteButton.setBackground(new java.awt.Color(255, 0, 0));
        deleteButton.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 204, 0));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton);
        deleteButton.setBounds(345, 28, 73, 69);
        getContentPane().add(newPasswordTextField);
        newPasswordTextField.setBounds(230, 176, 97, 20);

        changeButton.setBackground(new java.awt.Color(255, 204, 0));
        changeButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        changeButton.setText("Change");
        changeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(changeButton);
        changeButton.setBounds(291, 221, 79, 25);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(34, 108, 293, 10);

        backMenu.setText("Back");
        backMenu.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
                backMenuMenuCanceled(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
                backMenuMenuDeselected(evt);
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                backMenuMenuSelected(evt);
            }
        });
        backMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backMenuActionPerformed(evt);
            }
        });
        jMenuBar1.add(backMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oldUsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldUsernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oldUsernameTextFieldActionPerformed

    private void backMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backMenuActionPerformed

    private void changeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeButtonActionPerformed
        // UPDATE `shopping_mall_database`.`admin` SET `admin_id` = '2', `username` = '2', `password` = '2' WHERE `admin`.`admin_id` = 1
        String oldUserName = oldUsernameTextField.getText();
        String oldPassword = oldPasswordTextField.getText();
        String newUserName = newUsernameTextField.getText();
        String newPassword = newPasswordTextField.getText();

        try {
            connectDB();
            statement = con.createStatement();
            statement.execute("UPDATE `shopping_mall_database`.`admin` SET "
                    + "`username` = '" + newUserName + "', `password` = '" + newPassword + "' "
                    + "WHERE username='" + oldUserName + "' and password = '" + oldPassword + "'");
            new WriteLog("Admin  "+newUserName+" Has Modified.");
            closeDB();

            JOptionPane.showMessageDialog(this, "Admin's Information has Changed");
            FirstFrame FirstFrameObject = new FirstFrame();
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Information is Not Correct!");
            e.printStackTrace();
        }


    }//GEN-LAST:event_changeButtonActionPerformed

    private void backMenuMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_backMenuMenuSelected
        new Setting();
        this.dispose();
    }//GEN-LAST:event_backMenuMenuSelected

    private void backMenuMenuDeselected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_backMenuMenuDeselected
        // TODO add your handling code here:
    }//GEN-LAST:event_backMenuMenuDeselected

    private void backMenuMenuCanceled(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_backMenuMenuCanceled
        // TODO add your handling code here:
    }//GEN-LAST:event_backMenuMenuCanceled

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String oldUserName = oldUsernameTextField.getText();
        String oldPassword = oldPasswordTextField.getText();
        new Setting_DeleteUser(oldUserName, oldPassword);
        this.dispose();
    }//GEN-LAST:event_deleteButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      //  new Setting_ChangeUsernamePassword();
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
            java.util.logging.Logger.getLogger(Setting_ChangeUsernamePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Setting_ChangeUsernamePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Setting_ChangeUsernamePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Setting_ChangeUsernamePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Setting_ChangeUsernamePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu backMenu;
    private javax.swing.JButton changeButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JTextField newPasswordTextField;
    private javax.swing.JLabel newUsernameLabel;
    private javax.swing.JTextField newUsernameTextField;
    private javax.swing.JLabel oldPasswordLabel;
    private javax.swing.JTextField oldPasswordTextField;
    private javax.swing.JLabel oldUsernameLabel;
    private javax.swing.JTextField oldUsernameTextField;
    // End of variables declaration//GEN-END:variables
}
