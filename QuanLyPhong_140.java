/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Dao.StudentDao;
import KetNoiSQL.KetNoiSQL;
import Model.Student;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Huynh Hau
 */
public class QuanLyPhong_140 extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyPhong_140
     */
    DefaultTableModel defaultTableModel = new DefaultTableModel();
    ThongTinPhong_140 h40 = new ThongTinPhong_140();
    StudentDao stDao;
    
    
    public QuanLyPhong_140() {
        
        StudentDao studentDao = new StudentDao();
        stDao = new StudentDao();
        
        initComponents();
        setLocationRelativeTo(null);

        defaultTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // khong cho phep nguoi dung Edit du lieu trong bang
            }

        };
        BangThongTin_Table.setModel(defaultTableModel);

        defaultTableModel.addColumn("Mã sinh viên");
        defaultTableModel.addColumn("Mã KTX");
        defaultTableModel.addColumn("Họ tên");
        defaultTableModel.addColumn("CMND");
        defaultTableModel.addColumn("Số điện thoại");
        
        BangThongTin_Table.setModel(defaultTableModel);
        setTableData(studentDao.getAlLStudents());
        //setTableModel(studentDao.getAlLStudents());
    }
    
    //tringBuilder sb = new StringBuilder();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void setTableData(List<Student> students){
        for (Student st: students) {
            defaultTableModel.addRow(new Object[]{ st.getMaSv_140(),st.getMaKTX_140(),
                (st.getHo_140()+" "+st.getTen_140()), st.getCMND_140(), st.getSDT_140()});
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        SoSinhVienToiDa_Label = new javax.swing.JLabel();
        SoSinhVienHienTai_TextField = new javax.swing.JTextField();
        Them_Button = new javax.swing.JButton();
        TinhTrangPhong_TextField = new javax.swing.JTextField();
        Sua_Button = new javax.swing.JButton();
        SoSinhVienToiDa_TextField = new javax.swing.JTextField();
        Xoa_Button = new javax.swing.JButton();
        Thoat_Button = new javax.swing.JButton();
        TenPhong_TextField = new javax.swing.JTextField();
        MaPhong_TextField = new javax.swing.JTextField();
        PhongCanTim_Label = new javax.swing.JLabel();
        PhongCanTim_TextField = new javax.swing.JTextField();
        TimKiem_Button = new javax.swing.JButton();
        TenPhong_Label = new javax.swing.JLabel();
        MaPhong_Label = new javax.swing.JLabel();
        LoaiPhong_Label = new javax.swing.JLabel();
        SoSinhVienHienTai_Label = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BangThongTin_Table = new javax.swing.JTable();
        TinhTrangPhong_Label = new javax.swing.JLabel();
        LoaiPhong_ComboBox = new javax.swing.JComboBox<>();
        PhongCanTim_ComboBox = new javax.swing.JComboBox<>();
        ThongBaoTimKiem_Label = new javax.swing.JLabel();
        ThongBaoTimKiem1_Label = new javax.swing.JLabel();
        ThongTin_Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin chi tiết của phòng:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        jPanel1.setToolTipText("");

        SoSinhVienToiDa_Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SoSinhVienToiDa_Label.setForeground(new java.awt.Color(255, 255, 255));
        SoSinhVienToiDa_Label.setText("Số Sinh Viên Tối Đa: ");

        SoSinhVienHienTai_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoSinhVienHienTai_TextFieldActionPerformed(evt);
            }
        });

        Them_Button.setBackground(new java.awt.Color(0, 0, 0));
        Them_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Them_Button.setForeground(new java.awt.Color(255, 255, 255));
        Them_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/Login-icon-16.png"))); // NOI18N
        Them_Button.setText("Thêm ");
        Them_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Them_ButtonActionPerformed(evt);
            }
        });

        Sua_Button.setBackground(new java.awt.Color(0, 0, 0));
        Sua_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Sua_Button.setForeground(new java.awt.Color(255, 255, 255));
        Sua_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/Actions-document-edit-icon-16.png"))); // NOI18N
        Sua_Button.setText("Sửa");
        Sua_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sua_ButtonActionPerformed(evt);
            }
        });

        Xoa_Button.setBackground(new java.awt.Color(0, 0, 0));
        Xoa_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Xoa_Button.setForeground(new java.awt.Color(255, 255, 255));
        Xoa_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/Actions-edit-delete-icon-16.png"))); // NOI18N
        Xoa_Button.setText("Xóa");
        Xoa_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Xoa_ButtonActionPerformed(evt);
            }
        });

        Thoat_Button.setBackground(new java.awt.Color(0, 0, 0));
        Thoat_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Thoat_Button.setForeground(new java.awt.Color(255, 255, 255));
        Thoat_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/logout-icon-16.png"))); // NOI18N
        Thoat_Button.setText("Thoát");
        Thoat_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Thoat_ButtonActionPerformed(evt);
            }
        });

        PhongCanTim_Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PhongCanTim_Label.setForeground(new java.awt.Color(255, 255, 255));
        PhongCanTim_Label.setText("Nhập tên phòng cần tìm: ");

        PhongCanTim_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhongCanTim_TextFieldActionPerformed(evt);
            }
        });

        TimKiem_Button.setBackground(new java.awt.Color(0, 0, 0));
        TimKiem_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TimKiem_Button.setForeground(new java.awt.Color(255, 255, 255));
        TimKiem_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/search-icon-24.png"))); // NOI18N
        TimKiem_Button.setText("Tìm Kiếm");
        TimKiem_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiem_ButtonActionPerformed(evt);
            }
        });

        TenPhong_Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TenPhong_Label.setForeground(new java.awt.Color(255, 255, 255));
        TenPhong_Label.setText("Tên Phòng:");

        MaPhong_Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        MaPhong_Label.setForeground(new java.awt.Color(255, 255, 255));
        MaPhong_Label.setText("Mã Phòng: ");

        LoaiPhong_Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LoaiPhong_Label.setForeground(new java.awt.Color(255, 255, 255));
        LoaiPhong_Label.setText("Loại Phòng: ");

        SoSinhVienHienTai_Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SoSinhVienHienTai_Label.setForeground(new java.awt.Color(255, 255, 255));
        SoSinhVienHienTai_Label.setText("Số Sinh Viên Hiện Tại: ");

        BangThongTin_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Tên phòng", "Mã phòng", "Loại phòng ", "Số sinh viên hiện tại", "Số sinh viên tối đa", "Tình trạng phòng"
            }
        ));
        jScrollPane2.setViewportView(BangThongTin_Table);

        TinhTrangPhong_Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TinhTrangPhong_Label.setForeground(new java.awt.Color(255, 255, 255));
        TinhTrangPhong_Label.setText("Tình Trạng Phòng: ");

        LoaiPhong_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        LoaiPhong_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoaiPhong_ComboBoxActionPerformed(evt);
            }
        });

        PhongCanTim_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A2.2", "A3.1", "A4.1", "B1.1", "C1.1" }));

        ThongBaoTimKiem1_Label.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PhongCanTim_Label)
                    .addComponent(TenPhong_Label)
                    .addComponent(MaPhong_Label)
                    .addComponent(SoSinhVienHienTai_Label)
                    .addComponent(SoSinhVienToiDa_Label)
                    .addComponent(LoaiPhong_Label)
                    .addComponent(TinhTrangPhong_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PhongCanTim_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(PhongCanTim_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TinhTrangPhong_TextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SoSinhVienToiDa_TextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SoSinhVienHienTai_TextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoaiPhong_ComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TenPhong_TextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MaPhong_TextField, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ThongBaoTimKiem1_Label, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Sua_Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Xoa_Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Thoat_Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Them_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                    .addComponent(TimKiem_Button, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(ThongBaoTimKiem_Label)
                .addGap(5, 5, 5))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ThongBaoTimKiem1_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhongCanTim_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhongCanTim_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhongCanTim_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimKiem_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ThongBaoTimKiem_Label))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Them_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Sua_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Xoa_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Thoat_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TenPhong_Label)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(TenPhong_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MaPhong_Label)
                            .addComponent(MaPhong_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(LoaiPhong_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LoaiPhong_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SoSinhVienHienTai_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SoSinhVienHienTai_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SoSinhVienToiDa_Label)
                            .addComponent(SoSinhVienToiDa_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TinhTrangPhong_Label)
                            .addComponent(TinhTrangPhong_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ThongTin_Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ThongTin_Label.setForeground(new java.awt.Color(204, 0, 0));
        ThongTin_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/home1.png"))); // NOI18N
        ThongTin_Label.setText("THÔNG TIN TỪNG PHÒNG TẠI KÝ TÚC XÁ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(ThongTin_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(ThongTin_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SoSinhVienHienTai_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoSinhVienHienTai_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SoSinhVienHienTai_TextFieldActionPerformed

    private void Them_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Them_ButtonActionPerformed
        // TODO add your handling code here:

        h40.setTenPhong(TenPhong_TextField.getText());
        h40.setMaPhong(MaPhong_TextField.getText());
        //h40.setLoaiPhong(LoaiPhong_ComboBox.isSelected()? 1; 0);
        String valueCombobox = LoaiPhong_ComboBox.getSelectedItem().toString();
        h40.setSoSVHienTai(SoSinhVienHienTai_TextField.getText());
        h40.setSoSVToiDa(SoSinhVienToiDa_TextField.getText());
        h40.setTinhTrangPhong(TinhTrangPhong_TextField.getText());
        BangThongTin_Table.setModel(defaultTableModel);
        defaultTableModel.addRow(new Object[]{h40.getTenPhong(), h40.getMaPhong(),h40.getLoaiPhong(),
            h40.getSoSVHienTai(), h40.getSoSVToiDa(), h40.getTinhTrangPhong()});
    JOptionPane.showMessageDialog(rootPane, "Đã thêm thành công 1 hàng dữ liệu!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Them_ButtonActionPerformed

    private void Sua_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sua_ButtonActionPerformed
        // TODO add your handling code here:
        int row = BangThongTin_Table.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(rootPane, "Chọn hàng dữ liệu bạn muốn chỉnh sửa!",
                "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            ThongTinPhong_140 h40 = new ThongTinPhong_140();

            h40.setTenPhong((String) BangThongTin_Table.getValueAt(row, 0));
            h40.setMaPhong((String) BangThongTin_Table.getValueAt(row, 1));
            h40.setLoaiPhong((int) BangThongTin_Table.getValueAt(row, 2));
            h40.setSoSVHienTai((String) BangThongTin_Table.getValueAt(row, 3));
            h40.setSoSVToiDa((String) BangThongTin_Table.getValueAt(row, 4));
            h40.setTinhTrangPhong((String) BangThongTin_Table.getValueAt(row, 5));
            new QuanLyPhong_140().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_Sua_ButtonActionPerformed
private void showDuLieu(){
        try{
            BangThongTin_Table.removeAll();
            String[] arr = {"Mã sinh viên", "Mã KTX", "Họ tên", "CMND","Số điện thoại"};
            DefaultTableModel model = new DefaultTableModel(arr,0);
            BangThongTin_Table.setModel(model);
            Connection connection = KetNoiSQL.getConnection();
            String query = "SELECT *FROM dbo.[quanlycosovatchat]";
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Vector vector = new Vector();
                vector.add(rs.getString("mSV"));
                vector.add(rs.getString("maKTX"));
                vector.add(rs.getString("hoTen"));
                vector.add(rs.getString("CMND"));
                vector.add(rs.getString("soDienThoai"));
                
                
                model.addRow(vector);

            }
            //đóng kết nối 
            KetNoiSQL.closeConnection(connection);
            BangThongTin_Table.setModel((TableModel) model);
        }catch(SQLException ex){
           Logger.getLogger(ThongTinPhong_140.class.getName()).log(Level.SEVERE,null,ex);
           
        }
    }
    private void Xoa_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Xoa_ButtonActionPerformed
        // TODO add your handling code here:
      int result = JOptionPane.showConfirmDialog(null,"Bạn có chắc chắn muốn xóa không");
        if(result == 0 ){
            int position = BangThongTin_Table.getSelectedRow();
            String data = BangThongTin_Table.getModel().getValueAt(position, 0).toString();
              try{
                Connection connection = KetNoiSQL.getConnection();
                String query = "DELETE FROM dbo.[Phong] WHERE maPhong = ? ";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1,data);
                ps.executeUpdate();
                showDuLieu();
                KetNoiSQL.closeConnection(connection);
                JOptionPane.showMessageDialog(rootPane, "Đã xóa thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }                    
    }//GEN-LAST:event_Xoa_ButtonActionPerformed

    private void Thoat_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Thoat_ButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_Thoat_ButtonActionPerformed

    private void PhongCanTim_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhongCanTim_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhongCanTim_TextFieldActionPerformed

    private void TimKiem_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiem_ButtonActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        if (PhongCanTim_TextField.getText().equals(""))
        {
            sb.append("Mời bạn nhập tên phòng cần tìm! \n");
            PhongCanTim_TextField.setBackground(Color.YELLOW);
            PhongCanTim_TextField.requestFocus();
        }
        if (sb.length()>0)
        {
            JOptionPane.showMessageDialog(this, sb.toString(), "Thông báo",
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            if(h40!= null){
                TenPhong_TextField.setText(h40.getTenPhong());
            }

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Thông báo" + e.getMessage());
            e.printStackTrace();

        }
        String valueCombobox = PhongCanTim_ComboBox.getSelectedItem().toString();

        List<Student> resultSearch = stDao.GetResultSearch(valueCombobox, PhongCanTim_TextField.getText());
        defaultTableModel.setRowCount(0);

        if (!resultSearch.isEmpty()) {
           setTableData(resultSearch);
        } else {
            ThongBaoTimKiem1_Label.setText(valueCombobox + " Doesn't exist!");
        }            
    }//GEN-LAST:event_TimKiem_ButtonActionPerformed

    private void LoaiPhong_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoaiPhong_ComboBoxActionPerformed
        // TODO add your handling code here:
        //String selectedItem = (String) ComboBoxGioiTinh.getSelectedItem();
        //System.out.println("Lựa chọn loại phòng phù hợp: " + selectedItem);
    }//GEN-LAST:event_LoaiPhong_ComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyPhong_140.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyPhong_140.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyPhong_140.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyPhong_140.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyPhong_140().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BangThongTin_Table;
    private javax.swing.JComboBox<String> LoaiPhong_ComboBox;
    private javax.swing.JLabel LoaiPhong_Label;
    private javax.swing.JLabel MaPhong_Label;
    private javax.swing.JTextField MaPhong_TextField;
    private javax.swing.JComboBox<String> PhongCanTim_ComboBox;
    private javax.swing.JLabel PhongCanTim_Label;
    private javax.swing.JTextField PhongCanTim_TextField;
    private javax.swing.JLabel SoSinhVienHienTai_Label;
    private javax.swing.JTextField SoSinhVienHienTai_TextField;
    private javax.swing.JLabel SoSinhVienToiDa_Label;
    private javax.swing.JTextField SoSinhVienToiDa_TextField;
    private javax.swing.JButton Sua_Button;
    private javax.swing.JLabel TenPhong_Label;
    private javax.swing.JTextField TenPhong_TextField;
    private javax.swing.JButton Them_Button;
    private javax.swing.JButton Thoat_Button;
    private javax.swing.JLabel ThongBaoTimKiem1_Label;
    private javax.swing.JLabel ThongBaoTimKiem_Label;
    private javax.swing.JLabel ThongTin_Label;
    private javax.swing.JButton TimKiem_Button;
    private javax.swing.JLabel TinhTrangPhong_Label;
    private javax.swing.JTextField TinhTrangPhong_TextField;
    private javax.swing.JButton Xoa_Button;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
