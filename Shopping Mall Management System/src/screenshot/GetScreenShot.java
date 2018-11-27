package screenshot;

import static databaseStuffs.DatabaseMethods.con;
import static databaseStuffs.DatabaseMethods.connectDB;
import static databaseStuffs.DatabaseMethods.resultSet;
import static databaseStuffs.DatabaseMethods.statement;
import java.awt.AWTException;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 * @author : Syed Ahsan Sirat
 * @HelpLink: www.codejava.net
 * @HelpLink: Mr. Noushad Sojib, Lecturer, CSE, NEUB
 *
 */
public class GetScreenShot {

    private String screenshotStatus = "";
    
    public GetScreenShot(Component component, String name) {
        Rectangle rect = component.getBounds();
        
        try {
            connectDB();
            screenshotStatus = "";
            
            statement = con.createStatement();
            resultSet = statement.executeQuery("select status from screenshot");
            while (resultSet.next()) {
                screenshotStatus = resultSet.getString(1);
            }
        } catch (SQLException ex) {
            
        }
        if (screenshotStatus.matches("1")) {
            try {
                String format = "png";
                String fileName = "Screenshots/" + name + "_Screenshot." + format;
                BufferedImage captureImage
                        = new BufferedImage(rect.width, rect.height,
                                BufferedImage.TYPE_INT_ARGB);
                component.paint(captureImage.getGraphics());
                
                ImageIO.write(captureImage, format, new File(fileName));
                
                JOptionPane.showMessageDialog(component, "A Screenshot has Saved as" + fileName);
            } catch (IOException ex) {
                System.err.println(ex);
            }
        }
        
    }
    
    public void full() {//Full Desktop Screenshot
        try {
            Robot robot = new Robot();
            String format = "jpg";
            String fileName = "FullScreenshot." + format;
            
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
            ImageIO.write(screenFullImage, format, new File(fileName));
            
            System.out.println("A full screenshot saved!");
        } catch (AWTException | IOException ex) {
            System.err.println(ex);
        }
    }
    
    public void part() {//Part of Desktop Screenshot
        try {
            Robot robot = new Robot();
            String format = "jpg";
            String fileName = "PartialScreenshot." + format;
            
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            Rectangle captureRect = new Rectangle(0, 0, screenSize.width / 4, screenSize.height / 4);
            BufferedImage screenFullImage = robot.createScreenCapture(captureRect);
            ImageIO.write(screenFullImage, format, new File(fileName));
            
            System.out.println("A partial screenshot saved!");
        } catch (AWTException | IOException ex) {
            System.err.println(ex);
        }
        
    }
}
