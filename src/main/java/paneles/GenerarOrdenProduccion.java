package paneles;

import java.awt.Color;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logico.ManagerOrdenProduccion;
import logico.RenglonProduccion;

public class GenerarOrdenProduccion extends javax.swing.JPanel {
    private ManagerOrdenProduccion manager_orden;
    private final ArrayList<RenglonProduccion> renglon;
    private Consultar_ProductoFinal consultar;
    private DefaultTableModel modelo;
    private double precio_total;

    public GenerarOrdenProduccion() {
        initComponents();
        renglon = new ArrayList<RenglonProduccion>();
        modelo = (DefaultTableModel) tablaRenglones.getModel();
        fechaAuto.setText("Fecha Pedido:  "+LocalDate.now().getYear()+" / "+LocalDate.now().getMonthValue()+" / "+LocalDate.now().getDayOfMonth());
        eliminar.setVisible(false);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fechaAuto = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        año_lim = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        mes_lim = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dia_lim = new javax.swing.JTextField();
        req = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        btn_confirma = new javax.swing.JButton();
        JCalculo = new javax.swing.JLabel();
        Separador6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRenglones = new javax.swing.JTable();
        precio_total_field = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        receta = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        inicio.setBackground(new java.awt.Color(227, 227, 218));
        inicio.setPreferredSize(new java.awt.Dimension(800, 517));
        inicio.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                inicioAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(97, 34, 34));
        jLabel1.setText("GENERAR ORDEN DE PRODUCCION");

