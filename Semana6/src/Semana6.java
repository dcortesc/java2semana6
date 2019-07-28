
import java.sql.*;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author danielcortes
 */
public class Semana6 extends javax.swing.JFrame {
    public static final String URL="jdbc:mysql://localhost:3306/semana6?autoReconnet=true&useSSL=false";
    public static final String usuario="root";
    public static final String contraseña="martin07081988";
    PreparedStatement ps, pt, pu, pv, pw, px,py;
    ResultSet rs,rt,ru,rv,rw,rx;
    
    
    public Semana6() {
        initComponents();
        cargaDatos();
        panelAgregarExcursion.setVisible(false);
        panelIdioma.setVisible(false);
        
        
    }

    public Connection getConnection(){
        Connection conexion =null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion=(Connection)DriverManager.getConnection(URL,usuario,contraseña);
        }catch(Exception ex){
            System.err.println("Error, "+ex);
        }
        return conexion;
    }
    
    private void cargaDatos(){
        Connection conexion = null;
        try{
            //insertar destinos
            conexion=getConnection();
            ps=conexion.prepareStatement("insert into DESTINO (dst_nom,dst_hrs, dst_ciu) values ('Torres del Paine','08:00','Puerto Natales')");
            pt=conexion.prepareStatement("insert into DESTINO (dst_nom,dst_hrs, dst_ciu) values ('Cueva del Milodon','10:00','Puerto Natales')");
            pu=conexion.prepareStatement("insert into DESTINO (dst_nom,dst_hrs, dst_ciu) values ('Glaciar Balmaceda','08:00','Puerto Natales')");
            pv=conexion.prepareStatement("insert into DESTINO (dst_nom,dst_hrs, dst_ciu) values ('Glaciar Perito Moreno','08:00','El Calafate')");

            int resultado= ps.executeUpdate();
            int resultado2= pt.executeUpdate();
            int resultado3= pu.executeUpdate();
            int resultado4= pv.executeUpdate();
            
            //insertar guias
            ps=conexion.prepareStatement("insert into GUIA (gui_nom,gui_dir,gui_tel,gui_edd,gui_eml) values ('Daniel Cortés','Juan Mc Lean 414','12345567','30','daniel@icloud.com')");
            pt=conexion.prepareStatement("insert into GUIA (gui_nom,gui_dir,gui_tel,gui_edd,gui_eml) values ('Mauricio Cortés','Esmeralda 1204','24353656','25','mauricio@icloud.com')");
            pu=conexion.prepareStatement("insert into GUIA (gui_nom,gui_dir,gui_tel,gui_edd,gui_eml) values ('Martin Cortés','Guacolda 1426','435345345','20','martin@icloud.com')");
            pv=conexion.prepareStatement("insert into GUIA (gui_nom,gui_dir,gui_tel,gui_edd,gui_eml) values ('Lorena Bravo','Barros Arana 166','43536767','29','lorena@icloud.com')");

            int resultado5= ps.executeUpdate();
            int resultado6= pt.executeUpdate();
            int resultado7= pu.executeUpdate();
            int resultado8= pv.executeUpdate();
            
            
            //insertar idiomas
            ps=conexion.prepareStatement("insert into IDIOMA (idm_nom) values ('Español')");
            pt=conexion.prepareStatement("insert into IDIOMA (idm_nom) values ('Ingles')");
            pu=conexion.prepareStatement("insert into IDIOMA (idm_nom) values ('Frances')");
            pv=conexion.prepareStatement("insert into IDIOMA (idm_nom) values ('Aleman')");
            pw=conexion.prepareStatement("insert into IDIOMA (idm_nom) values ('Portugués')");

            int resultado9= ps.executeUpdate();
            int resultado10= pt.executeUpdate();
            int resultado11= pu.executeUpdate();
            int resultado12= pv.executeUpdate();
            int resultado13= pw.executeUpdate();
            
            
            //cargar excursiones
            ps=conexion.prepareStatement("insert into EXCURSION (dst_id,gui_id,exc_cst,exc_fec) values ('2','3','25000','2019-2-16')");
            pt=conexion.prepareStatement("insert into EXCURSION (dst_id,gui_id,exc_cst,exc_fec) values ('3','2','30000','2019-4-20')");
            pu=conexion.prepareStatement("insert into EXCURSION (dst_id,gui_id,exc_cst,exc_fec) values ('3','4','90000','2020-2-19')");
            pv=conexion.prepareStatement("insert into EXCURSION (dst_id,gui_id,exc_cst,exc_fec) values ('2','2','40000','2019-3-15')");
            pw=conexion.prepareStatement("insert into EXCURSION (dst_id,gui_id,exc_cst,exc_fec) values ('2','1','70000','2012-5-15')");
            px=conexion.prepareStatement("insert into EXCURSION (dst_id,gui_id,exc_cst,exc_fec) values ('3','2','20000','2018-3-23')");
            py=conexion.prepareStatement("insert into EXCURSION (dst_id,gui_id,exc_cst,exc_fec) values ('1','3','18000','1988-8-7')");
            
            int resultado14= ps.executeUpdate();
            int resultado15= pt.executeUpdate();
            int resultado16= pu.executeUpdate();
            int resultado17= pv.executeUpdate();
            int resultado18= pw.executeUpdate();
            int resultado19= px.executeUpdate();
            int resultado20= py.executeUpdate();
            
            //cargar guias_idioma
            
            
            
            conexion.close();            
            
            if(resultado>0&&resultado2>0&&resultado3>0&&resultado4>0&&resultado5>0&&resultado6>0&&resultado7>0&&resultado8>0&&resultado9>0&&resultado10>0&&resultado11>0&&resultado12>0&&resultado13>0&&resultado14>0&&resultado15>0&&resultado16>0&&resultado17>0&&resultado18>0&&resultado19>0&&resultado20>0){
                JOptionPane.showMessageDialog(null, "Registros de Destinos Agregados");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo ingresar el registro");
            }
            
        } catch (Exception ex){
            System.err.println("Error"+ex);
        }
        
        
    }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        consultarDestinos = new javax.swing.JButton();
        consultarExcId = new javax.swing.JToggleButton();
        exc_id_busqueda = new javax.swing.JTextField();
        panelAgregarExcursion = new javax.swing.JPanel();
        exc_dst_id = new javax.swing.JTextField();
        exc_gui_id = new javax.swing.JTextField();
        exc_exc_cst = new javax.swing.JTextField();
        exc_exc_fec = new javax.swing.JTextField();
        hide_add_exc = new javax.swing.JToggleButton();
        agregarNuevaExcursion = new javax.swing.JToggleButton();
        label_exc_dst_id = new javax.swing.JLabel();
        label_exc_gui_id = new javax.swing.JLabel();
        label_exc_exc_cst = new javax.swing.JLabel();
        label_exc_exc_fec = new javax.swing.JLabel();
        dst_nom = new javax.swing.JTextField();
        gui_nom = new javax.swing.JTextField();
        exc_id = new javax.swing.JTextField();
        label_exc_id_search = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        add_new_exc = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        add_new_dest = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        panelIdioma = new javax.swing.JPanel();
        addLanguaje = new javax.swing.JToggleButton();
        cxlAddLanguaje = new javax.swing.JToggleButton();
        idm_id = new javax.swing.JTextField();
        labelNombreIdioma = new javax.swing.JLabel();
        idm_nom = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        consultarDestinos.setText("Listar Destinos");
        consultarDestinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarDestinosActionPerformed(evt);
            }
        });

        consultarExcId.setText("Consultar Excursion por ID");
        consultarExcId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarExcIdActionPerformed(evt);
            }
        });

        hide_add_exc.setText("Cerrar");
        hide_add_exc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hide_add_excActionPerformed(evt);
            }
        });

        agregarNuevaExcursion.setText("Agregar");
        agregarNuevaExcursion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarNuevaExcursionActionPerformed(evt);
            }
        });

        label_exc_dst_id.setText("Cod. Destino");

        label_exc_gui_id.setText("Cód.Guia");

        label_exc_exc_cst.setText("Valor Excursion");

        label_exc_exc_fec.setText("Fecha Excursion");

        javax.swing.GroupLayout panelAgregarExcursionLayout = new javax.swing.GroupLayout(panelAgregarExcursion);
        panelAgregarExcursion.setLayout(panelAgregarExcursionLayout);
        panelAgregarExcursionLayout.setHorizontalGroup(
            panelAgregarExcursionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarExcursionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAgregarExcursionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_exc_dst_id)
                    .addComponent(label_exc_exc_fec)
                    .addComponent(label_exc_exc_cst)
                    .addComponent(label_exc_gui_id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAgregarExcursionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAgregarExcursionLayout.createSequentialGroup()
                        .addGroup(panelAgregarExcursionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(exc_dst_id, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exc_gui_id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAgregarExcursionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gui_nom, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(dst_nom)))
                    .addGroup(panelAgregarExcursionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(exc_exc_fec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                        .addComponent(exc_exc_cst, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelAgregarExcursionLayout.createSequentialGroup()
                .addGroup(panelAgregarExcursionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAgregarExcursionLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(panelAgregarExcursionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agregarNuevaExcursion, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelAgregarExcursionLayout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(hide_add_exc))))
                    .addGroup(panelAgregarExcursionLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(exc_id, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        panelAgregarExcursionLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {agregarNuevaExcursion, hide_add_exc});

        panelAgregarExcursionLayout.setVerticalGroup(
            panelAgregarExcursionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarExcursionLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelAgregarExcursionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_exc_dst_id)
                    .addComponent(exc_dst_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dst_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAgregarExcursionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exc_gui_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_exc_gui_id)
                    .addComponent(gui_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAgregarExcursionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_exc_exc_cst)
                    .addComponent(exc_exc_cst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAgregarExcursionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_exc_exc_fec)
                    .addComponent(exc_exc_fec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAgregarExcursionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarNuevaExcursion)
                    .addComponent(hide_add_exc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exc_id, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        label_exc_id_search.setText("id");

        jButton1.setText("Listar Excursiones de Guia");

        jButton2.setText("Listar Datos de Guia");

        add_new_exc.setText("Ingresar Nueva Excursion");
        add_new_exc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_new_excActionPerformed(evt);
            }
        });

        jButton4.setText("Ingresar Nuevo Idioma");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        add_new_dest.setText("Ingresar Nuevo Destino");
        add_new_dest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_new_destActionPerformed(evt);
            }
        });

        exit.setText("re-establecer DB");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        addLanguaje.setText("Agregar");

        cxlAddLanguaje.setText("Cancelar");
        cxlAddLanguaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxlAddLanguajeActionPerformed(evt);
            }
        });

        labelNombreIdioma.setText("Nombre Idioma");

        idm_nom.setText("jTextField1");

        javax.swing.GroupLayout panelIdiomaLayout = new javax.swing.GroupLayout(panelIdioma);
        panelIdioma.setLayout(panelIdiomaLayout);
        panelIdiomaLayout.setHorizontalGroup(
            panelIdiomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIdiomaLayout.createSequentialGroup()
                .addGroup(panelIdiomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelIdiomaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelNombreIdioma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idm_nom))
                    .addGroup(panelIdiomaLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(idm_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addLanguaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cxlAddLanguaje)
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        panelIdiomaLayout.setVerticalGroup(
            panelIdiomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIdiomaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelIdiomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreIdioma)
                    .addComponent(idm_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelIdiomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idm_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelIdiomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addLanguaje)
                        .addComponent(cxlAddLanguaje)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(consultarExcId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_exc_id_search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exc_id_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(add_new_exc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(panelAgregarExcursion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelIdioma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addComponent(add_new_dest, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exit)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(consultarDestinos, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultarExcId)
                    .addComponent(exc_id_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_exc_id_search)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consultarDestinos)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_new_exc)
                    .addComponent(jButton4)
                    .addComponent(add_new_dest))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAgregarExcursion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultarDestinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarDestinosActionPerformed
        Connection conexion=null;
        
        try{
            conexion=getConnection();
            ps=conexion.prepareStatement("select * from DESTINO");
            rs=ps.executeQuery();
            if (rs.next()){
                JOptionPane.showMessageDialog(null, "Nombre: "+rs.getString("dst_nom")+" - Horario: "+rs.getTime("dst_hrs")+" - Ciudad: "+ rs.getString("dst_ciu"));
            } else {
                JOptionPane.showMessageDialog(null, "No hay registros");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Semana6.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Semana6.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_consultarDestinosActionPerformed

    private void agregarNuevaExcursionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarNuevaExcursionActionPerformed
        Connection conexion = null;
        
        try{
            conexion=getConnection();
            ps=conexion.prepareStatement("insert into EXCURSION (dst_id,gui_id,exc_cst,exc_fec) values (?,?,?,?)");
            ps.setInt(1, Integer.valueOf(exc_dst_id.getText()));
            ps.setInt(2, Integer.valueOf(exc_gui_id.getText()));
            ps.setInt(3, Integer.valueOf(exc_exc_cst.getText()));
            ps.setDate(4, Date.valueOf(exc_exc_fec.getText()));
            
            int resultado = ps.executeUpdate();
            
            if (resultado>0){
                JOptionPane.showMessageDialog(null, "Excursion ingresada");
            } else {
                JOptionPane.showMessageDialog(null, "Error al insertar registro");
            }
            
            conexion.close();
            
        }catch (Exception ex){
            System.err.println("Error"+ex);
        }
    }//GEN-LAST:event_agregarNuevaExcursionActionPerformed

    private void hide_add_excActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hide_add_excActionPerformed
        exc_dst_id.setText(null);
        exc_gui_id.setText(null);
        exc_exc_cst.setText(null);
        exc_exc_fec.setText(null);
        dst_nom.setText(null);
        gui_nom.setText(null);
        panelAgregarExcursion.setVisible(false);
        
    }//GEN-LAST:event_hide_add_excActionPerformed

    private void add_new_destActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_new_destActionPerformed
        Connection conexion = null;
        try{
            conexion=getConnection();
            ps=conexion.prepareStatement("insert into DESTINO (dst_id, dst_nom,dst_hrs,dst_ciu) values (?,?,?,?)");
            ps.setInt(1, 1);
            ps.setString(2, "Cueva del Milodon");
            ps.setTime(3,Time.valueOf(LocalTime.MIN));
            ps.setString(4,"Puerto Natales");
            
            
            int resultado= ps.executeUpdate();
            
            if(resultado>0){
                JOptionPane.showMessageDialog(null, "Registro Ingresado");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo ingresar el registro");
            }
            
            conexion.close();
            
        } catch (Exception ex){
            System.err.println("Error"+ex);
        }
    }//GEN-LAST:event_add_new_destActionPerformed

    public void limpiarCampos(){
        exc_id_busqueda.setText(null);
        exc_dst_id.setText(null);
        
        
    }
    
    
    private void add_new_excActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_new_excActionPerformed
        panelAgregarExcursion.setVisible(true);
        exc_id.setVisible(false);
    }//GEN-LAST:event_add_new_excActionPerformed

    private void consultarExcIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarExcIdActionPerformed
        Connection conexion = null;
        exc_id.setVisible(false);
        try{
            conexion=getConnection();
            ps=conexion.prepareStatement("select * from EXCURSION where exc_id=?");
            ps.setString(1, exc_id_busqueda.getText());
            rs = ps.executeQuery();
            
            if (rs.next()){
                panelAgregarExcursion.setVisible(true);
                agregarNuevaExcursion.setVisible(false);
                exc_dst_id.setText(rs.getString("dst_id"));
                exc_gui_id.setText(rs.getString("gui_id"));
                exc_exc_cst.setText(rs.getString("exc_cst"));
                exc_exc_fec.setText(String.valueOf(rs.getDate("exc_fec")));
                exc_id_busqueda.setText(null);
                ps=conexion.prepareStatement("select * from DESTINO where dst_id=?");
                ps.setString(1, exc_dst_id.getText());
                rs = ps.executeQuery();
                if (rs.next()){
                    dst_nom.setText(rs.getString("dst_nom"));
                    ps=conexion.prepareStatement("select * from GUIA where gui_id=?");
                    ps.setString(1, exc_gui_id.getText());
                    rs = ps.executeQuery();
                    if (rs.next()){
                        gui_nom.setText(rs.getString("gui_nom"));
                    }
                } else {
                
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existe el id o el campo de busqueda se encuentra vacio, favor verificar");
                exc_id_busqueda.setText(null);
            }
        } catch (Exception ex){
            System.err.println("Error, "+ex);
        }
    }//GEN-LAST:event_consultarExcIdActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        Connection conexion = null;
        try{
            //insertar destinos
            conexion=getConnection();
            ps=conexion.prepareStatement("delete from DESTINO where dst_id<100");
            pt=conexion.prepareStatement("delete from EXCURSION where exc_id<100");
            pu=conexion.prepareStatement("delete from GUIA where gui_id<100");
            pv=conexion.prepareStatement("delete from GUIA_IDIOMA where gui_id<100");
            pw=conexion.prepareStatement("delete from IDIOMA where idm_id<100");
            
            int restablecer= ps.executeUpdate();
            int restablecer2= pt.executeUpdate();
            int restablecer3= pu.executeUpdate();
            int restablecer4= pv.executeUpdate();
            int restablecer5= pw.executeUpdate();
            
            ps=conexion.prepareStatement("alter table DESTINO AUTO_INCREMENT=0");
            pt=conexion.prepareStatement("alter table EXCURSION AUTO_INCREMENT=0");
            pu=conexion.prepareStatement("alter table GUIA AUTO_INCREMENT=0");
            pv=conexion.prepareStatement("alter table IDIOMA AUTO_INCREMENT=0");
            
            int restablecer6= ps.executeUpdate();
            int restablecer7= pt.executeUpdate();
            int restablecer8= pu.executeUpdate();
            int restablecer9= pv.executeUpdate();
            
            conexion.close();            
            
            if(restablecer>0&&restablecer2>0&&restablecer3>0&&restablecer4>0&&restablecer5>0&&restablecer6>0&&restablecer7>0&&restablecer8>0&&restablecer9>0){
                JOptionPane.showMessageDialog(null, "No se pudo realizar la operacion");
            } else {
                JOptionPane.showMessageDialog(null, "Atencion, todas las tablas en MYSQL fueron reestablecidas y eliminados los registros");
            }
            
        } catch (Exception ex){
            System.err.println("Error"+ex);
        }

    }//GEN-LAST:event_exitActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        panelIdioma.setVisible(true);
        idm_id.setVisible(false);
        idm_nom.setText(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cxlAddLanguajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxlAddLanguajeActionPerformed
        idm_nom.setText(null);
        panelIdioma.setVisible(false);
    }//GEN-LAST:event_cxlAddLanguajeActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Semana6().setVisible(true);
            }
            
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton addLanguaje;
    private javax.swing.JButton add_new_dest;
    private javax.swing.JButton add_new_exc;
    private javax.swing.JToggleButton agregarNuevaExcursion;
    private javax.swing.JButton consultarDestinos;
    private javax.swing.JToggleButton consultarExcId;
    private javax.swing.JToggleButton cxlAddLanguaje;
    private javax.swing.JTextField dst_nom;
    private javax.swing.JTextField exc_dst_id;
    private javax.swing.JTextField exc_exc_cst;
    private javax.swing.JTextField exc_exc_fec;
    private javax.swing.JTextField exc_gui_id;
    private javax.swing.JTextField exc_id;
    private javax.swing.JTextField exc_id_busqueda;
    private javax.swing.JButton exit;
    private javax.swing.JTextField gui_nom;
    private javax.swing.JToggleButton hide_add_exc;
    private javax.swing.JTextField idm_id;
    private javax.swing.JTextField idm_nom;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelNombreIdioma;
    private javax.swing.JLabel label_exc_dst_id;
    private javax.swing.JLabel label_exc_exc_cst;
    private javax.swing.JLabel label_exc_exc_fec;
    private javax.swing.JLabel label_exc_gui_id;
    private javax.swing.JLabel label_exc_id_search;
    private javax.swing.JPanel panelAgregarExcursion;
    private javax.swing.JPanel panelIdioma;
    // End of variables declaration//GEN-END:variables

    
}
