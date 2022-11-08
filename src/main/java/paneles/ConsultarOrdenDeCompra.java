/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paneles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logico.Manager_OrdenCompra;
import logico.Orden_Compra;
import logico.Renglon_Compra;

/**
 *
 * @author Usuario
 */
public class ConsultarOrdenDeCompra extends javax.swing.JPanel {
  
    public ConsultarOrdenDeCompra() {
        initComponents();
        inicializarLabels();
    }
    
    public void inicializarLabels(){
        infoOrdenLabel.setEnabled(false);
        FechaPLabel.setEnabled(false);
        FechaPLabel2.setEnabled(false);
        IDLabel.setEnabled(false);
        IDLabel2.setEnabled(false);
        IDProveedorLabel.setEnabled(false);
        IDProveedorLabel2.setEnabled(false);
        PrecioLabel.setEnabled(false);
        PrecioLabel2.setEnabled(false);
        infoRenglonesLabel.setEnabled(false);
        tablaRenglones.setVisible(false);
    }
    
    public void comienzaConsultar(){
        infoOrdenLabel.setEnabled(true);
        FechaPLabel.setEnabled(true);
        FechaPLabel2.setEnabled(true);
        IDLabel.setEnabled(true);
        IDLabel2.setEnabled(true);
        IDProveedorLabel.setEnabled(true);
        IDProveedorLabel2.setEnabled(true);
        PrecioLabel.setEnabled(true);
        PrecioLabel2.setEnabled(true);
        infoRenglonesLabel.setEnabled(true);
        tablaRenglones.setVisible(true);
    }
    
