package connectBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class connection {
    public static String status = "Sem conexão ativa!";

    public connection() {
        //defaultClass
    }

    public static java.sql.Connection getconnection() {
        Connection connection = null;

        try {
            String driverName = "com.mysql.cj.jdbc.Driver";
            Class.forName(driverName);

            String serverName = "localhost";
            String mydatabase = "appcontatos";
            String url = "jdbc:mysql://" + serverName + ":3306/" + mydatabase;
            String username = "root";
            String password = "@rootsql";

            connection = DriverManager.getConnection(url, username, password);

            if (connection != null) {
                status = ("BD CONECTADO");
            } else {
                status = ("VALIDAR PARAM. CONEXÃO");
            }
            return connection;

                } catch (ClassNotFoundException e) {
                    System.out.println("DRIVER NÃO ENCONTRADO");
                    return null;
                }

                catch (SQLException e) {
                    System.err.println("FALHA NA CONEXÃO");
                    return null;
                }
    }

    public static boolean FecharConexao() {
        try {
            connection.getconnection().close();
            return true;
        }

        catch (SQLException e) {
            return false;
        }
    }

    public static String statusConection() {
        return status;
    }

}

    