/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.UUID;
import java.io.Serializable;

/**
 *
 * @author orepep
 */
public class Prestamo implements Serializable {
    
    private String id;
    private Date fechaInicio;
    private Date fechaVencimiento;
    private boolean activo;
    private String usuario;
    private String materialBibliografico;

    public Prestamo(String usuario, String materialBibliografico) {
        
        this.id = generarIDAutomatico();
        this.activo = activo;
        this.usuario = usuario;
        this.materialBibliografico = materialBibliografico;

        // Obtener la fecha actual
        fechaInicio = new Date();

        // Calcular la fecha de vencimiento 30 días después
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaInicio);
        calendar.add(Calendar.DAY_OF_MONTH, 30);
        fechaVencimiento = calendar.getTime();
    }
    
    public Prestamo(String id, String usuario, String materialBibliografico , String fechaInicio , String fechaVencimiento) {
        
        this.id = id;
        this.activo = activo;
        this.usuario = usuario;
        this.materialBibliografico = materialBibliografico;
        this.setFechaInicio(fechaInicio);
        this.setFechaVencimiento(fechaVencimiento);
    }
    
    private String generarIDAutomatico() {
    String uuid = UUID.randomUUID().toString();
    return uuid.replace("-", "");
    }

    public String getFechaInicioAsString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // Define el formato de fecha que desees
        return sdf.format(fechaInicio); // Convierte la fecha a una cadena en el formato especificado
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public void setFechaInicio(String fechaInicio) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // Ajusta el formato de fecha según tus necesidades
            Date fecha = sdf.parse(fechaInicio);
            this.fechaInicio = fecha;
        } catch (ParseException e) {
            // Maneja la excepción en caso de que la cadena de fecha no sea válida
            e.printStackTrace();
        }
    }

    public String getFechaVencimiento() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // Define el formato de fecha que desees
        return sdf.format(fechaVencimiento); // Convierte la fecha a una cadena en el formato especificado
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    public void setFechaVencimiento(String fechaVencimiento) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // Ajusta el formato de fecha según tus necesidades
            Date fecha = sdf.parse(fechaVencimiento);
            this.fechaVencimiento = fecha;
        } catch (ParseException e) {
            // Maneja la excepción en caso de que la cadena de fecha no sea válida
            e.printStackTrace();
        }
    }

    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getMaterialBibliografico() {
        return materialBibliografico;
    }

    public void setMaterialBibliografico(String materialBibliografico) {
        this.materialBibliografico = materialBibliografico;
    }
    
}
