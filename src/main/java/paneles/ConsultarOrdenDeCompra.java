package paneles;

import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import logico.Manager_OrdenCompra;
import logico.Orden_Compra;
import logico.Renglon;

public class ConsultarOrdenDeCompra extends javax.swing.JFrame {
    
    public ConsultarOrdenDeCompra(){
        initComponents();
        inicializarLabels();
    }

    public void inicializarLabels(){
        aceptarButton.setEnabled(true);
        infoOrdenLabel.setEnabled(false);
        IDLabel.setEnabled(false);
        IDLabel2.setEnabled(false);
        FechaPLabel.setEnabled(false);
        FechaPLabel2.setEnabled(false);
        PrecioLabel.setEnabled(false);
        PrecioLabel2.setEnabled(false);
        IDProveedorLabel.setEnabled(false);
        IDProveedorLabel2.setEnabled(false); 
    }
    
    public void comienzaConsultar(){
        infoOrdenLabel.setEnabled(true);
        IDLabel.setEnabled(true);
        IDLabel2.setEnabled(true);
        FechaPLabel.setEnabled(true);
        FechaPLabel2.setEnabled(true);
        PrecioLabel.setEnabled(true);
        PrecioLabel2.setEnabled(true);
        IDProveedorLabel.setEnabled(true);
        IDProveedorLabel2.setEnabled(true); 
    }
    
    // go_to es una funcion que nos ayuda a cambiar entre los paneles del sistema
    public void go_to(JPanel panel) {
        contenedor.removeAll();
        contenedor.add(panel);
        contenedor.repaint();
        contenedor.revalidate();
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
        jPanel1 = new javax.swing.JPanel();
        Titulo2 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        contenedor.setBackground(new java.awt.Color(204, 204, 204));
        contenedor.setMaximumSize(new java.awt.Dimension(1042, 619));
        contenedor.setLayout(new java.awt.CardLayout());

        inicio.setBackground(new java.awt.Color(227, 227, 218));
        inicio.setMaximumSize(new java.awt.Dimension(1042, 619));
        inicio.setPreferredSize(new java.awt.Dimension(1042, 619));

        jPanel1.setBackground(new java.awt.Color(97, 34, 34));

        Titulo2.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        Titulo2.setForeground(new java.awt.Color(227, 227, 218));
        Titulo2.setText("NEOPHOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(597, Short.MAX_VALUE)
                .addComponent(Titulo2)
                .addGap(386, 386, 386))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo2, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap())
        );


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
                "ID Renglon", "Cantidad", "Precio ", "ID Materia"
            }
        ));
        tablaRenglones.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaRenglones);

        volverButton.setText("Volver al Menú Principal");
        volverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverButtonActionPerformed(evt);
            }
        });

        infoOrdenLabel.setFont(new java.awt.Font("Microsoft YaHei", 3, 14)); // NOI18N
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

        FechaPLabel2.setText("jLabel7");

        PrecioLabel2.setText("jLabel7");

        IDProveedorLabel2.setText("jLabel7");

        IDLabel2.setText("jLabel7");

        javax.swing.GroupLayout inicioLayout = new javax.swing.GroupLayout(inicio);
        inicio.setLayout(inicioLayout);
        inicioLayout.setHorizontalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addComponent(ingresarID)
                        .addGap(46, 46, 46)
                        .addComponent(textIDConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(aceptarButton))
                    .addComponent(infoOrdenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(inicioLayout.createSequentialGroup()
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(Titulo))
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(Separador6))
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(418, 418, 418)
                        .addComponent(volverButton)))
                .addGap(0, 35, Short.MAX_VALUE))
            .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        inicioLayout.setVerticalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Separador6)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textIDConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aceptarButton)
                    .addComponent(ingresarID))
                .addGap(30, 30, 30)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addComponent(infoOrdenLabel)
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
                        .addGap(15, 15, 15)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PrecioLabel)
                            .addComponent(PrecioLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDProveedorLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(IDProveedorLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addComponent(volverButton)
                .addGap(38, 38, 38))
            .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(inicioLayout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 549, Short.MAX_VALUE)))
        );


        contenedor.add(inicio, "card2");

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

    private void volverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverButtonActionPerformed
        //go_To(Principal);
    }//GEN-LAST:event_volverButtonActionPerformed

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed
        comienzaConsultar();
        aceptarButton.setEnabled(false);
        textIDConsultar.setEnabled(false);
        
        int idOrden = 0;
        Map<Orden_Compra, List<Renglon>> ordenCompleta = new HashMap<>();
        Orden_Compra infoOrden = null;
        List<Renglon> infoRenglones = new ArrayList<Renglon>();
        DefaultTableModel modelo = (DefaultTableModel) tablaRenglones.getModel();
        
        try {
            while((textIDConsultar.getText().isEmpty()) || ("0".equals(textIDConsultar.getText().toString()))){
                JOptionPane.showMessageDialog(null, "ID no puede estar vacio o ser cero.\n");
                textIDConsultar.setText("");
                aceptarButton.setEnabled(true);
            }
            idOrden = Integer.parseInt(textIDConsultar.getText());
            ordenCompleta = Manager_OrdenCompra.getInstance().consultarOrdenDeCompra(idOrden);
            
            Set<Orden_Compra> keys = ordenCompleta.keySet();
            for(Orden_Compra key : keys){
                infoOrden = key;
            }
            
            infoRenglones = ordenCompleta.get(infoOrden);
            
            IDLabel2.setText(String.valueOf(idOrden));
            FechaPLabel2.setText(infoOrden.getFechaPedido().toString());
            PrecioLabel2.setText(String.valueOf(infoOrden.getPrecioTotal()));
            IDProveedorLabel2.setText(String.valueOf(infoOrden.getID_Proveedor()));
            
            /*
            modelo.addColumn("ID Renglon");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Precio");
            modelo.addColumn("ID Materia");*/
        
            for(Renglon info: infoRenglones){
                Renglon ren = new Renglon(info.getCantidad(), info.getPrecio(), info.getID_Tiene());
                modelo.addRow(new Object[] {idOrden, info.getCantidad(), info.getPrecio(), info.getID_Tiene()});
            }
                
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "La Orden de Compra consultada no existe.\n");
        }
    }//GEN-LAST:event_aceptarButtonActionPerformed

    private void textIDConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIDConsultarActionPerformed
        aceptarButton.setEnabled(true);
    }//GEN-LAST:event_textIDConsultarActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarOrdenDeCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarOrdenDeCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarOrdenDeCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarOrdenDeCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                
                }
            
            
            
        });
    }

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
    private javax.swing.JLabel Titulo2;
    private javax.swing.JButton aceptarButton;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel infoOrdenLabel;
    private javax.swing.JLabel infoRenglonesLabel;
    private javax.swing.JLabel ingresarID;
    private javax.swing.JPanel inicio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaRenglones;
    private javax.swing.JTextField textIDConsultar;
    private javax.swing.JButton volverButton;
    // End of variables declaration//GEN-END:variables
}
