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
import screenshot.GetScreenShot;
import screenshot.WriteLog;

/**
 *
 * @author Sirat
 */
public class EditTenant extends javax.swing.JFrame {

    private File selectedFile;
    String imageURL = "";
    String id;
    int gotIdFromDb;
    int num = 0;
    private File selectedFile2;
    private String imageNidURL;

    /**
     * Creates new form AddReference
     */
    public EditTenant( String id) {
        this.id=id;
        initComponents();
        ImageIcon icon=new ImageIcon("Image/logo.png");
        setIconImage(icon.getImage());
        setTitle("Shopping Mall Management System");
        setVisible(true);
        
        setLocationRelativeTo(null);
        setInfo();
        //set up an id
//        try {
//            connectDB();
//            statement = con.createStatement();
//            resultSet = statement.executeQuery("select tenant_id from tenant where tenant_id="+id);
//            while (resultSet.next()) {
//                gotIdFromDb = resultSet.getInt(1);
//            }
//            idTextField.setText(""+gotIdFromDb);
//        } catch (Exception exception) {
//            JOptionPane.showMessageDialog(this, "Can not generate id");
//        }
    }

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
              setUpImageIcon(imageUrl, tenantPhotoLabel);
              this.imageURL=imageUrl;
              this.imageNidURL=nidimageUrl;
                       
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Wrong");
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        headLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        photoLabel = new javax.swing.JLabel();
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
        uploadPhotoButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        nidNumberLabel = new javax.swing.JLabel();
        nidNumberTextField = new javax.swing.JTextField();
        nidPhotoLabel = new javax.swing.JLabel();
        uploadNIDButton = new javax.swing.JButton();
        occipationLabel = new javax.swing.JLabel();
        occupationTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tenantPhotoLabel = new javax.swing.JLabel();
        menuBar1 = new javax.swing.JMenuBar();
        homeMenu = new javax.swing.JMenu();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 51));
        setMinimumSize(new java.awt.Dimension(695, 500));
        getContentPane().setLayout(null);

        headLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        headLabel.setText("Please Fill up the form :");
        getContentPane().add(headLabel);
        headLabel.setBounds(190, 10, 390, 33);

        idLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        idLabel.setText("Tenant ID: ");
        getContentPane().add(idLabel);
        idLabel.setBounds(30, 70, 100, 15);

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nameLabel.setText("Name :");
        getContentPane().add(nameLabel);
        nameLabel.setBounds(30, 110, 80, 15);

        photoLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        photoLabel.setText("Photo :");
        getContentPane().add(photoLabel);
        photoLabel.setBounds(30, 160, 70, 15);

        addressLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addressLabel.setText("Address :");
        getContentPane().add(addressLabel);
        addressLabel.setBounds(30, 200, 60, 15);

        businessLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        businessLabel.setText("Business in Shop");
        getContentPane().add(businessLabel);
        businessLabel.setBounds(20, 350, 130, 30);

        phoneNumberLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        phoneNumberLabel.setText("Phone Number");
        getContentPane().add(phoneNumberLabel);
        phoneNumberLabel.setBounds(30, 230, 90, 30);

        emailLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        emailLabel.setText("Email Address :");
        getContentPane().add(emailLabel);
        emailLabel.setBounds(30, 280, 100, 20);

        idTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        idTextField.setMaximumSize(new java.awt.Dimension(20, 10));
        idTextField.setName(""); // NOI18N
        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(idTextField);
        idTextField.setBounds(150, 60, 90, 30);

        nameTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        nameTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        getContentPane().add(nameTextField);
        nameTextField.setBounds(150, 100, 220, 30);

        addressTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        addressTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        getContentPane().add(addressTextField);
        addressTextField.setBounds(150, 190, 220, 30);

        businessInShopTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        businessInShopTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        getContentPane().add(businessInShopTextField);
        businessInShopTextField.setBounds(150, 350, 220, 30);

        phoneTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        phoneTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        getContentPane().add(phoneTextField);
        phoneTextField.setBounds(150, 230, 220, 30);

        emailTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        emailTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        getContentPane().add(emailTextField);
        emailTextField.setBounds(150, 270, 220, 30);

        uploadPhotoButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        uploadPhotoButton.setText("Upload Image");
        uploadPhotoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadPhotoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(uploadPhotoButton);
        uploadPhotoButton.setBounds(150, 140, 160, 40);

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveButton);
        saveButton.setBounds(130, 400, 250, 23);

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator7.setAlignmentX(1.0F);
        jSeparator7.setAlignmentY(1.0F);
        getContentPane().add(jSeparator7);
        jSeparator7.setBounds(390, 50, 10, 280);

        nidNumberLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nidNumberLabel.setText("NID Number :");
        getContentPane().add(nidNumberLabel);
        nidNumberLabel.setBounds(440, 100, 210, 15);

        nidNumberTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(nidNumberTextField);
        nidNumberTextField.setBounds(440, 120, 200, 30);

        nidPhotoLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nidPhotoLabel.setText("NID Photo :");
        getContentPane().add(nidPhotoLabel);
        nidPhotoLabel.setBounds(440, 150, 210, 20);

        uploadNIDButton.setText("Upload NID");
        uploadNIDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadNIDButtonActionPerformed(evt);
            }
        });
        getContentPane().add(uploadNIDButton);
        uploadNIDButton.setBounds(440, 180, 200, 23);

        occipationLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        occipationLabel.setText("Occupation");
        getContentPane().add(occipationLabel);
        occipationLabel.setBounds(30, 310, 100, 20);

        occupationTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        occupationTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        getContentPane().add(occupationTextField);
        occupationTextField.setBounds(150, 310, 220, 30);

        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 2, 18)); // NOI18N
        jLabel5.setText("Security Issue:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(430, 50, 160, 50);
        getContentPane().add(tenantPhotoLabel);
        tenantPhotoLabel.setBounds(390, 200, 300, 220);

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

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed
    void setUpImage() {
        try {
            Image img = ImageIO.read(selectedFile);
            imageURL = "Image/tenant/" + (id) + ".jpg";
            selectedFile = new File(imageURL);
            ImageIO.write((RenderedImage) img, "jpg", selectedFile);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Select Photo First");
        }
    }

    void setUpNidImage() {
        try {
            Image img = ImageIO.read(selectedFile2);
            imageNidURL = "Image/tenant/" + (id ) + "NID.jpg";
            selectedFile2 = new File(imageNidURL);
            ImageIO.write((RenderedImage) img, "jpg", selectedFile2);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Select Photo First");
        }
    }
    private void uploadPhotoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadPhotoButtonActionPerformed
        JFileChooser file = new JFileChooser();
        int result = file.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = file.getSelectedFile();
            setUpImage();
        } else if (result == JFileChooser.CANCEL_OPTION) {
        }

    }//GEN-LAST:event_uploadPhotoButtonActionPerformed

    private void homeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeMenuActionPerformed
    int checkString(String s) {
        if (!s.isEmpty() && s != null) {
            return 1;

        }
        return 0;
    }
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        
        String guiId = idTextField.getText();
        
        String guiName = nameTextField.getText();
       
       
        String guiPhotoUrl = imageURL;
       
        String guiAddress = addressTextField.getText();

        String guiBusiness = businessInShopTextField.getText();
        String guiOccupation = occupationTextField.getText();
        String guiPhone = phoneTextField.getText();
        String guiEmail = emailTextField.getText();

        String guiNidNumber = nidNumberTextField.getText();
       

        
        try {

            String sql = "UPDATE `shopping_mall_database`.`tenant` SET `name` = '" + guiName + "', `image_url` = '" + guiPhotoUrl + "', `national_id_pic_url` = '" + imageNidURL
                    + "', `national_id_number` = '" + guiNidNumber + "', `address` = '" + guiAddress + "', `occupation` = '" + guiOccupation
                      + "', `business_in_shop` = '" + guiBusiness + "', `email` = '" + guiEmail + "', `phone_number` = '" + guiPhone
                    + "' WHERE `tenant`.`tenant_id` ='" + guiId+"'";
            
            
                System.out.println(sql);
                statement.executeUpdate(sql);
                new WriteLog("Tenant ID ="+guiId+" Modified.");
                System.out.println("Success");
                 new PreEditTenant();
                this.dispose();
            

        } catch (Exception dbe) {
            JOptionPane.showMessageDialog(this, "Something Wrong");
            dbe.printStackTrace();
        }


    }//GEN-LAST:event_saveButtonActionPerformed

    private void uploadNIDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadNIDButtonActionPerformed
        JFileChooser file = new JFileChooser();
        int result = file.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile2 = file.getSelectedFile();
            setUpNidImage();
        } else if (result == JFileChooser.CANCEL_OPTION) {

        }
    }//GEN-LAST:event_uploadNIDButtonActionPerformed

    private void homeMenuMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_homeMenuMenuSelected
        new FirstFrame();
        dispose();
    }//GEN-LAST:event_homeMenuMenuSelected

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JTextField businessInShopTextField;
    private javax.swing.JLabel businessLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel headLabel;
    private javax.swing.JMenu homeMenu;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JMenuBar menuBar1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel nidNumberLabel;
    private javax.swing.JTextField nidNumberTextField;
    private javax.swing.JLabel nidPhotoLabel;
    private javax.swing.JLabel occipationLabel;
    private javax.swing.JTextField occupationTextField;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel tenantPhotoLabel;
    private javax.swing.JButton uploadNIDButton;
    private javax.swing.JButton uploadPhotoButton;
    // End of variables declaration//GEN-END:variables
}
