
package codes;

//import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;
import java.sql.*; //Special code 


public class DBconnect {
    public static Connection connect(){
        Connection conn=null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project123","root","");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return conn;
    }
}
