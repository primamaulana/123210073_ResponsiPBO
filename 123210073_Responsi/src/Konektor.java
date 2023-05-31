/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author Lab Informatika
 */
public class Konektor {
    public static Connection koneksi;
    public static Statement statement;
    
    public static Connection getKoneksi(){
        if (koneksi==null) {
            try {
                String url = "jdbc:mysql://localhost/movie_db";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                koneksi = DriverManager.getConnection(url,user,password);
                statement = koneksi.createStatement();
                System.out.println("Koneksi Berhasil");
            } catch (Exception e) {
                System.out.println("Koneksi Error");
            }
        }
        return koneksi;
    }
}
