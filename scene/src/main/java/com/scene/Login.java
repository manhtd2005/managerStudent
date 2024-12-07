package com.scene;

import com.data.UserLogin;
import java.util.LinkedList;

public class Login extends javax.swing.JFrame {

    private LinkedList<UserLogin> userLogins;
    public static UserLogin saveLogin;

    public Login() {
        initComponents();
        userLogins = new LinkedList<>();
        userLogins.add(new UserLogin("manhwing2005", "manh123456", "Tran Manh", "0814237645"));
        userLogins.add(new UserLogin("admin", "admin123", "Administrator", "0123456789"));
        userLogins.add(new UserLogin("1", "1", "Tran Manh", "0814237645"));        
        userLogins.add(new UserLogin("thunguyet", "21052006", "Trần Thị Thu Nguyệt", "0814237645"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogLogin = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        buttonCloseDialogLogin = new javax.swing.JButton();
        labelSignIN = new javax.swing.JLabel();
        labelUserLogin = new javax.swing.JLabel();
        textFieldLogin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        passwordFieldLogin = new javax.swing.JPasswordField();
        btnLoginInLogin = new javax.swing.JButton();
        btnSignInInLogin = new javax.swing.JButton();
        errorLogin = new javax.swing.JLabel();
        errorFieldNameLogin = new javax.swing.JLabel();
        errorFieldPasswordLogin = new javax.swing.JLabel();

        dialogLogin.setTitle("Đăng nhập thành công");
        dialogLogin.setMinimumSize(new java.awt.Dimension(400, 300));
        dialogLogin.setModal(true);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("ĐĂNG NHẬP THÀNH CÔNG");

        buttonCloseDialogLogin.setText("Đóng");
        buttonCloseDialogLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseDialogLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogLoginLayout = new javax.swing.GroupLayout(dialogLogin.getContentPane());
        dialogLogin.getContentPane().setLayout(dialogLoginLayout);
        dialogLoginLayout.setHorizontalGroup(
            dialogLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogLoginLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(buttonCloseDialogLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogLoginLayout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(87, 87, 87))
        );
        dialogLoginLayout.setVerticalGroup(
            dialogLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogLoginLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(buttonCloseDialogLogin)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập");

        labelSignIN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelSignIN.setText("ĐĂNG NHẬP VÀO HỆ THỐNG");

        labelUserLogin.setText("Tên đăng nhập");

        jLabel1.setText("Mật khẩu");

        btnLoginInLogin.setText("Đăng nhập");
        btnLoginInLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginInLoginActionPerformed(evt);
            }
        });

        btnSignInInLogin.setText("Đăng ký");
        btnSignInInLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInInLoginActionPerformed(evt);
            }
        });

        errorLogin.setToolTipText("");

        errorFieldNameLogin.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(labelSignIN))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(btnLoginInLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSignInInLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelUserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(51, 51, 51)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(passwordFieldLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                .addComponent(errorFieldNameLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(errorLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(errorFieldPasswordLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textFieldLogin)))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelSignIN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorFieldNameLogin)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(passwordFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorFieldPasswordLogin)
                .addGap(18, 18, 18)
                .addComponent(errorLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoginInLogin)
                    .addComponent(btnSignInInLogin))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Button đăng nhập
    private void btnLoginInLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginInLoginActionPerformed
        String fieldName = textFieldLogin.getText();
        String fieldPassword = new String(passwordFieldLogin.getPassword());
        boolean isLoginSuccess = false;
        for (UserLogin user : userLogins) {
            if (fieldName.equals(user.getLoginName()) && fieldPassword.equals(user.getPassword())) {
                saveLogin = user;
                isLoginSuccess = true;
                break;
            }
        }

        if (isLoginSuccess) {
            // Hiện dialog
            dialogLogin.setLocationRelativeTo(this);
            dialogLogin.setVisible(true);
            this.dispose(); // Đóng cửa sổ hiện tại

            Menu menu = new Menu(); // Hiển thị cửa sổ Menu
            menu.setVisible(true);
            menu.setLocationRelativeTo(this);

        } else {
            errorLogin.setText("Đăng nhập thất bại");
        }

        if (fieldName.equals("")) {
            errorFieldNameLogin.setText("Vui lòng nhập trường này");
            errorLogin.setText("");
        } else {
            errorFieldNameLogin.setText("");
        }
        if (fieldPassword.equals("")) {
            errorFieldPasswordLogin.setText("Vui lòng nhập mật khẩu");
            errorLogin.setText("");
        } else {
            errorFieldPasswordLogin.setText("");
        }

    }//GEN-LAST:event_btnLoginInLoginActionPerformed

    //Button đăng ký
    private void btnSignInInLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInInLoginActionPerformed
        this.dispose(); // Đóng cửa sổ hiện tại
        SignIn signIn = new SignIn(); // Hiển thị cửa sổ Menu
        signIn.setVisible(true);
        signIn.setLocationRelativeTo(this);
    }//GEN-LAST:event_btnSignInInLoginActionPerformed


    private void buttonCloseDialogLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseDialogLoginActionPerformed
        dialogLogin.setVisible(false);
    }//GEN-LAST:event_buttonCloseDialogLoginActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoginInLogin;
    private javax.swing.JButton btnSignInInLogin;
    private javax.swing.JButton buttonCloseDialogLogin;
    private javax.swing.JDialog dialogLogin;
    private javax.swing.JLabel errorFieldNameLogin;
    private javax.swing.JLabel errorFieldPasswordLogin;
    private javax.swing.JLabel errorLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelSignIN;
    private javax.swing.JLabel labelUserLogin;
    private javax.swing.JPasswordField passwordFieldLogin;
    private javax.swing.JTextField textFieldLogin;
    // End of variables declaration//GEN-END:variables

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login loginFrame = new Login();
                loginFrame.setVisible(true);
                loginFrame.setLocationRelativeTo(null);
            }
        });
    }
}
