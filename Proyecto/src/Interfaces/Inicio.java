package Interfaces;

import Clases.Reservas;
import Clases.Usuarios;
import javax.swing.JOptionPane;
import javax.swing.SingleSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Darry OV
 */
public class Inicio extends javax.swing.JFrame {

    private DefaultTableModel tblModel;
    private String[] header = {"ID", "Nombre", "Apellidos", "Correo"};

    private DefaultTableModel tblModel2;
    private String[] header2 = {"ID Usuario", "Nombre cliente", "horario"};
    
    private DefaultTableModel tblModel3;
    private String[] header3 = {"ID Usuario", "Nombre cliente", "horario"};
    
    private DefaultTableModel tblModel4;
    private String[] header4 = {"ID Usuario", "Nombre cliente", "horario"};

    public Inicio() {

        initComponents();
        
        //Inicia tabla de usuarios
        initTableusuario();
        
        //Inicia tabla de reserva de personal training
        initTableRegPT();
        
        //Inicia tabla de reserva de yoga 
        initTableRegY();
        
        //
        initTableRegCD();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLUsuario = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLReservas = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLReportes = new javax.swing.JLabel();
        jLInicio = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jTableMenus = new javax.swing.JTabbedPane();
        Inicio = new javax.swing.JPanel();
        JPUsuarios = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jRegUsuario = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jConUsuario = new javax.swing.JLabel();
        jtableUsuarios = new javax.swing.JTabbedPane();
        usuariosInicio = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        RegistroUsuario = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jTextApellido = new javax.swing.JTextField();
        jTextCorreo = new javax.swing.JTextField();
        jTextID = new javax.swing.JTextField();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        ConsultarUsuario = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTUsuarios = new javax.swing.JTable();
        Reservas = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jResGym = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jResCine = new javax.swing.JLabel();
        jTabbedReservas = new javax.swing.JTabbedPane();
        ResInicio = new javax.swing.JPanel();
        ResGYM = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jlYoga = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jlPersonal = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLDance = new javax.swing.JLabel();
        ResPersonal = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSPT = new javax.swing.JScrollPane();
        jTPersTrain = new javax.swing.JTable();
        jCHorarioPT = new javax.swing.JComboBox<>();
        txtNombrePT = new javax.swing.JTextField();
        jBRegPT = new javax.swing.JButton();
        jBEditPT = new javax.swing.JButton();
        btnDeletePT = new javax.swing.JButton();
        ResYoga = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSYoga = new javax.swing.JScrollPane();
        jTYoga = new javax.swing.JTable();
        btnRegYoga = new javax.swing.JButton();
        btnEditYoga = new javax.swing.JButton();
        jCYoga = new javax.swing.JComboBox<>();
        txtNombreY = new javax.swing.JTextField();
        jBDeleteY = new javax.swing.JButton();
        ResCine = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        ResDance = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtNameDance = new javax.swing.JTextField();
        jSDance = new javax.swing.JScrollPane();
        jTDance = new javax.swing.JTable();
        jCHorarioDance = new javax.swing.JComboBox<>();
        jBRegDance = new javax.swing.JButton();
        jBEditDance = new javax.swing.JButton();
        btnEliminarD = new javax.swing.JButton();
        Reportes = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(2, 104, 115));

        jPanel4.setBackground(new java.awt.Color(3, 140, 140));

