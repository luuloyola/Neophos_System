/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paneles;

import java.awt.Color;
import java.sql.Date;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logico.Manager_OrdenCompra;
import logico.Manager_Proveedor;
import logico.MateriaPrima;
import logico.Proveedor;
import logico.Renglon;


public class Generar_Orden extends javax.swing.JPanel {

    private Manager_Proveedor manager_proveedor;
    private Manager_OrdenCompra manager_orden;
    private ArrayList<Renglon> renglon;
    private ArrayList<MateriaPrima> materia;
    private Consultar_MateriaPrima consultar;
    private DefaultTableModel modelo;
    private double precio_total;
    
    public Generar_Orden() throws Exception {
        manager_proveedor = Manager_Proveedor.getInstance();

        initComponents();
        
        eliminar.setVisible(false);
        proveedor_lista.setEnabled(true);
        
        renglon = new ArrayList<Renglon>();
        materia = new ArrayList<MateriaPrima>();
        
        modelo = (DefaultTableModel) tablaRenglones.getModel();
        
        ArrayList<Proveedor> proveedores = manager_proveedor.getAllProveedores();
        String auxiliar;
        proveedor_lista.addItem("Nombre Proveedor");
        
        restablecer_valores();

        for (int i = 0; i<proveedores.size(); i++){
            auxiliar = proveedores.get(i).getNombre();
            proveedor_lista.addItem(auxiliar);
        }
        
    }

