
package G.Views;

import BaseDatos.Conexion;
import javax.swing.JInternalFrame;

public class MDIPrincipal extends javax.swing.JFrame {

    public MDIPrincipal() {
        initComponents();
        this.testconectar();
    }


    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        editMenu = new javax.swing.JMenu();
        mnItmGestClientes = new javax.swing.JMenuItem();
        mnItmListaClientes = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mnItmGestProductos = new javax.swing.JMenuItem();
        mnItmListaProductos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnItmGestVendedores = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        mnItmListadoVendedores = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        fileMenu = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar1.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        editMenu.setMnemonic('e');
        editMenu.setText("REGISTRO ");

        mnItmGestClientes.setMnemonic('d');
        mnItmGestClientes.setText("Pacientes");
        mnItmGestClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItmGestClientesActionPerformed(evt);
            }
        });
        editMenu.add(mnItmGestClientes);

        mnItmListaClientes.setText("Listado");
        mnItmListaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItmListaClientesActionPerformed(evt);
            }
        });
        editMenu.add(mnItmListaClientes);

        menuBar.add(editMenu);

        jMenu1.setText("HISTORIA");

        mnItmGestProductos.setText("Mostrar ");
        mnItmGestProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItmGestProductosActionPerformed(evt);
            }
        });
        jMenu1.add(mnItmGestProductos);

        mnItmListaProductos.setText("Listado");
        mnItmListaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItmListaProductosActionPerformed(evt);
            }
        });
        jMenu1.add(mnItmListaProductos);

        menuBar.add(jMenu1);

        jMenu2.setText("AREA");

        mnItmGestVendedores.setText("Medicina General");
        mnItmGestVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItmGestVendedoresActionPerformed(evt);
            }
        });
        jMenu2.add(mnItmGestVendedores);

        jMenuItem1.setText("Obstetricia");
        jMenu2.add(jMenuItem1);

        jMenuItem3.setText("Odontologia");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Pediatria");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        mnItmListadoVendedores.setText("Enfermeria");
        mnItmListadoVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItmListadoVendedoresActionPerformed(evt);
            }
        });
        jMenu2.add(mnItmListadoVendedores);

        jMenuItem2.setText("Psicologia");
        jMenu2.add(jMenuItem2);

        jMenuItem5.setText("Servicio de apoyo");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        menuBar.add(jMenu2);

        jMenu5.setText("FARMACIA");

        jMenuItem6.setText("Medicamento");
        jMenu5.add(jMenuItem6);

        jMenuItem7.setText("Receta ");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        menuBar.add(jMenu5);

        jMenu6.setText("REPORTES");

        jMenuItem8.setText("Diario");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem8);

        jMenuItem9.setText("Semanal");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem9);

        jMenuItem10.setText("Quincenal");
        jMenu6.add(jMenuItem10);

        jMenuItem11.setText("Mensual");
        jMenu6.add(jMenuItem11);

        menuBar.add(jMenu6);

        fileMenu.setMnemonic('f');
        fileMenu.setText("USUARIOS");

        jMenuItem12.setText("Registros De Usuario");
        fileMenu.add(jMenuItem12);

        menuBar.add(fileMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("AYUDA");

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Acerca del Desarrollador");
        helpMenu.add(aboutMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(exitMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                                
       System.exit(0);
 }                                                                                   

    private void mnItmGestClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItmGestClientesActionPerformed
       JIFGestionarPacientes jif = JIFGestionarPacientes.getInstancia();
       mostrarVentana(jif);
    }//GEN-LAST:event_mnItmGestClientesActionPerformed

    private void mnItmListaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItmListaClientesActionPerformed
       
    }//GEN-LAST:event_mnItmListaClientesActionPerformed

    private void mnItmGestProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItmGestProductosActionPerformed
        
    }//GEN-LAST:event_mnItmGestProductosActionPerformed

    private void mnItmListaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItmListaProductosActionPerformed
       
    }//GEN-LAST:event_mnItmListaProductosActionPerformed

    private void mnItmGestVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItmGestVendedoresActionPerformed
        
    }//GEN-LAST:event_mnItmGestVendedoresActionPerformed

    private void mnItmListadoVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItmListadoVendedoresActionPerformed
        
    }//GEN-LAST:event_mnItmListadoVendedoresActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed
    
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
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDIPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mnItmGestClientes;
    private javax.swing.JMenuItem mnItmGestProductos;
    private javax.swing.JMenuItem mnItmGestVendedores;
    private javax.swing.JMenuItem mnItmListaClientes;
    private javax.swing.JMenuItem mnItmListaProductos;
    private javax.swing.JMenuItem mnItmListadoVendedores;
    // End of variables declaration//GEN-END:variables
private void mostrarVentana(JInternalFrame jif){
        if(!jif.isVisible()){
            desktopPane.add(jif);
            jif.setVisible(true);
        }else{
            try {
                jif.setSelected(true);
                jif.toFront();
            } catch (Exception e) {
                System.out.println("Error: "+e.getMessage());
            }
        }
}
    private void testconectar() {
        try {
            Conexion c = new Conexion();
            c.conectar();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

}
