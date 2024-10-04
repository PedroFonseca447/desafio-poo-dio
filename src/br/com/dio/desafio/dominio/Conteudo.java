package br.com.dio.desafio.dominio;
//classe abstrata, nao se pode instanciar um conteudo na main
public abstract class Conteudo {
    //cria um valor constante
   protected static final double XP_PADRAO = 10d;  


   private String titulo;
   private String descricao;

public abstract double calcularXp();



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


   

}
