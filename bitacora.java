/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.time.LocalDateTime;
import java.time.Duration;
/**
 *
 * @author elise
 */
public class bitacora {
    private LocalDateTime fechayhorainicio;
    private LocalDateTime fechayhorafinal;
    private Duration duraciondelviaje;
    private long kilometrajeInicial;
    private long kilometrajeFinal;
    private int distancia;
    private int tiempodeParadas;
    private String condicionesMeteorologicas;
    private String estadoDeLaCarretera;
    private String accidentesoincidentes;
    private int gastosDeCombustible;
    private int peajes;
    private int otrosGastos;
    private char firmadeChofer;

    public bitacora (LocalDateTime fechayhorainicio, LocalDateTime fechayhorafinal, Duration duraciondelviaje, long kilometrajeInicial, long kilometrajeFinal, int distancia, int tiempodeParadas, String condicionesMeteorologicas, String estadoDeLaCarretera, String accidentesoincidentes, int gastosDeCombustible, int peajes, int otrosGastos, char firmadeChofer){
        this.fechayhorainicio=fechayhorainicio;
        this.fechayhorafinal=fechayhorafinal;
        this.duraciondelviaje=duraciondelviaje;
        this.kilometrajeInicial=kilometrajeInicial;
        this.kilometrajeFinal=kilometrajeFinal;
        this.distancia=distancia;
        this.tiempodeParadas=tiempodeParadas;
        this.condicionesMeteorologicas=condicionesMeteorologicas;
        this.estadoDeLaCarretera=estadoDeLaCarretera;
        this.accidentesoincidentes=accidentesoincidentes;
        this.gastosDeCombustible=gastosDeCombustible;
        this.peajes=peajes;
        this.otrosGastos=otrosGastos;
        this.firmadeChofer=firmadeChofer;
    }  
    public LocalDateTime getFechayhorainicio (){
        return fechayhorainicio;
    }
    public void setFechayhorainicio(LocalDateTime fehcayhorainicio){
        this.fechayhorainicio=fechayhorainicio;
    }
    public LocalDateTime getFechayhorafinal (){
        return fechayhorafinal;
    }
    public void setFechayhorafinal(LocalDateTime fehcayhorafinal){
        this.fechayhorafinal=fechayhorafinal;
    }
    public Duration getDuraciondelviaje (){
        return duraciondelviaje;
    }
    public void setDuraciondelviaje (Duration duraciondelviaje){
        this.duraciondelviaje=duraciondelviaje;
    }
    public long getKilometrajeInicial (){
        return kilometrajeInicial;
    }
    public void setkilometrajeInicial (long kilometrajeInicial){
        this.kilometrajeInicial=kilometrajeInicial;
    }
    public long getKilometrajeFinal (){
        return kilometrajeFinal;
    }
    public void setKilometrajeFinal (long kilometrajeFinal){
        this.kilometrajeFinal=kilometrajeFinal;
    }
    public int getDistancia(){
        return distancia;
    }
    public void setDistancia (int distancia){
        this.distancia=distancia;
    }
    public int getTiempodeParadas (){
        return tiempodeParadas;
    }
    public void setTiempodeParadas (int tiempodeParadas){
        this.tiempodeParadas=tiempodeParadas;
    }
    public String getCondicionesMeteorologicas (){
        return condicionesMeteorologicas;
    }
    public void setCondicionesMeteorologicas (String condicionesMeteorologicas){
        this.condicionesMeteorologicas=condicionesMeteorologicas;
    }
    public String getEstadoDeLaCarretera (){
        return estadoDeLaCarretera;
    }
    public void setEstadoDeLaCarretera (String estadoDeLaCarretera){
        this.estadoDeLaCarretera=estadoDeLaCarretera;
    }
    public String getAccidentesoincidentes (){
        return accidentesoincidentes;
    }
    public void setAccidentesoincidentes (String accidentesoincidentes){
        this.accidentesoincidentes=accidentesoincidentes;
    }
    public int getGastosDeCombustible (){
        return gastosDeCombustible;
    }
    public void setGastosDeCombustible (int gastosDeCombustible){
        this.gastosDeCombustible=gastosDeCombustible;
    }
    public int getPeajes (){
        return peajes;
    }
    public void setPeajes (int peajes){
        this.peajes=peajes;
    }
    public int getOtrosGastos (){
        return otrosGastos;
    }
    public void setOtrosGastos (int otrosGastos){
        this.otrosGastos=otrosGastos;
    }
    public char getFirmadeChofer (){
        return firmadeChofer;
    }
    public void setFirmadeChofer (char firmadeChofer){
        this.firmadeChofer=firmadeChofer;
    }
    
}
 