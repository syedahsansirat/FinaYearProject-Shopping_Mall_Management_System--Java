/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import referencePeople.*;
import shop.*;
import dealsAndPayments.*;
import tenant.*;
import shop.*;
import referencePeople.*;
import adminPanelAndMainFrame.FirstFrame;
import static databaseStuffs.DatabaseMethods.con;
import static databaseStuffs.DatabaseMethods.connectDB;
import static databaseStuffs.DatabaseMethods.resultSet;
import static databaseStuffs.DatabaseMethods.statement;
import deleteInformation.DeleteInformation;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author Sirat
 */
public class DeleteShop extends javax.swing.JFrame {

    String id;

    public DeleteShop() {
        initComponents();
        ImageIcon icon = new ImageIcon("Image/logo.png");
        setIconImage(icon.getImage());
        setTitle("Shopping Mall Management System");
        connectDB();
        try {
            statement = con.createStatement();
            resultSet = statement.executeQuery("select shop_id,room_no from shop");

            while (resultSet.next()) {
                String a0 = resultSet.getString(1);
                String a1 = resultSet.getString(2);
                jComboBox1.addItem("" + a0 + " - " + a1);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        this.setLocationRelativeTo(null);
        warningLabel.setVisible(false);
        yesButton.setVisible(false);
        noButton.setVisible(false);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deleteButton = new javax.swing.JButton();
        enterIdLabel = new javax.swing.JLabel();
        warningLabel = new javax.swing.JLabel();
        yesButton = new javax.swing.JButton();
        noButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        backMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(415, 171));
        getContentPane().setLayout(null);

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton);
        deleteButton.setBounds(317, 20, 80, 30);

        enterIdLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        enterIdLabel.setText("Select ID :");
        getContentPane().add(enterIdLabel);
        enterIdLabel.setBounds(10, 20, 100, 22);

        warningLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        warningLabel.setForeground(new java.awt.Color(255, 0, 0));
        warningLabel.setText("Are You Sure To Delete?");
        getContentPane().add(warningLabel);
        warningLabel.setBounds(120, 10, 291, 17);

        yesButton.setBackground(new java.awt.Color(255, 204, 51));
        yesButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        yesButton.setForeground(new java.awt.Color(255, 0, 0));
        yesButton.setText("Yes");
        yesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(yesButton);
        yesButton.setBounds(90, 70, 80, 25);

        noButton.setBackground(new java.awt.Color(0, 255, 51));
        noButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noButton.setText("No");
        noButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noButtonActionPerformed(evt);
            }
        });
        getContentPane().add(noButton);
        noButton.setBounds(230, 70, 90, 25);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(120, 20, 180, 30);

        backMenu.setText("Back");
        backMenu.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                backMenuMenuSelected(evt);
            }
        });
        jMenuBar1.add(backMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMenuMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_backMenuMenuSelected
        new FirstFrame();
        this.dispose();
    }//GEN-LAST:event_backMenuMenuSelected

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

        String comboText = jComboBox1.getSelectedItem().toString();
        String comboText2[] = comboText.split("-");
        id = comboText2[0].replaceAll("\\D+", "");
        System.out.println("" + id);
        jComboBox1.setVisible(false);
        deleteButton.setVisible(false);
        enterIdLabel.setVisible(false);
        warningLabel.setVisible(true);
        yesButton.setVisible(true);
        noButton.setVisible(true);

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void yesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesButtonActionPerformed
        DeleteInformation ob = new DeleteInformation();
        ob.deleteShop(id);
        JOptionPane.showMessageDialog(this, "Informations Deleted!");
        new FirstFrame();
        this.dispose();

    }//GEN-LAST:event_yesButtonActionPerformed

    private void noButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButtonActionPerformed
        new FirstFrame();
        this.dispose();
    }//GEN-LAST:event_noButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu backMenu;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel enterIdLabel;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton noButton;
    private javax.swing.JLabel warningLabel;
    private javax.swing.JButton yesButton;
    // End of variables declaration//GEN-END:variables
}
