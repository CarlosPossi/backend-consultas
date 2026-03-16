package br.com.java.API_consultas.model;
import jakarta.persistence.*;

@Entity
@Table(name = "medicos")

public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
    private String crm;
    private Especialidade especialidade;
    private Especialidade subespecialidade;
    private String hospital;
    private int tempoDeExperiencia;
    private String contato;
    private boolean ativo;

    public Medico()     {}

    public Medico (String nome, String crm, Especialidade especialidade, Especialidade subespecialidade, String hospital, int tempoDeExperiencia, String contato, boolean ativo) {
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
        this.subespecialidade = subespecialidade;
        this.hospital = hospital;
        this.tempoDeExperiencia = tempoDeExperiencia;
        this.contato = contato;
        this.ativo = ativo;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public boolean getAtivo() {return ativo;}
    public void setAtivo(boolean ativo) {this.ativo = ativo;}
    public String getContato() {return contato;}
    public void setContato(String contato) {this.contato = contato;}
    public int getTempoDeExperiencia() {return tempoDeExperiencia;}
    public void setTempoDeExperiencia(int tempoDeExperiencia) {this.tempoDeExperiencia = tempoDeExperiencia;}
    public String getHospital() {return hospital;}
    public void setHospital(String hospital) {this.hospital = hospital;}
    public Especialidade getSubespecialidade() {return subespecialidade;}
    public void setSubespecialidade(Especialidade subespecialidade) {this.subespecialidade = subespecialidade;}
    public Especialidade getEspecialidade() {return especialidade;}
    public void setEspecialidade(Especialidade especialidade) {this.especialidade = especialidade;}
    public String getCrm() {return crm;}
    public void setCrm(String crm) {this.crm = crm;}
}
