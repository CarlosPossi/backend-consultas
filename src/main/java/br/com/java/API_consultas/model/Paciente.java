package br.com.java.API_consultas.model;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "pacientes")

public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
    private LocalDate dataDeNascimento;
    private int idade;
    private String sexo;
    private String numeroTelefone;
    private String email;
    private String endereco;
    private String cpf;
    private boolean ativo;

    public Paciente()   {}

    public Paciente (String nome, LocalDate dataDeNascimento, int idade, String sexo, String numeroTelefone, String email, String endereco, String cpf, boolean ativo) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.idade = idade;
        this.sexo = sexo;
        this.numeroTelefone = numeroTelefone;
        this.email = email;
        this.endereco = endereco;
        this.cpf = cpf;
        this.ativo = ativo;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public LocalDate getDataDeNascimento() {return dataDeNascimento;}
    public void setDataDeNascimento(LocalDate dataDeNascimento) {this.dataDeNascimento = dataDeNascimento;}
    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}
    public String getSexo() {return sexo;}
    public void setSexo(String sexo) {this.sexo = sexo;}
    public String getNumeroTelefone() {return numeroTelefone;}
    public void setNumeroTelefone(String numeroTelefone) {this.numeroTelefone = numeroTelefone;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public String getEndereco() {return endereco;}
    public void setEndereco(String endereco) {this.endereco = endereco;}
    public String getCpf() {return cpf;}
    public void setCpf(String cpf) {this.cpf = cpf;}
    public boolean isAtivo() {return ativo;}
    public void setAtivo(boolean ativo) {this.ativo = ativo;}
}
