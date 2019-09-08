/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author javie
 */
public class frameInicio extends javax.swing.JFrame {

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/logoGH600 TRAZADO.jpg"));
        return retValue;
    }
    
    /**
     * Creates new form frminicio
     */
    public frameInicio() {
        initComponents();
        this.setExtendedState(frameInicio.MAXIMIZED_BOTH);
        this.setTitle("Gestor Hotelero");
    }

    /**
     * This method is called from within the constructor to init.ialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        lbnombre = new javax.swing.JLabel();
        lbprimer_apellido = new javax.swing.JLabel();
        lbsegundo_apellido = new javax.swing.JLabel();
        lbacceso = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbidpersona = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelfondo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuarchivo = new javax.swing.JMenu();
        itemhabitaciones = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        itemreservas = new javax.swing.JMenuItem();
        itemclientes = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuconfiguraciones = new javax.swing.JMenu();
        itemusuarios = new javax.swing.JMenuItem();
        itemc = new javax.swing.JMenu();
        itemCorreo = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        itemsalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        escritorio.setBackground(new java.awt.Color(0, 0, 0));

        lbnombre.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lbnombre.setForeground(new java.awt.Color(255, 255, 255));
        lbnombre.setText("Nombre");
        escritorio.add(lbnombre);
        lbnombre.setBounds(170, 150, 110, 15);

        lbprimer_apellido.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lbprimer_apellido.setForeground(new java.awt.Color(255, 255, 255));
        lbprimer_apellido.setText("Primer apellido");
        escritorio.add(lbprimer_apellido);
        lbprimer_apellido.setBounds(170, 170, 50, 15);

        lbsegundo_apellido.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lbsegundo_apellido.setForeground(new java.awt.Color(255, 255, 255));
        lbsegundo_apellido.setText("Segundo apellido");
        escritorio.add(lbsegundo_apellido);
        lbsegundo_apellido.setBounds(210, 170, 90, 15);

        lbacceso.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lbacceso.setForeground(new java.awt.Color(255, 255, 255));
        lbacceso.setText("Categoria");
        escritorio.add(lbacceso);
        lbacceso.setBounds(170, 190, 110, 15);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID:");
        escritorio.add(jLabel1);
        jLabel1.setBounds(30, 130, 70, 15);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        escritorio.add(jLabel2);
        jLabel2.setBounds(30, 150, 70, 15);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellidos:");
        escritorio.add(jLabel3);
        jLabel3.setBounds(30, 170, 80, 15);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Categoria:");
        escritorio.add(jLabel4);
        jLabel4.setBounds(30, 190, 80, 15);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sesión iniciada por:");
        escritorio.add(jLabel5);
        jLabel5.setBounds(30, 80, 180, 40);

        lbidpersona.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lbidpersona.setForeground(new java.awt.Color(255, 255, 255));
        lbidpersona.setText("Id");
        escritorio.add(lbidpersona);
        lbidpersona.setBounds(170, 130, 110, 15);

        jLabel8.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Bienvenid@");
        escritorio.add(jLabel8);
        jLabel8.setBounds(30, 30, 210, 50);

        labelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo azul.jpg"))); // NOI18N
        labelfondo.setText("jLabel5");
        escritorio.add(labelfondo);
        labelfondo.setBounds(4, 5, 1340, 680);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        jLabel6.setText("Sesión iniciada por:");
        escritorio.add(jLabel6);
        jLabel6.setBounds(30, 80, 180, 40);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        jLabel7.setText("Sesión iniciada por:");
        escritorio.add(jLabel7);
        jLabel7.setBounds(30, 80, 180, 40);

        menuarchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/itemhabitacinesproductos32.png"))); // NOI18N
        menuarchivo.setMnemonic('e');
        menuarchivo.setText("Habitaciones");

        itemhabitaciones.setMnemonic('t');
        itemhabitaciones.setText("Habitaciones");
        itemhabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemhabitacionesActionPerformed(evt);
            }
        });
        menuarchivo.add(itemhabitaciones);

        menuBar.add(menuarchivo);

        helpMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/itemreservas.png"))); // NOI18N
        helpMenu.setMnemonic('h');
        helpMenu.setText("Reservas");

        itemreservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/itemreservasyconsumos2.png"))); // NOI18N
        itemreservas.setMnemonic('c');
        itemreservas.setText("Reservas y Consumos");
        itemreservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemreservasActionPerformed(evt);
            }
        });
        helpMenu.add(itemreservas);

        itemclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/itemclientes.png"))); // NOI18N
        itemclientes.setMnemonic('a');
        itemclientes.setText("Clientes");
        itemclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemclientesActionPerformed(evt);
            }
        });
        helpMenu.add(itemclientes);

        menuBar.add(helpMenu);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/itemproductos.png"))); // NOI18N
        jMenu1.setText("Productos");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/itemproductos24.png"))); // NOI18N
        jMenuItem1.setText("Agregar/Modificar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        menuBar.add(jMenu1);

        menuconfiguraciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/itemempleado.png"))); // NOI18N
        menuconfiguraciones.setText("Conf. internas");

        itemusuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/userslogin32.png"))); // NOI18N
        itemusuarios.setText("Usuarios y Accesos");
        itemusuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemusuariosActionPerformed(evt);
            }
        });
        menuconfiguraciones.add(itemusuarios);

        menuBar.add(menuconfiguraciones);

        itemc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/email.png"))); // NOI18N
        itemc.setText("Correo");
        itemc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemcActionPerformed(evt);
            }
        });

        itemCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/enviarEmail.png"))); // NOI18N
        itemCorreo.setText("Enviar email");
        itemCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCorreoActionPerformed(evt);
            }
        });
        itemc.add(itemCorreo);

        menuBar.add(itemc);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/itemhelp32.png"))); // NOI18N
        jMenu4.setText("Ayuda");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/itemacercade24.png"))); // NOI18N
        jMenuItem3.setText("Ayuda Contenidos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        menuBar.add(jMenu4);

        itemsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/itemexit32.png"))); // NOI18N
        itemsalir.setText("Salir");
        itemsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemsalirMouseClicked(evt);
            }
        });
        menuBar.add(itemsalir);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 1349, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemhabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemhabitacionesActionPerformed
        frameHabitacion form = new frameHabitacion();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_itemhabitacionesActionPerformed

    private void itemreservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemreservasActionPerformed
        frameReserva form = new frameReserva();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
        frameReserva.txtidtrabajador.setText(lbidpersona.getText());
        frameReserva.txttrabajador.setText(lbnombre.getText()+ " " + lbprimer_apellido.getText());
        frameReserva.idusuario=Integer.parseInt(lbidpersona.getText());
    }//GEN-LAST:event_itemreservasActionPerformed

    private void itemusuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemusuariosActionPerformed
        frameTrabajador form = new frameTrabajador();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_itemusuariosActionPerformed

    private void itemsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemsalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_itemsalirMouseClicked

    private void itemclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemclientesActionPerformed
        frameCliente form = new frameCliente();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_itemclientesActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
       /* frameProducto form = new frameProducto();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);*/
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        frameProducto form = new frameProducto();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        String msg="<html><b>Proyecto final de ciclo<br> "
                + "Javier Lorca Rubio</b><br>"
                +"  <br>"
                +"Aplicación para Windows en la que puedes gestionar<br>"
                +"los empleados, clientes, habitaciones y reservas de <br>"
                +"tu hotel.<br>"
                +" <br>"
                +"<b>Puntos que se pueden mejorar:</b><br>"
                +"·Lectura de correos electrónicos de los clientes desde<br>"
                +" la misma aplicación.<br>"
                +"·Crear una página web y una APP movil para realizar reservas.<br>"
                +"·Añadir opciones de 'Desayuno', 'Media pension' o 'Pension completa<br>"
                +" para los clientes.<br>"
                +"Hay que tener en cuenta que es una aplicacion que se<br>"
                +"podría modificar, mejorar y añadir cosas nuevas constatemente.<br>"
                + "</html>";
        JOptionPane optionpane=new JOptionPane();
        optionpane.setMessage(msg);
        optionpane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionpane.createDialog(null,"Gestión Hotelera");
        dialog.setVisible(true);


