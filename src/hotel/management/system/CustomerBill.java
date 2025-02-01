/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author METROPOLITAN
 */
public class CustomerBill extends javax.swing.JFrame {

    /**
     * Creates new form Customer_Bill
     */
    public CustomerBill() {
        initComponents();
        setTitle("Customer Bill");
        setResizable(false);
    }
    
    public PageFormat getPageFormat(PrinterJob pj)
{
    
    PageFormat pf = pj.defaultPage();
    Paper paper = pf.getPaper();    

    double middleHeight =8.0;  
    double headerHeight = 2.0;                  
    double footerHeight = 2.0;                  
    double width = convert_CM_To_PPI(8);      //printer know only point per inch.default value is 72ppi
    double height = convert_CM_To_PPI(headerHeight+middleHeight+footerHeight); 
    paper.setSize(width, height);
    paper.setImageableArea(                    
        0,
        10,
        width,            
        height - convert_CM_To_PPI(1)
    );   //define boarder size    after that print area width is about 180 points
            
    pf.setOrientation(PageFormat.PORTRAIT);           //select orientation portrait or landscape but for this time portrait
    pf.setPaper(paper);    

    return pf;
}
    
    protected static double convert_CM_To_PPI(double cm) {            
	        return toPPI(cm * 0.393600787);            
}
 
protected static double toPPI(double inch) {            
	        return inch * 72d;            
}






public class BillPrintable implements Printable {
    
   
    
    
  public int print(Graphics graphics, PageFormat pageFormat,int pageIndex) 
  throws PrinterException 
  {    
      
                
        
      int result = NO_SUCH_PAGE;    
        if (pageIndex == 0) {                    
        
            Graphics2D g2d = (Graphics2D) graphics;                    

            double width = pageFormat.getImageableWidth();                    
           
            g2d.translate((int) pageFormat.getImageableX(),(int) pageFormat.getImageableY()); 

            

            FontMetrics metrics=g2d.getFontMetrics(new Font("Arial",Font.BOLD,7));
            //int idLength=metrics.stringWidth("000000");
            //int idLength=metrics.stringWidth("00");
            int idLength=metrics.stringWidth("000");
            int amtLength=metrics.stringWidth("000000");
            int qtyLength=metrics.stringWidth("00000");
            int priceLength=metrics.stringWidth("000000");
            int prodLength=(int)width - idLength - amtLength - qtyLength - priceLength-17;

        //    int idPosition=0;
        //    int productPosition=idPosition + idLength + 2;
        //    int pricePosition=productPosition + prodLength +10;
        //    int qtyPosition=pricePosition + priceLength + 2;
        //    int amtPosition=qtyPosition + qtyLength + 2;
            
            int productPosition = 0;
            int discountPosition= prodLength+5;
            int pricePosition = discountPosition +idLength+10;
            int qtyPosition=pricePosition + priceLength + 4;
            int amtPosition=qtyPosition + qtyLength;
            
            
              
        try{
            /*Draw Header*/
            int y=20;
            int yShift = 10;
            int headerRectHeight=15;
            int headerRectHeighta=40;
            
            ///////////////// Product names Get ///////////
                String cusNa = Label3.getText();
                String roomNu = Label4.getText();
                String roomTy = Label5.getText();
                String roomPr = Label6.getText();
                String traCh = Label7.getText();
            ///////////////// Product names Get ///////////
                
            
            ///////////////// Product price Get ///////////
                String cusName = TextField1.getText();
                String roomNumber = TextField2.getText();
                String roomType = TextField3.getText();
                int roomPrice = Integer.valueOf(TextField4.getText());
                int traCharges = Integer.valueOf(TextField5.getText());
                int sum = roomPrice + traCharges;
            ///////////////// Product price Get ///////////
                
            g2d.setFont(new Font("Monospaced",Font.PLAIN,9));
            g2d.drawString("-------------------------------------",12,y);y+=yShift;
            g2d.drawString("           Hotel Bill Receipt        ",12,y);y+=yShift;
            g2d.drawString("-------------------------------------",12,y);y+=headerRectHeight;
      
            g2d.drawString("-------------------------------------",10,y);y+=yShift;
            g2d.drawString(" Details                T.Price ",10,y);y+=yShift;
            g2d.drawString("-------------------------------------",10,y);y+=headerRectHeight;
            g2d.drawString(" "+cusNa+"             "+cusName+" ",10,y);y+=yShift;
            g2d.drawString(" "+roomNu+"            "+roomNumber+" ",10,y);y+=yShift;
            g2d.drawString(" "+roomTy+"            "+roomType+" ",10,y);y+=yShift;
            g2d.drawString(" "+roomPr+"            "+roomPrice+" ",10,y);y+=yShift;
            g2d.drawString(" "+traCh+"             "+traCharges+" ",10,y);y+=yShift;
            g2d.drawString("-------------------------------------",10,y);y+=yShift;
            g2d.drawString(" Total amount:          "+sum+"  ",10,y);y+=yShift;
            g2d.drawString("-------------------------------------",10,y);y+=yShift;
            g2d.drawString("             CONTACT US              ",10,y);y+=yShift;
            g2d.drawString("             0724430497              ",10,y);y+=yShift;
            g2d.drawString("*************************************",10,y);y+=yShift;
            g2d.drawString("    THANKS TO VISIT OUR HOTEL        ",10,y);y+=yShift;
            g2d.drawString("            COME AGAIN               ",10,y);y+=yShift;
            g2d.drawString("*************************************",10,y);y+=yShift;
                   
           
             
           
            
//            g2d.setFont(new Font("Monospaced",Font.BOLD,10));
//            g2d.drawString("Customer Shopping Invoice", 30,y);y+=yShift; 
          

    }
    catch(Exception r){
    r.printStackTrace();
    }

              result = PAGE_EXISTS;    
          }    
          return result;    
      }
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
        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        Label4 = new javax.swing.JLabel();
        Label5 = new javax.swing.JLabel();
        Label6 = new javax.swing.JLabel();
        Label7 = new javax.swing.JLabel();
        ComboBox1 = new javax.swing.JComboBox<>();
        TextField1 = new javax.swing.JTextField();
        TextField2 = new javax.swing.JTextField();
        TextField3 = new javax.swing.JTextField();
        TextField4 = new javax.swing.JTextField();
        TextField5 = new javax.swing.JTextField();
        ButtonCheck = new javax.swing.JButton();
        ButtonPrint = new javax.swing.JButton();
        ButtonBack = new javax.swing.JButton();
        ButtonSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Label1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Label1.setText("Billing System");

