package br.com.java.API_consultas.repository;

import br.com.java.API_consultas.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long>
{
}
