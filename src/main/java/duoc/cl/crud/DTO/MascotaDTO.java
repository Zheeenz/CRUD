/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duoc.cl.crud.DTO;

/**
 *
 * @author Zhnz
 */
public class MascotaDTO {
    private String nombre;
    private String Duenio;
    private int edad;
    private int chip;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuenio() {
        return Duenio;
    }

    public void setDuenio(String Duenio) {
        this.Duenio = Duenio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getChip() {
        return chip;
    }

    public void setChip(int chip) {
        this.chip = chip;
    }

    public MascotaDTO(String nombre, String Duenio, int edad, int chip) {
        this.nombre = nombre;
        this.Duenio = Duenio;
        this.edad = edad;
        this.chip = chip;
    }
    
    public MascotaDTO() {
        this.nombre = "";
        this.Duenio = "";
        this.edad = 0;
        this.chip = 0;
    }

    @Override
    public String toString() {
        return     "\n MascotaDTO" 
                + "\n nombre: " + nombre 
                + "\n Duenio: " + Duenio 
                + "\n edad: " + edad 
                + "\n chip: " + chip
                + "\n ---------------------"
                +"\n ";
    }
}
