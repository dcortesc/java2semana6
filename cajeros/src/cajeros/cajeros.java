
import javax.swing.*;

/*
 * Realice un programa formal en Java que simule la interfaz gráfica de un cajero automático. 
Dicha interfaz debe permitir al usuario ingresar la clave de acceso y luego desplegar el menú de opciones, como por ejemplo, 
 * consultar saldo
 * cambio de clave secreta
 * giro de dinero
 * salir del cajero. 
 * 
 * Explique cada línea del código, usando los correspondientes comentarios
 */

/**
 *
 * @author danielcortes
 */
public class cajeros extends javax.swing.JFrame {
    
    //variables a utilizar como botones, etiquetas y campos de texto                 
    private javax.swing.JButton accept;
    private javax.swing.JButton cancel;
    private javax.swing.JButton changePass;
    private javax.swing.JButton checkMoney;
    private javax.swing.JPasswordField confirmNewPass;
    private javax.swing.JButton confirmar;
    private javax.swing.JLabel confirmarNuevaContraseña;
    private javax.swing.JLabel contraseñaAntigua;
    private javax.swing.JButton insertCard;
    private javax.swing.JLabel instruccion;
    private javax.swing.JTextField montoRetiro;
    private javax.swing.JPasswordField newpass;
    private javax.swing.JLabel nombreBanco;
    private javax.swing.JLabel nuevaContraseña;
    private javax.swing.JButton out;
    private javax.swing.JPasswordField pass;
    private javax.swing.JButton takeMoney;
    private javax.swing.JButton volver;
    private int saldo=100000;
    
    
    

    /**
     * creando el constructor de Cajeros
     */
    public cajeros() {
        initComponents();
        instruccion.setText("Para iniciar, inserte su tarjeta de banco");
        pass.setVisible(false);
        cancel.setVisible(false);
        checkMoney.setVisible(false);
        changePass.setVisible(false);
        takeMoney.setVisible(false);
        out.setVisible(false);
        newpass.setVisible(false);
        contraseñaAntigua.setVisible(false);
        nuevaContraseña.setVisible(false);
        confirmNewPass.setVisible(false);
        confirmarNuevaContraseña.setVisible(false);
        confirmar.setVisible(false);
        volver.setVisible(false);
        montoRetiro.setVisible(false);
        accept.setVisible(false);
        
    }

    /**
     * este metodo se llama desde el constructor para inicializar el formulario. 
     */
    
