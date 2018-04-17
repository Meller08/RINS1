/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rins.pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class conexion   {
   Connection conexion;
     Statement sentencia;

 public void PrepararBaseDatos() {
        try{
            String controlador="sun.jdbc.odbc.JdbcOdbcDriver";
            Class.forName (controlador).newInstance();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar el Controlador");
        }
        try {
            String DSN="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ="+"BDRins-11BD.accdb";
            String user="";
            String password="";
            conexion=DriverManager.getConnection(DSN,user,password);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al realizar la conexion "+e);
        }
        try {
            sentencia=conexion.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al crear el objeto sentencia "+e);
        }
     }
} 
