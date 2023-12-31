package org.utl.donGalleto.DAO;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.utl.donGalleto.Model.Galleta;
import org.utl.donGalleto.Model.Inventario;
import org.utl.donGalleto.Repositorio.RepositorioGalleta;

import java.util.List;
import java.util.Optional;

//TEST
@Repository
public class GalletaDAO {

    private final RepositorioGalleta repositorioGalleta;

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;


    public GalletaDAO(RepositorioGalleta repositorioGalleta, NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.repositorioGalleta = repositorioGalleta;
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    public void insertarGalleta(Galleta g) {
        repositorioGalleta.save(g);
    }

    public List<Galleta> getAllGalleta() {
        return repositorioGalleta.findAll();
    }

    public Optional<Galleta> buscarGalleta(long idGalleta) {
        return repositorioGalleta.findById(idGalleta);
    }

    public void eliminarGalleta(long idGalleta) {
        repositorioGalleta.deleteById(idGalleta);
    }

    public Galleta actualizarGalleta(Galleta g) {
        repositorioGalleta.save(g);
        return g;
    }






}
