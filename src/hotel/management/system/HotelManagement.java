/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author METROPOLITAN
 */
public class HotelManagement extends javax.swing.JFrame {

    /**
     * Creates new form HotelManagement
     */
    public HotelManagement() {
        initComponents();
        setTitle("Hotel Management System");
        setResizable(false);
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
        LabelImage = new javax.swing.JLabel();
        MenuBar1 = new javax.swing.JMenuBar();
        MenuHotelManagement = new javax.swing.JMenu();
        MenuItemHotelReception = new javax.swing.JMenuItem();
        MenuAdmin = new javax.swing.JMenu();
        MenuItemAddEmployeeDetails = new javax.swing.JMenuItem();
        MenuItemAddRooms = new javax.swing.JMenuItem();
        MenuItemAddDrivers = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 1103));

        LabelImage.setIcon(new javax.swing.ImageIcon("D:\\Lakindu2020\\NetBeansProjects\\Hotel Management System\\src\\hotel\\management\\system\\icons\\89_full.jpg")); // NOI18N
        LabelImage.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(LabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 1038, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        MenuHotelManagement.setText("Hotel Management");
        MenuHotelManagement.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N

        MenuItemHotelReception.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        MenuItemHotelReception.setText("Hotel Reception");
        MenuItemHotelReception.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemHotelReceptionActionPerformed(evt);
            }
        });
        MenuHotelManagement.add(MenuItemHotelReception);

        MenuBar1.add(MenuHotelManagement);

        MenuAdmin.setText("Admin");
        MenuAdmin.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N

        MenuItemAddEmployeeDetails.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        MenuItemAddEmployeeDetails.setText("Add Employee Details");
        MenuItemAddEmployeeDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemAddEmployeeDetailsActionPerformed(evt);
            }
        });
        MenuAdmin.add(MenuItemAddEmployeeDetails);

        MenuItemAddRooms.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        MenuItemAddRooms.setText("Add Rooms");
        MenuItemAddRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemAddRoomsActionPerformed(evt);
            }
        });
        MenuAdmin.add(MenuItemAddRooms);

        MenuItemAddDrivers.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        MenuItemAddDrivers.setText("Add Drivers");
        MenuItemAddDrivers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemAddDriversActionPerformed(evt);
            }
        });
        MenuAdmin.add(MenuItemAddDrivers);

        MenuBar1.add(MenuAdmin);

        setJMenuBar(MenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1518, 1177));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemHotelReceptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemHotelReceptionActionPerformed
        HotelReception hrec = new HotelReception();
        hrec.setVisible(true);
    }//GEN-LAST:event_MenuItemHotelReceptionActionPerformed

    private void MenuItemAddEmployeeDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemAddEmployeeDetailsActionPerformed
        AddEmployeeDetails aed = new AddEmployeeDetails();
        aed.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuItemAddEmployeeDetailsActionPerformed

    private void MenuItemAddRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemAddRoomsActionPerformed
        AddRooms ar = new AddRooms();
        ar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuItemAddRoomsActionPerformed

    private void MenuItemAddDriversActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemAddDriversActionPerformed
        AddDrivers ad = new AddDrivers();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuItemAddDriversActionPerformed

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
            java.util.logging.Logger.getLogger(HotelManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HotelManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HotelManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HotelManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HotelManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImage;
    private javax.swing.JMenu MenuAdmin;
    private javax.swing.JMenuBar MenuBar1;
    private javax.swing.JMenu MenuHotelManagement;
    private javax.swing.JMenuItem MenuItemAddDrivers;
    private javax.swing.JMenuItem MenuItemAddEmployeeDetails;
    private javax.swing.JMenuItem MenuItemAddRooms;
    private javax.swing.JMenuItem MenuItemHotelReception;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
