package db_mhs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class koneksi {
    static Connection koneksi = null;

    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/mahasiswa";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Terkoneksi");
            } catch (SQLException t) {
                System.out.println("Error membuat koneksi");
            }
        }
        return koneksi;
    }
    
}
