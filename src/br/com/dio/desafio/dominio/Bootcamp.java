package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String nomeBootcamp;
    private String descricaoBootcamp;
    private final LocalDate dataCriacao = LocalDate.now();
    private final LocalDate dataEncerramento = dataCriacao.plusDays(45);
    private Set<Dev> devInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new HashSet<>();

    public String getNomeBootcamp() {
        return nomeBootcamp;
    }

    public void setNomeBootcamp(String nomeBootcamp) {
        this.nomeBootcamp = nomeBootcamp;
    }

    public String getDescricaoBootcamp() {
        return descricaoBootcamp;
    }

    public void setDescricaoBootcamp(String descricaoBootcamp) {
        this.descricaoBootcamp = descricaoBootcamp;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public LocalDate getDataEncerramento() {
        return dataEncerramento;
    }

    public Set<Dev> getDevInscritos() {
        return devInscritos;
    }

    public void setDevInscritos(Set<Dev> devInscritos) {
        this.devInscritos = devInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nomeBootcamp, bootcamp.nomeBootcamp) && Objects.equals(descricaoBootcamp, bootcamp.descricaoBootcamp) && Objects.equals(dataCriacao, bootcamp.dataCriacao) && Objects.equals(dataEncerramento, bootcamp.dataEncerramento) && Objects.equals(devInscritos, bootcamp.devInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeBootcamp, descricaoBootcamp, dataCriacao, dataEncerramento, devInscritos, conteudos);
    }
}
