/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package book_store;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Yasasi
 */
public class Company extends javax.swing.JFrame {

    /**
     * Creates new form Company
     */
    public Company() {
        initComponents();
        SelectBook();
    }

    Connection Con = null;
    Statement  St = null;
    ResultSet Rs = null;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CName = new javax.swing.JTextField();
        CID = new javax.swing.JTextField();
        CPhone = new javax.swing.JTextField();
        CAddress = new javax.swing.JTextField();
        UpdateBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CompanyTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        ClearBtn = new javax.swing.JButton();
        companylbl = new javax.swing.JLabel();
        agentlbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        closebtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(953, 695));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("MANAGE COMPANY");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("ID");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("COMPANY NAME");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("PHONE");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("ADDRESS");

        CName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        CID.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        CPhone.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        CAddress.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        UpdateBtn.setBackground(new java.awt.Color(0, 102, 153));
        UpdateBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setText("UPDATE");
        UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseClicked(evt);
            }
        });

        AddBtn.setBackground(new java.awt.Color(0, 102, 153));
        AddBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("ADD");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(0, 102, 153));
        DeleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("DELETE");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });

        CompanyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CID", "CName", "CAddress", "CPhone"
            }
        ));
        CompanyTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        CompanyTable.setRowHeight(25);
        CompanyTable.setSelectionBackground(new java.awt.Color(0, 102, 153));
        CompanyTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CompanyTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CompanyTable);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 153));
        jLabel12.setText("COMPANY LIST");
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(221, 221, 221))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(CName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CPhone))
                        .addGap(183, 183, 183))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(AddBtn)
                        .addGap(18, 18, 18)
                        .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteBtn)
                        .addGap(18, 18, 18)
                        .addComponent(ClearBtn)))
                .addContainerGap(136, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn)
                    .addComponent(UpdateBtn)
                    .addComponent(DeleteBtn)
                    .addComponent(ClearBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(companylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agentlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(companylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(agentlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(closebtn)
                        .addGap(25, 25, 25)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
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

    public void SelectBook()
{
    try{
    Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookStordb", "users" ,"1234");
    St = Con.createStatement();
    Rs = St.executeQuery("Select * from users.COMPANY");
    CompanyTable.setModel(DbUtils.resultSetToTableModel(Rs)); 
        }catch(SQLException e)
        {
                e.printStackTrace();
        }
}
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
       
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookStordb", "users" ,"1234");
            PreparedStatement add = Con.prepareStatement("Insert into COMPANY values(?,?,?,?)");
            add.setInt(1, Integer.valueOf(CID.getText()));
            add.setString(2,CName.getText());
            add.setString(3,CAddress.getText());  
            add.setString(4, CPhone.getText());
            

            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Company Successfully added");
            Con.close();
            SelectBook();
                
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
      
        if (CID.getText().isEmpty())
        {
         JOptionPane.showMessageDialog(this, "Enter the Company to be deleted");
        }
        else{
                try{
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookStordb", "users" ,"1234");
                String ID = CID.getText();
                String Query = "Delete from users.COMPANY where CID="+ID;
                Statement Add =Con.createStatement();
                Add.executeUpdate(Query);
                SelectBook();
                    JOptionPane.showMessageDialog(this, "Company Deleted Successfully");
                }catch(SQLException e)
                {
                    e.printStackTrace();
                }
          }
                                    

                                  

    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void CompanyTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CompanyTableMouseClicked
          DefaultTableModel model = (DefaultTableModel)CompanyTable.getModel();
        int Myindex = CompanyTable.getSelectedRow();
        CID.setText(model.getValueAt(Myindex,0).toString());       
        CName.setText(model.getValueAt(Myindex,1).toString());        
        CAddress.setText(model.getValueAt(Myindex,2).toString());        
        CPhone.setText(model.getValueAt(Myindex,3).toString());        
            
       
    }//GEN-LAST:event_CompanyTableMouseClicked

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
        CID.setText("");
        CName.setText("");
        CAddress.setText("");
        CPhone.setText("");
        
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
        
        
        if(CID.getText().isEmpty() || CName.getText().isEmpty() || CAddress.getText().isEmpty() || CPhone.getText().isEmpty())
                {
                
            JOptionPane.showMessageDialog(this, "Missing Information");
                }
                
         else
        {
            try{
            
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookStordb", "users" ,"1234");
                String UpdateQuery = "Update users.COMPANY set CName = '"+CName.getText()+"',CAddress = '"+CAddress.getText()+"',CPhone ='" +CPhone.getText()+"' where CID = "+CID.getText();
                Statement Add = Con.createStatement();
                Add.executeUpdate(UpdateQuery);
                JOptionPane.showMessageDialog(this, "Company Updated Successfully");
            }catch(SQLException e)
            {
                e.printStackTrace();
            }
            SelectBook();
        }
    }//GEN-LAST:event_UpdateBtnMouseClicked

    private void companylblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_companylblMouseClicked
        new Company().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_companylblMouseClicked

    private void agentlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agentlblMouseClicked
        new Agents().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_agentlblMouseClicked

    private void closebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseClicked
       System.exit(0);
    }//GEN-LAST:event_closebtnMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       new Selling().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Company().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField CAddress;
    private javax.swing.JTextField CID;
    private javax.swing.JTextField CName;
    private javax.swing.JTextField CPhone;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JTable CompanyTable;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel agentlbl;
    private javax.swing.JLabel closebtn;
    private javax.swing.JLabel companylbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
