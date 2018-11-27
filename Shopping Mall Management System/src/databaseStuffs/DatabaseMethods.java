package databaseStuffs;

/**
 * @author Sirat
 */
import java.sql.*;
import java.util.*;

public class DatabaseMethods {

    public static Connection con;
    public static PreparedStatement preparedStatement;
    public static Statement statement;
    public static Statement statement2;
    public static Statement statement3;
    public static ResultSet resultSet;
    public static ResultSet resultSet2;
    public static ResultSet resultSet3;
    public static String querry;
    public static String dbLinkUrl;

    public static void connectDB() {
        try {
            dbLinkUrl = "jdbc:mysql://localhost/shopping_mall_database";
            con = DriverManager.getConnection(dbLinkUrl, "root", "");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void closeDB() {
        try {
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

}
