package org.utl.donGalleto.Model;
import org.springframework.stereotype.Component;

@Component
public class Inventario {

    private String nombre;
    private String cantidad;

    public Inventario() {
    }

    public Inventario(String nombre, String cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
