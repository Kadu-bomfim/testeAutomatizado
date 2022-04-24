package dao;

import conexao_properties.CredencialHelper;

import java.sql.*;

public class DatabaseReader {

    private CredencialHelper credencialHelper;

    public DatabaseReader() {
        this.credencialHelper = new CredencialHelper("config.properties");
    }

    private Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(credencialHelper.getUrl(), credencialHelper.getLogin(), credencialHelper.getSenha());
        connection.setAutoCommit(false);
        return connection;
    }

    public String getData(String id) {
        String sql = "SELECT dados FROM testeAutomatizado.dbo.usuarios where id='" +id+ "'";
        try (Connection connection = getConnection();

             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultado = preparedStatement.executeQuery();

        ) {
            String dados = null;

            while (resultado.next()) {
                dados = resultado.getString("dados");
                break;
            }
            return dados;

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }


}
