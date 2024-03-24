/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author ADMIN
 */
public class ConnectionHotel {
        public static void main(String[] args) {
        // Thông tin kết nối
        String url = "jdbc:sqlserver://localhost:1433;databaseName=HOANGDUONG\\SQLSEVER";
        String username = "sa";
        String password = "12345";

        // Đối tượng Connection
        Connection connection = null;

        try {
            // Tạo kết nối
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Kết nối đến cơ sở dữ liệu thành công.");

            // Thực hiện các hoạt động với cơ sở dữ liệu ở đây (truy vấn, cập nhật, ...)
        } catch (SQLException e) {
            System.out.println("Không thể kết nối đến cơ sở dữ liệu.");
            e.printStackTrace();
        } finally {
            try {
                // Đóng kết nối
                if (connection != null) {
                    connection.close();
                    System.out.println("Đã đóng kết nối đến cơ sở dữ liệu.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
