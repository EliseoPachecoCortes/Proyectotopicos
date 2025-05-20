/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManejoTablas;

/**
 *
 * @author salin
 */
import Conexion.conex;
import Modelo.*;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class ManejoViaje1 {  
    //ManejoTaxi manejotaxi = new ManejoTaxi();
 public List<MostrarViaje> obtenerViajes() throws SQLException {
    List<MostrarViaje> listaViajes = new ArrayList<>();
    Connection con = conex.getConexion();

    if (con != null) {
        try (PreparedStatement stmt = con.prepareStatement(
                "SELECT " +
                "u.usuario AS usuario_user, " +
                "p.nombre AS nombre_pasajero, " +
                "tx.numero AS numero_taxi, " +
                "t.nombre AS nombre_taxista, " +
                "v.pueblo_partida, " +
                "v.pueblo_destino, " +
                "v.horasalida AS hora_salida, " +
                "v.fechasalida AS fecha_salida " +
                "FROM viaje AS v " +
                "INNER JOIN pasajero AS p ON v.id_pasajero = p.id " +
                "INNER JOIN taxi AS tx ON v.id_taxi = tx.id " +
                "INNER JOIN conduce AS c ON c.id_taxi = tx.id " +
                "INNER JOIN taxista AS t ON c.id_taxista = t.id " +
                "INNER JOIN usuario AS u ON p.id_usuario = u.id")) {

            // Ejecutar la consulta
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    // Datos obtenidos del ResultSet
                    String usuario = rs.getString("usuario_user");
                    String nombrePasajero = rs.getString("nombre_pasajero");
                    String numeroTaxi = rs.getString("numero_taxi");
                    String nombreTaxista = rs.getString("nombre_taxista");
                    String puebloPartida = rs.getString("pueblo_partida");
                    String puebloDestino = rs.getString("pueblo_destino");
                    Time horaSalida = rs.getTime("hora_salida");
                    Date  fechaSalida = rs.getDate("fecha_salida");

                    // Crear objeto Viaje
                    MostrarViaje viaje = new MostrarViaje(usuario, nombrePasajero, numeroTaxi, nombreTaxista, puebloPartida, puebloDestino, horaSalida, fechaSalida);
                    listaViajes.add(viaje);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return listaViajes;
}

}
/*
        public void insertarViaje(int taxi, int pasajero, String pPartida, String pDestino, double monto, Time horaSalida, Time horaFin, Date fechaSalida) throws SQLException {
        Connection con = conex.getConexion();
        if (con != null) {
            try (PreparedStatement stmt = con.prepareStatement(
                    "INSERT INTO viaje (id_taxi, id_pasajero, pueblo_partida, pueblo_destino, monto, horasalida, horafin, fechasalida, disponibilidad ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)")) {

                stmt.setInt(1, taxi);
                stmt.setInt(2, pasajero);
                stmt.setString(3, pPartida);
                stmt.setString(4, pDestino);
                stmt.setDouble(5, monto);
                stmt.setTime(6, horaSalida);
                stmt.setTime(7, horaFin);
                stmt.setDate(8, fechaSalida);
                stmt.setBoolean(9, false);
                stmt.executeUpdate();

                
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
        
public MostrarViaje obtenerViajeUsuario(String user) throws SQLException {
    MostrarViaje viaje = null;
    Connection con = conex.getConexion();

    if (con != null) {
        try (PreparedStatement stmt = con.prepareStatement(
                "SELECT " +
                "u.usuario AS usuario_user, " +
                "p.nombre AS nombre_pasajero, " +
                "tx.numero AS numero_taxi, " +
                "t.nombre AS nombre_taxista, " +
                "v.pueblo_partida, " +
                "v.pueblo_destino, " +
                "v.horasalida, " +
                "v.fechasalida " +
                "FROM viaje AS v " +
                "INNER JOIN pasajero AS p ON v.id_pasajero = p.id " +
                "INNER JOIN taxi AS tx ON v.id_taxi = tx.id " +
                "INNER JOIN conduce AS c ON c.id_taxi = tx.id " +
                "INNER JOIN taxista AS t ON c.id_taxista = t.id " +
                "INNER JOIN usuario AS u ON p.id_usuario = u.id " +
                "WHERE u.usuario = ?")) {

            // Asignar el parámetro
            stmt.setString(1, user);

            // Ejecutar la consulta
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    // Datos obtenidos del ResultSet
                    String usuario = rs.getString("usuario_user");
                    String nombrePasajero = rs.getString("nombre_pasajero");
                    String numeroTaxi = rs.getString("numero_taxi");
                    String nombreTaxista = rs.getString("nombre_taxista");
                    String puebloPartida = rs.getString("pueblo_partida");
                    String puebloDestino = rs.getString("pueblo_destino");
                    Time horaSalida = rs.getTime("horasalida");
                    Date  fechaSalida = rs.getDate("fechasalida");
                    // Crear objeto Viaje
                    viaje = new MostrarViaje(usuario, nombrePasajero, numeroTaxi, nombreTaxista, puebloPartida, puebloDestino, horaSalida, fechaSalida);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return viaje;
}



public List<MostrarViaje> obtenerViajesSitio(int idSit) throws SQLException {
    List<MostrarViaje> listaviajes = new ArrayList<>();
    Connection con = conex.getConexion();

    if (con != null) {
        try (PreparedStatement stmt = con.prepareStatement(
                "SELECT " +
                "u.usuario AS usuario_user, " +
                "p.nombre AS nombre_pasajero, " +
                "tx.numero AS numero_taxi, " +
                "t.nombre AS nombre_taxista, " +
                "v.id_pasajero, "+
                "v.pueblo_partida, " +
                "v.pueblo_destino, " +
                "v.horasalida, " +
                "v.fechasalida " +
                "FROM viaje AS v " +
                "INNER JOIN pasajero AS p ON v.id_pasajero = p.id " +
                "INNER JOIN taxi AS tx ON v.id_taxi = tx.id " +
                "INNER JOIN conduce AS c ON c.id_taxi = tx.id " +
                "INNER JOIN taxista AS t ON c.id_taxista = t.id " +
                "INNER JOIN usuario AS u ON p.id_usuario = u.id " +
                "INNER JOIN sitio AS s ON tx.id_sitio = s.id "+
                "WHERE tx.id_sitio = ?")) {

            // Asignar el parámetro
            stmt.setInt(1, idSit);

            // Ejecutar la consulta
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    // Datos obtenidos del ResultSet
                    String usuario = rs.getString("usuario_user");
                    String nombrePasajero = rs.getString("nombre_pasajero");
                    String numeroTaxi = rs.getString("numero_taxi");
                    String nombreTaxista = rs.getString("nombre_taxista");
                    String puebloPartida = rs.getString("pueblo_partida");
                    String puebloDestino = rs.getString("pueblo_destino");
                    Time horaSalida = rs.getTime("horasalida");
                    Date  fechaSalida = rs.getDate("fechasalida");
                    // Crear objeto Viaje
                    MostrarViaje viaje = new MostrarViaje(usuario, nombrePasajero, numeroTaxi, nombreTaxista, puebloPartida, puebloDestino, horaSalida, fechaSalida);
                    listaviajes.add(viaje);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return listaviajes;
}


public MostrarViaje obtenerViajeSitioyUsuario(String user, int idSit) throws SQLException {
    MostrarViaje viaje = new MostrarViaje();
    Connection con = conex.getConexion();

    if (con != null) {
        try (PreparedStatement stmt = con.prepareStatement(
                "SELECT " +
                "u.usuario AS usuario_user, " +
                "p.nombre AS nombre_pasajero, " +
                "tx.numero AS numero_taxi, " +
                "t.nombre AS nombre_taxista, " +
                "v.pueblo_partida, " +
                "v.pueblo_destino, " +
                "v.horasalida, " +
                "v.fechasalida " +
                "FROM viaje AS v " +
                "INNER JOIN pasajero AS p ON v.id_pasajero = p.id " +
                "INNER JOIN taxi AS tx ON v.id_taxi = tx.id " +
                "INNER JOIN conduce AS c ON c.id_taxi = tx.id " +
                "INNER JOIN taxista AS t ON c.id_taxista = t.id " +
                "INNER JOIN usuario AS u ON p.id_usuario = u.id " +
                "INNER JOIN sitio AS s ON tx.id_sitio = s.id "+
                "WHERE u.nombre = ? AND s.id = ?")) {

            // Asignar el parámetro
            stmt.setString(1, user);
            stmt.setInt(2, idSit);

            // Ejecutar la consulta
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    // Datos obtenidos del ResultSet
                    String usuario = rs.getString("usuario_user");
                    String nombrePasajero = rs.getString("nombre_pasajero");
                    String numeroTaxi = rs.getString("numero_taxi");
                    String nombreTaxista = rs.getString("nombre_taxista");
                    String puebloPartida = rs.getString("pueblo_partida");
                    String puebloDestino = rs.getString("pueblo_destino");
                    Time horaSalida = rs.getTime("horasalida");
                    Date  fechaSalida = rs.getDate("fechasalida");
                    // Crear objeto Viaje
                     viaje = new MostrarViaje(usuario, nombrePasajero, numeroTaxi, nombreTaxista, puebloPartida, puebloDestino, horaSalida, fechaSalida);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return viaje;
}


public boolean existeviajehorainiciotaxi(Time horainicio, int idtax) throws SQLException{
   Connection con = conex.getConexion();
    boolean existe = false;
 if (con != null) {
        try (PreparedStatement stmt = con.prepareStatement(
                "SELECT COUNT(*) FROM viaje WHERE horasalida = ? AND id_taxi = ? ")) {
            stmt.setTime(1, horainicio);
            stmt.setInt(2, idtax);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next() && rs.getInt(1) > 0) {
                    existe = true; 
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return existe;    
}





public boolean existeviajefechataxi( Date fechaInicio, int idtax ) throws SQLException{
   Connection con = conex.getConexion();
    boolean existe = false;
 if (con != null) {
        try (PreparedStatement stmt = con.prepareStatement(
                "SELECT COUNT(*) FROM viaje WHERE fechainicio = ? AND id_taxi = ? ")) {
            stmt.setDate(1, fechaInicio);
            stmt.setInt(2, idtax);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next() && rs.getInt(1) > 0) {
                    existe = true; 
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return existe;    
}



public boolean existeviajehorafintaxifechafin(Time horafin, Date fechaini, int idtax) throws SQLException {
    String query = "SELECT COUNT(*) FROM viaje WHERE horafin = ? AND fechasalida = ? AND id_taxi = ?";
    boolean existe = false;

    // Try-with-resources garantiza el cierre automático de la conexión, el statement y el result set
    try (Connection con = conex.getConexion();
         PreparedStatement stmt = con.prepareStatement(query)) {
        
        stmt.setTime(1, horafin);
        stmt.setDate(2, fechaini);
        stmt.setInt(3, idtax);

        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next() && rs.getInt(1) > 0) {
                existe = true;
            }
        }
    } catch (SQLException e) {
        // Registra el error o vuelve a lanzarlo si es necesario
        e.printStackTrace();
        throw e;
    }

    return existe;
}


public boolean existeviajehrinhrfintaxfechin(Time horainicio, Time horafin, Date fechaini, int idtaxi) throws SQLException {
    String query = "SELECT COUNT(*) FROM viaje WHERE horasalida = ? AND horafin = ? AND fechasalida = ? AND id_taxi = ?";
    boolean existe = false;

    try (Connection con = conex.getConexion();
         PreparedStatement stmt = con.prepareStatement(query)) {
        
        stmt.setTime(1, horainicio);
        stmt.setTime(2, horafin);
        stmt.setDate(3, fechaini);
        stmt.setInt(4, idtaxi);

        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next() && rs.getInt(1) > 0) {
                existe = true;
            }
        }
    } catch (SQLException e) {
        // Maneja el error adecuadamente
        e.printStackTrace();
        throw e; // Si es necesario, lanza nuevamente la excepción
    }

    return existe;
}




public boolean existeviajehorafinpasajerofechafin(Time horafin, Date fechaini, int idpas) throws SQLException {
    boolean existe = false;
    String query = "SELECT COUNT(*) FROM viaje WHERE horafin = ? AND fechasalida = ? AND id_pasajero = ?";

    try (Connection con = conex.getConexion();
         PreparedStatement stmt = con.prepareStatement(query)) {

        stmt.setTime(1, horafin);
        stmt.setDate(2, fechaini);
        stmt.setInt(3, idpas);

        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next() && rs.getInt(1) > 0) {
                existe = true;
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        throw e; // Re-lanzar excepción si es necesario para manejarla en niveles superiores.
    }

    return existe;
}



public boolean existeviajehrinhrfinpasfechin(Time horainicio, Time horafin, Date fechaini, int idpas) throws SQLException {
    boolean existe = false;
    String query = "SELECT COUNT(*) FROM viaje WHERE horasalida = ? AND horafin = ? AND fechasalida = ? AND id_pasajero = ?";

    try (Connection con = conex.getConexion();
         PreparedStatement stmt = con.prepareStatement(query)) {

        stmt.setTime(1, horainicio);
        stmt.setTime(2, horafin);
        stmt.setDate(3, fechaini);
        stmt.setInt(4, idpas);

        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next() && rs.getInt(1) > 0) {
                existe = true;
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        throw e; // Re-lanzar excepción si es necesario para manejarla en niveles superiores.
    }

    return existe;
}



public List<Viaje> obtenerViajesTaxi(int idTaxi) throws SQLException {
    List<Viaje> listaviajes = new ArrayList<>();
    Connection con = conex.getConexion();

    if (con != null) {
        try (PreparedStatement stmt = con.prepareStatement(
                "SELECT " +
                "u.usuario AS usuario_user, " +
                "p.nombre AS nombre_pasajero, " +
                "tx.numero AS numero_taxi, " +
                "t.nombre AS nombre_taxista, " +
                "v.id_taxi, "+
                "v.id_pasajero, "+        
                "v.pueblo_partida, " +
                "v.pueblo_destino, " +
                "v.monto, "+        
                "v.horasalida, " +
                "v.horafin, "+
                "v.fechasalida, " +
                "v.disponibilidad "+
                "FROM viaje AS v " +
                "INNER JOIN pasajero AS p ON v.id_pasajero = p.id " +
                "INNER JOIN taxi AS tx ON v.id_taxi = tx.id " +
                "INNER JOIN conduce AS c ON c.id_taxi = tx.id " +
                "INNER JOIN taxista AS t ON c.id_taxista = t.id " +
                "INNER JOIN usuario AS u ON p.id_usuario = u.id " +
                "INNER JOIN sitio AS s ON tx.id_sitio = s.id "+
                "WHERE v.id_taxi = ?")) {

            // Asignar el parámetro
            stmt.setInt(1, idTaxi);

            // Ejecutar la consulta
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    // Datos obtenidos del ResultSet
                    int idtax = rs.getInt("id_taxi");
                    
                    int idpasa = rs.getInt("id_pasajero");
                    String puebloPartida = rs.getString("pueblo_partida");
                    String puebloDestino = rs.getString("pueblo_destino");
                    int mon = rs.getInt("monto");
                    Time horaSalida = rs.getTime("horasalida");
                    Time horafin = rs.getTime("horafin");
                    Date  fechaSalida = rs.getDate("fechasalida");
                    boolean disponibilidad = rs.getBoolean("disponibilidad");
                    // Crear objeto Viaje
                    //Taxi taxi = manejotaxi.obtenerTaxiPorID(idTaxi);
                    
                    Viaje viaje = new Viaje(idpasa, puebloPartida, puebloDestino, mon, horaSalida, horafin, fechaSalida, disponibilidad);
                    listaviajes.add(viaje);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return listaviajes;
}



public Viaje obtenerViajesFechas(Time hrfin, Date fecha, int idPas) throws SQLException {
    Viaje viaje = null;
    Connection con = conex.getConexion();

    if (con != null) {
        try (PreparedStatement stmt = con.prepareStatement(
                "SELECT " +
                "u.usuario AS usuario_user, " +
                "p.nombre AS nombre_pasajero, " +
                "tx.numero AS numero_taxi, " +
                "t.nombre AS nombre_taxista, " +
                "v.id_taxi, "+
                "v.id_pasajero, "+        
                "v.pueblo_partida, " +
                "v.pueblo_destino, " +
                "v.monto, "+        
                "v.horasalida, " +
                "v.horafin, "+
                "v.fechasalida, " +
                "v.disponibilidad "+
                "FROM viaje AS v " +
                "INNER JOIN pasajero AS p ON v.id_pasajero = p.id " +
                "INNER JOIN taxi AS tx ON v.id_taxi = tx.id " +
                "INNER JOIN conduce AS c ON c.id_taxi = tx.id " +
                "INNER JOIN taxista AS t ON c.id_taxista = t.id " +
                "INNER JOIN usuario AS u ON p.id_usuario = u.id " +
                "INNER JOIN sitio AS s ON tx.id_sitio = s.id "+
                "WHERE v.id_pasajero = ? AND v.horafin = ? AND v.fechasalida =  ? ")) {

            // Asignar el parámetro
            stmt.setInt(1, idPas);
            stmt.setTime(2, hrfin);
            stmt.setDate(3, fecha);

            // Ejecutar la consulta
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    // Datos obtenidos del ResultSet
                    int idtax = rs.getInt("id_taxi");
                    
                    int idpasa = rs.getInt("id_pasajero");
                    String puebloPartida = rs.getString("pueblo_partida");
                    String puebloDestino = rs.getString("pueblo_destino");
                    int mon = rs.getInt("monto");
                    Time horaSalida = rs.getTime("horasalida");
                    Time horafin = rs.getTime("horafin");
                    Date  fechaSalida = rs.getDate("fechasalida");
                    boolean disponibilidad = rs.getBoolean("disponibilidad");
                    // Crear objeto Viaje
                    //Taxi taxi = manejotaxi.obtenerTaxiPorID(idtax);
                    
                     viaje = new Viaje(idpasa, puebloPartida, puebloDestino, mon, horaSalida, horafin, fechaSalida, disponibilidad);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return viaje;
}
*/



