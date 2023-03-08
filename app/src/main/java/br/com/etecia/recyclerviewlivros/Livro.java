package br.com.etecia.recyclerviewlivros;

public class Livro {
    private String titulo;
    private String autor;
    private int img;

    // construtor (alt insert)
    public Livro(String titulo, String autor, int img) {
        this.titulo = titulo;
        this.autor = autor;
        this.img = img;
    }


    // getters and setters - metodos de acesso (alt insert)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
