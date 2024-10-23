/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streamflex;

/**
 *
 * @author Cetecom
 */
public class Series extends Contenidos implements ICostomensual {
    private int numerodetemporadas;
    private boolean finalizado;

    public Series() {
    }

    public Series(int numerodetemporadas, boolean finalizado) {
        this.numerodetemporadas = numerodetemporadas;
        this.finalizado = finalizado;
    }

    public int getNumerodetemporadas() {
        return numerodetemporadas;
    }

    public void setNumerodetemporadas(int numerodetemporadas) {
        this.numerodetemporadas = numerodetemporadas;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public Series(int numerodetemporadas, boolean finalizado, String idContenidos, String recomendados) {
        super(idContenidos, recomendados);
        this.numerodetemporadas = numerodetemporadas;
        this.finalizado = finalizado;
    }

    @Override
    public String toString() {
        return "Series{" + "numerodetemporadas=" + numerodetemporadas + ", finalizado=" + finalizado + '}';
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
public double costoSuscripcion(){
    double costoMensual = costo_base;
    if(getnumerodetemporadas()> 3){
        costoMensual = series_3 * costoMensual;
 
    }
    return costoMensual;
}

    
    
    
}
