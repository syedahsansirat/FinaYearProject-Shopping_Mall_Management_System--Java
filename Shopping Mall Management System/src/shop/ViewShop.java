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

/**
 *
 * @author Sirat
 */
public class ViewShop extends javax.swing.JFrame {

    private File selectedFile;
    String imageURL = "";
    String id;

    /**
     * Creates new form AddReference
     */
    public ViewShop(String id) {
        initComponents();
        ImageIcon icon=new ImageIcon("Image/logo.png");
        setIconImage(icon.getImage());
        setTitle("Shopping Mall Management System");
        this.id = id;

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setInfo();
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

    void setInfo() {
        try {
            connectDB();
            String roomNo = "";
            String securityFee = "";
            String area = "";
            String ac = "";
            String rent = "";
            String url = "";
            statement = con.createStatement();
            resultSet = statement.executeQuery("select room_no,security_fee,area,ac_enable,rent,image_url from shop Where shop_id=" + id);
            while (resultSet.next()) {
                roomNo = resultSet.getString(1);
                securityFee = resultSet.getString(2);
                area = resultSet.getString(3);
                ac = resultSet.getString(4);
                rent = resultSet.getString(5);
                url = resultSet.getString(6);
            }
            setUpImageIcon(url);
            idTextField.setText(id);
            roomNumberTextField.setText(roomNo);
            securityFeeTextField.setText(securityFee);
            areaTextField.setText(area);
            acTextField.setText(ac);
            rentTextField.setText(rent);
        } catch (SQLException ex) {

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        roomNumberLabel = new javax.swing.JLabel();
        securityFeeLabel = new javax.swing.JLabel();
        areaLabel = new javax.swing.JLabel();
        acLabel = new javax.swing.JLabel();
        rentLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
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
        acEgLabel = new javax.swing.JLabel();
        photoIconLabel = new javax.swing.JLabel();
        idLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        homeMenu = new javax.swing.JMenu();
        backMenu = new javax.swing.JMenu();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 515));
        getContentPane().setLayout(null);

        idLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        idLabel.setText("Information of Shop:");
        getContentPane().add(idLabel);
        idLabel.setBounds(20, 20, 180, 15);

        roomNumberLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        roomNumberLabel.setText("Room No.");
        getContentPane().add(roomNumberLabel);
        roomNumberLabel.setBounds(30, 130, 80, 15);

        securityFeeLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        securityFeeLabel.setText("Security Fee :");
        getContentPane().add(securityFeeLabel);
        securityFeeLabel.setBounds(30, 210, 110, 15);

        areaLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        areaLabel.setText("Area : (sq-feet)");
        getContentPane().add(areaLabel);
        areaLabel.setBounds(30, 270, 120, 15);

        acLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        acLabel.setText("Air Condition: ");
        getContentPane().add(acLabel);
        acLabel.setBounds(30, 340, 90, 15);

        rentLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rentLabel.setText("Monthly Rent: (tk)");
        getContentPane().add(rentLabel);
        rentLabel.setBounds(30, 400, 120, 15);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 94, 410, 10);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(10, 170, 410, 10);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(10, 250, 410, 10);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(0, 310, 410, 10);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(0, 370, 410, 10);

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

        roomNumberTextField.setEditable(false);
        roomNumberTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        roomNumberTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        getContentPane().add(roomNumberTextField);
        roomNumberTextField.setBounds(170, 120, 230, 30);

        securityFeeTextField.setEditable(false);
        securityFeeTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        securityFeeTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        getContentPane().add(securityFeeTextField);
        securityFeeTextField.setBounds(160, 200, 240, 30);

        areaTextField.setEditable(false);
        areaTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        areaTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        getContentPane().add(areaTextField);
        areaTextField.setBounds(160, 260, 240, 30);

        acTextField.setEditable(false);
        acTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        acTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        getContentPane().add(acTextField);
        acTextField.setBounds(160, 330, 110, 30);

        rentTextField.setEditable(false);
        rentTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rentTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        getContentPane().add(rentTextField);
        rentTextField.setBounds(160, 390, 220, 30);

        acEgLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        acEgLabel.setText("1=Yes, 0=No!");
        getContentPane().add(acEgLabel);
        acEgLabel.setBounds(290, 330, 100, 30);
        getContentPane().add(photoIconLabel);
        photoIconLabel.setBounds(420, 20, 270, 350);

        idLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        idLabel1.setText("Shop ID: ");
        getContentPane().add(idLabel1);
        idLabel1.setBounds(30, 65, 100, 15);

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


    private void backMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backMenuActionPerformed

    private void backMenuMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_backMenuMenuSelected
        new PreViewShop();
        this.dispose();
    }//GEN-LAST:event_backMenuMenuSelected

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
            java.util.logging.Logger.getLogger(EditReference.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditReference.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditReference.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditReference.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        new ViewShop("2");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acEgLabel;
    private javax.swing.JLabel acLabel;
    private javax.swing.JTextField acTextField;
    private javax.swing.JLabel areaLabel;
    private javax.swing.JTextField areaTextField;
    private javax.swing.JMenu backMenu;
    private javax.swing.JMenu homeMenu;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idLabel1;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel photoIconLabel;
    private javax.swing.JLabel rentLabel;
    private javax.swing.JTextField rentTextField;
    private javax.swing.JLabel roomNumberLabel;
    private javax.swing.JTextField roomNumberTextField;
    private javax.swing.JLabel securityFeeLabel;
    private javax.swing.JTextField securityFeeTextField;
    // End of variables declaration//GEN-END:variables
}