/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jFram;
import com.mysql.cj.jdbc.ConnectionWrapper;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Joel Arriola
 */
public class Conexion {
    public Connection Conectar()
    {
     Connection Conectar=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/Usuario","root","joelarriola");
           
            if(Conectar!=null){
                JOptionPane.showMessageDialog(null,"CONEXION EXITOSA");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERRO AL CONECTAR A LA BASE DE DATOS"+ e.toString());
        }
        return Conectar;
    } 
}
