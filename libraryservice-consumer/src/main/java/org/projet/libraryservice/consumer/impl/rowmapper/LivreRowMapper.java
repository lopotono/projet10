package org.projet.libraryservice.consumer.impl.rowmapper;

import org.projet.libraryservice.model.Livre;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LivreRowMapper implements RowMapper<Livre> {

    public Livre mapRow(ResultSet pRS, int pRowNum) throws SQLException {
        Livre vLivre = new Livre();
        vLivre.setLivreid(pRS.getInt("id_livre"));
        vLivre.setTitre(pRS.getString("titre"));
        vLivre.setAuteur(pRS.getString("auteur"));
        vLivre.setIsbn(pRS.getString("isbn"));
        vLivre.setGenre(pRS.getString("genre"));
        vLivre.setDisponible(pRS.getBoolean("disponible"));
        vLivre.setNbexemplaire(pRS.getInt("nombre_exemplaire"));
        vLivre.setEditeur(pRS.getString("editeur"));
        return vLivre;
    }
}