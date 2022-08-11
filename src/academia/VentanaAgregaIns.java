package academia;

import static academia.VentanaP.buscar;
import arbolesylistas.Institucion;
import arbolesylistas.Multilistas;
import arbolesylistas.Nodo;
import cjb.ci.CtrlInterfaz;
import cjb.ci.Validaciones;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Daniel Castrejon
 */
public class VentanaAgregaIns extends javax.swing.JFrame
{

    /**
     * Creates new form VentanaAgregaIns
     */
    public VentanaAgregaIns()
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

        datosPanel = new FondoPanelp();
        agregarButton = new javax.swing.JButton();
        dirLabel = new javax.swing.JLabel();
        dirTextField = new javax.swing.JTextField();
        cveInstitucionLabel = new javax.swing.JLabel();
        cveTextField = new javax.swing.JTextField();
        nombreLabel = new javax.swing.JLabel();
        nomTextField = new javax.swing.JTextField();
        telLabel = new javax.swing.JLabel();
        telTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        atrasButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro Institucion");
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosed(java.awt.event.WindowEvent evt)
            {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });

        datosPanel.setBackground(new java.awt.Color(30, 49, 106));
        datosPanel.setEnabled(false);

        agregarButton.setBackground(new java.awt.Color(255, 255, 255));
        agregarButton.setText("Agregar");
        agregarButton.setEnabled(false);
        agregarButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                agregarButtonActionPerformed(evt);
            }
        });
        agregarButton.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                agregarButtonKeyPressed(evt);
            }
        });

        dirLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dirLabel.setForeground(new java.awt.Color(255, 255, 255));
        dirLabel.setText("Director");

        dirTextField.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                dirTextFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                dirTextFieldKeyTyped(evt);
            }
        });

        cveInstitucionLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cveInstitucionLabel.setForeground(new java.awt.Color(255, 255, 255));
        cveInstitucionLabel.setText("Clave de la");

        cveTextField.setEnabled(false);
        cveTextField.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                cveTextFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                cveTextFieldKeyTyped(evt);
            }
        });

        nombreLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nombreLabel.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel.setText("Nombre de la ");

        nomTextField.setEnabled(false);
        nomTextField.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                nomTextFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                nomTextFieldKeyTyped(evt);
            }
        });

        telLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        telLabel.setForeground(new java.awt.Color(255, 255, 255));
        telLabel.setText("Telefono");

        telTextField.setEnabled(false);
        telTextField.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                telTextFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                telTextFieldKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("AGREGAR INSTITUCIÓN");

        atrasButton.setText("Atras");
        atrasButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                atrasButtonActionPerformed(evt);
            }
        });
        atrasButton.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                atrasButtonKeyPressed(evt);
            }
        });

        jButton1.setText("Borrar todo");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("institucion");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("institucion");

        javax.swing.GroupLayout datosPanelLayout = new javax.swing.GroupLayout(datosPanel);
        datosPanel.setLayout(datosPanelLayout);
        datosPanelLayout.setHorizontalGroup(
            datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, datosPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, datosPanelLayout.createSequentialGroup()
                        .addGroup(datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cveInstitucionLabel)
                            .addComponent(nombreLabel)
                            .addGroup(datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(atrasButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(dirLabel)
                            .addComponent(telLabel)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(datosPanelLayout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(agregarButton))
                            .addComponent(cveTextField)
                            .addComponent(telTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dirTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        datosPanelLayout.setVerticalGroup(
            datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(21, 21, 21)
                .addGroup(datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dirLabel)
                    .addComponent(dirTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datosPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(cveTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(datosPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(cveInstitucionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addGroup(datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datosPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(nomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(datosPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(nombreLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addGap(32, 32, 32)
                .addGroup(datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telLabel)
                    .addComponent(telTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarButton)
                    .addComponent(atrasButton)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(datosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(datosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void agregarButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_agregarButtonActionPerformed
    {//GEN-HEADEREND:event_agregarButtonActionPerformed
        try
        {

            Object objInst = new Institucion(dirTextField.getText(), Integer.parseInt(cveTextField.getText()), nomTextField.getText(), Long.parseLong(telTextField.getText()));
            Nodo p = new Nodo(objInst, nomTextField.getText());
            String etiqueta[] = new String[1];
            etiqueta[0] = nomTextField.getText();
            Nodo n1 = buscar(VentanaP.raiz, 0, etiqueta);
            //Nodo ex = buscar(VentanaP.raiz, 0, etiqueta);
            if (n1 != null)
            {
                if (n1.getEtiqueta().equalsIgnoreCase(p.getEtiqueta()))
                {
                    JOptionPane.showMessageDialog(null, "Registro No realizado\nInstitucion ya resgistrada con el mismo nombre");
                    CtrlInterfaz.cambia(nomTextField);
                    CtrlInterfaz.habilita(false, agregarButton);
                } else
                {
                    JOptionPane.showMessageDialog(null, "Institución agregada");
                    VentanaP.raiz = Multilistas.insertar(VentanaP.raiz, p, 0, etiqueta, null);
                    dirTextField.setText("");
                    CtrlInterfaz.habilita(false, cveTextField);
                    cveTextField.setText("");
                    CtrlInterfaz.habilita(false, nomTextField);
                    nomTextField.setText("");
                    telTextField.setText("");
                    CtrlInterfaz.habilita(false, telTextField);
                    CtrlInterfaz.cambia(dirTextField);
                    CtrlInterfaz.habilita(false, agregarButton);
                }
            } else
            {
                JOptionPane.showMessageDialog(null, "Institución agregada");
                VentanaP.raiz = Multilistas.insertar(VentanaP.raiz, p, 0, etiqueta, null);
                dirTextField.setText("");
                CtrlInterfaz.habilita(false, cveTextField);
                cveTextField.setText("");
                CtrlInterfaz.habilita(false, nomTextField);
                nomTextField.setText("");
                telTextField.setText("");
                CtrlInterfaz.habilita(false, telTextField);
                CtrlInterfaz.cambia(dirTextField);
                CtrlInterfaz.habilita(false, agregarButton);
            }

        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, " Error !!!\n" + " Intente de nuevo");
        }
    }//GEN-LAST:event_agregarButtonActionPerformed

    private void agregarButtonKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_agregarButtonKeyPressed
    {//GEN-HEADEREND:event_agregarButtonKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            agregarButtonActionPerformed(null);
        }
    }//GEN-LAST:event_agregarButtonKeyPressed

    private void atrasButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_atrasButtonActionPerformed
    {//GEN-HEADEREND:event_atrasButtonActionPerformed
        VentanaP v = new VentanaP();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_atrasButtonActionPerformed

    private void atrasButtonKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_atrasButtonKeyPressed
    {//GEN-HEADEREND:event_atrasButtonKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            atrasButtonActionPerformed(null);
        }
    }//GEN-LAST:event_atrasButtonKeyPressed

    private void dirTextFieldKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_dirTextFieldKeyPressed
    {//GEN-HEADEREND:event_dirTextFieldKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            if (validarCVacio(dirTextField))
            {
                if (validaEspacio(dirTextField))
                {
                    CtrlInterfaz.habilita(false, dirTextField);
                    CtrlInterfaz.cambia(cveTextField);
                } else
                {
                    dirTextField.requestFocus();
                }
            } else
            {
                JOptionPane.showMessageDialog(this, "No puede dejar este campo vacio", "ATENCION", JOptionPane.WARNING_MESSAGE);
                dirTextField.requestFocus();
            }
        }
    }//GEN-LAST:event_dirTextFieldKeyPressed

    private void cveTextFieldKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cveTextFieldKeyTyped
    {//GEN-HEADEREND:event_cveTextFieldKeyTyped
        Validaciones.validaEntero(evt, 7, cveTextField.getText());
    }//GEN-LAST:event_cveTextFieldKeyTyped

    private void telTextFieldKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_telTextFieldKeyTyped
    {//GEN-HEADEREND:event_telTextFieldKeyTyped
        Validaciones.validaEntero(evt, 10, telTextField.getText());
    }//GEN-LAST:event_telTextFieldKeyTyped

    private void cveTextFieldKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cveTextFieldKeyPressed
    {//GEN-HEADEREND:event_cveTextFieldKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            if (validarCVacio(cveTextField))
            {
                if (validarTel(7, cveTextField))
                {
                    CtrlInterfaz.habilita(false, cveTextField);
                    CtrlInterfaz.cambia(nomTextField);
                } else
                {
                    JOptionPane.showMessageDialog(this, "¡Error! \nLa clave debe contener 7 digitos", "ATENCION", JOptionPane.WARNING_MESSAGE);
                }
            } else
            {
                JOptionPane.showMessageDialog(this, "No puede dejar este campo vacio", "ATENCION", JOptionPane.WARNING_MESSAGE);
                cveTextField.requestFocus();
            }
        }
    }//GEN-LAST:event_cveTextFieldKeyPressed

    private void dirTextFieldKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_dirTextFieldKeyTyped
    {//GEN-HEADEREND:event_dirTextFieldKeyTyped
        Validaciones.validaAlfabeticos(evt);
    }//GEN-LAST:event_dirTextFieldKeyTyped

    private void nomTextFieldKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_nomTextFieldKeyPressed
    {//GEN-HEADEREND:event_nomTextFieldKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            if (validarCVacio(nomTextField))
            {
                if (validaEspacio(nomTextField))
                {
                    CtrlInterfaz.habilita(false, nomTextField);
                    CtrlInterfaz.cambia(telTextField);
                } else
                {
                    nomTextField.requestFocus();
                }
            } else
            {
                JOptionPane.showMessageDialog(this, "No puede dejar este campo vacio", "ATENCION", JOptionPane.WARNING_MESSAGE);
                nomTextField.requestFocus();
            }
        }
    }//GEN-LAST:event_nomTextFieldKeyPressed

    private void nomTextFieldKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_nomTextFieldKeyTyped
    {//GEN-HEADEREND:event_nomTextFieldKeyTyped
        Validaciones.validaAlfabeticos(evt);
    }//GEN-LAST:event_nomTextFieldKeyTyped

    private void telTextFieldKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_telTextFieldKeyPressed
    {//GEN-HEADEREND:event_telTextFieldKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            if (validarCVacio(telTextField))
            {
                if (validarTel(10, telTextField))
                {
                    int opc = JOptionPane.showConfirmDialog(this, "¿ Desea realizar modificaciones a los datos ?", "ATENCION", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (opc == JOptionPane.NO_OPTION)
                    {
                        CtrlInterfaz.cambia(agregarButton);
                        CtrlInterfaz.habilita(false, telTextField);
                    } else
                    {
                        CtrlInterfaz.cambia(dirTextField);
                        CtrlInterfaz.habilita(false, telTextField);
                    }
                } else
                {
                    JOptionPane.showMessageDialog(this, "¡Error! \nEl número de telefono debe contener 10 digitos", "ATENCION", JOptionPane.WARNING_MESSAGE);
                }
            } else
            {
                JOptionPane.showMessageDialog(this, "No puede dejar este campo vacio", "ATENCION", JOptionPane.WARNING_MESSAGE);
                telTextField.requestFocus();
            }
        }
    }//GEN-LAST:event_telTextFieldKeyPressed

    private void formWindowClosed(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosed
    {//GEN-HEADEREND:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        VentanaP v = new VentanaP();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        dirTextField.setText("");
        CtrlInterfaz.cambia(dirTextField);
        dirTextField.requestFocus();
        CtrlInterfaz.habilita(false, cveTextField);
        cveTextField.setText("");
        CtrlInterfaz.habilita(false, nomTextField);
        nomTextField.setText("");
        CtrlInterfaz.habilita(false, telTextField);
        CtrlInterfaz.habilita(false, agregarButton);
        telTextField.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

//    public void habilitar(JTextField textfield, java.awt.event.KeyEvent evt, JTextField textfield1)
//    {
//        if (evt.getKeyChar() == '\n' && validarCVacio(textfield1))
//        {
//            textfield.setEnabled(true);
//            textfield.requestFocus();
//        }
//    }
//
//    public void habilitarButton(java.awt.event.KeyEvent evt, JButton jbutton, JTextField textfield)
//    {
//        if (evt.getKeyChar() == '\n' && validarCVacio(textfield))
//        {
//            jbutton.setEnabled(true);
//            jbutton.requestFocus();
//        }
//    }
//
//    public void validarInt(java.awt.event.KeyEvent evt)
//    {
//        char caracter = evt.getKeyChar();
//        // Verificar si la tecla pulsada no es un digito
//        if (((caracter < '0')
//                || (caracter > '9'))
//                && (caracter != '\b' /*corresponde a BACK_SPACE*/))
//        {
//            evt.consume();  // ignorar el evento de teclado
//        }
//    }
//
//    public void validarStr(java.awt.event.KeyEvent evt)
//    {
//        char caracter = evt.getKeyChar();
//        // Verificar si la tecla pulsada no es un digito
//        if (!Character.isLetter(caracter))
//        {
//            evt.consume();  // ignorar el evento de teclado
//        }
//
//    }
    public boolean validarCVacio(JTextField textField)
    {
        if (textField.getText().isEmpty())
        {
            return false;
        } else
        {
            return true;
        }
    }

    public boolean validarTel(int len, JTextField textField)
    {
        if (textField.getText().length() < len)
        {
            return false;
        } else
        {
            return true;
        }
    }

    public boolean validaEspacio(JTextField jtextfield)
    {
        char arr[] = jtextfield.getText().toCharArray();
        int cont = -1;
        char b = ' ';
        int i = 0;
        if (jtextfield.getText().charAt(0) == b)
        {
            JOptionPane.showMessageDialog(this, "No puede inicar con espacio o dejar solo el espacio", "ATENCION", JOptionPane.WARNING_MESSAGE);
            return false;
        } else
        {
            do
            {
                if (arr[i] == b)
                {
                    cont += 1;
                    if (i == arr.length - 1)
                    {
                        if (arr[i] == b)
                        {
                            JOptionPane.showMessageDialog(this, "No puede terminar con un espacio", "ATENCION", JOptionPane.WARNING_MESSAGE);
                            return false;
                        }
                    }
                    if (cont == 1)
                    {
                        JOptionPane.showMessageDialog(this, "No puede tener mas de 1 espacio antes de otra palabra", "ATENCION", JOptionPane.WARNING_MESSAGE);
                        return false;
                    }
                } else
                {
                    cont = -1;
                }
                i++;
            } while (i < arr.length);
            return true;
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
                if ("Windows".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(VentanaAgregaIns.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VentanaAgregaIns.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VentanaAgregaIns.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VentanaAgregaIns.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VentanaAgregaIns().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarButton;
    private javax.swing.JButton atrasButton;
    private javax.swing.JLabel cveInstitucionLabel;
    private javax.swing.JTextField cveTextField;
    private javax.swing.JPanel datosPanel;
    private javax.swing.JLabel dirLabel;
    private javax.swing.JTextField dirTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nomTextField;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel telLabel;
    private javax.swing.JTextField telTextField;
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