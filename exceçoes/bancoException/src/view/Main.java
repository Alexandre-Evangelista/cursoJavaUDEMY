package view;

import model.ContaBancaria;
import model.Exception.DomainException;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try {
            System.out.println("informe o numero da conta");
            int numero=sc.nextInt();
            sc.nextLine();
            System.out.println("informe o nome do usuario");
            String nome=sc.nextLine();
            System.out.println("informe o saldo e o limite de saque");
            double saldo= sc.nextDouble();
            double limite= sc.nextDouble();

            ContaBancaria conta = new ContaBancaria(numero,nome,saldo,limite);
            conta.sacar(800);
        }
        catch (DomainException e){
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }

    }
}