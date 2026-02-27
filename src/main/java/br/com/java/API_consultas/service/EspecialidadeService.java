package br.com.java.API_consultas.service;

import br.com.java.API_consultas.model.Especialidade;
import br.com.java.API_consultas.repository.EspecialidadeRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class EspecialidadeService {
    private final EspecialidadeRepository repository;
    public EspecialidadeService(EspecialidadeRepository repository) {
        this.repository = repository;
    }
    public Especialidade salvar(Especialidade especialidade) {
        return repository.save(especialidade);
    }
    public List<Especialidade> listar() {
        return repository.findAll();
    }
}