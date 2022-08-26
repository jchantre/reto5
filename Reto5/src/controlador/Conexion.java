/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jairo
 */
public class Conexion {
    
    public static Connection Conectar(){
        Connection con=null;
        try {
            con=DriverManager.getConnection("jdbc:sqlite:BD_IRCA_Aplicativo.db");
            System.out.println("Conexion exitosa");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return con;
        
    }
    
}
