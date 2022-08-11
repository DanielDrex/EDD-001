package academia;

import arbolesylistas.GuardaArchivos;
import arbolesylistas.Multilistas;
import static arbolesylistas.Multilistas.busca;
import arbolesylistas.Nodo;
import arbolesylistas.Reunion;
import cjb.ci.CtrlInterfaz;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ItemEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Daniel Castrejon
 */
public class VtnConsultaR extends javax.swing.JFrame
{

    String label[] = new String[2];
    String label1[] = new String[3];

    /**
     * Creates new form VtnConsultaR
     */
    public VtnConsultaR()
    {
        initComponents();
        actualizarUI();
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

        datosPanel = new FondoPanelp();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detalleR = new javax.swing.JTextArea();
        reunionLabel = new javax.swing.JLabel();
        reuComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        carComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        insComboBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });

        datosPanel.setBackground(new java.awt.Color(51, 204, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DETALLES DE LA REUNIÓN");

        detalleR.setColumns(20);
        detalleR.setFont(new java.awt.Font("Monospaced", 3, 16)); // NOI18N
        detalleR.setRows(5);
        detalleR.setEnabled(false);
        jScrollPane1.setViewportView(detalleR);

        reunionLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        reunionLabel.setForeground(new java.awt.Color(255, 255, 255));
        reunionLabel.setText("Folio de la");

        reuComboBox.setBackground(new java.awt.Color(30, 49, 106));
        reuComboBox.setForeground(new java.awt.Color(30, 49, 106));
        reuComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        reuComboBox.setEnabled(false);
        reuComboBox.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                reuComboBoxItemStateChanged(evt);
            }
        });
        reuComboBox.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                reuComboBoxMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Carrera");

        carComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        carComboBox.setEnabled(false);
        carComboBox.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                carComboBoxItemStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Institucion");

        insComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        insComboBox.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                insComboBoxItemStateChanged(evt);
            }
        });

        jButton1.setText("Atrás");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("reunion");

        javax.swing.GroupLayout datosPanelLayout = new javax.swing.GroupLayout(datosPanel);
        datosPanel.setLayout(datosPanelLayout);
        datosPanelLayout.setHorizontalGroup(
            datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(datosPanelLayout.createSequentialGroup()
                        .addGroup(datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(datosPanelLayout.createSequentialGroup()
                                .addGroup(datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(21, 21, 21))
                            .addGroup(datosPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(insComboBox, 0, 158, Short.MAX_VALUE)
                            .addComponent(carComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reuComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(reunionLabel))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        datosPanelLayout.setVerticalGroup(
            datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(insComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(carComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(reunionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(datosPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(datosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void reuComboBoxMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_reuComboBoxMousePressed
    {//GEN-HEADEREND:event_reuComboBoxMousePressed

    }//GEN-LAST:event_reuComboBoxMousePressed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        VentanaP v = new VentanaP();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void insComboBoxItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_insComboBoxItemStateChanged
    {//GEN-HEADEREND:event_insComboBoxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED)
        {
            if (insComboBox.getSelectedItem().toString().equalsIgnoreCase("Seleccione") || insComboBox.getSelectedItem().toString().equalsIgnoreCase(""))
            {
                carComboBox.removeAllItems();
                carComboBox.addItem("Seleccione");
                CtrlInterfaz.habilita(false, carComboBox);
            } else
            {
                CtrlInterfaz.cambia(carComboBox);
                Nodo aux = Multilistas.busca(VentanaP.raiz, insComboBox.getSelectedItem().toString());
                carComboBox.removeAllItems();
                carComboBox.addItem("Seleccione");
                UpdateUI(aux, UpdateLabel(aux.getEtiqueta()), 0);
            }
        }
    }//GEN-LAST:event_insComboBoxItemStateChanged

    private void carComboBoxItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_carComboBoxItemStateChanged
    {//GEN-HEADEREND:event_carComboBoxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED)
        {
            if (carComboBox.getSelectedItem().toString().equalsIgnoreCase("Seleccione") || carComboBox.getSelectedItem().toString().equalsIgnoreCase(""))
            {
                reuComboBox.removeAllItems();
                reuComboBox.addItem("Seleccione");
                CtrlInterfaz.habilita(false, reuComboBox);
            } else
            {
                CtrlInterfaz.cambia(reuComboBox);
                Nodo aux = Multilistas.busca(VentanaP.raiz, insComboBox.getSelectedItem().toString());
                reuComboBox.removeAllItems();
                reuComboBox.addItem("Seleccione");
                UpdateUI1(VentanaP.raiz, UpdateLabel(aux.getEtiqueta(), carComboBox.getSelectedItem().toString()), 0);
            }
        }
    }//GEN-LAST:event_carComboBoxItemStateChanged

    private void reuComboBoxItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_reuComboBoxItemStateChanged
    {//GEN-HEADEREND:event_reuComboBoxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED)
        {

            detalleR.setText("");
            if (reuComboBox.getSelectedItem().toString().equalsIgnoreCase("Seleccione") || reuComboBox.getSelectedItem().toString().equalsIgnoreCase(""))
            {
                //JOptionPane.showMessageDialog(null, "Seleccione folio de reunion");
            } else
            {
                String etiqueta[] = new String[3];
                etiqueta[0] = insComboBox.getSelectedItem().toString();
                etiqueta[1] = carComboBox.getSelectedItem().toString();
                etiqueta[2] = reuComboBox.getSelectedItem().toString();
                Nodo n1 = buscar(VentanaP.raiz, 0, etiqueta);
                //Nodo ex = buscar(VentanaP.raiz, 0, etiqueta);
                if (n1 != null)
                {
                    Object obj = n1.getObj();
                    dataPanel2(obj);
                }
            }
        }
    }//GEN-LAST:event_reuComboBoxItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        VentanaP v = new VentanaP();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    public void UpdateUI(Nodo raiz, String[] etiqueta, int nivel)
    {
        if (nivel == etiqueta.length - 1)
        {
            Nodo aux = raiz;
            String s = "";
            while (aux != null)
            {
                s = aux.getEtiqueta();
                carComboBox.addItem(s);
                aux = aux.getSig();
            }
        } else
        {
            Nodo aux = busca(raiz, etiqueta[nivel]);
            if (aux == null)
            {
                System.out.println("NO HAY REUNIONES");
            } else
            {
                UpdateUI(aux.getAbj(), etiqueta, nivel + 1);
            }
        }
    }

    public void UpdateUI1(Nodo raiz, String[] etiqueta, int nivel)
    {
        if (nivel == etiqueta.length - 1)
        {
            Nodo aux = raiz;
            String s = "";
            while (aux != null)
            {
                s = aux.getEtiqueta();
                reuComboBox.addItem(s);
                aux = aux.getSig();
            }
        } else
        {
            Nodo aux = busca(raiz, etiqueta[nivel]);
            if (aux == null)
            {
                System.out.println("NO HAY REUNIONES");
            } else
            {
                UpdateUI1(aux.getAbj(), etiqueta, nivel + 1);
            }
        }
//        GuardaArchivos.guardar(raiz, "Multilista.dat");
    }

    public void dataPanel2(Object obj)
    {
        detalleR.setText("FOLIO: " + Integer.toString(((Reunion) obj).getFolioReunion())
                + "\nFECHA: " + ((Reunion) obj).getFecha()
                + "\nMOTIVO: " + ((Reunion) obj).getMotivo());
    }

    public String[] UpdateLabel(String etq)
    {
        label[0] = etq;
        label[1] = "";
        return label;
    }

    public String[] UpdateLabel(String etq, String etq1)
    {
        label1[0] = etq;
        label1[1] = etq1;
        label1[2] = "";
        return label1;
    }

    public String desp0(Nodo raiz, int nivel)
    {
        String s = "";
        if (raiz != null)
        {
            s = raiz.getEtiqueta();
            insComboBox.addItem(s);
            desp0(raiz.getSig(), 0);
        }
        return s;
    }

    public void actualizarUI()
    {
        desp0(VentanaP.raiz, 0);
    }

    public static Nodo buscar(Nodo raiz, int nivel, String[] etiqueta)
    {
        if (nivel == etiqueta.length - 1)
        {
            Nodo aux1 = busca(raiz, etiqueta[nivel]);
            if (aux1 != null)
            {
                System.out.println(aux1.getEtiqueta());
            }
            return aux1;
        } else
        {
            Nodo aux = busca(raiz, etiqueta[nivel]);
            if (aux == null)
            {
                System.out.println("No encontre el dato: " + etiqueta[nivel] + " del nivel " + nivel);
                return raiz;
            } else
            {

                return buscar(aux.getAbj(), nivel + 1, etiqueta);
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
            java.util.logging.Logger.getLogger(VtnConsultaR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnConsultaR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnConsultaR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnConsultaR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnConsultaR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> carComboBox;
    private javax.swing.JPanel datosPanel;
    private javax.swing.JTextArea detalleR;
    private javax.swing.JComboBox<String> insComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> reuComboBox;
    private javax.swing.JLabel reunionLabel;
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