    private void initComponents() {
        nombreBanco = new javax.swing.JLabel();
        instruccion = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        accept = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        checkMoney = new javax.swing.JButton();
        changePass = new javax.swing.JButton();
        takeMoney = new javax.swing.JButton();
        out = new javax.swing.JButton();
        newpass = new javax.swing.JPasswordField();
        contraseñaAntigua = new javax.swing.JLabel();
        nuevaContraseña = new javax.swing.JLabel();
        confirmNewPass = new javax.swing.JPasswordField();
        confirmarNuevaContraseña = new javax.swing.JLabel();
        confirmar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        montoRetiro = new javax.swing.JTextField();
        insertCard = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombreBanco.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        nombreBanco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreBanco.setText("BANCO IACC");

        instruccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instruccion.setText("Ingrese su contraseña");

        pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });

        accept.setText("Aceptar");
        accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptActionPerformed(evt);
            }
        });

        cancel.setText("Cancelar");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        checkMoney.setText("Consultar Saldo");
        checkMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMoneyActionPerformed(evt);
            }
        });

        changePass.setText("Cambio de Clave");
        changePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePassActionPerformed(evt);
            }
        });

        takeMoney.setText("Giro de Dinero");
        takeMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takeMoneyActionPerformed(evt);
            }
        });

        out.setText("Salir");
        out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outActionPerformed(evt);
            }
        });

        newpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        contraseñaAntigua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contraseñaAntigua.setText("Antigua Contraseña");

        nuevaContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nuevaContraseña.setText("Nueva contraseña");

        confirmNewPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        confirmarNuevaContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirmarNuevaContraseña.setText("Reconfirme nueva contraseña");

        confirmar.setText("Confirmar");

        volver.setText("Volver Principal");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        montoRetiro.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        insertCard.setText("Inserte su tarjeta de Cajero->");
        insertCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertCardActionPerformed(evt);
            }
        });

        /* estos comandos vienen desde el constructor de netbeams al crear el JFrame en el IDE. 
         * Esta serie de constructores ayudan en la compilacion asi como tambien a crear el constructor de forma automatica para el formulario y tambien los inicializadores. 
         */
        
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insertCard, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(montoRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nombreBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(newpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(contraseñaAntigua)
                                .addComponent(nuevaContraseña)
                                .addComponent(confirmNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(confirmarNuevaContraseña)
                                .addComponent(instruccion, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(confirmar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(accept, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkMoney, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(changePass, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(volver, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cancel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(takeMoney, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(out, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(17, 17, 17))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {confirmNewPass, confirmarNuevaContraseña, contraseñaAntigua, instruccion, newpass, nombreBanco, nuevaContraseña, pass});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {accept, cancel, changePass, checkMoney, confirmar, takeMoney});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {out, volver});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(nombreBanco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instruccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraseñaAntigua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nuevaContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmarNuevaContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(montoRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmar)
                    .addComponent(cancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(volver)
                    .addComponent(accept))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(out)
                    .addComponent(checkMoney))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(takeMoney)
                    .addComponent(changePass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(insertCard))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {accept, cancel, changePass, checkMoney, confirmar, out, takeMoney, volver});

        pack();
    }                  

    // esta es la configuracion de cada boton. 
    // se hace referencia a los Action Event del awt
    // desde aqui, se genera un void por cada boton. 
    // se trabaja en un solo formulario, ocultando JButton de acuerdo al sector consultado en el cajero como tambien en cambiar el texto de la variable "Instruccion". 
    
    private void acceptActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
        instruccion.setText("Seleccione una opcion del menu");
        checkMoney.setVisible(true);
        changePass.setVisible(true);
        takeMoney.setVisible(true);
        out.setVisible(true);
        accept.setVisible(false);
        pass.setVisible(false);

 
    }                                      

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
    }                                      

    private void checkMoneyActionPerformed(java.awt.event.ActionEvent evt) {                                           
        instruccion.setText("Su saldo actual es de "+saldo);
        changePass.setVisible(false);
        takeMoney.setVisible(false);
        checkMoney.setVisible(false);
        out.setVisible(false);
        volver.setVisible(true);
        
    }                                          

    private void passActionPerformed(java.awt.event.ActionEvent evt) {                                     
        
    }                                    

    private void changePassActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        instruccion.setText("Ingrese su clave de cajero actual");
        changePass.setVisible(false);
        takeMoney.setVisible(false);
        checkMoney.setVisible(false);
        out.setVisible(false);
        volver.setVisible(true);
        pass.setVisible(true);
        newpass.setVisible(true);
        confirmNewPass.setVisible(true);
        contraseñaAntigua.setVisible(true);
        nuevaContraseña.setVisible(true);
        confirmarNuevaContraseña.setVisible(true);
    }                                          

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
        instruccion.setText("Por favor seleccione una opción");
        changePass.setVisible(true);
        takeMoney.setVisible(true);
        checkMoney.setVisible(true);
        out.setVisible(true);
        volver.setVisible(false);
        pass.setVisible(false);
        newpass.setVisible(false);
        confirmNewPass.setVisible(false);
        contraseñaAntigua.setVisible(false);
        nuevaContraseña.setVisible(false);
        confirmarNuevaContraseña.setVisible(false);
        montoRetiro.setVisible(false);
        
    }                                      

    private void outActionPerformed(java.awt.event.ActionEvent evt) {                                    
        
        nombreBanco.setText("Gracias por preferir Banco IACC");
        nombreBanco.setVisible(true);
        instruccion.setText("Por favor retire su tarjeta de cajero");
        instruccion.setVisible(true);
        cancel.setVisible(false);
        checkMoney.setVisible(false);
        changePass.setVisible(false);
        takeMoney.setVisible(false);
        out.setVisible(false);
        newpass.setVisible(false);
        contraseñaAntigua.setVisible(false);
        nuevaContraseña.setVisible(false);
        confirmNewPass.setVisible(false);
        confirmarNuevaContraseña.setVisible(false);
        confirmar.setVisible(false);
        volver.setVisible(false);
        montoRetiro.setVisible(false);
        insertCard.setVisible(true);
    }                                   

    private void takeMoneyActionPerformed(java.awt.event.ActionEvent evt) {  
        
        instruccion.setText("Por favor ingrese el monto a retirar");
        checkMoney.setVisible(false);
        changePass.setVisible(false);
        takeMoney.setVisible(false);
        montoRetiro.setVisible(true);
        out.setVisible(false);
        volver.setVisible(true);
    }                                         

    private void insertCardActionPerformed(java.awt.event.ActionEvent evt) {                                           
       
        instruccion.setText("Ingrese su contraseña");
        instruccion.setVisible(true);
        pass.setVisible(true);
        insertCard.setVisible(false);
        accept.setVisible(true);
        pass.setText("");
        
    }                                          

    public static void main(String args[]) {
        
        /* metodo main carga mediante 
         * desde aqui se genera un creador dinamico de JButton y JTextField  
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* crear y mostrar el formulario */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cajeros().setVisible(true);
            }
        });
    }

    

}