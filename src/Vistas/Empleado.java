/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Controladores.Conexion1;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AbransZ
 */
public class Empleado extends javax.swing.JFrame {

    DefaultTableModel modeloEmpleados =new DefaultTableModel();
    public Empleado() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.ModelarTablaEmpleados();
        this.CargaInfoEmpleados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Empleados");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Cerrar Sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 26, 135, -1));

        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblEmpleados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 799, 250));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/arquitectura-vidrio.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 4, 840, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        InicioDeSesion ini = new InicioDeSesion();
        ini.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmpleados;
    // End of variables declaration//GEN-END:variables

    private void CargaInfoEmpleados() {

        Connection cn;
        Conexion1 con = new Conexion1();
        

        
        ResultSet rs;
        String sql = "SELECT e.RIF, e.Nom_emp, e.Fecha_ingreso, e.salario, e.estado, e.ID_rol,t.Tlf_fijo, t.Tlf_movil,r.id_rol, r.Cod_centro FROM empleado e LEFT JOIN telefonos t ON t.RIF = e.RIF LEFT JOIN rol_empleado r ON r.id_rol = e.ID_rol";
        Statement pst = null;
        try
        {
            cn = (Connection) con.conectar();
            pst = cn.createStatement();

            if (tblEmpleados.getRowCount() == 0)
            {
                rs = pst.executeQuery(sql);
                if (!rs.next())
                {
                    
                } else
                {
                    do
                    {
                        modeloEmpleados.addRow(new Object[]
                        {
                            rs.getInt(String.valueOf("RIF")), 
                            rs.getString("Nom_emp"), 
                            rs.getString("Fecha_ingreso"), 
                            rs.getDouble(String.valueOf("salario")),
                            rs.getString("estado"),
                            rs.getInt(String.valueOf("ID_rol")),
                            rs.getInt(String.valueOf("Tlf_fijo")),
                            rs.getInt(String.valueOf("Tlf_movil")),
                            rs.getInt(String.valueOf("Cod_centro")),
                        });
                    } while (rs.next());

                    tblEmpleados.setModel(modeloEmpleados);
                }
            } else
            {
                JOptionPane.showMessageDialog(null, "La tabla esta llena");
            }

        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    //Metodo para Modelar la tabla de empleados
    private void ModelarTablaEmpleados() {

        modeloEmpleados.addColumn("RIF");
        modeloEmpleados.addColumn("Nombre");
        modeloEmpleados.addColumn("Fecha de ingreso");
        modeloEmpleados.addColumn("Salario");
        modeloEmpleados.addColumn("Estado");
        modeloEmpleados.addColumn("Rol");
        modeloEmpleados.addColumn("Telefono fijo");
        modeloEmpleados.addColumn("Telefono movil");
        modeloEmpleados.addColumn("Centro de trabajo");

        this.tblEmpleados.setModel(modeloEmpleados);
    }
}