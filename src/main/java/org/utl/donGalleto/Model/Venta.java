package org.utl.donGalleto.Model;

import jakarta.persistence.*;

import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "venta")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private long idVenta;

    @Column(name = "cantidad")
    float cantidad;

    @Column(name = "total")
    String total;

    @Column(name = "fecha")
    Date fecha;


    @Column(name = "id_galleta")
    long idGalleta;

    public Venta() {
    }

    public Venta(long idVenta, float cantidad, String total, Date fecha, long idGalleta) {
        this.idVenta = idVenta;
        this.cantidad = cantidad;
        this.total = total;
        this.fecha = fecha;
        this.idGalleta = idGalleta;
    }

    public Venta(float cantidad, String total, Date fecha, long idGalleta) {
        this.cantidad = cantidad;
        this.total = total;
        this.fecha = fecha;
        this.idGalleta = idGalleta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public long getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(long idVenta) {
        this.idVenta = idVenta;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public long getIdGalleta() {
        return idGalleta;
    }

    public void setIdGalleta(long idGalleta) {
        this.idGalleta = idGalleta;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "idVenta=" + idVenta +
                ", cantidad='" + cantidad + '\'' +
                ", total='" + total + '\'' +
                ", idGalleta=" + idGalleta +
                '}';
    }
}
