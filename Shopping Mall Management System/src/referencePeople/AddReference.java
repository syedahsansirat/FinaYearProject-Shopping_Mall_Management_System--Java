/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package referencePeople;
import screenshot.*;
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

/**
 *
 * @author Sirat
 */
public class AddReference extends javax.swing.JFrame {

    private File selectedFile;
    String imageURL = "";

    int gotIdFromDb;
    int num = 0;

    /**
     * Creates new form AddReference
     */
    public AddReference() {
        initComponents();
        ImageIcon icon=new ImageIcon("Image/logo.png");
        setIconImage(icon.getImage());
        setTitle("Shopping Mall Management System");
        setVisible(true);
        setLocationRelativeTo(null);
        try {
            connectDB();
            statement = con.createStatement();
            resultSet = statement.executeQuery("select reference_id from reference order by reference_id");
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
        jLabel1 = new javax.swing.JLabel();
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
        jMenuBar1 = new javax.swing.JMenuBar();
        backMenu = new javax.swing.JMenu();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(420, 515));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Please Fill up the form :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 0, 300, 33);

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
        idTextField.setBounds(170, 50, 180, 30);

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

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveButton);
        saveButton.setBounds(330, 420, 57, 23);

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
        backMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backMenuActionPerformed(evt);
            }
        });
        jMenuBar1.add(backMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed
    void setUpImage() {
        try {
            Image img = ImageIO.read(selectedFile);
            imageURL = "Image/reference/" + (gotIdFromDb + 1) + ".jpg";
            selectedFile = new File(imageURL);
            ImageIO.write((RenderedImage) img, "jpg", selectedFile);
            //  System.out.println("Suc"+imageURL);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Select Photo First");

        }

    }
    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        JFileChooser file = new JFileChooser();
        int result = file.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = file.getSelectedFile();
        } else if (result == JFileChooser.CANCEL_OPTION) {
        }

    }//GEN-LAST:event_uploadButtonActionPerformed

    private void backMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backMenuActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

        String guiId = idTextField.getText();
        String guiName = nameTextField.getText();
        setUpImage();
        String guiPhotoUrl = imageURL;
        String guiHomeAddress = homeAddressTextField.getText();
        String guiOfficeAddress = officeAddressTextField.getText();
        String guiCompany = companyTextField.getText();
        String guiEmail = emailTextField.getText();
        try {
            String sql = "INSERT INTO `shopping_mall_database`.`reference` (`reference_id`, `name`, `address`, `email`, `imageUrl`, `company`, `office_address`) VALUES"
                    + " ('" + guiId + "', '" + guiName + "', '" + guiHomeAddress + "', '" + guiEmail + "', '" + guiPhotoUrl + "', '" + guiCompany + "', '" + guiOfficeAddress + "')";
            statement.executeUpdate(sql);
            new WriteLog("Reference ID ="+guiId+" Added.");
            new GetScreenShot(this,"reference_ID_"+guiId);
            FirstFrame ob = new FirstFrame();
            this.dispose();
        } catch (SQLException dbe) {
            JOptionPane.showMessageDialog(this, "Fill Up All Field and select an Image");
        }


    }//GEN-LAST:event_saveButtonActionPerformed

    private void backMenuMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_backMenuMenuSelected
        FirstFrame ob = new FirstFrame();
        this.dispose();
    }//GEN-LAST:event_backMenuMenuSelected

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

        new AddReference();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu backMenu;
    private javax.swing.JLabel companyLabel;
    private javax.swing.JTextField companyTextField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel homeAddressLabel;
    private javax.swing.JTextField homeAddressTextField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JLabel photoLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton uploadButton;
    // End of variables declaration//GEN-END:variables
}
