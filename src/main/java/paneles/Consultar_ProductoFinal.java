
package paneles;

import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logico.Manager_ProductoFinal;
import logico.ProductoFinal;
import logico.Renglon;

public class Consultar_ProductoFinal extends javax.swing.JPanel {
    
    private Manager_ProductoFinal manager_pFinal;
    private DefaultTableModel modelo;
    private ProductoFinal productoFinal = new ProductoFinal();
    private ArrayList<ProductoFinal> arreglo;
    
    public Consultar_ProductoFinal() throws Exception {
        initComponents();
        manager_pFinal = Manager_ProductoFinal.getInstance();
        modelo = (DefaultTableModel) productos.getModel();
        
        
        arreglo = manager_pFinal.buscar_todos();
        
        for (int i = 0; i<arreglo.size(); i++){
                    productoFinal = arreglo.get(i);
                    modelo.addRow(new Object[] {productoFinal.getNombre_Producto(), productoFinal.getEmpaquetado().toString(), productoFinal.getPrecio()});
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        inicio = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Separador6 = new javax.swing.JLabel();
        confirmar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productos = new javax.swing.JTable();
        infoOrdenLabel = new javax.swing.JLabel();
        volverButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        materias = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tipo = new javax.swing.JTextField();
        precio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        seleccionar = new javax.swing.JLabel();

        contenedor.setBackground(new java.awt.Color(204, 204, 204));
        contenedor.setMaximumSize(new java.awt.Dimension(1042, 619));
        contenedor.setLayout(new java.awt.CardLayout());

        inicio.setBackground(new java.awt.Color(227, 227, 218));
        inicio.setMaximumSize(new java.awt.Dimension(1042, 619));
        inicio.setPreferredSize(new java.awt.Dimension(1042, 619));

        Titulo.setFont(new java.awt.Font("Microsoft YaHei", 1, 21)); // NOI18N
        Titulo.setForeground(new java.awt.Color(97, 34, 34));
        Titulo.setText("CONSULTAR PRODUCTO FINAL");

        Separador6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Separador6.setForeground(new java.awt.Color(97, 34, 34));
        Separador6.setText("__________________________________________________________________________________________________________________________________________________________________________________________________");

        confirmar.setText("Confirmar");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre del Producto", "Tipo de Empaquetado", "Precio de Unidad"
            }
        ));
        jScrollPane1.setViewportView(productos);

        infoOrdenLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        infoOrdenLabel.setForeground(new java.awt.Color(97, 34, 34));
        infoOrdenLabel.setText("Informacion del Producto Final consultado:");

        volverButton2.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        volverButton2.setText("Cancelar");
        volverButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverButton2ActionPerformed(evt);
            }
        });

        materias.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        materias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre de la Materia Prima"
            }
        ));
        materias.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(materias);

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Descripcion:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tipo de Empaquetado");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Precio:");

        seleccionar.setForeground(new java.awt.Color(0, 0, 0));
        seleccionar.setText("Seleccione el producto que desea consultar");

        javax.swing.GroupLayout inicioLayout = new javax.swing.GroupLayout(inicio);
        inicio.setLayout(inicioLayout);
        inicioLayout.setHorizontalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(414, 414, 414)
                        .addComponent(volverButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infoOrdenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(inicioLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, inicioLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(inicioLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(inicioLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(inicioLayout.createSequentialGroup()
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Separador6, javax.swing.GroupLayout.DEFAULT_SIZE, 979, Short.MAX_VALUE)
                            .addComponent(Titulo)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicioLayout.createSequentialGroup()
                                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1)
                                    .addGroup(inicioLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(seleccionar)
                                            .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        inicioLayout.setVerticalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(448, 448, 448))
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addComponent(Titulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Separador6)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seleccionar)
                        .addGap(12, 12, 12)
                        .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addComponent(infoOrdenLabel)
                .addGap(29, 29, 29)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                .addComponent(volverButton2)
                .addGap(35, 35, 35))
        );

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 28));

        contenedor.add(inicio, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 1065, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 1103, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed

        if (productos.getSelectedRow()==-1)
        {
            JOptionPane.showMessageDialog(this,"Debe seleccionar un renglon","", JOptionPane.WARNING_MESSAGE);
            seleccionar.setForeground(Color.RED);
            return;
        }

        productoFinal = arreglo.get(productos.getSelectedRow());
        
        
        productos.setVisible(false);
        seleccionar.setVisible(false);
        confirmar.setVisible(false);
        
        nombre.setText(productoFinal.getNombre_Producto());
        descripcion.setText(productoFinal.getDescripcion());
        tipo.setText(productoFinal.getEmpaquetado().toString());
        precio.setText(Double.toString(productoFinal.getPrecio()));
        
        ArrayList<String> materias = new ArrayList();
        try {
            materias = manager_pFinal.compuesto_por(productoFinal.getNombre_Producto());
        } catch (Exception ex) {
            Logger.getLogger(Consultar_ProductoFinal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0; i<materias.size(); i++){
                    modelo.addRow(new Object[] {materias.get(i)});
        }
    }//GEN-LAST:event_confirmarActionPerformed

    private void volverButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverButton2ActionPerformed
        int eleccion= JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la operación?", "Confirmar", JOptionPane.CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(eleccion==0){
            System.exit(0);
        }
    }//GEN-LAST:event_volverButton2ActionPerformed

    public void no_hay_valores(){
        JOptionPane.showMessageDialog(this,"No hay resultados disponibles para la busqueda realizada","", JOptionPane.WARNING_MESSAGE);
        //nombre_materiaprima.setText("");
        //if (proveedor_lista.isEnabled()) proveedor_lista.setSelectedIndex(0);
    }
    
    public Renglon getRenglon(){
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Separador6;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton confirmar;
    private javax.swing.JPanel contenedor;
    private javax.swing.JTextField descripcion;
    private javax.swing.JLabel infoOrdenLabel;
    private javax.swing.JPanel inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable materias;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField precio;
    private javax.swing.JTable productos;
    private javax.swing.JLabel seleccionar;
    private javax.swing.JTextField tipo;
    private javax.swing.JButton volverButton2;
    // End of variables declaration//GEN-END:variables

}
