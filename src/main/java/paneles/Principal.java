package paneles;

import java.awt.BorderLayout;
import java.awt.Font;
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
    }
    
    public static Principal getNeophos(){
        return neophos;
    }

    // go_to es una funcion que nos ayuda a cambiar entre los paneles del sistema
    public void go_to(JPanel panel) {
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
        Titulo = new javax.swing.JLabel();
        Separador6 = new javax.swing.JLabel();
        franja_roja = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        menu = new javax.swing.JLabel();
        opciones = new javax.swing.JPanel();
        cargar_materia = new javax.swing.JLabel();
        consultar_materia = new javax.swing.JLabel();
        consultar_producto = new javax.swing.JLabel();
        generar_orden_compra = new javax.swing.JLabel();
        consultar_orden = new javax.swing.JLabel();
        generar_orden_produccion = new javax.swing.JLabel();
        consultar_orden_produccion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        contenedor.setBackground(new java.awt.Color(227, 227, 218));
        contenedor.setMaximumSize(new java.awt.Dimension(1042, 619));

        inicio.setBackground(new java.awt.Color(227, 227, 218));
        inicio.setMaximumSize(new java.awt.Dimension(1042, 619));
        inicio.setPreferredSize(new java.awt.Dimension(1042, 619));

        Titulo.setFont(new java.awt.Font("Microsoft YaHei", 1, 21)); // NOI18N
        Titulo.setForeground(new java.awt.Color(97, 34, 34));
        Titulo.setText("NEOPHOS");

        Separador6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Separador6.setForeground(new java.awt.Color(97, 34, 34));
        Separador6.setText("__________________________________________________________________________________________________________________________________________________________________________________________________");

        javax.swing.GroupLayout inicioLayout = new javax.swing.GroupLayout(inicio);
        inicio.setLayout(inicioLayout);
        inicioLayout.setHorizontalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(Separador6))
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(482, 482, 482)
                        .addComponent(Titulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        inicioLayout.setVerticalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separador6)
                .addContainerGap(410, Short.MAX_VALUE))
        );

        franja_roja.setBackground(new java.awt.Color(97, 34, 34));

        logo.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        logo.setForeground(new java.awt.Color(227, 227, 218));
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/logo.png"))); // NOI18N

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu.png"))); // NOI18N
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });

        opciones.setBackground(new java.awt.Color(74, 22, 22));

        cargar_materia.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 13)); // NOI18N
        cargar_materia.setForeground(new java.awt.Color(227, 227, 218));
        cargar_materia.setText("Cargar Materia Prima");
        cargar_materia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        cargar_materia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cargar_materiaMouseClicked(evt);
            }
        });

        consultar_materia.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 13)); // NOI18N
        consultar_materia.setForeground(new java.awt.Color(227, 227, 218));
        consultar_materia.setText("Consultar Materia Prima");
        consultar_materia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultar_materiaMouseClicked(evt);
            }
        });

        consultar_producto.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 13)); // NOI18N
        consultar_producto.setForeground(new java.awt.Color(227, 227, 218));
        consultar_producto.setText("Consultar Producto Final");
        consultar_producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultar_productoMouseClicked(evt);
            }
        });

        generar_orden_compra.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 13)); // NOI18N
        generar_orden_compra.setForeground(new java.awt.Color(227, 227, 218));
        generar_orden_compra.setText("Generar Orden de Compra");
        generar_orden_compra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generar_orden_compraMouseClicked(evt);
            }
        });

        consultar_orden.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 13)); // NOI18N
        consultar_orden.setForeground(new java.awt.Color(227, 227, 218));
        consultar_orden.setText("Consultar Orden de Compra");
        consultar_orden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultar_ordenMouseClicked(evt);
            }
        });

        generar_orden_produccion.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 13)); // NOI18N
        generar_orden_produccion.setForeground(new java.awt.Color(227, 227, 218));
        generar_orden_produccion.setText("Generar Orden de Produccion");
        generar_orden_produccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generar_orden_produccionMouseClicked(evt);
            }
        });

        consultar_orden_produccion.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 13)); // NOI18N
        consultar_orden_produccion.setForeground(new java.awt.Color(227, 227, 218));
        consultar_orden_produccion.setText("Consultar Orden de Produccion");
        consultar_orden_produccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultar_orden_produccionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout opcionesLayout = new javax.swing.GroupLayout(opciones);
        opciones.setLayout(opcionesLayout);
        opcionesLayout.setHorizontalGroup(
            opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesLayout.createSequentialGroup()
                .addGroup(opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(opcionesLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(cargar_materia)
                        .addGap(120, 120, 120)
                        .addComponent(consultar_materia))
                    .addGroup(opcionesLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(consultar_orden)
                        .addGap(98, 98, 98)
                        .addComponent(generar_orden_produccion)))
                .addGroup(opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(opcionesLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(consultar_orden_produccion)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(opcionesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(consultar_producto)
                        .addGap(120, 120, 120)
                        .addComponent(generar_orden_compra)
                        .addGap(57, 57, 57))))
        );
        opcionesLayout.setVerticalGroup(
            opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargar_materia)
                    .addComponent(consultar_materia)
                    .addComponent(consultar_producto)
                    .addComponent(generar_orden_compra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultar_orden)
                    .addComponent(generar_orden_produccion)
                    .addComponent(consultar_orden_produccion))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout franja_rojaLayout = new javax.swing.GroupLayout(franja_roja);
        franja_roja.setLayout(franja_rojaLayout);
        franja_rojaLayout.setHorizontalGroup(
            franja_rojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, franja_rojaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo)
                .addContainerGap())
            .addComponent(opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        franja_rojaLayout.setVerticalGroup(
            franja_rojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(franja_rojaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(franja_rojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
    private javax.swing.JLabel Separador6;
    private javax.swing.JLabel Titulo;
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
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel menu;
    private javax.swing.JPanel opciones;
    // End of variables declaration//GEN-END:variables

}
