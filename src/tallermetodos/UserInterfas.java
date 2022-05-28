/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tallermetodos;

import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class UserInterfas extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public UserInterfas() {
        initComponents();
        
        tableResultado.getColumnModel().getColumn(0).setPreferredWidth(50);
        tableResultado.getColumnModel().getColumn(1).setPreferredWidth(260);
        tableResultado.getColumnModel().getColumn(2).setPreferredWidth(130);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupMetodo = new javax.swing.ButtonGroup();
        panelMetodo = new javax.swing.JPanel();
        rbSimpson1_3 = new javax.swing.JRadioButton();
        rbSimpson3_8 = new javax.swing.JRadioButton();
        rbBoole = new javax.swing.JRadioButton();
        rbTrapezoidal = new javax.swing.JRadioButton();
        rbSimpson_abierto = new javax.swing.JRadioButton();
        panelIntegral = new javax.swing.JPanel();
        lbIntegral = new javax.swing.JLabel();
        tfB = new javax.swing.JTextField();
        tfA = new javax.swing.JTextField();
        tfFuncion = new javax.swing.JTextField();
        lbN = new javax.swing.JLabel();
        tfN = new javax.swing.JTextField();
        lbDelta = new javax.swing.JLabel();
        tfDelta = new javax.swing.JTextField();
        btCalcular = new javax.swing.JButton();
        btAyuda = new javax.swing.JButton();
        btCalcular1 = new javax.swing.JButton();
        lbdx = new javax.swing.JLabel();
        Exitbtn = new javax.swing.JButton();
        panelDesarrollo = new javax.swing.JPanel();
        scrollPaneDesarrollo = new javax.swing.JScrollPane();
        tableResultado = new javax.swing.JTable();
        lbSumatoria = new javax.swing.JLabel();
        lbResultado = new javax.swing.JLabel();
        tfSumatoria = new javax.swing.JTextField();
        tfResultado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Software de soluciones integrales definidas.");
        setBackground(new java.awt.Color(0, 102, 204));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);

        panelMetodo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Metodos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 11))); // NOI18N

        buttonGroupMetodo.add(rbSimpson1_3);
        rbSimpson1_3.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        rbSimpson1_3.setSelected(true);
        rbSimpson1_3.setText("Simpson 1/3");
        rbSimpson1_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSimpson1_3ActionPerformed(evt);
            }
        });

        buttonGroupMetodo.add(rbSimpson3_8);
        rbSimpson3_8.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        rbSimpson3_8.setText("Simpson 3/8");
        rbSimpson3_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSimpson3_8ActionPerformed(evt);
            }
        });

        buttonGroupMetodo.add(rbBoole);
        rbBoole.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        rbBoole.setText("Jorge Boole");
        rbBoole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBooleActionPerformed(evt);
            }
        });

        buttonGroupMetodo.add(rbTrapezoidal);
        rbTrapezoidal.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        rbTrapezoidal.setText("Trapezoidal");
        rbTrapezoidal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTrapezoidalActionPerformed(evt);
            }
        });

        buttonGroupMetodo.add(rbSimpson_abierto);
        rbSimpson_abierto.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        rbSimpson_abierto.setText("Simpson Abierto");
        rbSimpson_abierto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSimpson_abiertoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMetodoLayout = new javax.swing.GroupLayout(panelMetodo);
        panelMetodo.setLayout(panelMetodoLayout);
        panelMetodoLayout.setHorizontalGroup(
            panelMetodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMetodoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMetodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMetodoLayout.createSequentialGroup()
                        .addComponent(rbSimpson1_3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelMetodoLayout.createSequentialGroup()
                        .addGroup(panelMetodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbTrapezoidal)
                            .addComponent(rbBoole)
                            .addComponent(rbSimpson_abierto)
                            .addComponent(rbSimpson3_8))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelMetodoLayout.setVerticalGroup(
            panelMetodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMetodoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbSimpson1_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbTrapezoidal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbBoole)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbSimpson_abierto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbSimpson3_8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelIntegral.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbIntegral.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lbIntegral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/integral.png"))); // NOI18N

        tfB.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tfB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tfA.setFont(new java.awt.Font("Trebuchet MS", 0, 10)); // NOI18N
        tfA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tfFuncion.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N

        lbN.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lbN.setText("interaciones");

        tfN.setText("0");

        lbDelta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbDelta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deltaicon.jpg"))); // NOI18N
        lbDelta.setFocusable(false);

        tfDelta.setEditable(false);
        tfDelta.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N

        btCalcular.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btCalcular.setMnemonic('c');
        btCalcular.setText("Solucion");
        btCalcular.setToolTipText("Hallar intergal.");
        btCalcular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });

        btAyuda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Help_icon-icons.com_73700.png"))); // NOI18N
        btAyuda.setMnemonic('a');
        btAyuda.setToolTipText("Ayuda");
        btAyuda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btAyuda.setFocusable(false);
        btAyuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAyuda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAyudaActionPerformed(evt);
            }
        });

        btCalcular1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btCalcular1.setMnemonic('c');
        btCalcular1.setText("Borrar todo");
        btCalcular1.setToolTipText("Hallar intergal.");
        btCalcular1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btCalcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        lbdx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dx.jpg"))); // NOI18N

        Exitbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/307612.png"))); // NOI18N
        Exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIntegralLayout = new javax.swing.GroupLayout(panelIntegral);
        panelIntegral.setLayout(panelIntegralLayout);
        panelIntegralLayout.setHorizontalGroup(
            panelIntegralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIntegralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelIntegralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIntegralLayout.createSequentialGroup()
                        .addComponent(lbIntegral)
                        .addGap(18, 18, 18)
                        .addGroup(panelIntegralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIntegralLayout.createSequentialGroup()
                                .addComponent(tfA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfN, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82))
                            .addGroup(panelIntegralLayout.createSequentialGroup()
                                .addGroup(panelIntegralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelIntegralLayout.createSequentialGroup()
                                        .addComponent(tfB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbDelta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfDelta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelIntegralLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(tfFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(lbdx)
                                .addGap(18, 18, 18))))
                    .addGroup(panelIntegralLayout.createSequentialGroup()
                        .addGroup(panelIntegralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelIntegralLayout.createSequentialGroup()
                                .addGroup(panelIntegralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btCalcular1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btAyuda)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelIntegralLayout.setVerticalGroup(
            panelIntegralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIntegralLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelIntegralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIntegralLayout.createSequentialGroup()
                        .addGroup(panelIntegralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbdx)
                            .addGroup(panelIntegralLayout.createSequentialGroup()
                                .addComponent(tfB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))
                            .addGroup(panelIntegralLayout.createSequentialGroup()
                                .addGroup(panelIntegralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbDelta, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfDelta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelIntegralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelIntegralLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(tfA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(panelIntegralLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelIntegralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbN)
                                    .addComponent(tfN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(lbIntegral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelIntegralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIntegralLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCalcular1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelIntegralLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btAyuda)))
                .addGap(18, 18, 18)
                .addComponent(Exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDesarrollo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 11))); // NOI18N

        scrollPaneDesarrollo.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla"));
        scrollPaneDesarrollo.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tableResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Xi", "f(x)", "Resultado"
            }
        ));
        tableResultado.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        scrollPaneDesarrollo.setViewportView(tableResultado);

        lbSumatoria.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lbSumatoria.setText("SUMA");

        lbResultado.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lbResultado.setText("RESULTADO");

        tfSumatoria.setEditable(false);
        tfSumatoria.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        tfSumatoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSumatoriaActionPerformed(evt);
            }
        });

        tfResultado.setEditable(false);
        tfResultado.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N

        javax.swing.GroupLayout panelDesarrolloLayout = new javax.swing.GroupLayout(panelDesarrollo);
        panelDesarrollo.setLayout(panelDesarrolloLayout);
        panelDesarrolloLayout.setHorizontalGroup(
            panelDesarrolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDesarrolloLayout.createSequentialGroup()
                .addGroup(panelDesarrolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDesarrolloLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panelDesarrolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbResultado)
                            .addComponent(lbSumatoria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDesarrolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSumatoria)
                            .addComponent(tfResultado)))
                    .addComponent(scrollPaneDesarrollo, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelDesarrolloLayout.setVerticalGroup(
            panelDesarrolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDesarrolloLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(scrollPaneDesarrollo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(45, 45, 45)
                .addGroup(panelDesarrolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSumatoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSumatoria))
                .addGap(51, 51, 51)
                .addGroup(panelDesarrolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbResultado))
                .addGap(64, 64, 64))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("CALCULADORA METODOS NUMERICOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelIntegral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelDesarrollo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(panelIntegral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelDesarrollo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMetodo.getAccessibleContext().setAccessibleName("Metodos");
        panelMetodo.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbSimpson1_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSimpson1_3ActionPerformed
        seleccionarRadioMetodo(1);
    }//GEN-LAST:event_rbSimpson1_3ActionPerformed

    private void rbSimpson3_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSimpson3_8ActionPerformed
        seleccionarRadioMetodo(2);
    }//GEN-LAST:event_rbSimpson3_8ActionPerformed

    private void rbBooleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBooleActionPerformed
        seleccionarRadioMetodo(3);
    }//GEN-LAST:event_rbBooleActionPerformed

    private void rbTrapezoidalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTrapezoidalActionPerformed
       seleccionarRadioMetodo(4);
    }//GEN-LAST:event_rbTrapezoidalActionPerformed

    private void rbSimpson_abiertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSimpson_abiertoActionPerformed
        seleccionarRadioMetodo(5);
    }//GEN-LAST:event_rbSimpson_abiertoActionPerformed

    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
       calcularIntegral();
    }//GEN-LAST:event_btCalcularActionPerformed

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        tfA.setText("");
        tfB.setText("");
        tfDelta.setText("");
        tfN.setText("0");
        tfFuncion.setText("");
        tfResultado.setText("");
        tfSumatoria.setText("");
        seleccionarRadioMetodo(1);
        borrarTabla();
    }//GEN-LAST:event_btNuevoActionPerformed

    private void btAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAyudaActionPerformed
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                final HelpDialog dialog = new HelpDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.dispose();
                    }
                });
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_btAyudaActionPerformed

    private void tfSumatoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSumatoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSumatoriaActionPerformed

    private void ExitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitbtnActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_ExitbtnActionPerformed

    public void seleccionarRadioMetodo(int index){
        if(index==4 || index == 5){
            lbN.setVisible(true);
            tfN.setVisible(true);
        }else{
            lbN.setVisible(false);
            tfN.setVisible(false);
            tfN.setText("0");
        }
    }
    
    @SuppressWarnings("CallToThreadDumpStack")
    private void calcularIntegral(){
        if(!validarValoresAyB()){
            return;
        }
        if(!validarValorN()){
            return;
        }
        double a = Double.parseDouble(tfA.getText().trim());
        double b = Double.parseDouble(tfB.getText().trim());
        int n = Integer.parseInt(tfN.getText().trim());
        if(a>=b){
            JOptionPane.showMessageDialog(this, "El valor de \"a\" no puede "
                    + "ser mayor ni igual que \"b\"", 
                    "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(n<=0 && (rbTrapezoidal.isSelected() || rbSimpson_abierto.isSelected())){
            JOptionPane.showMessageDialog(this, "El valor de \"N\" no puede "
                    + "ser menor ni igual que \"Cero (0)\"", 
                    "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(tfFuncion.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite el valor de la función", 
                    "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Clasificatoria metodo = getMetodo();
        ReturnDelta delta = new ReturnDelta(a, b, n, metodo);
        tfDelta.setText(RepositorioNumerico.formatDecimal(delta.getValor_delta(),
                "#,##0.00"));
        
        if(rbSimpson1_3.isSelected()){
            n = 3;
        }else if(rbSimpson3_8.isSelected()){
            n = 4;
        }else if(rbBoole.isSelected()){
            n = 5;
        }else if(rbTrapezoidal.isSelected()||rbSimpson_abierto.isSelected()){
            n = n+1;
        }
        
        try {
            ResolucionIntegral resolucionIntegral = new ResolucionIntegral(a, b, n, delta, metodo);
            List<Map> lista_sumatoria = resolucionIntegral.desarrolloSumatoria(tfFuncion.getText());
            borrarTabla();
            DefaultTableModel tableModel = (DefaultTableModel) tableResultado.getModel();
            double sumatoria = 0;
            for (int i = 0; i < lista_sumatoria.size(); i++) {
                Map map = lista_sumatoria.get(i);
                int producto = (Integer)map.get("producto");
                double xi =(Double) map.get("xi");
                double fxi = (Double)map.get("fxi");
                double resultado = (fxi*producto);
                sumatoria+=(resultado);
                tableModel.addRow(new Object[]{
                    RepositorioNumerico.formatDecimal(xi, "#,##0.00"),
                    (producto>1?producto+" * [ ":" [ ")+map.get("expresion")+" ]",
                    resultado
                });
            }
            double integral = ReturnIntegrall.resultadoIntegral(delta, sumatoria, metodo);
            
            tfSumatoria.setText(sumatoria+"");
            tfResultado.setText(integral+"");
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage(), 
                    "Error", JOptionPane.WARNING_MESSAGE);
        }
        
        
    }
    
    public void borrarTabla(){
        int rowCount = tableResultado.getRowCount();
        while(rowCount>0){
            DefaultTableModel tableModel = (DefaultTableModel) tableResultado.getModel();
            tableModel.removeRow(rowCount-1);
            rowCount--;
        }
    }
    
    public boolean validarValoresAyB(){
        if(tfA.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe digitar el valor de \"a\"", 
                    "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(tfB.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe digitar el valor de \"b\"", 
                    "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        try {
            Double.parseDouble(tfA.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El valor de \"a\" es invalido", 
                    "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        try {
            Double.parseDouble(tfB.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El valor de \"b\" es invalido", 
                    "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        return true;
    }
    public boolean validarValorN(){
        if(tfN.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe digitar el valor de \"N\"", 
                    "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        try {
            int n = Integer.parseInt(tfN.getText().trim());
            if((n % 2)!= 0 && rbSimpson_abierto.isSelected()){
                 JOptionPane.showMessageDialog(this, "Para simsomp abierto el valor de \"N\" debe ser par", 
                    "Error", JOptionPane.WARNING_MESSAGE);
                    return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El valor de \"N\" es invalido debe ser entero", 
                    "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        
        return true;
    }
    
    public Clasificatoria getMetodo(){
        if(rbSimpson1_3.isSelected()){
            return Clasificatoria.SIMPSON_1_3;
        }else if(rbSimpson3_8.isSelected()){
            return Clasificatoria.SIMPSON_3_8;
        }else if(rbBoole.isSelected()){
            return Clasificatoria.BOOLE;
        }else if(rbTrapezoidal.isSelected()){
            return Clasificatoria.TRAPEZOIDAL;
        }else if(rbSimpson_abierto.isSelected()){
            return Clasificatoria.SIMPSON_ABIERTO;
        }
        return Clasificatoria.SIMPSON_1_3;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exitbtn;
    private javax.swing.JButton btAyuda;
    private javax.swing.JButton btCalcular;
    private javax.swing.JButton btCalcular1;
    private javax.swing.ButtonGroup buttonGroupMetodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbDelta;
    private javax.swing.JLabel lbIntegral;
    private javax.swing.JLabel lbN;
    private javax.swing.JLabel lbResultado;
    private javax.swing.JLabel lbSumatoria;
    private javax.swing.JLabel lbdx;
    private javax.swing.JPanel panelDesarrollo;
    private javax.swing.JPanel panelIntegral;
    private javax.swing.JPanel panelMetodo;
    private javax.swing.JRadioButton rbBoole;
    private javax.swing.JRadioButton rbSimpson1_3;
    private javax.swing.JRadioButton rbSimpson3_8;
    private javax.swing.JRadioButton rbSimpson_abierto;
    private javax.swing.JRadioButton rbTrapezoidal;
    private javax.swing.JScrollPane scrollPaneDesarrollo;
    private javax.swing.JTable tableResultado;
    private javax.swing.JTextField tfA;
    private javax.swing.JTextField tfB;
    private javax.swing.JTextField tfDelta;
    private javax.swing.JTextField tfFuncion;
    private javax.swing.JTextField tfN;
    private javax.swing.JTextField tfResultado;
    private javax.swing.JTextField tfSumatoria;
    // End of variables declaration//GEN-END:variables
}