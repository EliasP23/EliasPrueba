/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streamflex;

/**
 *
 * @author Cetecom
 */
public class Usuario implements ICostomensual{
    private String idUsuario;
    private String nombre;
    private String contenidovisto;

    public Usuario() {
    }

    public Usuario(String idUsuario, String nombre, String contenidovisto) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.contenidovisto = contenidovisto;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContenidovisto() {
        return contenidovisto;
    }

    public void setContenidovisto(String contenidovisto) {
        this.contenidovisto = contenidovisto;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nombre=" + nombre + ", contenidovisto=" + contenidovisto + '}';
    }
    
}
