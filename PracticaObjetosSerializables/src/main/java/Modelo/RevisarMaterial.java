/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
/**
 *
 * @author orepep
 */
public class RevisarMaterial implements Serializable{
    
    private String bibliotecaria;
    private String materialBibliografico;
    private String CodigoRevision;
    private Date fechaRevision;
    
    public RevisarMaterial(String bibliotecaria, String materialBibliografico) {
        this.fechaRevision = new Date();
        this.bibliotecaria = bibliotecaria;
        this.materialBibliografico = materialBibliografico;
        this.CodigoRevision = generarIDAutomatico();
    }
    
    private String generarIDAutomatico() {
    String uuid = UUID.randomUUID().toString();
    return uuid.replace("-", "");
    }

    public void setFechaInicio(String fechaInicio) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // Ajusta el formato de fecha según tus necesidades
            Date fecha = sdf.parse(fechaInicio);
            this.fechaRevision = fecha;
        } catch (ParseException e) {
            // Maneja la excepción en caso de que la cadena de fecha no sea válida
            e.printStackTrace();
        }
    }
    public String getFechaInicioAsString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // Define el formato de fecha que desees
        return sdf.format(fechaRevision); // Convierte la fecha a una cadena en el formato especificado
    }

    public String getBibliotecaria() {
        return bibliotecaria;
    }

    public void setBibliotecaria(String bibliotecaria) {
        this.bibliotecaria = bibliotecaria;
    }

    public String getMaterialBibliografico() {
        return materialBibliografico;
    }

    public void setMaterialBibliografico(String materialBibliografico) {
        this.materialBibliografico = materialBibliografico;
    }

    public String getCodigoRevision() {
        return CodigoRevision;
    }

    public void setCodigoRevision(String CodigoRevision) {
        this.CodigoRevision = CodigoRevision;
    }
    
}
