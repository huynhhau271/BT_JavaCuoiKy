package KetNoiSQL;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




/**
 *
 * @author Huynh Hau
 */
public class KetNoiSQL {

    public static void closeConnection(Connection connection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Connection con = null;

    public KetNoiSQL() {
        String url = "net.sourceforge.jtds.jdbc.Driver";
        try {
            Class.forName(url);
            String dbUrl = "jdbc:jtds:sqlserver://DESKTOP-46JU1LI:1433/ManagementKTX;user=sa;password=271271";
            try {
                con = DriverManager.getConnection(dbUrl);
            } catch (SQLException ex) {
                Logger.getLogger(KetNoiSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KetNoiSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Connection getConnection(){
        Connection conn = null;
        String url = "net.sourceforge.jtds.jdbc.Driver";
        try {
            Class.forName(url);
            String dbUrl = "jdbc:jtds:sqlserver://DESKTOP-46JU1LI:1433/ManagementKTX;user=sa;password=271271";
            try {
                conn = DriverManager.getConnection(dbUrl);
            } catch (SQLException ex) {
                Logger.getLogger(KetNoiSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KetNoiSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    public ResultSet GetResultSet(String tableName) throws SQLException {

        ResultSet rs = null;

        Statement stmt = con.createStatement();

        String sql = "select * from " + tableName;

        rs = stmt.executeQuery(sql);

        return rs;

    }

    public void Close() throws Exception {

        con.close();
    }

    public static void main(String[] args) {
        KetNoiSQL kn = new KetNoiSQL();
        try {
            ResultSet rs = kn.GetResultSet("SinhVien");//Table Name

            while (rs.next()) {
                System.out.println(rs.getString("MaSV"));//Field Name
            }
            kn.Close();
        } catch (SQLException ex) {
            Logger.getLogger(KetNoiSQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(KetNoiSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
