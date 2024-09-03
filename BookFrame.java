/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.libmansystem;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class BookFrame extends javax.swing.JFrame {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
    public BookFrame(Connection con, PreparedStatement ps, ResultSet rs) {
        initComponents();
        this.con = con;
        this.ps = ps;
        this.rs = rs;
    }
    
    //close window
    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    
    //clear fields
    public void clearFields(){
        book_copy_id_input.setText("");
        book_isbn_input.setText("");
        book_title_input.setText("");
        book_genre_input.setText("");
        book_member_id_input.setText("");
        book_publisher_id_input.setText("");
        book_loan_date_input.setText("");
        book_return_date_input.setText("");
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        book_title_input = new javax.swing.JTextField();
        book_isbn_input = new javax.swing.JTextField();
        insert_book_button = new javax.swing.JButton();
        book_genre_input = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        book_member_id_input = new javax.swing.JTextField();
        search_book_button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        update_book_button = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        delete_book_button = new javax.swing.JButton();
        book_copy_id_input = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        book_publisher_id_input = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        book_return_date_input = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        book_loan_date_input = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel5.setText("BOOK INFORMATION");

        jButton1.setText("Go to main menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        book_title_input.setText("Enter..");
        book_title_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_title_inputActionPerformed(evt);
            }
        });

        book_isbn_input.setText("Enter..");
        book_isbn_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_isbn_inputActionPerformed(evt);
            }
        });

        insert_book_button.setText("Add Book");
        insert_book_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_book_buttonActionPerformed(evt);
            }
        });

        book_genre_input.setText("Enter..");
        book_genre_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_genre_inputActionPerformed(evt);
            }
        });

        jLabel2.setText("ISBN");

        jLabel3.setText("Title");

        book_member_id_input.setText("Enter..");
        book_member_id_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_member_id_inputActionPerformed(evt);
            }
        });

        search_book_button.setText("Search Book");
        search_book_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_book_buttonActionPerformed(evt);
            }
        });

        jLabel4.setText("Genre");

        update_book_button.setText("Update Book");
        update_book_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_book_buttonActionPerformed(evt);
            }
        });

        jLabel6.setText("MemberID");

        delete_book_button.setText("Delete Book");
        delete_book_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_book_buttonActionPerformed(evt);
            }
        });

        book_copy_id_input.setText("Enter..");
        book_copy_id_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_copy_id_inputActionPerformed(evt);
            }
        });

        jLabel1.setText("CopyID");

        book_publisher_id_input.setText("Enter..");
        book_publisher_id_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_publisher_id_inputActionPerformed(evt);
            }
        });

        jLabel7.setText("PublisherID");

        book_return_date_input.setText("Enter..");
        book_return_date_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_return_date_inputActionPerformed(evt);
            }
        });

        jLabel8.setText("Return Date");

        book_loan_date_input.setText("Enter..");
        book_loan_date_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_loan_date_inputActionPerformed(evt);
            }
        });

        jLabel9.setText("Loan Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(book_publisher_id_input, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(book_member_id_input, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(book_copy_id_input)
                                .addComponent(book_isbn_input)
                                .addComponent(book_title_input)
                                .addComponent(book_genre_input, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(book_return_date_input, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(book_loan_date_input, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(delete_book_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(insert_book_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update_book_button, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(search_book_button, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(book_copy_id_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(book_isbn_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(book_title_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(book_genre_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(book_member_id_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(book_publisher_id_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(book_loan_date_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(insert_book_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update_book_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete_book_button)
                        .addGap(35, 35, 35)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(book_return_date_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search_book_button)
                .addGap(2, 2, 2)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //close();
        dispose();
        MenuFrame homepage = new MenuFrame(con, ps, rs);
        homepage.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void book_title_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_title_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book_title_inputActionPerformed

    private void book_isbn_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_isbn_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book_isbn_inputActionPerformed

    private void insert_book_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_book_buttonActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "insert into book values(?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1,book_copy_id_input.getText());
            ps.setString(2,book_isbn_input.getText());
            ps.setString(3,book_title_input.getText());
            ps.setString(4,book_genre_input.getText());
            ps.setString(5,book_member_id_input.getText());
            ps.setString(6,book_publisher_id_input.getText());
            ps.setString(7,book_loan_date_input.getText());
            ps.setString(8,book_return_date_input.getText());
            ps.execute();
            JOptionPane.showMessageDialog(this,"Inserted!");
            clearFields();
        }
        catch (SQLException ex) {
            Logger.getLogger(BookFrame.class.getName()).log(Level.SEVERE,null, ex);
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }
    }//GEN-LAST:event_insert_book_buttonActionPerformed

    private void book_genre_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_genre_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book_genre_inputActionPerformed

    private void book_member_id_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_member_id_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book_member_id_inputActionPerformed

    private void search_book_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_book_buttonActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "select * from book where isbn = ? AND copyID = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, book_isbn_input.getText());
            ps.setString(2, book_copy_id_input.getText());
            rs = ps.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Book found!");
                String title= rs.getString("title");
                String genre= rs.getString("genre");
                String memberID = rs.getString("memberID");
                String publisherID = rs.getString("publisherID");
                String loanDate = rs.getString("loan_date");
                String returnDate = rs.getString("return_date");
                book_title_input.setText(title);
                book_genre_input.setText(genre);
                book_member_id_input.setText(memberID);
                book_publisher_id_input.setText(publisherID);
                book_loan_date_input.setText(loanDate.substring(0,10));
                book_return_date_input.setText(returnDate.substring(0,10));
            }
            else {
                JOptionPane.showMessageDialog(this, "Book not found!");
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(BookFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_search_book_buttonActionPerformed

    private void update_book_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_book_buttonActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "UPDATE book SET title = ?, genre = ?, memberID = ?, publisherID = ?, loan_date = ?, return_date = ? WHERE ISBN = ? AND copyID = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, book_title_input.getText());
            ps.setString(2, book_genre_input.getText());
            ps.setString(3, book_member_id_input.getText());
            ps.setString(4, book_publisher_id_input.getText());
            ps.setString(5, book_loan_date_input.getText());
            ps.setString(6, book_return_date_input.getText());
            ps.setString(7, book_isbn_input.getText());
            ps.setString(8, book_copy_id_input.getText());

            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Book updated successfully!");
                clearFields();
            } else {
                JOptionPane.showMessageDialog(this, "Book not found!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_update_book_buttonActionPerformed

    private void delete_book_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_book_buttonActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "DELETE from book where copyID = ? AND ISBN = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, book_copy_id_input.getText());
            ps.setString(2, book_isbn_input.getText());
            int updateCount=ps.executeUpdate();

            if (updateCount == 0) {
                // No rows were updated, indicating the eid doesn't exist
                JOptionPane.showMessageDialog(this, "The Book does not exist.");
            }
            else {
                JOptionPane.showMessageDialog(this, "Deleted Book!");
                clearFields();
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(BookFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_delete_book_buttonActionPerformed

    private void book_copy_id_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_copy_id_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book_copy_id_inputActionPerformed

    private void book_publisher_id_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_publisher_id_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book_publisher_id_inputActionPerformed

    private void book_return_date_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_return_date_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book_return_date_inputActionPerformed

    private void book_loan_date_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_loan_date_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book_loan_date_inputActionPerformed

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
            java.util.logging.Logger.getLogger(BookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new BookFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField book_copy_id_input;
    private javax.swing.JTextField book_genre_input;
    private javax.swing.JTextField book_isbn_input;
    private javax.swing.JTextField book_loan_date_input;
    private javax.swing.JTextField book_member_id_input;
    private javax.swing.JTextField book_publisher_id_input;
    private javax.swing.JTextField book_return_date_input;
    private javax.swing.JTextField book_title_input;
    private javax.swing.JButton delete_book_button;
    private javax.swing.JButton insert_book_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton search_book_button;
    private javax.swing.JButton update_book_button;
    // End of variables declaration//GEN-END:variables
}
