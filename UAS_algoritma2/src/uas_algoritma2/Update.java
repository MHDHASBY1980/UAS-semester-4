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
public class Update {

    koneksisql konek = new koneksisql();

    public void Update(String kodebarang, String tipebarang, String merekbarang, String hargamodal, String hargajual, int stok) {

        try {
            konek.koneksisql();
            Statement statement = (Statement) konek.con.createStatement();
            // String sql = "update identitasmahasiswa set nim = "+ nim +"where nim = '" + nim + "'"; 
            // String sql = "update into identitasmahasiswa (nim, nama, alamat, jeniskelamin)"+ "values('" + nim + "','" + nama + "','" + alamat + "','" + jk + "')";
            String sql_tipebarang = "update barang set tipebarang='" + tipebarang + "'where kodebarang='" + kodebarang + "'";
            String sql_merekbarang = "update barang set merekbarang='" + merekbarang + "'where kodebarang='" + kodebarang + "'";
            String sql_hargamodal = "update barang set hargamodal='" + hargamodal + "'where kodebarang='" + kodebarang + "'";
            String sql_hargajual = "update barang set hargajual='" + hargajual + "'where kodebarang='" + kodebarang + "'";
            String sql_stok = "update barang set stok='" + stok + "'where kodebarang='" + kodebarang + "'";

            statement.executeUpdate(sql_tipebarang);
            statement.executeUpdate(sql_merekbarang);
            statement.executeUpdate(sql_hargamodal);
            statement.executeUpdate(sql_hargajual);
            statement.executeUpdate(sql_stok);
            statement.close();

            // JOptionPane.showMessageDialog(null, "berhasil");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
