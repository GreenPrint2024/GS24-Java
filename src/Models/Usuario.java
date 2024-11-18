package Models;

import java.util.Objects;

public class Usuario {
    private String nome;
    private int idade;
    private Transporte meioTransportePrincipal;
    private Moradia moradiaPrincipal;

    public Usuario(String nome, int idade, Transporte meioTransportePrincipal, Moradia moradiaPrincipal) {
        this.nome = nome;
        this.idade = idade;
        this.meioTransportePrincipal = meioTransportePrincipal;
        this.moradiaPrincipal = moradiaPrincipal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Transporte getMeioTransportePrincipal() {
        return meioTransportePrincipal;
    }

    public void setMeioTransportePrincipal(Transporte meioTransportePrincipal) {
        this.meioTransportePrincipal = meioTransportePrincipal;
    }

    public Moradia getMoradiaPrincipal() {
        return moradiaPrincipal;
    }

    public void setMoradiaPrincipal(Moradia moradiaPrincipal) {
        this.moradiaPrincipal = moradiaPrincipal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return getIdade() == usuario.getIdade() && Objects.equals(getNome(), usuario.getNome()) && Objects.equals(getMeioTransportePrincipal(), usuario.getMeioTransportePrincipal()) && Objects.equals(getMoradiaPrincipal(), usuario.getMoradiaPrincipal());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getIdade(), getMeioTransportePrincipal(), getMoradiaPrincipal());
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", meioTransportePrincipal=" + meioTransportePrincipal +
                ", moradiaPrincipal=" + moradiaPrincipal +
                '}';
    }
}
