/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import JDBC.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author willi
 */
public class Sector {

    public void cadastro(String nome) {
        try {
            Connection con = ConnectionFactory.getConnection();
            String query;
            query = "insert into setor (nome_setor) values (?)";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, nome);
            stmt.executeUpdate();
            stmt.close();
            con.close();
            JOptionPane.showOptionDialog(null, "Cadastro Realizado com Sucesso", "Confirmação!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, null, "ok");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
}
