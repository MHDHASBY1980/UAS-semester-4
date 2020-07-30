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
public class Delete {

    koneksisql konek = new koneksisql();

    public void delete(String kodebarang) {

        try {
            konek.koneksisql();
            Statement statement = (Statement) konek.con.createStatement();
            String sql = "delete from barang where kodebarang= '" + kodebarang + "'"; 
            statement.executeUpdate(sql);
            statement.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}
