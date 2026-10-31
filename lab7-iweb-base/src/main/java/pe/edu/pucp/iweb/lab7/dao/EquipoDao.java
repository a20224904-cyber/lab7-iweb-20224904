package pe.edu.pucp.iweb.lab7.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import pe.edu.pucp.iweb.lab7.beans.EquipoAP;
import pe.edu.pucp.iweb.lab7.beans.EquipoRed;
import pe.edu.pucp.iweb.lab7.beans.EquipoSwitch;

public class EquipoDao extends BaseDao<EquipoRed> { // TODO 2a: debe heredar de BaseDao

    /**
     * Ejercicio 2c: retorna los equipos de la sede indicada, ordenados por sede y modelo.
     * Si idSede es 0, retorna todos los equipos.
     *
     * Según la columna tipo, cree un objeto EquipoSwitch ('SWITCH') o EquipoAP ('AP').
     * Use PreparedStatement.
     */
    public ArrayList<EquipoRed> listarPorSede(int idSede) {
        ArrayList<EquipoRed> lista = new ArrayList<>();
        // TODO 2c
        StringBuilder sql = new StringBuilder(
                "SELECT s.idSede, s.nombre AS nombre_sede" +
                        "e.modelo AS equipo_id" +
                        "INNER JOIN sede s ON s.idsede = e.idsede " +
                        "WHERE 1 = 1 "
        );
        // Solo agregamos la condicion si el usuario eligio un filtro.
        if (idSede == 0) {
            sql.append("AND s. = ? ");
        }
        sql.append("ORDER BY l.id");
        try (Connection conn = this.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql.toString())) {
            int pos = 1;
            if (generoId != null) ps.setInt(pos++, generoId);
            if (editorialId != null) ps.setInt(pos++, editorialId);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Libro libro = new Libro();
                    libro.setId(rs.getInt("id"));
                    libro.setTitulo(rs.getString("titulo"));
                    libro.setAutor(rs.getString("autor"));
                    libro.setPaginas(rs.getInt("paginas"));
                    libro.setPremios(rs.getInt("premios"));
                    EquipoSwitch eS = new EquipoSwitch();
                    genero.setId(rs.getInt("genero_id"));
                    genero.setNombre(rs.getString("genero_nombre"));
                    libro.setGenero(genero);
                    EquipoAP eA = new EquipoAP();
                    eA.setSede(rs.getInt("editorial_id"));
                    eA.setIdEquipo(rs.getString("editorial_nombre"));
                    libro.setEditorial(editorial);
                    lista.add(libro);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;

    }
