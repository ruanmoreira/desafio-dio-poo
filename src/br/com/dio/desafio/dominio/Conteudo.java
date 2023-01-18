package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    // Classe abstrata significa que não é possivel instacia-la
    private String titulo;
    private String descricao;

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    protected static final double XP_PADRAO = 10d;

    public abstract double calcularXp();
}
