/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author elise
 */
public class licencia {
    private int idLicencia;
    private String estado;
    private boolean vigencia;
    private String tipo;
    private int idChofer;
    
    public licencia(int idLicencia, String estado, boolean vigencia, String tipo, int idChofer){
       this.idLicencia = idLicencia;
       this.estado = estado;
       this.vigencia = vigencia;
       this.tipo = tipo;
       this.idChofer = idChofer;
    }
    
    public int getIdLicencia() {
        return idLicencia;
    }
    public void setIdLicencia(int idLicencia) {
        this.idLicencia = idLicencia;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public boolean getVigencia() {
        return vigencia;
    }
    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getIdChofer() {
        return idChofer;
    }
    public void setIdChofer(int idChofer) {
        this.idChofer = idChofer;
    }
}
