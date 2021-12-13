/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package book_store;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Yasasi
 */
public class Agents extends javax.swing.JFrame {

    /**
     * Creates new form Agents
     */
    public Agents() {
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        AgentName = new javax.swing.JTextField();
        AgentID = new javax.swing.JTextField();
        AgentAge = new javax.swing.JTextField();
        AgentPhone = new javax.swing.JTextField();
        AgentPassword = new javax.swing.JTextField();
        AgentGender = new javax.swing.JComboBox<>();
        UpdateBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AgentTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JButton();
        closebtn = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        booklbl = new javax.swing.JLabel();
        companylbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(953, 695));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("MANAGE AGENTS");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("ID");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("AGENT NAME");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("PHONE");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("PASSWORD");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("AGE");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("GENDER");

        AgentName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        AgentID.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        AgentAge.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        AgentPhone.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        AgentPassword.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        AgentGender.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AgentGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

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

        ClearBtn.setBackground(new java.awt.Color(0, 102, 153));
        ClearBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(255, 255, 255));
        ClearBtn.setText("CLEAR");
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBtnMouseClicked(evt);
            }
        });
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });

        AgentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Agent ID", "Agent Name", "Agent Age", "Agent Phone", "Password", "Gender"
            }
        ));
        AgentTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        AgentTable.setRowHeight(25);
        AgentTable.setSelectionBackground(new java.awt.Color(0, 102, 153));
        AgentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(AgentTable);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 153));
        jLabel12.setText("AGENT LIST");
        jLabel12.setToolTipText("");

        DeleteBtn.setBackground(new java.awt.Color(0, 102, 153));
        DeleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("DELETE");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AgentAge)
                    .addComponent(AgentName)
                    .addComponent(AgentID))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AgentPhone)
                    .addComponent(AgentPassword)
                    .addComponent(AgentGender, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(AddBtn)
                        .addGap(18, 18, 18)
                        .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteBtn)
                        .addGap(18, 18, 18)
                        .addComponent(ClearBtn)
                        .addGap(147, 147, 147))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(221, 221, 221))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(306, 306, 306))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel11))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AgentID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AgentName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AgentAge, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(AgentPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AgentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AgentGender, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn)
                    .addComponent(UpdateBtn)
                    .addComponent(DeleteBtn)
                    .addComponent(ClearBtn))
                .addGap(48, 48, 48)
                .addComponent(jLabel12)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        closebtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        closebtn.setForeground(new java.awt.Color(0, 51, 153));
        closebtn.setText("X");
        closebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closebtnMouseClicked(evt);
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

        booklbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        booklbl.setForeground(new java.awt.Color(0, 102, 153));
        booklbl.setText("BOOKS");
        booklbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booklblMouseClicked(evt);
            }
        });

        companylbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        companylbl.setForeground(new java.awt.Color(0, 102, 153));
        companylbl.setText("COMPANY");
        companylbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                companylblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(companylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(booklbl, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(closebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(companylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(booklbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(closebtn)
                        .addGap(31, 31, 31)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
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
    Rs = St.executeQuery("Select * from users.AGENT");
    AgentTable.setModel(DbUtils.resultSetToTableModel(Rs)); 
        }catch(SQLException e)
        {
                e.printStackTrace();
        }
}
     
    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookStordb", "users" ,"1234");
            PreparedStatement add = Con.prepareStatement("Insert into AGENT values(?,?,?,?,?,?)");
            add.setInt(1, Integer.valueOf(AgentID.getText()));
            add.setString(2,AgentName.getText());
            add.setInt(3,Integer.valueOf(AgentAge.getText()));  
            add.setString(4, AgentPhone.getText());
            add.setString(5,AgentPassword.getText());
            add.setString(6,AgentGender.getSelectedItem().toString());

            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Agent Successfully added");
            Con.close();
            SelectBook();
                
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
          if (AgentID.getText().isEmpty())
        {
         JOptionPane.showMessageDialog(this, "Enter the Agent to be deleted");
        }
        else{
                try{
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookStordb", "users" ,"1234");
                String ID = AgentID.getText();
                String Query = "Delete from users.AGENT where AgentID="+ID;
                Statement Add =Con.createStatement();
                Add.executeUpdate(Query);
                SelectBook();
                    JOptionPane.showMessageDialog(this, "Agent Deleted Successfully");
                }catch(SQLException e)
                {
                    e.printStackTrace();
                }
          }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
      
        AgentID.setText("");
        AgentName.setText("");
        AgentAge.setText("");
        AgentPhone.setText("");
        AgentPassword.setText("");
        
                
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void AgentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgentTableMouseClicked
        
         DefaultTableModel model = (DefaultTableModel)AgentTable.getModel();
        int Myindex = AgentTable.getSelectedRow();
        AgentID.setText(model.getValueAt(Myindex,0).toString());       
        AgentName.setText(model.getValueAt(Myindex,1).toString());        
        AgentAge.setText(model.getValueAt(Myindex,2).toString());        
        AgentPhone.setText(model.getValueAt(Myindex,3).toString());        
        AgentPassword.setText(model.getValueAt(Myindex,4).toString());        
       
    }//GEN-LAST:event_AgentTableMouseClicked

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
       
         if(AgentID.getText().isEmpty() || AgentName.getText().isEmpty() || AgentAge.getText().isEmpty() || AgentPhone.getText().isEmpty() || AgentPassword.getText().isEmpty())
                {
                
            JOptionPane.showMessageDialog(this, "Missing Information");
                }
                
         else
        {
            try{
            
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookStordb", "users" ,"1234");
                String UpdateQuery = "Update users.AGENT set AgentName = '"+AgentName.getText()+"',AgentAge = "+AgentAge.getText()+",AgentPhone ='" +AgentPhone.getText()+"',AgentPassword = '"+AgentPassword.getText()+"',AgentGender ='" +AgentGender.getSelectedItem().toString()+"' where AgentID = "+AgentID.getText();
                Statement Add = Con.createStatement();
                Add.executeUpdate(UpdateQuery);
                JOptionPane.showMessageDialog(this, "Agent Updated Successfully");
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

    private void booklblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booklblMouseClicked
        new Books().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_booklblMouseClicked

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
            java.util.logging.Logger.getLogger(Agents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField AgentAge;
    private javax.swing.JComboBox<String> AgentGender;
    private javax.swing.JTextField AgentID;
    private javax.swing.JTextField AgentName;
    private javax.swing.JTextField AgentPassword;
    private javax.swing.JTextField AgentPhone;
    private javax.swing.JTable AgentTable;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel booklbl;
    private javax.swing.JLabel closebtn;
    private javax.swing.JLabel companylbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
