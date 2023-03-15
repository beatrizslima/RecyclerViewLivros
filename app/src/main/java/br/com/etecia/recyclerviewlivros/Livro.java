package br.com.etecia.recyclerviewlivros;

public class Livro {
    private String titulo;
    private String autor;
    private String descricao;
    private String categoria;
    private int img;

    // construtor (alt insert)
    public Livro(String titulo, String autor, String descricao, String categoria, int img) {
        this.titulo = titulo;
        this.autor = autor;
        this.descricao = descricao;
        this.categoria = categoria;
        this.img = img;


    }


    // getters and setters - metodos de acesso (alt insert)
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