    public void limpiarVariables(){
        FechaPLabel2.setText("");
        IDLabel2.setText("");
        IDProveedorLabel2.setText("");
        PrecioLabel2.setText("");
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
        Titulo = new javax.swing.JLabel();
        Separador6 = new javax.swing.JLabel();
        ingresarID = new javax.swing.JLabel();
        aceptarButton = new javax.swing.JButton();
        textIDConsultar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRenglones = new javax.swing.JTable();
        volverButton = new javax.swing.JButton();
        infoOrdenLabel = new javax.swing.JLabel();
        IDLabel = new javax.swing.JLabel();
        FechaPLabel = new javax.swing.JLabel();
        PrecioLabel = new javax.swing.JLabel();
        IDProveedorLabel = new javax.swing.JLabel();
        infoRenglonesLabel = new javax.swing.JLabel();
        FechaPLabel2 = new javax.swing.JLabel();
        PrecioLabel2 = new javax.swing.JLabel();
        IDProveedorLabel2 = new javax.swing.JLabel();
        IDLabel2 = new javax.swing.JLabel();
        mesas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        contenedor.setBackground(new java.awt.Color(204, 204, 204));
        contenedor.setMaximumSize(new java.awt.Dimension(1042, 619));
        contenedor.setLayout(new java.awt.CardLayout());

        inicio.setBackground(new java.awt.Color(227, 227, 218));
        inicio.setMaximumSize(new java.awt.Dimension(1042, 619));
        inicio.setPreferredSize(new java.awt.Dimension(1065, 619));

        Titulo.setFont(new java.awt.Font("Microsoft YaHei", 1, 21)); // NOI18N
        Titulo.setForeground(new java.awt.Color(97, 34, 34));
        Titulo.setText("CONSULTAR ORDEN DE COMPRA");

        Separador6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Separador6.setForeground(new java.awt.Color(97, 34, 34));
        Separador6.setText("__________________________________________________________________________________________________________________________________________________________________________________________________");

        ingresarID.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        ingresarID.setText("Ingrese el ID de la Orden de Compra que desea consultar:");

        aceptarButton.setText("Aceptar");
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
            }
        });

        textIDConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIDConsultarActionPerformed(evt);
            }
        });

        tablaRenglones.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        tablaRenglones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad", "Precio ", "ID Materia"
            }
        ));
        tablaRenglones.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaRenglones);

        volverButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 11)); // NOI18N
        volverButton.setText("Cancelar");
        volverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverButtonActionPerformed(evt);
            }
        });

        infoOrdenLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        infoOrdenLabel.setForeground(new java.awt.Color(97, 34, 34));
        infoOrdenLabel.setText("Información de la Orden de Compra consultada:");

        IDLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        IDLabel.setForeground(new java.awt.Color(97, 34, 34));
        IDLabel.setText("ID:");

        FechaPLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        FechaPLabel.setForeground(new java.awt.Color(97, 34, 34));
        FechaPLabel.setText("Fecha Pedido:");

        PrecioLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        PrecioLabel.setForeground(new java.awt.Color(97, 34, 34));
        PrecioLabel.setText("Precio Total:");

        IDProveedorLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        IDProveedorLabel.setForeground(new java.awt.Color(97, 34, 34));
        IDProveedorLabel.setText("ID Proveedor:");

        infoRenglonesLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        infoRenglonesLabel.setForeground(new java.awt.Color(97, 34, 34));
        infoRenglonesLabel.setText("Información de su/s renglon/es:");

        jLabel1.setText("(*)");

        javax.swing.GroupLayout inicioLayout = new javax.swing.GroupLayout(inicio);
        inicio.setLayout(inicioLayout);
        inicioLayout.setHorizontalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(inicioLayout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(inicioLayout.createSequentialGroup()
                                        .addComponent(ingresarID)
                                        .addGap(46, 46, 46)
                                        .addComponent(textIDConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel1)
                                        .addGap(66, 66, 66)
                                        .addComponent(aceptarButton))
                                    .addGroup(inicioLayout.createSequentialGroup()
                                        .addComponent(infoOrdenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(135, 135, 135)
                                        .addComponent(mesas))
                                    .addGroup(inicioLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(inicioLayout.createSequentialGroup()
                                                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(FechaPLabel)
                                                    .addComponent(PrecioLabel)
                                                    .addComponent(IDProveedorLabel))
                                                .addGap(35, 35, 35)
                                                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(IDProveedorLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(PrecioLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(FechaPLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(inicioLayout.createSequentialGroup()
                                                .addComponent(IDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)
                                                .addComponent(IDLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(44, 44, 44)
                                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(infoRenglonesLabel)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(inicioLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(Titulo))
                            .addComponent(Separador6)))
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(volverButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        inicioLayout.setVerticalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Titulo)
                .addGap(1, 1, 1)
                .addComponent(Separador6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textIDConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aceptarButton)
                    .addComponent(ingresarID)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(infoOrdenLabel)
                            .addComponent(mesas))
                        .addGap(18, 18, 18)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(IDLabel)
                            .addComponent(IDLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(infoRenglonesLabel))
                .addGap(22, 22, 22)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FechaPLabel)
                            .addComponent(FechaPLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PrecioLabel)
                            .addComponent(PrecioLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDProveedorLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(IDProveedorLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(volverButton)
                .addGap(116, 116, 116))
        );

        mesas.setFont(new java.awt.Font("DialogInput", 1, 28));

        contenedor.add(inicio, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1065, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed
        comienzaConsultar();
        
        int idOrden = 0;
        Map<Orden_Compra, List<Renglon_Compra>> ordenCompleta = new HashMap<>();
        Orden_Compra infoOrden = new Orden_Compra();
        List<Renglon_Compra> infoRenglones = new ArrayList<Renglon_Compra>();
        DefaultTableModel modelo = (DefaultTableModel) tablaRenglones.getModel();

        try {
            if((textIDConsultar.getText().isEmpty()) || ("0".equals(textIDConsultar.getText().toString()))){
                JOptionPane.showMessageDialog(null, "ID no puede estar vacio o ser cero.\n");
                textIDConsultar.setText("");
                aceptarButton.setEnabled(true);
            }else{
                idOrden = Integer.parseInt(textIDConsultar.getText());
                ordenCompleta = Manager_OrdenCompra.getInstance().consultarOrdenDeCompra(idOrden);

                Set<Orden_Compra> keys = ordenCompleta.keySet();
                for(Orden_Compra key : keys){
                    infoOrden = key;
                }

                if(infoOrden.getPrecioTotal() == 0){
                    JOptionPane.showMessageDialog(null, "La Orden de Compra consultada no existe.\n");
                    limpiarVariables();
                    modelo.setRowCount(0);
                }else{
                    infoRenglones = ordenCompleta.get(infoOrden);

                    IDLabel2.setText(String.valueOf(idOrden));
                    FechaPLabel2.setText(infoOrden.getFechaPedido().toString());
                    PrecioLabel2.setText(String.valueOf(infoOrden.getPrecioTotal()));
                    IDProveedorLabel2.setText(infoOrden.getProveedor().toString());


                    for(Renglon_Compra info: infoRenglones){
                        modelo.addRow(new Object[] {info.getCantidad(), info.getPrecio(), info.getNombre_Tiene()});
                    }
                }
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Sucedió un error inesperado.\n");
        }
    }//GEN-LAST:event_aceptarButtonActionPerformed

    private void textIDConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIDConsultarActionPerformed
        aceptarButton.setEnabled(true);
    }//GEN-LAST:event_textIDConsultarActionPerformed

    private void volverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverButtonActionPerformed
        int eleccion= JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la operación?", "Confirmar", JOptionPane.CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(eleccion==0){
            System.exit(0);
        }
    }//GEN-LAST:event_volverButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FechaPLabel;
    private javax.swing.JLabel FechaPLabel2;
    private javax.swing.JLabel IDLabel;
    private javax.swing.JLabel IDLabel2;
    private javax.swing.JLabel IDProveedorLabel;
    private javax.swing.JLabel IDProveedorLabel2;
    private javax.swing.JLabel PrecioLabel;
    private javax.swing.JLabel PrecioLabel2;
    private javax.swing.JLabel Separador6;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton aceptarButton;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel infoOrdenLabel;
    private javax.swing.JLabel infoRenglonesLabel;
    private javax.swing.JLabel ingresarID;
    private javax.swing.JPanel inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mesas;
    private javax.swing.JTable tablaRenglones;
    private javax.swing.JTextField textIDConsultar;
    private javax.swing.JButton volverButton;
    // End of variables declaration//GEN-END:variables
}
