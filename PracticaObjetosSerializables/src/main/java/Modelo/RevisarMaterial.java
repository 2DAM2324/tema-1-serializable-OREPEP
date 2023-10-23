/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.io.Serializable;
import java.util.Date;
/**
 *
 * @author orepep
 */
public class RevisarMaterial implements Serializable{
    
    private Date materialRevisadoEnEstaFecha;
    private Bibliotecaria bibliotecaria;
    private MaterialBibliografico materialBibliografico;
    private String CodigoRevision;

    public RevisarMaterial(Bibliotecaria bibliotecaria, String CodigoRevision) {
        this.materialRevisadoEnEstaFecha = new Date();
        this.bibliotecaria = bibliotecaria;
        this.CodigoRevision = CodigoRevision;
    }

    public Bibliotecaria getBibliotecaria() {
        return bibliotecaria;
    }

    public void setBibliotecaria(Bibliotecaria bibliotecaria) {
        this.bibliotecaria = bibliotecaria;
    }

    public String getCodigoRevision() {
        return CodigoRevision;
    }

    public void setCodigoRevision(String CodigoRevision) {
        this.CodigoRevision = CodigoRevision;
    }
    
}
