package Vistas;

import Controladores.Conexion1;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Administradores extends javax.swing.JFrame {

    //variables
    private String usuario;
    DefaultTableModel ModeloTabla = new DefaultTableModel();
    DefaultTableModel ModeloHabilidades = new DefaultTableModel();

    public Administradores() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.ModelarTablaHijos();
        this.ModelarTablaHabilidades();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtNombreEti = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFechaIngreso = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtxCodDepa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHabilidades = new javax.swing.JTable();
        txtNumHabilidades = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnDetallesHabilidades = new javax.swing.JButton();
        btnEliminarHabilidad = new javax.swing.JButton();
        btnAgregarHabilidades = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHijos = new javax.swing.JTable();
        btnAgregarHijo = new javax.swing.JButton();
        btnModificarHijo = new javax.swing.JButton();
        btnDetallesHijo = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtRif = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btnRegistrarHabilidad = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnRegCentro = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        btnRegDirecciones = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        btnRegDepa = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        btnRegTelefono = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("Administrativo");

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Cerrar Sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtNombreEti.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNombreEti.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtNombreEti.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("Nombre");

        javax.swing.GroupLayout jXPanel1Layout = new javax.swing.GroupLayout(jXPanel1);
        jXPanel1.setLayout(jXPanel1Layout);
        jXPanel1Layout.setHorizontalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jXPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreEti, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jXPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        jXPanel1Layout.setVerticalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreEti, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addGap(11, 11, 11)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        getContentPane().add(jXPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 90));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 291, 68, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Fecha de Ingreso");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 141, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Salario");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Codigo De Departamento");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 291, -1, -1));

        txtFechaIngreso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFechaIngreso.setForeground(new java.awt.Color(0, 0, 0));
        txtFechaIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaIngresoActionPerformed(evt);
            }
        });
        jPanel1.add(txtFechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, 141, 34));

        txtSalario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSalario.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 141, 34));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 317, 141, 34));

        txtxCodDepa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtxCodDepa.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtxCodDepa, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 50, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("Datos Del Empleado");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 249, 462, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Estado");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 291, 68, -1));

        txtEstado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEstado.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 317, 141, 34));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Habilidades");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 12, 182, 39));

        tblHabilidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblHabilidades);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 63, 418, 117));

        txtNumHabilidades.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtNumHabilidades.setForeground(new java.awt.Color(0, 0, 0));
        txtNumHabilidades.setEnabled(false);
        jPanel1.add(txtNumHabilidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 32, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Cantidad de habilidades");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, -1));

        btnDetallesHabilidades.setBackground(new java.awt.Color(153, 204, 255));
        btnDetallesHabilidades.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDetallesHabilidades.setText("Detalles");
        btnDetallesHabilidades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDetallesHabilidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetallesHabilidadesActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetallesHabilidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 198, -1, 32));

        btnEliminarHabilidad.setBackground(new java.awt.Color(255, 204, 204));
        btnEliminarHabilidad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminarHabilidad.setText("Eliminar");
        btnEliminarHabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarHabilidadActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarHabilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(727, 198, -1, 33));

        btnAgregarHabilidades.setBackground(new java.awt.Color(204, 255, 204));
        btnAgregarHabilidades.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarHabilidades.setText("Agregar");
        btnAgregarHabilidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarHabilidadesActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarHabilidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(807, 198, 87, 33));

        tblHijos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblHijos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 63, 388, 117));

        btnAgregarHijo.setBackground(new java.awt.Color(204, 255, 204));
        btnAgregarHijo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarHijo.setText("Agregar");
        btnAgregarHijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarHijoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarHijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 198, 87, 33));

        btnModificarHijo.setBackground(new java.awt.Color(204, 255, 204));
        btnModificarHijo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnModificarHijo.setText("Modificar");
        btnModificarHijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarHijoActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarHijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 198, 87, 33));

        btnDetallesHijo.setBackground(new java.awt.Color(153, 204, 255));
        btnDetallesHijo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDetallesHijo.setText("Detalles");
        btnDetallesHijo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDetallesHijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetallesHijoActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetallesHijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 198, -1, 32));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Hijos");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 12, 182, 39));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 940, 460));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        txtRif.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRif.setForeground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("RIF");

        btnConsultar.setBackground(new java.awt.Color(153, 204, 255));
        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(204, 255, 204));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 204, 204));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Empleados");

        btnRegistrar.setBackground(new java.awt.Color(204, 255, 204));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setText("Centro de trabajo");

        btnRegistrarHabilidad.setBackground(new java.awt.Color(153, 204, 255));
        btnRegistrarHabilidad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrarHabilidad.setText("Registrar");
        btnRegistrarHabilidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnRegistrarHabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarHabilidadActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setText("Habilidades");

        btnRegCentro.setBackground(new java.awt.Color(153, 204, 255));
        btnRegCentro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegCentro.setText("Registrar");
        btnRegCentro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnRegCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegCentroActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setText("Telefonos");

        btnRegDirecciones.setBackground(new java.awt.Color(153, 204, 255));
        btnRegDirecciones.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegDirecciones.setText("Registrar");
        btnRegDirecciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnRegDirecciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegDireccionesActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel17.setText("Direcciones");

        btnRegDepa.setBackground(new java.awt.Color(153, 204, 255));
        btnRegDepa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegDepa.setText("Registrar");
        btnRegDepa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnRegDepa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegDepaActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setText("Departamentos");

        btnRegTelefono.setBackground(new java.awt.Color(153, 204, 255));
        btnRegTelefono.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegTelefono.setText("Registrar");
        btnRegTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnRegTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegTelefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                        .addGap(476, 476, 476))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator4)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnRegDepa, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEliminar))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel14)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnRegCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel17)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnRegDirecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel15)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnRegistrarHabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(txtRif, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtRif, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrarHabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegDirecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRegTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRegDepa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 370, 170));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconopequeño.png"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 90, 80));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/arquitectura-vidrio.jpg"))); // NOI18N
        jLabel19.setText("jLabel19");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaIngresoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        InicioDeSesion ini = new InicioDeSesion();
        ini.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDetallesHijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetallesHijoActionPerformed

        this.CargaTablaHijos();

    }//GEN-LAST:event_btnDetallesHijoActionPerformed

    private void btnAgregarHijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarHijoActionPerformed
        Agregarhijo hijonuevo = new Agregarhijo();
        hijonuevo.setVisible(true);
    }//GEN-LAST:event_btnAgregarHijoActionPerformed

    private void btnDetallesHabilidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetallesHabilidadesActionPerformed
        this.CargaHabilidadesTabla();
    }//GEN-LAST:event_btnDetallesHabilidadesActionPerformed

    private void btnAgregarHabilidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarHabilidadesActionPerformed
       AgregarHabilidades aggHab =new AgregarHabilidades();
       aggHab.setVisible(true);
        
    }//GEN-LAST:event_btnAgregarHabilidadesActionPerformed

    private void btnModificarHijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarHijoActionPerformed

        this.ModificarHijos();

    }//GEN-LAST:event_btnModificarHijoActionPerformed

    private void btnEliminarHabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarHabilidadActionPerformed

        this.eliminarHabilidad();

    }//GEN-LAST:event_btnEliminarHabilidadActionPerformed

    private void btnRegDepaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegDepaActionPerformed
        RegistrarDepa regdep =new RegistrarDepa();
        regdep.setVisible(true);
    }//GEN-LAST:event_btnRegDepaActionPerformed

    private void btnRegDireccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegDireccionesActionPerformed
        egistrarDireccion regDir =new egistrarDireccion();
        regDir.setVisible(true);
    }//GEN-LAST:event_btnRegDireccionesActionPerformed

    private void btnRegCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegCentroActionPerformed
        RegistrarCentro regcen =new RegistrarCentro();
        regcen.setVisible(true);
    }//GEN-LAST:event_btnRegCentroActionPerformed

    private void btnRegistrarHabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarHabilidadActionPerformed
       RegistrarHabilidad reghab=new RegistrarHabilidad();
       reghab.setVisible(true);
    }//GEN-LAST:event_btnRegistrarHabilidadActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        RegistroUsuario registrar = new RegistroUsuario();
        registrar.setVisible(true);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        this.ELiminaDatosBD();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        this.Modificar();

        this.Limpiar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        this.CargaDatos();

        ModeloHabilidades.setRowCount(0);

        ModeloTabla.setRowCount(0);
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnRegTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegTelefonoActionPerformed
      RegTelefono Tlfno=new RegTelefono();
      Tlfno.setVisible(true);
    }//GEN-LAST:event_btnRegTelefonoActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarHabilidades;
    private javax.swing.JButton btnAgregarHijo;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnDetallesHabilidades;
    private javax.swing.JButton btnDetallesHijo;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarHabilidad;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificarHijo;
    private javax.swing.JButton btnRegCentro;
    private javax.swing.JButton btnRegDepa;
    private javax.swing.JButton btnRegDirecciones;
    private javax.swing.JButton btnRegTelefono;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrarHabilidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private javax.swing.JTable tblHabilidades;
    private javax.swing.JTable tblHijos;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFechaIngreso;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JLabel txtNombreEti;
    private javax.swing.JTextField txtNumHabilidades;
    private javax.swing.JTextField txtRif;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtxCodDepa;
    // End of variables declaration//GEN-END:variables

