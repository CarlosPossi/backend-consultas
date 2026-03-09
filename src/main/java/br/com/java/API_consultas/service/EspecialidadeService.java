package br.com.java.API_consultas.service;

import br.com.java.API_consultas.model.Especialidade;
import br.com.java.API_consultas.model.Paciente;
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

    public Especialidade buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Paciente não encontrado"));
    }

    public Especialidade atualizar(Long id, Especialidade especialidadeAtualizada) {
        Especialidade especialidadeExistente = buscarPorId(id);
        especialidadeExistente.setNome(especialidadeAtualizada.getNome());
        especialidadeExistente.setDescricao(especialidadeAtualizada.getDescricao());
        return repository.save(especialidadeExistente);
    }

    public void deletar(Long id) {
        Especialidade especialidade = buscarPorId(id);
        repository.delete(especialidade);
    }
}