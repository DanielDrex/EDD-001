package academia;

import arbolesylistas.ArbolBinario;
import arbolesylistas.Carrera;
import arbolesylistas.NodoArbol;
import arbolesylistas.TablasHash;
import cjb.ci.CtrlInterfaz;
import cjb.ci.Validaciones;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Daniel Castrejon
 */
public class VtnConsultaCN extends javax.swing.JFrame
{

    ArbolBinario ab1 = new ArbolBinario();

    /**
     * Creates new form VtnConsultaCN
     */
    public VtnConsultaCN()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new FondoPanelg();
        jLabel1 = new javax.swing.JLabel();
        carTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaDatos = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        bNuevoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("INGRESE NOMBRE DE LA CARRERA A BUSCAR:");

        carTextField.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                carTextFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                carTextFieldKeyTyped(evt);
            }
        });

        areaDatos.setColumns(20);
        areaDatos.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        areaDatos.setRows(5);
        areaDatos.setEnabled(false);
        jScrollPane1.setViewportView(areaDatos);

        jButton1.setText("Atrás");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        bNuevoButton.setText("BUSCAR DE NUEVO");
        bNuevoButton.setEnabled(false);
        bNuevoButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bNuevoButtonActionPerformed(evt);
            }
        });
        bNuevoButton.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                bNuevoButtonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(carTextField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(bNuevoButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(carTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(bNuevoButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        VentanaP v = new VentanaP();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void carTextFieldKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_carTextFieldKeyTyped
    {//GEN-HEADEREND:event_carTextFieldKeyTyped
        Validaciones.validaAlfabeticos(evt);
    }//GEN-LAST:event_carTextFieldKeyTyped

    private void carTextFieldKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_carTextFieldKeyPressed
    {//GEN-HEADEREND:event_carTextFieldKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            validaVacio();
        }
    }//GEN-LAST:event_carTextFieldKeyPressed

    private void bNuevoButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_bNuevoButtonActionPerformed
    {//GEN-HEADEREND:event_bNuevoButtonActionPerformed
        carTextField.setText("");
        areaDatos.setText("");
        CtrlInterfaz.cambia(carTextField);
        CtrlInterfaz.habilita(false, bNuevoButton);
    }//GEN-LAST:event_bNuevoButtonActionPerformed

    private void bNuevoButtonKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_bNuevoButtonKeyPressed
    {//GEN-HEADEREND:event_bNuevoButtonKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            bNuevoButtonActionPerformed(null);
        }
    }//GEN-LAST:event_bNuevoButtonKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        VentanaP v = new VentanaP();
        v.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
//    public ArbolBinario cargaArbol(ArbolBinario ab, String s, ArbolBinario ab1)
//    {
//        ab = TablasHash.buscar(VentanaP.rHash, s, null);
//        if (ab != null)
//        {
//            ab1 = ab.buscar(ab.getRaiz(), s, ab1);
//            return ab1;
//        } else
//        {
//            return null;
//        }
//
//    }

    public void validaVacio()
    {
        if (carTextField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "No se permite campos vacios");
            carTextField.setText("");
            carTextField.requestFocus();
            areaDatos.setText("");
        } else
        {
            ArbolBinario ab = new ArbolBinario();
            ab = TablasHash.buscar(VentanaP.rHash, carTextField.getText(), null);
            if (ab != null)
            {
                ArbolBinario ab1 = new ArbolBinario();
                ab1 = ab.buscar(ab.getRaiz(), carTextField.getText().toLowerCase(), ab1);
                if (ab1 != null && ab1.getRaiz() != null)
                {
                    while (ab1.getRaiz() != null)
                    {
                        NodoArbol[] arr2 = new NodoArbol[2];
                        arr2[0] = null;
                        arr2[1] = ab1.getRaiz();
                        ab1.elimina(carTextField.getText().toLowerCase(), ab1.getRaiz(), arr2);
                        if (arr2[0] != null)
                        {
                            System.out.println("DE NODOARBOL: " + arr2[0].getEtiqueta());
                            System.out.println("DE: NODOLISTA SEGUNDO NIVEL\t" + arr2[0].getHilo().getEtiqueta());
                            System.out.println("DE: NODOLISTA CONECTOR ARRIBA\t" + arr2[0].getHilo().getArb().getEtiqueta());
                            areaDatos.setText(areaDatos.getText() + "INSTITUCION: " + arr2[0].getHilo().getArb().getEtiqueta() + "\nNOMBRE: Ingenieria en " + arr2[0].getHilo().getEtiqueta() + "\nJEFE DE CARRERA: "
                                    + ((Carrera) arr2[0].getHilo().getObj()).getJefe() + "\nClave de Carrera: " + ((Carrera) arr2[0].getHilo().getObj()).getCve() + "\n\n");
                        }
                        ab1.setRaiz(arr2[1]);
                    }
                    CtrlInterfaz.habilita(false, carTextField);
                    CtrlInterfaz.habilita(true, bNuevoButton);
                    System.out.println(ab.enOrden(ab.getRaiz()));
                } else
                {
                    areaDatos.setText("No hay carreras registradas\ncon ese nombre en cualquier institucion");
                    CtrlInterfaz.habilita(false, carTextField);
                    CtrlInterfaz.habilita(true, bNuevoButton);
                    System.out.println(ab.enOrden(ab.getRaiz()));
                }
            } else
            {
                areaDatos.setText("No hay carreras registradas\ncon ese nombre en cualquier institucion");
                CtrlInterfaz.habilita(false, carTextField);
                CtrlInterfaz.habilita(true, bNuevoButton);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(VtnConsultaCN.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnConsultaCN.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnConsultaCN.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnConsultaCN.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnConsultaCN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaDatos;
    private javax.swing.JButton bNuevoButton;
    private javax.swing.JTextField carTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
class FondoPanelg extends JPanel
    {

        private Image imagen;

        @Override
        public void paint(Graphics g)
        {
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondog.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

    class FondoPanelp extends JPanel
    {

        private Image imagen;

        @Override
        public void paint(Graphics g)
        {
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondop.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}