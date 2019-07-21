package Model;

import JDBC.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Employee {

    private int id;
    private String nomeCompleto;
    private String nomeReduzido;
    private boolean ativo;
    private String data;
    private Role Cargo;

    /**
     *
     * @param id
     * @param nomeCompleto
     * @param nomeReduzido
     * @param ativo
     * @param data
     * @param Cargo
     */
    public Employee(int id, String nomeCompleto, String nomeReduzido, boolean ativo, String data, Role Cargo) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.nomeReduzido = nomeReduzido;
        this.ativo = ativo;
        this.data = data;
        this.Cargo = Cargo;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeReduzido() {
        return nomeReduzido;
    }

    public void setNomeReduzido(String nomeReduzido) {
        this.nomeReduzido = nomeReduzido;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Role getCargo() {
        return Cargo;
    }

    public void setCargo(Role Cargo) {
        this.Cargo = Cargo;
    }
    
    
    
    
    public void cadastro(String data, String nomeCompleto, String nomeReduzido, int cargo) {
        try {
            Connection con = ConnectionFactory.getConnection();
            String query;

            String anoInverso = data.substring(6, 10) + data.substring(2, 6) + data.substring(0, 2);
            query = "insert into funcionario (nome_completo,nome_reduzido,ativo,data_ativacao,id_cargo) values (?,?,1,?,?)";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, nomeCompleto);
            stmt.setString(2, nomeReduzido);
            stmt.setString(3, anoInverso);
            stmt.setInt(4, cargo);
            stmt.executeUpdate();
            stmt.close();
            con.close();
            JOptionPane.showOptionDialog(null, "Cadastro Realizado com Sucesso", "Confirmação!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, null, "ok");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    
    
}
