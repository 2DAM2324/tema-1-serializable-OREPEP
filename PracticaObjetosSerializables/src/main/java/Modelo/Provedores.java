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
public class Provedores implements Serializable{
    
    private String codProvedor;//clave primaria 

    public Provedores(String codProvedor) {
        this.codProvedor = codProvedor;
    }

    public String getCodProvedor() {
        return codProvedor;
    }

    public void setCodProvedor(String codProvedor) {
        this.codProvedor = codProvedor;
    }
    
    
}
