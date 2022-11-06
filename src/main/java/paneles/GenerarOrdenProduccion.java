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
    private ArrayList<RenglonProduccion> renglon;
    private AgregarProductosFinales consultar;
    private DefaultTableModel modelo;
    private double precio_total;

    public GenerarOrdenProduccion() {
        
        renglon = new ArrayList<RenglonProduccion>();
        //modelo = (DefaultTableModel) Tabla_productos.getModel();
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        año_lim = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        mes_lim = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dia_lim = new javax.swing.JTextField();
        req = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_productos = new javax.swing.JTable();
        btn_calcular = new javax.swing.JButton();
        btn_confirma = new javax.swing.JButton();
        JCalculo = new javax.swing.JLabel();

        inicio.setBackground(new java.awt.Color(227, 227, 218));
        inicio.setPreferredSize(new java.awt.Dimension(800, 517));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(97, 34, 34));
        jLabel1.setText("GENERAR ORDEN DE PRODUCCION");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(97, 34, 34));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Fecha Pedido:");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

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

        Tabla_productos.setBackground(new java.awt.Color(255, 255, 204));
        Tabla_productos.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        Tabla_productos.setForeground(new java.awt.Color(97, 34, 34));
        Tabla_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad", "Precio c/u"
            }
        ));
        jScrollPane1.setViewportView(Tabla_productos);

        btn_calcular.setBackground(new java.awt.Color(117, 49, 49));
        btn_calcular.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        btn_calcular.setForeground(new java.awt.Color(227, 227, 218));
        btn_calcular.setText("CALCULAR COSTO");
        btn_calcular.setBorder(null);
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
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

        javax.swing.GroupLayout inicioLayout = new javax.swing.GroupLayout(inicio);
        inicio.setLayout(inicioLayout);
        inicioLayout.setHorizontalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addComponent(btn_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JCalculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_confirma, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inicioLayout.createSequentialGroup()
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(40, 40, 40))
        );
        inicioLayout.setVerticalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(año_lim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(mes_lim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(dia_lim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(req)
                    .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 36, Short.MAX_VALUE)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_confirma, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCalculo))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_confirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmaActionPerformed
        if (Tabla_productos.getRowCount()<=0){
            JOptionPane.showMessageDialog(this,"Debe ingresar renglones","", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Date fecha;

        if (verificar_fecha()){
            fecha = new Date(Integer.parseInt(año_lim.getText()),Integer.parseInt(mes_lim.getText()),Integer.parseInt(dia_lim.getText()));
        }
        else return;

        int input = JOptionPane.showConfirmDialog(this,"Seguro desea confirmar la orden en proceso?", "",JOptionPane.YES_NO_CANCEL_OPTION);

        if (input == 0){
            manager_orden = ManagerOrdenProduccion.getInstance();

            try {
                manager_orden.generarOrdenDeProduccion(fecha, precio_total, renglon);
                JOptionPane.showMessageDialog(this, "Orden de compra cargada con exito", "", JOptionPane.INFORMATION_MESSAGE);
                restablecer_valores();
            } catch (Exception ex) {
                Logger.getLogger(Generar_Orden.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btn_confirmaActionPerformed

    public void restablecer_valores(){
        año_lim.setText("yyyy");
        mes_lim.setText("mm");
        dia_lim.setText("dd");
        renglon.clear();
        precio_total = 0;
        consultar = null;
        modelo.setRowCount(0);
    }
    
    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_calcularActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        try {
            ConsultarOrdenDeCompra consulta;
            paneles.Principal.getNeophos().go_to(consulta = new ConsultarOrdenDeCompra());
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

    public boolean verificar_fecha(){
        try{
            LocalDate fecha = LocalDate.now();
            if (fecha.getYear()<Integer.parseInt(año_lim.getText())){
                JOptionPane.showMessageDialog(this,"Debe ingresar un año valido","", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            if ((!(0<Integer.parseInt(mes_lim.getText()) && Integer.parseInt(mes_lim.getText()) <12))||(año_lim.getText().equals(fecha.getYear()) && fecha.getMonthValue()> Integer.parseInt(mes_lim.getText()))){
                JOptionPane.showMessageDialog(this,"Debe ingresar un mes valido","", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            if ((!(0<Integer.parseInt(dia_lim.getText()) &&Integer.parseInt(dia_lim.getText()) <31))||(mes_lim.getText().equals(fecha.getMonthValue()) && Integer.parseInt(dia_lim.getText())< fecha.getDayOfMonth())){
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
    private javax.swing.JLabel JCalculo;
    private javax.swing.JTable Tabla_productos;
    private javax.swing.JTextField año_lim;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_calcular;
    private javax.swing.JButton btn_confirma;
    private javax.swing.JTextField dia_lim;
    private javax.swing.JPanel inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mes_lim;
    private javax.swing.JLabel req;
    // End of variables declaration//GEN-END:variables
}
