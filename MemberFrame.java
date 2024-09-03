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



public class MemberFrame extends javax.swing.JFrame {
    Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;

    public MemberFrame(Connection con, PreparedStatement ps, ResultSet rs) {
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
        member_id_input.setText("");
        member_name_input.setText("");
        member_address_input.setText("");
        member_phone_input.setText("");
        member_email_input.setText("");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        member_id_input = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        member_address_input = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        member_name_input = new javax.swing.JTextField();
        member_phone_input = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        search_member_button = new javax.swing.JButton();
        update_member_button = new javax.swing.JButton();
        delete_member_button = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        insert_member_button = new javax.swing.JButton();
        member_email_input = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Go to main menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        member_id_input.setText("Enter..");
        member_id_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                member_id_inputActionPerformed(evt);
            }
        });

        jLabel1.setText("MemberID");

        member_address_input.setText("Enter..");
        member_address_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                member_address_inputActionPerformed(evt);
            }
        });

        jLabel2.setText("Name");

        jLabel4.setText("Phone");

        member_name_input.setText("Enter..");
        member_name_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                member_name_inputActionPerformed(evt);
            }
        });

        member_phone_input.setText("Enter..");
        member_phone_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                member_phone_inputActionPerformed(evt);
            }
        });

        jLabel3.setText("Address");

        search_member_button.setText("Search Member");
        search_member_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_member_buttonActionPerformed(evt);
            }
        });

        update_member_button.setText("Update Member");
        update_member_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_member_buttonActionPerformed(evt);
            }
        });

        delete_member_button.setText("Delete Member");
        delete_member_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_member_buttonActionPerformed(evt);
            }
        });

        jLabel5.setText("MEMBER INFORMATION");

        insert_member_button.setText("Add Member");
        insert_member_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_member_buttonActionPerformed(evt);
            }
        });

        member_email_input.setText("Enter..");
        member_email_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                member_email_inputActionPerformed(evt);
            }
        });

        jLabel6.setText("Email");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(search_member_button, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(member_email_input, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(member_id_input)
                                    .addComponent(member_name_input)
                                    .addComponent(member_address_input)
                                    .addComponent(member_phone_input, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(delete_member_button, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(update_member_button)
                                    .addComponent(insert_member_button, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
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
                        .addComponent(member_id_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(member_name_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(member_address_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(member_phone_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(insert_member_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update_member_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete_member_button)
                        .addGap(11, 11, 11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(member_email_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(search_member_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
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

    private void member_id_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_member_id_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_member_id_inputActionPerformed

    private void member_address_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_member_address_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_member_address_inputActionPerformed

    private void member_name_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_member_name_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_member_name_inputActionPerformed

    private void member_phone_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_member_phone_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_member_phone_inputActionPerformed

    private void search_member_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_member_buttonActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "select * from member where memberID = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, member_id_input.getText());
            rs = ps.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Member found!");
                String name= rs.getString("name");
                String address= rs.getString("address");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                member_name_input.setText(name);
                member_address_input.setText(address);
                member_phone_input.setText(phone);
                member_email_input.setText(email);
            }
            else {
                JOptionPane.showMessageDialog(this, "Member not found!");
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(MemberFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_search_member_buttonActionPerformed

    private void update_member_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_member_buttonActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "UPDATE member SET name = ?, address = ?, phone = ?, email = ? WHERE memberID = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, member_name_input.getText());
            ps.setString(2, member_address_input.getText());
            ps.setString(3, member_phone_input.getText());
            ps.setString(4, member_email_input.getText());
            ps.setString(5, member_id_input.getText());

            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Member updated successfully!");
                clearFields();
            } else {
                JOptionPane.showMessageDialog(this, "Member not found!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MemberFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_update_member_buttonActionPerformed

    private void delete_member_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_member_buttonActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "DELETE from MEMBER where memberID = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, member_id_input.getText());
            int updateCount=ps.executeUpdate();

            if (updateCount == 0) {
                // No rows were updated, indicating the eid doesn't exist
                JOptionPane.showMessageDialog(this, "The Member does not exist.");
            }
            else {
                JOptionPane.showMessageDialog(this, "Deleted Member!");
                clearFields();
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(MemberFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_delete_member_buttonActionPerformed

    private void insert_member_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_member_buttonActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "insert into member values(?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1,member_id_input.getText());
            ps.setString(2,member_name_input.getText());
            ps.setString(3,member_address_input.getText());
            ps.setString(4,member_phone_input.getText());
            ps.setString(5,member_email_input.getText());
            ps.execute();
            JOptionPane.showMessageDialog(this,"Inserted!");
            clearFields();
        }
        catch (SQLException ex) {
            Logger.getLogger(MemberFrame.class.getName()).log(Level.SEVERE,null, ex);
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }
    }//GEN-LAST:event_insert_member_buttonActionPerformed

    private void member_email_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_member_email_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_member_email_inputActionPerformed


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
            java.util.logging.Logger.getLogger(MemberFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new MemberFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete_member_button;
    private javax.swing.JButton insert_member_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField member_address_input;
    private javax.swing.JTextField member_email_input;
    private javax.swing.JTextField member_id_input;
    private javax.swing.JTextField member_name_input;
    private javax.swing.JTextField member_phone_input;
    private javax.swing.JButton search_member_button;
    private javax.swing.JButton update_member_button;
    // End of variables declaration//GEN-END:variables
}
