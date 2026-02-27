package br.com.java.API_consultas.controller;
import br.com.java.API_consultas.model.Especialidade;
import br.com.java.API_consultas.service.EspecialidadeService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/especialidades")
@CrossOrigin

public class EspecialidadeController {
    private final EspecialidadeService service;
    public EspecialidadeController(EspecialidadeService service) {
        this.service = service;
    }
    @PostMapping
    public Especialidade criar(@RequestBody Especialidade especialidade) {
        return service.salvar(especialidade);
    }
    @GetMapping
    public List<Especialidade> listar() {
        return service.listar();
    }
}