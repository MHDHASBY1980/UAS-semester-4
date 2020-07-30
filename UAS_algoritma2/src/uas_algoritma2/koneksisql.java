/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_algoritma2;

import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

/**
 *
 * @author USER
 */
public class koneksisql {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         koneksisql tesKoneksi = new koneksisql();
        tesKoneksi.koneksisql();
    }
    Connection con = null;
    String statuskoneksi;

    public void koneksisql() {
        try {
            String connectionURL = "jdbc:mysql://localhost/logindata";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(connectionURL, username, password);
            //JOptionPane.showMessageDialog(null, "koneksi sukses");
            statuskoneksi = "berhasil";
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
            statuskoneksi = "Gagal";
            //System.exit(0);
        }
    }
}
