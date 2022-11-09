package paneles;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;

public class Principal extends javax.swing.JFrame {
    
    private static Principal neophos;
    private static Generar_Orden generar_orden;
    private static GenerarOrdenProduccion orden;
    
    public Principal(){
        initComponents();
        opciones.setVisible(false);
        logo.setVisible(false);
        pintarImagen(logo, "src/iconos/logo.png");
    }
    
    public static Principal getNeophos(){
        return neophos;
    }

    // go_to es una funcion que nos ayuda a cambiar entre los paneles del sistema
    public void go_to(JPanel panel) {
        if (!pantalla_principal.isShowing()){
            int input = JOptionPane.showConfirmDialog(this,"Seguro desea cambiar de panel? Perdera los cambios que haya realizado y no guardado", "¡Cuidado!",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
            if (input != 0){
                return;
            }
        }
        if (panel == pantalla_principal){
            logo.setVisible(false);
        }else if (!logo.isVisible()){
            logo.setVisible(true);
        }
        
        inicio.setLayout(new java.awt.BorderLayout());
        inicio.removeAll();
        inicio.add(panel,BorderLayout.CENTER);
        inicio.repaint();
        inicio.revalidate();
    }
    
    public static JPanel getGenerar_Orden(){
        return generar_orden;
    }
    public static JPanel getGenerar_Orden_Produccion(){
        return orden;
    }
    
    private void pintarImagen(JLabel lb1, String ruta){
        
        ImageIcon imagen = new ImageIcon(ruta);
        ImageIcon icon = new ImageIcon(imagen.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT)); 
        lb1.setIcon(icon);
        this.repaint();
    }