        Label2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label2.setText("Customer ID");

        Label3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label3.setText("Customer Name");

        Label4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label4.setText("Room Number");

        Label5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label5.setText("Room Type");

        Label6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label6.setText("Room Price");

        Label7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label7.setText("Transport Charges");

        ComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        TextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        TextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        TextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        TextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        TextField5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        ButtonCheck.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ButtonCheck.setText("Check");
        ButtonCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCheckActionPerformed(evt);
            }
        });

        ButtonPrint.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ButtonPrint.setText("Print");
        ButtonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPrintActionPerformed(evt);
            }
        });

        ButtonBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ButtonBack.setText("Back");
        ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackActionPerformed(evt);
            }
        });

        ButtonSave.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ButtonSave.setText("Save");
        ButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(138, 138, 138))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ButtonBack)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextField1)
                            .addComponent(TextField2)
                            .addComponent(TextField3)
                            .addComponent(TextField4)
                            .addComponent(ComboBox1, 0, 350, Short.MAX_VALUE)
                            .addComponent(TextField5)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(ButtonCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonPrint)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonSave)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label2)
                    .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label3)
                    .addComponent(TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label4)
                    .addComponent(TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label5)
                    .addComponent(TextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label6)
                    .addComponent(TextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label7)
                    .addComponent(TextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCheck)
                    .addComponent(ButtonPrint)
                    .addComponent(ButtonBack)
                    .addComponent(ButtonSave))
                .addGap(30, 30, 30))
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

        setSize(new java.awt.Dimension(818, 647));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
        HotelReception hrec = new HotelReception();
        hrec.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonBackActionPerformed

    private void ButtonCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCheckActionPerformed
        String cusId = (String)ComboBox1.getSelectedItem();
        String room = null;
        
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/projecthms","root","root");
                Statement stmt = (Statement)conn.createStatement();
                
                String str = "select * from customer where Number = '"+cusId+"'";
                stmt.executeQuery(str);
                ResultSet resultset = stmt.executeQuery(str);
                
                while(resultset.next()) {
                TextField1.setText(resultset.getString("Name"));
                TextField2.setText(resultset.getString("Room"));
                room = resultset.getString("Room");
                }
                
                String stri = "select * from rooms where Room_Number = '"+room+"'";
                stmt.executeQuery(stri);
                ResultSet resultset1 = stmt.executeQuery(stri);
                
                while(resultset1.next()) {
                TextField3.setText(resultset1.getString("Room_Type"));
                TextField4.setText(resultset1.getString("Price"));
                }
                
            } catch (Exception e) {
                System.out.println(e);
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() ,"Error", 1);
        }
    }//GEN-LAST:event_ButtonCheckActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/projecthms","root","root");
            Statement stmt = (Statement)conn.createStatement();
            
            String str = "select * from customer";
            stmt.executeQuery(str);
            ResultSet resultset = stmt.executeQuery(str);
            
            while(resultset.next()) {
                ComboBox1.addItem(resultset.getString("Number"));
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() ,"Error", 1);
        }
    }//GEN-LAST:event_formWindowOpened

    private void ButtonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPrintActionPerformed
        PrinterJob pj = PrinterJob.getPrinterJob();        
        pj.setPrintable(new BillPrintable(),getPageFormat(pj));
        try {
             pj.print();
          
        }
         catch (PrinterException ex) {
                 ex.printStackTrace();
        }
    }//GEN-LAST:event_ButtonPrintActionPerformed

    private void ButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSaveActionPerformed
        String idNummber = (String)ComboBox1.getSelectedItem();
        String cusName = TextField1.getText();
        String roomNumber = TextField2.getText();
        String roomType = TextField3.getText();
        int roomPrice = Integer.parseInt(TextField4.getText());
        int transportChar = Integer.parseInt(TextField5.getText());
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/projecthms","root","root");
            Statement stmt = (Statement)conn.createStatement();
            
            String insert = "INSERT INTO bill_records" + "(Cus_ID_Number,Cus_Name,Room_Number,Room_Type,Room_Price,Tran_Charges) VALUES"
                    + "('"+idNummber+"','"+cusName+"','"+roomNumber+"','"+roomType+"','"+roomPrice+"','"+transportChar+"');";
            
            try {
                stmt.executeUpdate(insert);
                JOptionPane.showMessageDialog(null, "Bill Record Added");
                new HotelReception().setVisible(true);
                this.setVisible(false);
                
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() ,"Error", 1);
        }
    }//GEN-LAST:event_ButtonSaveActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonCheck;
    private javax.swing.JButton ButtonPrint;
    private javax.swing.JButton ButtonSave;
    private javax.swing.JComboBox<String> ComboBox1;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    private javax.swing.JLabel Label6;
    private javax.swing.JLabel Label7;
    private javax.swing.JTextField TextField1;
    private javax.swing.JTextField TextField2;
    private javax.swing.JTextField TextField3;
    private javax.swing.JTextField TextField4;
    private javax.swing.JTextField TextField5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
