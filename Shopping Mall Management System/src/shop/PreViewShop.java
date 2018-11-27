/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import tenant.*;
import shop.*;
import referencePeople.*;
import adminPanelAndMainFrame.FirstFrame;
import static databaseStuffs.DatabaseMethods.con;
import static databaseStuffs.DatabaseMethods.connectDB;
import static databaseStuffs.DatabaseMethods.resultSet;
import static databaseStuffs.DatabaseMethods.*;
import dealsAndPayments.RentDealFromShop;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sirat
 */
public class PreViewShop extends javax.swing.JFrame {

    /**
     * Creates new form preViewEdit
     */
    DefaultTableModel model;

    public PreViewShop() {
        initComponents();
        ImageIcon icon = new ImageIcon("Image/logo.png");
        setIconImage(icon.getImage());
        setTitle("Shopping Mall Management System");

        model = (DefaultTableModel) dataTable.getModel();

        connectDB();
        try {
            statement = con.createStatement();
            resultSet = statement.executeQuery("select shop_id,room_no,floor from shop");
            int serial = 1;
            while (resultSet.next()) {
                String shopID = resultSet.getString(1);
                String roomNo = resultSet.getString(2);
                String floorNo = resultSet.getString(3);
                String availablity="";
                
                statement2=con.createStatement();
                resultSet2=statement2.executeQuery("select rent_id from rent where shop_id="+shopID);
                while(resultSet2.next()){
                    availablity=resultSet2.getString(1);
                }
                if(availablity.isEmpty() || availablity==null || availablity=="")
                {
                    availablity="Available";
                }
                else
                {
                    availablity="Not Available";
                }
                
                
                
                
                
                model.addRow(new Object[]{serial, shopID, roomNo, floorNo,availablity});
                serial++;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        this.setLocationRelativeTo(null);
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

        goButton = new javax.swing.JButton();
        EnterIdLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        makeDealButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        backMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        goButton.setText("Go");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        EnterIdLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        EnterIdLabel.setText("Select Raw to View Details :");

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial", "ID", "Room No", "Floor", "Availability"
            }
        ));
        jScrollPane1.setViewportView(dataTable);
        if (dataTable.getColumnModel().getColumnCount() > 0) {
            dataTable.getColumnModel().getColumn(0).setMinWidth(50);
            dataTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            dataTable.getColumnModel().getColumn(0).setMaxWidth(50);
            dataTable.getColumnModel().getColumn(1).setMinWidth(50);
            dataTable.getColumnModel().getColumn(1).setPreferredWidth(50);
            dataTable.getColumnModel().getColumn(1).setMaxWidth(100);
            dataTable.getColumnModel().getColumn(2).setMinWidth(200);
            dataTable.getColumnModel().getColumn(2).setPreferredWidth(200);
            dataTable.getColumnModel().getColumn(2).setMaxWidth(300);
        }

        makeDealButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        makeDealButton.setText("Make A Deal with this shop");
        makeDealButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeDealButtonActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(EnterIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(goButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(makeDealButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goButton)
                    .addComponent(EnterIdLabel))
                .addGap(18, 18, 18)
                .addComponent(makeDealButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMenuMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_backMenuMenuSelected
        new FirstFrame();
        this.dispose();
    }//GEN-LAST:event_backMenuMenuSelected

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        String id;

        if (dataTable.getCellSelectionEnabled()) {
            dataTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            int rowIndex = dataTable.getSelectedRow();
            int colIndex = dataTable.getSelectedColumn();
        }
        int rawNumber = -1;
        rawNumber = dataTable.getSelectedRow();
        //   System.out.println(rawNumber);
        if (rawNumber < 0) {
            JOptionPane.showMessageDialog(this, "Select a Raw from Table");
        } else {
            id = (String) dataTable.getModel().getValueAt(rawNumber, 1);
            // System.out.println(id);
            new ViewShop(id);
            this.dispose();
        }


    }//GEN-LAST:event_goButtonActionPerformed

    private void makeDealButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeDealButtonActionPerformed
        String id;
        String availability; 

        if (dataTable.getCellSelectionEnabled()) {
            dataTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            int rowIndex = dataTable.getSelectedRow();
            int colIndex = dataTable.getSelectedColumn();
        }
        int rawNumber = -1;
        rawNumber = dataTable.getSelectedRow();
        //   System.out.println(rawNumber);
        if (rawNumber < 0) {
            JOptionPane.showMessageDialog(this, "Select a Raw from Table");
        } else {
            id = (String) dataTable.getModel().getValueAt(rawNumber, 1);
            availability=(String) dataTable.getModel().getValueAt(rawNumber, 4);
            System.out.println(id+"    "+availability);
            
            
            if(availability.matches("Available"))
            {
                new RentDealFromShop(id);
                this.dispose();
                
            }
            else{
                JOptionPane.showMessageDialog(this,"Select an Available Shop!");
            }
            // System.out.println(id);
         //   new ViewShop(id);
           // this.dispose();
        }
    }//GEN-LAST:event_makeDealButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PreViewShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PreViewShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PreViewShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PreViewShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PreViewShop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EnterIdLabel;
    private javax.swing.JMenu backMenu;
    private javax.swing.JTable dataTable;
    private javax.swing.JButton goButton;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton makeDealButton;
    // End of variables declaration//GEN-END:variables
}
