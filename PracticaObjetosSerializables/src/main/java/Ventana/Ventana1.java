/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import Modelo.Bibliotecaria;
import Modelo.Libro;
import Modelo.Prestamo;
import Modelo.Provedores;
import Modelo.RevisarMaterial;
import Modelo.Tesis;
import Modelo.Usuario;
import Controlador.Controlador;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.NotSerializableException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.xml.sax.SAXException;

/**
 *
 * @author Patricia Burgos
 */
public class Ventana1 extends javax.swing.JFrame {

    private Controlador controlador;
    /**
     * Creates new form Ventana1
     */
    public Ventana1() throws IOException, FileNotFoundException, ClassNotFoundException, NotSerializableException, SAXException {
        initComponents();
        controlador = new Controlador();
        
        
        TablaClientes = new DefaultTableModel();
        TablaClientes.addColumn("Nombre");
        TablaClientes.addColumn("Dni");
        this.jTable_persona.setModel(TablaClientes);
        MostrarClientesEnTabla();
        
        ModeloTablaLibros = new DefaultTableModel();
        ModeloTablaLibros.addColumn("Titulo");
        ModeloTablaLibros.addColumn("ISBN");
        this.jTable_libro.setModel(ModeloTablaLibros);
        MostrarLibrosEnTabla();
        
        ModeloTablaTesis = new DefaultTableModel();
        ModeloTablaTesis.addColumn("Titulo");
        ModeloTablaTesis.addColumn("Doi");
        this.jTable_Tesis.setModel(ModeloTablaTesis);
        MostrarTesisEnTabla();
        
        modeloProvedor = (DefaultTableModel) jTable_provedor.getModel();
        this.jTable_provedor.setModel(modeloProvedor);
        MostrarProvedoresEnTabla();
        
        modeloPrestamo2 = (DefaultTableModel) jTable_prestamo.getModel();
        this.jTable_prestamo.setModel(modeloPrestamo2);
        MostrarPrestamoEnTabla();
        
        modeloBibliotecaria = (DefaultTableModel) jTable_Bibliotecaria.getModel();
        this.jTable_Bibliotecaria.setModel(modeloBibliotecaria);
        MostrarBibliotecariaEnTabla();
        
        modeloRevision = (DefaultTableModel) jTable_revison.getModel();
        this.jTable_revison.setModel(modeloRevision);
        MostrarRevisionEnTabla();
        
        
    }
    
    
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel_persona = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_persona = new javax.swing.JTable();
        jLabel_nombre_persona = new javax.swing.JLabel();
        jLabel_DNI = new javax.swing.JLabel();
        jLabel_edad_persona = new javax.swing.JLabel();
        jTextField_edad_persona = new javax.swing.JTextField();
        jTextField_nombre_persona = new javax.swing.JTextField();
        jTextField_DNI = new javax.swing.JTextField();
        jButton_cancelar_persona = new javax.swing.JButton();
        jButton_borrar_persona = new javax.swing.JButton();
        jButton_modificar_persona = new javax.swing.JButton();
        jButton_aniadir_persona = new javax.swing.JButton();
        jLabel_ciudad_natal = new javax.swing.JLabel();
        jTextField_Telefono_cliente = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        jPanel_libro = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_libro = new javax.swing.JTable();
        jLabel_nombre_libro = new javax.swing.JLabel();
        jLabel_autor = new javax.swing.JLabel();
        jLabel_edad_recomendada = new javax.swing.JLabel();
        jTextField_isbn = new javax.swing.JTextField();
        jTextField_nombre_libro = new javax.swing.JTextField();
        jTextField_autor = new javax.swing.JTextField();
        jButton_cancelar_libro = new javax.swing.JButton();
        jButton_borrar_libro = new javax.swing.JButton();
        jButton_modificar_libro = new javax.swing.JButton();
        jButton_aniadir_libro = new javax.swing.JButton();
        jLabel_anio_publicacion = new javax.swing.JLabel();
        jTextField_provedor = new javax.swing.JTextField();
        GuardarLibro = new javax.swing.JButton();
        jPanel_biblioteca = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Tesis = new javax.swing.JTable();
        jLabel_nombre_biblioteca = new javax.swing.JLabel();
        jLabel_telefono = new javax.swing.JLabel();
        jLabel_direccion = new javax.swing.JLabel();
        jTextField_titulo_tesis = new javax.swing.JTextField();
        jTextField_autor_tesis = new javax.swing.JTextField();
        jTextField_doi = new javax.swing.JTextField();
        jButton_cancelar_biblioteca = new javax.swing.JButton();
        jButton_aniadir_biblioteca = new javax.swing.JButton();
        jButton_modificar_biblioteca = new javax.swing.JButton();
        jButton_borrar_biblioteca = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel_anio_publicacion1 = new javax.swing.JLabel();
        jTextField_doi1 = new javax.swing.JTextField();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable_provedor = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField_provedorTabla = new javax.swing.JTextField();
        jButton_eliminar_provedor = new javax.swing.JButton();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Bibliotecaria = new javax.swing.JTable();
        jButton_modificar_bibliotecaria = new javax.swing.JButton();
        jButton_borrar_bibliotecaria = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField_dni_bibliotecaria = new javax.swing.JTextField();
        jButton_anaidr_bibliotecaria = new javax.swing.JButton();
        jButton_guardar_bibliotecaria = new javax.swing.JButton();
        jButton_cancelar_bibliotecaria = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable_prestamo = new javax.swing.JTable();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable_revison = new javax.swing.JTable();
        jButton_modificar_revision = new javax.swing.JButton();
        jButton_borrar_revision = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_bibliotecaria_revison = new javax.swing.JTextField();
        jTextField_material_revision = new javax.swing.JTextField();
        jButton_añadir_revision = new javax.swing.JButton();
        jButton_guardar_revision = new javax.swing.JButton();
        jButton_cancelar_revision = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_persona.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                BorrarCliente(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jTable_persona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "DNI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable_persona);
        if (jTable_persona.getColumnModel().getColumnCount() > 0) {
            jTable_persona.getColumnModel().getColumn(0).setResizable(false);
            jTable_persona.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel_nombre_persona.setText("Nombre:");

        jLabel_DNI.setText("DNI:");

        jLabel_edad_persona.setText("Edad:");

        jTextField_edad_persona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextoEdadPersona(evt);
            }
        });

        jTextField_nombre_persona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextoNombreCliente(evt);
            }
        });

        jTextField_DNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextoDniCliente(evt);
            }
        });

        jButton_cancelar_persona.setText("Cancelar");
        jButton_cancelar_persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarCliente(evt);
            }
        });

        jButton_borrar_persona.setText("Borrar");
        jButton_borrar_persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarClientes(evt);
            }
        });

        jButton_modificar_persona.setText("Modificar");
        jButton_modificar_persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarCliente(evt);
            }
        });

        jButton_aniadir_persona.setText("Añadir");
        jButton_aniadir_persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirCliente(evt);
            }
        });

        jLabel_ciudad_natal.setText("Teléfono");

        jTextField_Telefono_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextoTelefonoCliente(evt);
            }
        });

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarCliente(evt);
            }
        });

        javax.swing.GroupLayout jPanel_personaLayout = new javax.swing.GroupLayout(jPanel_persona);
        jPanel_persona.setLayout(jPanel_personaLayout);
        jPanel_personaLayout.setHorizontalGroup(
            jPanel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_personaLayout.createSequentialGroup()
                .addGroup(jPanel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_personaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_modificar_persona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_borrar_persona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel_personaLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_nombre_persona)
                            .addComponent(jLabel_DNI)
                            .addComponent(jLabel_edad_persona)
                            .addComponent(jLabel_ciudad_natal))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_nombre_persona, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(jTextField_DNI)
                            .addComponent(jTextField_edad_persona)
                            .addComponent(jTextField_Telefono_cliente, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_cancelar_persona)
                            .addGroup(jPanel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Guardar)
                                .addComponent(jButton_aniadir_persona, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_personaLayout.setVerticalGroup(
            jPanel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_personaLayout.createSequentialGroup()
                .addGroup(jPanel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_personaLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jButton_modificar_persona, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_borrar_persona))
                    .addGroup(jPanel_personaLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_personaLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_nombre_persona)
                            .addComponent(jTextField_nombre_persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_DNI)
                            .addComponent(jTextField_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_personaLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButton_aniadir_persona)))
                .addGroup(jPanel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_personaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_edad_persona)
                            .addComponent(jTextField_edad_persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_personaLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(Guardar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ciudad_natal)
                    .addComponent(jTextField_Telefono_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_cancelar_persona))
                .addContainerGap(191, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cliente", jPanel_persona);

        jTable_libro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Isbn"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable_libro);
        if (jTable_libro.getColumnModel().getColumnCount() > 0) {
            jTable_libro.getColumnModel().getColumn(0).setResizable(false);
            jTable_libro.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel_nombre_libro.setText("Titulo:");

        jLabel_autor.setText("Autor:");

        jLabel_edad_recomendada.setText("ISBN");

        jTextField_isbn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextIsbnLibro(evt);
            }
        });

        jTextField_nombre_libro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextNombreLibro(evt);
            }
        });

        jTextField_autor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextAutorLibro(evt);
            }
        });

        jButton_cancelar_libro.setText("Cancelar");
        jButton_cancelar_libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarLibro(evt);
            }
        });

        jButton_borrar_libro.setText("Borrar");
        jButton_borrar_libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarLibro(evt);
            }
        });

        jButton_modificar_libro.setText("Modificar");
        jButton_modificar_libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarLibro(evt);
            }
        });

        jButton_aniadir_libro.setText("Añadir");
        jButton_aniadir_libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirLibro(evt);
            }
        });

        jLabel_anio_publicacion.setText("Provedor");

        jTextField_provedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextoProvedorLibro(evt);
            }
        });

        GuardarLibro.setText("Guardar");
        GuardarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarLibro(evt);
            }
        });

        javax.swing.GroupLayout jPanel_libroLayout = new javax.swing.GroupLayout(jPanel_libro);
        jPanel_libro.setLayout(jPanel_libroLayout);
        jPanel_libroLayout.setHorizontalGroup(
            jPanel_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_libroLayout.createSequentialGroup()
                .addGroup(jPanel_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_libroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_modificar_libro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_borrar_libro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel_libroLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_nombre_libro)
                            .addComponent(jLabel_autor)
                            .addComponent(jLabel_edad_recomendada)
                            .addComponent(jLabel_anio_publicacion))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField_provedor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_nombre_libro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(jTextField_autor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_isbn, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GuardarLibro)
                            .addComponent(jButton_aniadir_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_cancelar_libro))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_libroLayout.setVerticalGroup(
            jPanel_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_libroLayout.createSequentialGroup()
                .addGroup(jPanel_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_libroLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jButton_modificar_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_borrar_libro))
                    .addGroup(jPanel_libroLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(jPanel_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nombre_libro)
                    .addComponent(jTextField_nombre_libro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_aniadir_libro))
                .addGroup(jPanel_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_libroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_autor)
                            .addComponent(jTextField_autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_edad_recomendada)
                            .addComponent(jTextField_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_libroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_anio_publicacion)
                            .addComponent(jTextField_provedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_libroLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(GuardarLibro)
                        .addGap(26, 26, 26)
                        .addComponent(jButton_cancelar_libro)))
                .addContainerGap(197, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Libro", jPanel_libro);

        jTable_Tesis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable_Tesis);
        if (jTable_Tesis.getColumnModel().getColumnCount() > 0) {
            jTable_Tesis.getColumnModel().getColumn(0).setResizable(false);
            jTable_Tesis.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel_nombre_biblioteca.setText("Título");

        jLabel_telefono.setText("Autor");

        jLabel_direccion.setText("Doi");

        jTextField_titulo_tesis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Texto_titulo_tesis(evt);
            }
        });

        jTextField_autor_tesis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextAutor(evt);
            }
        });

        jTextField_doi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextoDoi(evt);
            }
        });

        jButton_cancelar_biblioteca.setText("Cancelar");
        jButton_cancelar_biblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarTesis(evt);
            }
        });

        jButton_aniadir_biblioteca.setText("Añadir");
        jButton_aniadir_biblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirTesis(evt);
            }
        });

        jButton_modificar_biblioteca.setText("Modificar");
        jButton_modificar_biblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarTesis(evt);
            }
        });

        jButton_borrar_biblioteca.setText("Borrar");
        jButton_borrar_biblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarTesis(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarTesis(evt);
            }
        });

        jLabel_anio_publicacion1.setText("Provedor");

        jTextField_doi1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_provedorTesis(evt);
            }
        });

        javax.swing.GroupLayout jPanel_bibliotecaLayout = new javax.swing.GroupLayout(jPanel_biblioteca);
        jPanel_biblioteca.setLayout(jPanel_bibliotecaLayout);
        jPanel_bibliotecaLayout.setHorizontalGroup(
            jPanel_bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_bibliotecaLayout.createSequentialGroup()
                .addGroup(jPanel_bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_bibliotecaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_modificar_biblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_borrar_biblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel_bibliotecaLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel_bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel_bibliotecaLayout.createSequentialGroup()
                                .addGroup(jPanel_bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_nombre_biblioteca)
                                    .addComponent(jLabel_telefono)
                                    .addComponent(jLabel_direccion))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel_bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_autor_tesis, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField_doi)
                                    .addComponent(jTextField_titulo_tesis, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)))
                            .addGroup(jPanel_bibliotecaLayout.createSequentialGroup()
                                .addComponent(jLabel_anio_publicacion1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_doi1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel_bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_cancelar_biblioteca)
                            .addComponent(jButton_aniadir_biblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_bibliotecaLayout.setVerticalGroup(
            jPanel_bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_bibliotecaLayout.createSequentialGroup()
                .addGroup(jPanel_bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_bibliotecaLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jButton_modificar_biblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_borrar_biblioteca))
                    .addGroup(jPanel_bibliotecaLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(jPanel_bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nombre_biblioteca)
                    .addComponent(jTextField_titulo_tesis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_aniadir_biblioteca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_telefono)
                    .addComponent(jTextField_autor_tesis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_direccion)
                    .addComponent(jTextField_doi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_cancelar_biblioteca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_anio_publicacion1)
                    .addComponent(jTextField_doi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(203, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tesis", jPanel_biblioteca);

        jTextField3.setText("Id Provedor");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTable_provedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Provedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable_provedor);
        if (jTable_provedor.getColumnModel().getColumnCount() > 0) {
            jTable_provedor.getColumnModel().getColumn(0).setResizable(false);
        }

        jButton5.setText("Añadir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirProvedorAbaseDeDatos(evt);
            }
        });

        jButton6.setText("Guardar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guardar_provedor_en_tabla(evt);
            }
        });

        jButton7.setText("Cancelar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Modificar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modificara_provedor_en_tabla(evt);
            }
        });

        jTextField_provedorTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoProvedor1(evt);
            }
        });
        jTextField_provedorTabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextoProvedor2(evt);
            }
        });

        jButton_eliminar_provedor.setText("Borrar");
        jButton_eliminar_provedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminar_provedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_provedorTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton_eliminar_provedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(414, 414, 414)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_eliminar_provedor)))
                .addGap(70, 70, 70)
                .addComponent(jButton5)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_provedorTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addGap(42, 42, 42)
                .addComponent(jButton7)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("", jPanel2);

        jTabbedPane1.addTab("Proovedor", jTabbedPane3);

        jTable_Bibliotecaria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Dni"
            }
        ));
        jScrollPane1.setViewportView(jTable_Bibliotecaria);

        jButton_modificar_bibliotecaria.setText("Modificar");
        jButton_modificar_bibliotecaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_modificar_bibliotecariaActionPerformed(evt);
            }
        });

        jButton_borrar_bibliotecaria.setText("Borrar");
        jButton_borrar_bibliotecaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrar_bibliotecariaActionPerformed(evt);
            }
        });

        jLabel4.setText("Dni");

        jTextField_dni_bibliotecaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Texto_id_bibliotecaria(evt);
            }
        });

        jButton_anaidr_bibliotecaria.setText("Añadir");
        jButton_anaidr_bibliotecaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_anaidr_bibliotecariaActionPerformed(evt);
            }
        });

        jButton_guardar_bibliotecaria.setText("Guardar");
        jButton_guardar_bibliotecaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardar_bibliotecariaActionPerformed(evt);
            }
        });

        jButton_cancelar_bibliotecaria.setText("Cancelar");
        jButton_cancelar_bibliotecaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelar_bibliotecariaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_dni_bibliotecaria, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton_modificar_bibliotecaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_borrar_bibliotecaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton_guardar_bibliotecaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_anaidr_bibliotecaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_cancelar_bibliotecaria, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton_modificar_bibliotecaria)
                        .addGap(26, 26, 26)
                        .addComponent(jButton_borrar_bibliotecaria))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(jButton_anaidr_bibliotecaria)
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_guardar_bibliotecaria)
                    .addComponent(jTextField_dni_bibliotecaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(34, 34, 34)
                .addComponent(jButton_cancelar_bibliotecaria)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("", jPanel3);

        jTabbedPane1.addTab("Bibliotecaria", jTabbedPane4);

        jTabbedPane.addTab("Base de datos", jTabbedPane1);

        jButton2.setText("Añadir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Borrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarPrestamo(evt);
            }
        });

        jLabel1.setText("Material Bibliográfico");

        jLabel2.setText("Usuario");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Texto_material_bibliografico_prestamo(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Texto_usuario_prestamo(evt);
            }
        });

        jTable_prestamo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Material Bibliográfico", "Usuario", "Fecha Vencimiento", "ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jTable_prestamo);
        if (jTable_prestamo.getColumnModel().getColumnCount() > 0) {
            jTable_prestamo.getColumnModel().getColumn(0).setResizable(false);
            jTable_prestamo.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(467, 467, 467)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 14, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel2)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(jTextField1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane7)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jButton2)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jButton3)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jButton4)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("", jPanel1);

        jTabbedPane.addTab("Préstamo", jTabbedPane2);

        jTable_revison.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id bibliotecaria", "Id Material", "Fecha Revision"
            }
        ));
        jScrollPane8.setViewportView(jTable_revison);

        jButton_modificar_revision.setText("Modificar");
        jButton_modificar_revision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_modificar_revisionActionPerformed(evt);
            }
        });

        jButton_borrar_revision.setText("Borrar");
        jButton_borrar_revision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrar_revisionActionPerformed(evt);
            }
        });

        jLabel5.setText("Id Bibliotecaria");

        jLabel6.setText("Id material");

        jTextField_bibliotecaria_revison.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_revision_bibliotecaria(evt);
            }
        });

        jTextField_material_revision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Texto_revision_material(evt);
            }
        });

        jButton_añadir_revision.setText("Añadir");
        jButton_añadir_revision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_añadir_revisionActionPerformed(evt);
            }
        });

        jButton_guardar_revision.setText("Guardar");
        jButton_guardar_revision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardar_revisionActionPerformed(evt);
            }
        });

        jButton_cancelar_revision.setText("Cancelar");
        jButton_cancelar_revision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelar_revisionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_bibliotecaria_revison)
                                    .addComponent(jTextField_material_revision))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_modificar_revision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_borrar_revision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_añadir_revision, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_cancelar_revision, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_guardar_revision, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jButton_modificar_revision)
                        .addGap(34, 34, 34)
                        .addComponent(jButton_borrar_revision)))
                .addGap(85, 85, 85)
                .addComponent(jButton_añadir_revision)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_bibliotecaria_revison, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jButton_guardar_revision)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_material_revision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jButton_cancelar_revision)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("", jPanel4);

        jTabbedPane.addTab("Revisiones", jTabbedPane5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane)
                .addContainerGap())
        );

        jTabbedPane.getAccessibleContext().setAccessibleName("Ciudad");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_provedorTesis(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_provedorTesis
        provedorTesis = jTextField_doi1.getText();
    }//GEN-LAST:event_jTextField_provedorTesis

    private void GuardarTesis(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarTesis
        BorrarTesis(evt);
        AñadirTesis(evt);
    }//GEN-LAST:event_GuardarTesis

    private void BorrarTesis(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarTesis
        filaSeleccionadaTesis = jTable_Tesis.getSelectedRow();

        if (filaSeleccionadaTesis != -1) {
            Object DoiObj = jTable_Tesis.getValueAt(filaSeleccionadaTesis, jTable_Tesis.getColumn("Doi").getModelIndex());
            String tesisAeliminar = DoiObj.toString();
            controlador.EliminarTesis(tesisAeliminar);
        }
        MostrarTesisEnTabla();
    }//GEN-LAST:event_BorrarTesis

    private void ModificarTesis(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarTesis
        filaSeleccionadaTesis = jTable_Tesis.getSelectedRow();
        String TesisAModificar2 = null;

        if (filaSeleccionadaTesis != -1) {
            Object DoinObj = jTable_Tesis.getValueAt(filaSeleccionadaTesis, jTable_Tesis.getColumn("Doi").getModelIndex());
            TesisAModificar2 = DoinObj.toString();
        }
        ArrayList<Tesis> listaTesis = controlador.GetTesisEnTabla();
        for(Tesis t : listaTesis){
            if(TesisAModificar2 != null && TesisAModificar2.equals(t.getDoi())){
                jTextField_titulo_tesis.setText(t.getTitulo());
                jTextField_autor_tesis.setText(t.getAutor());
                jTextField_doi.setText(t.getDoi());
                jTextField_doi1.setText(t.getProvedor());
            }
        }
    }//GEN-LAST:event_ModificarTesis

    private void AñadirTesis(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirTesis
        Texto_titulo_tesis(evt);
        TextAutor(evt);
        TextoDoi(evt);
        jTextField_provedorTesis(evt);
        controlador.CrearTesis(doiTesis, nombreTesis, autorTesis,provedorTesis);
        MostrarTesisEnTabla();
    }//GEN-LAST:event_AñadirTesis

    private void CancelarTesis(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarTesis
        jTextField_titulo_tesis.setText("");
        jTextField_autor_tesis.setText("");
        jTextField_doi.setText("");
        jTextField_doi1.setText("");
    }//GEN-LAST:event_CancelarTesis

    private void TextoDoi(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextoDoi
        doiTesis = jTextField_doi.getText();
    }//GEN-LAST:event_TextoDoi

    private void TextAutor(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextAutor
        autorTesis = jTextField_autor_tesis.getText();
    }//GEN-LAST:event_TextAutor

    private void Texto_titulo_tesis(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Texto_titulo_tesis
        nombreTesis = jTextField_titulo_tesis.getText();
    }//GEN-LAST:event_Texto_titulo_tesis

    private void GuardarLibro(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarLibro
        BorrarLibro(evt);
        AñadirLibro(evt);
    }//GEN-LAST:event_GuardarLibro

    private void TextoProvedorLibro(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextoProvedorLibro
        textoProvedorLibro = jTextField_provedor.getText();
    }//GEN-LAST:event_TextoProvedorLibro

    private void AñadirLibro(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirLibro
        TextNombreLibro(evt);
        TextAutorLibro(evt);
        TextIsbnLibro(evt);
        TextoProvedorLibro(evt);
        controlador.CrearLibro(IsbnLibro, nombreLibro, autorLibro , textoProvedorLibro);
        MostrarLibrosEnTabla();
    }//GEN-LAST:event_AñadirLibro

    private void ModificarLibro(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarLibro
        filaSeleccionadaLibro = jTable_libro.getSelectedRow();
        String libroAModificar2 = null;

        if (filaSeleccionadaLibro != -1) {
            Object IsbnObj = jTable_libro.getValueAt(filaSeleccionadaLibro, jTable_libro.getColumn("ISBN").getModelIndex());
            libroAModificar2 = IsbnObj.toString();
        }
        ArrayList<Libro> listaLibros = controlador.GetLibrosEnTabla();
        for(Libro l : listaLibros){
            if(libroAModificar2 != null && libroAModificar2.equals(l.getIsbn())){
                jTextField_nombre_libro.setText(l.getTitulo());
                jTextField_autor.setText(l.getAutor());
                jTextField_isbn.setText(l.getIsbn());
                jTextField_provedor.setText(l.getProvedor());
            }
        }
    }//GEN-LAST:event_ModificarLibro

    private void BorrarLibro(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarLibro
        filaSeleccionadaLibro = jTable_libro.getSelectedRow();

        if (filaSeleccionadaLibro != -1) {
            Object IsbnObj = jTable_libro.getValueAt(filaSeleccionadaLibro, jTable_libro.getColumn("ISBN").getModelIndex());
            String libroAeliminar = IsbnObj.toString();
            controlador.EliminarLibro(libroAeliminar);
        }
        MostrarLibrosEnTabla();
    }//GEN-LAST:event_BorrarLibro

    private void CancelarLibro(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarLibro
        jTextField_nombre_libro.setText("");
        jTextField_autor.setText("");
        jTextField_isbn.setText("");
        jTextField_provedor.setText("");
    }//GEN-LAST:event_CancelarLibro

    private void TextAutorLibro(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextAutorLibro
        autorLibro = jTextField_autor.getText();
    }//GEN-LAST:event_TextAutorLibro

    private void TextNombreLibro(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextNombreLibro
        nombreLibro = jTextField_nombre_libro.getText();
    }//GEN-LAST:event_TextNombreLibro

    private void TextIsbnLibro(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextIsbnLibro
        IsbnLibro = jTextField_isbn.getText();
    }//GEN-LAST:event_TextIsbnLibro

    private void BorrarCliente(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_BorrarCliente
        //controlador.EliminarCliente("");
    }//GEN-LAST:event_BorrarCliente

    private void GuardarCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarCliente
        BorrarClientes(evt);
        AñadirCliente(evt);
    }//GEN-LAST:event_GuardarCliente

    private void TextoTelefonoCliente(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextoTelefonoCliente
        TelefonoCliente = jTextField_Telefono_cliente.getText();
    }//GEN-LAST:event_TextoTelefonoCliente

    private void AñadirCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirCliente
        TextoNombreCliente(evt);
        TextoDniCliente(evt);
        TextoEdadPersona(evt);
        TextoTelefonoCliente(evt);
        controlador.Crearcliente(DniCliente , nombreCliente , TelefonoCliente , EdadCliente);
        MostrarClientesEnTabla();
    }//GEN-LAST:event_AñadirCliente

    private void ModificarCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarCliente
        filaSeleccionada = jTable_persona.getSelectedRow();
        String dni2 = null;
        if (filaSeleccionada != -1) {
            Object dniObj = jTable_persona.getValueAt(filaSeleccionada, jTable_persona.getColumn("Dni").getModelIndex());
            dni2 = dniObj.toString();
        }
        ArrayList<Usuario> listaClientes;
        listaClientes = controlador.GetClientesEnTabla();

        for(Usuario u : listaClientes){
            if (dni2 != null && dni2.equals(u.getDni())){
                jTextField_nombre_persona.setText(u.getNombre());
                jTextField_DNI.setText(u.getDni());
                jTextField_edad_persona.setText(u.getEdad());
                jTextField_Telefono_cliente.setText(u.getTelefono());
            }
        }
    }//GEN-LAST:event_ModificarCliente

    private void BorrarClientes(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarClientes
        filaSeleccionada = jTable_persona.getSelectedRow();

        if (filaSeleccionada != -1) {
            Object dniObj = jTable_persona.getValueAt(filaSeleccionada, jTable_persona.getColumn("Dni").getModelIndex());
            String dniAeliminar = dniObj.toString();
            controlador.EliminarCliente(dniAeliminar);
        }
        MostrarClientesEnTabla();
    }//GEN-LAST:event_BorrarClientes

    private void CancelarCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarCliente
        jTextField_nombre_persona.setText("");
        jTextField_DNI.setText("");
        jTextField_edad_persona.setText("");
        jTextField_Telefono_cliente.setText("");
    }//GEN-LAST:event_CancelarCliente

    private void TextoDniCliente(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextoDniCliente
        DniCliente= jTextField_DNI.getText();
    }//GEN-LAST:event_TextoDniCliente

    private void TextoNombreCliente(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextoNombreCliente
        nombreCliente = jTextField_nombre_persona.getText();
    }//GEN-LAST:event_TextoNombreCliente

    private void TextoEdadPersona(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextoEdadPersona
        EdadCliente= jTextField_edad_persona.getText();
    }//GEN-LAST:event_TextoEdadPersona

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void TextoProvedor2(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextoProvedor2
        Idprovedor1 = jTextField_provedorTabla.getText();
    }//GEN-LAST:event_TextoProvedor2

    private void AñadirProvedorAbaseDeDatos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirProvedorAbaseDeDatos
        TextoProvedor1(evt);
        controlador.CrearProvedor(Idprovedor1);
        MostrarProvedoresEnTabla();
    }//GEN-LAST:event_AñadirProvedorAbaseDeDatos

    private void TextoProvedor1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoProvedor1
        Idprovedor1 = jTextField_provedorTabla.getText();
    }//GEN-LAST:event_TextoProvedor1

    private void jButton_eliminar_provedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminar_provedorActionPerformed
        filaSeleccionadaTablaProvedores = jTable_provedor.getSelectedRow();

        if (filaSeleccionadaTablaProvedores != -1) {
            Object dniObj = jTable_provedor.getValueAt(filaSeleccionadaTablaProvedores, jTable_provedor.getColumn("Provedor").getModelIndex());
            String idProvedor = dniObj.toString();
            controlador.EliminarProvedor(idProvedor);
        }
        MostrarProvedoresEnTabla();
    }//GEN-LAST:event_jButton_eliminar_provedorActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jTextField_provedorTabla.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void Modificara_provedor_en_tabla(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificara_provedor_en_tabla
        filaSeleccionadaTablaProvedores = jTable_provedor.getSelectedRow();
        String idProvedor2 = null;
        if (filaSeleccionadaTablaProvedores != -1) {
            Object proObj = jTable_provedor.getValueAt(filaSeleccionadaTablaProvedores, jTable_provedor.getColumn("Provedor").getModelIndex());
            idProvedor2 = proObj.toString();
        }
        ArrayList<Provedores> listaProvedores;
        listaProvedores = controlador.GetProvedoresEnTabla();

        for(Provedores u : listaProvedores){
            if (idProvedor2 != null && idProvedor2.equals(u.getCodProvedor())){
                jTextField_provedorTabla.setText(u.getCodProvedor());
            }
        }
    }//GEN-LAST:event_Modificara_provedor_en_tabla

    private void Guardar_provedor_en_tabla(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardar_provedor_en_tabla
        jButton_eliminar_provedorActionPerformed(evt);
        AñadirProvedorAbaseDeDatos(evt);
    }//GEN-LAST:event_Guardar_provedor_en_tabla

    private void CancelarPrestamo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarPrestamo
        jTextField1.setText("");
        jTextField2.setText("");
    }//GEN-LAST:event_CancelarPrestamo

    private void Texto_material_bibliografico_prestamo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Texto_material_bibliografico_prestamo
        materialBibliografico = jTextField1.getText();
    }//GEN-LAST:event_Texto_material_bibliografico_prestamo
    private void Texto_material_bibliografico_prestamo(java.awt.event.KeyEvent evt) {                                                       
        materialBibliografico = jTextField1.getText();
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Texto_material_bibliografico_prestamo(evt);
        Texto_usuario_prestamo(evt);
        controlador.CrearPrestamo(UsuarioPrestamo, materialBibliografico);
        MostrarPrestamoEnTabla();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Texto_usuario_prestamo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Texto_usuario_prestamo
        UsuarioPrestamo = jTextField2.getText();
    }//GEN-LAST:event_Texto_usuario_prestamo

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        filaSeleccionadaTablaPrestamo = jTable_prestamo.getSelectedRow();

        if (filaSeleccionadaTablaPrestamo != -1) {
            Object dniObj = jTable_prestamo.getValueAt(filaSeleccionadaTablaPrestamo, jTable_prestamo.getColumn("ID").getModelIndex());
            String idPrestamo = dniObj.toString();
            controlador.EliminarPrestamo(idPrestamo);
        }
        MostrarPrestamoEnTabla();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton_borrar_bibliotecariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrar_bibliotecariaActionPerformed
        filaSeleccionadaTablaBibliotecaria = jTable_Bibliotecaria.getSelectedRow();
        
        if(filaSeleccionadaTablaBibliotecaria != -1){
            Object dniObj = jTable_Bibliotecaria.getValueAt(filaSeleccionadaTablaBibliotecaria, jTable_Bibliotecaria.getColumn("Dni").getModelIndex());
            String idPrestamo = dniObj.toString();
            controlador.EliminarBibliotecaria(idPrestamo);
        }
        MostrarBibliotecariaEnTabla();
    }//GEN-LAST:event_jButton_borrar_bibliotecariaActionPerformed

    private void Texto_id_bibliotecaria(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Texto_id_bibliotecaria
        IdBibliotecaria = jTextField_dni_bibliotecaria.getText();
    }//GEN-LAST:event_Texto_id_bibliotecaria

    private void jButton_cancelar_bibliotecariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelar_bibliotecariaActionPerformed
        jTextField_dni_bibliotecaria.setText("");
    }//GEN-LAST:event_jButton_cancelar_bibliotecariaActionPerformed

    private void jButton_anaidr_bibliotecariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_anaidr_bibliotecariaActionPerformed

        Texto_id_bibliotecaria(evt);
        controlador.CrearBibliotecaria(IdBibliotecaria);
        MostrarBibliotecariaEnTabla();
    }//GEN-LAST:event_jButton_anaidr_bibliotecariaActionPerformed

    private void jButton_modificar_bibliotecariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_modificar_bibliotecariaActionPerformed
        filaSeleccionadaTablaBibliotecaria = jTable_Bibliotecaria.getSelectedRow();
        String idProvedor2 = null;
        if (filaSeleccionadaTablaBibliotecaria != -1) {
            Object proObj = jTable_Bibliotecaria.getValueAt(filaSeleccionadaTablaBibliotecaria, jTable_Bibliotecaria.getColumn("Dni").getModelIndex());
            idProvedor2 = proObj.toString();
        }
        ArrayList<Bibliotecaria> listaBibliotecaria;
        listaBibliotecaria = controlador.GetBibliotecaria();

        for(Bibliotecaria u : listaBibliotecaria){
            if (idProvedor2 != null && idProvedor2.equals(u.getDni())){
                jTextField_dni_bibliotecaria.setText(u.getDni());
            }
        }
    }//GEN-LAST:event_jButton_modificar_bibliotecariaActionPerformed

    private void jButton_guardar_bibliotecariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardar_bibliotecariaActionPerformed
        jButton_borrar_bibliotecariaActionPerformed(evt);
        jButton_anaidr_bibliotecariaActionPerformed(evt);
    }//GEN-LAST:event_jButton_guardar_bibliotecariaActionPerformed

    private void jButton_añadir_revisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_añadir_revisionActionPerformed
        Texto_revision_material(evt);
        texto_revision_bibliotecaria(evt);
        controlador.CrearRevisionMaterial(Idrevision_material, idRevision_bibliotecaria);
        MostrarRevisionEnTabla();
    }//GEN-LAST:event_jButton_añadir_revisionActionPerformed
    private void texto_revision_bibliotecaria(java.awt.event.KeyEvent evt) {                                              
        idRevision_bibliotecaria = jTextField_bibliotecaria_revison.getText();
    } 
    private void texto_revision_bibliotecaria(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_revision_bibliotecaria
        idRevision_bibliotecaria = jTextField_bibliotecaria_revison.getText();
    }//GEN-LAST:event_texto_revision_bibliotecaria
    private void Texto_revision_material(java.awt.event.KeyEvent evt) {                                         
        Idrevision_material = jTextField_material_revision.getText();
    }  
    private void Texto_revision_material(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Texto_revision_material
        Idrevision_material = jTextField_material_revision.getText();
    }//GEN-LAST:event_Texto_revision_material

    private void jButton_cancelar_revisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelar_revisionActionPerformed
        jTextField_bibliotecaria_revison.setText("");
        jTextField_material_revision.setText("");
    }//GEN-LAST:event_jButton_cancelar_revisionActionPerformed

    private void jButton_borrar_revisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrar_revisionActionPerformed
        filaSeleccionadaRevision = jTable_revison.getSelectedRow();
        
        if(filaSeleccionadaRevision != -1){
            Object obj = jTable_revison.getValueAt(filaSeleccionadaRevision, jTable_revison.getColumn("Id bibliotecaria").getModelIndex());
            String id = obj.toString();
            Object obj2 = jTable_revison.getValueAt(filaSeleccionadaRevision, jTable_revison.getColumn("Id Material").getModelIndex());
            String id2 = obj2.toString();
            Object obj3 = jTable_revison.getValueAt(filaSeleccionadaRevision, jTable_revison.getColumn("Fecha Revision").getModelIndex());
            String id3 = obj3.toString();
            controlador.EliminarRevisionMaterial(id,id2,id3);
        }
        MostrarRevisionEnTabla();
    }//GEN-LAST:event_jButton_borrar_revisionActionPerformed

    private void jButton_modificar_revisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_modificar_revisionActionPerformed

        filaSeleccionadaRevision = jTable_revison.getSelectedRow();
        
        if(filaSeleccionadaRevision != -1){
            Object obj = jTable_revison.getValueAt(filaSeleccionadaRevision, jTable_revison.getColumn("Id bibliotecaria").getModelIndex());
            String id = obj.toString();
            Object obj2 = jTable_revison.getValueAt(filaSeleccionadaRevision, jTable_revison.getColumn("Id Material").getModelIndex());
            String id2 = obj2.toString();
            jTextField_bibliotecaria_revison.setText(id);
            jTextField_material_revision.setText(id2);
        }
        
    }//GEN-LAST:event_jButton_modificar_revisionActionPerformed

    private void jButton_guardar_revisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardar_revisionActionPerformed
        jButton_borrar_revisionActionPerformed(evt);
        jButton_añadir_revisionActionPerformed(evt);
    }//GEN-LAST:event_jButton_guardar_revisionActionPerformed
    private void Texto_id_bibliotecaria(java.awt.event.KeyEvent evt) {                                        
        IdBibliotecaria = jTextField_dni_bibliotecaria.getText();
    } 
    private void Texto_usuario_prestamo(java.awt.event.KeyEvent evt) {                                        
        UsuarioPrestamo = jTextField2.getText();
    } 
    
        private void TextoNombreCliente(java.awt.event.ActionEvent evt) {                                    
        nombreCliente = jTextField_nombre_persona.getText();
    }     private void TextoDniCliente(java.awt.event.ActionEvent evt) {                                 
        DniCliente= jTextField_DNI.getText();
    }     private void TextoEdadPersona(java.awt.event.ActionEvent evt) {                                  
        EdadCliente= jTextField_edad_persona.getText();
    }    private void TextoTelefonoCliente(java.awt.event.ActionEvent evt) {                                      
       TelefonoCliente = jTextField_Telefono_cliente.getText();
    }     private void TextNombreLibro(java.awt.event.ActionEvent evt) {                                 
        nombreLibro = jTextField_nombre_libro.getText();
    }     private void TextAutorLibro(java.awt.event.ActionEvent evt) {                                
        autorLibro = jTextField_autor.getText();
    }     private void TextIsbnLibro(java.awt.event.ActionEvent evt) {                               
        IsbnLibro = jTextField_isbn.getText();
    }     private void Texto_titulo_tesis(java.awt.event.ActionEvent evt) {                                    
        nombreTesis = jTextField_titulo_tesis.getText();
    }      private void TextoDoi(java.awt.event.ActionEvent evt) {                          
        doiTesis = jTextField_doi.getText();
    }    private void TextAutor(java.awt.event.ActionEvent evt) {                           
        autorTesis = jTextField_autor_tesis.getText();
    } 
        private void TextoProvedorLibro(java.awt.event.ActionEvent evt) {                                    
        textoProvedorLibro = jTextField_provedor.getText();
    }
    private void jTextField_provedorTesis(java.awt.event.ActionEvent evt) {                                          
        provedorTesis = jTextField_doi1.getText();
    }   
    private void MostrarClientesEnTabla(){
        ArrayList<Usuario> listaClientes;
        listaClientes = controlador.GetClientesEnTabla();
        // Borra todas las filas existentes en el modelo de tabla
        TablaClientes.setRowCount(0);

         for(Usuario u : listaClientes){
            TablaClientes.addRow(new Object[] {u.getNombre() , u.getDni()});
         }
    }
    
    private void MostrarLibrosEnTabla(){
        ArrayList<Libro> listaLibro;
        listaLibro = controlador.GetLibrosEnTabla();
                
        // Borra todas las filas existentes en el modelo de tabla
        ModeloTablaLibros.setRowCount(0);
         
         for(Libro l : listaLibro){
             ModeloTablaLibros.addRow(new Object[] {l.getTitulo(), l.getIsbn()});
         }
    }
    
    private void MostrarTesisEnTabla(){
        ArrayList<Tesis> listaTesis;
        listaTesis = controlador.GetTesisEnTabla();
        
         // Borra todas las filas existentes en el modelo de tabla
        ModeloTablaTesis.setRowCount(0);
        
         for(Tesis t : listaTesis){
            ModeloTablaTesis.addRow(new Object[] {t.getTitulo(), t.getDoi()});
         }
    }
    
    private void MostrarProvedoresEnTabla(){
        ArrayList<Provedores> ListaProvedores;
        ListaProvedores = controlador.GetProvedoresEnTabla();
        
        //Borrar todas las filas de los provedores
        modeloProvedor.setRowCount(0);
        
        for(Provedores p : ListaProvedores){
            modeloProvedor.addRow(new Object[] {p.getCodProvedor()});
        }
    }
    
    private void MostrarPrestamoEnTabla(){
        ArrayList<Prestamo> listaPrestamos;
        listaPrestamos = controlador.GetPrestamosEnTabla();
        modeloPrestamo2.setRowCount(0);
        
        for(Prestamo p : listaPrestamos){
            modeloPrestamo2.addRow(new Object[] {p.getMaterialBibliografico() , p.getUsuario() , p.getFechaVencimiento() , p.getId()});
        }
    }
    
    private void MostrarBibliotecariaEnTabla(){
        ArrayList<Bibliotecaria> listaBibliotecarias;
        listaBibliotecarias = controlador.GetBibliotecaria();
        modeloBibliotecaria.setRowCount(0);
        
        for(Bibliotecaria b : listaBibliotecarias){
            modeloBibliotecaria.addRow(new Object[] {b.getDni()});
        }
    }
    
    private void MostrarRevisionEnTabla(){
        ArrayList<RevisarMaterial> lista = controlador.GetRevision();
        modeloRevision.setRowCount(0);
        
        for(RevisarMaterial r : lista){
            modeloRevision.addRow(new Object[] {r.getBibliotecaria() , r.getMaterialBibliografico() , r.getFechaInicioAsString()});
        }
    }
    
    //Variables de la pestaña cliente.
    String nombreCliente;
    String DniCliente;
    String EdadCliente;
    String TelefonoCliente;
    private DefaultTableModel TablaClientes;
    private int filaSeleccionada = -1;
    String dniAeliminar;
    
    //variables pestaña libro
    String nombreLibro;
    String autorLibro;
    String IsbnLibro;
    String textoProvedorLibro;
    private DefaultTableModel ModeloTablaLibros;
    private int filaSeleccionadaLibro = -1;
    
    //variables pestaña tesis
    String nombreTesis;
    String autorTesis;
    String doiTesis;
    String provedorTesis;
    private DefaultTableModel ModeloTablaTesis;
    private int filaSeleccionadaTesis = -1;
    
    //variable del provedor
    String Idprovedor1 = null ;
    private DefaultTableModel modeloProvedor;
    private int filaSeleccionadaTablaProvedores = -1;
    
    //variable de prestamo
    String materialBibliografico = null;
    String UsuarioPrestamo = null;
    private DefaultTableModel modeloPrestamo2;
    private int filaSeleccionadaTablaPrestamo = -1;
    
    //variable bibliotecaria
    String IdBibliotecaria = null;
    private DefaultTableModel modeloBibliotecaria;
    private int filaSeleccionadaTablaBibliotecaria = -1;
    
    //variables revision 
    String Idrevision_material;
    String idRevision_bibliotecaria;
    private DefaultTableModel modeloRevision;
    private int filaSeleccionadaRevision = -1;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar;
    private javax.swing.JButton GuardarLibro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton_anaidr_bibliotecaria;
    private javax.swing.JButton jButton_aniadir_biblioteca;
    private javax.swing.JButton jButton_aniadir_libro;
    public javax.swing.JButton jButton_aniadir_persona;
    private javax.swing.JButton jButton_añadir_revision;
    private javax.swing.JButton jButton_borrar_biblioteca;
    private javax.swing.JButton jButton_borrar_bibliotecaria;
    private javax.swing.JButton jButton_borrar_libro;
    public javax.swing.JButton jButton_borrar_persona;
    private javax.swing.JButton jButton_borrar_revision;
    private javax.swing.JButton jButton_cancelar_biblioteca;
    private javax.swing.JButton jButton_cancelar_bibliotecaria;
    public javax.swing.JButton jButton_cancelar_libro;
    private javax.swing.JButton jButton_cancelar_persona;
    private javax.swing.JButton jButton_cancelar_revision;
    private javax.swing.JButton jButton_eliminar_provedor;
    private javax.swing.JButton jButton_guardar_bibliotecaria;
    private javax.swing.JButton jButton_guardar_revision;
    private javax.swing.JButton jButton_modificar_biblioteca;
    private javax.swing.JButton jButton_modificar_bibliotecaria;
    private javax.swing.JButton jButton_modificar_libro;
    public javax.swing.JButton jButton_modificar_persona;
    private javax.swing.JButton jButton_modificar_revision;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_DNI;
    private javax.swing.JLabel jLabel_anio_publicacion;
    private javax.swing.JLabel jLabel_anio_publicacion1;
    private javax.swing.JLabel jLabel_autor;
    private javax.swing.JLabel jLabel_ciudad_natal;
    private javax.swing.JLabel jLabel_direccion;
    private javax.swing.JLabel jLabel_edad_persona;
    private javax.swing.JLabel jLabel_edad_recomendada;
    private javax.swing.JLabel jLabel_nombre_biblioteca;
    private javax.swing.JLabel jLabel_nombre_libro;
    private javax.swing.JLabel jLabel_nombre_persona;
    private javax.swing.JLabel jLabel_telefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel_biblioteca;
    private javax.swing.JPanel jPanel_libro;
    private javax.swing.JPanel jPanel_persona;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTable jTable_Bibliotecaria;
    private javax.swing.JTable jTable_Tesis;
    private javax.swing.JTable jTable_libro;
    public javax.swing.JTable jTable_persona;
    public javax.swing.JTable jTable_prestamo;
    public javax.swing.JTable jTable_provedor;
    private javax.swing.JTable jTable_revison;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField_DNI;
    private javax.swing.JTextField jTextField_Telefono_cliente;
    private javax.swing.JTextField jTextField_autor;
    public javax.swing.JTextField jTextField_autor_tesis;
    private javax.swing.JTextField jTextField_bibliotecaria_revison;
    private javax.swing.JTextField jTextField_dni_bibliotecaria;
    public javax.swing.JTextField jTextField_doi;
    public javax.swing.JTextField jTextField_doi1;
    private javax.swing.JTextField jTextField_edad_persona;
    private javax.swing.JTextField jTextField_isbn;
    private javax.swing.JTextField jTextField_material_revision;
    private javax.swing.JTextField jTextField_nombre_libro;
    private javax.swing.JTextField jTextField_nombre_persona;
    private javax.swing.JTextField jTextField_provedor;
    public javax.swing.JTextField jTextField_provedorTabla;
    public javax.swing.JTextField jTextField_titulo_tesis;
    // End of variables declaration//GEN-END:variables
    /*
    //private ArrayList<Ciudad> ciudades;
    //private Ciudad ciudad_modificar;
    private DefaultTableModel table_model_ciudad;    
    private Boolean modif_ciudad;
    private int id_ciudad;
    
    //private ArrayList<Biblioteca> bibliotecas;
    //private Biblioteca biblioteca_modificar;
    private DefaultTableModel table_model_biblioteca;    
    private Boolean modif_biblioteca;
    private int id_biblioteca;
    
    private ArrayList<Libro> libros;
    private Libro libro_modificar;
    private DefaultTableModel table_model_libro;    
    private Boolean modif_libro;
    private int id_libro;
    
    private ArrayList<Persona> personas;
    private Persona persona_modificar;
    private DefaultTableModel table_model_persona;    
    private Boolean modif_persona;
    private int id_persona;
    */
}


