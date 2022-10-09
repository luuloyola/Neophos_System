package paneles;

import java.awt.BorderLayout;
import java.awt.Font;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;

public class Principal extends javax.swing.JFrame {
    
    private static Principal neophos;
    
    public Principal(){
        initComponents();
        
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

        contenedor = new javax.swing.JPanel();
        inicio = new javax.swing.JPanel();
        mesas = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        Separador6 = new javax.swing.JLabel();
        franja_roja = new javax.swing.JPanel();
        Titulo2 = new javax.swing.JLabel();
        cargar_materia = new javax.swing.JButton();
        consultar_mat = new javax.swing.JButton();
        consultar_ordeb = new javax.swing.JButton();
        generar_orde = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        contenedor.setBackground(new java.awt.Color(227, 227, 218));
        contenedor.setMaximumSize(new java.awt.Dimension(1042, 619));

        inicio.setBackground(new java.awt.Color(227, 227, 218));
        inicio.setMaximumSize(new java.awt.Dimension(1042, 619));
        inicio.setPreferredSize(new java.awt.Dimension(1042, 619));

        Titulo.setFont(new java.awt.Font("Microsoft YaHei", 1, 21)); // NOI18N
        Titulo.setForeground(new java.awt.Color(97, 34, 34));
        Titulo.setText("MENU PRINCIPAL");

        Separador6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Separador6.setForeground(new java.awt.Color(97, 34, 34));
        Separador6.setText("__________________________________________________________________________________________________________________________________________________________________________________________________");

        javax.swing.GroupLayout inicioLayout = new javax.swing.GroupLayout(inicio);
        inicio.setLayout(inicioLayout);
        inicioLayout.setHorizontalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mesas, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(inicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo)
                    .addComponent(Separador6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        inicioLayout.setVerticalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separador6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(mesas, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        mesas.setFont(new java.awt.Font("DialogInput", 1, 28));

        franja_roja.setBackground(new java.awt.Color(97, 34, 34));

        Titulo2.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        Titulo2.setForeground(new java.awt.Color(227, 227, 218));
        Titulo2.setText("NEOPHOS");

        cargar_materia.setBackground(new java.awt.Color(117, 49, 49));
        cargar_materia.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        cargar_materia.setForeground(new java.awt.Color(172, 172, 163));
        cargar_materia.setText("CARGAR MATERIA PRIMA");
        cargar_materia.setBorder(null);
        cargar_materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargar_materiaActionPerformed(evt);
            }
        });

        consultar_mat.setBackground(new java.awt.Color(117, 49, 49));
        consultar_mat.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        consultar_mat.setForeground(new java.awt.Color(172, 172, 163));
        consultar_mat.setText("CONSULTAR MATERIA PRIMA");
        consultar_mat.setBorder(null);
        consultar_mat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar_matActionPerformed(evt);
            }
        });

        consultar_ordeb.setBackground(new java.awt.Color(117, 49, 49));
        consultar_ordeb.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        consultar_ordeb.setForeground(new java.awt.Color(172, 172, 163));
        consultar_ordeb.setText("CONSULTAR ORDEN DE COMPRA");
        consultar_ordeb.setBorder(null);
        consultar_ordeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar_ordebActionPerformed(evt);
            }
        });

        generar_orde.setBackground(new java.awt.Color(117, 49, 49));
        generar_orde.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        generar_orde.setForeground(new java.awt.Color(172, 172, 163));
        generar_orde.setText("GENERAR ORDEN DE COMPRA");
        generar_orde.setBorder(null);
        generar_orde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generar_ordeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout franja_rojaLayout = new javax.swing.GroupLayout(franja_roja);
        franja_roja.setLayout(franja_rojaLayout);
        franja_rojaLayout.setHorizontalGroup(
            franja_rojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, franja_rojaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cargar_materia, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(consultar_mat, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(consultar_ordeb, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(generar_orde, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(Titulo2)
                .addGap(14, 14, 14))
        );
        franja_rojaLayout.setVerticalGroup(
            franja_rojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(franja_rojaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(franja_rojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargar_materia, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultar_mat, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultar_ordeb, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generar_orde, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        mesas.setFont(new java.awt.Font("DialogInput", 1, 28));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(franja_roja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addComponent(franja_roja, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void generar_ordeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generar_ordeActionPerformed
        go_to(new Generar_Orden());
    }//GEN-LAST:event_generar_ordeActionPerformed

    private void consultar_ordebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar_ordebActionPerformed
        go_to(new ConsultarOrdenDeCompra());
    }//GEN-LAST:event_consultar_ordebActionPerformed

    private void consultar_matActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar_matActionPerformed
        try {
            go_to(new Consultar_MateriaPrima(""));
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_consultar_matActionPerformed

    private void cargar_materiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargar_materiaActionPerformed
        try {
            go_to(new CargarMateriaPrima());
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cargar_materiaActionPerformed

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
    private javax.swing.JLabel Titulo2;
    private javax.swing.JButton cargar_materia;
    private javax.swing.JButton consultar_mat;
    private javax.swing.JButton consultar_ordeb;
    private javax.swing.JPanel contenedor;
    private javax.swing.JPanel franja_roja;
    private javax.swing.JButton generar_orde;
    private javax.swing.JPanel inicio;
    private javax.swing.JLabel mesas;
    // End of variables declaration//GEN-END:variables
}
