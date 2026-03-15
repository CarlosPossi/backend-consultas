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
    private String especialidade;
    private String subespecialidade;
    private String hospital;
    private int tempoDeExperiencia;
    private String contato;
    private boolean ativo;

    public Medico()     {}

    public Medico (String nome, String crm, String especialidade, String subespecialidade, String hospital, int tempoDeExperiencia, String contato, boolean ativo) {
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
    public String getSubespecialidade() {return subespecialidade;}
    public void setSubespecialidade(String subespecialidade) {this.subespecialidade = subespecialidade;}
    public String getEspecialidade() {return especialidade;}
    public void setEspecialidade(String especialidade) {this.especialidade = especialidade;}
    public String getCrm() {return crm;}
    public void setCrm(String crm) {this.crm = crm;}
}
