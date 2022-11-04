
package paneles;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import logico.Manager_ProductoFinal;
import logico.ProductoFinal;
import logico.Renglon_Compra;

public class Consultar_ProductoFinal extends javax.swing.JPanel {
    
    private Manager_ProductoFinal manager_pFinal;
    private DefaultTableModel modelo;
    private DefaultTableModel modelo1;
    private ProductoFinal productoFinal = new ProductoFinal();
    private ArrayList<ProductoFinal> arreglo;
    
    public Consultar_ProductoFinal() throws Exception{
        initComponents();
        muestra.setVisible(false);
        manager_pFinal = Manager_ProductoFinal.getInstance();
        modelo = (DefaultTableModel) productos.getModel();
        modelo1 = (DefaultTableModel) materias1.getModel();
        
        
        arreglo = manager_pFinal.buscar_todos();
        
        for (int i = 0; i<arreglo.size(); i++){
                    productoFinal = arreglo.get(i);
                    System.out.println(productoFinal.getNombre_Producto());
                    modelo.addRow(new Object[] {productoFinal.getNombre_Producto(), productoFinal.getEmpaquetado().toString(), productoFinal.getPrecio()});
                    System.out.println("Lo deberia haber hecho");
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
        seleccionar = new javax.swing.JLabel();
        muestra = new javax.swing.JPanel();
        Titulo1 = new javax.swing.JLabel();
        Separador7 = new javax.swing.JLabel();
        infoOrdenLabel1 = new javax.swing.JLabel();
        volverButton3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        materias1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        descripcion1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tipo1 = new javax.swing.JTextField();
        precio1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

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

        seleccionar.setForeground(new java.awt.Color(0, 0, 0));
        seleccionar.setText("Seleccione el producto que desea consultar");

        javax.swing.GroupLayout inicioLayout = new javax.swing.GroupLayout(inicio);
        inicio.setLayout(inicioLayout);
        inicioLayout.setHorizontalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Separador6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(jLabel1)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        inicioLayout.setVerticalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(616, 616, 616))
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
                        .addGap(202, 202, 202)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 28));

        contenedor.add(inicio, "card2");

        muestra.setBackground(new java.awt.Color(227, 227, 218));
        muestra.setMaximumSize(new java.awt.Dimension(1042, 619));
        muestra.setPreferredSize(new java.awt.Dimension(1042, 619));

        Titulo1.setFont(new java.awt.Font("Microsoft YaHei", 1, 21)); // NOI18N
        Titulo1.setForeground(new java.awt.Color(97, 34, 34));
        Titulo1.setText("CONSULTAR PRODUCTO FINAL");

        Separador7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Separador7.setForeground(new java.awt.Color(97, 34, 34));
        Separador7.setText("__________________________________________________________________________________________________________________________________________________________________________________________________");

        infoOrdenLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        infoOrdenLabel1.setForeground(new java.awt.Color(97, 34, 34));
        infoOrdenLabel1.setText("Informacion del Producto Final consultado:");

        volverButton3.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        volverButton3.setText("Cancelar");
        volverButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverButton3ActionPerformed(evt);
            }
        });

        materias1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        materias1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre de la Materia Prima"
            }
        ));
        materias1.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(materias1);

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombre:");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Descripcion:");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Tipo de Empaquetado");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Precio:");

        javax.swing.GroupLayout muestraLayout = new javax.swing.GroupLayout(muestra);
        muestra.setLayout(muestraLayout);
        muestraLayout.setHorizontalGroup(
            muestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(muestraLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(muestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Separador7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 977, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, muestraLayout.createSequentialGroup()
                        .addComponent(Titulo1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(muestraLayout.createSequentialGroup()
                        .addGroup(muestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infoOrdenLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(muestraLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(muestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(muestraLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, muestraLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(descripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(muestraLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(precio1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(muestraLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(tipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(muestraLayout.createSequentialGroup()
                .addGap(418, 418, 418)
                .addComponent(volverButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        muestraLayout.setVerticalGroup(
            muestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(muestraLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Titulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Separador7)
                .addGroup(muestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(muestraLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(muestraLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(infoOrdenLabel1)
                        .addGap(29, 29, 29)
                        .addGroup(muestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(muestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(descripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(muestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(muestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(precio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addGap(26, 26, 26)
                .addComponent(volverButton3)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 28));

        contenedor.add(muestra, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 1013, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
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
        
        nombre1.setText(productoFinal.getNombre_Producto());
        descripcion1.setText(productoFinal.getDescripcion());
        tipo1.setText(productoFinal.getEmpaquetado().toString());
        precio1.setText(Double.toString(productoFinal.getPrecio()));
        
        ArrayList<String> materias = new ArrayList();
        try {
            materias = manager_pFinal.compuesto_por(productoFinal.getNombre_Producto());
            System.out.println(materias.get(0));
        } catch (Exception ex) {
            Logger.getLogger(Consultar_ProductoFinal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0; i<materias.size(); i++){
                    modelo1.addRow(new Object[] {materias.get(i)});
        }
        borrar_panel(muestra);
    }//GEN-LAST:event_confirmarActionPerformed

    public void borrar_panel(JPanel panel){
        contenedor.removeAll();
        contenedor.add(panel,BorderLayout.CENTER);
        contenedor.repaint();
        contenedor.revalidate();
    }
    
    private void volverButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverButton3ActionPerformed
        try {
            Principal.getNeophos().go_to(new Consultar_ProductoFinal());
        } catch (Exception ex) {
            Logger.getLogger(Consultar_ProductoFinal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_volverButton3ActionPerformed

    public void no_hay_valores(){
        JOptionPane.showMessageDialog(this,"No hay resultados disponibles para la busqueda realizada","", JOptionPane.WARNING_MESSAGE);
        //nombre_materiaprima.setText("");
        //if (proveedor_lista.isEnabled()) proveedor_lista.setSelectedIndex(0);
    }
    
    public Renglon_Compra getRenglon(){
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Separador6;
    private javax.swing.JLabel Separador7;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JButton confirmar;
    private javax.swing.JPanel contenedor;
    private javax.swing.JTextField descripcion1;
    private javax.swing.JLabel infoOrdenLabel1;
    private javax.swing.JPanel inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable materias1;
    private javax.swing.JPanel muestra;
    private javax.swing.JTextField nombre1;
    private javax.swing.JTextField precio1;
    private javax.swing.JTable productos;
    private javax.swing.JLabel seleccionar;
    private javax.swing.JTextField tipo1;
    private javax.swing.JButton volverButton3;
    // End of variables declaration//GEN-END:variables

}
