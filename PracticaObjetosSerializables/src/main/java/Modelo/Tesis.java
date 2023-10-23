/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.io.Serializable;
/**
 *
 * @author orepep
 */
public class Tesis extends MaterialBibliografico implements Serializable{
    
    private String doi;//clave primaria

    public Tesis(String doi, String titulo, String autor,String provedor) {
        super(titulo, autor , provedor);
        this.doi = doi;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }
    
}
