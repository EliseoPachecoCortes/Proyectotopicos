/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.time.LocalTime;
/**
 *
 * @author elise
 */
public class horarioChofer {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private LocalTime horaInicio;
    private String dia;        
    private LocalTime horaFin;
    private boolean estado;
    private int totaldehorasprogramadas;
    private int diasTrabajados;
    private int diasLibres;
    
    public horarioChofer(String nombre, String apellidoPaterno, String apellidoMaterno, LocalTime horaInicio, String dia, LocalTime horaFin, boolean estado, int totaldehorasprogramadas, int diasTrabajados, int diasLibres) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.horaInicio = horaInicio;
        this.dia = dia;
        this.horaFin = horaFin;
        this.estado = estado;
        this.totaldehorasprogramadas = totaldehorasprogramadas;
        this.diasTrabajados = diasTrabajados;
        this.diasLibres = diasLibres;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getTotaldehorasprogramadas() {
        return totaldehorasprogramadas;
    }

    public void setTotaldehorasprogramadas(int totaldehorasprogramadas) {
        this.totaldehorasprogramadas = totaldehorasprogramadas;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public int getDiasLibres() {
        return diasLibres;
    }

    public void setDiasLibres(int diasLibres) {
        this.diasLibres = diasLibres;
    }
    
}
