/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author METROPOLITAN
 */
public class AddDrivers extends javax.swing.JFrame {

    /**
     * Creates new form AddDrivers
     */
    public AddDrivers() {
        initComponents();
        setTitle("Add Drivers");
        setResizable(false);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/eleven.jpg"));
        Image i2 = i1.getImage().getScaledInstance(450, 450, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(520, 50, 450, 450);
        add(l3);
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
        LabelAddDrivers = new javax.swing.JLabel();
        LabelName = new javax.swing.JLabel();
        LabelAge = new javax.swing.JLabel();
        LabelGender = new javax.swing.JLabel();
        LabelCarCompany = new javax.swing.JLabel();
        LabelCarBrand = new javax.swing.JLabel();
        LabelAvailable = new javax.swing.JLabel();
        LabelLocation = new javax.swing.JLabel();
        TextField1 = new javax.swing.JTextField();
        TextField2 = new javax.swing.JTextField();
        ComboBox1 = new javax.swing.JComboBox<>();
        TextField3 = new javax.swing.JTextField();
        TextField4 = new javax.swing.JTextField();
        ComboBox2 = new javax.swing.JComboBox<>();
        TextField5 = new javax.swing.JTextField();
        ButtonBack = new javax.swing.JButton();
        ButtonAdd = new javax.swing.JButton();
        ButtonClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        LabelAddDrivers.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LabelAddDrivers.setText("Add Drivers");

        LabelName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LabelName.setText("Name");

        LabelAge.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LabelAge.setText("Age");

        LabelGender.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LabelGender.setText("Gender");

        LabelCarCompany.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LabelCarCompany.setText("Car Company");

        LabelCarBrand.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LabelCarBrand.setText("Car Brand");

        LabelAvailable.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LabelAvailable.setText("Available");

        LabelLocation.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LabelLocation.setText("Location");

        TextField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        TextField2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        ComboBox1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        TextField3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        TextField4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        ComboBox2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        TextField5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        ButtonBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ButtonBack.setText("Back");
        ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackActionPerformed(evt);
            }
        });

        ButtonAdd.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ButtonAdd.setText("Add");
        ButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddActionPerformed(evt);
            }
        });

        ButtonClear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ButtonClear.setText("Clear");
        ButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LabelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelCarCompany, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelCarBrand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelAvailable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ButtonBack)
                                .addGap(28, 28, 28)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ButtonClear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(ButtonAdd))
                            .addComponent(TextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextField3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextField4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextField5, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(LabelAddDrivers, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(LabelAddDrivers, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelName)
                    .addComponent(TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelAge)
                    .addComponent(TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelGender)
                    .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCarCompany)
                    .addComponent(TextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCarBrand)
                    .addComponent(TextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelAvailable)
                    .addComponent(ComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelLocation)
                    .addComponent(TextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonBack)
                    .addComponent(ButtonAdd)
                    .addComponent(ButtonClear))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 523, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1018, 647));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonClearActionPerformed
        TextField1.setText("");
        TextField2.setText("");
        TextField3.setText("");
        TextField4.setText("");
        TextField5.setText("");
        ComboBox1.setSelectedIndex(0);
        ComboBox2.setSelectedIndex(0);
    }//GEN-LAST:event_ButtonClearActionPerformed

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
        HotelManagement homa = new HotelManagement();
        homa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonBackActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ComboBox1.addItem("Male");
        ComboBox1.addItem("Female");
        
        ComboBox2.addItem("Yes");
        ComboBox2.addItem("No");
    }//GEN-LAST:event_formWindowActivated

    private void ButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAddActionPerformed
        String name = TextField1.getText();
        String age = TextField2.getText();
        String gender = (String)ComboBox1.getSelectedItem();
        String company = TextField3.getText();
        String brand = TextField4.getText();
        String available = (String)ComboBox2.getSelectedItem();
        String location = TextField5.getText();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/projecthms","root","root");
            Statement stmt = (Statement)conn.createStatement();
            
            String insert = "INSERT INTO driver" + "(Name,Age,Gender,Company,Brand,Available,Location) VALUES"
                    + "('"+name+"','"+age+"','"+gender+"','"+company+"','"+brand+"','"+available+"','"+location+"');";
            
            try {
                stmt.executeUpdate(insert);
                JOptionPane.showMessageDialog(null, "Driver Successfully Added");
                this.setVisible(true);
                
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() ,"Error", 1);
        }
    }//GEN-LAST:event_ButtonAddActionPerformed

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
            java.util.logging.Logger.getLogger(AddDrivers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDrivers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDrivers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDrivers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDrivers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAdd;
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonClear;
    private javax.swing.JComboBox<String> ComboBox1;
    private javax.swing.JComboBox<String> ComboBox2;
    private javax.swing.JLabel LabelAddDrivers;
    private javax.swing.JLabel LabelAge;
    private javax.swing.JLabel LabelAvailable;
    private javax.swing.JLabel LabelCarBrand;
    private javax.swing.JLabel LabelCarCompany;
    private javax.swing.JLabel LabelGender;
    private javax.swing.JLabel LabelLocation;
    private javax.swing.JLabel LabelName;
    private javax.swing.JTextField TextField1;
    private javax.swing.JTextField TextField2;
    private javax.swing.JTextField TextField3;
    private javax.swing.JTextField TextField4;
    private javax.swing.JTextField TextField5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
