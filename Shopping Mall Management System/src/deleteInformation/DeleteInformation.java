/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deleteInformation;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import static databaseStuffs.DatabaseMethods.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import screenshot.WriteLog;

/**
 *
 * @author Sirat
 */
public class DeleteInformation {

    public void deletePayment(String paymentId) {
        String paymentID = paymentId;
        String bill_id = "";
        String sql = "";
        try {

            //  System.out.println(""+sql);
            connectDB();

            statement = con.createStatement();
            resultSet = statement.executeQuery("SELECT bill_id FROM PAYMENT WHERE payment_id=" + paymentID);
            while (resultSet.next()) {
                bill_id = resultSet.getString(1);
            }
        } catch (SQLException ex1) {
            ex1.printStackTrace();
        }
        //
        try {
            sql = "DELETE FROM `shopping_mall_database`.`PAYMENT` WHERE `PAYMENT`.`payment_id` = " + paymentID;
            statement.execute(sql);
            new WriteLog("(-) Payment ID = "+paymentId+" Deleted.");
        } catch (SQLException ex2) {
            ex2.printStackTrace();
        }
        //
        try {
            sql = "DELETE FROM `shopping_mall_database`.`bill` WHERE `bill`.`bill_id` =" + bill_id;
            statement = con.createStatement();
            statement.execute(sql);//bill deleted  
            new WriteLog("(-) Bill ID = "+bill_id+" Deleted.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void deleteRent(String rentId) {
        String id = rentId;
        try {
            String sql = "select payment_id from payment where rent_id=" + id;
            String payment_id = null;
            DeleteInformation ob = new DeleteInformation();
            connectDB();
            statement2 = con.createStatement();
            resultSet2 = statement2.executeQuery(sql);
            while (resultSet2.next()) {

                payment_id = resultSet2.getString(1);
                ob.deletePayment(payment_id);

            }

            String sql2 = "DELETE FROM `shopping_mall_database`.`rent` WHERE `rent`.`rent_id` = " + id;
            statement2.execute(sql2);
            new WriteLog("(-) Rent ID = "+id+" Deleted.");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void deleteShop(String shopId) {
        String id = shopId;
        try {
            String sql = "select rent_id from rent where shop_id=" + id;
            String rent_id = null;
            DeleteInformation ob = new DeleteInformation();
            connectDB();
            statement3 = con.createStatement();
            resultSet3 = statement3.executeQuery(sql);
            while (resultSet3.next()) {

                rent_id = resultSet3.getString(1);
                if (rent_id != null && !rent_id.isEmpty()) {
                    ob.deleteRent(rent_id);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        try {
            statement = con.createStatement();
            String sql2 = "DELETE FROM `shopping_mall_database`.`shop` WHERE `shop`.`shop_id` = " + id;
            statement.execute(sql2);
            new WriteLog("(-) Shop ID = "+id+" Deleted.");
        } catch (SQLException ex) {
        }
    }
     public void deleteTenant(String tenantId) {
        String id = tenantId;
        try {
            String sql = "select rent_id from rent where tenant_id=" + id;
            String rent_id = null;
            DeleteInformation ob = new DeleteInformation();
            connectDB();
            statement3 = con.createStatement();
            resultSet3 = statement3.executeQuery(sql);
            while (resultSet3.next()) {

                rent_id = resultSet3.getString(1);
                if (rent_id != null && !rent_id.isEmpty()) {
                    ob.deleteRent(rent_id);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ///////////////////////////
        
        
        try {
            statement = con.createStatement();
            String sql2 = "DELETE FROM `shopping_mall_database`.`tenant` WHERE `tenant`.`tenant_id` = " + id;
            statement.execute(sql2);
            new WriteLog("(-) Tenant ID = "+id+" Deleted.");
        } catch (SQLException ex) {
        }
    }
     public void deleteReference(String referenceId){
         String id = referenceId;
         try {
             connectDB();
            
            try {
                 
                 String sql= "select tenant_id from tenant where reference_id="+id;
                 DeleteInformation ob = new DeleteInformation();
                 statement2 = con.createStatement();
                 resultSet2 = statement2.executeQuery(sql);
                 while (resultSet2.next()) {
                     
                   String  tenant_id = resultSet2.getString(1);
                     System.out.println("first del ten = "+tenant_id);
                     ob.deleteTenant(tenant_id);
                     System.out.println("ten= "+tenant_id+" del done");
                     
                 }
                 
             
             } catch (SQLException ex) {
                 Logger.getLogger(DeleteInformation.class.getName()).log(Level.SEVERE, null, ex);
             }
            connectDB();
             System.out.println("2nd con done");
            String sql = "DELETE FROM `shopping_mall_database`.`reference` WHERE `reference`.`reference_id` = " + id;
            statement = con.createStatement();
            statement.execute(sql);
            new WriteLog("(-) Reference ID = "+id+" Deleted.");
         
        }
         catch (SQLException ex) {
            ex.printStackTrace();
        } 
     }



}