        jLUsuario.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLUsuario.setText("Usuarios");
        jLUsuario.setToolTipText("");
        jLUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(3, 140, 140));

        jLReservas.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLReservas.setForeground(new java.awt.Color(255, 255, 255));
        jLReservas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLReservas.setText("Reservas");
        jLReservas.setToolTipText("");
        jLReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLReservasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLReservas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLReservas, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(3, 140, 140));

        jLReportes.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLReportes.setForeground(new java.awt.Color(255, 255, 255));
        jLReportes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLReportes.setText("Reportes");
        jLReportes.setToolTipText("");
        jLReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLReportesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLReportes, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        jLInicio.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLInicio.setForeground(new java.awt.Color(255, 255, 255));
        jLInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLInicio.setText("INICIO");
        jLInicio.setToolTipText("");
        jLInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLInicioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, 490));

        jPanel10.setBackground(new java.awt.Color(1, 52, 64));
        jPanel10.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

        javax.swing.GroupLayout InicioLayout = new javax.swing.GroupLayout(Inicio);
        Inicio.setLayout(InicioLayout);
        InicioLayout.setHorizontalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        InicioLayout.setVerticalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jTableMenus.addTab("tab1", Inicio);

        JPUsuarios.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(3, 140, 140));

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        jRegUsuario.setFont(new java.awt.Font("Bauhaus 93", 0, 14)); // NOI18N
        jRegUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRegUsuario.setText("Registrar usuario");
        jRegUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRegUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRegUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRegUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));

        jConUsuario.setBackground(new java.awt.Color(204, 204, 204));
        jConUsuario.setFont(new java.awt.Font("Bauhaus 93", 0, 14)); // NOI18N
        jConUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jConUsuario.setText("Consultar un usuario");
        jConUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jConUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jConUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jConUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        jPanel9.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 500));

        jPanel17.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu de usuarios");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout usuariosInicioLayout = new javax.swing.GroupLayout(usuariosInicio);
        usuariosInicio.setLayout(usuariosInicioLayout);
        usuariosInicioLayout.setHorizontalGroup(
            usuariosInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        usuariosInicioLayout.setVerticalGroup(
            usuariosInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuariosInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtableUsuarios.addTab("tab1", usuariosInicio);

        jLabel2.setFont(new java.awt.Font("Bauhaus 93", 0, 14)); // NOI18N
        jLabel2.setText("Registrar usuarios");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Apellido:");

        jLabel6.setText("Correo:");

        jLabel7.setText("ID:");

        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRegistrarMouseClicked(evt);
            }
        });
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegistroUsuarioLayout = new javax.swing.GroupLayout(RegistroUsuario);
        RegistroUsuario.setLayout(RegistroUsuarioLayout);
        RegistroUsuarioLayout.setHorizontalGroup(
            RegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroUsuarioLayout.createSequentialGroup()
                .addGroup(RegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroUsuarioLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(RegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(RegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextID)
                            .addComponent(jTextCorreo)
                            .addComponent(jTextApellido)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroUsuarioLayout.createSequentialGroup()
                                .addComponent(jButtonRegistrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonEditar))))
                    .addGroup(RegistroUsuarioLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        RegistroUsuarioLayout.setVerticalGroup(
            RegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroUsuarioLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addGap(99, 99, 99)
                .addGroup(RegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(RegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrar)
                    .addComponent(jButtonEditar))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jtableUsuarios.addTab("tab2", RegistroUsuario);

        jLabel3.setText("Consultar usuarios");

        jTUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTUsuarios);

        javax.swing.GroupLayout ConsultarUsuarioLayout = new javax.swing.GroupLayout(ConsultarUsuario);
        ConsultarUsuario.setLayout(ConsultarUsuarioLayout);
        ConsultarUsuarioLayout.setHorizontalGroup(
            ConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultarUsuarioLayout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(ConsultarUsuarioLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ConsultarUsuarioLayout.setVerticalGroup(
            ConsultarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultarUsuarioLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtableUsuarios.addTab("tab3", ConsultarUsuario);

        jPanel9.add(jtableUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -40, 550, 540));

        javax.swing.GroupLayout JPUsuariosLayout = new javax.swing.GroupLayout(JPUsuarios);
        JPUsuarios.setLayout(JPUsuariosLayout);
        JPUsuariosLayout.setHorizontalGroup(
            JPUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JPUsuariosLayout.setVerticalGroup(
            JPUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTableMenus.addTab("tab2", JPUsuarios);

        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setBackground(new java.awt.Color(3, 140, 140));

        jPanel21.setBackground(new java.awt.Color(204, 204, 204));

        jResGym.setFont(new java.awt.Font("Bauhaus 93", 0, 14)); // NOI18N
        jResGym.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jResGym.setText("GYM");
        jResGym.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jResGymMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jResGym, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jResGym, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel22.setBackground(new java.awt.Color(204, 204, 204));

        jResCine.setBackground(new java.awt.Color(204, 204, 204));
        jResCine.setFont(new java.awt.Font("Bauhaus 93", 0, 14)); // NOI18N
        jResCine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jResCine.setText("Cine");
        jResCine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jResCineMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jResCine, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jResCine, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        jPanel18.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 500));

        ResInicio.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout ResInicioLayout = new javax.swing.GroupLayout(ResInicio);
        ResInicio.setLayout(ResInicioLayout);
        ResInicioLayout.setHorizontalGroup(
            ResInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        ResInicioLayout.setVerticalGroup(
            ResInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 505, Short.MAX_VALUE)
        );

        jTabbedReservas.addTab("tab1", ResInicio);

        ResGYM.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jlYoga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlYoga.setText("Clases de yoga");
        jlYoga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlYogaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlYoga, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlYoga, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );

        jlPersonal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlPersonal.setText("Personal Trainig");
        jlPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlPersonalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );

        jLDance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLDance.setText("Clases de baile");
        jLDance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLDanceMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLDance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLDance, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ResGYMLayout = new javax.swing.GroupLayout(ResGYM);
        ResGYM.setLayout(ResGYMLayout);
        ResGYMLayout.setHorizontalGroup(
            ResGYMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ResGYMLayout.setVerticalGroup(
            ResGYMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedReservas.addTab("tab2", ResGYM);

        ResPersonal.setBackground(new java.awt.Color(204, 204, 204));

        jLabel9.setText("Personal Training");

        jLabel13.setText("Nombre:");

        jLabel14.setText("Horario:");

        jTPersTrain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTPersTrainMouseClicked(evt);
            }
        });
        jSPT.setViewportView(jTPersTrain);

        jCHorarioPT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2:00 pm", "3:00 pm", "4:00 pm", "5:00 pm", "6:00 pm", "7:00 pm" }));

        jBRegPT.setText("Registrar");
        jBRegPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegPTActionPerformed(evt);
            }
        });

        jBEditPT.setText("Editar");
        jBEditPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditPTActionPerformed(evt);
            }
        });

        btnDeletePT.setText("Eliminar");
        btnDeletePT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ResPersonalLayout = new javax.swing.GroupLayout(ResPersonal);
        ResPersonal.setLayout(ResPersonalLayout);
        ResPersonalLayout.setHorizontalGroup(
            ResPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResPersonalLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResPersonalLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(ResPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDeletePT)
                    .addGroup(ResPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSPT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(ResPersonalLayout.createSequentialGroup()
                            .addGroup(ResPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel14)
                                .addComponent(jLabel13))
                            .addGap(18, 18, 18)
                            .addGroup(ResPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(ResPersonalLayout.createSequentialGroup()
                                    .addComponent(jBRegPT)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBEditPT))
                                .addGroup(ResPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombrePT)
                                    .addComponent(jCHorarioPT, 0, 160, Short.MAX_VALUE))))))
                .addGap(48, 48, 48))
        );
        ResPersonalLayout.setVerticalGroup(
            ResPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResPersonalLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel9)
                .addGap(56, 56, 56)
                .addGroup(ResPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtNombrePT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ResPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jCHorarioPT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(ResPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBRegPT)
                    .addComponent(jBEditPT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnDeletePT)
                .addGap(18, 18, 18)
                .addComponent(jSPT, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jTabbedReservas.addTab("tab4", ResPersonal);

        ResYoga.setBackground(new java.awt.Color(204, 204, 204));

        jLabel10.setText("Yoga ");

        jLabel16.setText("Nombre:");

        jLabel17.setText("Horario:");

        jTYoga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTYogaMouseClicked(evt);
            }
        });
        jSYoga.setViewportView(jTYoga);

        btnRegYoga.setText("Registrar");
        btnRegYoga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegYogaActionPerformed(evt);
            }
        });

        btnEditYoga.setText("Editar");
        btnEditYoga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditYogaActionPerformed(evt);
            }
        });

        jCYoga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7:00 PM", "8:00 PM" }));

        jBDeleteY.setText("Eliminar");
        jBDeleteY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDeleteYActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ResYogaLayout = new javax.swing.GroupLayout(ResYoga);
        ResYoga.setLayout(ResYogaLayout);
        ResYogaLayout.setHorizontalGroup(
            ResYogaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResYogaLayout.createSequentialGroup()
                .addGroup(ResYogaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ResYogaLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel10))
                    .addGroup(ResYogaLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(ResYogaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCYoga, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(ResYogaLayout.createSequentialGroup()
                                .addComponent(btnRegYoga)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditYoga))
                            .addComponent(txtNombreY))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResYogaLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(ResYogaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBDeleteY)
                    .addComponent(jSYoga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
            .addGroup(ResYogaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ResYogaLayout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addGroup(ResYogaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel17)
                        .addComponent(jLabel16))
                    .addContainerGap(445, Short.MAX_VALUE)))
        );
        ResYogaLayout.setVerticalGroup(
            ResYogaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResYogaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(txtNombreY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCYoga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(ResYogaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegYoga)
                    .addComponent(btnEditYoga))
                .addGap(20, 20, 20)
                .addComponent(jBDeleteY)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSYoga, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(ResYogaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ResYogaLayout.createSequentialGroup()
                    .addGap(114, 114, 114)
                    .addComponent(jLabel16)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel17)
                    .addContainerGap(347, Short.MAX_VALUE)))
        );

        jTabbedReservas.addTab("tab3", ResYoga);

        ResCine.setBackground(new java.awt.Color(204, 204, 204));

        jLabel11.setText("Cine");

        javax.swing.GroupLayout ResCineLayout = new javax.swing.GroupLayout(ResCine);
        ResCine.setLayout(ResCineLayout);
        ResCineLayout.setHorizontalGroup(
            ResCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResCineLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(520, Short.MAX_VALUE))
        );
        ResCineLayout.setVerticalGroup(
            ResCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResCineLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(483, Short.MAX_VALUE))
        );

        jTabbedReservas.addTab("tab5", ResCine);

        ResDance.setBackground(new java.awt.Color(204, 204, 204));

        jLabel12.setText("Classes de baile");

        jLabel15.setText("Nombre:");

        jLabel18.setText("Horario:");

        jTDance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTDanceMouseClicked(evt);
            }
        });
        jSDance.setViewportView(jTDance);

        jCHorarioDance.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7:00 pm", "8:00 pm" }));

        jBRegDance.setText("Registrar");
        jBRegDance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegDanceActionPerformed(evt);
            }
        });

        jBEditDance.setText("Editar");
        jBEditDance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditDanceActionPerformed(evt);
            }
        });

        btnEliminarD.setText("Eliminar");
        btnEliminarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ResDanceLayout = new javax.swing.GroupLayout(ResDance);
        ResDance.setLayout(ResDanceLayout);
        ResDanceLayout.setHorizontalGroup(
            ResDanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResDanceLayout.createSequentialGroup()
                .addGroup(ResDanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEliminarD)
                    .addGroup(ResDanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ResDanceLayout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addGroup(ResDanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel18)
                                .addComponent(jLabel15)
                                .addComponent(jLabel12))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(ResDanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(ResDanceLayout.createSequentialGroup()
                                    .addComponent(jBRegDance)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jBEditDance))
                                .addComponent(jCHorarioDance, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNameDance, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(ResDanceLayout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addComponent(jSDance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        ResDanceLayout.setVerticalGroup(
            ResDanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResDanceLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel12)
                .addGap(37, 37, 37)
                .addGroup(ResDanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtNameDance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ResDanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jCHorarioDance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ResDanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBRegDance)
                    .addComponent(jBEditDance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btnEliminarD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSDance, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        jTabbedReservas.addTab("tab6", ResDance);

        jPanel18.add(jTabbedReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -40, 550, 540));

        javax.swing.GroupLayout ReservasLayout = new javax.swing.GroupLayout(Reservas);
        Reservas.setLayout(ReservasLayout);
        ReservasLayout.setHorizontalGroup(
            ReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ReservasLayout.setVerticalGroup(
            ReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTableMenus.addTab("tab3", Reservas);

        javax.swing.GroupLayout ReportesLayout = new javax.swing.GroupLayout(Reportes);
        Reportes.setLayout(ReportesLayout);
        ReportesLayout.setHorizontalGroup(
            ReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        ReportesLayout.setVerticalGroup(
            ReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jTableMenus.addTab("tab4", Reportes);

        jPanel1.add(jTableMenus, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 710, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLUsuarioMouseClicked
        jTableMenus.setSelectedIndex(1);
    }//GEN-LAST:event_jLUsuarioMouseClicked

    private void jLReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLReservasMouseClicked
        jTableMenus.setSelectedIndex(2);
    }//GEN-LAST:event_jLReservasMouseClicked

    private void jLReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLReportesMouseClicked
        jTableMenus.setSelectedIndex(3);
    }//GEN-LAST:event_jLReportesMouseClicked

    private void jLInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLInicioMouseClicked
        jTableMenus.setSelectedIndex(0);
    }//GEN-LAST:event_jLInicioMouseClicked

    private void jRegUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRegUsuarioMouseClicked
        jtableUsuarios.setSelectedIndex(1);
    }//GEN-LAST:event_jRegUsuarioMouseClicked

    private void jConUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jConUsuarioMouseClicked
        jtableUsuarios.setSelectedIndex(2);
    }//GEN-LAST:event_jConUsuarioMouseClicked

    private void jResGymMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jResGymMouseClicked
        jTabbedReservas.setSelectedIndex(1);
    }//GEN-LAST:event_jResGymMouseClicked

    private void jResCineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jResCineMouseClicked
        jTabbedReservas.setSelectedIndex(4);
    }//GEN-LAST:event_jResCineMouseClicked

    private void jlYogaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlYogaMouseClicked
        jTabbedReservas.setSelectedIndex(3);
    }//GEN-LAST:event_jlYogaMouseClicked

    private void jlPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlPersonalMouseClicked
        jTabbedReservas.setSelectedIndex(2);
    }//GEN-LAST:event_jlPersonalMouseClicked

    private void jLDanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLDanceMouseClicked
        jTabbedReservas.setSelectedIndex(5);
    }//GEN-LAST:event_jLDanceMouseClicked

    private void jButtonRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegistrarMouseClicked

    }//GEN-LAST:event_jButtonRegistrarMouseClicked

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        int id = Integer.valueOf(jTextID.getText());
        String nombre = jTextNombre.getText();
        String apellido = jTextApellido.getText();
        String correo = jTextCorreo.getText();

        Usuarios nUsser = new Usuarios(id, nombre, apellido, correo);

        tblModel.addRow(nUsser.toArray());

        jTextID.setText("");
        jTextNombre.setText("");
        jTextApellido.setText("");
        jTextCorreo.setText("");

    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        if (jTUsuarios.getSelectedRowCount() != 1) {

            return;

        }

        int id = Integer.valueOf(jTextID.getText());
        String nombre = jTextNombre.getText();
        String apellido = jTextApellido.getText();
        String correo = jTextCorreo.getText();
        int fila = jTUsuarios.getSelectedRow();

        Usuarios u = new Usuarios(id, nombre, apellido, correo);

        tblModel.setValueAt(u.getId(), fila, 0);
        tblModel.setValueAt(u.getNombre(), fila, 1);
        tblModel.setValueAt(u.getApellidos(), fila, 2);
        tblModel.setValueAt(u.getCorreo(), fila, 3);

        JOptionPane.showConfirmDialog(null, "El usuario se ha editado correctamente");

        jTextID.setText("");
        jTextNombre.setText("");
        jTextApellido.setText("");
        jTextCorreo.setText("");

    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jTUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTUsuariosMouseClicked
        if (evt.getClickCount() == 2) {
            int fila = jTUsuarios.getSelectedRow();

            //String id = (String) tblModel.getValueAt(fila, 0);
            String nombre = (String) tblModel.getValueAt(fila, 1);
            String apellido = (String) tblModel.getValueAt(fila, 2);
            String correo = (String) tblModel.getValueAt(fila, 3);

            //jTextID.setText(id);
            jTextNombre.setText(nombre);
            jTextApellido.setText(apellido);
            jTextCorreo.setText(correo);

        }
    }//GEN-LAST:event_jTUsuariosMouseClicked

    private void jBRegPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegPTActionPerformed
        int id = Integer.parseInt(JOptionPane.showInputDialog("Dijite su id de usuario"));

        String nombre = txtNombrePT.getText();
        String horario = jCHorarioPT.getSelectedItem().toString();

        if (jTPersTrain.getRowCount() <= 29) {
            for (int i = 0; i < jTUsuarios.getRowCount(); i++) {
                if (jTUsuarios.getValueAt(i, 0).equals(id)) {

                    JOptionPane.showConfirmDialog(null, "Reserva aplicada con exito");
                    Reservas newres = new Reservas(nombre, horario, id);

                    tblModel2.addRow(newres.toArray());
                } else {

                    JOptionPane.showConfirmDialog(null, "No existe el id de usuario");

                }
            }
        } else {

            JOptionPane.showConfirmDialog(null, "Cupos llenos");

        }
        txtNombrePT.setText("");

    }//GEN-LAST:event_jBRegPTActionPerformed

    private void jBEditPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditPTActionPerformed
        if (jTPersTrain.getSelectedRowCount() != 1) {
            return;
        }

        int id = Integer.parseInt(JOptionPane.showInputDialog("Dijite su id de usuario"));
        String nombre = txtNombrePT.getText();
        String horario = jCHorarioPT.getSelectedItem().toString();
        int fila = jTPersTrain.getSelectedRow();

        for (int i = 0; i < jTUsuarios.getRowCount(); i++) {
            if (jTUsuarios.getValueAt(i, 0).equals(id)) {

                Reservas r = new Reservas(nombre, horario, id);
                tblModel2.setValueAt(r.getIdUsuario(), fila, 0);
                tblModel2.setValueAt(r.getNombre(), fila, 1);
                tblModel2.setValueAt(r.getHorario(), fila, 2);

            } else {

                JOptionPane.showConfirmDialog(null, "No existe el id de usuario");

            }
        }

    }//GEN-LAST:event_jBEditPTActionPerformed

    private void jTPersTrainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTPersTrainMouseClicked
        if (evt.getClickCount() == 2) {
            
            int fila = jTPersTrain.getSelectedRow();
            
            
            String nombre = (String) tblModel2.getValueAt(fila, 1);
            
            txtNombrePT.setText(nombre);
            
        }
    }//GEN-LAST:event_jTPersTrainMouseClicked

    private void btnDeletePTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePTActionPerformed
        if (jTPersTrain.getSelectedRowCount() != 1) {
            
            return;
            
        }
        int fila = jTPersTrain.getSelectedRow();
        tblModel2.removeRow(fila);
    }//GEN-LAST:event_btnDeletePTActionPerformed

    private void btnRegYogaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegYogaActionPerformed
        int id = Integer.parseInt(JOptionPane.showInputDialog("Dijite su id de usuario"));

        String nombre = txtNombreY.getText();
        String horario = jCYoga.getSelectedItem().toString();

        if (jTYoga.getRowCount() <= 29) {
            for (int i = 0; i < jTUsuarios.getRowCount(); i++) {
                if (jTUsuarios.getValueAt(i, 0).equals(id)) {

                    JOptionPane.showConfirmDialog(null, "Reserva aplicada con exito");
                    Reservas newres = new Reservas(nombre, horario, id);

                    tblModel3.addRow(newres.toArray());
                } else {

                    JOptionPane.showConfirmDialog(null, "No existe el id de usuario");

                }
            }
        } else {

            JOptionPane.showConfirmDialog(null, "Cupos llenos");

        }
        txtNombreY.setText("");
    }//GEN-LAST:event_btnRegYogaActionPerformed

    private void btnEditYogaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditYogaActionPerformed
        if (jTYoga.getSelectedRowCount() != 1) {
            return;
        }

        int id = Integer.parseInt(JOptionPane.showInputDialog("Dijite su id de usuario"));
        String nombre = txtNombreY.getText();
        String horario = jCYoga.getSelectedItem().toString();
        int fila = jTYoga.getSelectedRow();

        for (int i = 0; i < jTUsuarios.getRowCount(); i++) {
            if (jTUsuarios.getValueAt(i, 0).equals(id)) {

                Reservas r = new Reservas(nombre, horario, id);
                tblModel3.setValueAt(r.getIdUsuario(), fila, 0);
                tblModel3.setValueAt(r.getNombre(), fila, 1);
                tblModel3.setValueAt(r.getHorario(), fila, 2);

            } else {

                JOptionPane.showConfirmDialog(null, "No existe el id de usuario");

            }
        }
    }//GEN-LAST:event_btnEditYogaActionPerformed

    private void jTYogaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTYogaMouseClicked
        if (evt.getClickCount() == 2) {
            
            int fila = jTYoga.getSelectedRow();
            
            
            String nombre = (String) tblModel3.getValueAt(fila, 1);
            
            txtNombreY.setText(nombre);
        }
    }//GEN-LAST:event_jTYogaMouseClicked

    private void jBDeleteYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeleteYActionPerformed
        if (jTYoga.getSelectedRowCount() != 1) {
            
            return;
            
        }
        int fila = jTYoga.getSelectedRow();
        tblModel3.removeRow(fila);
    }//GEN-LAST:event_jBDeleteYActionPerformed

    private void jBRegDanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegDanceActionPerformed
        int id = Integer.parseInt(JOptionPane.showInputDialog("Dijite su id de usuario"));

        String nombre = txtNameDance.getText();
        String horario = jCHorarioDance.getSelectedItem().toString();

        if (jTDance.getRowCount() <= 29) {
            for (int i = 0; i < jTUsuarios.getRowCount(); i++) {
                if (jTUsuarios.getValueAt(i, 0).equals(id)) {

                    JOptionPane.showConfirmDialog(null, "Reserva aplicada con exito");
                    Reservas newres = new Reservas(nombre, horario, id);

                    tblModel4.addRow(newres.toArray());
                } else {

                    JOptionPane.showConfirmDialog(null, "No existe el id de usuario");

                }
            }
        } else {

            JOptionPane.showConfirmDialog(null, "Cupos llenos");

        }
        txtNameDance.setText("");
    }//GEN-LAST:event_jBRegDanceActionPerformed

    private void jBEditDanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditDanceActionPerformed
         if (jTDance.getSelectedRowCount() != 1) {
            return;
        }

        int id = Integer.parseInt(JOptionPane.showInputDialog("Dijite su id de usuario"));
        String nombre = txtNameDance.getText();
        String horario = jCHorarioDance.getSelectedItem().toString();
        int fila = jTDance.getSelectedRow();

        for (int i = 0; i < jTUsuarios.getRowCount(); i++) {
            if (jTUsuarios.getValueAt(i, 0).equals(id)) {

                Reservas r = new Reservas(nombre, horario, id);
                tblModel4.setValueAt(r.getIdUsuario(), fila, 0);
                tblModel4.setValueAt(r.getNombre(), fila, 1);
                tblModel4.setValueAt(r.getHorario(), fila, 2);

            } else {

                JOptionPane.showConfirmDialog(null, "No existe el id de usuario");

            }
        }
    }//GEN-LAST:event_jBEditDanceActionPerformed

    private void jTDanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTDanceMouseClicked
        if (evt.getClickCount() == 2) {
            
            int fila = jTDance.getSelectedRow();
            
            
            String nombre = (String) tblModel4.getValueAt(fila, 1);
            
            txtNameDance.setText(nombre);
        }
    }//GEN-LAST:event_jTDanceMouseClicked

    private void btnEliminarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDActionPerformed
        if (jTDance.getSelectedRowCount() != 1) {
            
            return;
            
        }
        int fila = jTDance.getSelectedRow();
        tblModel4.removeRow(fila);
    }//GEN-LAST:event_btnEliminarDActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ConsultarUsuario;
    private javax.swing.JPanel Inicio;
    private javax.swing.JPanel JPUsuarios;
    private javax.swing.JPanel RegistroUsuario;
    private javax.swing.JPanel Reportes;
    private javax.swing.JPanel ResCine;
    private javax.swing.JPanel ResDance;
    private javax.swing.JPanel ResGYM;
    private javax.swing.JPanel ResInicio;
    private javax.swing.JPanel ResPersonal;
    private javax.swing.JPanel ResYoga;
    private javax.swing.JPanel Reservas;
    private javax.swing.JButton btnDeletePT;
    private javax.swing.JButton btnEditYoga;
    private javax.swing.JButton btnEliminarD;
    private javax.swing.JButton btnRegYoga;
    private javax.swing.JButton jBDeleteY;
    private javax.swing.JButton jBEditDance;
    private javax.swing.JButton jBEditPT;
    private javax.swing.JButton jBRegDance;
    private javax.swing.JButton jBRegPT;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JComboBox<String> jCHorarioDance;
    private javax.swing.JComboBox<String> jCHorarioPT;
    private javax.swing.JComboBox<String> jCYoga;
    private javax.swing.JLabel jConUsuario;
    private javax.swing.JLabel jLDance;
    private javax.swing.JLabel jLInicio;
    private javax.swing.JLabel jLReportes;
    private javax.swing.JLabel jLReservas;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jRegUsuario;
    private javax.swing.JLabel jResCine;
    private javax.swing.JLabel jResGym;
    private javax.swing.JScrollPane jSDance;
    private javax.swing.JScrollPane jSPT;
    private javax.swing.JScrollPane jSYoga;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTDance;
    private javax.swing.JTable jTPersTrain;
    private javax.swing.JTable jTUsuarios;
    private javax.swing.JTable jTYoga;
    private javax.swing.JTabbedPane jTabbedReservas;
    private javax.swing.JTabbedPane jTableMenus;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JTextField jTextCorreo;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JLabel jlPersonal;
    private javax.swing.JLabel jlYoga;
    private javax.swing.JTabbedPane jtableUsuarios;
    private javax.swing.JTextField txtNameDance;
    private javax.swing.JTextField txtNombrePT;
    private javax.swing.JTextField txtNombreY;
    private javax.swing.JPanel usuariosInicio;
    // End of variables declaration//GEN-END:variables

    private void initTableusuario() {
        tblModel = new DefaultTableModel(header, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        jTUsuarios.setModel(tblModel);
    }

    private void initTableRegPT() {

        tblModel2 = new DefaultTableModel(header2, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        jTPersTrain.setModel(tblModel2);

    }

    private void initTableRegY() {
        
        tblModel3 = new DefaultTableModel(header3, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        jTYoga.setModel(tblModel3);
        
    }

    private void initTableRegCD() {
        
        tblModel4 = new DefaultTableModel(header4, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        jTDance.setModel(tblModel4);

    }

}
