package Model;

import JDBC.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Service {

    private int id;
    private String nomeServico;
    private Sector setor;

    public Service(int id, String nomeServico, Sector setor) {
        this.id = id;
        this.nomeServico = nomeServico;
        this.setor = setor;
    }

    public Service() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public Sector getSetor() {
        return setor;
    }

    public void setSetor(Sector setor) {
        this.setor = setor;
    }

    public void cadastro(String name, int sector) {
        try {
            Connection con = ConnectionFactory.getConnection();
            String query;
            query = "insert into servico (nome_servico, id_setor) values (?,?)";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, name);
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
