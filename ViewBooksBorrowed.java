/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.libmansystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class ViewBooksBorrowed extends javax.swing.JFrame {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    private JTable table;
    private JScrollPane scrollPane;
    
    public ViewBooksBorrowed(Connection con, PreparedStatement ps, ResultSet rs) {
        super("Display Records");
        this.con = con;
        this.ps = ps;
        this.rs = rs;
        initComponents();
        all_button.setSelected(true);
        member_button.setSelected(false);
        book_button.setSelected(false);
    }
    
    public void clearText(){
        member_id_input.setText("");
        book_isbn_input.setText("");
    }
    
    private void displayRecords() {
        try {
            // SQL query
            String sql;
            if (all_button.isSelected()){
                sql = "SELECT * FROM book";
                ps = con.prepareStatement(sql);
            }
            else if (member_button.isSelected()){
                sql = "SELECT * FROM book where memberID = ?";
                ps = con.prepareStatement(sql);
                ps.setString(1, member_id_input.getText());
            }
            else if (book_button.isSelected()){
                sql = "SELECT * FROM book where ISBN = ?";
                ps = con.prepareStatement(sql);
                ps.setString(1, book_isbn_input.getText());
            }
            
            // Create statement and execute query
            rs = ps.executeQuery();

            // Create table model to hold data from result set
            DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
            tableModel.setRowCount(0); // Clear existing rows

            // Populate table model with data from result set
            while (rs.next()) {
                Object[] row = {
                    rs.getString("copyID"),
                    rs.getString("ISBN"),
                    rs.getString("title"),
                    rs.getString("memberID"),
                    rs.getString("loan_Date").substring(0,10),
                    rs.getString("return_Date").substring(0,10)
                    // Add more columns as needed
                };
                tableModel.addRow(row);
            }

        } catch (SQLException e) {
            Logger.getLogger(ViewBooksBorrowed.class.getName()).log(Level.SEVERE, null, this);
            JOptionPane.showMessageDialog(this, "Error retrieving records from database.");
        }
    }
    
    
     private void clearAllTableRecords() {
        try {
            // Create table model to hold data from result set
            DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
            tableModel.setRowCount(0); // Clear existing rows

            // Populate table model with data from result set
            while (rs.next()) {
                Object[] row = {
                    "",
                    "",
                    "",
                    "",
                    "",
                    ""
                    // Add more columns as needed
                };
                tableModel.addRow(row);
            }

        } catch (SQLException e) {
            Logger.getLogger(ViewBooksBorrowed.class.getName()).log(Level.SEVERE, null, this);
            JOptionPane.showMessageDialog(this, "Error retrieving records from database.");
        }
    }
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        member_button = new javax.swing.JRadioButton();
        all_button = new javax.swing.JRadioButton();
        book_button = new javax.swing.JRadioButton();
        member_id_input = new javax.swing.JTextField();
        book_isbn_input = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CopyID", "ISBN", "Title", "MemberID", "Loan Date", "Return Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        member_button.setText("MemberID");
        member_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                member_buttonActionPerformed(evt);
            }
        });

        all_button.setText("All books borrowed");
        all_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                all_buttonActionPerformed(evt);
            }
        });

        book_button.setText("ISBN");
        book_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_buttonActionPerformed(evt);
            }
        });

        member_id_input.setText("Enter memberID");

        book_isbn_input.setText("Enter ISBN");
        book_isbn_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_isbn_inputActionPerformed(evt);
            }
        });

        jButton3.setText("go to main menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(book_button, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(member_button, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addComponent(all_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(member_id_input, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(book_isbn_input, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(member_id_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(book_isbn_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(all_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(member_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(book_button)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        displayRecords();
        clearText();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        clearAllTableRecords();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void book_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_buttonActionPerformed
        // TODO add your handling code here:
        all_button.setSelected(false);
        member_button.setSelected(false);
    }//GEN-LAST:event_book_buttonActionPerformed

    private void book_isbn_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_isbn_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book_isbn_inputActionPerformed

    private void all_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_all_buttonActionPerformed
        // TODO add your handling code here:
        book_button.setSelected(false);
        member_button.setSelected(false);
    }//GEN-LAST:event_all_buttonActionPerformed

    private void member_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_member_buttonActionPerformed
        // TODO add your handling code here:
        all_button.setSelected(false);
        book_button.setSelected(false);
    }//GEN-LAST:event_member_buttonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here
        dispose();
        MenuFrame homepage = new MenuFrame(con, ps, rs);
        homepage.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewBooksBorrowed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewBooksBorrowed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewBooksBorrowed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewBooksBorrowed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ViewBooksBorrowed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton all_button;
    private javax.swing.JRadioButton book_button;
    private javax.swing.JTextField book_isbn_input;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton member_button;
    private javax.swing.JTextField member_id_input;
    // End of variables declaration//GEN-END:variables
}
