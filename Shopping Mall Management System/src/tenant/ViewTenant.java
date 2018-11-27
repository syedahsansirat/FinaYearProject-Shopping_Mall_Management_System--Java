/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tenant;

import referencePeople.*;
import adminPanelAndMainFrame.FirstFrame;
import static databaseStuffs.DatabaseMethods.con;
import static databaseStuffs.DatabaseMethods.connectDB;
import static databaseStuffs.DatabaseMethods.resultSet;
import static databaseStuffs.DatabaseMethods.statement;
import java.awt.Image;
import java.awt.image.RenderedImage;
import java.io.*;
import static java.lang.Math.random;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Sirat
 */
public class ViewTenant extends javax.swing.JFrame {
    String id = "";
    public ViewTenant(String id) {
        initComponents();
        ImageIcon icon=new ImageIcon("Image/logo.png");
        setIconImage(icon.getImage());
        setTitle("Shopping Mall Management System");
        this.id=id;
        setVisible(true);
        setLocationRelativeTo(null);  
        setInfo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        businessLabel = new javax.swing.JLabel();
        phoneNumberLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        businessInShopTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        nidNumberLabel = new javax.swing.JLabel();
        nidNumberTextField = new javax.swing.JTextField();
        referenceIdLabel = new javax.swing.JLabel();
        referenceIdTextField = new javax.swing.JTextField();
        occipationLabel = new javax.swing.JLabel();
        occupationTextField = new javax.swing.JTextField();
        tenantPhotoLabel = new javax.swing.JLabel();
        refNameTextField = new javax.swing.JTextField();
        nidImageLabel = new javax.swing.JLabel();
        menuBar1 = new javax.swing.JMenuBar();
        homeMenu = new javax.swing.JMenu();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 51));
        setMinimumSize(new java.awt.Dimension(695, 480));
        getContentPane().setLayout(null);

        idLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        idLabel.setText("Tenant ID: ");
        getContentPane().add(idLabel);
        idLabel.setBounds(30, 30, 100, 15);

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nameLabel.setText("Name :");
        getContentPane().add(nameLabel);
        nameLabel.setBounds(30, 70, 80, 15);

        addressLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addressLabel.setText("Address :");
        getContentPane().add(addressLabel);
        addressLabel.setBounds(30, 110, 60, 15);

        businessLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        businessLabel.setText("Business in Shop");
        getContentPane().add(businessLabel);
        businessLabel.setBounds(30, 260, 130, 30);

        phoneNumberLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        phoneNumberLabel.setText("Phone Number");
        getContentPane().add(phoneNumberLabel);
        phoneNumberLabel.setBounds(30, 150, 90, 30);

        emailLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        emailLabel.setText("Email Address :");
        getContentPane().add(emailLabel);
        emailLabel.setBounds(30, 190, 100, 20);

        idTextField.setEditable(false);
        idTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        idTextField.setMaximumSize(new java.awt.Dimension(20, 10));
        idTextField.setName(""); // NOI18N
        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(idTextField);
        idTextField.setBounds(160, 20, 90, 30);

        nameTextField.setEditable(false);
        nameTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        nameTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        getContentPane().add(nameTextField);
        nameTextField.setBounds(160, 60, 220, 30);

        addressTextField.setEditable(false);
        addressTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        addressTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        addressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(addressTextField);
        addressTextField.setBounds(160, 100, 220, 30);

        businessInShopTextField.setEditable(false);
        businessInShopTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        businessInShopTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        getContentPane().add(businessInShopTextField);
        businessInShopTextField.setBounds(160, 260, 220, 30);

        phoneTextField.setEditable(false);
        phoneTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        phoneTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        getContentPane().add(phoneTextField);
        phoneTextField.setBounds(160, 140, 220, 30);

        emailTextField.setEditable(false);
        emailTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        emailTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        getContentPane().add(emailTextField);
        emailTextField.setBounds(160, 180, 220, 30);

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator7.setAlignmentX(1.0F);
        jSeparator7.setAlignmentY(1.0F);
        getContentPane().add(jSeparator7);
        jSeparator7.setBounds(390, 50, 10, 280);

        nidNumberLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nidNumberLabel.setText("NID Number :");
        getContentPane().add(nidNumberLabel);
        nidNumberLabel.setBounds(30, 300, 110, 30);

        nidNumberTextField.setEditable(false);
        nidNumberTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(nidNumberTextField);
        nidNumberTextField.setBounds(160, 300, 220, 30);

        referenceIdLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        referenceIdLabel.setText("Your Reference People ID and Name");
        getContentPane().add(referenceIdLabel);
        referenceIdLabel.setBounds(20, 380, 230, 40);

        referenceIdTextField.setEditable(false);
        referenceIdTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(referenceIdTextField);
        referenceIdTextField.setBounds(270, 380, 100, 30);

        occipationLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        occipationLabel.setText("Occupation");
        getContentPane().add(occipationLabel);
        occipationLabel.setBounds(30, 220, 100, 20);

        occupationTextField.setEditable(false);
        occupationTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        occupationTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        getContentPane().add(occupationTextField);
        occupationTextField.setBounds(160, 220, 220, 30);
        getContentPane().add(tenantPhotoLabel);
        tenantPhotoLabel.setBounds(390, 0, 300, 220);

        refNameTextField.setEditable(false);
        refNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refNameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(refNameTextField);
        refNameTextField.setBounds(380, 380, 300, 30);
        getContentPane().add(nidImageLabel);
        nidImageLabel.setBounds(390, 230, 300, 140);

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
        homeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeMenuActionPerformed(evt);
            }
        });
        menuBar1.add(homeMenu);

        setJMenuBar(menuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
     void setUpImageIcon(String iURL,JLabel label) {
        try {
            File f = new File(iURL);
          
            Image img = ImageIO.read(f);
            ImageIcon ic = new ImageIcon(img);
            label.setIcon(ic);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Image Load Failed");
        }
    }
    void setInfo(){
        
        try {
            
            String name = "";
            String address = "";
            String phone = "";
            String email = "";
            String occupation = "";
            String business = "";
            String nidNumber = "";
            String refid="";
            String refName = "";
            String imageUrl = "";
            String nidimageUrl = "";
            connectDB();
            statement = con.createStatement();
            
            resultSet = statement.executeQuery("select name,address,phone_number,email,occupation,business_in_shop,national_id_number,"
                    + "reference_id,image_url,national_id_pic_url  from tenant where tenant_id="+id);          
            while (resultSet.next()) {
                 name=resultSet.getString(1);
             address=resultSet.getString(2);
             phone=resultSet.getString(3);
             email=resultSet.getString(4);
             occupation=resultSet.getString(5);
             business=resultSet.getString(6);
             nidNumber=resultSet.getString(7);
             refid=resultSet.getString(8);
         
             imageUrl=resultSet.getString(9);
             nidimageUrl=resultSet.getString(10);            
            }
           // System.out.println("select name from reference where reference id = "+refid);
            resultSet = statement.executeQuery("select name from reference where reference_id = "+refid);
            
              while (resultSet.next()) {
                  refName=resultSet.getString(1);
              }
              System.out.println("3");
              idTextField.setText(id);
              nameTextField.setText(name);
              addressTextField.setText(address);
              phoneTextField.setText(phone);
              emailTextField.setText(email);
              occupationTextField.setText(occupation);
              businessInShopTextField.setText(business);
              nidNumberTextField.setText(nidNumber);
              referenceIdTextField.setText(refid);
              refNameTextField.setText(refName);
              setUpImageIcon(imageUrl, tenantPhotoLabel);
              setUpImageIcon(nidimageUrl, nidImageLabel);             
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Wrong");
        }
        
    }
    
    
    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed

    private void homeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeMenuActionPerformed

    private void homeMenuMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_homeMenuMenuSelected
        new FirstFrame();
        dispose();
    }//GEN-LAST:event_homeMenuMenuSelected

    private void addressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTextFieldActionPerformed

    private void refNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refNameTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(AddReference.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddReference.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddReference.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddReference.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        new ViewTenant("3");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JTextField businessInShopTextField;
    private javax.swing.JLabel businessLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JMenu homeMenu;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JMenuBar menuBar1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel nidImageLabel;
    private javax.swing.JLabel nidNumberLabel;
    private javax.swing.JTextField nidNumberTextField;
    private javax.swing.JLabel occipationLabel;
    private javax.swing.JTextField occupationTextField;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JTextField refNameTextField;
    private javax.swing.JLabel referenceIdLabel;
    private javax.swing.JTextField referenceIdTextField;
    private javax.swing.JLabel tenantPhotoLabel;
    // End of variables declaration//GEN-END:variables
}
