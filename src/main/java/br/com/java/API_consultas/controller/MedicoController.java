package br.com.java.API_consultas.controller;
import br.com.java.API_consultas.model.Medico;
import br.com.java.API_consultas.service.MedicoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/medicos")
@CrossOrigin

public class MedicoController {
    private final MedicoService service;
    public MedicoController(MedicoService service) {
        this.service = service;
    }
    @GetMapping
    public List<Medico> listar() {
        return service.listar();
    }
    @GetMapping("/{id}")
    public Medico buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }
    @PostMapping
    public Medico salvar(@RequestBody Medico medico) {
        return service.salvar(medico);
    }
    @PutMapping("/{id}")
    public Medico atualizar(@PathVariable Long id, @RequestBody Medico medico) {
        return service.atualizar(id, medico);
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }

    @GetMapping("/crm/{crm}")
    public ResponseEntity<Medico> buscarPorCrm(@PathVariable String crm) {
        return service.buscarPorCrm(crm)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @GetMapping("/especialidade/{especialidadeId}")
    public List<Medico> listarPorEspecialidade(@PathVariable Long especialidadeId) {
        return service.listarPorEspecialidade(especialidadeId);
    }
}
