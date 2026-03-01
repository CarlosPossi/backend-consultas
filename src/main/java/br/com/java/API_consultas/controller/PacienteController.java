package br.com.java.API_consultas.controller;
import br.com.java.API_consultas.model.Paciente;
import br.com.java.API_consultas.service.PacienteService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping ("/pacientes")
@CrossOrigin

public class PacienteController {
    private final PacienteService service;

    public PacienteController (PacienteService service) {
        this.service = service;
    }

    @PostMapping
    public Paciente criar (@RequestBody Paciente paciente) {
        return service.salvar(paciente);
    }

    @GetMapping
    public List<Paciente> listar() {
        return service.listar();
    }
}
