/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author elise
 */
public class autobus {
    private int idAutobus;
    private String placa;
    private String modelo;
    private int capacidad;
    private String estado;
    
    public autobus(int idAutobus, String placa, String modelo, int capacidad, String estado){
       this.idAutobus = idAutobus;
       this.placa = placa;
       this.modelo = modelo;
       this.capacidad = capacidad;
       this.estado = estado;
    }
        public int getIdAutobus (){
            return idAutobus;
        }
        public void setIdAutobus (int idAutobus){
            this.idAutobus=idAutobus;
        }
        public String getPlaca (){
            return placa;
        }
        public void setPlaca (String placa){
            this.placa=placa;
        }
        public String getModelo (){
            return modelo;
        }
        public void setModelo (String modelo){
            this.modelo=modelo;
        }
        public int getCapacidad (){
            return capacidad;
        }
        public void setCapacidad (int capacidad){
            this.capacidad=capacidad;
        }
        public String getEstado (){
            return estado;
        }
        public void setEstado (String estado){
            this.estado=estado;
        }
}
