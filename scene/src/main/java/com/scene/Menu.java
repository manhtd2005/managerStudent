package com.scene;

import com.component.AddStudent;
import com.data.Student;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {

    LinkedList<Student> students;
    DefaultTableModel dtm;

    public Menu() {
        initComponents();
        this.students = new LinkedList<>();
        this.dtm = new DefaultTableModel();

        students.add(new Student("23714421", "Trần Đức Mạnh", "ĐHCNTT19A", 3.2));
        students.add(new Student("23714422", "Trần Đức Mẹnh", "ĐHCNTT19B", 3.3));
        students.add(new Student("23714436", "Lê Bảo Khang", "ĐHDTMT19B", 3.8));
        students.add(new Student("23714142", "Trần Văn Quang", "ĐHCNBTT19D", 3.0));
        students.add(new Student("24761422", "Trần Thị Thu Nguyệt", "ĐHMT20A", 4.0));
        students.add(new Student("24761782", "Lê Dương Bảo Lâm", "ĐHKHMT20A", 3.4));
        students.add(new Student("55555555", "Trịnh Trần Phương Tuấn", "ĐHCNTT19A", 2.2));
        students.add(new Student("27214422", "Lê Gia Bảo", "ĐHCNTT19B", 3.7));
        students.add(new Student("23214436", "Trần Nguyễn Phương Anh", "ĐHDTMT19B", 3.8));
        students.add(new Student("23712142", "Định Văn An", "ĐHCNBTT19D", 3.0));
        students.add(new Student("24861422", "Lê Thị Hoài Thu", "ĐHMT20A", 2.0));
        students.add(new Student("24761382", "Nguyễn Văn Quá", "ĐHKHMT20A", 3.1));
        students.add(new Student("24761722", "Phan Tuấn Anh", "ĐHKH20F", 3.7));
        students.add(new Student("20826152", "Đặng Nam Nguyên", "ĐHCNTP19A", 2.8));
        students.add(new Student("27214212", "Lê Đình Hoàng Nguyên", "ĐHCNTT19B", 3.7));
        students.add(new Student("21764436", "Trần Phương Anh Vĩ", "ĐHDTMT19B", 3.8));
        students.add(new Student("23712142", "Định Văn Bách", "ĐHCNBTT19D", 3.8));
        students.add(new Student("21312422", "Lê Thị Thu Ngân", "ĐHMT20A", 2.9));
        students.add(new Student("24762132", "Nguyễn Văn Thanh", "ĐHKHMT20F", 3.8));

        table.setModel(dtm);
        dtm.addColumn("MSSV");
        dtm.addColumn("Họ và tên");
        dtm.addColumn("Mã lớp học");
        dtm.addColumn("GPA");

        updateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogExit = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        yesExitBtn = new javax.swing.JButton();
        noExitBtn = new javax.swing.JButton();
        viewFrame = new javax.swing.JFrame();
        sumLabel = new javax.swing.JLabel();
        maxLabel = new javax.swing.JLabel();
        minLabel = new javax.swing.JLabel();
        avgLabel = new javax.swing.JLabel();
        infoFrame = new javax.swing.JFrame();
        userInfoLabel = new javax.swing.JLabel();
        nameInfoLabel = new javax.swing.JLabel();
        telLabel = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        sortBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        fileBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        infoBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        idSearch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        gpaBtn = new javax.swing.JButton();

        dialogExit.setTitle("Xác nhận muốn thoát ??");
        dialogExit.setMinimumSize(new java.awt.Dimension(400, 300));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Bạn xác nhận muốn thoát ???");

        yesExitBtn.setText("Đồng Ý");
        yesExitBtn.setToolTipText("");
        yesExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesExitBtnActionPerformed(evt);
            }
        });

        noExitBtn.setText("Từ chối");
        noExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noExitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogExitLayout = new javax.swing.GroupLayout(dialogExit.getContentPane());
        dialogExit.getContentPane().setLayout(dialogExitLayout);
        dialogExitLayout.setHorizontalGroup(
            dialogExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogExitLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(dialogExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dialogExitLayout.createSequentialGroup()
                        .addComponent(yesExitBtn)
                        .addGap(73, 73, 73)
                        .addComponent(noExitBtn)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        dialogExitLayout.setVerticalGroup(
            dialogExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogExitLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(dialogExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yesExitBtn)
                    .addComponent(noExitBtn))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        viewFrame.setTitle("Thống kê");
        viewFrame.setMinimumSize(new java.awt.Dimension(600, 300));

        sumLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sumLabel.setText("Tổng số học sinh");

        maxLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        maxLabel.setText("Điểm cao nhất");

        minLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        minLabel.setText("Điểm thấp nhất");

        avgLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        avgLabel.setText("GPA trung bình");

        javax.swing.GroupLayout viewFrameLayout = new javax.swing.GroupLayout(viewFrame.getContentPane());
        viewFrame.getContentPane().setLayout(viewFrameLayout);
        viewFrameLayout.setHorizontalGroup(
            viewFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewFrameLayout.createSequentialGroup()
                .addGroup(viewFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewFrameLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(viewFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(maxLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(minLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                            .addComponent(avgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(viewFrameLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(sumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        viewFrameLayout.setVerticalGroup(
            viewFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewFrameLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(sumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(maxLabel)
                .addGap(34, 34, 34)
                .addComponent(minLabel)
                .addGap(38, 38, 38)
                .addComponent(avgLabel)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        infoFrame.setTitle("Thông tin");
        infoFrame.setMinimumSize(new java.awt.Dimension(400, 300));

        userInfoLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        userInfoLabel.setText("Tên đăng nhập");

        nameInfoLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameInfoLabel.setText("Tên người dùng");

        telLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        telLabel.setText("Số điện thoại");

        javax.swing.GroupLayout infoFrameLayout = new javax.swing.GroupLayout(infoFrame.getContentPane());
        infoFrame.getContentPane().setLayout(infoFrameLayout);
        infoFrameLayout.setHorizontalGroup(
            infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoFrameLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(telLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        infoFrameLayout.setVerticalGroup(
            infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoFrameLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(userInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(nameInfoLabel)
                .addGap(47, 47, 47)
                .addComponent(telLabel)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Trang chủ");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        scroll.setViewportView(table);

        addBtn.setText("Thêm sinh viên");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(187, 187, 187));
        deleteBtn.setText("Xóa sinh viên");
        deleteBtn.setEnabled(false);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        sortBtn.setText("Sắp xếp theo tên");
        sortBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortBtnActionPerformed(evt);
            }
        });

        searchBtn.setText("Tìm kiếm");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        fileBtn.setText("Lưu ra file");
        fileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileBtnActionPerformed(evt);
            }
        });

        viewBtn.setText("Thống kê");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        closeBtn.setText("Đăng xuất");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        infoBtn.setText("Thông tin đăng nhập");
        infoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("MSSV");

        jLabel3.setText("Họ tên");

        gpaBtn.setText("Sắp xếp theo GPA");
        gpaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpaBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                    .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(107, 107, 107)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sortBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(gpaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                                .addGap(91, 91, 91)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fileBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                    .addComponent(viewBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(105, 105, 105))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(idSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(infoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(closeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sortBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(infoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(viewBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(closeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fileBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gpaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBtn)
                    .addComponent(jLabel2)
                    .addComponent(idSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Cập nhật bảng
    public void updateTable() {
        // Xóa dữ liệu cũ
        dtm.setRowCount(0);

        // Thêm dữ liệu mới
        for (Student student : students) {
            dtm.addRow(new Object[]{
                student.getId(),
                student.getName(),
                student.getMajor(),
                student.getGpa()
            });
        }
    }

    // Thêm sinh viên vào danh sách và cập nhật bảng
    public void addStudentToTable(Student student) {
        students.add(student); // Thêm vào danh sách
        updateTable(); // Cập nhật bảng
    }

    // Xóa sinh viên vào danh sách và cập nhật bảng
    public void deleteStudentToTable(Student student) {
        students.remove(student);
        updateTable();
    }

    // Thêm sinh viên
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        AddStudent addStudent = new AddStudent(this);
        addStudent.setVisible(true);
        addStudent.setLocationRelativeTo(this);
    }//GEN-LAST:event_addBtnActionPerformed

    // Hàm lấy tên
    public String getLastName(String fullName) {
        String[] parts = fullName.trim().split("\\s+");
        return parts[parts.length - 1];
    }

    // Sắp xếp sinh viên
    private void sortBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortBtnActionPerformed
        Collections.sort(students, (Student s1, Student s2) -> {
            String lastName1 = getLastName(s1.getName());
            String lastName2 = getLastName(s2.getName());
            return lastName1.compareTo(lastName2);
        });
        updateTable();
    }//GEN-LAST:event_sortBtnActionPerformed

    // Tìm kiếm sinh viên
    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String idTextField = idSearch.getText();
        String idNameField = nameField.getText();
        boolean found = false;
        for (int row = 0; row < table.getRowCount(); row++) {
            String idValue = table.getValueAt(row, 0).toString();  // Giả sử cột ID ở chỉ số 0
            String nameValue = table.getValueAt(row, 1).toString();  // Giả sử cột Tên ở chỉ số 1

            // Kiểm tra nếu cả ID và Tên đều chứa thông tin tìm kiếm
            if (idValue.contains(idTextField) && nameValue.contains(idNameField)) {
                // Nếu tìm thấy, chọn hàng và tô màu nền
                table.setSelectionBackground(Color.YELLOW);
                table.setSelectionForeground(Color.BLACK);
                table.changeSelection(row, 0, false, false);  // Chọn hàng tại cột đầu tiên (ID)
                found = true;
                break;  // Nếu tìm thấy, thoát khỏi vòng lặp
            }
        }

        // Thông báo nếu không tìm thấy kết quả
        if (!found) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy sinh viên!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    // Lưu ra file
    private void fileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileBtnActionPerformed
        // TODO add your handling code here:
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("../../com.file/liststudent.txt"))) {
            // Duyệt qua danh sách sinh viên và ghi vào file
            for (Student student : students) {
                writer.write(student.getId() + "\t" + student.getName() + "\t" + student.getMajor() + "\t" + student.getGpa());
                writer.newLine();  // Thêm dòng mới sau mỗi sinh viên
            }
            System.out.println("Dữ liệu đã được lưu vào file.");
        } catch (IOException e) {
        }
    }//GEN-LAST:event_fileBtnActionPerformed

    // Xóa sinh viên
    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int selectRow = table.getSelectedRow();
        if (selectRow != -1) {
            String id = table.getValueAt(selectRow, 0).toString();
            String name = table.getValueAt(selectRow, 1).toString();
            String major = table.getValueAt(selectRow, 2).toString();
            double gpa = Double.parseDouble(table.getValueAt(selectRow, 3).toString());

            for (Student student : students) {
                if (id.equals(student.getId())
                        && name.equals(student.getName())
                        && major.equals(student.getMajor())
                        && Math.abs(gpa - student.getGpa()) < 0.0001) {
                    this.deleteStudentToTable(student);
                    updateTable();
                }
            }
        }
        deleteBtn.setEnabled(false);
    }//GEN-LAST:event_deleteBtnActionPerformed

    // Đăng xuất
    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        dialogExit.setVisible(true);
        dialogExit.setLocationRelativeTo(this);
    }//GEN-LAST:event_closeBtnActionPerformed

    // Đồng ý đăng xuất
    private void yesExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesExitBtnActionPerformed
        dialogExit.setVisible(false);
        this.setVisible(false);
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(this);
    }//GEN-LAST:event_yesExitBtnActionPerformed

    // Từ chối đăng xuất
    private void noExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noExitBtnActionPerformed
        dialogExit.setVisible(false);
    }//GEN-LAST:event_noExitBtnActionPerformed

    // Chọn 1 phần tử trong bảng
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        deleteBtn.setEnabled(true);
    }//GEN-LAST:event_tableMouseClicked

    // Thông tin đăng nhập
    private void infoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoBtnActionPerformed
        infoFrame.setVisible(true);
        infoFrame.setLocationRelativeTo(this);
        userInfoLabel.setText("Tên Đăng Nhập: " + Login.saveLogin.getLoginName());
        nameInfoLabel.setText("Họ Và Tên: " + Login.saveLogin.getNameUser());
        telLabel.setText("Số điện thoại: " + Login.saveLogin.getTel());
    }//GEN-LAST:event_infoBtnActionPerformed

    // Sắp xếp theo GPA
    private void gpaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpaBtnActionPerformed
        Collections.sort(students, (Student s1, Student s2) -> Double.compare(s2.getGpa(), s1.getGpa()));
        updateTable();
    }//GEN-LAST:event_gpaBtnActionPerformed

    // Thống kê
    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        viewFrame.setVisible(true);
        viewFrame.setLocationRelativeTo(this);
        sumLabel.setText("Tổng số học sinh: " + students.size());

        double max = -999999;
        double min = 999999;
        double sum = 0;
        for (Student student : students) {
            if (student.getGpa() > max) {
                max = student.getGpa();
            }
            if (student.getGpa() < min) {
                min = student.getGpa();
            }
            sum += student.getGpa();
        }
        maxLabel.setText("Điểm cao nhất: " + max);
        minLabel.setText("Điểm thấp nhất: " + min);
        double avg = sum / (students.size());
        avgLabel.setText("GPA trung bình: " + avg);
    }//GEN-LAST:event_viewBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel avgLabel;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JDialog dialogExit;
    private javax.swing.JButton fileBtn;
    private javax.swing.JButton gpaBtn;
    private javax.swing.JTextField idSearch;
    private javax.swing.JButton infoBtn;
    private javax.swing.JFrame infoFrame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel maxLabel;
    private javax.swing.JLabel minLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameInfoLabel;
    private javax.swing.JButton noExitBtn;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton sortBtn;
    private javax.swing.JLabel sumLabel;
    private javax.swing.JTable table;
    private javax.swing.JLabel telLabel;
    private javax.swing.JLabel userInfoLabel;
    private javax.swing.JButton viewBtn;
    private javax.swing.JFrame viewFrame;
    private javax.swing.JButton yesExitBtn;
    // End of variables declaration//GEN-END:variables

}
