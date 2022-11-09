/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paneles;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import logico.Manager_OrdenCompra;
import logico.Orden_Compra;
import logico.Renglon_Compra;

/**
 *
 * @author Usuario
 */
public class ConsultarOrdenDeCompra extends javax.swing.JPanel {
  
    private DefaultTableModel modelo;
    private DefaultTableModel modelo2;
    private List<Orden_Compra> ordenes = new ArrayList<>();
    private Orden_Compra orden = new Orden_Compra();
    
    public ConsultarOrdenDeCompra() throws Exception{
        initComponents();
        
        modelo = (DefaultTableModel) tablaInicio.getModel();
        modelo2 = (DefaultTableModel) tablaRenglones.getModel();
        
        ordenes = Manager_OrdenCompra.getInstance().consultarTodasLasOrdenes();

        if(ordenes.isEmpty()){
            JOptionPane.showMessageDialog(this,"No hay ordenes de compra en la base de datos.","", JOptionPane.WARNING_MESSAGE);
        }else{
            for(int i = 0; i<ordenes.size(); i++){
                orden = ordenes.get(i);
                modelo.addRow(new Object[] {orden.getFechaPedido(), orden.getPrecioTotal(), orden.getProveedor()});
            }
        }
        
    }
    
    public void go_to(JPanel panel) {
        inicio.setLayout(new java.awt.BorderLayout());
        inicio.removeAll();
        inicio.add(panel,BorderLayout.CENTER);
        inicio.repaint();
        inicio.revalidate();
    }

