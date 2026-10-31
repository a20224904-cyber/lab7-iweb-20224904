package pe.edu.pucp.iweb.lab7.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Ejercicio 2a: DAO base.
 *
 *  - Esta clase debe ser ABSTRACTA.
 *  - SedeDao y EquipoDao deben heredar de ella y obtener la conexión
 *    únicamente con getConnection().
 */
public abstract class BaseDao<T> { // TODO 2a: convertir en clase abstracta

    public Connection getConnection() throws SQLException {
        // TODO 2a: cargar el driver (com.mysql.cj.jdbc.Driver) y retornar la conexión
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new UnsupportedOperationException("getConnection() aún no implementado");
        }
        String url = "jdbc:mysql://localhost:3306/telecom_andina"
                + "?serverTimezone=America/Lima";
        String user = "root";
        String pass = "12345678";
        return DriverManager.getConnection(url, user, pass);

    }


}
