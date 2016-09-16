/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udu.usa.laboratorio.modelo;

/**
 *
 * @author fabian.giraldo
 */
public class Activo {
     private String nombreEquipo;
     private String fechaAdquisicion;
     private String codigo;
     private String marca;
     private String modelo ;
     private String ubicacion ;
     private String numeroSerie;
     private String funcionamiento; 
     private String referencia   ;
     private String  manual ;

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(String fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getFuncionamiento() {
        return funcionamiento;
    }

    public void setFuncionamiento(String funcionamiento) {
        this.funcionamiento = funcionamiento;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getManual() {
        return manual;
    }

    public void setManual(String manual) {
        this.manual = manual;
    }

    @Override
    public String toString() {
        return "Activo{" + "nombreEquipo=" + nombreEquipo + ", fechaAdquisicion=" + fechaAdquisicion + ", codigo=" + codigo + ", marca=" + marca + ", modelo=" + modelo + ", ubicacion=" + ubicacion + ", numeroSerie=" + numeroSerie + ", funcionamiento=" + funcionamiento + ", referencia=" + referencia + ", manual=" + manual + '}';
    }
     
     
           
           
}


 