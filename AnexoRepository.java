package br.com.gc.relacionamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gc.relacionamento.model.Anexo;

@Repository
public interface AnexoRepository extends JpaRepository<Anexo, Long> {

}
