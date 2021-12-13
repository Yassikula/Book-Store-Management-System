/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package book_store;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.print.attribute.standard.MediaName;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Books extends javax.swing.JFrame {

    /**
     * Creates new form Books
     */
    public Books() {
        initComponents();
        SelectBook();
        GetCompany();
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BookName = new javax.swing.JTextField();
        BookID = new javax.swing.JTextField();
        BookPrice = new javax.swing.JTextField();
        Author = new javax.swing.JTextField();
        Quantity = new javax.swing.JTextField();
        Details = new javax.swing.JTextField();
        UpdateBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        BookTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        CompCb = new javax.swing.JComboBox<>();
        DeleteBtn1 = new javax.swing.JButton();
        companylbl = new javax.swing.JLabel();
        agentlbl = new javax.swing.JLabel();
        closebtn = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(953, 695));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("MANAGE BOOKS");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("ID");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("BOOK NAME");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("PRICE");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("QUANTITY");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("DETAILS");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("AUTHOR");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("COMPANY");

        BookName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        BookID.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        BookPrice.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        Author.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        Quantity.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        Details.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

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

        BookTable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        BookTable.setModel(new javax.swing.table.DefaultTableModel(
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
        BookTable.setRowHeight(25);
        BookTable.setSelectionBackground(new java.awt.Color(0, 102, 153));
        BookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BookTable);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 153));
        jLabel12.setText("BOOK LIST");
        jLabel12.setToolTipText("");

        CompCb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        DeleteBtn1.setBackground(new java.awt.Color(0, 102, 153));
        DeleteBtn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DeleteBtn1.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn1.setText("DELETE");
        DeleteBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtn1MouseClicked(evt);
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
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BookPrice)
                    .addComponent(Author)
                    .addComponent(BookName)
                    .addComponent(BookID))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CompCb, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Quantity, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addComponent(Details)))
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(221, 221, 221))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(301, 301, 301))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(AddBtn)
                        .addGap(18, 18, 18)
                        .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteBtn1)
                        .addGap(18, 18, 18)
                        .addComponent(ClearBtn)
                        .addGap(139, 139, 139))))
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
                            .addComponent(BookID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BookName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Author, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BookPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Details, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CompCb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn)
                    .addComponent(UpdateBtn)
                    .addComponent(ClearBtn)
                    .addComponent(DeleteBtn1))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        closebtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        closebtn.setForeground(new java.awt.Color(0, 51, 153));
        closebtn.setText("X");
        closebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closebtnMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 153));
        jLabel13.setText("SELLING");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(companylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(agentlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(companylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(agentlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(closebtn)
                        .addGap(30, 30, 30)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void SelectBook()
{
    try{
    Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookStordb", "users" ,"1234");
    St = Con.createStatement();
    Rs = St.executeQuery("Select * from users.BOOKS");
    BookTable.setModel(DbUtils.resultSetToTableModel(Rs)); 
        }catch(SQLException e)
        {
                e.printStackTrace();
        }
}
    public void GetCompany()
    {
        try{
        Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookStordb", "users" ,"1234");
        St = Con.createStatement();
        String query = "Select * from users.COMPANY";
        Rs = St.executeQuery(query);
        while(Rs.next()){
            String Mycomp = Rs.getString("CName");
            CompCb.addItem(Mycomp);
        
        }

        }catch(SQLException e)
        {
         e.printStackTrace();
        }
    }

    
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookStordb", "users" ,"1234");
            PreparedStatement add = Con.prepareStatement("Insert into BOOKS values(?,?,?,?,?,?,?)");
            add.setInt(1, Integer.valueOf(BookID.getText()));
            add.setString(2,BookName.getText());
            add.setString(3,Author.getText());  
            add.setInt(4, Integer.valueOf(BookPrice.getText()));
            add.setInt(5, Integer.valueOf(Quantity.getText()));
            add.setString(6, Details.getText());
            add.setString(7,CompCb.getSelectedItem().toString());

            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Book Successfully added");
            Con.close();
            SelectBook();
                
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
          BookID.setText("");
        BookName.setText("");        
        Author.setText("");
        BookPrice.setText("");
        Quantity.setText("");
        Details.setText("");        
        

    }//GEN-LAST:event_ClearBtnMouseClicked

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
       
        if(BookID.getText().isEmpty() || BookName.getText().isEmpty() || Author.getText().isEmpty() || BookPrice.getText().isEmpty() || Quantity.getText().isEmpty() || Details.getText().isEmpty())
                {
                
            JOptionPane.showMessageDialog(this, "Missing Information");
                }
                
         else
        {
            try{
            
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookStordb", "users" ,"1234");
                String UpdateQuery = "Update users.BOOKS set BookName = '"+BookName.getText()+"',Author = '"+Author.getText()+"',BookPrice =" +BookPrice.getText()+",Quantity ="+Quantity.getText()+",Details ='" +Details.getText()+"',Company ='" +CompCb.getSelectedItem().toString()+"' where BOOKID = "+BookID.getText();
                Statement Add = Con.createStatement();
                Add.executeUpdate(UpdateQuery);
                JOptionPane.showMessageDialog(this, "Book Updated Successfully");
            }catch(SQLException e)
            {
                e.printStackTrace();
            }
            SelectBook();
        }
    }//GEN-LAST:event_UpdateBtnMouseClicked

    private void BookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookTableMouseClicked
     
         DefaultTableModel model = (DefaultTableModel)BookTable.getModel();
        int Myindex = BookTable.getSelectedRow();
        BookID.setText(model.getValueAt(Myindex,0).toString());       
        BookName.setText(model.getValueAt(Myindex,1).toString());        
        Author.setText(model.getValueAt(Myindex,2).toString());        
        BookPrice.setText(model.getValueAt(Myindex,3).toString());        
        Quantity.setText(model.getValueAt(Myindex,4).toString());        
        Details.setText(model.getValueAt(Myindex,5).toString());  
    }//GEN-LAST:event_BookTableMouseClicked

    private void DeleteBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtn1MouseClicked
        if (BookID.getText().isEmpty())
        {
         JOptionPane.showMessageDialog(this, "Enter the Book to be deleted");
        }
        else{
                try{
                    Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookStordb", "users" ,"1234");
                String ID = BookID.getText();
                String Query = "Delete from users.BOOKS where BookID="+ID;
                Statement Add =Con.createStatement();
                Add.executeUpdate(Query);
                SelectBook();
                    JOptionPane.showMessageDialog(this, "Book Deleted Successfully");
                }catch(SQLException e)
                {
                    e.printStackTrace();
                }
                
    }              
    }//GEN-LAST:event_DeleteBtn1MouseClicked

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

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
         new Selling().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

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
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Books().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField Author;
    private javax.swing.JTextField BookID;
    private javax.swing.JTextField BookName;
    private javax.swing.JTextField BookPrice;
    private javax.swing.JTable BookTable;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JComboBox<String> CompCb;
    private javax.swing.JButton DeleteBtn1;
    private javax.swing.JTextField Details;
    private javax.swing.JTextField Quantity;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel agentlbl;
    private javax.swing.JLabel closebtn;
    private javax.swing.JLabel companylbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
