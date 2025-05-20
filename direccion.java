/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author elise
 */
public class direccion {
    private String calle;
    private String numeroInterior;
    private String numeroExterior;
    private String colonia;
    private String municipio;
    private String estado;
    
    public direccion(String calle, String numeroInterior, String numeroExterior, String colonia, String municipio, String estado){
       this.calle = calle;
       this.numeroInterior = numeroExterior;
       this.colonia = colonia;
       this.municipio = municipio;
       this.estado = estado;
    }
        public String getCalle (){
            return calle;
        }
        public void setCalle (String calle){
            this.calle=calle;
        }
        public String getNumeroInterior (){
            return numeroInterior;
        }
        public void setNumeroInterior (String numeroInterior){
            this.numeroInterior=numeroInterior;
        }
        public String getNumeroExterior (){
            return numeroExterior;
        }
        public void setNumeroExterior (String numeroExterior){
            this.numeroExterior=numeroExterior;
        }
        public String getColonia (){
            return colonia;
        }
        public void setColonia (String colonia){
            this.colonia=colonia;
        }
        public String getMunicipio (){
            return municipio;
        }
        public void setMunicipio (String municipio){
            this.municipio=municipio;
        }
        public String getEstado (){
            return estado;
        }
        public void setEstado (String estado){
            this.estado=estado;
        }

}
