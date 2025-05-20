/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.*;

/**
 *
 * @author marco
 */
public class Viaje {
        //private Taxi idtaxi;
        private int idpasajero;
        private String pueblopartida;
        private String pueblodestino;
        private int monto;
        private Time horasalida;
        private Time horafin;
        private Date fechasalida;
        private boolean disponibilida;

    public Viaje() {
    }
        
    public Viaje(int idpasajero, String pueblopartida, String pueblodestino, int monto, Time horasalida, Time horafin, Date fechasalida, boolean disponibilida) {
        this.idpasajero = idpasajero;
        this.pueblopartida = pueblopartida;
        this.pueblodestino = pueblodestino;
        this.monto = monto;
        this.horasalida = horasalida;
        this.horafin = horafin;
        this.fechasalida = fechasalida;
        this.disponibilida = disponibilida;
    }


    public int getIdpasajero() {
        return idpasajero;
    }

    public String getPueblopartida() {
        return pueblopartida;
    }

    public String getPueblodestino() {
        return pueblodestino;
    }

    public int getMonto() {
        return monto;
    }

    public Time getHorasalida() {
        return horasalida;
    }

    public Time getHorafin() {
        return horafin;
    }

    public Date getFechasalida() {
        return fechasalida;
    }

    public boolean isDisponibilida() {
        return disponibilida;
    }
        
    
    
}
