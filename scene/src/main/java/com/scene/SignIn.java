package com.scene;

import com.data.UserLogin;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class SignIn extends javax.swing.JFrame {

    private LinkedList<UserLogin> userLogins;

    public SignIn() {
        userLogins = new LinkedList<>();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelSignIn = new javax.swing.JLabel();
        labelNameSignin = new javax.swing.JLabel();
        labelNameSingin = new javax.swing.JLabel();
        labelTelSignin = new javax.swing.JLabel();
        labelPasswordField = new javax.swing.JLabel();
        labelRepeatPasswordField = new javax.swing.JLabel();
        fieldUserNameLogin = new javax.swing.JTextField();
        fieldNameLogin = new javax.swing.JTextField();
        fieldPhoneLogin = new javax.swing.JTextField();
        fieldPasswordLogin = new javax.swing.JPasswordField();
        fieldPasswordRepeatLogin = new javax.swing.JPasswordField();
        signinButtonSignin = new javax.swing.JButton();
        loginButtonSignin = new javax.swing.JButton();
        errorFieldNameSignin = new javax.swing.JLabel();
        errorFieldUserNameSignin = new javax.swing.JLabel();
        errorFieldPhoneSignin = new javax.swing.JLabel();
        errrorFieldPasswordSignin = new javax.swing.JLabel();
        errorFieldPasswordRepeatSignin = new javax.swing.JLabel();

        setTitle("Đăng ký");

        labelSignIn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelSignIn.setText("ĐĂNG KÝ TÀI KHOẢN");

        labelNameSignin.setText("Tên đăng nhập");

        labelNameSingin.setText("Họ tên");

        labelTelSignin.setText("Số điện thoại");

        labelPasswordField.setText("Mật khẩu");

        labelRepeatPasswordField.setText("Nhập lại mật khẩu");

        fieldNameLogin.setToolTipText("");

        fieldPhoneLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPhoneLoginActionPerformed(evt);
            }
        });

        fieldPasswordLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPasswordLoginActionPerformed(evt);
            }
        });

        signinButtonSignin.setText("Đăng ký");
        signinButtonSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinButtonSigninActionPerformed(evt);
            }
        });

        loginButtonSignin.setText("Đăng nhập");
        loginButtonSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonSigninActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNameSignin, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(labelRepeatPasswordField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelPasswordField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTelSignin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelNameSingin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errorFieldPasswordRepeatSignin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(errrorFieldPasswordSignin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(errorFieldPhoneSignin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(errorFieldUserNameSignin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(errorFieldNameSignin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldUserNameLogin)
                    .addComponent(fieldNameLogin)
                    .addComponent(fieldPasswordLogin)
                    .addComponent(fieldPasswordRepeatLogin)
                    .addComponent(fieldPhoneLogin))
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(labelSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(signinButtonSignin, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(loginButtonSignin, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(labelSignIn)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNameSignin)
                    .addComponent(fieldUserNameLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(errorFieldUserNameSignin)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNameSingin)
                    .addComponent(fieldNameLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(errorFieldNameSignin)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelSignin)
                    .addComponent(fieldPhoneLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(errorFieldPhoneSignin)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelPasswordField)
                    .addComponent(fieldPasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errrorFieldPasswordSignin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRepeatPasswordField)
                    .addComponent(fieldPasswordRepeatLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorFieldPasswordRepeatSignin)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signinButtonSignin)
                    .addComponent(loginButtonSignin))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signinButtonSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinButtonSigninActionPerformed
        String fieldName = fieldNameLogin.getText();  // Lấy tên người dùng
        String fieldUserName = fieldUserNameLogin.getText();  // Lấy tên đăng nhập
        String fieldPhone = fieldPhoneLogin.getText();  // Lấy số điện thoại
        String fieldPassword = new String(fieldPasswordLogin.getPassword());  // Lấy mật khẩu
        String fieldRepeatPassword = new String(fieldPasswordRepeatLogin.getPassword());  // Lấy lại mật khẩu
        boolean isSigninSuccess = true;  // Biến kiểm tra trạng thái đăng ký thành công

        // Kiểm tra mật khẩu và xác nhận mật khẩu có khớp không
        if (!fieldPassword.equals(fieldRepeatPassword)) {
            errorFieldPasswordRepeatSignin.setText("Mật khẩu nhập lại không đúng.");
            isSigninSuccess = false;
        } else {
            errorFieldPasswordRepeatSignin.setText("");  // Xóa lỗi nếu khớp
        }

        if (fieldPassword.equals("")) {
            errrorFieldPasswordSignin.setText("Vui lòng nhập mật khẩu.");
            isSigninSuccess = false;
        } else {
            errrorFieldPasswordSignin.setText("");  // Xóa lỗi nếu đã nhập
        }

        if (fieldRepeatPassword.equals("")) {
            errorFieldPasswordRepeatSignin.setText("Vui lòng nhập lại mật khẩu.");
            isSigninSuccess = false;
        } else {
            errorFieldPasswordRepeatSignin.setText("");  // Xóa lỗi nếu đã nhập
        }
        
        // Kiểm tra các trường không được để trống
        if (fieldName.equals("")) {
            errorFieldNameSignin.setText("Vui lòng nhập họ tên.");
            isSigninSuccess = false;
        } else {
            errorFieldNameSignin.setText("");  // Xóa lỗi nếu đã nhập
        }

        if (fieldUserName.equals("")) {
            errorFieldUserNameSignin.setText("Vui lòng nhập tên đăng nhập.");
            isSigninSuccess = false;
        } else {
            errorFieldUserNameSignin.setText("");  // Xóa lỗi nếu đã nhập
        }

        if (fieldPhone.equals("")) {
            errorFieldPhoneSignin.setText("Vui lòng nhập số điện thoại.");
            isSigninSuccess = false;
        } else {
            errorFieldPhoneSignin.setText("");  // Xóa lỗi nếu đã nhập
        }

        // Nếu tất cả các điều kiện hợp lệ
        if (isSigninSuccess) {
            // Kiểm tra tên người dùng đã tồn tại trong danh sách người dùng chưa
            boolean userExists = false;
            for (UserLogin user : userLogins) {
                if (user.getLoginName().equals(fieldUserName)) {
                    userExists = true;
                    break;
                }
            }

            if (userExists) {
                // Nếu tên người dùng đã tồn tại, hiển thị lỗi
                errorFieldUserNameSignin.setText("Tên người dùng đã tồn tại.");
                isSigninSuccess = false;
            } else {
                // Nếu tên người dùng chưa tồn tại, tiến hành lưu thông tin người dùng mới
                userLogins.add(new UserLogin(fieldName, fieldPassword, fieldUserName, fieldPhone));

                // Hiển thị thông báo đăng ký thành công
                JOptionPane.showMessageDialog(this, "Đăng ký tài khoản thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

                // Đóng cửa sổ đăng ký và mở cửa sổ đăng nhập
                this.dispose();
                Login loginFrame = new Login();  // Mở cửa sổ đăng nhập
                loginFrame.setVisible(true);
                loginFrame.setLocationRelativeTo(this);  // Đặt vị trí cửa sổ đăng nhập
            }

        }

    }//GEN-LAST:event_signinButtonSigninActionPerformed

    private void loginButtonSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonSigninActionPerformed
        this.dispose();
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
        loginFrame.setLocationRelativeTo(this);

    }//GEN-LAST:event_loginButtonSigninActionPerformed

    private void fieldPhoneLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPhoneLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldPhoneLoginActionPerformed

    private void fieldPasswordLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPasswordLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldPasswordLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorFieldNameSignin;
    private javax.swing.JLabel errorFieldPasswordRepeatSignin;
    private javax.swing.JLabel errorFieldPhoneSignin;
    private javax.swing.JLabel errorFieldUserNameSignin;
    private javax.swing.JLabel errrorFieldPasswordSignin;
    private javax.swing.JTextField fieldNameLogin;
    private javax.swing.JPasswordField fieldPasswordLogin;
    private javax.swing.JPasswordField fieldPasswordRepeatLogin;
    private javax.swing.JTextField fieldPhoneLogin;
    private javax.swing.JTextField fieldUserNameLogin;
    private javax.swing.JLabel labelNameSignin;
    private javax.swing.JLabel labelNameSingin;
    private javax.swing.JLabel labelPasswordField;
    private javax.swing.JLabel labelRepeatPasswordField;
    private javax.swing.JLabel labelSignIn;
    private javax.swing.JLabel labelTelSignin;
    private javax.swing.JButton loginButtonSignin;
    private javax.swing.JButton signinButtonSignin;
    // End of variables declaration//GEN-END:variables
}
