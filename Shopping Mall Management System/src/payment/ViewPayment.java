/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payment;

import static databaseStuffs.DatabaseMethods.con;
import static databaseStuffs.DatabaseMethods.resultSet;
import static databaseStuffs.DatabaseMethods.*;
import javax.swing.ImageIcon;

/**
 *
 * @author Sirat
 */
public class ViewPayment extends javax.swing.JFrame {

    String id = "";

    /**
     * Creates new form ViewPayment
     */
    public ViewPayment(String id) {
        initComponents();
        this.id = id;
        connectDB();
        setDetails();
        setVisible(true);
        ImageIcon icon=new ImageIcon("Image/logo.png");
        setIconImage(icon.getImage());
        setTitle("Shopping Mall Management System");
        setLocationRelativeTo(null);
     //   setResizable(false);
    }

    void setDetails() {
        String roomNo = "";
        String tenantName = "";
        String details = "";
        String bill_id = "";
        double gas_bill = 0;
        double electricity_bill = 0;
        double other_bill = 0;
        double rent = 0;
        double total = 0;
        try {
            statement = con.createStatement();
            resultSet = statement.executeQuery("SELECT room_no FROM `rent`,`shop` WHERE rent_id=" + id);
            while (resultSet.next()) {
                roomNo = resultSet.getString(1);
            }
            resultSet = statement.executeQuery("SELECT shop_name FROM `rent` WHERE rent_id=" + id);
            while (resultSet.next()) {
                tenantName = resultSet.getString(1);
            }
            roomNoTextField.setText("Room No : " + roomNo);
            shopNameTextField.setText("Shop Name : " + tenantName);
            statement = con.createStatement();
            resultSet = statement.executeQuery("select year,month, paying_date,bill_id,rent from payment where rent_id=" + id);
            while (resultSet.next()) {
                details = details + resultSet.getString(1);//year
                details = details + "       ------        " + resultSet.getString(2);//month
                details = details + "  ||        " + resultSet.getString(3);//date
                bill_id = resultSet.getString(4);//bill_id
                statement2 = con.createStatement();
                resultSet2 = statement2.executeQuery("select electricity_bill,gas_bill,other_bill from bill where bill_id=" + bill_id);
                while (resultSet2.next()) {
                    electricity_bill = resultSet2.getDouble(1);
                    details = details + "           ||" + electricity_bill;//electricity bill
                    gas_bill = resultSet2.getDouble(2);
                    details = details + "                            ||" + gas_bill;//gas bill
                    other_bill = resultSet2.getDouble(3);
                    details = details + "                       ||" + other_bill;//other bill
                }
                rent = resultSet.getDouble(5);
                total = electricity_bill + gas_bill + other_bill + rent;
                details = details + "                       ||" + rent + "               ||" + total + "\n";//rent
                details = details + "-------------------------------------------------------------------------------------------";
                details = details + "---------------------------------------------------------------------------------------------\n";
                detailsTextArea.setText(details);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        detailsTextArea = new javax.swing.JTextArea();
        roomNoTextField = new javax.swing.JTextField();
        shopNameTextField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        monthLabel = new javax.swing.JLabel();
        electricityBllLabel = new javax.swing.JLabel();
        gasBillLabel = new javax.swing.JLabel();
        otherBillLabel = new javax.swing.JLabel();
        rentLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        payingDateLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        paymentHomeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Payment History");

        detailsTextArea.setEditable(false);
        detailsTextArea.setColumns(20);
        detailsTextArea.setRows(5);
        jScrollPane1.setViewportView(detailsTextArea);

        roomNoTextField.setEditable(false);
        roomNoTextField.setText("Room No");

        shopNameTextField.setEditable(false);
        shopNameTextField.setText("Tenant Name");
        shopNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shopNameTextFieldActionPerformed(evt);
            }
        });

        monthLabel.setText("Year & Month No.");

        electricityBllLabel.setText("Electricity Bill");

        gasBillLabel.setText("Gas Bill");

        otherBillLabel.setText("Other Bill");

        rentLabel.setText("Rent");

        totalLabel.setText("Total");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);

        payingDateLabel.setText("Payment Date");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        paymentHomeButton.setText("Payement Home");
        paymentHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentHomeButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("YYYY-mm-DD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(paymentHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(shopNameTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                .addComponent(roomNoTextField, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(monthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(payingDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(electricityBllLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gasBillLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(otherBillLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roomNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shopNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator7)
                    .addComponent(gasBillLabel)
                    .addComponent(otherBillLabel)
                    .addComponent(rentLabel)
                    .addComponent(totalLabel)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(electricityBllLabel)
                    .addComponent(monthLabel)
                    .addComponent(jSeparator3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(payingDateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(paymentHomeButton))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void shopNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopNameTextFieldActionPerformed

    }//GEN-LAST:event_shopNameTextFieldActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new PreViewPayment();
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void paymentHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentHomeButtonActionPerformed
        new PaymentHome();
        this.dispose();
    }//GEN-LAST:event_paymentHomeButtonActionPerformed

    public static void main(String args[]) {
        new ViewPayment("1");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextArea detailsTextArea;
    private javax.swing.JLabel electricityBllLabel;
    private javax.swing.JLabel gasBillLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel monthLabel;
    private javax.swing.JLabel otherBillLabel;
    private javax.swing.JLabel payingDateLabel;
    private javax.swing.JButton paymentHomeButton;
    private javax.swing.JLabel rentLabel;
    private javax.swing.JTextField roomNoTextField;
    private javax.swing.JTextField shopNameTextField;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}