    public void restablecer_valores(){
        año.setText("yyyy");
        mes.setText("mm");
        dia.setText("dd");
        proveedor_lista.setSelectedIndex(0);
        renglon.clear();
        materia.clear();
        precio_total = 0;
        consultar = null;
        modelo.setRowCount(0);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        inicio = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Separador6 = new javax.swing.JLabel();
        proveedor_lista = new javax.swing.JComboBox<>();
        prov = new javax.swing.JLabel();
        agregar_renglon = new javax.swing.JButton();
        confirmar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRenglones = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        año = new javax.swing.JTextField();
        mes = new javax.swing.JTextField();
        dia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        req = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        inicio.setBackground(new java.awt.Color(227, 227, 218));
        inicio.setMaximumSize(new java.awt.Dimension(1060, 616));
        inicio.setPreferredSize(new java.awt.Dimension(1060, 616));
        inicio.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                inicioAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        Titulo.setFont(new java.awt.Font("Microsoft YaHei", 1, 21)); // NOI18N
        Titulo.setForeground(new java.awt.Color(97, 34, 34));
        Titulo.setText("GENERAR ORDEN DE COMPRAR");

        Separador6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Separador6.setForeground(new java.awt.Color(97, 34, 34));
        Separador6.setText("__________________________________________________________________________________________________________________________________________________________________________________________________");

        proveedor_lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedor_listaActionPerformed(evt);
            }
        });

        prov.setForeground(new java.awt.Color(0, 0, 0));

        agregar_renglon.setText("Agregar Renglón");
        agregar_renglon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_renglonActionPerformed(evt);
            }
        });

        confirmar.setText("Confirmar");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        tablaRenglones.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        tablaRenglones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Materia Prima", "Nombre", "Cantidad", "Precio "
            }
        ));
        tablaRenglones.getTableHeader().setReorderingAllowed(false);
        tablaRenglones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaRenglonesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaRenglones);

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Proveedor");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Fecha:");

        año.setText("yyyy");
        año.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                añoMouseClicked(evt);
            }
        });
        año.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añoActionPerformed(evt);
            }
        });

        mes.setText("mm");
        mes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesMouseClicked(evt);
            }
        });

        dia.setText("dd");
        dia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diaMouseClicked(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("/");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("/");

        req.setForeground(new java.awt.Color(51, 51, 51));
        req.setText("(*)");

        eliminar.setText("Eliminar Renglon");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inicioLayout = new javax.swing.GroupLayout(inicio);
        inicio.setLayout(inicioLayout);
        inicioLayout.setHorizontalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Separador6)
                    .addComponent(Titulo)
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prov)
                        .addGap(18, 18, 18)
                        .addComponent(proveedor_lista, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(req)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(agregar_renglon, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        inicioLayout.setVerticalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separador6)
                .addGap(18, 18, 18)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proveedor_lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prov)
                    .addComponent(agregar_renglon, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(req))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        prov.setFont(new java.awt.Font("DialogInput", 1, 28));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 1013, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void proveedor_listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedor_listaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proveedor_listaActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        int input = JOptionPane.showConfirmDialog(this,"Seguro desea cancelar la orden en proceso?", "¡Cuidado!",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        if (input == 0){
            restablecer_valores();
            return;
        }
    }//GEN-LAST:event_cancelarActionPerformed

    private void agregar_renglonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_renglonActionPerformed
        if (proveedor_lista.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this,"Debe seleccionar un proveedor","", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            paneles.Principal.getNeophos().go_to(consultar =new Consultar_MateriaPrima(proveedor_lista.getSelectedItem().toString()));
        } catch (Exception ex) {
            Logger.getLogger(Generar_Orden.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_agregar_renglonActionPerformed

    private void inicioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_inicioAncestorAdded
        if (consultar != null){
            if(consultar.getRenglon()!=null){
                if (proveedor_lista.isEnabled()) proveedor_lista.setEnabled(false);
                for(int i=0; i< renglon.size(); i++){
                    if (renglon.get(i).getID_Tiene()==consultar.getRenglon().getID_Tiene()){
                        JOptionPane.showMessageDialog(this,"La materia seleccionada ya se encontraba en el listado","", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
                renglon.add(consultar.getRenglon());
                precio_total = precio_total + consultar.getRenglon().getPrecio();
                materia.add(consultar.getMateria_Consultada());
                modelo.addRow(new Object[] {consultar.getRenglon().getID_Tiene(),consultar.getMateria_Consultada().getNombre(), consultar.getRenglon().getCantidad(),consultar.getRenglon().getPrecio()});
        }}
    }//GEN-LAST:event_inicioAncestorAdded

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        if (modelo.getRowCount()<=0){
            JOptionPane.showMessageDialog(this,"Debe ingresar renglones","", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Date fecha;
        
        
        if (verificar_fecha()){
            int año1 = Integer.parseInt(año.getText()) -1900;
            int mes1 = Integer.parseInt(mes.getText()) - 1;
            fecha = new Date(año1, mes1, Integer.parseInt(dia.getText()));
        }
        else return;
        
        int input = JOptionPane.showConfirmDialog(this,"Seguro desea confirmar la orden en proceso?", "",JOptionPane.YES_NO_CANCEL_OPTION);
        
        if (input == 0){
            manager_orden = Manager_OrdenCompra.getInstance();

            try {
                manager_orden.generarOrdenDeCompra(proveedor_lista.getSelectedItem().toString(), fecha, precio_total, renglon);
                JOptionPane.showMessageDialog(this, "Orden de compra cargada con exito", "", JOptionPane.INFORMATION_MESSAGE);
                restablecer_valores();
            } catch (Exception ex) {
                Logger.getLogger(Generar_Orden.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_confirmarActionPerformed

    private void añoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añoMouseClicked
        año.setText("");
    }//GEN-LAST:event_añoMouseClicked

    private void mesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesMouseClicked
        mes.setText("");
    }//GEN-LAST:event_mesMouseClicked

    private void diaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diaMouseClicked
        dia.setText("");
    }//GEN-LAST:event_diaMouseClicked

    private void añoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añoActionPerformed

    private void tablaRenglonesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaRenglonesMouseClicked
        if (tablaRenglones.getSelectedRow()!=-1){
            eliminar.setVisible(true);
        }
    }//GEN-LAST:event_tablaRenglonesMouseClicked

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        int input = JOptionPane.showConfirmDialog(this,"Seguro desea eliminar el renglon seleccionado?", "¡Cuidado!",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        if (input == 0){
            int i = tablaRenglones.getSelectedRow();
            renglon.remove(i);
            modelo.removeRow(i);
            eliminar.setVisible(false);
            return;
        }
    }//GEN-LAST:event_eliminarActionPerformed

    public boolean verificar_fecha(){
        try{
            if (1990>Integer.parseInt(año.getText())){
                JOptionPane.showMessageDialog(this,"Debe ingresar un año valido","", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            if (!(0<Integer.parseInt(mes.getText()) &&Integer.parseInt(mes.getText()) <12)){
                JOptionPane.showMessageDialog(this,"Debe ingresar un mes valido","", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            if (!(0<Integer.parseInt(dia.getText()) &&Integer.parseInt(dia.getText()) <31)){
                JOptionPane.showMessageDialog(this,"Debe ingresar un dia valido","", JOptionPane.WARNING_MESSAGE);
                return false;
            }

            return true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Debe cambiar los valores de la fecha del pedido","", JOptionPane.WARNING_MESSAGE);
            req.setForeground(Color.red);
            return false;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Separador6;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton agregar_renglon;
    private javax.swing.JTextField año;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton confirmar;
    private javax.swing.JTextField dia;
    private javax.swing.JButton eliminar;
    private javax.swing.JPanel inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mes;
    private javax.swing.JLabel prov;
    private javax.swing.JComboBox<String> proveedor_lista;
    private javax.swing.JLabel req;
    private javax.swing.JTable tablaRenglones;
    // End of variables declaration//GEN-END:variables
}