//Metodo para Modelar la tabla de Hijos
    private void ModelarTablaHijos() {

        ModeloTabla.addColumn("Cod");
        ModeloTabla.addColumn("RIF");
        ModeloTabla.addColumn("Nombre");
        ModeloTabla.addColumn("Fecha De Nacimiento");

        this.tblHijos.setModel(ModeloTabla);
    }

    //Metodo para Modelar la tabla de Habilidades
    private void ModelarTablaHabilidades() {

        ModeloHabilidades.addColumn("ID");
        ModeloHabilidades.addColumn("RIF");
        ModeloHabilidades.addColumn("Nombre");
        ModeloHabilidades.addColumn("Habilidades");

        this.tblHabilidades.setModel(ModeloHabilidades);
    }

    //Metodo para cargar los datos de las habilidades a la tabla
    private void CargaHabilidadesTabla() {

        Connection cn;
        Conexion1 con = new Conexion1();

        String RifConsulta = txtRif.getText().trim();
        ResultSet rs;
        String sql = "Select eh.id,e.RIF, e.Nom_emp,h.descripcion "
                + "from "
                + "empleado e join empleado_habilidad eh on e.RIF=eh.id_empleado "
                + "join habilidades h on eh.id_habilidad= h.Cod_hab where eh.id_empleado='" + RifConsulta + "'";
        Statement pst = null;
        try
        {
            cn = (Connection) con.conectar();
            pst = cn.createStatement();

            if (tblHabilidades.getRowCount() == 0)
            {
                rs = pst.executeQuery(sql);

                if (!rs.next())
                {
                    JOptionPane.showMessageDialog(null, "EL empleado no tiene habilidades registradas");
                } else
                {
                    do
                    {
                        ModeloHabilidades.addRow(new Object[]
                        {
                            rs.getInt(String.valueOf("id")), rs.getInt(String.valueOf("RIF")), rs.getString("Nom_emp"), rs.getString("descripcion")
                        });
                    } while (rs.next());
                }
                tblHabilidades.setModel(ModeloHabilidades);
            } else
            {
                JOptionPane.showMessageDialog(null, "La tabla ya esta llena");
            }
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
//Metodo para cargar los datos del empleado e hijos

    public void CargaDatos() {

        Connection cn;
        Conexion1 con = new Conexion1();

        String RifConsulta = txtRif.getText().trim();
        ResultSet rs;
        String sql = "SELECT empleado.*,  "
                + "(SELECT COUNT(*) FROM empleado_habilidad WHERE empleado_habilidad.id_empleado = empleado.RIF) as habilidades "
                + "FROM "
                + "empleado  "
                + "WHERE empleado.RIF='" + RifConsulta + "'";
        cn = (Connection) con.conectar();
        try
        {

            PreparedStatement pst = cn.prepareStatement(sql);
            rs = pst.executeQuery();

            if (!RifConsulta.isEmpty())
            {
                if (rs.next())
                {
                    txtNombre.setText(rs.getString("Nom_emp"));
                    txtFechaIngreso.setText(rs.getString("Fecha_ingreso"));
                    txtSalario.setText(String.valueOf(rs.getDouble("salario")));
                    txtxCodDepa.setText(String.valueOf(rs.getInt("Cod_dep")));
                    txtNumHabilidades.setText(String.valueOf(rs.getString("habilidades")));

                    txtEstado.setText(rs.getString("estado"));

                } else
                {
                    JOptionPane.showMessageDialog(null, "Usuario no registrado o no esta activo");
                }
                cn.close();
            } else
            {
                JOptionPane.showMessageDialog(null, "Ingrese un rif");
            }
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
        }

    }

    //metodo para Identificar usuario
    public void Identificar(String user) {

        this.usuario = user;
        txtNombreEti.setText(user);

    }

    // metodo para modificar usuarios 
    private void Modificar() {
        Connection cn;
        Conexion1 con = new Conexion1();
        PreparedStatement pst;
        String sql = "update empleado set Nom_emp=?,Fecha_ingreso=?,salario=?,Cod_dep=?, estado=? where RIF='" + txtRif.getText() + "'";
        try
        {
            cn = (Connection) con.conectar();
            pst = cn.prepareStatement(sql);
            pst.setString(1, txtNombre.getText());
            pst.setString(2, txtFechaIngreso.getText());
            pst.setDouble(3, Double.parseDouble(txtSalario.getText()));
            pst.setInt(4, Integer.parseInt(txtxCodDepa.getText()));
            pst.setString(5, txtEstado.getText());

            int res = pst.executeUpdate();
            if (res > 0)
            {
                JOptionPane.showMessageDialog(null, "Modificacion realizada");
            } else
            {
                JOptionPane.showMessageDialog(null, "Algo salio mal");
            }

        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    //metodo para limpiar campos
    private void Limpiar() {

        txtNombre.setText("");
        txtFechaIngreso.setText("");
        txtSalario.setText("");
        txtxCodDepa.setText("");

        txtEstado.setText("");
        txtNumHabilidades.setText("");
    }

    //Metodo para Eliminar los datos del empleado e hijos
    public void ELiminaDatosBD() {

        Connection cn;
        Conexion1 con = new Conexion1();

        String RifConsulta = txtRif.getText().trim();

        String sql = "delete from hijos where RIF='" + RifConsulta + "';";
        cn = (Connection) con.conectar();
        try
        {

            Statement pst = cn.createStatement();
            int filasafectadas = pst.executeUpdate(sql);

            if (filasafectadas > 0)
            {
                JOptionPane.showMessageDialog(null, "Usuario Eliminado");
            } else
            {
                JOptionPane.showMessageDialog(null, "Usuario No Encontrado: sin hijos");
            }

            sql = "delete from empleado_habilidad where id_empleado='" + RifConsulta + "';";

            filasafectadas = pst.executeUpdate(sql);

            if (filasafectadas > 0)
            {
                JOptionPane.showMessageDialog(null, "Usuario Eliminado");
            } else
            {
                JOptionPane.showMessageDialog(null, "Usuario No Encontrado: sin habilidades registradas");
            }

            sql = "update empleado set estado='inactivo' where RIF='" + RifConsulta + "'";
            filasafectadas = pst.executeUpdate(sql);

            if (filasafectadas > 0)
            {
                JOptionPane.showMessageDialog(null, "Usuario Eliminado: " + filasafectadas);
            } else
            {
                JOptionPane.showMessageDialog(null, "Usuario No Encontrado O inactivo");
            }

            cn.close();
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
        }

    }

    //Metodo para modificar datos tabla hijo
    private void ModificarHijos() {

        int fila = tblHijos.getSelectedRow();

        int id = Integer.parseInt(tblHijos.getValueAt(fila, 0).toString());
        int Rif = Integer.parseInt(tblHijos.getValueAt(fila, 1).toString());
        String nombre = tblHijos.getValueAt(fila, 2).toString();
        String fecha = tblHijos.getValueAt(fila, 3).toString();

        Connection cn;
        Conexion1 con = new Conexion1();
        PreparedStatement pst;
        String sql = "UPDATE hijos SET RIF=?, Fecha_nacimiento=?, Nom_hijo=? WHERE id=?";

        try
        {

            cn = (Connection) con.conectar();
            if (cn != null)
            {
                System.out.println("Conexion correcta");
            } else
            {
                System.out.println("Conexion fallida");
            }
            if (fila >= 0)
            {
                pst = cn.prepareStatement(sql);

                pst.setInt(1, Rif);
                pst.setString(2, fecha);
                pst.setString(3, nombre);
                pst.setInt(4, id);

                System.out.println("RIF: " + Rif + ", Fecha: " + fecha + ", Nombre: " + nombre + ", ID: " + id);
                int res = pst.executeUpdate();
                if (res > 0)
                {
                    JOptionPane.showMessageDialog(null, "Modificacion realizada en la fila " + (fila + 1) + " y el hijo con id: " + id);
                } else
                {
                    JOptionPane.showMessageDialog(null, "Algo salio mal");
                }
                cn.close();
            } else
            {

                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }

        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    //Metodo cargar datos en la tabla hijos
    private void CargaTablaHijos() {

        Connection cn;
        Conexion1 con = new Conexion1();

        String RifConsulta = txtRif.getText().trim();
        ResultSet rs;
        String sql = "select * from hijos where RIF='" + RifConsulta + "'";
        Statement pst = null;
        try
        {
            cn = (Connection) con.conectar();
            pst = cn.createStatement();

            if (tblHijos.getRowCount() == 0)
            {
                rs = pst.executeQuery(sql);
                if (!rs.next())
                {
                    JOptionPane.showMessageDialog(null, "El empleado no tiene hijos");
                } else
                {
                    do
                    {
                        ModeloTabla.addRow(new Object[]
                        {
                            rs.getInt(String.valueOf("id")), rs.getInt(String.valueOf("RIF")), rs.getString("Nom_hijo"), rs.getString("Fecha_Nacimiento")
                        });
                    } while (rs.next());

                    tblHijos.setModel(ModeloTabla);
                }
            } else
            {
                JOptionPane.showMessageDialog(null, "LA tabla esta llena");
            }

        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    //Metodo eliminar habilidades

    private void eliminarHabilidad() {

        int fila = tblHabilidades.getSelectedRow();
        int id = Integer.parseInt(tblHabilidades.getValueAt(fila, 0).toString());
        Connection cn;
        Conexion1 con = new Conexion1();
        PreparedStatement pst;
        try
        {
            cn = con.conectar();
            if (cn != null)
            {
                System.out.println("Conexion Correcta");

                pst = cn.prepareStatement("delete from empleado_habilidad where id='" + id + "'");
                System.out.println("El id seleccionado para eliminar es " + id);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Habilidad eliminada");
            } else
            {
                System.out.println("Conexion Fallida");
            }
        } catch (SQLException e)
        {
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }

    }
    
  
}
