/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.Usuario;
import Modelo.Libro;
import Modelo.Prestamo;
import Modelo.Provedores;
import Modelo.Tesis;
import Modelo.baseDeDatos;
import java.util.ArrayList;
/**
 *
 * @author orepep
 */
public class Controlador {
       
    public Controlador(){
    }
    
    
    public void Crearcliente(String dni, String nombre, String telefono , String edad){
        
        Boolean ExisteCliente = true;
        ExisteCliente = ComprobarSiExisteCliente(dni);
        
        if((dni.isEmpty() == false ) && (nombre.isEmpty() == false ) && (telefono.isEmpty() == false ) && (edad.isEmpty() == false) && (ExisteCliente == false)){
        
            baseDeDatos bd = new baseDeDatos();
            Usuario usuario = new Usuario(dni,nombre, telefono,edad);
            
            ArrayList<Usuario> listaClientes = baseDeDatos.leerClientesDesdeArchivo("clientes");
            listaClientes.add(usuario);
            bd.escribirClientesEnArchivo(listaClientes, "clientes");
            
        }else{
            System.out.println("Rellenar Todos los campos o ya existe el cliente");
        }  
    }
    
    public void EliminarCliente(String dniCliente){
        baseDeDatos.eliminarCliente("clientes" , dniCliente);
    }
    public void EliminarLibro(String isbn){
        baseDeDatos.eliminarLibro("Libros", isbn);
    }
    public void EliminarTesis(String doi){
        baseDeDatos.eliminarTesis("Tesis", doi);
    }
    public void EliminarProvedor(String provedor){
        baseDeDatos.eliminarProvedor("Provedores", provedor);
    }
    public void EliminarPrestamo(String id){
        baseDeDatos.eliminarPrestamo("Prestamos", id);
    }
    
    public void CrearLibro(String Isbn , String titulo , String autor , String provedor){
        
        Boolean existeProvedor = true;
        existeProvedor = ComprobarSiExisteProvedor(provedor);
        
        Boolean existeIsbn = true;
        existeIsbn = ComprobarSiExisteIsbn(Isbn);
        
        Boolean existeDoi = true;
        existeDoi = ComprobarSiExisteDoi(Isbn);
        
        if((Isbn.isEmpty() == false ) && (titulo.isEmpty() == false ) && (autor.isEmpty() == false ) && (existeProvedor == true) && (existeIsbn == false) && (existeDoi == false)){
            baseDeDatos bd = new baseDeDatos();
            Libro libro = new Libro(Isbn,titulo,autor,provedor);

            ArrayList<Libro> listaLibros = baseDeDatos.leerLibrosDesdeArchivo("Libros");
            listaLibros.add(libro);
            bd.escribirLibrosEnArchivo(listaLibros , "Libros");
        }else{
            System.out.println("Completar todos los campos de libro o ya existe el isbn");
        }
    }
    
    public void CrearTesis( String doi , String titulo , String autor , String provedor){
        
        Boolean p = true;
        p = ComprobarSiExisteProvedor(provedor);
        
        Boolean existeDoi = true;
        existeDoi = ComprobarSiExisteDoi(doi);
        
        Boolean existeIsbn = true;
        existeIsbn = ComprobarSiExisteIsbn(doi);
        
        if((doi.isEmpty() == false ) && (titulo.isEmpty() == false ) && (autor.isEmpty() == false ) && (p == true) && (existeDoi == false) && (existeIsbn == false)){
            
        
            baseDeDatos bd = new baseDeDatos();
            Tesis tesis = new Tesis(doi,titulo,autor,provedor);
            boolean doiExistente = false;

            ArrayList<Tesis> listaTesis = baseDeDatos.leerTesisDesdeArchivo("Tesis");
            // Verificar si el doi del nuevo cliente ya existe en la lista

            for (Tesis tesisExistente : listaTesis) {
                if (tesisExistente.getDoi().equals(doi)) {
                    doiExistente = true;
                }
            }

            // Si el isbn no existe en la lista, agrega el nuevo cliente
            if (!doiExistente){
                listaTesis.add(tesis);
                bd.escribirTesisEnArchivo(listaTesis , "Tesis");
            }else{
                System.out.println("Ya existe un doi con ese identificador");
            }
            
            }else{
                System.out.println("Completar todos los campos de la tesis");
            }
 
    }
    
