package view;
import model.Reserva;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
    Reserva reserva= new Reserva(1,LocalDate.of(2021,5,2), LocalDate.of(2021, 5, 5));
        System.out.println(reserva.toString());
        System.out.println(reserva.duracao());
        reserva.reAgendarSaida("2021-05-07");
        System.out.println(reserva.duracao());
        reserva.reAgendarSaida("2021-05-07");

    }
}