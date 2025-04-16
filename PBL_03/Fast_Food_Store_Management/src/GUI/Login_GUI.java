
package GUI;

import BUS.Login_BUS;
import DTO.Account;
import DTO.DecentralizationDetail;
import java.awt.Color;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login_GUI extends javax.swing.JFrame {
    public Login_GUI() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new Custom.RoundPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        button1 = new Custom.Button();
        button2 = new Custom.Button();
        button3 = new Custom.Button();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setLocation(new java.awt.Point(400, 200));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel1.setBackground(new java.awt.Color(0, 0, 0));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true)));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField6.setBackground(new java.awt.Color(254, 214, 126));
        jTextField6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField6.setText("Tên đăng nhập");
        jTextField6.setAlignmentX(1.0F);
        jTextField6.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(242, 152, 174), new java.awt.Color(242, 152, 174), new java.awt.Color(242, 152, 174), new java.awt.Color(242, 152, 174)), javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 102, 255))));
        jTextField6.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField6.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField6FocusLost(evt);
            }
        });
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 320, 50));

        jPasswordField1.setBackground(new java.awt.Color(254, 214, 126));
        jPasswordField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPasswordField1.setText("password");
        jPasswordField1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(242, 152, 174), new java.awt.Color(242, 152, 174), new java.awt.Color(242, 152, 174), new java.awt.Color(242, 152, 174)), javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 102, 255))));
        jPasswordField1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPasswordField1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 320, 50));

        button1.setBackground(new java.awt.Color(254, 39, 60));
        button1.setBorder(null);
        button1.setText("X");
        button1.setFocusPainted(false);
        button1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        button1.setRadius(15);
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });
        jPanel1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 10, 37, 26));

        button2.setBackground(new java.awt.Color(254, 39, 60));
        button2.setBorder(null);
        button2.setText("-");
        button2.setFocusPainted(false);
        button2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        button2.setMaximumSize(new java.awt.Dimension(43, 25));
        button2.setMinimumSize(new java.awt.Dimension(43, 25));
        button2.setRadius(15);
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button2MouseClicked(evt);
            }
        });
        jPanel1.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 10, 37, 26));

        button3.setBackground(new java.awt.Color(254, 214, 126));
        button3.setBorder(null);
        button3.setText("Đăng nhập");
        button3.setFocusPainted(false);
        button3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        button3.setRadius(10);
        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button3MouseClicked(evt);
            }
        });
        jPanel1.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 640, 170, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText("ĐĂNG NHẬP");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Đăng nhập nhân viên.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        roundPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        getContentPane().add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1290, 840));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusGained
        if(jTextField6.getText().equals("Tên đăng nhập")){
            jTextField6.setText("");
            jTextField6.setForeground( new Color(18, 18, 18));
        }
    }//GEN-LAST:event_jTextField6FocusGained

    private void jTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusLost
        if(jTextField6.getText().equals("")){
            jTextField6.setText("Tên đăng nhập");
            jTextField6.setForeground( new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField6FocusLost

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        if(jPasswordField1.getText().equals("password")){
            jPasswordField1.setText("");
            jPasswordField1.setForeground( new Color(18, 18, 18));
        }
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
        if(jPasswordField1.getText().equals("")){
            jPasswordField1.setText("password");
            jPasswordField1.setForeground( new Color(153,153,153));
        }
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_button1MouseClicked

    private void button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseClicked
        setState(Login_GUI.ICONIFIED);
    }//GEN-LAST:event_button2MouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        super.setLocation(super.getX() + evt.getX() - mouseX, super.getY() + evt.getY() - mouseY);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseClicked
        if(jTextField6.getText().equals("") || jPasswordField1.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng không để trống!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            Login_BUS loginBUS = new Login_BUS();
            Account acc = loginBUS.userlogin(jTextField6.getText(), jPasswordField1.getText());
            if(acc == null) {
                JOptionPane.showMessageDialog(this, "Sai tài khoản hoặc mật khẩu", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                DecentralizationDetail dcdt;
                ArrayList<String> staffInfo = loginBUS.loginGetStaffInfo(jTextField6.getText(), jPasswordField1.getText());
                if(staffInfo.get(3)==null) {
                    dcdt = new DecentralizationDetail("DC0",1,0,0,0,0,0,0,0,0,0);
                    staffInfo.set(2, "Chưa xác định");
                }
                else 
                    dcdt = loginBUS.getDecentralizationDetail(staffInfo.get(3));
                this.dispose();
                try {
                    new Home_GUI(staffInfo, dcdt);
                } catch (ParseException ex) {
                    Logger.getLogger(Login_GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_button3MouseClicked

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField6ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Custom.Button button1;
    private Custom.Button button2;
    private Custom.Button button3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField6;
    private Custom.RoundPanel roundPanel1;
    // End of variables declaration//GEN-END:variables
    private int mouseX,mouseY;
}
