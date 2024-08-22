package view;

import classes.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss" );

        System.out.println("Digite uma data e hora dd/MM/yyyy HH:mm:ss: ");
        LocalDateTime data = LocalDateTime.parse(sc.nextLine(), dtf);
        System.out.println("Digite o titulo : ");
        String titulo = sc.nextLine();
        System.out.println("Digite o conteudo : ");
        String conteudo = sc.nextLine();
        System.out.println("Digite os likes : ");
        Integer likes = sc.nextInt();
        sc.nextLine();
        Post post1 = new Post(data,titulo,conteudo,likes);

        System.out.println("informe quantos comentarios quer fazer");
        int numComentarios = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numComentarios; i++) {
            System.out.println("digite seu comanterio");
            String comentario = sc.nextLine();
            post1.adicionarComentario(comentario);
        }
        Post post2 = new Post(LocalDateTime.now(),"viajando para paris","ambiente acolhedor", 1200);
         post2.adicionarComentario("jantar excelente");
         post2.adicionarComentario("vi um gabiru tamanho do mundo");


       // post1.mostrarComentarios();

        post2.mostrarComentarios();





    }
}