/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_algoritma2;

import com.mysql.jdbc.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class insert {
    koneksisql konek = new koneksisql();

    public void insert(String kodebarang, String tipebarang, String merekbarang, String hargamodal, String hargajual, int stok) {

        try {
            konek.koneksisql();
            Statement statement = (Statement) konek.con.createStatement();
            String sql = "insert into barang (kodebarang, tipebarang, merekbarang, hargamodal, hargajual, stok)"+ "values('" + kodebarang + "','" + tipebarang + "','" + merekbarang + "','" + hargamodal + "', '" + hargajual + "','" + stok + "')";
            statement.executeUpdate(sql);
            statement.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
