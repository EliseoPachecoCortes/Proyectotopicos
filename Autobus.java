package Modelo;
public class Autobus {
    private int id;
    private String placa;
    private String modelo;
    private int capacidad;

    public Autobus(int id, String placa, String modelo, int capacidad) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
}
