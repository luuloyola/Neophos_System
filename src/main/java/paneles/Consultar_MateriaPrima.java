/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paneles;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import logico.Manager_MateriaPrima;
import logico.Manager_Proveedor;
import logico.MateriaPrima;
import logico.Proveedor;

public class Consultar_MateriaPrima extends javax.swing.JPanel {
    
    private Manager_MateriaPrima manager_mat;
    private Manager_Proveedor manager_proveedor;
    private DefaultListModel modelo_lista;

    public Consultar_MateriaPrima(String proveedor) throws Exception {
        modelo_lista = new DefaultListModel();
        
        initComponents();
        manager_mat = new Manager_MateriaPrima();
        manager_proveedor = new Manager_Proveedor();
        
        proveedor_lista.addItem("");
        
        if (proveedor != ""){
            proveedor_lista.addItem(proveedor);
            proveedor_lista.setSelectedIndex(1);
        }
        else{
            ArrayList<Proveedor> proveedores = manager_proveedor.getAllProveedores();
            String auxiliar;
     
            for (int i = 0; i<proveedores.size(); i++){
                auxiliar = proveedores.get(i).getNombre();
                proveedor_lista.addItem(auxiliar);
            }
        }
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
        proveedor_lista = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listita = new javax.swing.JList<>(modelo_lista);
        buscar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        id_materiaprima = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        contenedor.setBackground(new java.awt.Color(204, 204, 204));
        contenedor.setMaximumSize(new java.awt.Dimension(1042, 619));
        contenedor.setLayout(new java.awt.CardLayout());

        inicio.setBackground(new java.awt.Color(227, 227, 218));
        inicio.setMaximumSize(new java.awt.Dimension(1042, 619));
        inicio.setPreferredSize(new java.awt.Dimension(1042, 619));

        Titulo.setFont(new java.awt.Font("Microsoft YaHei", 1, 21)); // NOI18N
        Titulo.setForeground(new java.awt.Color(97, 34, 34));
        Titulo.setText("CONSULTAR MATERIA PRIMA");

        Separador6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Separador6.setForeground(new java.awt.Color(97, 34, 34));
        Separador6.setText("__________________________________________________________________________________________________________________________________________________________________________________________________");

        proveedor_lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedor_listaActionPerformed(evt);
            }
        });

        listita.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listita);

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jButton2.setText("Confirmar");

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID materia prima:");

        id_materiaprima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_materiaprimaActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Proveedor");

        javax.swing.GroupLayout inicioLayout = new javax.swing.GroupLayout(inicio);
        inicio.setLayout(inicioLayout);
        inicioLayout.setHorizontalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, inicioLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(Titulo))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, inicioLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(Separador6))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, inicioLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(inicioLayout.createSequentialGroup()
                                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(inicioLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(proveedor_lista, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(76, 76, 76)
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(id_materiaprima, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicioLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addGap(65, 65, 65)))
                                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, inicioLayout.createSequentialGroup()
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        inicioLayout.setVerticalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Separador6)
                        .addGap(27, 27, 27)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(proveedor_lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(id_materiaprima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel1)))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 28));

        contenedor.add(inicio, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void proveedor_listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedor_listaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proveedor_listaActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        if(proveedor_lista.getSelectedIndex() == 0 && id_materiaprima.getText()==""){
            // hace algo gil
            return;
        }

        String proveedor = "";
        int id_Materia = 0;
        MateriaPrima buscada = new MateriaPrima();
        ArrayList<MateriaPrima> arreglo = new ArrayList();
        if (proveedor_lista.getSelectedIndex() != 0){
            proveedor = proveedor_lista.getSelectedItem().toString();
            try {
                arreglo = manager_mat.consultarListaMaterias_Porproveedor(proveedor);
            } catch (Exception ex) {
                Logger.getLogger(Consultar_MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (!id_materiaprima.getText().isBlank()){
            id_Materia = Integer.parseInt(id_materiaprima.getText());
            try {
                buscada = manager_mat.consultarMateriaPrima(id_Materia);
            } catch (Exception ex) {
                Logger.getLogger(Consultar_MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (proveedor_lista.getSelectedIndex() != 0 && !id_materiaprima.getText().isBlank()){
            if (arreglo.contains(buscada)){
                modelo_lista.addElement(buscada);
            }
            else{
                //agregar como que cagaste con el popup
            }
        }
        else if(proveedor_lista.getSelectedIndex() != 0 && id_materiaprima.getText().isBlank()){
            if (arreglo.size()!=0){
                for (int i = 0; i<arreglo.size(); i++){
                    proveedor = arreglo.get(i).getNombre();
                    modelo_lista.addElement(proveedor);
                }
            }
            else{
                paneles.Principal.getNeophos().PopUp("No hay resultados", "src/files/warning.png", "Ups");
            }
        }
        else if(proveedor_lista.getSelectedIndex() == 0 && !id_materiaprima.getText().isBlank()){
            
        }
        

    }//GEN-LAST:event_buscarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void id_materiaprimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_materiaprimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_materiaprimaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Separador6;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton buscar;
    private javax.swing.JPanel contenedor;
    private javax.swing.JTextField id_materiaprima;
    private javax.swing.JPanel inicio;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listita;
    private javax.swing.JComboBox<String> proveedor_lista;
    // End of variables declaration//GEN-END:variables
}
