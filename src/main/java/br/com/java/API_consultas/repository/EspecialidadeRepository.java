package br.com.java.API_consultas.repository;

import br.com.java.API_consultas.model.Especialidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EspecialidadeRepository extends JpaRepository<Especialidade, Long>
{
}
