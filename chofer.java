/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author elise
 */
public class chofer {
    private long idChofer;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private LocalDate fechadenacimiento;
    private String zona;
    private String telefono;
    private boolean estado;
    private int dni;
    
    
    public chofer(long idChofer, String nombre, String apellidoPaterno, String apellidoMaterno, String fechadenacimiento, String zona, String telefono, boolean estado, int dni){
       this.nombre = nombre;
       this.apellidoPaterno = apellidoPaterno;
       this.apellidoMaterno = apellidoMaterno;
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
       this.fechadenacimiento = LocalDate.parse(fechadenacimiento,formatter);
       this.zona = zona;
       this.telefono = telefono;
       this.estado = estado;
       this.dni=dni;
    }
        public String getNombre (){
            return nombre;
        }
        public void setNombre (String nombre){
            this.nombre=nombre;
        }
        public String getApellidoPaterno (){
            return apellidoPaterno;
        }
        public void setApellidoPaterno (String apellidoPaterno){
            this.apellidoPaterno=apellidoPaterno;
        }
        public String getApellidoMaterno (){
            return apellidoMaterno;
        }
        public void setApeliidoMaterno (String apellidoMaterno){
            this.apellidoMaterno=apellidoMaterno;
        }
        public String getFechadenacimiento (){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return fechadenacimiento.format(formatter);
        }
        public void setFechadenacimiento(LocalDate fechadenacimiento){
            this.fechadenacimiento=fechadenacimiento;
        }
        public String getZona (){
            return zona;
        }
        public void setZona (String zona){
            this.zona=zona;
        }
        public String getTelefono (){
            return telefono;
        }
        public void setTelefono (String telefono){
            this.telefono=telefono;
        }
        public boolean getEstado (){
            return estado;
        }
        public void setEstado (boolean estado){
            this.estado=estado;
        }
        public int getDni (){
            return dni;
        }
        public void setDni (int dni){
            this.dni=dni;
        }
}
