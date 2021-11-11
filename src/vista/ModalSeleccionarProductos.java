/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;


import componente.AWTUtilities;
import java.util.Timer;
import java.util.TimerTask;
import rojerusan.RSAnimation;


public class ModalSeleccionarProductos extends javax.swing.JDialog {
    
    Timer timer=null;
    TimerTask task;
    int i =32;

    public ModalSeleccionarProductos() {
        
        /*RSAnimation.setBajar(-230, 200, 2, 2, this);
        this.setLocationRelativeTo(this);
        this.setModal(true);*/
        initComponents();
        AWTUtilities.setOpaque(this,false);
        Ubicar(0);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rSPanelBorder1 = new RSMaterialComponent.RSPanelBorder();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new RSMaterialComponent.RSButtonIconOne();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new RSMaterialComponent.RSTableMetro();
        rSTextFieldTwo1 = new RSMaterialComponent.RSTextFieldTwo();
        rSTextFieldTwo2 = new RSMaterialComponent.RSTextFieldTwo();
        rSTextFieldTwo3 = new RSMaterialComponent.RSTextFieldTwo();
        rSLabelCircleImage1 = new rojerusan.RSLabelCircleImage();
        rSButtonGradientIcon_new6 = new newscomponents.RSButtonGradientIcon_new();
        rSButtonGradientIcon_new5 = new newscomponents.RSButtonGradientIcon_new();
        rSButtonGradientIcon_new4 = new newscomponents.RSButtonGradientIcon_new();

        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(867, 585));
        setSize(new java.awt.Dimension(867, 585));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        rSPanelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        rSPanelBorder1.setBgBorder(new java.awt.Color(0, 153, 0));
        rSPanelBorder1.setMaximumSize(new java.awt.Dimension(855, 567));
        rSPanelBorder1.setMinimumSize(new java.awt.Dimension(855, 567));
        rSPanelBorder1.setName(""); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));

        jLabel1.setFont(new java.awt.Font("Roboto Cn", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lista de Productos disponibles");

        btnCerrar.setBackground(new java.awt.Color(255, 51, 0));
        btnCerrar.setBackgroundHover(new java.awt.Color(153, 0, 0));
        btnCerrar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLOSE);
        btnCerrar.setRound(10);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Marca"
            }
        ));
        jScrollPane1.setViewportView(rSTableMetro1);

        rSTextFieldTwo1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rSTextFieldTwo1.setText("Nombre");

        rSTextFieldTwo2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rSTextFieldTwo2.setText("Código");

        rSTextFieldTwo3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rSTextFieldTwo3.setText("Cantidad");

        rSLabelCircleImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/404.jpg"))); // NOI18N

        rSButtonGradientIcon_new6.setBackground(new java.awt.Color(0, 255, 51));
        rSButtonGradientIcon_new6.setText("Seleccionar");
        rSButtonGradientIcon_new6.setToolTipText("");
        rSButtonGradientIcon_new6.setColorPrimario(new java.awt.Color(0, 204, 51));
        rSButtonGradientIcon_new6.setColorPrimarioHover(new java.awt.Color(0, 255, 0));
        rSButtonGradientIcon_new6.setColorSecundario(new java.awt.Color(0, 102, 51));
        rSButtonGradientIcon_new6.setColorSecundarioHover(new java.awt.Color(0, 255, 0));
        rSButtonGradientIcon_new6.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SHUFFLE);

        rSButtonGradientIcon_new5.setBackground(new java.awt.Color(0, 255, 51));
        rSButtonGradientIcon_new5.setText("Aplicar Cambios");
        rSButtonGradientIcon_new5.setToolTipText("");
        rSButtonGradientIcon_new5.setColorPrimario(new java.awt.Color(0, 204, 51));
        rSButtonGradientIcon_new5.setColorPrimarioHover(new java.awt.Color(0, 255, 0));
        rSButtonGradientIcon_new5.setColorSecundario(new java.awt.Color(0, 102, 51));
        rSButtonGradientIcon_new5.setColorSecundarioHover(new java.awt.Color(0, 255, 0));
        rSButtonGradientIcon_new5.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SHOP);

        rSButtonGradientIcon_new4.setBackground(new java.awt.Color(0, 255, 51));
        rSButtonGradientIcon_new4.setText("Cancelar");
        rSButtonGradientIcon_new4.setToolTipText("");
        rSButtonGradientIcon_new4.setColorPrimario(new java.awt.Color(255, 102, 102));
        rSButtonGradientIcon_new4.setColorPrimarioHover(new java.awt.Color(255, 0, 0));
        rSButtonGradientIcon_new4.setColorSecundario(new java.awt.Color(204, 0, 51));
        rSButtonGradientIcon_new4.setColorSecundarioHover(new java.awt.Color(255, 0, 0));
        rSButtonGradientIcon_new4.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CANCEL);

        javax.swing.GroupLayout rSPanelBorder1Layout = new javax.swing.GroupLayout(rSPanelBorder1);
        rSPanelBorder1.setLayout(rSPanelBorder1Layout);
        rSPanelBorder1Layout.setHorizontalGroup(
            rSPanelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelBorder1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(rSPanelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelBorder1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelBorder1Layout.createSequentialGroup()
                        .addComponent(rSLabelCircleImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(rSPanelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rSTextFieldTwo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSTextFieldTwo3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(rSTextFieldTwo1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
            .addGroup(rSPanelBorder1Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(rSButtonGradientIcon_new5, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rSButtonGradientIcon_new4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(rSPanelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelBorder1Layout.createSequentialGroup()
                    .addContainerGap(506, Short.MAX_VALUE)
                    .addComponent(rSButtonGradientIcon_new6, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(130, 130, 130)))
        );
        rSPanelBorder1Layout.setVerticalGroup(
            rSPanelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelBorder1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(rSPanelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanelBorder1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(rSPanelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rSTextFieldTwo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSTextFieldTwo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(rSTextFieldTwo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rSPanelBorder1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rSLabelCircleImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(rSPanelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonGradientIcon_new5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonGradientIcon_new4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(rSPanelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rSPanelBorder1Layout.createSequentialGroup()
                    .addGap(181, 181, 181)
                    .addComponent(rSButtonGradientIcon_new6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(346, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSPanelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSPanelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        setVisible(false);
        dispose();
        
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        task = new TimerTask() {
            @Override
            public void run() {
                if (i == 352) {
                    timer.cancel();
                } else {
                    Ubicar(i);
                    i += 32;
                    Trasparencia((float) i / 352);
                }
            }
        };
        timer = new java.util.Timer();
        timer.schedule(task, 0, 12);
    }//GEN-LAST:event_formWindowOpened
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonIconOne btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private newscomponents.RSButtonGradientIcon_new rSButtonGradientIcon_new4;
    private newscomponents.RSButtonGradientIcon_new rSButtonGradientIcon_new5;
    private newscomponents.RSButtonGradientIcon_new rSButtonGradientIcon_new6;
    private rojerusan.RSLabelCircleImage rSLabelCircleImage1;
    private RSMaterialComponent.RSPanelBorder rSPanelBorder1;
    private RSMaterialComponent.RSTableMetro rSTableMetro1;
    private RSMaterialComponent.RSTextFieldTwo rSTextFieldTwo1;
    private RSMaterialComponent.RSTextFieldTwo rSTextFieldTwo2;
    private RSMaterialComponent.RSTextFieldTwo rSTextFieldTwo3;
    // End of variables declaration//GEN-END:variables


    private void Trasparencia(float trasp) {
        AWTUtilities.setOpacity(this, trasp);
    }

    private void Ubicar(int y) {
        this.setLocation(660, y - 60);
    }
}
