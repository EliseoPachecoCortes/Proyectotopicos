/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManejoTablas;

import Conexion.conex;
import Modelo.Autobus;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marco
 */
public class ManejoAutobus {
    public List<Autobus> obtenerAutobus() throws SQLException {
        List<Autobus> listaPueblos = new ArrayList<>();
        Connection con = conex.getConexion();

        if (con != null) {
            try (java.sql.Statement stmt = con.createStatement ();
                    ResultSet rs = stmt.executeQuery("SELECT autobus.id, autobus.placa, autobus.modelo, autobus.capacidad FROM proyecto.autobus"
)){
                    while (rs.next()) {
                        int id = rs.getInt("id");
                        String placa = rs.getString("placa");
                        String modelo=rs.getString("modelo"); 
                        int capacidad=rs.getInt("capacidad");
                        Autobus pueblo = new Autobus(id, placa, modelo,capacidad);
                        listaPueblos.add(pueblo);
                    }
                }
             catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return listaPueblos;
    }
}
