/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package referencePeople;

import adminPanelAndMainFrame.FirstFrame;
import static databaseStuffs.DatabaseMethods.*;
import java.awt.Image;
import java.io.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Sirat
 */
public class ViewReference extends javax.swing.JFrame {

    private File selectedFile;
    String imageURL = "";
    String id;

    /**
     * Creates new form AddReference
     */
    public ViewReference(String id) {
        initComponents();
        ImageIcon icon=new ImageIcon("Image/logo.png");
        setIconImage(icon.getImage());
        setTitle("Shopping Mall Management System");
        this.id = id;

        setVisible(true);
        setLocationRelativeTo(null);
        setInfo();
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
        jMenu2 = new javax.swing.JMenu();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        homeAddressLabel = new javax.swing.JLabel();
        officeAddressLabel = new javax.swing.JLabel();
        companyLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
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
        photoIconLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        homeMenu = new javax.swing.JMenu();
        backMenu = new javax.swing.JMenu();

        jLabel6.setText("jLabel6");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 515));
        getContentPane().setLayout(null);

        idLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        idLabel.setText("Reference ID: ");
        getContentPane().add(idLabel);
        idLabel.setBounds(30, 65, 100, 15);

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nameLabel.setText("Name :");
        getContentPane().add(nameLabel);
        nameLabel.setBounds(30, 119, 80, 15);

        homeAddressLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        homeAddressLabel.setText("Home Address :");
        getContentPane().add(homeAddressLabel);
        homeAddressLabel.setBounds(30, 190, 110, 15);

        officeAddressLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        officeAddressLabel.setText("Office Address :");
        getContentPane().add(officeAddressLabel);
        officeAddressLabel.setBounds(30, 260, 100, 15);

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
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(10, 160, 410, 10);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(10, 230, 410, 10);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(10, 300, 410, 10);
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

        nameTextField.setEditable(false);
        nameTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        nameTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        getContentPane().add(nameTextField);
        nameTextField.setBounds(166, 105, 230, 30);

        homeAddressTextField.setEditable(false);
        homeAddressTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        homeAddressTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        getContentPane().add(homeAddressTextField);
        homeAddressTextField.setBounds(160, 180, 240, 30);

        officeAddressTextField.setEditable(false);
        officeAddressTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        officeAddressTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        getContentPane().add(officeAddressTextField);
        officeAddressTextField.setBounds(160, 250, 240, 30);

        companyTextField.setEditable(false);
        companyTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        companyTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        getContentPane().add(companyTextField);
        companyTextField.setBounds(160, 320, 220, 30);

        emailTextField.setEditable(false);
        emailTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        emailTextField.setPreferredSize(new java.awt.Dimension(20, 10));
        getContentPane().add(emailTextField);
        emailTextField.setBounds(160, 380, 220, 30);
        getContentPane().add(photoIconLabel);
        photoIconLabel.setBounds(430, 40, 270, 350);

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
    void setInfo() {
        try {
            connectDB();
            String name = "";
            String homeAddress = "";
            String officeAddress = "";
            String company = "";
            String email = "";
            String url = "";
            statement = con.createStatement();
            resultSet = statement.executeQuery("select name,address,office_address,company,email,imageUrl from reference Where reference_id=" + id);
            while (resultSet.next()) {
                name = resultSet.getString(1);
                homeAddress = resultSet.getString(2);
                officeAddress = resultSet.getString(3);
                company = resultSet.getString(4);
                email = resultSet.getString(5);
                url = resultSet.getString(6);
            }
            setUpImageIcon(url);
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
            //"Image/reference/1.jpg"
            Image img = ImageIO.read(f);
            ImageIcon ic = new ImageIcon(img);
            photoIconLabel.setIcon(ic);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Photo Load Failed");

        }
    }
    private void backMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backMenuActionPerformed

    private void homeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeMenuActionPerformed

    private void backMenuMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_backMenuMenuSelected
        new PreViewRef();
        this.dispose();
    }//GEN-LAST:event_backMenuMenuSelected

    private void homeMenuMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_homeMenuMenuSelected
        new FirstFrame();
        this.dispose();
    }//GEN-LAST:event_homeMenuMenuSelected


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu backMenu;
    private javax.swing.JLabel companyLabel;
    private javax.swing.JTextField companyTextField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel homeAddressLabel;
    private javax.swing.JTextField homeAddressTextField;
    private javax.swing.JMenu homeMenu;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel officeAddressLabel;
    private javax.swing.JTextField officeAddressTextField;
    private javax.swing.JLabel photoIconLabel;
    // End of variables declaration//GEN-END:variables
}
