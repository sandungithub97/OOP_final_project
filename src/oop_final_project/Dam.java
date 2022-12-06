/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package oop_final_project;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Sandun
 */
public class Dam extends javax.swing.JPanel {
static long totalqty;
static String val;
    /**
     * Creates new form New
     */
    public Dam() {
        initComponents();
        scr.setBackground(new Color(0.0f,0.0f,0.0f,0.3f));
        name.setEditable(false);
        available.setEditable(false);
        user.setEditable(false);
        user.setText(login.name);
        table();
    }
public void table(){
    try{
           Class.forName("com.mysql.jdbc.Driver");
            Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery","root","");
                     
            String sql="SELECT * FROM damaged";
            PreparedStatement ptst = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs=ptst.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)damage_table.getModel();
            tm.setRowCount(0);
            while(rs.next()){
            Object o[]={rs.getString("id"),rs.getString("name"),rs.getString("quantity"),rs.getString("reason"),rs.getString("user")};
            tm.addRow(o);
            }                                                           //Table Showing
        
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
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

        scr = new javax.swing.JPanel();
        user = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        available = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        remove = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        reason = new javax.swing.JTextField();
        quntity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        damage_table = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scr.setBackground(new java.awt.Color(51, 51, 51));
        scr.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        scr.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 330, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("User");
        scr.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 160, 50));
        scr.add(available, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 330, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Available Stock");
        scr.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 160, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");
        scr.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 100, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Damaged Stock");
        scr.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 186, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        scr.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 110, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantity");
        scr.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 100, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Reason");
        scr.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 110, 50));

        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        scr.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 95, 37));

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        scr.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 107, 37));
        scr.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 330, 30));

        id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                idFocusLost(evt);
            }
        });
        scr.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 330, 30));
        scr.add(reason, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 330, 30));
        scr.add(quntity, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 330, 30));

        damage_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Quantity", "Reason", "User"
            }
        ));
        jScrollPane1.setViewportView(damage_table);

        scr.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 660, 130));

        add(scr, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 660));
    }// </editor-fold>//GEN-END:initComponents

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        // TODO add your handling code here:
        
       
        String qty=quntity.getText();
        String iid=id.getText();
        
        Statement stmt;
                 try{
                        stmt=dbcon.getConnection();
                        ResultSet rs= stmt.executeQuery("SELECT * FROM final_stock where id ='"+iid+"'");
                        while(rs.next()){
                            this.available.setText(rs.getString(3));
                            val=available.getText();
                           if(Long.valueOf(val)>Long.valueOf(qty)){
                                totalqty =Long.valueOf(val)-Long.valueOf(qty);
                                //do the calculation for last stock value
                                
                           }else{
                               JOptionPane.showMessageDialog(null,"Stock Value Too low, please Enter again");
                                
                                quntity.setText("");
                           }
                           
        
        }
                          rs.close();
                    }catch(SQLException k){

                     }      
        
        if(Long.valueOf(val)>Long.valueOf(qty)){
        try{
        Class.forName("com.mysql.jdbc.Driver");
            try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery","root","")) {
                String sql2="UPDATE final_stock SET quantity ="+totalqty+" WHERE id='"+iid+"'";
                PreparedStatement pts = (PreparedStatement) conn.prepareStatement(sql2);
                pts.executeUpdate();  //update calculate value to final stock database
                String sql="insert into damaged values (?,?,?,?,?)";
                PreparedStatement ptst = (PreparedStatement) conn.prepareStatement(sql);
                ptst.setString(1,   id.getText());
                ptst.setString(2,   name.getText());
                ptst.setString(3,   quntity.getText());
                ptst.setString(4,   reason.getText());
                ptst.setString(5,   user.getText());
                ptst.executeUpdate();//added damaged goods details into damaged table
                
                JOptionPane.showMessageDialog(null,"Stock Removed Successfully");
               
                
                   
                String sql3="SELECT * FROM damaged";
                PreparedStatement ptst2 = (PreparedStatement) conn.prepareStatement(sql3);
                ResultSet rs=ptst2.executeQuery();
                DefaultTableModel tm=(DefaultTableModel)damage_table.getModel();
                tm.setRowCount(0);
                while(rs.next()){
                Object o[]={rs.getString("id"),rs.getString("name"),rs.getString("quantity"),rs.getString("reason"),rs.getString("user")};
                tm.addRow(o);                                           //Update  Table
                }    
            }
           
           id.setText("");
           name.setText(""); 
           quntity.setText("");
           reason.setText("");
           available.setText("");
           
           
                }catch(Exception e){
               JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_removeActionPerformed

    private void idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFocusLost
        // TODO add your handling code here:
        String iid = id.getText();
        Statement stmt;
    try{
        stmt=dbcon.getConnection();
        ResultSet rs= stmt.executeQuery("SELECT * FROM final_stock where id ='"+iid+"'");
        
        while(rs.next()){
        this.name.setText(rs.getString(2));
        this.available.setText(rs.getString(3));
        
        
        }
          rs.close();
    }catch(SQLException k){
                  
     }
    
    
    }//GEN-LAST:event_idFocusLost

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        id.setText("");
        name.setText(""); 
        quntity.setText("");
        reason.setText("");
        available.setText("");
    }//GEN-LAST:event_clearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField available;
    private javax.swing.JButton clear;
    private javax.swing.JTable damage_table;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField quntity;
    private javax.swing.JTextField reason;
    private javax.swing.JButton remove;
    private javax.swing.JPanel scr;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
