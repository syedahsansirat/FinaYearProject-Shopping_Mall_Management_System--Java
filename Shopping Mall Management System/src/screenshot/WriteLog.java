/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screenshot;

import static databaseStuffs.DatabaseMethods.closeDB;
import static databaseStuffs.DatabaseMethods.con;
import static databaseStuffs.DatabaseMethods.connectDB;
import static databaseStuffs.DatabaseMethods.statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Sirat
 */
public class WriteLog {

    private String text;

    public WriteLog(String text) {
        try {
            this.text = text;

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  // '2018-08-29 06:18:00'
            LocalDateTime now = LocalDateTime.now(); 
            String dateTime = dtf.format(now);
            System.out.println(dateTime);

            connectDB();
            statement = con.createStatement();
            String sql = "INSERT INTO `log` (`time`, `text`) VALUES( '" + dateTime+ "', '" + this.text + "')";
            statement.executeUpdate(sql);
            closeDB();
        } catch (Exception ex) {
            System.out.println("Log Writing Failed");
            ex.printStackTrace();
             closeDB();
        }

    }

}
