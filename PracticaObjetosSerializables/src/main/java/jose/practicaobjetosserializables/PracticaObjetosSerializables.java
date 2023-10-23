/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package jose.practicaobjetosserializables;

import Ventana.Ventana1;
import java.io.IOException;
import org.xml.sax.SAXException;

/**
 *
 * @author jose
 */
public class PracticaObjetosSerializables {

    public static void main(String[] args) {
        Ventana1 ventana = null;
        try{
            ventana = new Ventana1();
            ventana.setVisible(true);
        }catch(IOException ex){
            ex.printStackTrace();
        }catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }catch(SAXException ex){
            ex.printStackTrace();
        }
    }
}
