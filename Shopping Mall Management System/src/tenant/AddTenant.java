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
import javax.swing.JOptionPane;
import screenshot.GetScreenShot;
import screenshot.WriteLog;

/**
 *
 * @author Sirat
 */
public class AddTenant extends javax.swing.JFrame {

    private File selectedFile;
    String imageURL = "";

    int gotIdFromDb;
    int num = 0;
    private File selectedFile2;
    private String imageNidURL;

    /**
     * Creates new form AddReference
     */
    public AddTenant() {
        initComponents();
        ImageIcon icon=new ImageIcon("Image/logo.png");
        setIconImage(icon.getImage());
        setTitle("Shopping Mall Management System");
        setVisible(true);
        saveButton.setEnabled(false);
        setLocationRelativeTo(null);
        //set up an id
        try {
            connectDB();
            statement = con.createStatement();
            resultSet = statement.executeQuery("select tenant_id from tenant order by tenant_id");
            while (resultSet.next()) {
                gotIdFromDb = resultSet.getInt(1);
            }
            idTextField.setText("" + (gotIdFromDb + 1));
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Can not generate id");
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
        referenceIdLabel = new javax.swing.JLabel();
        referenceIdTextField = new javax.swing.JTextField();
        occipationLabel = new javax.swing.JLabel();
        occupationTextField = new javax.swing.JTextField();
        verifyButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        noteLabel = new javax.swing.JLabel();
        refNameLabel = new javax.swing.JLabel();
        menuBar1 = new javax.swing.JMenuBar();
        homeMenu = new javax.swing.JMenu();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 51));
        setMinimumSize(new java.awt.Dimension(695, 480));
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
        saveButton.setBounds(227, 390, 250, 23);

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

        referenceIdLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        referenceIdLabel.setText("Your Reference People ID");
        getContentPane().add(referenceIdLabel);
        referenceIdLabel.setBounds(440, 210, 230, 20);

        referenceIdTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(referenceIdTextField);
        referenceIdTextField.setBounds(440, 240, 130, 30);

        occipationLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        occipationLabel.setText("Occupation");
        getContentPane().add(occipationLabel);
        occipationLabel.setBounds(30, 310, 100, 20);

        occupationTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        occupationTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        getContentPane().add(occupationTextField);
        occupationTextField.setBounds(150, 310, 220, 30);

        verifyButton.setBackground(new java.awt.Color(255, 204, 51));
        verifyButton.setFont(new java.awt.Font("Viner Hand ITC", 1, 12)); // NOI18N
        verifyButton.setForeground(new java.awt.Color(0, 153, 0));
        verifyButton.setText("Verify");
        verifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(verifyButton);
        verifyButton.setBounds(590, 240, 80, 40);

        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 2, 18)); // NOI18N
        jLabel5.setText("Security Issue:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(430, 50, 160, 50);

        noteLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        noteLabel.setForeground(new java.awt.Color(255, 102, 0));
        noteLabel.setText("Note: Fill All The Information");
        getContentPane().add(noteLabel);
        noteLabel.setBounds(430, 340, 240, 50);

        refNameLabel.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        getContentPane().add(refNameLabel);
        refNameLabel.setBounds(430, 284, 240, 40);

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
            imageURL = "Image/tenant/" + (gotIdFromDb + 1) + ".jpg";
            selectedFile = new File(imageURL);
            ImageIO.write((RenderedImage) img, "jpg", selectedFile);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Select Photo First");
        }
    }

    void setUpNidImage() {
        try {
            Image img = ImageIO.read(selectedFile2);
            imageNidURL = "Image/tenant/" + (gotIdFromDb + 1) + "NID.jpg";
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
        int inputCounter = 0;
        String guiId = idTextField.getText();
        inputCounter += checkString(guiId);
        String guiName = nameTextField.getText();
        inputCounter += checkString(guiName);
        setUpImage();
        String guiPhotoUrl = imageURL;
        inputCounter += checkString(guiPhotoUrl);
        String guiAddress = addressTextField.getText();
        inputCounter += checkString(guiAddress);
        String guiBusiness = businessInShopTextField.getText();
        inputCounter += checkString(guiBusiness);
        String guiOccupation = occupationTextField.getText();
        inputCounter += checkString(guiOccupation);
        String guiPhone = phoneTextField.getText();
        inputCounter += checkString(guiPhone);
        String guiEmail = emailTextField.getText();
        inputCounter += checkString(guiEmail);

        String guiNidNumber = nidNumberTextField.getText();
        inputCounter += checkString(guiNidNumber);
        setUpNidImage();
        inputCounter += checkString(imageNidURL);

        String guiReferenceId = referenceIdTextField.getText();
        inputCounter += checkString(guiReferenceId);
        try {

            String sql = "INSERT INTO `shopping_mall_database`.`tenant`"
                    + "(`tenant_id`, `name`, `image_url`, `national_id_pic_url`, `national_id_number`, `address`, `occupation`, `business_in_shop`, `email`, `phone_number`, `reference_id`) VALUES "
                    + "('" + guiId + "', '" + guiName + "', '" + guiPhotoUrl + "', '" + imageNidURL + "', '" + guiNidNumber + "', '"
                    + guiAddress + "', '" + guiOccupation + "', '" + guiBusiness + "', '" + guiEmail + "', '" + guiPhone + "', '" + guiReferenceId + "')";
            if (inputCounter >= 11) {
                statement.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Tenant Added");
                new WriteLog("new Tenant ID ="+guiId+" Added.");
                new GetScreenShot(this,"tenant_ID_"+guiId);
                FirstFrame ob = new FirstFrame();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Fill Up All Field and select Images");
            }

        } catch (Exception dbe) {
            JOptionPane.showMessageDialog(this, "Something Wrong");
        }


    }//GEN-LAST:event_saveButtonActionPerformed

    private void uploadNIDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadNIDButtonActionPerformed
        JFileChooser file = new JFileChooser();
        int result = file.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile2 = file.getSelectedFile();
        } else if (result == JFileChooser.CANCEL_OPTION) {

        }
    }//GEN-LAST:event_uploadNIDButtonActionPerformed

    private void homeMenuMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_homeMenuMenuSelected
        new FirstFrame();
        dispose();
    }//GEN-LAST:event_homeMenuMenuSelected

    private void verifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyButtonActionPerformed
        String guiReferenceId = referenceIdTextField.getText();
        String refId = "";
        String refName = "";
        try {

            resultSet = statement.executeQuery("select reference_id,name from reference where reference_id=" + guiReferenceId);
            while (resultSet.next()) {
                refId = resultSet.getString(1);
                refName = resultSet.getString(2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddTenant.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (!guiReferenceId.isEmpty() && guiReferenceId != null && refId.matches(guiReferenceId)) {
            saveButton.setEnabled(true);
            verifyButton.setVisible(false);
            refNameLabel.setText("Ref: " + refName);

        } else {
            JOptionPane.showMessageDialog(this, "Enter Correct ID of Reference!");
        }
    }//GEN-LAST:event_verifyButtonActionPerformed

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

        new AddTenant();

    }

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
    private javax.swing.JLabel noteLabel;
    private javax.swing.JLabel occipationLabel;
    private javax.swing.JTextField occupationTextField;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JLabel refNameLabel;
    private javax.swing.JLabel referenceIdLabel;
    private javax.swing.JTextField referenceIdTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton uploadNIDButton;
    private javax.swing.JButton uploadPhotoButton;
    private javax.swing.JButton verifyButton;
    // End of variables declaration//GEN-END:variables
}
