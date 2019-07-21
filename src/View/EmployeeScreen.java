package View;

import Model.Employee;
import Model.MostrarJComboBox;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class EmployeeScreen extends javax.swing.JInternalFrame {

    public EmployeeScreen() {
        initComponents();
        this.formatarCampos();
        this.jcombobox.mostrarCargo(jComboBoxRole);
        this.jComboBoxRole.setMaximumRowCount(3);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxRole = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextDate = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jButtonSave = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setForeground(java.awt.Color.orange);
        setTitle("Cadastro Funcionarios");

        jLabel1.setText("Nome Completo: ");

        jTextFieldName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNameKeyPressed(evt);
            }
        });

        jLabel2.setText("Usuario: ");

        jTextFieldUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldUserKeyPressed(evt);
            }
        });

        jLabel3.setText("Cargo: ");

        jComboBoxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxRole.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBoxRoleKeyPressed(evt);
            }
        });

        jLabel4.setText("Data de ativação:");

        jFormattedTextDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFormattedTextDateKeyPressed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonSave.setText("Salvar");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        jButtonSave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonSaveKeyPressed(evt);
            }
        });

        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        jButtonCancel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonCancelKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText("Funcionarios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldName)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jComboBoxRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jFormattedTextDate, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxRole, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonCancelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonCancelKeyPressed
        if (evt.getKeyCode() == 10) {
            this.dispose();
        }
    }//GEN-LAST:event_jButtonCancelKeyPressed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        if (this.verifica()) {
            Employee funcionario = new Employee();
            funcionario.cadastro(this.jFormattedTextDate.getText(), this.jTextFieldName.getText(), this.jTextFieldUser.getText(), this.jComboBoxRole.getSelectedIndex());
            this.jTextFieldName.setText("");
            this.jFormattedTextDate.setText("");
            this.jTextFieldUser.setText("");
            this.jComboBoxRole.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonSaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonSaveKeyPressed
        if (evt.getKeyCode() == 10) {
            if (this.verifica()) {
                Employee funcionario = new Employee();
                funcionario.cadastro(this.jFormattedTextDate.getText(), this.jTextFieldName.getText(), this.jTextFieldUser.getText(), this.jComboBoxRole.getSelectedIndex());
                this.jTextFieldName.setText("");
                this.jFormattedTextDate.setText("");
                this.jTextFieldUser.setText("");
                this.jComboBoxRole.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_jButtonSaveKeyPressed

    private void jTextFieldNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNameKeyPressed
        if (evt.getKeyCode() == 10) {
            this.jTextFieldUser.requestFocus();
        }
    }//GEN-LAST:event_jTextFieldNameKeyPressed

    private void jTextFieldUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUserKeyPressed
        if (evt.getKeyCode() == 10) {
                this.jComboBoxRole.requestFocus();
        }
    }//GEN-LAST:event_jTextFieldUserKeyPressed

    private void jComboBoxRoleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxRoleKeyPressed
        if (evt.getKeyCode() == 10) {
                this.jFormattedTextDate.requestFocus();
        }
    }//GEN-LAST:event_jComboBoxRoleKeyPressed

    private void jFormattedTextDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextDateKeyPressed
        if (evt.getKeyCode() == 10) {
                this.jButtonSave.requestFocus();
        }
    }//GEN-LAST:event_jFormattedTextDateKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox<String> jComboBoxRole;
    private javax.swing.JFormattedTextField jFormattedTextDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables
    private final MostrarJComboBox jcombobox = new MostrarJComboBox();

    private boolean verifica() {
        if (this.jTextFieldName.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha o campo Nome Completo");
            this.jTextFieldName.requestFocus();
            return false;
        }
        if (this.jTextFieldUser.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha o campo Nome reduzido");
            this.jTextFieldUser.requestFocus();
            return false;
        }
        if (this.jFormattedTextDate.getText().equals("  /  /    ")) {
            JOptionPane.showMessageDialog(this, "Preencha o campo Data");
            this.jFormattedTextDate.requestFocus();
            return false;
        }
        if (this.jComboBoxRole.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Selecione o campo Cargo");
            this.jComboBoxRole.requestFocus();
            return false;
        }
        return true;
    }

    public final void formatarCampos() {

        try {
            MaskFormatter mask = new MaskFormatter("##/##/####");
            mask.install(this.jFormattedTextDate);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Não foi possivel formatar o texto");
        }

    }
}
