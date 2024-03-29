/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Dimension;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author willi
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuRole = new javax.swing.JMenuItem();
        jMenuProductCategory = new javax.swing.JMenuItem();
        jMenuEmployee = new javax.swing.JMenuItem();
        jMenuItemProduction = new javax.swing.JMenuItem();
        jMenuProduct = new javax.swing.JMenuItem();
        jMenuService = new javax.swing.JMenuItem();
        jMenuSector = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastrar");

        jMenuRole.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuRole.setText("Cargo");
        jMenuRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRoleActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuRole);

        jMenuProductCategory.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuProductCategory.setText("Categoria produto");
        jMenuProductCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuProductCategoryActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuProductCategory);

        jMenuEmployee.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuEmployee.setText("Funcionario");
        jMenuEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEmployeeActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuEmployee);

        jMenuItemProduction.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItemProduction.setText("Produção");
        jMenuItemProduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProductionActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemProduction);

        jMenuProduct.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuProduct.setText("Produto");
        jMenuProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuProductActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuProduct);

        jMenuService.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jMenuService.setText("Serviço");
        jMenuService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuServiceActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuService);

        jMenuSector.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        jMenuSector.setText("Setor");
        jMenuSector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSectorActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuSector);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Registro");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        jMenuItem1.setText("Produção");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRoleActionPerformed
        this.role = new RoleScreen();
        this.jDesktopPane1.add(this.role);
        Dimension desktopSize = this.jDesktopPane1.getSize();
        Dimension jInternalFrameSize = this.role.getSize();
        this.role.setLocation((desktopSize.width - jInternalFrameSize.width) / 2, (desktopSize.height - jInternalFrameSize.height) / 2);
        this.role.setTitle("Cadastro Cargo");
        this.role.setResizable(false);
        this.role.requestFocus();
        this.role.grabFocus();
        this.role.show();
    }//GEN-LAST:event_jMenuRoleActionPerformed

    private void jMenuProductCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuProductCategoryActionPerformed
        this.category = new ProductCategoryScreen();
        this.jDesktopPane1.add(this.category);
        Dimension desktopSize = this.jDesktopPane1.getSize();
        Dimension jInternalFrameSize = this.category.getSize();
        this.category.setLocation((desktopSize.width - jInternalFrameSize.width) / 2, (desktopSize.height - jInternalFrameSize.height) / 2);
        this.category.setTitle("Cadastro Categoria produto");
        this.category.setResizable(false);
        this.category.requestFocus();
        this.category.show();
    }//GEN-LAST:event_jMenuProductCategoryActionPerformed

    private void jMenuEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEmployeeActionPerformed
        this.employee = new EmployeeScreen();
        Dimension desktopSize = this.jDesktopPane1.getSize();
        Dimension jInternalFrameSize = this.employee.getSize();
        this.employee.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,(desktopSize.height - jInternalFrameSize.height) / 2);
        this.jDesktopPane1.add(this.employee);
        this.employee.setTitle("Cadastro empregados");
        this.employee.setResizable(false);
        this.employee.show();
    }//GEN-LAST:event_jMenuEmployeeActionPerformed

    private void jMenuProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuProductActionPerformed
        this.product = new ProductScreen();
        Dimension desktopSize = this.jDesktopPane1.getSize();
        Dimension jInternalFrameSize = this.product.getSize();
        this.product.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,(desktopSize.height - jInternalFrameSize.height) / 2);
        this.jDesktopPane1.add(this.product);
        this.product.setTitle("Cadastro Produtos");
        this.product.setResizable(false);
        this.product.show();

    }//GEN-LAST:event_jMenuProductActionPerformed

    private void jMenuServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuServiceActionPerformed
        this.service = new ServiceScreen();
        Dimension desktopSize = this.jDesktopPane1.getSize();
        Dimension jInternalFrameSize = this.service.getSize();
        this.service.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,(desktopSize.height - jInternalFrameSize.height) / 2);
        this.jDesktopPane1.add(this.service);
        this.service.setTitle("Cadastro Serviços");
        this.service.setResizable(false);
        this.service.show();
    }//GEN-LAST:event_jMenuServiceActionPerformed

    private void jMenuSectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSectorActionPerformed
        this.sector = new SectorScreen();
        Dimension desktopSize = this.jDesktopPane1.getSize();
        Dimension jInternalFrameSize = this.sector.getSize();
        this.sector.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,(desktopSize.height - jInternalFrameSize.height) / 2);
        this.jDesktopPane1.add(this.sector);
        this.sector.setTitle("Cadastro empregados");
        this.sector.setResizable(false);
        this.sector.show();
    }//GEN-LAST:event_jMenuSectorActionPerformed

    private void jMenuItemProductionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProductionActionPerformed
        this.production = new ProductionScreen();
        Dimension desktopSize = this.jDesktopPane1.getSize();
        Dimension jInternalFrameSize = this.production.getSize();
        this.production.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,(desktopSize.height - jInternalFrameSize.height) / 2);
        this.jDesktopPane1.add(this.production);
        this.production.setTitle("Cadastro empregados");
        this.production.setResizable(false);
        this.production.show();
    }//GEN-LAST:event_jMenuItemProductionActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.productionrecord = new ProductionrecordScreen();
        Dimension desktopSize = this.jDesktopPane1.getSize();
        Dimension jInternalFrameSize = this.productionrecord.getSize();
        this.productionrecord.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,(desktopSize.height - jInternalFrameSize.height) / 2);
        this.jDesktopPane1.add(this.productionrecord);
        this.productionrecord.setTitle("Cadastro empregados");
        this.productionrecord.setResizable(false);
        this.productionrecord.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private SectorScreen sector;
    private RoleScreen role;
    private EmployeeScreen employee;
    private ServiceScreen service;
    private ProductCategoryScreen category;
    private ProductScreen product;
    private ProductionScreen production;
    private ProductionrecordScreen productionrecord;

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuEmployee;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemProduction;
    private javax.swing.JMenuItem jMenuProduct;
    private javax.swing.JMenuItem jMenuProductCategory;
    private javax.swing.JMenuItem jMenuRole;
    private javax.swing.JMenuItem jMenuSector;
    private javax.swing.JMenuItem jMenuService;
    // End of variables declaration//GEN-END:variables
}
