 package Modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Element;
import org.w3c.dom.Text;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Document;

public class baseDeDatos{
        
    
    public static void escribirClientesEnArchivo(ArrayList<Usuario> listaClientes, String nombreArchivo) {
        try (FileOutputStream fileOut = new FileOutputStream(nombreArchivo);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {

            objectOut.writeObject(listaClientes);
            System.out.println("Clientes guardados en el archivo: " + nombreArchivo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static ArrayList<Usuario> leerClientesDesdeArchivo(String nombreArchivo) {
        ArrayList<Usuario> listaClientes = new ArrayList<>();

        try (FileInputStream fileIn = new FileInputStream(nombreArchivo);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

            listaClientes = (ArrayList<Usuario>) objectIn.readObject();
            System.out.println("Clientes cargados desde el archivo: " + nombreArchivo);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaClientes;
    }
    
    public static void eliminarCliente(String nombreArchivo, String dniCliente) {
    // Leer la lista de clientes desde el archivo
    ArrayList<Usuario> listaClientes = leerClientesDesdeArchivo(nombreArchivo);

    // Buscar el cliente con el DNI específico y eliminarlo
    for (Usuario cliente : listaClientes) {
        if (cliente.getDni().equals(dniCliente)) {
            listaClientes.remove(cliente);
            System.out.println("Cliente con DNI " + dniCliente + " eliminado con éxito.");
            break; // Salir del bucle una vez que se haya eliminado el cliente.
        }
    }

    // Guardar la lista de clientes actualizada en el archivo
    escribirClientesEnArchivo(listaClientes, nombreArchivo);
    }
    
        public static void eliminarLibro(String nombreArchivo, String isbnLibro) {
        try {
            ArrayList<Libro> listaLibros = leerLibrosDesdeArchivo(nombreArchivo);

            // Buscar el libro a eliminar en la lista en memoria y eliminarlo si se encuentra.
            Libro libroEncontrado = null;
            for (Libro libro : listaLibros) {
                if (libro.getIsbn().equals(isbnLibro)) {
                    libroEncontrado = libro;
                    break;
                }
            }

            if (libroEncontrado != null) {
                listaLibros.remove(libroEncontrado);
                escribirLibrosEnArchivo(listaLibros, nombreArchivo);
                System.out.println("Libro con ISBN " + isbnLibro + " eliminado con éxito.");
            } else {
                System.out.println("Libro con ISBN " + isbnLibro + " no encontrado.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void eliminarTesis(String nombreArchivo, String doiTesis) {
        try {
            ArrayList<Tesis> listaTesis = leerTesisDesdeArchivo(nombreArchivo);

            // Buscar la tesis a eliminar en la lista en memoria y eliminarla si se encuentra.
            Tesis tesisEncontrada = null;
            for (Tesis tesis : listaTesis) {
                if (tesis.getDoi().equals(doiTesis)) {
                    tesisEncontrada = tesis;
                    break;
                }
            }

            if (tesisEncontrada != null) {
                listaTesis.remove(tesisEncontrada);
                escribirTesisEnArchivo(listaTesis, nombreArchivo);
                System.out.println("Tesis con DOI " + doiTesis + " eliminada con éxito.");
            } else {
                System.out.println("Tesis con DOI " + doiTesis + " no encontrada.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void guardarDocumentoModificado(Document documento, String nombreArchivo) {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(documento);
            StreamResult result = new StreamResult(new File(nombreArchivo));
            transformer.transform(source, result);
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void escribirLibrosEnArchivo(ArrayList<Libro> listaLibros, String nombreArchivo) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            outputStream.writeObject(listaLibros);
            System.out.println("Libros escritos en el archivo " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Libro> leerLibrosDesdeArchivo(String nombreArchivo) {
        ArrayList<Libro> listaLibros = new ArrayList<>();

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            listaLibros = (ArrayList<Libro>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return listaLibros;
    }
    
    public static void escribirTesisEnArchivo(ArrayList<Tesis> listaTesis, String nombreArchivo) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            outputStream.writeObject(listaTesis);
            System.out.println("Tesis escritas en el archivo " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Tesis> leerTesisDesdeArchivo(String nombreArchivo) {
        ArrayList<Tesis> listaTesis = new ArrayList<>();

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            listaTesis = (ArrayList<Tesis>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return listaTesis;
    }

    
    public static void escribirProvedoresEnXML(ArrayList<Provedores> listaProvedor, String nombreArchivo) {
    try {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document documento = builder.newDocument();

        Element provedoresElement = documento.createElement("Provedores");
        documento.appendChild(provedoresElement);

        for (Provedores p : listaProvedor) {
            Element provedorElement = documento.createElement("Provedor");

            Element idProvedorElement = documento.createElement("idProvedor");
            Text pText = documento.createTextNode(p.getCodProvedor());
            idProvedorElement.appendChild(pText);

            provedorElement.appendChild(idProvedorElement);
            provedoresElement.appendChild(provedorElement);
        }

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(documento);
        StreamResult result = new StreamResult(new File(nombreArchivo));
        transformer.transform(source, result);

    } catch (Exception e) {
        e.printStackTrace();
    }
    }
    
    public static void escribirProveedoresEnArchivo(ArrayList<Provedores> listaProveedores, String nombreArchivo) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            outputStream.writeObject(listaProveedores);
            System.out.println("Proveedores escritos en el archivo " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Provedores> leerProveedoresDesdeArchivo(String nombreArchivo) {
        ArrayList<Provedores> listaProveedores = new ArrayList<>();

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            listaProveedores = (ArrayList<Provedores>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return listaProveedores;
    }
    
    public static void escribirPrestamosEnArchivo(ArrayList<Prestamo> listaPrestamos, String nombreArchivo) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            outputStream.writeObject(listaPrestamos);
            System.out.println("Prestamos escritos en el archivo " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Prestamo> leerPrestamosDesdeArchivo(String nombreArchivo) {
        ArrayList<Prestamo> listaPrestamos = new ArrayList<>();

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            listaPrestamos = (ArrayList<Prestamo>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return listaPrestamos;
    }
    
    public static void eliminarPrestamo(String nombreArchivo, String prestamoAEliminar) {
        ArrayList<Prestamo> listaPrestamos = leerPrestamosDesdeArchivo(nombreArchivo);

        // Buscar el préstamo a eliminar en la lista en memoria y eliminarlo si se encuentra.
        Prestamo prestamoEncontrado = null;
        for (Prestamo prestamo : listaPrestamos) {
            if (prestamo.getId().equals(prestamoAEliminar)) {
                prestamoEncontrado = prestamo;
                break;
            }
        }

        if (prestamoEncontrado != null) {
            listaPrestamos.remove(prestamoEncontrado);
            escribirPrestamosEnArchivo(listaPrestamos, nombreArchivo);
            System.out.println("Préstamo " + prestamoAEliminar + " eliminado con éxito.");
        } else {
            System.out.println("Préstamo " + prestamoAEliminar + " no encontrado.");
        }
    }
    
    public static void eliminarProvedor(String nombreArchivo, String proveedorAEliminar) {
        ArrayList<Provedores> listaProveedores = leerProveedoresDesdeArchivo(nombreArchivo);

        // Buscar el proveedor a eliminar en la lista en memoria y eliminarlo si se encuentra.
        Provedores proveedorEncontrado = null;
        for (Provedores proveedor : listaProveedores) {
            if (proveedor.getCodProvedor().equals(proveedorAEliminar)) {
                proveedorEncontrado = proveedor;
                break;
            }
        }

        if (proveedorEncontrado != null) {
            listaProveedores.remove(proveedorEncontrado);
            escribirProveedoresEnArchivo(listaProveedores, nombreArchivo);
            System.out.println("Proveedor " + proveedorAEliminar + " eliminado con éxito.");
        } else {
            System.out.println("Proveedor " + proveedorAEliminar + " no encontrado.");
        }
    }
    
    public static void escribirBibliotecariasEnArchivo(ArrayList<Bibliotecaria> listaBibliotecaria, String nombreArchivo) {
        try (FileOutputStream fileOut = new FileOutputStream(nombreArchivo);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {

            objectOut.writeObject(listaBibliotecaria);
            System.out.println("Bibliotecarias guardadas en el archivo: " + nombreArchivo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Bibliotecaria> leerBibliotecariasDesdeArchivo(String nombreArchivo) {
        ArrayList<Bibliotecaria> listaBibliotecaria = new ArrayList<>();

        try (FileInputStream fileIn = new FileInputStream(nombreArchivo);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

            listaBibliotecaria = (ArrayList<Bibliotecaria>) objectIn.readObject();
            System.out.println("Bibliotecarias cargadas desde el archivo: " + nombreArchivo);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaBibliotecaria;
    }

    public static void eliminarBibliotecaria(String nombreArchivo, String dniBibliotecaria) {
        // Leer la lista de bibliotecarias desde el archivo
        ArrayList<Bibliotecaria> listaBibliotecaria = leerBibliotecariasDesdeArchivo(nombreArchivo);

        // Buscar la bibliotecaria con el DNI específico y eliminarla
        Bibliotecaria bibliotecariaAEliminar = null;
        for (Bibliotecaria bibliotecaria : listaBibliotecaria) {
            if (bibliotecaria.getDni().equals(dniBibliotecaria)) {
                bibliotecariaAEliminar = bibliotecaria;
                break; // Salir del bucle una vez que se haya encontrado la bibliotecaria.
            }
        }

        if (bibliotecariaAEliminar != null) {
            listaBibliotecaria.remove(bibliotecariaAEliminar);
            escribirBibliotecariasEnArchivo(listaBibliotecaria, nombreArchivo);
            System.out.println("Bibliotecaria con DNI " + dniBibliotecaria + " eliminada con éxito.");
        } else {
            System.out.println("Bibliotecaria con DNI " + dniBibliotecaria + " no encontrada.");
        }
    }
}

