package model;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Reserva {
    private int numQuarto;
    private LocalDate entrada;
    private LocalDate saida;

    public Reserva(int numQuarto, LocalDate entrada, LocalDate saida) {
        this.numQuarto = numQuarto;
        this.entrada = entrada;
        this.saida = saida;
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }

    public LocalDate getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDate entrada) {
        this.entrada = entrada;
    }

    public LocalDate getSaida() {
        return saida;
    }

    public void setSaida(LocalDate saida) {
        this.saida = saida;
    }
    public Long duracao(){
        return ChronoUnit.DAYS.between(entrada,saida);
    }
    public void reAgendarSaida(String novaData){
        LocalDate dt1=LocalDate.parse(novaData);
        long diferenca= ChronoUnit.DAYS.between(entrada,dt1);
        if (diferenca>0 && !dt1.isEqual(saida)) {
            System.out.print("a data foi modificada de "+ getSaida());
            setSaida(dt1);
            System.out.println(" para " + getSaida());
        }else {
            System.out.println("so podemos agendar a reseva para o futuro");
        }
    }

    @Override
    public String toString() {
        return "Reserva:" +
                "numero doQuarto=" + numQuarto +
                ", entrada=" + entrada +
                ", saida=" + saida +
                duracao()+" noites" ;
    }
}

