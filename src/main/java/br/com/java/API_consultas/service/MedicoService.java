package br.com.java.API_consultas.service;
import br.com.java.API_consultas.model.Medico;
import br.com.java.API_consultas.repository.MedicoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class MedicoService {
    private final MedicoRepository repository;

    public MedicoService(MedicoRepository repository){this.repository = repository;}

    public Medico salvar(Medico medico){return repository.save(medico);}

    public List<Medico> listar(){return repository.findAll();}

    public Medico buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Médico não encontrado"));
    }

    public Medico atualizar(Long id, Medico medicoAtualizado) {
        Medico medicoExistente = buscarPorId(id);
        medicoExistente.setNome(medicoAtualizado.getNome());
        medicoExistente.setCrm(medicoAtualizado.getCrm());
        medicoExistente.setHospital(medicoAtualizado.getHospital());
        medicoExistente.setEspecialidade(medicoAtualizado.getEspecialidade());
        medicoExistente.setSubespecialidade(medicoAtualizado.getSubespecialidade());
        medicoExistente.setContato(medicoAtualizado.getContato());
        medicoExistente.setTempoDeExperiencia(medicoAtualizado.getTempoDeExperiencia());
        medicoExistente.setAtivo(medicoAtualizado.getAtivo());

        return repository.save(medicoExistente);
    }

    public void deletar(Long id){
        Medico medico = buscarPorId(id);
        repository.delete(medico);
    }
}
