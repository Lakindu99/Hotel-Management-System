package hotel.management.system;

public class FrontPage extends javax.swing.JFrame {

    
    public FrontPage() {
        initComponents();
        setTitle("Front Page");
        setResizable(false);
        }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelImage = new javax.swing.JLabel();
        LabelHSM = new javax.swing.JLabel();
        ButtonNext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 117, -1, -1));

        LabelImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\METROPOLITAN\\Desktop\\Icons\\mydeal-lk-mahaweli-reach-kandy-01.jpg")); // NOI18N
        getContentPane().add(LabelImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        LabelHSM.setFont(new java.awt.Font("Serif", 0, 50)); // NOI18N
        LabelHSM.setForeground(new java.awt.Color(102, 102, 255));
        LabelHSM.setText("Hotel Management System");
        getContentPane().add(LabelHSM, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 13, 550, -1));

        ButtonNext.setFont(new java.awt.Font("Lucida Bright", 1, 30)); // NOI18N
        ButtonNext.setForeground(new java.awt.Color(51, 51, 51));
        ButtonNext.setText("NEXT");
        ButtonNext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNextActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 550, -1, -1));

        setSize(new java.awt.Dimension(745, 662));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNextActionPerformed
        Login log = new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonNextActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrontPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonNext;
    private javax.swing.JLabel LabelHSM;
    private javax.swing.JLabel LabelImage;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
