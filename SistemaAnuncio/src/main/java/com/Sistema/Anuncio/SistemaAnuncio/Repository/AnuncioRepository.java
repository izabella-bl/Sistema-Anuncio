package com.Sistema.Anuncio.SistemaAnuncio.Repository;

import com.Sistema.Anuncio.SistemaAnuncio.models.Anuncio;
import com.Sistema.Anuncio.SistemaAnuncio.models.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface AnuncioRepository  extends CrudRepository<Anuncio,Long> {
    List<Anuncio> findByDataInicioGreaterThanEqual(LocalDate dataInicio);

    List<Anuncio> findByDataInicioGreaterThanEqualAndDataInicioLessThanEqual(LocalDate dataInicio, LocalDate dataFinal);

    List<Anuncio> findByDataInicioGreaterThanEqualAndCliente(LocalDate dataInicio, Cliente cliente);

    List<Anuncio> findByDataInicioLessThanEqualAndCliente(LocalDate dataFinal, Cliente cliente);

    List<Anuncio> findByDataInicioLessThanEqual(LocalDate dataFinal);

    List<Anuncio> findByDataInicioGreaterThanEqualAndDataInicioLessThanEqualAndCliente(LocalDate dataInicio, LocalDate dataFinal, Cliente cliente);

    List<Anuncio> findByCliente(Cliente cliente);

    Anuncio findByNome(String nome);
}
