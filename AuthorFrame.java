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
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class AuthorFrame extends javax.swing.JFrame {
    Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    
    
    public AuthorFrame(Connection con, PreparedStatement ps, ResultSet rs) {
        initComponents();
        this.con = con;
        this.ps = ps;
        this.rs = rs;
    }
    
    
    //clear fields
    public void clearFields(){
        author_id_input.setText("");
        author_name_input.setText("");
        author_nationality_input.setText("");
        author_birthdate_input.setText("");
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        author_nationality_input = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        author_birthdate_input = new javax.swing.JTextField();
        search_author_button = new javax.swing.JButton();
        update_author_button = new javax.swing.JButton();
        delete_author_button = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        insert_author_button = new javax.swing.JButton();
        author_id_input = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        author_name_input = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        author_nationality_input.setText("Enter..");
        author_nationality_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                author_nationality_inputActionPerformed(evt);
            }
        });

        jLabel4.setText("BirthDate");

        author_birthdate_input.setText("Enter..");
        author_birthdate_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                author_birthdate_inputActionPerformed(evt);
            }
        });

        search_author_button.setText("Search Author");
        search_author_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_author_buttonActionPerformed(evt);
            }
        });

        update_author_button.setText("Update Author");
        update_author_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_author_buttonActionPerformed(evt);
            }
        });

        delete_author_button.setText("Delete Author");
        delete_author_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_author_buttonActionPerformed(evt);
            }
        });

        jLabel5.setText("AUTHOR INFORMATION");

        insert_author_button.setText("Add Author");
        insert_author_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_author_buttonActionPerformed(evt);
            }
        });

        author_id_input.setText("Enter..");
        author_id_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                author_id_inputActionPerformed(evt);
            }
        });

        jLabel1.setText("AuthorID");

        jLabel2.setText("Name");

        author_name_input.setText("Enter..");
        author_name_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                author_name_inputActionPerformed(evt);
            }
        });

        jLabel3.setText("Nationality");

        jButton1.setText("Go to main menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(search_author_button, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(author_id_input)
                                    .addComponent(author_name_input)
                                    .addComponent(author_nationality_input)
                                    .addComponent(author_birthdate_input, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(insert_author_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(update_author_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(delete_author_button, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(author_id_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(author_name_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(author_nationality_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(author_birthdate_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(insert_author_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update_author_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete_author_button)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search_author_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void author_nationality_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_author_nationality_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_author_nationality_inputActionPerformed

    private void author_birthdate_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_author_birthdate_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_author_birthdate_inputActionPerformed

    private void search_author_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_author_buttonActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "select * from author where authorID = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, author_id_input.getText());
            rs = ps.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Author found!");
                String name= rs.getString("name");
                String nationality= rs.getString("nationality");
                String birthdate = rs.getString("birthdate");
                author_name_input.setText(name);
                author_nationality_input.setText(nationality);
                author_birthdate_input.setText(birthdate.substring(0,10));
            }
            else {
                JOptionPane.showMessageDialog(this, "Author not found!");
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(AuthorFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_search_author_buttonActionPerformed

    private void update_author_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_author_buttonActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "UPDATE author SET name = ?, nationality = ?, birthdate = ? WHERE authorID = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, author_name_input.getText());
            ps.setString(2, author_nationality_input.getText());
            ps.setString(3, author_birthdate_input.getText());
            ps.setString(4, author_id_input.getText());

            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Author updated successfully!");
                clearFields();
            } else {
                JOptionPane.showMessageDialog(this, "Author not found!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AuthorFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_update_author_buttonActionPerformed

    private void delete_author_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_author_buttonActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "DELETE from author where authorID = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, author_id_input.getText());
            int updateCount=ps.executeUpdate();

            if (updateCount == 0) {
                // No rows were updated, indicating the eid doesn't exist
                JOptionPane.showMessageDialog(this, "The Author does not exist.");
            }
            else {
                JOptionPane.showMessageDialog(this, "Deleted Author!");
                clearFields();
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(AuthorFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_delete_author_buttonActionPerformed

    private void insert_author_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_author_buttonActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "insert into author values(?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1,author_id_input.getText());
            ps.setString(2,author_name_input.getText());
            ps.setString(3,author_nationality_input.getText());
            ps.setString(4,author_birthdate_input.getText());
            ps.execute();
            JOptionPane.showMessageDialog(this,"Inserted!");
            clearFields();
        }
        catch (SQLException ex) {
            Logger.getLogger(AuthorFrame.class.getName()).log(Level.SEVERE,null, ex);
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }

    }//GEN-LAST:event_insert_author_buttonActionPerformed

    private void author_id_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_author_id_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_author_id_inputActionPerformed

    private void author_name_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_author_name_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_author_name_inputActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //close();
        dispose();
        MenuFrame homepage = new MenuFrame(con, ps, rs);
        homepage.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(AuthorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuthorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuthorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuthorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //we are not running frame from this file, so commented the running statement
                //new AuthorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField author_birthdate_input;
    private javax.swing.JTextField author_id_input;
    private javax.swing.JTextField author_name_input;
    private javax.swing.JTextField author_nationality_input;
    private javax.swing.JButton delete_author_button;
    private javax.swing.JButton insert_author_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton search_author_button;
    private javax.swing.JButton update_author_button;
    // End of variables declaration//GEN-END:variables
}
