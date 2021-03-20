
package ESTACIONAMIENTOO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conectar {
     
    Connection conectar;
    String bd="base";
    String url="jdbc:mysql://localhost:3307/"+bd;
    String user="root";
    String pass="12345";
    // ODBC - Object DabaBase Connection
    public Connection conexion (){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=(Connection)DriverManager.getConnection(url,user,pass);
            System.out.println("se conecto");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("no se conecto ");
        }
        return conectar;
        
    }
    public void desconectar(){
        try {
            conectar.close();
        } catch (SQLException ex) {
            System.out.println("no se pudo cerrar la conexion");
        }
    }
            public static void main(String[] args) {
        Conectar c=new Conectar();
        c.conexion();
    
        }  
    }

