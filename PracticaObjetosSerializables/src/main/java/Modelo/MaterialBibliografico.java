/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.ArrayList;
import java.io.Serializable;
/**
 *
 * @author orepep
 */
public class MaterialBibliografico implements Serializable {
    protected String titulo;
    protected String autor;
    protected String provedor;

    public MaterialBibliografico(String titulo, String autor , String provedor) {
        this.titulo = titulo;
        this.autor = autor;
        this.provedor = provedor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getProvedor() {
        return provedor;
    }

    public void setProvedor(String provedor) {
        this.provedor = provedor;
    }

}


