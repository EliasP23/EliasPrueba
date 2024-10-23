/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streamflex;

/**
 *
 * @author Cetecom
 */
public class Documentales extends Contenidos implements ICostomensual {
    private boolean educativo;
    private int duracion;

    public Documentales() {
    }

    public Documentales(boolean educativo, int duracion) {
        this.educativo = educativo;
        this.duracion = duracion;
    }

    public boolean isEducativo() {
        return educativo;
    }

    public void setEducativo(boolean educativo) {
        this.educativo = educativo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Documentales{" + "educativo=" + educativo + ", duracion=" + duracion + '}';
    }
    
}
