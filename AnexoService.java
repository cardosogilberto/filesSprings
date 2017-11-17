package br.com.gc.relacionamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gc.relacionamento.model.Anexo;
import br.com.gc.relacionamento.repository.AnexoRepository;

@Service
public class AnexoService {

	@Autowired
	private AnexoRepository repository;
	
	 public List<Anexo> findAll() {
	        return repository.findAll();
	    }
	 
	 public Anexo findOne(Long id) {
	        return repository.findOne(id);
	    }
	     
	    public Anexo save(Anexo anexo) {
	        return repository.saveAndFlush(anexo);
	    }
	     
	    public void delete(Long id) {
	        repository.delete(id);
	    }
}
