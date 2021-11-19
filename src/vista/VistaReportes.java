
package vista;

import controlador.UserController;
import modelo.Usuario;
import modelo.UsuarioDAO;


public class VistaReportes extends javax.swing.JPanel {

     Usuario us = new Usuario();
     UsuarioDAO usDAO = new UsuarioDAO();
    public VistaReportes() {

        initComponents();
;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PoupMenuUsers = new rojerusan.RSPopuMenu();
        MenuItem_EliminarUser = new javax.swing.JMenuItem();
        MenuItem_ReingresarUser = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        rSPanelMaterialGradient1 = new RSMaterialComponent.RSPanelMaterialGradient();
        jLabel1 = new javax.swing.JLabel();
        pnlSlider = new newscomponents.RSPanelEffect();
        txtSearchUser = new RSMaterialComponent.RSTextFieldIconOne();
        jLabel2 = new javax.swing.JLabel();
        txtNickname = new RSMaterialComponent.RSTextFieldOne();
        txtName = new RSMaterialComponent.RSTextFieldOne();
        jLabel3 = new javax.swing.JLabel();
        txtLastname = new RSMaterialComponent.RSTextFieldOne();
        jLabel4 = new javax.swing.JLabel();
        txtDni = new RSMaterialComponent.RSTextFieldOne();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new RSMaterialComponent.RSTextFieldOne();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPhone = new RSMaterialComponent.RSTextFieldOne();
        txtPassword = new RSMaterialComponent.RSPasswordOne();
        cboRole = new rojerusan.RSComboBox();
        jLabel9 = new javax.swing.JLabel();
        btnNewUser = new newscomponents.RSButtonGradientIcon_new();
        btnRegisterUser = new newscomponents.RSButtonGradientIcon_new();
        btnModifyUser = new newscomponents.RSButtonGradientIcon_new();
        txtIduser = new RSMaterialComponent.RSTextFieldOne();

        MenuItem_EliminarUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminar.png"))); // NOI18N
        MenuItem_EliminarUser.setText("Eliminar");
        PoupMenuUsers.add(MenuItem_EliminarUser);

        MenuItem_ReingresarUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ingresar.png"))); // NOI18N
        MenuItem_ReingresarUser.setText("Reingresar");
        MenuItem_ReingresarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_ReingresarUserActionPerformed(evt);
            }
        });
        PoupMenuUsers.add(MenuItem_ReingresarUser);
        MenuItem_ReingresarUser.getAccessibleContext().setAccessibleDescription("");

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(995, 702));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(153, 153, 153)));

        rSPanelMaterialGradient1.setBgShade(new java.awt.Color(51, 102, 255));
        rSPanelMaterialGradient1.setColorPrimario(new java.awt.Color(0, 102, 255));
        rSPanelMaterialGradient1.setShadowBottom(false);
        rSPanelMaterialGradient1.setShadowLeft(false);
        rSPanelMaterialGradient1.setShadowRight(false);
        rSPanelMaterialGradient1.setShadowTop(false);

        jLabel1.setFont(new java.awt.Font("Roboto Cn", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ódulo de Reportes");

        javax.swing.GroupLayout rSPanelMaterialGradient1Layout = new javax.swing.GroupLayout(rSPanelMaterialGradient1);
        rSPanelMaterialGradient1.setLayout(rSPanelMaterialGradient1Layout);
        rSPanelMaterialGradient1Layout.setHorizontalGroup(
            rSPanelMaterialGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelMaterialGradient1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        rSPanelMaterialGradient1Layout.setVerticalGroup(
            rSPanelMaterialGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelMaterialGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelMaterialGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlSlider.setBackground(new java.awt.Color(255, 255, 255));

        txtSearchUser.setForeground(new java.awt.Color(51, 51, 51));
        txtSearchUser.setBorderColor(new java.awt.Color(204, 204, 204));
        txtSearchUser.setColorIcon(new java.awt.Color(51, 51, 51));
        txtSearchUser.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        txtSearchUser.setPhColor(new java.awt.Color(102, 102, 102));
        txtSearchUser.setPlaceholder("Buscar");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nickname*");

        txtNickname.setForeground(new java.awt.Color(0, 102, 255));
        txtNickname.setBorderColor(new java.awt.Color(0, 102, 255));
        txtNickname.setMargin(new java.awt.Insets(3, 2, 3, 2));
        txtNickname.setOpaque(false);
        txtNickname.setPhColor(new java.awt.Color(0, 0, 153));
        txtNickname.setPlaceholder("Ingresar nickname...");
        txtNickname.setSelectionColor(new java.awt.Color(51, 51, 51));

        txtName.setForeground(new java.awt.Color(0, 102, 255));
        txtName.setBorderColor(new java.awt.Color(0, 102, 255));
        txtName.setMargin(new java.awt.Insets(3, 2, 3, 2));
        txtName.setOpaque(false);
        txtName.setPhColor(new java.awt.Color(0, 0, 153));
        txtName.setPlaceholder("Ingresar Nombres...");
        txtName.setSelectionColor(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombres*");

        txtLastname.setForeground(new java.awt.Color(0, 102, 255));
        txtLastname.setBorderColor(new java.awt.Color(0, 102, 255));
        txtLastname.setMargin(new java.awt.Insets(3, 2, 3, 2));
        txtLastname.setOpaque(false);
        txtLastname.setPhColor(new java.awt.Color(0, 0, 153));
        txtLastname.setPlaceholder("Ingresar Apellidos...");
        txtLastname.setSelectionColor(new java.awt.Color(51, 51, 51));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Apellidos*");

        txtDni.setForeground(new java.awt.Color(0, 102, 255));
        txtDni.setBorderColor(new java.awt.Color(0, 102, 255));
        txtDni.setMargin(new java.awt.Insets(3, 2, 3, 2));
        txtDni.setOpaque(false);
        txtDni.setPhColor(new java.awt.Color(0, 0, 153));
        txtDni.setPlaceholder("Ingresar dni...");
        txtDni.setSelectionColor(new java.awt.Color(51, 51, 51));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("DNI*");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Contraseña*");

        txtEmail.setForeground(new java.awt.Color(0, 102, 255));
        txtEmail.setBorderColor(new java.awt.Color(0, 102, 255));
        txtEmail.setMargin(new java.awt.Insets(3, 2, 3, 2));
        txtEmail.setOpaque(false);
        txtEmail.setPhColor(new java.awt.Color(0, 0, 153));
        txtEmail.setPlaceholder("Ingresar E-mail...");
        txtEmail.setSelectionColor(new java.awt.Color(51, 51, 51));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("E-mail*");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Teléfono*");

        txtPhone.setForeground(new java.awt.Color(0, 102, 255));
        txtPhone.setBorderColor(new java.awt.Color(0, 102, 255));
        txtPhone.setMargin(new java.awt.Insets(3, 2, 3, 2));
        txtPhone.setOpaque(false);
        txtPhone.setPhColor(new java.awt.Color(0, 0, 153));
        txtPhone.setPlaceholder("Ingresar Teéfono...");
        txtPhone.setSelectionColor(new java.awt.Color(51, 51, 51));

        txtPassword.setForeground(new java.awt.Color(0, 102, 255));
        txtPassword.setBorderColor(new java.awt.Color(0, 102, 255));
        txtPassword.setMargin(new java.awt.Insets(3, 2, 3, 2));
        txtPassword.setPhColor(new java.awt.Color(0, 0, 153));
        txtPassword.setPlaceholder("Ingresar contraseña...");

        cboRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Seleccionar>", "Administrador", "Empleado" }));
        cboRole.setColorArrow(new java.awt.Color(0, 102, 255));
        cboRole.setColorBorde(new java.awt.Color(0, 0, 255));
        cboRole.setColorFondo(new java.awt.Color(0, 102, 255));
        cboRole.setColorSeleccion(new java.awt.Color(0, 102, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Rol*");

        btnNewUser.setBackground(new java.awt.Color(0, 255, 51));
        btnNewUser.setText("Nuevo");
        btnNewUser.setToolTipText("");
        btnNewUser.setColorPrimario(new java.awt.Color(0, 204, 51));
        btnNewUser.setColorPrimarioHover(new java.awt.Color(0, 255, 0));
        btnNewUser.setColorSecundario(new java.awt.Color(0, 102, 51));
        btnNewUser.setColorSecundarioHover(new java.awt.Color(0, 255, 0));
        btnNewUser.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ADD);

        btnRegisterUser.setBackground(new java.awt.Color(75, 172, 198));
        btnRegisterUser.setText("Registrar");
        btnRegisterUser.setToolTipText("");
        btnRegisterUser.setColorPrimario(new java.awt.Color(75, 172, 198));
        btnRegisterUser.setColorPrimarioHover(new java.awt.Color(0, 255, 255));
        btnRegisterUser.setColorSecundario(new java.awt.Color(75, 85, 215));
        btnRegisterUser.setColorSecundarioHover(new java.awt.Color(0, 255, 255));
        btnRegisterUser.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEND);

        btnModifyUser.setBackground(new java.awt.Color(0, 255, 51));
        btnModifyUser.setText("Modificar");
        btnModifyUser.setToolTipText("");
        btnModifyUser.setColorPrimario(new java.awt.Color(255, 102, 102));
        btnModifyUser.setColorPrimarioHover(new java.awt.Color(255, 0, 0));
        btnModifyUser.setColorSecundario(new java.awt.Color(204, 0, 51));
        btnModifyUser.setColorSecundarioHover(new java.awt.Color(255, 0, 0));
        btnModifyUser.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EDIT);

        txtIduser.setForeground(new java.awt.Color(0, 102, 255));
        txtIduser.setBorderColor(new java.awt.Color(0, 102, 255));
        txtIduser.setMargin(new java.awt.Insets(3, 2, 3, 2));
        txtIduser.setOpaque(false);
        txtIduser.setPhColor(new java.awt.Color(0, 0, 153));
        txtIduser.setPlaceholder("Id User");
        txtIduser.setSelectionColor(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout pnlSliderLayout = new javax.swing.GroupLayout(pnlSlider);
        pnlSlider.setLayout(pnlSliderLayout);
        pnlSliderLayout.setHorizontalGroup(
            pnlSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSliderLayout.createSequentialGroup()
                .addGroup(pnlSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSliderLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSliderLayout.createSequentialGroup()
                                .addGroup(pnlSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                    .addComponent(txtNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLastname, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDni, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(txtSearchUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlSliderLayout.createSequentialGroup()
                        .addContainerGap(263, Short.MAX_VALUE)
                        .addGroup(pnlSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(txtIduser, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlSliderLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSliderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegisterUser, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModifyUser, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );
        pnlSliderLayout.setVerticalGroup(
            pnlSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSliderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlSliderLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSliderLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSliderLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSliderLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(pnlSliderLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlSliderLayout.createSequentialGroup()
                        .addGroup(pnlSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(pnlSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIduser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(286, 286, 286)
                .addGroup(pnlSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRegisterUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnModifyUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItem_ReingresarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_ReingresarUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItem_ReingresarUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem MenuItem_EliminarUser;
    public javax.swing.JMenuItem MenuItem_ReingresarUser;
    public rojerusan.RSPopuMenu PoupMenuUsers;
    public newscomponents.RSButtonGradientIcon_new btnModifyUser;
    public newscomponents.RSButtonGradientIcon_new btnNewUser;
    public newscomponents.RSButtonGradientIcon_new btnRegisterUser;
    public rojerusan.RSComboBox cboRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private newscomponents.RSPanelEffect pnlSlider;
    private RSMaterialComponent.RSPanelMaterialGradient rSPanelMaterialGradient1;
    public RSMaterialComponent.RSTextFieldOne txtDni;
    public RSMaterialComponent.RSTextFieldOne txtEmail;
    public RSMaterialComponent.RSTextFieldOne txtIduser;
    public RSMaterialComponent.RSTextFieldOne txtLastname;
    public RSMaterialComponent.RSTextFieldOne txtName;
    public RSMaterialComponent.RSTextFieldOne txtNickname;
    public RSMaterialComponent.RSPasswordOne txtPassword;
    public RSMaterialComponent.RSTextFieldOne txtPhone;
    public RSMaterialComponent.RSTextFieldIconOne txtSearchUser;
    // End of variables declaration//GEN-END:variables
}
