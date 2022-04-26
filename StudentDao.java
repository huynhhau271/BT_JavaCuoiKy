package Dao;

import KetNoiSQL.KetNoiSQL;
import Model.Student;
import View.ThongTinPhong_140;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;



public class StudentDao {

    public List<Student> getAlLStudents() {
        List<Student> students = new ArrayList<Student>();
        KetNoiSQL connection = new KetNoiSQL();
        try {
            ResultSet rs = connection.GetResultSet("[SinhVien]");
            while (rs.next()) {
                Student student = new Student();

                student.setMaSv_140(rs.getString("MaSV"));
                student.setMaKTX_140(rs.getString("MaKTX"));
                student.setHo_140(rs.getString("Ho"));
                student.setTen_140(rs.getString("Ten"));
                student.setCMND_140(rs.getString("CMND"));
                student.setGioitinh_140(rs.getInt("GioiTinh"));
                student.setNgaysinh_140(rs.getString("Ngaysinh"));
                student.setSDT_140(rs.getString("SDT"));
                student.setQuequan_140(rs.getString("Quequan"));
                student.setNgaylamhopdong_140(rs.getString("Ngaylamhopdong"));
                student.setMaPhong_140(rs.getString("MaPhong"));
                student.setHinh_140(rs.getString("Hinh"));
                student.setHotengh_140(rs.getString("Hotengh"));
                student.setSdtgh_140(rs.getString("Sdtgh"));
                student.setQuanhe_140(rs.getString("QuanHe"));
                student.setNghenghiep_140(rs.getString("Nghenghiep"));

                students.add(student);

            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;

    }

    public Student getStudentByID(String id) {
        Connection conn = KetNoiSQL.getConnection();
        String sql = "Select * from SinhVien where MaSV = ?";
        Student student = new Student();
        try {
            PreparedStatement stm;
            stm = conn.prepareStatement(sql);
            stm.setString(1, id);
            ResultSet rs ;
            rs = stm.executeQuery();
            if (rs.next()) {
                student.setMaSv_140(rs.getString("MaSV"));
                student.setMaKTX_140(rs.getString("MaKTX"));
                student.setHo_140(rs.getString("Ho"));
                student.setTen_140(rs.getString("Ten"));
                student.setCMND_140(rs.getString("CMND"));
                student.setGioitinh_140(rs.getInt("Gioitinh"));
                student.setNgaysinh_140(rs.getString("Ngaysinh"));
                student.setSDT_140(rs.getString("SDT"));
                student.setQuequan_140(rs.getString("Quequan"));
                student.setNgaylamhopdong_140(rs.getString("Ngaylamhopdong"));
                student.setMaPhong_140(rs.getString("MaPhong"));
                student.setHinh_140(rs.getString("Hinh"));
                student.setHotengh_140(rs.getString("Hotengh"));
                student.setSdtgh_140(rs.getString("Sdtgh"));
                student.setQuanhe_140(rs.getString("Quanhe"));
                student.setNghenghiep_140(rs.getString("Nghenghiep"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return student;
    }
    
    public void DeleteTTPhong(String id) {
        Connection conn = KetNoiSQL.getConnection();
        
        try {
            PreparedStatement stm = conn.prepareStatement(" Bạn có muốn xóa không ?");
            stm.setString(1, id);
            
            int resultSet = stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void TimKiemTenPhong(Student SD_140) {
        Connection conn = KetNoiSQL.getConnection();

        try {
            PreparedStatement stm = conn.prepareStatement("insert into tenPhong values (?)");
            
            stm.setString(1, SD_140.getTenPhong_140());
            
            int resultSet = stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    
    public List<Student> GetResultSearch(String searchType, String valueSearch) {
        List<Student> student = new ArrayList<>();
        Connection conn = KetNoiSQL.getConnection();

        try {
            PreparedStatement stm = null;
            switch (searchType) {
                case "tenPhong":
                    stm = conn.prepareStatement("select * from Phong where tenPhong = ?");
                    stm.setObject(1, valueSearch);
                    break;

                
            }
         
            ResultSet result = stm.executeQuery();

            while (result.next()) {
                Student SD = new Student();

                SD.setTenPhong_140(result.getString("tenPhong"));
               
                student.add(SD);
            }
            return student;
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
   
}

        
    
    
//    public User getUserByUsername(String userName) {
//        Connection conn = KetNoiSQL.getConnection();
//        String sql = "SELECT *  FROM dbo.[User] WHERE username=?";
//
//        User user = new User();
//        try {
//            PreparedStatement stm;
//            stm = conn.prepareStatement(sql);
//            stm.setString(1, userName);
//            ResultSet rs = stm.executeQuery();
//
//            if (rs.next()) {
//                user.setId(rs.getInt("id"));
//                user.setName(rs.getString("name"));
//                user.setPhone(rs.getString("phone"));
//                user.setUsername(rs.getString("username"));
//                user.setPassword(rs.getString("password"));
//                user.setRole(rs.getString("role"));
//                user.setFavourites(rs.getString("favourites"));
//                user.setAbout(rs.getString("about"));
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return user;
//
//    }
