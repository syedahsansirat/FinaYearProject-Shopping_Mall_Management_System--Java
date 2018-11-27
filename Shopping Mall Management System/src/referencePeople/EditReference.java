/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package referencePeople;

import adminPanelAndMainFrame.FirstFrame;
import static databaseStuffs.DatabaseMethods.con;
import static databaseStuffs.DatabaseMethods.connectDB;
import static databaseStuffs.DatabaseMethods.resultSet;
import static databaseStuffs.DatabaseMethods.statement;
import java.awt.Image;
import java.awt.image.RenderedImage;
import java.io.*;
import java.sql.SQLException;
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
public class EditReference extends javax.swing.JFrame {

    private File selectedFile;
    String imageURL = "";
    String id;
    String imgageUrlFromDb = "";

    /**
     * Creates new form AddReference
     */
    public EditReference(String id) {
        initComponents();
        ImageIcon icon=new ImageIcon("Image/logo.png");
        setIconImage(icon.getImage());
        setTitle("Shopping Mall Management System");
        this.id = id;
        setVisible(true);
        setLocationRelativeTo(null);
        setInfo();
    }

    void setInfo() {
        try {
            connectDB();
            String name = "";
            String homeAddress = "";
            String officeAddress = "";
            String company = "";
            String email = "";

            statement = con.createStatement();
            resultSet = statement.executeQuery("select name,address,office_address,company,email,imageUrl from reference Where reference_id=" + id);
            while (resultSet.next()) {
                name = resultSet.getString(1);
                homeAddress = resultSet.getString(2);
                officeAddress = resultSet.getString(3);
                company = resultSet.getString(4);
                email = resultSet.getString(5);
                imgageUrlFromDb = resultSet.getString(6);
            }
            setUpImageIcon(imgageUrlFromDb);
            idTextField.setText(id);
            nameTextField.setText(name);
            homeAddressTextField.setText(homeAddress);
            officeAddressTextField.setText(officeAddress);
            companyTextField.setText(company);
            emailTextField.setText(email);
        } catch (SQLException ex) {

        }

    }

    void setUpImageIcon(String iURL) {
        try {
            File f = new File(iURL);
            Image img = ImageIO.read(f);
            ImageIcon ic = new ImageIcon(img);
            photoIconLabel.setIcon(ic);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Photo Load Failed");

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        photoLabel = new javax.swing.JLabel();
        homeAddressLabel = new javax.swing.JLabel();
        officeAddressLabel = new javax.swing.JLabel();
        companyLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        idTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        homeAddressTextField = new javax.swing.JTextField();
        officeAddressTextField = new javax.swing.JTextField();
        companyTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        uploadButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        photoIconLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 515));
        getContentPane().setLayout(null);

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleLabel.setText("Please Change the Items :");
        getContentPane().add(titleLabel);
        titleLabel.setBounds(70, 0, 350, 29);

        idLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        idLabel.setText("Reference ID: ");
        getContentPane().add(idLabel);
        idLabel.setBounds(30, 65, 100, 15);

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nameLabel.setText("Name :");
        getContentPane().add(nameLabel);
        nameLabel.setBounds(30, 119, 80, 15);

        photoLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        photoLabel.setText("Photo :");
        getContentPane().add(photoLabel);
        photoLabel.setBounds(30, 173, 100, 15);

        homeAddressLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        homeAddressLabel.setText("Home Address :");
        getContentPane().add(homeAddressLabel);
        homeAddressLabel.setBounds(30, 227, 110, 15);

        officeAddressLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        officeAddressLabel.setText("Office Address :");
        getContentPane().add(officeAddressLabel);
        officeAddressLabel.setBounds(30, 281, 100, 15);

        companyLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        companyLabel.setText("Company :");
        getContentPane().add(companyLabel);
        companyLabel.setBounds(30, 335, 90, 15);

        emailLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        emailLabel.setText("Email Address :");
        getContentPane().add(emailLabel);
        emailLabel.setBounds(30, 389, 120, 15);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 94, 410, 10);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 148, 410, 10);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 202, 410, 10);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(0, 256, 410, 10);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(0, 310, 410, 10);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(0, 364, 410, 10);

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
        idTextField.setBounds(170, 50, 80, 30);

        nameTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        nameTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        getContentPane().add(nameTextField);
        nameTextField.setBounds(166, 105, 230, 30);

        homeAddressTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        homeAddressTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        getContentPane().add(homeAddressTextField);
        homeAddressTextField.setBounds(160, 214, 240, 30);

        officeAddressTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        officeAddressTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        getContentPane().add(officeAddressTextField);
        officeAddressTextField.setBounds(162, 268, 240, 30);

        companyTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        companyTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        getContentPane().add(companyTextField);
        companyTextField.setBounds(160, 320, 220, 30);

        emailTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        emailTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        getContentPane().add(emailTextField);
        emailTextField.setBounds(160, 380, 220, 30);

        uploadButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        uploadButton.setText("Upload Image");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });
        getContentPane().add(uploadButton);
        uploadButton.setBounds(166, 160, 130, 30);

        saveButton.setBackground(new java.awt.Color(255, 255, 51));
        saveButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        saveButton.setText("Save Change");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveButton);
        saveButton.setBounds(460, 380, 200, 50);
        getContentPane().add(photoIconLabel);
        photoIconLabel.setBounds(420, 20, 270, 350);

        jMenu1.setText("Home");
        jMenu1.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu1MenuSelected(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed
    void setUpImage() {//edit the photo with new photo
        try {
            Image img = ImageIO.read(selectedFile);
            selectedFile = new File(imgageUrlFromDb);
            ImageIO.write((RenderedImage) img, "jpg", selectedFile);
            //

        } catch (Exception ex) {
            System.out.println("Wrong");

        }
    }

    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        JFileChooser file = new JFileChooser();
        int result = file.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = file.getSelectedFile();
            System.out.println("File Selected");
        } else if (result == JFileChooser.CANCEL_OPTION) {
            System.out.println("No File Select");
        }

    }//GEN-LAST:event_uploadButtonActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String guiId = idTextField.getText();
        String guiName = nameTextField.getText();
        setUpImage();
        String guiPhotoUrl = imgageUrlFromDb;
        String guiHomeAddress = homeAddressTextField.getText();
        String guiOfficeAddress = officeAddressTextField.getText();
        String guiCompany = companyTextField.getText();
        String guiEmail = emailTextField.getText();
        try {
            String sql = "UPDATE `shopping_mall_database`.`reference` SET `name` = '" + guiName + "', `address` = '" + guiHomeAddress + "',"
                    + " `email` = '" + guiEmail + "', `imageUrl` = '" + guiPhotoUrl + "',"
                    + " `company` = '" + guiCompany + "', `office_address` = '" + guiOfficeAddress + "' WHERE `reference`.`reference_id` = " + guiId;
            statement.execute(sql);
            new WriteLog("Reference ID ="+guiId+" Modified.");
            new GetScreenShot(this,"reference_ID_"+guiId);
            FirstFrame ob = new FirstFrame();
            this.dispose();
        } catch (SQLException dbe) {
            JOptionPane.showMessageDialog(this, "Could not Change All Component!");
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void jMenu1MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu1MenuSelected
        new FirstFrame();
        this.dispose();
    }//GEN-LAST:event_jMenu1MenuSelected


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel companyLabel;
    private javax.swing.JTextField companyTextField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel homeAddressLabel;
    private javax.swing.JTextField homeAddressTextField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel officeAddressLabel;
    private javax.swing.JTextField officeAddressTextField;
    private javax.swing.JLabel photoIconLabel;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton uploadButton;
    // End of variables declaration//GEN-END:variables
}
