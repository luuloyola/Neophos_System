package paneles;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import logico.Manager_MateriaPrima;

public class VentanaCargarMateriaPrima extends javax.swing.JFrame {
    
    Manager_MateriaPrima manager_mat;

    public VentanaCargarMateriaPrima() throws SQLException {
        initComponents();
        manager_mat = new Manager_MateriaPrima();
        JTipo.addItem("PRODUCTO_QUIMICO");
        JTipo.addItem("INSUMO");
    }
    
    //Metodos del Formulario
    
    //Metodo para limpiar campos
    public void clean(){
        fieldNombre.setText("");
        fieldDescripcion.setText("");
        fieldPrecio.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fieldDescripcion = new javax.swing.JTextField();
        fieldNombre = new javax.swing.JTextField();
        fieldPrecio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botonCargar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        JTipo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        fieldCantidad = new javax.swing.JTextField();
        error_nom = new javax.swing.JLabel();
        error_precio = new javax.swing.JLabel();
        error_cant = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        fieldDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldDescripcionActionPerformed(evt);
            }
        });

        fieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNombreActionPerformed(evt);
            }
        });

        fieldPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPrecioActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nombre");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Descripcion");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Tipo");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Precio por Unidad");

        botonCargar.setText("Cargar");
        botonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("REGISTRAR MATERIA PRIMA");

        JTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTipoActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Cantidad");

        fieldCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCantidadActionPerformed(evt);
            }
        });

        error_nom.setBackground(new java.awt.Color(0, 0, 0));
        error_nom.setForeground(new java.awt.Color(51, 51, 51));
        error_nom.setText("(*)");

        error_precio.setBackground(new java.awt.Color(0, 0, 0));
        error_precio.setForeground(new java.awt.Color(51, 51, 51));
        error_precio.setText("(*)");

        error_cant.setBackground(new java.awt.Color(0, 0, 0));
        error_cant.setForeground(new java.awt.Color(51, 51, 51));
        error_cant.setText("(*)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(botonCargar, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldNombre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldDescripcion, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldCantidad)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(error_precio)
                    .addComponent(error_cant)
                    .addComponent(error_nom))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(error_nom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(error_precio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(error_cant))
                .addGap(43, 43, 43)
                .addComponent(botonCargar)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDescripcionActionPerformed
        
    }//GEN-LAST:event_fieldDescripcionActionPerformed

    private void fieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNombreActionPerformed
        
    }//GEN-LAST:event_fieldNombreActionPerformed

    private void fieldPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPrecioActionPerformed
        
    }//GEN-LAST:event_fieldPrecioActionPerformed

    private void botonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarActionPerformed
        int control =0;
        //Caso de campos que no cumplen el formato
        
        if(fieldNombre.getText().isEmpty()){
            error_nom.setText("Campo obligatorio (*)");
            error_nom.setForeground(Color.red);
            control++;
        } else {error_nom.setText("(*)");
            error_nom.setForeground(Color.black);}
        if(fieldPrecio.getText().isEmpty()){
            error_precio.setText("Campo obligatorio (*)");
            error_precio.setForeground(Color.red);
            control++;
        }else {error_nom.setText("(*)");
            error_nom.setForeground(Color.black);}
        if(fieldCantidad.getText().isEmpty()){
            error_cant.setText("Campo obligatorio (*)");
            error_cant.setForeground(Color.red);
            control++;
        }else {error_nom.setText("(*)");
            error_nom.setForeground(Color.black);}
        
        if(control ==0){
            
        //Caso donde todos los campos cumplen el formato
            String nombre,des,tipo;
            int cant,precio;
            nombre = fieldNombre.getText();
            des = fieldDescripcion.getText();
            tipo = (String) JTipo.getSelectedItem();
            precio = Integer.parseInt(fieldPrecio.getText());
            System.out.println("Tipo: "+tipo+"\n");
            cant = Integer.parseInt(fieldCantidad.getText());
            try {
                manager_mat.cargarMateriaPrima(nombre, des, tipo ,precio, cant);
                JOptionPane.showMessageDialog(null, "Se cargo correctamente!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Hubo un problema al cargar :(");
            }
        }
       
    }//GEN-LAST:event_botonCargarActionPerformed

    private void JTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTipoActionPerformed

    private void fieldCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCantidadActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCargarMateriaPrima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCargarMateriaPrima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCargarMateriaPrima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCargarMateriaPrima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VentanaCargarMateriaPrima().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VentanaCargarMateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JTipo;
    private javax.swing.JButton botonCargar;
    private javax.swing.JLabel error_cant;
    private javax.swing.JLabel error_nom;
    private javax.swing.JLabel error_precio;
    private javax.swing.JTextField fieldCantidad;
    private javax.swing.JTextField fieldDescripcion;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField fieldPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
