/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author salin
 */
import java.sql.*;

public class MostrarViaje {
    private String usuario;
   private String pasajero;
    private String taxi;
    private String taxista;
    private String pueblo_partida;
    private String pueblo_destino;
    private Time hora_salida;
    private Date fecha_salida;
    

    public MostrarViaje() {
    }

    public MostrarViaje(String usuario, String pasajero, String taxi, String taxista, String pueblo_partida, String pueblo_destino, Time hora_salida, Date fecha_salida) {
        this.usuario = usuario;
        this.pasajero = pasajero;
        this.taxi = taxi;
        this.taxista = taxista;
        this.pueblo_partida = pueblo_partida;
        this.pueblo_destino = pueblo_destino;
        this.hora_salida = hora_salida;
        this.fecha_salida = fecha_salida;
    }

   

    public String getUsuario() {
        return usuario;
    }

    public String getPasajero() {
        return pasajero;
    }

    public String getTaxi() {
        return taxi;
    }

    public String getTaxista() {
        return taxista;
    }

    public String getPueblo_partida() {
        return pueblo_partida;
    }

    public String getPueblo_destino() {
        return pueblo_destino;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public Time getHora_salida() {
        return hora_salida;
    }

    
@Override
    public String toString() {
        return this.taxi;
    }
    
}
