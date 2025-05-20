/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManejoTablas;

import Conexion.conex;
import Modelo.Pasajero;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author marco
 */
public class ManejoPasajero {
    public java.util.List <Pasajero> obtenerPasajeros() throws SQLException {
        java.util.List<Pasajero> listaPasajeros = new ArrayList<>();
        java.sql.Connection con = conex.getConexion();

        if (con != null) {
            try (java.sql.Statement stmt = con.createStatement ();
                    ResultSet rs = stmt.executeQuery("SELECT u.id, u.nombre,u.apellidos,u.tipousuario,u.numtarjeta,u.correo,u.contraseña FROM usuario AS u WHERE tipousuario='Pasajero'")) {
                    while (rs.next()) {
                        int id = rs.getInt("id");
                        String nombre = rs.getString("nombre");
                        String apellido=rs.getString("apellidos");
                        String tipousuario=rs.getString("tipousuario");
                        String numtarjeta=rs.getString("numtarjeta");
                        String correo=rs.getString("correo");
                        String contraseña=rs.getString("contraseña");
                        Pasajero pueblo = new Pasajero(id, nombre, apellido,tipousuario,numtarjeta,correo,contraseña);
                        listaPasajeros.add(pueblo);
                    }
                }
             catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return listaPasajeros;
    }
}
