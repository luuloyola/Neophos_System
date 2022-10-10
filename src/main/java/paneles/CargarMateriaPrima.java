package paneles;

import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import logico.Manager_MateriaPrima;
import logico.Manager_Proveedor;
import logico.Proveedor;

public class CargarMateriaPrima extends javax.swing.JPanel {

    Manager_MateriaPrima manager_mat;
    Manager_Proveedor manager_proveedor;
    
    public CargarMateriaPrima(String proveedor) throws SQLException, Exception {
        initComponents();
        manager_mat = new Manager_MateriaPrima();
        manager_proveedor = new Manager_Proveedor();
        
        JTipo.addItem("PRODUCTO_QUIMICO");
        JTipo.addItem("INSUMO");

        if (!"".equals(proveedor)){
            proveedor_lista.addItem(proveedor);
            proveedor_lista.setSelectedIndex(1);
        }
        else{
            ArrayList<Integer> ids = manager_proveedor.getAll_ID();
            ArrayList<Proveedor> proveedores = manager_proveedor.getAllProveedores();
            String auxiliar;

            for (int i = 0; i<proveedores.size(); i++){
                auxiliar = ids.get(i) + " - " + proveedores.get(i).getNombre();
                proveedor_lista.addItem(auxiliar);
            }
        }
        
        
    }

    //Metodos del Formulario
    
    //Metodo para limpiar campos
    public void clean(){
        fieldNombre.setText("");
        fieldDescripcion.setText("");
        fieldPrecio.setText("");
        fieldCantidad.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content_materia = new javax.swing.JPanel();
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
        proveedor_lista = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        error_proveedor = new javax.swing.JLabel();

        content_materia.setBackground(new java.awt.Color(227, 227, 218));
        content_materia.setMinimumSize(new java.awt.Dimension(522, 462));

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
        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(97, 34, 34));
        jLabel1.setText("Nombre");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(97, 34, 34));
        jLabel2.setText("Descripcion");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(97, 34, 34));
        jLabel3.setText("Tipo");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(97, 34, 34));
        jLabel4.setText("Precio por Unidad");

        botonCargar.setBackground(new java.awt.Color(97, 34, 34));
        botonCargar.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        botonCargar.setForeground(new java.awt.Color(227, 227, 218));
        botonCargar.setText("CARGAR");
        botonCargar.setBorder(null);
        botonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 21)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(97, 34, 34));
        jLabel5.setText("REGISTRAR MATERIA PRIMA");

        JTipo.setBackground(new java.awt.Color(97, 34, 34));
        JTipo.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        JTipo.setForeground(new java.awt.Color(97, 34, 34));
        JTipo.setBorder(null);
        JTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTipoActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(97, 34, 34));
        jLabel6.setText("Cantidad");

        fieldCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCantidadActionPerformed(evt);
            }
        });

        error_nom.setBackground(new java.awt.Color(0, 0, 0));
        error_nom.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        error_nom.setForeground(new java.awt.Color(51, 51, 51));
        error_nom.setText("(*)");

        error_precio.setBackground(new java.awt.Color(0, 0, 0));
        error_precio.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        error_precio.setForeground(new java.awt.Color(51, 51, 51));
        error_precio.setText("(*)");

        error_cant.setBackground(new java.awt.Color(0, 0, 0));
        error_cant.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        error_cant.setForeground(new java.awt.Color(51, 51, 51));
        error_cant.setText("(*)");

        proveedor_lista.setBackground(new java.awt.Color(97, 34, 34));
        proveedor_lista.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        proveedor_lista.setForeground(new java.awt.Color(97, 34, 34));
        proveedor_lista.setBorder(null);
        proveedor_lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedor_listaActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(97, 34, 34));
        jLabel7.setText("Proveedor");

        error_proveedor.setBackground(new java.awt.Color(0, 0, 0));
        error_proveedor.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        error_proveedor.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout content_materiaLayout = new javax.swing.GroupLayout(content_materia);
        content_materia.setLayout(content_materiaLayout);
        content_materiaLayout.setHorizontalGroup(
            content_materiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_materiaLayout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addGroup(content_materiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(content_materiaLayout.createSequentialGroup()
                        .addGroup(content_materiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldDescripcion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fieldPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldCantidad)
                            .addGroup(content_materiaLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(3, 3, 3))
                            .addComponent(fieldNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonCargar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(proveedor_lista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(content_materiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(error_precio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(error_cant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(error_nom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(error_proveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        content_materiaLayout.setVerticalGroup(
            content_materiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_materiaLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(content_materiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addGroup(content_materiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(error_precio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(content_materiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(error_cant))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(content_materiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(error_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proveedor_lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(botonCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content_materia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content_materia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
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
        }else if (!esDecimal(fieldPrecio.getText())){
            error_precio.setText("Formato invalido (*)");
            error_precio.setForeground(Color.red);
            control++;}
        else {error_precio.setText("(*)");
            error_precio.setForeground(Color.black);
        }

        if(fieldCantidad.getText().isEmpty()) {
            error_cant.setText("Campo obligatorio (*)");
            error_cant.setForeground(Color.red);
            control++;
        }else if (!esDecimal(fieldCantidad.getText())){
            error_cant.setText("Formato invalido (*)");
            error_cant.setForeground(Color.red);
            control++;}
        else {error_cant.setText("(*)");
        error_cant.setForeground(Color.black);}
        if (proveedor_lista.getSelectedIndex() != 0){
            error_proveedor.setText("Debe elegir a un proveedor!");
            error_proveedor.setForeground(Color.red);
        }else{error_proveedor.setText("");}

        if(control == 0){

            //Caso donde todos los campos cumplen el formato
            String nombre,des,tipo;
            double cant,precio;
            int proveedor;
            nombre = fieldNombre.getText();
            if(fieldDescripcion.getText().isEmpty()) des ="-"; else des = fieldDescripcion.getText();
            proveedor = Integer.parseInt(proveedor_lista.getSelectedItem().toString().split(" - ")[0]);
            
            tipo = (String) JTipo.getSelectedItem();
            precio = Double.parseDouble(fieldPrecio.getText());
            cant = Double.parseDouble(fieldCantidad.getText());
            
            try {
                manager_mat.cargarMateriaPrima(nombre, des, tipo ,precio, cant, proveedor);
                JOptionPane.showMessageDialog(null, "Se cargo correctamente!");
                clean();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Hubo un problema al cargar :(");
                System.out.println(ex.getMessage());
            }
        }

    }//GEN-LAST:event_botonCargarActionPerformed

    public static boolean esDecimal(String cadena){ // Valida si el campo es un decimal
        String patron ="^[0-9]+([.][0-9]+)?$";
        Pattern pat = Pattern.compile(patron);
        Matcher mat = pat.matcher(cadena);
        return mat.matches();
    }
    private void JTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTipoActionPerformed

    private void fieldCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCantidadActionPerformed

    private void proveedor_listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedor_listaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proveedor_listaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JTipo;
    private javax.swing.JButton botonCargar;
    private javax.swing.JPanel content_materia;
    private javax.swing.JLabel error_cant;
    private javax.swing.JLabel error_nom;
    private javax.swing.JLabel error_precio;
    private javax.swing.JLabel error_proveedor;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> proveedor_lista;
    // End of variables declaration//GEN-END:variables
}
