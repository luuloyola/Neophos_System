package paneles;

import java.awt.Font;

import javax.swing.*;

public class ConsultarOrdenDeCompra extends javax.swing.JFrame {
    
    public ConsultarOrdenDeCompra(){
        initComponents();
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
        mesas = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        Separador6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

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
                .addContainerGap(532, Short.MAX_VALUE)
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

        mesas.setFont(new java.awt.Font("DialogInput", 1, 28));

        Titulo.setFont(new java.awt.Font("Microsoft YaHei", 1, 21)); // NOI18N
        Titulo.setForeground(new java.awt.Color(97, 34, 34));
        Titulo.setText("CONSULTAR ORDEN DE COMPRA");

        Separador6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Separador6.setForeground(new java.awt.Color(97, 34, 34));
        Separador6.setText("__________________________________________________________________________________________________________________________________________________________________________________________________");

        jLabel1.setText("jLabel1");

        jButton1.setText("jButton1");

        javax.swing.GroupLayout inicioLayout = new javax.swing.GroupLayout(inicio);
        inicio.setLayout(inicioLayout);
        inicioLayout.setHorizontalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGap(157, 596, Short.MAX_VALUE)
                .addComponent(mesas, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(inicioLayout.createSequentialGroup()
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(Titulo))
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(Separador6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(inicioLayout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(280, 280, 280))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mesas, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(inicioLayout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 548, Short.MAX_VALUE)))
        );

        mesas.setFont(new java.awt.Font("DialogInput", 1, 28));

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
    private javax.swing.JLabel Separador6;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JPanel contenedor;
    private javax.swing.JPanel inicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mesas;
    // End of variables declaration//GEN-END:variables
}
