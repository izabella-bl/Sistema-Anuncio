package com.Sistema.Anuncio.SistemaAnuncio.Repository;

import com.Sistema.Anuncio.SistemaAnuncio.models.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente,Long> {

    Cliente findByNome(String nome);

}
