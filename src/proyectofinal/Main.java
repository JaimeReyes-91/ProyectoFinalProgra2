
package proyectofinal;
import javax.swing.JOptionPane;
import Conexion.Conexion;
import Formulario.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import java.io.InputStream;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.text.DateFormatter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author dinae
 */

public class Main extends javax.swing.JFrame {
   Conexion conexionPostgres = new Conexion();
    Connection con;

    public Main() {
        initComponents();
        setTitle("Karl's Restaurant");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        try {
            con = conexionPostgres.getConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error de conexión: " + e.getMessage());
        }

        actualizarUsuarioActivo();
        bloquearMenus();
    }

     public void bloquearMenus() {
        MenuGestion.setEnabled(false);
        MenuPedidos.setEnabled(false);
        MenuReportes.setEnabled(false);
        MenuConfiguracion.setEnabled(false);
        ItemCerrarSesion.setEnabled(false);
    }

    public void habilitarMenus() {
        MenuGestion.setEnabled(true);
        MenuPedidos.setEnabled(true);
        MenuReportes.setEnabled(true);
        MenuConfiguracion.setEnabled(true);
        ItemCerrarSesion.setEnabled(true);
    }
    
    public void actualizarUsuarioActivo() {
        if (SesionUsuario.sesionActiva()) {
            lblUsuario.setText("Usuario activo: " + SesionUsuario.getUsuarioActual());
        } else {
            lblUsuario.setText("No hay sesión activa");
        }
    }
/*
   private void ItemInicioActionPerformed(java.awt.event.ActionEvent evt) {
        Login loginFrame = new Login(this);
        mostrarVentana(loginFrame);
    }

   private void ItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {
        SesionUsuario.cerrarSesion();
        JOptionPane.showMessageDialog(this, "Sesión finalizada correctamente.");
        actualizarUsuarioActivo();
        bloquearMenus();
    }
    */
    private void mostrarVentana(JInternalFrame frame) {
        escritorio.removeAll();
        escritorio.repaint();
        int x = (escritorio.getWidth() - frame.getWidth()) / 2;
        int y = (escritorio.getHeight() - frame.getHeight()) / 2;
        frame.setLocation(x, y);
        frame.setVisible(true);
        escritorio.add(frame);
    }
    
    
    public class ReportUtils {
    public static void mostrarReporte(String ruta, Connection con, JDesktopPane escritorio) {
        try {
            

            InputStream stream = ReportUtils.class.getResourceAsStream(ruta);
            if (stream == null) {
                throw new IllegalArgumentException("No se encontró el reporte: " + ruta);
            }

            JasperReport report = JasperCompileManager.compileReport(stream);
            JasperPrint print = JasperFillManager.fillReport(report, null, con);

            JRViewer viewer = new JRViewer(print);
            escritorio.removeAll();
            escritorio.add(viewer);
            viewer.setBounds(0, 0, escritorio.getWidth(), escritorio.getHeight());
            escritorio.revalidate();
            escritorio.repaint();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al generar reporte: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Main.class.getName());
    
    private boolean usuarioLogeado = false;
    private String nombreUsuarioActual = "";
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jTextField1 = new javax.swing.JTextField();
        escritorio = new javax.swing.JDesktopPane();
        lblUsuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuArchivo = new javax.swing.JMenu();
        ItemInicio = new javax.swing.JMenuItem();
        ItemCerrarSesion = new javax.swing.JMenuItem();
        itemSalir = new javax.swing.JMenuItem();
        MenuGestion = new javax.swing.JMenu();
        crudEmpleados = new javax.swing.JMenuItem();
        crudProductos = new javax.swing.JMenuItem();
        crudProveedores = new javax.swing.JMenuItem();
        crudClientes = new javax.swing.JMenuItem();
        crudUsuarios = new javax.swing.JMenuItem();
        MenuPedidos = new javax.swing.JMenu();
        itemNuevoPedido = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        MenuReportes = new javax.swing.JMenu();
        repEmpleados = new javax.swing.JMenuItem();
        repProductos = new javax.swing.JMenuItem();
        repProveedores = new javax.swing.JMenuItem();
        repClientes = new javax.swing.JMenuItem();
        repFacturas = new javax.swing.JMenuItem();
        repUsuarios = new javax.swing.JMenuItem();
        MenuConfiguracion = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        MenuAyuda = new javax.swing.JMenu();
        jMenuItem23 = new javax.swing.JMenuItem();

        jMenu6.setText("File");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar2.add(jMenu7);

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(java.awt.SystemColor.activeCaption);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 255));
        jMenuBar1.setMaximumSize(new java.awt.Dimension(600, 32768));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(436, 35));

        MenuArchivo.setText("Archivo");
        MenuArchivo.setMinimumSize(new java.awt.Dimension(75, 30));

        ItemInicio.setText("Iniciar sesión");
        ItemInicio.setPreferredSize(new java.awt.Dimension(77, 30));
        ItemInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemInicioActionPerformed(evt);
            }
        });
        MenuArchivo.add(ItemInicio);

        ItemCerrarSesion.setText("Cerrar sesión");
        ItemCerrarSesion.setPreferredSize(new java.awt.Dimension(116, 30));
        ItemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCerrarSesionActionPerformed(evt);
            }
        });
        MenuArchivo.add(ItemCerrarSesion);

        itemSalir.setText("Salir");
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        MenuArchivo.add(itemSalir);

        jMenuBar1.add(MenuArchivo);

        MenuGestion.setText("Gestión");
        MenuGestion.setMinimumSize(new java.awt.Dimension(75, 30));

        crudEmpleados.setText("Empleados");
        crudEmpleados.setPreferredSize(new java.awt.Dimension(106, 30));
        crudEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crudEmpleadosActionPerformed(evt);
            }
        });
        MenuGestion.add(crudEmpleados);

        crudProductos.setText("Productos");
        crudProductos.setPreferredSize(new java.awt.Dimension(102, 30));
        crudProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crudProductosActionPerformed(evt);
            }
        });
        MenuGestion.add(crudProductos);

        crudProveedores.setText("Proveedores");
        crudProveedores.setPreferredSize(new java.awt.Dimension(113, 30));
        crudProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crudProveedoresActionPerformed(evt);
            }
        });
        MenuGestion.add(crudProveedores);

        crudClientes.setText("Clientes");
        crudClientes.setPreferredSize(new java.awt.Dimension(90, 30));
        crudClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crudClientesActionPerformed(evt);
            }
        });
        MenuGestion.add(crudClientes);

        crudUsuarios.setText("Usuarios");
        crudUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crudUsuariosActionPerformed(evt);
            }
        });
        MenuGestion.add(crudUsuarios);

        jMenuBar1.add(MenuGestion);

        MenuPedidos.setMnemonic('1');
        MenuPedidos.setText("Pedidos");

        itemNuevoPedido.setText("Nuevo pedido");
        itemNuevoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNuevoPedidoActionPerformed(evt);
            }
        });
        MenuPedidos.add(itemNuevoPedido);

        jMenuItem9.setText("Ver pedidos");
        MenuPedidos.add(jMenuItem9);

        jMenuBar1.add(MenuPedidos);

        MenuReportes.setText("Reportes");

        repEmpleados.setText("Empleados");
        repEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repEmpleadosActionPerformed(evt);
            }
        });
        MenuReportes.add(repEmpleados);

        repProductos.setText("Productos");
        repProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repProductosActionPerformed(evt);
            }
        });
        MenuReportes.add(repProductos);

        repProveedores.setText("Proveedores");
        repProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repProveedoresActionPerformed(evt);
            }
        });
        MenuReportes.add(repProveedores);

        repClientes.setText("Clientes");
        repClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repClientesActionPerformed(evt);
            }
        });
        MenuReportes.add(repClientes);

        repFacturas.setText("Facturas");
        repFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repFacturasActionPerformed(evt);
            }
        });
        MenuReportes.add(repFacturas);

        repUsuarios.setText("Usuarios");
        repUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repUsuariosActionPerformed(evt);
            }
        });
        MenuReportes.add(repUsuarios);

        jMenuBar1.add(MenuReportes);

        MenuConfiguracion.setText("Configuración");

        jMenuItem20.setText("Información del restaurante");
        MenuConfiguracion.add(jMenuItem20);

        jMenuBar1.add(MenuConfiguracion);

        MenuAyuda.setText("Ayuda");

        jMenuItem23.setText("Acerca del sistema");
        MenuAyuda.add(jMenuItem23);

        jMenuBar1.add(MenuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItemInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemInicioActionPerformed
        Login login = new Login(this);
        mostrarVentana(login);

    }//GEN-LAST:event_ItemInicioActionPerformed

    private void crudEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crudEmpleadosActionPerformed
        mostrarVentana(new Empleados());
    }//GEN-LAST:event_crudEmpleadosActionPerformed

    private void crudProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crudProductosActionPerformed
        mostrarVentana(new Productos());
    }//GEN-LAST:event_crudProductosActionPerformed

    private void itemNuevoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNuevoPedidoActionPerformed
       try {
           mostrarVentana(new PedidosyFacturacion());
       } catch (SQLException ex) {
           System.getLogger(Main.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
       }
    }//GEN-LAST:event_itemNuevoPedidoActionPerformed

    private void repEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repEmpleadosActionPerformed
       ReportUtils.mostrarReporte("/Reportes/jrEmpleados.jrxml", con, escritorio);
    }//GEN-LAST:event_repEmpleadosActionPerformed

    private void repFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repFacturasActionPerformed
        ReportUtils.mostrarReporte("/Reportes/jrFacturas.jrxml", con, escritorio);
    }//GEN-LAST:event_repFacturasActionPerformed

    private void repClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repClientesActionPerformed
        ReportUtils.mostrarReporte("/Reportes/jrClientes.jrxml", con, escritorio);
    }//GEN-LAST:event_repClientesActionPerformed

    private void repProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repProductosActionPerformed
        ReportUtils.mostrarReporte("/Reportes/jrProductos.jrxml", con, escritorio);
    }//GEN-LAST:event_repProductosActionPerformed

    private void repProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repProveedoresActionPerformed
        ReportUtils.mostrarReporte("/Reportes/jrProveedores.jrxml", con, escritorio);
    }//GEN-LAST:event_repProveedoresActionPerformed

    private void crudProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crudProveedoresActionPerformed
        mostrarVentana(new Proveedor());
    }//GEN-LAST:event_crudProveedoresActionPerformed

    private void crudClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crudClientesActionPerformed
        mostrarVentana(new Cliente());
    }//GEN-LAST:event_crudClientesActionPerformed

    private void crudUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crudUsuariosActionPerformed
        mostrarVentana(new Usuarios());
    }//GEN-LAST:event_crudUsuariosActionPerformed

    private void repUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repUsuariosActionPerformed
        ReportUtils.mostrarReporte("/Reportes/jrUsuarios.jrxml", con, escritorio);
    }//GEN-LAST:event_repUsuariosActionPerformed

    private void ItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCerrarSesionActionPerformed
        SesionUsuario.cerrarSesion();
        JOptionPane.showMessageDialog(this, "Sesión finalizada correctamente.");
        actualizarUsuarioActivo();
        bloquearMenus();
        
    }//GEN-LAST:event_ItemCerrarSesionActionPerformed

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            Main main = new Main();
            main.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemCerrarSesion;
    private javax.swing.JMenuItem ItemInicio;
    private javax.swing.JMenu MenuArchivo;
    private javax.swing.JMenu MenuAyuda;
    private javax.swing.JMenu MenuConfiguracion;
    private javax.swing.JMenu MenuGestion;
    private javax.swing.JMenu MenuPedidos;
    private javax.swing.JMenu MenuReportes;
    private javax.swing.JMenuItem crudClientes;
    private javax.swing.JMenuItem crudEmpleados;
    private javax.swing.JMenuItem crudProductos;
    private javax.swing.JMenuItem crudProveedores;
    private javax.swing.JMenuItem crudUsuarios;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem itemNuevoPedido;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenuItem repClientes;
    private javax.swing.JMenuItem repEmpleados;
    private javax.swing.JMenuItem repFacturas;
    private javax.swing.JMenuItem repProductos;
    private javax.swing.JMenuItem repProveedores;
    private javax.swing.JMenuItem repUsuarios;
    // End of variables declaration//GEN-END:variables

    
}
