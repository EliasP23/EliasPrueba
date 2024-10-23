/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streamflex;

/**
 *
 * @author Cetecom
 */
public class Peliculas extends Contenidos implements ICostomensual {
    private int duracion;
    private double clasificacion;

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(double clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Peliculas() {
    }

    public Peliculas(int duracion, double clasificacion) {
        this.duracion = duracion;
        this.clasificacion = clasificacion;
    }

    public Peliculas(int duracion, double clasificacion, String idContenidos, String recomendados) {
        super(idContenidos, recomendados);
        this.duracion = duracion;
        this.clasificacion = clasificacion;
    }

    public String getIdContenidos() {
        return idContenidos;
    }

    public void setIdContenidos(String idContenidos) {
        this.idContenidos = idContenidos;
    }

    public String getRecomendados() {
        return recomendados;
    }

    public void setRecomendados(String recomendados) {
        this.recomendados = recomendados;
    }

    public double getCostoMensual() {
        return costoMensual;
    }

    public void setCostoMensual(double costoMensual) {
        this.costoMensual = costoMensual;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "duracion=" + duracion + ", clasificacion=" + clasificacion + '}';
    }


    }
    

