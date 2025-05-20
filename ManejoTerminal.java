package ManejoTablas;

import Conexion.conex;
import Modelo.Terminal;
import java.util.ArrayList;
import java.sql.*;

public class ManejoTerminal {
     public java.util.List <Terminal> obtenerTerminal() throws SQLException {
        java.util.List<Terminal> listaPueblos = new ArrayList<>();
        java.sql.Connection con = conex.getConexion();

        if (con != null) {
            try (java.sql.Statement stmt = con.createStatement ();
                    ResultSet rs = stmt.executeQuery("SELECT t.id, t.nombre,t.localidad,t.calle,t.numero,t.codpostal " +"FROM terminal AS t ")) {
                    while (rs.next()) {
                        int id = rs.getInt("id");
                        String nombre = rs.getString("nombre");
                        String localidad=rs.getString("localidad");
                        String calle=rs.getString("calle");
                        String numero=rs.getString("numero");
                        String codpostal=rs.getString("codpostal");
                        Terminal pueblo = new Terminal(id, nombre, localidad,calle,numero,codpostal);
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