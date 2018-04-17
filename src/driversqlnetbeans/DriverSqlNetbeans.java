/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driversqlnetbeans;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class DriverSqlNetbeans {
    
    static String servidor="DESKTOP-BUDA6OR";//nombre instancia servidor
    static String puerto="1433";//puerto de comunicacion
    static String user="risin1";//usuario de registro en la base de datos
    static String password="devsav7";//contraseña de usuario en la base de datos
    static String BaseDatos="rins1";//nombre de mi base de datos
    String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";//DRIVER
    Connection con=null;
    
    public DriverSqlNetbeans() throws ClassNotFoundException {
    
        try{
            Class.forName(driver);
            String url = "jdbc:sqlserver://"+servidor+":"+puerto+";"+"databaseName="+BaseDatos+";user="+user+";password="+password+";";
            con=DriverManager.getConnection(url);
            JOptionPane.showMessageDialog(null,"Conexion Correcta a SQL SERVER 2008","Conexion SQL",JOptionPane.INFORMATION_MESSAGE);
            
        }catch (SQLException e) {
            
            System.out.println("SQL Exception: "+ e.toString());
            
        
        
        
        }
    
    
    
    }
public static void main(String[]args) throws ClassNotFoundException 
{
    DriverSqlNetbeans dsn = new DriverSqlNetbeans();
    
}    
    
    
    
}

