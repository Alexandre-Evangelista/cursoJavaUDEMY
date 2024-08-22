package classes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private LocalDateTime moment;
    private String titutlo;
    private String conteudo;
    private Integer likes;
    private List<Comentario> comentarios= new ArrayList<Comentario>();

    public Post(LocalDateTime moment, String titutlo, String conteudo, Integer likes) {
        this.moment = moment;
        this.titutlo = titutlo;
        this.conteudo = conteudo;
        this.likes = likes;

    }
    public  Post() {}

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public String getTitutlo() {
        return titutlo;
    }

    public void setTitutlo(String titutlo) {
        this.titutlo = titutlo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public void adicionarComentario(String x) {
        comentarios.add(new Comentario(x));

    }

    public void mostrarComentarios() {
        System.out.println(moment);
        System.out.println(titutlo);
        System.out.println(conteudo);
        System.out.println(likes);
        for (Comentario comentario : comentarios) {
            System.out.println(comentario.getTexto());
        }
    }


}
