package Formularios;

import Clases.Datos;
import Clases.DesktopConFondo;

public class frmPrincipal extends javax.swing.JFrame {

    private Datos misDatos;
    private int perfil;
    private String clave;
    private String usuario;
    
    public frmPrincipal() {
        initComponents();
    }
    public void setDatos(Datos misDatos) {
        this.misDatos = misDatos;
    }
    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpnEscritorio = new DesktopConFondo();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        mnuArchivoClientes = new javax.swing.JMenuItem();
        mnuArchivoProductos = new javax.swing.JMenuItem();
        mnuArchivoUsuarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuMovimientos = new javax.swing.JMenu();
        mnuMovimientosNuevaFactura = new javax.swing.JMenuItem();
        mnuMovimientosReporteFactura = new javax.swing.JMenuItem();
        mnuAyuda = new javax.swing.JMenu();
        mnuAyudaAcercaDe = new javax.swing.JMenuItem();
        mnuAyudaAyuda = new javax.swing.JMenuItem();
        mnuAyuda1 = new javax.swing.JMenu();
        mnuArchivoCambioClave = new javax.swing.JMenuItem();
        mnuArchivoCambioUsuario = new javax.swing.JMenuItem();
        mnuArchivoSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Facturación");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        dpnEscritorio.setBackground(java.awt.Color.lightGray);

        mnuArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/archivo24x24.png"))); // NOI18N
        mnuArchivo.setText("Archivo");

        mnuArchivoClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clientes24x24.png"))); // NOI18N
        mnuArchivoClientes.setText("Clientes");
        mnuArchivoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoClientesActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuArchivoClientes);

        mnuArchivoProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producto24x24.png"))); // NOI18N
        mnuArchivoProductos.setText("Productos");
        mnuArchivoProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoProductosActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuArchivoProductos);

        mnuArchivoUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/usuarios24x24.png"))); // NOI18N
        mnuArchivoUsuarios.setText("Usuarios");
        mnuArchivoUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoUsuariosActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuArchivoUsuarios);
        mnuArchivo.add(jSeparator1);

        jMenuBar1.add(mnuArchivo);

        mnuMovimientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/movimientos24x24.png"))); // NOI18N
        mnuMovimientos.setText("Movimientos");

        mnuMovimientosNuevaFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/facturaNuevo24x24.png"))); // NOI18N
        mnuMovimientosNuevaFactura.setText("Nueva Factura");
        mnuMovimientosNuevaFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMovimientosNuevaFacturaActionPerformed(evt);
            }
        });
        mnuMovimientos.add(mnuMovimientosNuevaFactura);

        mnuMovimientosReporteFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/facturaReporte24x24.png"))); // NOI18N
        mnuMovimientosReporteFactura.setText("Reporte Factura");
        mnuMovimientos.add(mnuMovimientosReporteFactura);

        jMenuBar1.add(mnuMovimientos);

        mnuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ayuda24x24.png"))); // NOI18N
        mnuAyuda.setText("Ayuda");

        mnuAyudaAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/acercaDe24x24.png"))); // NOI18N
        mnuAyudaAcercaDe.setText("Acerca De");
        mnuAyudaAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAyudaAcercaDeActionPerformed(evt);
            }
        });
        mnuAyuda.add(mnuAyudaAcercaDe);

        mnuAyudaAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ayuda.ayuda24x24.png"))); // NOI18N
        mnuAyudaAyuda.setText("Ayuda");
        mnuAyuda.add(mnuAyudaAyuda);

        jMenuBar1.add(mnuAyuda);

        mnuAyuda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/opc24x24.png"))); // NOI18N
        mnuAyuda1.setText("Configuración");

        mnuArchivoCambioClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/password24x24.png"))); // NOI18N
        mnuArchivoCambioClave.setText("Cambio Clave");
        mnuArchivoCambioClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoCambioClaveActionPerformed(evt);
            }
        });
        mnuAyuda1.add(mnuArchivoCambioClave);

        mnuArchivoCambioUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/usuarioCambio24x24.png"))); // NOI18N
        mnuArchivoCambioUsuario.setText("Cambio Usuario");
        mnuArchivoCambioUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoCambioUsuarioActionPerformed(evt);
            }
        });
        mnuAyuda1.add(mnuArchivoCambioUsuario);

        mnuArchivoSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salir24x24.png"))); // NOI18N
        mnuArchivoSalir.setText("Salir");
        mnuArchivoSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoSalirActionPerformed(evt);
            }
        });
        mnuAyuda1.add(mnuArchivoSalir);

        jMenuBar1.add(mnuAyuda1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnEscritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuArchivoProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoProductosActionPerformed
        frmProductos misProductos = new frmProductos();
        misProductos.setDatos(misDatos);
        dpnEscritorio.add(misProductos);
        misProductos.show();
    }//GEN-LAST:event_mnuArchivoProductosActionPerformed
    private void mnuArchivoUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoUsuariosActionPerformed
        frmUsuarios misUsuarios = new frmUsuarios();
        misUsuarios.setDatos(misDatos);
        dpnEscritorio.add(misUsuarios);
        misUsuarios.show();
    }//GEN-LAST:event_mnuArchivoUsuariosActionPerformed
    private void mnuArchivoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoSalirActionPerformed
        misDatos.grabarTodo();
        System.exit(0);
    }//GEN-LAST:event_mnuArchivoSalirActionPerformed
    private void mnuArchivoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoClientesActionPerformed
        frmClientes misClientes = new frmClientes();
        misClientes.setDatos(misDatos);
        dpnEscritorio.add(misClientes);
        misClientes.show();
    }//GEN-LAST:event_mnuArchivoClientesActionPerformed
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // establece imagen de fondo
        ((DesktopConFondo) dpnEscritorio).setImagen("/Images/fondo.jpg");
        
        // establece permisos
        if (perfil == 2) { // empleado
            mnuArchivoClientes.setEnabled(false);
            mnuArchivoProductos.setEnabled(false);
            mnuArchivoUsuarios.setEnabled(false);
            mnuMovimientosReporteFactura.setEnabled(false);
        }
    }//GEN-LAST:event_formWindowOpened
    private void mnuArchivoCambioUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoCambioUsuarioActionPerformed
       this.setVisible(false);
       frmLogin miLogin = new frmLogin();
       miLogin.setDatos(misDatos);
       miLogin.setLocationRelativeTo(null);
       miLogin.setVisible(true);
    }//GEN-LAST:event_mnuArchivoCambioUsuarioActionPerformed
    private void mnuArchivoCambioClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoCambioClaveActionPerformed
        frmCambioClave miCambio = new frmCambioClave(this, rootPaneCheckingEnabled);
        miCambio.setClave(clave);
        miCambio.setUsuario(usuario);
        miCambio.setDatos(misDatos);
        miCambio.setLocationRelativeTo(this);
        miCambio.setVisible(true);
    }//GEN-LAST:event_mnuArchivoCambioClaveActionPerformed
    private void mnuAyudaAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAyudaAcercaDeActionPerformed
       frmAcercaDe miAcerca = new frmAcercaDe(this, rootPaneCheckingEnabled);
       miAcerca.setLocationRelativeTo(this);
       miAcerca.setVisible(true);
    }//GEN-LAST:event_mnuAyudaAcercaDeActionPerformed
    private void mnuMovimientosNuevaFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMovimientosNuevaFacturaActionPerformed
        frmFactura miFactura = new frmFactura();
        miFactura.setDatos(misDatos);
        dpnEscritorio.add(miFactura);
        miFactura.show();
    }//GEN-LAST:event_mnuMovimientosNuevaFacturaActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpnEscritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenuItem mnuArchivoCambioClave;
    private javax.swing.JMenuItem mnuArchivoCambioUsuario;
    private javax.swing.JMenuItem mnuArchivoClientes;
    private javax.swing.JMenuItem mnuArchivoProductos;
    private javax.swing.JMenuItem mnuArchivoSalir;
    private javax.swing.JMenuItem mnuArchivoUsuarios;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenu mnuAyuda1;
    private javax.swing.JMenuItem mnuAyudaAcercaDe;
    private javax.swing.JMenuItem mnuAyudaAyuda;
    private javax.swing.JMenu mnuMovimientos;
    private javax.swing.JMenuItem mnuMovimientosNuevaFactura;
    private javax.swing.JMenuItem mnuMovimientosReporteFactura;
    // End of variables declaration//GEN-END:variables
}
