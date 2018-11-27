/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import adminPanelAndMainFrame.FirstFrame;
import static databaseStuffs.DatabaseMethods.con;
import static databaseStuffs.DatabaseMethods.connectDB;
import static databaseStuffs.DatabaseMethods.resultSet;
import static databaseStuffs.DatabaseMethods.statement;
import referencePeople.*;
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
public class AddShop extends javax.swing.JFrame {

    private File selectedFile;
    String imageURL = "";
    int id;
    private int gotIdFromDb;

    /**
     * Creates new form AddReference
     */
    public AddShop() {
        initComponents();
        ImageIcon icon=new ImageIcon("Image/logo.png");
        setIconImage(icon.getImage());
        setTitle("Shopping Mall Management System");
        setLocationRelativeTo(null);
        setVisible(true);
        try {
            connectDB();
            statement = con.createStatement();
            resultSet = statement.executeQuery("select shop_id from shop order by shop_id");
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
        titleLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        roomNumberLabel = new javax.swing.JLabel();
        photoLabel = new javax.swing.JLabel();
        securityFeeLabel = new javax.swing.JLabel();
        areaLabel = new javax.swing.JLabel();
        acLabel = new javax.swing.JLabel();
        acEgLabel = new javax.swing.JLabel();
        rentLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        idTextField = new javax.swing.JTextField();
        roomNumberTextField = new javax.swing.JTextField();
        securityFeeTextField = new javax.swing.JTextField();
        areaTextField = new javax.swing.JTextField();
        acTextField = new javax.swing.JTextField();
        rentTextField = new javax.swing.JTextField();
        uploadButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        floorLabel = new javax.swing.JLabel();
        floorTextField = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        backMenu = new javax.swing.JMenu();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(420, 515));
        getContentPane().setLayout(null);

        titleLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 0, 51));
        titleLabel.setText("Please Fill up the form :");
        getContentPane().add(titleLabel);
        titleLabel.setBounds(70, 0, 300, 33);

        idLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        idLabel.setText("Shop ID: ");
        getContentPane().add(idLabel);
        idLabel.setBounds(30, 60, 100, 15);

        roomNumberLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        roomNumberLabel.setText("Room No.");
        getContentPane().add(roomNumberLabel);
        roomNumberLabel.setBounds(30, 110, 80, 15);

        photoLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        photoLabel.setText("Image :");
        getContentPane().add(photoLabel);
        photoLabel.setBounds(30, 173, 100, 15);

        securityFeeLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        securityFeeLabel.setText("Security Fee :");
        getContentPane().add(securityFeeLabel);
        securityFeeLabel.setBounds(30, 227, 110, 15);

        areaLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        areaLabel.setText("Area (sq-feet) :");
        getContentPane().add(areaLabel);
        areaLabel.setBounds(30, 270, 120, 15);

        acLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        acLabel.setText("Air Condition: ");
        getContentPane().add(acLabel);
        acLabel.setBounds(30, 320, 90, 15);

        acEgLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        acEgLabel.setText("Only ( 0 / 1)");
        getContentPane().add(acEgLabel);
        acEgLabel.setBounds(270, 320, 80, 30);

        rentLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rentLabel.setText("Monthly Rent");
        getContentPane().add(rentLabel);
        rentLabel.setBounds(30, 420, 120, 15);
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
        jSeparator6.setBounds(0, 400, 410, 10);

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

        roomNumberTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        roomNumberTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        getContentPane().add(roomNumberTextField);
        roomNumberTextField.setBounds(170, 110, 200, 30);

        securityFeeTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        securityFeeTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        getContentPane().add(securityFeeTextField);
        securityFeeTextField.setBounds(170, 210, 190, 30);

        areaTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        areaTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        getContentPane().add(areaTextField);
        areaTextField.setBounds(170, 270, 190, 30);

        acTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        acTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        acTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(acTextField);
        acTextField.setBounds(170, 320, 80, 30);

        rentTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rentTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        getContentPane().add(rentTextField);
        rentTextField.setBounds(170, 410, 140, 30);

        uploadButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        uploadButton.setText("Upload Image");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });
        getContentPane().add(uploadButton);
        uploadButton.setBounds(170, 160, 130, 30);

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveButton);
        saveButton.setBounds(330, 420, 57, 23);
        getContentPane().add(jSeparator7);
        jSeparator7.setBounds(0, 350, 410, 10);

        floorLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        floorLabel.setText("Floor");
        getContentPane().add(floorLabel);
        floorLabel.setBounds(30, 370, 120, 15);

        floorTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        floorTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        getContentPane().add(floorTextField);
        floorTextField.setBounds(170, 360, 140, 30);

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
            imageURL = "Image/shop/" + (gotIdFromDb + 1) + ".jpg";
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
            System.out.println("File Selected");
        } else if (result == JFileChooser.CANCEL_OPTION) {
            System.out.println("No File Select");
        }
      //  setUpImage();
    }//GEN-LAST:event_uploadButtonActionPerformed

    private void backMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backMenuActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String guiId = idTextField.getText();
        String guiRoomNo = roomNumberTextField.getText();
        setUpImage();
        String guiPhotoUrl = imageURL;
        String guiSecurityFee = securityFeeTextField.getText();
        String guiArea = areaTextField.getText();
        String guiAirCondition = acTextField.getText();
        String guiRent = rentTextField.getText();
        String floor=floorTextField.getText();
        
        try {
            String sql = "INSERT INTO `shopping_mall_database`.`shop` (`shop_id`, `security_fee`, `rent`, `area`, `image_url`, `ac_enable`, `room_no`,`floor`) VALUES "
                    + " (" + guiId + ", " + guiSecurityFee + ", " + guiRent + ", " + guiArea +
                    ", '" + guiPhotoUrl + "', " + guiAirCondition + ", '" + guiRoomNo +"','"+floor+ "')";
            System.out.println(sql);
            statement.executeUpdate(sql);
            new WriteLog("new Shop ID ="+guiId+" Added.");
            new GetScreenShot(this,"shop_ID_"+guiId);
            FirstFrame ob = new FirstFrame();
            this.dispose();
        } catch (SQLException dbe) {
            dbe.printStackTrace();
            JOptionPane.showMessageDialog(this, "Fill Up All Field and select an Image");
        }
        
        
    }//GEN-LAST:event_saveButtonActionPerformed

    private void acTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acTextFieldActionPerformed

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

        new AddShop();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acEgLabel;
    private javax.swing.JLabel acLabel;
    private javax.swing.JTextField acTextField;
    private javax.swing.JLabel areaLabel;
    private javax.swing.JTextField areaTextField;
    private javax.swing.JMenu backMenu;
    private javax.swing.JLabel floorLabel;
    private javax.swing.JTextField floorTextField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JLabel rentLabel;
    private javax.swing.JTextField rentTextField;
    private javax.swing.JLabel roomNumberLabel;
    private javax.swing.JTextField roomNumberTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel securityFeeLabel;
    private javax.swing.JTextField securityFeeTextField;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton uploadButton;
    // End of variables declaration//GEN-END:variables
}
