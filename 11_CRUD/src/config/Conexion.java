/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jvale
 */
public class Conexion {
    Connection con;
    public Conexion(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registro", "root", "");
        } catch (SQLException e) {
            System.err.println("Error:" + e);
        }        
    }
    public Connection getConnection(){
        return con;
    }
}
