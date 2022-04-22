package conexao_properties;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class CredencialHelper {

    private String login;
    private String senha;
    private String url;
    private Connection connection = null;

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String getUrl() {
        return url;
    }

    public CredencialHelper(String propertiesFile) {

        Properties properties = new Properties();

        InputStream file = CredencialHelper.class.getClassLoader().getResourceAsStream(propertiesFile);

        try {
            properties.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        login = properties.getProperty("login");
        senha = properties.getProperty("senha");
        url = properties.getProperty("url");

    }
}