    public void reiniciar(){
        FechaPLabel3.setText("");
        PrecioLabel3.setText("");
        IDProveedorLabel3.setText("");
        modelo2.setRowCount(0);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        inicio = new javax.swing.JPanel();
        Titulo1 = new javax.swing.JLabel();
        Separador7 = new javax.swing.JLabel();
        aceptarButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaInicio = new javax.swing.JTable();
        mesas1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mesas = new javax.swing.JLabel();
        nombreText = new javax.swing.JTextField();
        filtrarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        muestra = new javax.swing.JPanel();
        Titulo2 = new javax.swing.JLabel();
        Separador8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaRenglones = new javax.swing.JTable();
        volverButton2 = new javax.swing.JButton();
        infoOrdenLabel1 = new javax.swing.JLabel();
        FechaPLabel1 = new javax.swing.JLabel();
        PrecioLabel1 = new javax.swing.JLabel();
        IDProveedorLabel1 = new javax.swing.JLabel();
        infoRenglonesLabel1 = new javax.swing.JLabel();
        FechaPLabel3 = new javax.swing.JLabel();
        PrecioLabel3 = new javax.swing.JLabel();
        IDProveedorLabel3 = new javax.swing.JLabel();
        mesas2 = new javax.swing.JLabel();

        contenedor.setBackground(new java.awt.Color(204, 204, 204));
        contenedor.setMaximumSize(new java.awt.Dimension(1042, 619));
        contenedor.setLayout(new java.awt.CardLayout());

        inicio.setBackground(new java.awt.Color(227, 227, 218));
        inicio.setMaximumSize(new java.awt.Dimension(1042, 619));
        inicio.setPreferredSize(new java.awt.Dimension(1065, 619));

        Titulo1.setFont(new java.awt.Font("Microsoft YaHei", 1, 21)); // NOI18N
        Titulo1.setForeground(new java.awt.Color(97, 34, 34));
        Titulo1.setText("CONSULTAR ORDEN DE COMPRA");

        Separador7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Separador7.setForeground(new java.awt.Color(97, 34, 34));
        Separador7.setText("__________________________________________________________________________________________________________________________________________________________________________________________________");

        aceptarButton1.setBackground(new java.awt.Color(117, 49, 49));
        aceptarButton1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        aceptarButton1.setForeground(new java.awt.Color(255, 255, 255));
        aceptarButton1.setText("ACEPTAR");
        aceptarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButton1ActionPerformed(evt);
            }
        });

        tablaInicio.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        tablaInicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha Pedido", "Precio Total", "Nombre Proveedor"
            }
        ));
        tablaInicio.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaInicio);

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 2, 12)); // NOI18N
        jLabel3.setText("Seleccione la orden de compra que desea consultar");

        mesas.setText("              ");

        nombreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextActionPerformed(evt);
            }
        });

        filtrarButton.setBackground(new java.awt.Color(117, 49, 49));
        filtrarButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        filtrarButton.setForeground(new java.awt.Color(255, 255, 255));
        filtrarButton.setText("FILTRAR");
        filtrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrarButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(97, 34, 34));
        jLabel1.setText("Nombre Proveedor:");

        javax.swing.GroupLayout inicioLayout = new javax.swing.GroupLayout(inicio);
        inicio.setLayout(inicioLayout);
        inicioLayout.setHorizontalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(0, 65, Short.MAX_VALUE)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(aceptarButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 965, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicioLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(filtrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(mesas1))
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(inicioLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(Titulo1)
                                .addGap(188, 188, 188)
                                .addComponent(mesas))
                            .addComponent(Separador7))
                        .addGap(0, 78, Short.MAX_VALUE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        inicioLayout.setVerticalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo1)
                    .addComponent(mesas))
                .addGap(1, 1, 1)
                .addComponent(Separador7)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(mesas1)
                        .addGap(323, 323, 323))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicioLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(filtrarButton)
                                .addGroup(inicioLayout.createSequentialGroup()
                                    .addGap(5, 5, 5)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)))
                            .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(aceptarButton1)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        mesas.setFont(new java.awt.Font("DialogInput", 1, 28));

        contenedor.add(inicio, "card2");

        muestra.setBackground(new java.awt.Color(227, 227, 218));
        muestra.setMaximumSize(new java.awt.Dimension(1042, 619));
        muestra.setPreferredSize(new java.awt.Dimension(1065, 619));

        Titulo2.setFont(new java.awt.Font("Microsoft YaHei", 1, 21)); // NOI18N
        Titulo2.setForeground(new java.awt.Color(97, 34, 34));
        Titulo2.setText("CONSULTAR ORDEN DE COMPRA");

        Separador8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Separador8.setForeground(new java.awt.Color(97, 34, 34));
        Separador8.setText("__________________________________________________________________________________________________________________________________________________________________________________________________");

        tablaRenglones.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        tablaRenglones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad", "Precio ", "Producto que tiene"
            }
        ));
        tablaRenglones.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tablaRenglones);

        volverButton2.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        volverButton2.setText("VOLVER");
        volverButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverButton2ActionPerformed(evt);
            }
        });

        infoOrdenLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        infoOrdenLabel1.setForeground(new java.awt.Color(97, 34, 34));
        infoOrdenLabel1.setText("Información de la Orden de Compra consultada:");

        FechaPLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        FechaPLabel1.setForeground(new java.awt.Color(97, 34, 34));
        FechaPLabel1.setText("Fecha Pedido:");

        PrecioLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        PrecioLabel1.setForeground(new java.awt.Color(97, 34, 34));
        PrecioLabel1.setText("Precio Total:");

        IDProveedorLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        IDProveedorLabel1.setForeground(new java.awt.Color(97, 34, 34));
        IDProveedorLabel1.setText("Nombre Proveedor:");

        infoRenglonesLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        infoRenglonesLabel1.setForeground(new java.awt.Color(97, 34, 34));
        infoRenglonesLabel1.setText("Información de su/s renglon/es:");

        javax.swing.GroupLayout muestraLayout = new javax.swing.GroupLayout(muestra);
        muestra.setLayout(muestraLayout);
        muestraLayout.setHorizontalGroup(
            muestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(muestraLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(muestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(muestraLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(muestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(muestraLayout.createSequentialGroup()
                                .addGroup(muestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(muestraLayout.createSequentialGroup()
                                        .addGap(475, 475, 475)
                                        .addComponent(mesas2))
                                    .addComponent(infoOrdenLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(muestraLayout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(muestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(IDProveedorLabel1)
                                            .addComponent(volverButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(273, 273, 273)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, muestraLayout.createSequentialGroup()
                                .addGroup(muestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(muestraLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(muestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(PrecioLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(IDProveedorLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(FechaPLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(44, 44, 44))
                                    .addGroup(muestraLayout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(muestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(FechaPLabel1)
                                            .addComponent(PrecioLabel1))
                                        .addGap(315, 315, 315)))
                                .addComponent(infoRenglonesLabel1)
                                .addGap(293, 293, 293))))
                    .addGroup(muestraLayout.createSequentialGroup()
                        .addGroup(muestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(muestraLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(Titulo2))
                            .addComponent(Separador8))
                        .addGap(58, 58, 58))))
        );
        muestraLayout.setVerticalGroup(
            muestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(muestraLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Titulo2)
                .addGap(1, 1, 1)
                .addComponent(Separador8)
                .addGap(29, 29, 29)
                .addComponent(infoOrdenLabel1)
                .addGap(16, 16, 16)
                .addGroup(muestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FechaPLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(muestraLayout.createSequentialGroup()
                        .addComponent(mesas2)
                        .addGroup(muestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(muestraLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(FechaPLabel1))
                            .addGroup(muestraLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(infoRenglonesLabel1)))))
                .addGroup(muestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(muestraLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(muestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PrecioLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PrecioLabel1))
                        .addGap(57, 57, 57)
                        .addGroup(muestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(IDProveedorLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IDProveedorLabel1)))
                    .addGroup(muestraLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addComponent(volverButton2)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        mesas.setFont(new java.awt.Font("DialogInput", 1, 28));

        contenedor.add(muestra, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1115, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 1115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 631, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(contenedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButton1ActionPerformed

        Map<Orden_Compra, List<Renglon_Compra>> ordenCompleta = new HashMap<>();
        Orden_Compra infoOrden = new Orden_Compra();
        List<Renglon_Compra> infoRenglones = new ArrayList<Renglon_Compra>();

        if (tablaInicio.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(this,"Debe seleccionar un renglon","", JOptionPane.WARNING_MESSAGE);
            return;
        }else{
            orden = ordenes.get(tablaInicio.getSelectedRow());
            int id = orden.getId();

            try {
                ordenCompleta = Manager_OrdenCompra.getInstance().consultarOrdenDeCompra(id);

                Set<Orden_Compra> keys = ordenCompleta.keySet();
                for(Orden_Compra key : keys){
                    infoOrden = key;
                }

                infoRenglones = ordenCompleta.get(infoOrden);

                inicio.setVisible(false);
                muestra.setVisible(true);

                FechaPLabel3.setText(infoOrden.getFechaPedido().toString());
                PrecioLabel3.setText(String.valueOf(infoOrden.getPrecioTotal()));
                IDProveedorLabel3.setText(infoOrden.getProveedor());

                for(Renglon_Compra info: infoRenglones){
                    modelo2.addRow(new Object[] {info.getCantidad(), info.getPrecio(), info.getNombre_Tiene()});
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Sucedió un error inesperado.\n");
            }
        }
    }//GEN-LAST:event_aceptarButton1ActionPerformed

    private void volverButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverButton2ActionPerformed
        muestra.setVisible(false);
        reiniciar();
    }//GEN-LAST:event_volverButton2ActionPerformed

    private void nombreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTextActionPerformed

    private void filtrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrarButtonActionPerformed
        String nombre = nombreText.getText();
        List<Orden_Compra> ordenes = new ArrayList<>();
        
        if(nombre.equals("")){
            JOptionPane.showMessageDialog(null, "Si desea filtrar la búsqueda debe ingresar el nombre de un Proveedor..\n");
        }else{
            try {
                modelo.setRowCount(0);
                ordenes = Manager_OrdenCompra.getInstance().consultarOrdenPorProveedor(nombre);
                for(int i = 0; i<ordenes.size(); i++){
                            orden = ordenes.get(i);
                            modelo.addRow(new Object[] {orden.getFechaPedido(), orden.getPrecioTotal(), orden.getProveedor()});
                }

                if(ordenes.isEmpty()){
                    JOptionPane.showMessageDialog(this,"No hay ordenes de compra con ese proveedor asociado.","", JOptionPane.WARNING_MESSAGE);
                    nombreText.setText("");
                    ordenes = Manager_OrdenCompra.getInstance().consultarTodasLasOrdenes();
                    for(int i = 0; i<ordenes.size(); i++){
                            orden = ordenes.get(i);
                            modelo.addRow(new Object[] {orden.getFechaPedido(), orden.getPrecioTotal(), orden.getProveedor()});
                        }
                }
            } catch (Exception ex) {
                Logger.getLogger(ConsultarOrdenDeCompra.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_filtrarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FechaPLabel1;
    private javax.swing.JLabel FechaPLabel3;
    private javax.swing.JLabel IDProveedorLabel1;
    private javax.swing.JLabel IDProveedorLabel3;
    private javax.swing.JLabel PrecioLabel1;
    private javax.swing.JLabel PrecioLabel3;
    private javax.swing.JLabel Separador7;
    private javax.swing.JLabel Separador8;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JButton aceptarButton1;
    private javax.swing.JPanel contenedor;
    private javax.swing.JButton filtrarButton;
    private javax.swing.JLabel infoOrdenLabel1;
    private javax.swing.JLabel infoRenglonesLabel1;
    private javax.swing.JPanel inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel mesas;
    private javax.swing.JLabel mesas1;
    private javax.swing.JLabel mesas2;
    private javax.swing.JPanel muestra;
    private javax.swing.JTextField nombreText;
    private javax.swing.JTable tablaInicio;
    private javax.swing.JTable tablaRenglones;
    private javax.swing.JButton volverButton2;
    // End of variables declaration//GEN-END:variables
}
