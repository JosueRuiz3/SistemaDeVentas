package connetion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    
    private static final String DATABASE_URL = "jdbc:ucanaccess://D:\\Proyectos IDEs\\Proyectos GitHub Main\\Punto de Venta\\Base de datos access/SistemaDeVentas.accdb";

    static {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DATABASE_URL);
    }
    
}