    // PopUp es una funcion que mostrara por pantalla mensajes necesarios para comunicar al usuario
    // por parametro toma Imprimir (string que dira la informacion importante), 
    // imagen (URL que nos llevara a la imagen que queremos utilizar)
    // y toma titulo (el titulo que tendra la pantalla emergente de PopUp)
    public void PopUp(String Imprimir, String imagen, String titulo) {
        JLabel jLabel9 = new JLabel();
        jLabel9.setFont(new Font("Microsoft YaHei", 1, 17));
        jLabel9.setText(Imprimir+ "  ");

        JOptionPane.showMessageDialog(this, jLabel9, " "+ titulo, JOptionPane.PLAIN_MESSAGE, new ImageIcon(imagen));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        contenedor = new javax.swing.JPanel();
        inicio = new javax.swing.JPanel();
        pantalla_principal = new javax.swing.JPanel();
        Separador7 = new javax.swing.JLabel();
        Titulo2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        franja_roja = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        menu = new javax.swing.JLabel();
        opciones = new javax.swing.JPanel();
        cargar_materia = new javax.swing.JLabel();
        consultar_materia = new javax.swing.JLabel();
        generar_orden_compra = new javax.swing.JLabel();
        generar_orden_produccion = new javax.swing.JLabel();
        consultar_orden_produccion = new javax.swing.JLabel();
        consultar_orden = new javax.swing.JLabel();
        consultar_producto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        contenedor.setBackground(new java.awt.Color(227, 227, 218));
        contenedor.setMaximumSize(new java.awt.Dimension(1042, 619));

        inicio.setBackground(new java.awt.Color(227, 227, 218));
        inicio.setMaximumSize(new java.awt.Dimension(1042, 619));
        inicio.setPreferredSize(new java.awt.Dimension(1042, 619));

        pantalla_principal.setBackground(new java.awt.Color(227, 227, 218));
        pantalla_principal.setMaximumSize(new java.awt.Dimension(1042, 619));
        pantalla_principal.setPreferredSize(new java.awt.Dimension(1042, 619));

        Separador7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Separador7.setForeground(new java.awt.Color(97, 34, 34));
        Separador7.setText("__________________________________________________________________________________________________________________________________________________________________________________________________");

        Titulo2.setFont(new java.awt.Font("Microsoft YaHei", 1, 21)); // NOI18N
        Titulo2.setForeground(new java.awt.Color(97, 34, 34));
        Titulo2.setText("NEOPHOS");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("el manejo de los productos, pedidos y costos de la empresa”");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("VISIÓN: “Convertirnos en una opción fiable, segura y eficiente para ");

        javax.swing.GroupLayout pantalla_principalLayout = new javax.swing.GroupLayout(pantalla_principal);
        pantalla_principal.setLayout(pantalla_principalLayout);
        pantalla_principalLayout.setHorizontalGroup(
            pantalla_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantalla_principalLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(Separador7)
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantalla_principalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pantalla_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantalla_principalLayout.createSequentialGroup()
                        .addComponent(Titulo2)
                        .addGap(506, 506, 506))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantalla_principalLayout.createSequentialGroup()
                        .addGroup(pantalla_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantalla_principalLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(38, 38, 38)))
                        .addGap(233, 233, 233))))
        );
        pantalla_principalLayout.setVerticalGroup(
            pantalla_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantalla_principalLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Titulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separador7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 339, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(jLabel2))
        );

        javax.swing.GroupLayout inicioLayout = new javax.swing.GroupLayout(inicio);
        inicio.setLayout(inicioLayout);
        inicioLayout.setHorizontalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pantalla_principal, javax.swing.GroupLayout.DEFAULT_SIZE, 1139, Short.MAX_VALUE)
        );
        inicioLayout.setVerticalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pantalla_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        franja_roja.setBackground(new java.awt.Color(97, 34, 34));

        logo.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        logo.setForeground(new java.awt.Color(227, 227, 218));
        logo.setText("NEOPHOS");
        logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoMouseClicked(evt);
            }
        });

        menu.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 40)); // NOI18N
        menu.setForeground(new java.awt.Color(255, 255, 255));
        menu.setText("=");
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });

        opciones.setBackground(new java.awt.Color(74, 22, 22));

        cargar_materia.setBackground(new java.awt.Color(97, 34, 34));
        cargar_materia.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 13)); // NOI18N
        cargar_materia.setForeground(new java.awt.Color(227, 227, 218));
        cargar_materia.setText("    Cargar Materia Prima");
        cargar_materia.setOpaque(true);
        cargar_materia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cargar_materiaMouseClicked(evt);
            }
        });

        consultar_materia.setBackground(new java.awt.Color(97, 34, 34));
        consultar_materia.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 13)); // NOI18N
        consultar_materia.setForeground(new java.awt.Color(227, 227, 218));
        consultar_materia.setText("  Consultar Materia Prima");
        consultar_materia.setOpaque(true);
        consultar_materia.setPreferredSize(new java.awt.Dimension(163, 34));
        consultar_materia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultar_materiaMouseClicked(evt);
            }
        });

        generar_orden_compra.setBackground(new java.awt.Color(97, 34, 34));
        generar_orden_compra.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 13)); // NOI18N
        generar_orden_compra.setForeground(new java.awt.Color(227, 227, 218));
        generar_orden_compra.setText("   Generar Orden de Compra  ");
        generar_orden_compra.setOpaque(true);
        generar_orden_compra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generar_orden_compraMouseClicked(evt);
            }
        });

        generar_orden_produccion.setBackground(new java.awt.Color(97, 34, 34));
        generar_orden_produccion.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 13)); // NOI18N
        generar_orden_produccion.setForeground(new java.awt.Color(227, 227, 218));
        generar_orden_produccion.setText("    Generar Orden de Produccion  ");
        generar_orden_produccion.setOpaque(true);
        generar_orden_produccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generar_orden_produccionMouseClicked(evt);
            }
        });

        consultar_orden_produccion.setBackground(new java.awt.Color(97, 34, 34));
        consultar_orden_produccion.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 13)); // NOI18N
        consultar_orden_produccion.setForeground(new java.awt.Color(227, 227, 218));
        consultar_orden_produccion.setText("  Consultar Orden de Produccion  ");
        consultar_orden_produccion.setOpaque(true);
        consultar_orden_produccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultar_orden_produccionMouseClicked(evt);
            }
        });

        consultar_orden.setBackground(new java.awt.Color(97, 34, 34));
        consultar_orden.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 13)); // NOI18N
        consultar_orden.setForeground(new java.awt.Color(227, 227, 218));
        consultar_orden.setText("  Consultar Orden de Compra");
        consultar_orden.setOpaque(true);
        consultar_orden.setPreferredSize(new java.awt.Dimension(156, 34));
        consultar_orden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultar_ordenMouseClicked(evt);
            }
        });

        consultar_producto.setBackground(new java.awt.Color(97, 34, 34));
        consultar_producto.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 13)); // NOI18N
        consultar_producto.setForeground(new java.awt.Color(227, 227, 218));
        consultar_producto.setText("  Consultar Producto Final  ");
        consultar_producto.setOpaque(true);
        consultar_producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultar_productoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout opcionesLayout = new javax.swing.GroupLayout(opciones);
        opciones.setLayout(opcionesLayout);
        opcionesLayout.setHorizontalGroup(
            opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cargar_materia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(consultar_materia, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(generar_orden_compra, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(consultar_orden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(consultar_orden_produccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(generar_orden_produccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addComponent(consultar_producto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        opcionesLayout.setVerticalGroup(
            opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargar_materia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generar_orden_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generar_orden_produccion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultar_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultar_materia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultar_orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultar_orden_produccion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout franja_rojaLayout = new javax.swing.GroupLayout(franja_roja);
        franja_roja.setLayout(franja_rojaLayout);
        franja_rojaLayout.setHorizontalGroup(
            franja_rojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, franja_rojaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(menu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        franja_rojaLayout.setVerticalGroup(
            franja_rojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(franja_rojaLayout.createSequentialGroup()
                .addGroup(franja_rojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(franja_rojaLayout.createSequentialGroup()
                        .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(franja_roja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 1139, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addComponent(franja_roja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        System.out.println("entre");
        opciones.setVisible(true);
        System.out.println("no funciono");
    }//GEN-LAST:event_menuMouseClicked

    private void consultar_ordenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_ordenMouseClicked
        opciones.setVisible(false);
        try {
            go_to(new ConsultarOrdenDeCompra());
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_consultar_ordenMouseClicked

    private void cargar_materiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargar_materiaMouseClicked
        opciones.setVisible(false);
        try {
            go_to(new CargarMateriaPrima(""));
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cargar_materiaMouseClicked

    private void generar_orden_compraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generar_orden_compraMouseClicked
        opciones.setVisible(false);
        try {
            go_to(generar_orden = new Generar_Orden());
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_generar_orden_compraMouseClicked

    private void consultar_materiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_materiaMouseClicked
        opciones.setVisible(false);
        try {
            go_to(new Agregar_Producto(""));
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_consultar_materiaMouseClicked

    private void generar_orden_produccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generar_orden_produccionMouseClicked
        opciones.setVisible(false);
        try {
            go_to(orden = new GenerarOrdenProduccion());
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_generar_orden_produccionMouseClicked

    private void consultar_orden_produccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_orden_produccionMouseClicked
        opciones.setVisible(false);
        try {
            go_to(new Consultar_OrdenDeProduccion());
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_consultar_orden_produccionMouseClicked

    private void consultar_productoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_productoMouseClicked
        opciones.setVisible(false);
        try {
            go_to(new Consultar_ProductoFinal(0));
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_consultar_productoMouseClicked

    private void logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMouseClicked
        go_to(pantalla_principal);
    }//GEN-LAST:event_logoMouseClicked

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
            
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    neophos = new Principal();
                    neophos.setLocationRelativeTo(null);
                    neophos.setVisible(true);
                    neophos.setResizable(false);
                
                }
            
            
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Separador7;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JLabel cargar_materia;
    private javax.swing.JLabel consultar_materia;
    private javax.swing.JLabel consultar_orden;
    private javax.swing.JLabel consultar_orden_produccion;
    private javax.swing.JLabel consultar_producto;
    private javax.swing.JPanel contenedor;
    private javax.swing.JPanel franja_roja;
    private javax.swing.JLabel generar_orden_compra;
    private javax.swing.JLabel generar_orden_produccion;
    private javax.swing.JPanel inicio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel menu;
    private javax.swing.JPanel opciones;
    private javax.swing.JPanel pantalla_principal;
    // End of variables declaration//GEN-END:variables

}
