package br.com.java.API_consultas.service;
import br.com.java.API_consultas.model.Paciente;
import br.com.java.API_consultas.repository.PacienteRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class PacienteService {
    private final PacienteRepository repository;

    public PacienteService(PacienteRepository repository) {
        this.repository = repository;
    }

    public Paciente salvar(Paciente paciente) {
        return repository.save(paciente);
    }

    public List<Paciente> listar() {
        return repository.findAll();
    }

    public Paciente buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Paciente não encontrado"));
    }

    public Paciente atualizar (Long id, Paciente pacienteAtualizado) {
        Paciente pacienteExistente = buscarPorId(id);
        pacienteExistente.setNome(pacienteAtualizado.getNome());
        pacienteExistente.setCpf(pacienteAtualizado.getCpf());
        pacienteExistente.setEmail(pacienteAtualizado.getEmail());
        pacienteExistente.setEndereco(pacienteAtualizado.getEndereco());
        pacienteExistente.setDataDeNascimento(pacienteAtualizado.getDataDeNascimento());
        pacienteExistente.setIdade(pacienteAtualizado.getIdade());
        pacienteExistente.setNumeroTelefone(pacienteAtualizado.getNumeroTelefone());
        pacienteExistente.setSexo(pacienteAtualizado.getSexo());
        pacienteExistente.setAtivo(pacienteAtualizado.getAtivo());

        return repository.save(pacienteExistente);
    }

    public void deletar(Long id) {
        Paciente paciente = buscarPorId(id);
        repository.delete(paciente);
    }
}
