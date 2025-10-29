package Formulario;

import javax.swing.JOptionPane;
import Conexion.Conexion;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import javax.swing.text.DateFormatter;
import proyectofinal.SesionUsuario;




public class Cliente extends javax.swing.JInternalFrame {
    Conexion conexionPostgres = new Conexion();
    Connection con;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Cliente.class.getName());
  
    public Cliente() {
       
        initComponents();
        
        try{
            con = conexionPostgres.getConexion();
            
        }catch (SQLException e){
            e.getMessage();
        }
        
    }
    public Cliente(String origen){
        initComponents();
        
        try{
            con = conexionPostgres.getConexion();
            
        }catch (SQLException e){
            e.getMessage();
        }
          
    }

 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtFechaIngreso = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnLimpiar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setText("Id:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Teléfono:");

        jLabel5.setText("Correo:");

        jLabel6.setText("Dirección: ");

        jLabel7.setText("Fecha Ingreso: ");

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        txtFechaIngreso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabel8.setText("NIT:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtId)
                    .addComponent(txtNombre)
                    .addComponent(txtTelefono)
                    .addComponent(txtCorreo)
                    .addComponent(txtDireccion)
                    .addComponent(txtFechaIngreso)
                    .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnConsultar.setText("CONSULTAR");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnLimpiar1.setText("LIMPIAR");
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiar1)
                .addGap(160, 160, 160))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(btnConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpiar1)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (!SesionUsuario.sesionActiva()) {
        JOptionPane.showMessageDialog(this, 
            "Debe iniciar sesión antes de realizar un registro.",
            "Acceso denegado",
            JOptionPane.WARNING_MESSAGE);
        return;
    }
        try{
            int clienteId = Integer.parseInt(txtId.getText().strip());
            String nombre = txtNombre.getText();
            String telefono = txtTelefono.getText();
            String correo = txtCorreo.getText();
            String direccion = txtDireccion.getText();
            java.util.Date fechaIngreso = (java.util.Date) txtFechaIngreso.getValue();
            java.sql.Date fechaSQL = new java.sql.Date(fechaIngreso.getTime());
             String nit = txtNit.getText();
             
            if (nombre.isEmpty() || telefono.isEmpty() || correo.isEmpty() ||
            direccion.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos antes de actualizar.");
            return;
            }
            
            String qry = "UPDATE public.clientes SET nombre = ?, telefono = ?, correo = ?, direccion = ?, fecha_ingreso = ?, nit = ?  WHERE cliente_id = ?";
            PreparedStatement ps = con.prepareStatement(qry);
            ps.setString(1, nombre);
            ps.setString(2, telefono);
            ps.setString(3, correo);
            ps.setString(4, direccion);
            ps.setDate(5, fechaSQL);
            ps.setString(6, nit);
            ps.setInt(7, clienteId);
            
     
            
            
            int filasActualizadas = ps.executeUpdate();
            
            if (filasActualizadas > 0){
                JOptionPane.showMessageDialog(null, "Registro actualizado correctamente.");
                limpiar();
            }else {
                JOptionPane.showMessageDialog(null, "No se encontró un Cliente con el ID " + clienteId);
            }
            ps.close();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al actualizar registro: " + e.getMessage());
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try{ 
            int id = Integer.parseInt(txtId.getText().trim());
            String qry = "SELECT * FROM public.clientes WHERE cliente_id = ?";
            
            try(PreparedStatement ps = con.prepareStatement(qry)){
                ps.setInt(1, id);
                
                try (ResultSet rs = ps.executeQuery()){
                    if (rs.next()){
                        
                        String nombre = rs.getString("nombre");
                        String telefono = rs.getString("telefono");
                        String correo = rs.getString("correo");
                        String direccion = rs.getString("direccion");
                        String nit = rs.getString("nit");
                        
                        txtNombre.setText(nombre);
                        txtTelefono.setText(telefono);
                        txtCorreo.setText(correo);                      
                        txtDireccion.setText(direccion);
                        txtNit.setText(nit);
                        
                       java.sql.Date fechaSQL = rs.getDate("fecha_ingreso");
                        if (fechaSQL != null) {
                            java.util.Date fecha = new java.util.Date(fechaSQL.getTime());
                            java.text.SimpleDateFormat formato = new java.text.SimpleDateFormat("dd/MM/yyyy");
                            String fechaFormateada = formato.format(fecha);
                            txtFechaIngreso.setText(fechaFormateada); 
                        } else {
                            txtFechaIngreso.setText("");
                        }

                        
                        JOptionPane.showMessageDialog(this, "Registro encontrado: " + nombre );
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "No se encontró el Cliente con el ID: " + id);
                    }
                }
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnConsultarActionPerformed
    
    public void limpiar(){
        txtId.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        txtDireccion.setText("");        
        txtFechaIngreso.setText(""); 
        txtNit.setText("");
        txtId.requestFocus();
        
        
    }
    
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
    try{
            String nombreCliente = txtNombre.getText();
            String telefono = txtTelefono.getText();
            String correo = txtCorreo.getText();
            String direccion = txtDireccion.getText();
            String nit = txtNit.getText();
            
            java.util.Date fechaIngreso = (java.util.Date) txtFechaIngreso.getValue();
            java.sql.Date fechaSQL = new java.sql.Date(fechaIngreso.getTime());
            
            if (nombreCliente.isEmpty()||telefono.isEmpty()||correo.isEmpty()||direccion.isEmpty()){
                JOptionPane.showMessageDialog(null, "Complete todos los datos.");
                return;
            }            
            
            String qry = "INSERT INTO public.clientes(nombre, telefono, correo, direccion, fecha_ingreso, nit)" + " values(?,?,?,?,?,?)";
            
            PreparedStatement ps = con.prepareStatement (qry);
            ps.setString(1, nombreCliente);
            ps.setString(2, telefono);
            ps.setString(3, correo);
            ps.setString(4, direccion);
            ps.setDate(5, fechaSQL);   
            ps.setString(6, nit);
            
            int filasInsertadas = ps.executeUpdate();
            
            if (filasInsertadas > 0){
                JOptionPane.showMessageDialog(null, "El registro se ha realizado con exito.");
                limpiar();
            }else {
                JOptionPane.showMessageDialog(null, "No se ha podido insertar el registro.");
            }
            ps.close();
                    
        }catch (SQLException e){
            e.getMessage();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
        String id = txtId.getText().trim();
        
        if (id.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese el Id del Cliente.");
            return;
        }
        
        String qry = "DELETE FROM public.clientes WHERE cliente_id = ?";
        PreparedStatement ps = con.prepareStatement(qry);
        ps.setInt(1, Integer.parseInt(id));
        
        int filasEliminadas = ps.executeUpdate();
        
        if (filasEliminadas > 0){
            JOptionPane.showMessageDialog(null, "Cliente eliminado correctamente.");
            limpiar();
        }else{
            JOptionPane.showMessageDialog(null, "No se encontró un Cliente con el ID: "+id);
           
        }
    
    }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "El Id debe ser un número válido.");
    }catch (SQLException e){
        JOptionPane.showMessageDialog(null, "Error al eliminar el cliente: "+e.getMessage());
    }
    }//GEN-LAST:event_btnEliminarActionPerformed
 
    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
       //     logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Cliente().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JFormattedTextField txtFechaIngreso;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
