/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package book_store;

import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Yasasi
 */
public class Selling extends javax.swing.JFrame {

    /**
     * Creates new form Selling
     */
    public Selling() {
        initComponents();
        SelectBook();
        ShowDate();
    }

    public void ShowDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        Datelbl.setText(s.format(d));

    }
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Booktxt = new javax.swing.JTextField();
        Bid = new javax.swing.JTextField();
        PrintBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        ClearBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Datelbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        Qty = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Billtxt = new javax.swing.JTextArea();
        companylbl = new javax.swing.JLabel();
        agentlbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        closebtn = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(953, 695));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("BILLING");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("BILL ID");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("BOOK");

        Booktxt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        Bid.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Bid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BidActionPerformed(evt);
            }
        });

        PrintBtn.setBackground(new java.awt.Color(0, 102, 153));
        PrintBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PrintBtn.setForeground(new java.awt.Color(255, 255, 255));
        PrintBtn.setText("PRINT");
        PrintBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintBtnMouseClicked(evt);
            }
        });

        AddBtn.setBackground(new java.awt.Color(0, 102, 153));
        AddBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("ADD TO BILL");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 153));
        jLabel12.setText("BOOK LIST");
        jLabel12.setToolTipText("");

        ClearBtn.setBackground(new java.awt.Color(0, 102, 153));
        ClearBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(255, 255, 255));
        ClearBtn.setText("CLEAR");
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBtnMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setText("Seller");
        jLabel2.setToolTipText("");

        Datelbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Datelbl.setForeground(new java.awt.Color(204, 0, 51));
        Datelbl.setText("Date");
        Datelbl.setToolTipText("");

        BillTable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        BillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Book Name", "Author", "Price", "Quantity", "Details", "Company"
            }
        ));
        BillTable.setRowHeight(25);
        BillTable.setSelectionBackground(new java.awt.Color(0, 102, 153));
        BillTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(BillTable);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("QTY");

        Qty.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 153));
        jLabel14.setText("BILL");
        jLabel14.setToolTipText("");

        Billtxt.setColumns(20);
        Billtxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Billtxt.setRows(5);
        jScrollPane1.setViewportView(Billtxt);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Booktxt)
                            .addComponent(Bid)
                            .addComponent(Qty, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(38, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Datelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(397, 397, 397)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(330, 330, 330))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(AddBtn)
                        .addGap(58, 58, 58)
                        .addComponent(ClearBtn)
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(291, 291, 291))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Datelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel5)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel6)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Bid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Booktxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Qty, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn)
                    .addComponent(ClearBtn))
                .addGap(17, 17, 17)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PrintBtn)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("BILLING");
        AddBtn.getAccessibleContext().setAccessibleName("ADD ");

        companylbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        companylbl.setForeground(new java.awt.Color(0, 102, 153));
        companylbl.setText("COMPANY");
        companylbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                companylblMouseClicked(evt);
            }
        });

        agentlbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        agentlbl.setForeground(new java.awt.Color(0, 102, 153));
        agentlbl.setText("AGENT");
        agentlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agentlblMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("SELLING");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        closebtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        closebtn.setForeground(new java.awt.Color(0, 51, 153));
        closebtn.setText("X");
        closebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closebtnMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 153));
        jLabel8.setText("BOOKS");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(companylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agentlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(companylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(agentlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(closebtn)
                        .addGap(23, 23, 23)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void SelectBook() {
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookStordb", "users", "1234");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from users.BOOKS");
            BillTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void PrintBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintBtnMouseClicked

        try {

            Billtxt.print();
        } catch (Exception e) {
            e.printStackTrace();

        }


    }//GEN-LAST:event_PrintBtnMouseClicked


    private void companylblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_companylblMouseClicked
        new Company().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_companylblMouseClicked

    private void agentlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agentlblMouseClicked
        new Agents().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_agentlblMouseClicked

    private void BillTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillTableMouseClicked

        DefaultTableModel model = (DefaultTableModel) BillTable.getModel();
        int Myindex = BillTable.getSelectedRow();

        Booktxt.setText(model.getValueAt(Myindex, 1).toString());
        BookID = Integer.valueOf(model.getValueAt(Myindex, 0).toString());
        price = Integer.valueOf(model.getValueAt(Myindex, 3).toString());
    }//GEN-LAST:event_BillTableMouseClicked

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
        Bid.setText("");
        Booktxt.setText("");
        Qty.setText("");

    }//GEN-LAST:event_ClearBtnMouseClicked
    
    
    public void update(){
    
        int newQty;
        newQty = OldQty - Integer.valueOf(Qty.getText());
   try{
            
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookStordb", "users" ,"1234");
                String UpdateQuery = "Update users.BOOKS set QUANTITY = "+newQty+""+"where BOOKID = "+BookID;
                Statement Add = Con.createStatement();
                Add.executeUpdate(UpdateQuery);
//                JOptionPane.showMessageDialog(this, "Book Updated Successfully");
            }catch(SQLException e)
            {
                e.printStackTrace();
            }
            SelectBook();
        }
    
    int i = 0, price,BookID,OldQty;
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked

        if(Booktxt.getText().isEmpty() || Qty.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else{
        i++;
        update();
        if (i == 1) {
            Billtxt.setText(Billtxt.getText() + "              ***************************Book Store ***************************\n  "
                    + "\tID\tBOOK\tQTY\tPRICE\tTOTAL\n\t"
                    + " " + i + "\t" + Booktxt.getText() + "\t" + Qty.getText() + "\t" + price + "\t" + Integer.valueOf(Qty.getText()) * price + "\n\t");

        } else {
            Billtxt.setText(Billtxt.getText() + i + "\t" + Booktxt.getText() + "\t" + Qty.getText() + "\t" + price + "\t" + Integer.valueOf(Qty.getText()) * price + "\n\t");

        }

        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void BidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BidActionPerformed

    private void closebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseClicked
         System.exit(0);
    }//GEN-LAST:event_closebtnMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
            new Selling().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        new Books().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField Bid;
    private javax.swing.JTable BillTable;
    private javax.swing.JTextArea Billtxt;
    private javax.swing.JTextField Booktxt;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JLabel Datelbl;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JTextField Qty;
    private javax.swing.JLabel agentlbl;
    private javax.swing.JLabel closebtn;
    private javax.swing.JLabel companylbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
