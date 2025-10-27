
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
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setTitle("Karl's Restaurant");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        
        try{
            con = conexionPostgres.getConexion();
            
        }catch (SQLException e){
            e.getMessage();
        }
    
    }

   
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jTextField1 = new javax.swing.JTextField();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuArchivo = new javax.swing.JMenu();
        ItemInicio = new javax.swing.JMenuItem();
        ItemCerrarSesion = new javax.swing.JMenuItem();
        ItemSalir = new javax.swing.JMenuItem();
        MenuGestion = new javax.swing.JMenu();
        ItemEmpleados = new javax.swing.JMenuItem();
        ItemProductos = new javax.swing.JMenuItem();
        ItemCategorias = new javax.swing.JMenuItem();
        ItemProveedores = new javax.swing.JMenuItem();
        ItemClientes = new javax.swing.JMenuItem();
        MenuPedidos = new javax.swing.JMenu();
        itemNuevoPedido = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        MenuUsuarios = new javax.swing.JMenu();
        menuRegistrarUsuarios = new javax.swing.JMenuItem();
        menuVerUsuarios = new javax.swing.JMenuItem();
        menuEditarUsuarios = new javax.swing.JMenuItem();
        menuEliminarUsuarios = new javax.swing.JMenuItem();
        MenuReportes = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        menuEmpleados = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        MenuConfiguracion = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        MenuAyuda = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();

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
            .addGap(0, 408, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 255));
        jMenuBar1.setMaximumSize(new java.awt.Dimension(600, 32768));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(436, 35));

        MenuArchivo.setText("Archivo");
        MenuArchivo.setMinimumSize(new java.awt.Dimension(75, 30));

        ItemInicio.setText("Inicio");
        ItemInicio.setPreferredSize(new java.awt.Dimension(77, 30));
        ItemInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemInicioActionPerformed(evt);
            }
        });
        MenuArchivo.add(ItemInicio);

        ItemCerrarSesion.setText("Cerrar sesión");
        ItemCerrarSesion.setPreferredSize(new java.awt.Dimension(116, 30));
        MenuArchivo.add(ItemCerrarSesion);

        ItemSalir.setText("Salir");
        ItemSalir.setPreferredSize(new java.awt.Dimension(72, 30));
        MenuArchivo.add(ItemSalir);

        jMenuBar1.add(MenuArchivo);

        MenuGestion.setText("Gestión");
        MenuGestion.setMinimumSize(new java.awt.Dimension(75, 30));

        ItemEmpleados.setText("Empleados");
        ItemEmpleados.setPreferredSize(new java.awt.Dimension(106, 30));
        ItemEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemEmpleadosActionPerformed(evt);
            }
        });
        MenuGestion.add(ItemEmpleados);

        ItemProductos.setText("Productos");
        ItemProductos.setPreferredSize(new java.awt.Dimension(102, 30));
        ItemProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemProductosActionPerformed(evt);
            }
        });
        MenuGestion.add(ItemProductos);

        ItemCategorias.setText("Categorías");
        ItemCategorias.setPreferredSize(new java.awt.Dimension(104, 30));
        MenuGestion.add(ItemCategorias);

        ItemProveedores.setText("Proveedores");
        ItemProveedores.setPreferredSize(new java.awt.Dimension(113, 30));
        MenuGestion.add(ItemProveedores);

        ItemClientes.setText("Clientes");
        ItemClientes.setPreferredSize(new java.awt.Dimension(90, 30));
        MenuGestion.add(ItemClientes);

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

        jMenuItem10.setText("Generar factura PDF");
        MenuPedidos.add(jMenuItem10);

        jMenuBar1.add(MenuPedidos);

        MenuUsuarios.setText("Usuarios");

        menuRegistrarUsuarios.setText("Registrar usuarios");
        menuRegistrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistrarUsuariosActionPerformed(evt);
            }
        });
        MenuUsuarios.add(menuRegistrarUsuarios);

        menuVerUsuarios.setText("Ver usuarios");
        menuVerUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerUsuariosActionPerformed(evt);
            }
        });
        MenuUsuarios.add(menuVerUsuarios);

        menuEditarUsuarios.setText("Editar usuarios");
        menuEditarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarUsuariosActionPerformed(evt);
            }
        });
        MenuUsuarios.add(menuEditarUsuarios);

        menuEliminarUsuarios.setText("Eliminar usuarios");
        menuEliminarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarUsuariosActionPerformed(evt);
            }
        });
        MenuUsuarios.add(menuEliminarUsuarios);

        jMenuBar1.add(MenuUsuarios);

        MenuReportes.setText("Reportes");

        jMenuItem15.setText("Reporte de ventas");
        MenuReportes.add(jMenuItem15);

        menuEmpleados.setText("Empleados");
        menuEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEmpleadosActionPerformed(evt);
            }
        });
        MenuReportes.add(menuEmpleados);

        jMenuItem17.setText("Clientes frecuentes");
        MenuReportes.add(jMenuItem17);

        jMenuItem18.setText("Exportar reporte a PDF");
        MenuReportes.add(jMenuItem18);

        jMenuBar1.add(MenuReportes);

        MenuConfiguracion.setText("Configuración");

        jMenuItem19.setText("Configuración DB");
        MenuConfiguracion.add(jMenuItem19);

        jMenuItem20.setText("Información del restaurante");
        MenuConfiguracion.add(jMenuItem20);

        jMenuItem21.setText("Preferencias del sistema");
        MenuConfiguracion.add(jMenuItem21);

        jMenuBar1.add(MenuConfiguracion);

        MenuAyuda.setText("Ayuda");

        jMenuItem22.setText("Manual de usuario");
        MenuAyuda.add(jMenuItem22);

        jMenuItem23.setText("Acerca del sistema");
        MenuAyuda.add(jMenuItem23);

        jMenuItem24.setText("Soporte");
        MenuAyuda.add(jMenuItem24);

        jMenuBar1.add(MenuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItemInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemInicioActionPerformed
        mostrarVentana(new Login());
    }//GEN-LAST:event_ItemInicioActionPerformed

    private void ItemEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemEmpleadosActionPerformed
        mostrarVentana(new Empleados());
    }//GEN-LAST:event_ItemEmpleadosActionPerformed

    private void ItemProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemProductosActionPerformed
        mostrarVentana(new Productos());
    }//GEN-LAST:event_ItemProductosActionPerformed

    private void menuRegistrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistrarUsuariosActionPerformed
        mostrarVentana(new Usuarios());
    }//GEN-LAST:event_menuRegistrarUsuariosActionPerformed

    private void menuVerUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerUsuariosActionPerformed
        mostrarVentana(new Usuarios());
    }//GEN-LAST:event_menuVerUsuariosActionPerformed

    private void menuEditarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarUsuariosActionPerformed
        mostrarVentana(new Usuarios());
    }//GEN-LAST:event_menuEditarUsuariosActionPerformed

    private void menuEliminarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarUsuariosActionPerformed
        mostrarVentana(new Usuarios());
    }//GEN-LAST:event_menuEliminarUsuariosActionPerformed

    private void itemNuevoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNuevoPedidoActionPerformed
       try {
           mostrarVentana(new PedidosyFacturacion());
       } catch (SQLException ex) {
           System.getLogger(Main.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
       }
    }//GEN-LAST:event_itemNuevoPedidoActionPerformed

    private void menuEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEmpleadosActionPerformed
       ReportUtils.mostrarReporte("/Reportes/jrEmpleados.jrxml", con, escritorio);
    }//GEN-LAST:event_menuEmpleadosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        SwingUtilities.invokeLater(Main::new);
        java.awt.EventQueue.invokeLater(() -> new Main().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemCategorias;
    private javax.swing.JMenuItem ItemCerrarSesion;
    private javax.swing.JMenuItem ItemClientes;
    private javax.swing.JMenuItem ItemEmpleados;
    private javax.swing.JMenuItem ItemInicio;
    private javax.swing.JMenuItem ItemProductos;
    private javax.swing.JMenuItem ItemProveedores;
    private javax.swing.JMenuItem ItemSalir;
    private javax.swing.JMenu MenuArchivo;
    private javax.swing.JMenu MenuAyuda;
    private javax.swing.JMenu MenuConfiguracion;
    private javax.swing.JMenu MenuGestion;
    private javax.swing.JMenu MenuPedidos;
    private javax.swing.JMenu MenuReportes;
    private javax.swing.JMenu MenuUsuarios;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem itemNuevoPedido;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuItem menuEditarUsuarios;
    private javax.swing.JMenuItem menuEliminarUsuarios;
    private javax.swing.JMenuItem menuEmpleados;
    private javax.swing.JMenuItem menuRegistrarUsuarios;
    private javax.swing.JMenuItem menuVerUsuarios;
    // End of variables declaration//GEN-END:variables

    
}
