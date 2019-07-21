package Model;

import JDBC.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Role {

    private int id;
    private String nomeCargo;
    private Service servicos;

    public Role(int id, String nomeCargo, Service servicos) {
        this.id = id;
        this.nomeCargo = nomeCargo;
        this.servicos = servicos;
    }

    public Role() {
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCargo() {
        return nomeCargo;
    }

    public void setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }

    public Service getServicos() {
        return servicos;
    }

    public void setServicos(Service servicos) {
        this.servicos = servicos;
    }
    
    

    public void cadastrar(String nome, int sector) {
        try {
            Connection con = ConnectionFactory.getConnection();
            String query;
            query = "insert into cargo (nome_cargo, id_setor) values (?,?)";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, nome);
            stmt.setInt(2, sector);
            stmt.executeUpdate();
            stmt.close();
            con.close();
            JOptionPane.showOptionDialog(null, "Cadastro Realizado com Sucesso", "Confirmação!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, null, "ok");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

}