    public void CrearProvedor(String idProvedor){
        Boolean p = true;
        p = ComprobarSiExisteProvedor(idProvedor);
        
        if((idProvedor.isEmpty() == false ) && (p == false)){
            
            baseDeDatos bd = new baseDeDatos();
            Provedores provedor = new Provedores(idProvedor);
            
            ArrayList<Provedores> ListaProvedores = baseDeDatos.leerProveedoresDesdeArchivo("Provedores");

            ListaProvedores.add(provedor);
            bd.escribirProveedoresEnArchivo(ListaProvedores,"Provedores");
            
        }else{
            System.out.println("Completar todos los campos o ya existe el codigo de provedor");
        }
    }
    
    public void CrearPrestamo(String usuario , String materialBibliografico){
        
            if((usuario.isEmpty() == false ) && (materialBibliografico.isEmpty() == false )){
                Boolean comprobarUsuario = false;
                Boolean comprobarMaterialBibliografico = false;

                comprobarUsuario = ComprobarSiExisteCliente(usuario);
                comprobarMaterialBibliografico = ComprobarSiExisteIsbn(materialBibliografico);

                if(comprobarMaterialBibliografico == false ){
                    comprobarMaterialBibliografico = ComprobarSiExisteDoi(materialBibliografico);
                }
                if(comprobarUsuario == true && comprobarMaterialBibliografico == true){
                    baseDeDatos bd = new baseDeDatos();
                    Prestamo prestamo = new Prestamo(usuario,materialBibliografico);
                    ArrayList<Prestamo> ListaPrestamos = baseDeDatos.leerPrestamosDesdeArchivo("Prestamos");

                    ListaPrestamos.add(prestamo);
                    bd.escribirPrestamosEnArchivo(ListaPrestamos,"Prestamos");
                }
            }
            
    }
    
    public ArrayList GetClientesEnTabla(){
         baseDeDatos bd = new baseDeDatos();
         ArrayList<Usuario> listaClientes = baseDeDatos.leerClientesDesdeArchivo("clientes");
         return listaClientes;
    }
    
    public ArrayList GetLibrosEnTabla(){
         baseDeDatos bd = new baseDeDatos();
         ArrayList<Libro> listaLibros = baseDeDatos.leerLibrosDesdeArchivo("Libros");
         return listaLibros;
    }
    
    public ArrayList GetTesisEnTabla(){
         baseDeDatos bd = new baseDeDatos();
         ArrayList<Tesis> listaTesis = baseDeDatos.leerTesisDesdeArchivo("Tesis");
         return listaTesis;
    }
    public ArrayList GetProvedoresEnTabla(){
         baseDeDatos bd = new baseDeDatos();
         ArrayList<Provedores> listaProvedor = baseDeDatos.leerProveedoresDesdeArchivo("Provedores");
         return listaProvedor;
    }
    public ArrayList GetPrestamosEnTabla(){
        baseDeDatos bd = new baseDeDatos();
        ArrayList<Prestamo> listaPrestamos = baseDeDatos.leerPrestamosDesdeArchivo("Prestamos");
        return listaPrestamos;
    }
    
    private Boolean ComprobarSiExisteProvedor(String provedor){
        Boolean comprobarSiExiste = false ;
        
        ArrayList<Provedores> listaProvedor = GetProvedoresEnTabla();
        
        for(Provedores p : listaProvedor){
            if(provedor.equals(p.getCodProvedor())){
                comprobarSiExiste = true;
            }
        }
        
        return comprobarSiExiste;
    }
    
    private Boolean ComprobarSiExisteCliente(String idCliente){
        Boolean comprobarSiExiste = false;
        ArrayList<Usuario> listaClientes = GetClientesEnTabla();
        
        for (Usuario clienteExistente : listaClientes) {
                if (clienteExistente.getDni().equals(idCliente)) {
                    comprobarSiExiste = true;
                }
        }
        
        return comprobarSiExiste;
    }
    
    private Boolean ComprobarSiExisteIsbn(String isbn){
        Boolean comprobarSiExiste = false;
        ArrayList<Libro> listaLibros = GetLibrosEnTabla();
        
        for (Libro libroExistente : listaLibros) {
                if (libroExistente.getIsbn().equals(isbn)) {
                    comprobarSiExiste = true;
                }
        }
        
        return comprobarSiExiste;
    }
    
    private Boolean ComprobarSiExisteDoi(String doi){
        Boolean comprobarSiExiste = false;
        ArrayList<Tesis> listatesis = GetTesisEnTabla();
        
        for (Tesis doiExistente : listatesis) {
                if (doiExistente.getDoi().equals(doi)) {
                    comprobarSiExiste = true;
                }
        }
        
        return comprobarSiExiste;
    }
}
