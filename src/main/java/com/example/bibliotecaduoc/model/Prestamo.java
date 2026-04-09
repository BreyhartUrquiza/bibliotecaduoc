package com.example.bibliotecaduoc.model;

import java.time.LocalDate;

public class Prestamo {

    private Integer idPrestamo;
    private Integer idLibro;
    private String runSolicitante;
    private LocalDate fechaSolicitud;
    private LocalDate fechaEntrega;
    private Integer cantidadDias;
    private Integer multas = 0;

    public Prestamo() {
    }

    public Integer getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(Integer idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Integer getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Integer idLibro) {
        this.idLibro = idLibro;
    }

    public String getRunSolicitante() {
        return runSolicitante;
    }

    public void setRunSolicitante(String runSolicitante) {
        this.runSolicitante = runSolicitante;
    }

    public LocalDate getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(LocalDate fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Integer getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(Integer cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public Integer getMultas() {
        return multas;
    }

    public void setMultas(Integer multas) {
        this.multas = multas;
    }
}