package pe.edu.pucp.iweb.lab7.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import pe.edu.pucp.iweb.lab7.beans.Sede;

public class SedeDao extends BaseDao<Sede> { // TODO 2a: debe heredar de BaseDao

    /**
     * Ejercicio 2c: retorna todas las sedes ordenadas por nombre.
     */
    public ArrayList<Sede> listar() {
        ArrayList<Sede> lista = new ArrayList<>();
        // TODO 2c
            String sql = "SELECT idsede, nombre FROM sede ORDER BY nombre";
            try (Connection conn = this.getConnection();
                 PreparedStatement ps = conn.prepareStatement(sql);
                 ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Sede s = new Sede();
                    s.setIdSede(rs.getInt("id"));
                    s.setNombre(rs.getString("nombre"));
                    lista.add(s);
                }
            } catch (SQLException e) { e.printStackTrace(); }
        return lista;
    }


    /**
     * Apoyo para el Ejercicio 4: retorna la sede con el id indicado,
     * o null si no existe.
     */
    public Sede buscarPorId(int idSede) {
        // TODO 4
        return null;
    }
}
