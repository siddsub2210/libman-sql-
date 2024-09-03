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



public class PublisherFrame extends javax.swing.JFrame {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
  
    PublisherFrame(Connection con, PreparedStatement ps, ResultSet rs) {
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
        publisher_id_input.setText("");
        publisher_name_input.setText("");
        publisher_address_input.setText("");
        publisher_phone_input.setText("");
        publisher_email_input.setText("");
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        publisher_name_input = new javax.swing.JTextField();
        publisher_phone_input = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        search_publisher_button = new javax.swing.JButton();
        update_publisher_button = new javax.swing.JButton();
        delete_publisher_button = new javax.swing.JButton();
        publisher_id_input = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        publisher_address_input = new javax.swing.JTextField();
        insert_publisher_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        publisher_email_input = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Go to main menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        publisher_name_input.setText("Enter..");
        publisher_name_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publisher_name_inputActionPerformed(evt);
            }
        });

        publisher_phone_input.setText("Enter..");
        publisher_phone_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publisher_phone_inputActionPerformed(evt);
            }
        });

        jLabel3.setText("Address");

        search_publisher_button.setText("Search Publisher");
        search_publisher_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_publisher_buttonActionPerformed(evt);
            }
        });

        update_publisher_button.setText("Update Publisher");
        update_publisher_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_publisher_buttonActionPerformed(evt);
            }
        });

        delete_publisher_button.setText("Delete Publisher");
        delete_publisher_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_publisher_buttonActionPerformed(evt);
            }
        });

        publisher_id_input.setText("Enter..");
        publisher_id_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publisher_id_inputActionPerformed(evt);
            }
        });

        jLabel1.setText("PublisherID");

        jLabel5.setText("PUBLISHER INFORMATION");

        publisher_address_input.setText("Enter..");
        publisher_address_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publisher_address_inputActionPerformed(evt);
            }
        });

        insert_publisher_button.setText("Add Publisher");
        insert_publisher_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_publisher_buttonActionPerformed(evt);
            }
        });

        jLabel2.setText("Name");

        publisher_email_input.setText("Enter..");
        publisher_email_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publisher_email_inputActionPerformed(evt);
            }
        });

        jLabel4.setText("Phone");

        jLabel6.setText("Email");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(search_publisher_button, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(publisher_email_input, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(publisher_id_input)
                                    .addComponent(publisher_name_input)
                                    .addComponent(publisher_address_input)
                                    .addComponent(publisher_phone_input, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(delete_publisher_button, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(update_publisher_button)
                                    .addComponent(insert_publisher_button, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(publisher_id_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(publisher_name_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(publisher_address_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(publisher_phone_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(insert_publisher_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update_publisher_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete_publisher_button)
                        .addGap(11, 11, 11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(publisher_email_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(search_publisher_button)
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

    private void publisher_name_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publisher_name_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publisher_name_inputActionPerformed

    private void publisher_phone_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publisher_phone_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publisher_phone_inputActionPerformed

    private void search_publisher_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_publisher_buttonActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "select * from publishers where publisherID = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, publisher_id_input.getText());
            rs = ps.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Publisher found!");
                String name= rs.getString("name");
                String address= rs.getString("address");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                publisher_name_input.setText(name);
                publisher_address_input.setText(address);
                publisher_phone_input.setText(phone);
                publisher_email_input.setText(email);
            }
            else {
                JOptionPane.showMessageDialog(this, "Publisher not found!");
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(PublisherFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_search_publisher_buttonActionPerformed

    private void update_publisher_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_publisher_buttonActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "UPDATE publishers SET name = ?, address = ?, phone = ?, email = ? WHERE publisherID = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, publisher_name_input.getText());
            ps.setString(2, publisher_address_input.getText());
            ps.setString(3, publisher_phone_input.getText());
            ps.setString(4, publisher_email_input.getText());
            ps.setString(5, publisher_id_input.getText());

            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Publisher updated successfully!");
                clearFields();
            } else {
                JOptionPane.showMessageDialog(this, "Publisher not found!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PublisherFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_update_publisher_buttonActionPerformed

    private void delete_publisher_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_publisher_buttonActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "DELETE from publishers where publisherID = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, publisher_id_input.getText());
            int updateCount=ps.executeUpdate();

            if (updateCount == 0) {
                // No rows were updated, indicating the eid doesn't exist
                JOptionPane.showMessageDialog(this, "The Publisher does not exist.");
            }
            else {
                JOptionPane.showMessageDialog(this, "Deleted Publisher!");
                clearFields();
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(PublisherFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_delete_publisher_buttonActionPerformed

    private void publisher_id_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publisher_id_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publisher_id_inputActionPerformed

    private void publisher_address_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publisher_address_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publisher_address_inputActionPerformed

    private void insert_publisher_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_publisher_buttonActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "insert into publishers values(?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1,publisher_id_input.getText());
            ps.setString(2,publisher_name_input.getText());
            ps.setString(3,publisher_address_input.getText());
            ps.setString(4,publisher_phone_input.getText());
            ps.setString(5,publisher_email_input.getText());
            ps.execute();
            JOptionPane.showMessageDialog(this,"Inserted!");
            clearFields();
        }
        catch (SQLException ex) {
            Logger.getLogger(PublisherFrame.class.getName()).log(Level.SEVERE,null, ex);
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }
    }//GEN-LAST:event_insert_publisher_buttonActionPerformed

    private void publisher_email_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publisher_email_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publisher_email_inputActionPerformed

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
            java.util.logging.Logger.getLogger(PublisherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PublisherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PublisherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PublisherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new PublisherFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete_publisher_button;
    private javax.swing.JButton insert_publisher_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField publisher_address_input;
    private javax.swing.JTextField publisher_email_input;
    private javax.swing.JTextField publisher_id_input;
    private javax.swing.JTextField publisher_name_input;
    private javax.swing.JTextField publisher_phone_input;
    private javax.swing.JButton search_publisher_button;
    private javax.swing.JButton update_publisher_button;
    // End of variables declaration//GEN-END:variables
}