        fechaAuto.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        fechaAuto.setForeground(new java.awt.Color(97, 34, 34));
        fechaAuto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fechaAuto.setText("Fecha Pedido:");
        fechaAuto.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(97, 34, 34));
        jLabel3.setText("Fecha Limite:");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        año_lim.setText("yyyy");
        año_lim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                año_limMouseClicked(evt);
            }
        });
        año_lim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                año_limActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(97, 34, 34));
        jLabel7.setText("/");

        mes_lim.setText("mm");
        mes_lim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mes_limMouseClicked(evt);
            }
        });
        mes_lim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mes_limActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(97, 34, 34));
        jLabel8.setText("/");

        dia_lim.setText("dd");
        dia_lim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia_limMouseClicked(evt);
            }
        });
        dia_lim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dia_limActionPerformed(evt);
            }
        });

        req.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        req.setForeground(new java.awt.Color(97, 34, 34));
        req.setText("(*)");

        btn_agregar.setBackground(new java.awt.Color(117, 49, 49));
        btn_agregar.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(227, 227, 218));
        btn_agregar.setText("AGREGAR PRODUCTO");
        btn_agregar.setBorder(null);
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_confirma.setBackground(new java.awt.Color(117, 49, 49));
        btn_confirma.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        btn_confirma.setForeground(new java.awt.Color(227, 227, 218));
        btn_confirma.setText("CONFIRMA");
        btn_confirma.setBorder(null);
        btn_confirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmaActionPerformed(evt);
            }
        });

        JCalculo.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        JCalculo.setForeground(new java.awt.Color(97, 34, 34));
        JCalculo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        Separador6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Separador6.setForeground(new java.awt.Color(97, 34, 34));
        Separador6.setText("__________________________________________________________________________________________________________________________________________________________________________________________________");

        tablaRenglones.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        tablaRenglones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad", "Precio "
            }
        ));
        tablaRenglones.getTableHeader().setReorderingAllowed(false);
        tablaRenglones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaRenglonesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaRenglones);

        precio_total_field.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        precio_total_field.setForeground(new java.awt.Color(97, 34, 34));
        precio_total_field.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        precio_total_field.setText("COSTO TOTAL:");
        precio_total_field.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        eliminar.setBackground(new java.awt.Color(117, 49, 49));
        eliminar.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        eliminar.setForeground(new java.awt.Color(227, 227, 218));
        eliminar.setText("ELIMINAR");
        eliminar.setBorder(null);
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        receta.setColumns(20);
        receta.setRows(5);
        jScrollPane2.setViewportView(receta);

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(97, 34, 34));
        jLabel4.setText("AGREGAR RECETA");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout inicioLayout = new javax.swing.GroupLayout(inicio);
        inicio.setLayout(inicioLayout);
        inicioLayout.setHorizontalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicioLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addComponent(Separador6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(40, 40, 40))
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(inicioLayout.createSequentialGroup()
                                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(inicioLayout.createSequentialGroup()
                                        .addComponent(JCalculo)
                                        .addGap(380, 380, 380))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, inicioLayout.createSequentialGroup()
                                        .addComponent(precio_total_field)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(inicioLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_confirma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicioLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(52, 52, 52))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicioLayout.createSequentialGroup()
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(inicioLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(año_lim, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mes_lim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dia_lim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(req))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fechaAuto)
                        .addGap(86, 86, 86))))
        );
        inicioLayout.setVerticalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fechaAuto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Separador6, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(año_lim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(mes_lim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(dia_lim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(req)
                            .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_confirma, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCalculo)
                    .addComponent(precio_total_field)
                    .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_confirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmaActionPerformed
        if (tablaRenglones.getRowCount()<=0){
            JOptionPane.showMessageDialog(this,"Debe ingresar renglones","", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Date fecha_lim, fecha_now;
        String recetas = " - ";
        if(!receta.getText().equals(""))recetas = receta.getText();

        if (verificar_fecha()){
            fecha_lim = new Date((Integer.parseInt(año_lim.getText())-1900),Integer.parseInt(mes_lim.getText()),Integer.parseInt(dia_lim.getText()));
            fecha_now = new Date((LocalDate.now().getYear()-1900),LocalDate.now().getMonthValue(),LocalDate.now().getDayOfMonth());
        }
        else return;

        int input = JOptionPane.showConfirmDialog(this,"Seguro desea confirmar la orden en proceso?", "",JOptionPane.YES_NO_CANCEL_OPTION);

        if (input == 0){
            manager_orden = ManagerOrdenProduccion.getInstance();

            try {
                manager_orden.generarOrdenDeProduccion(fecha_now, precio_total, fecha_lim,recetas,renglon);
                JOptionPane.showMessageDialog(this, "Orden de produccion cargada con exito", "", JOptionPane.INFORMATION_MESSAGE);
                restablecer_valores();
            } catch (Exception ex) {
                Logger.getLogger(Generar_Orden.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btn_confirmaActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        try {
            paneles.Principal.getNeophos().go_to(consultar = new Consultar_ProductoFinal(1));
        } catch (Exception ex) {
            Logger.getLogger(Generar_Orden.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void dia_limActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dia_limActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dia_limActionPerformed

    private void dia_limMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia_limMouseClicked
        dia_lim.setText("");
    }//GEN-LAST:event_dia_limMouseClicked

    private void mes_limActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mes_limActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mes_limActionPerformed

    private void mes_limMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mes_limMouseClicked
        mes_lim.setText("");
    }//GEN-LAST:event_mes_limMouseClicked

    private void año_limActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_año_limActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_año_limActionPerformed

    private void año_limMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_año_limMouseClicked
        año_lim.setText("");
    }//GEN-LAST:event_año_limMouseClicked

    private void inicioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_inicioAncestorAdded
        if (consultar != null){
            if(consultar.getRenglon()!=null){
                for(int i=0; i< renglon.size(); i++){
                    
                    if (renglon.get(i).getNombre_Tiene().equals(consultar.getRenglon().getNombre_Tiene())){
                        JOptionPane.showMessageDialog(this,"La materia seleccionada ya se encontraba en el listado","", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
                renglon.add(consultar.getRenglon());
                precio_total = precio_total + consultar.getRenglon().getPrecio();
                precio_total_field.setText("COSTO TOTAL :  "+Double.toString(precio_total)+" $");
                modelo.addRow(new Object[] {consultar.getRenglon().getNombre_Tiene(), consultar.getRenglon().getCantidad(),consultar.getRenglon().getPrecio()});
        }}
    }//GEN-LAST:event_inicioAncestorAdded

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

    public void restablecer_valores(){
        año_lim.setText("yyyy");
        mes_lim.setText("mm");
        dia_lim.setText("dd");
        renglon.clear();
        precio_total = 0;
        precio_total_field.setText("COSTO TOTAL: ");
        receta.setText("");
        modelo.setRowCount(0);
    }
    
    public boolean verificar_fecha(){
        try{
            LocalDate fecha = LocalDate.now();
            if (fecha.getYear()>Integer.parseInt(año_lim.getText())){
                JOptionPane.showMessageDialog(this,"Debe ingresar un año valido","", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            if ((!(0<Integer.parseInt(mes_lim.getText()) && Integer.parseInt(mes_lim.getText()) <=12))||((Integer.parseInt(año_lim.getText())== fecha.getYear()) && fecha.getMonthValue()> Integer.parseInt(mes_lim.getText()))){
                JOptionPane.showMessageDialog(this,"Debe ingresar un mes valido","", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            if ((!(0<Integer.parseInt(dia_lim.getText()) &&Integer.parseInt(dia_lim.getText()) <31))||(fecha.getMonthValue() == Integer.parseInt(mes_lim.getText()) && Integer.parseInt(dia_lim.getText())< fecha.getDayOfMonth())){
                JOptionPane.showMessageDialog(this,"Debe ingresar un dia valido","", JOptionPane.WARNING_MESSAGE);
                return false;
            }

            return true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Debe cambiar los valores de la fecha limite","", JOptionPane.WARNING_MESSAGE);
            req.setForeground(Color.red);
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JCalculo;
    private javax.swing.JLabel Separador6;
    private javax.swing.JTextField año_lim;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_confirma;
    private javax.swing.JTextField dia_lim;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel fechaAuto;
    private javax.swing.JPanel inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mes_lim;
    private javax.swing.JLabel precio_total_field;
    private javax.swing.JTextArea receta;
    private javax.swing.JLabel req;
    private javax.swing.JTable tablaRenglones;
    // End of variables declaration//GEN-END:variables
}
