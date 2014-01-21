package moneycalculator.Persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import oracle.jdbc.OracleDriver;

public class DBConnection {

    public void execute(String[] args) throws SQLException{
        DriverManager.registerDriver(new OracleDriver());
        String username= "system";
        String password = "orcl";
        //String url = "jdbc:oracle:thin:@" + "10.22.146.229:1521:orcl"; // Maquina de los profesores
        String url2 = "jdbc:oracle:thin:@" + "localhost:101:orcl";
        Connection connection = DriverManager.getConnection(url2, username, password);
        Statement statement = connection.createStatement();
        ResultSet set = statement.executeQuery("select * from CAMBIO_EUR_A");
        while (set.next()){
            print(set);
        }
    }

    private static void print(ResultSet set) throws SQLException {
        System.out.println(set.getString("DIVISA")+ " ");
        System.out.println("CAMBIO");
    }
}