//JOptionPane.showMessageDialog(null, "Aplicación hotelera para el alquiler de habitaciones, consumo de productos y administración de clientes y personal del hotel");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void itemcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemcActionPerformed
        
    }//GEN-LAST:event_itemcActionPerformed

    private void itemCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCorreoActionPerformed
        frameEnviarEmail form = new frameEnviarEmail();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_itemCorreoActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4ActionPerformed

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
            java.util.logging.Logger.getLogger(frameInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem itemCorreo;
    private javax.swing.JMenu itemc;
    private javax.swing.JMenuItem itemclientes;
    private javax.swing.JMenuItem itemhabitaciones;
    private javax.swing.JMenuItem itemreservas;
    private javax.swing.JMenu itemsalir;
    private javax.swing.JMenuItem itemusuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JLabel labelfondo;
    public static javax.swing.JLabel lbacceso;
    public static javax.swing.JLabel lbidpersona;
    public static javax.swing.JLabel lbnombre;
    public static javax.swing.JLabel lbprimer_apellido;
    public static javax.swing.JLabel lbsegundo_apellido;
    private javax.swing.JMenuBar menuBar;
    public static javax.swing.JMenu menuarchivo;
    public static javax.swing.JMenu menuconfiguraciones;
    // End of variables declaration//GEN-END:variables

}