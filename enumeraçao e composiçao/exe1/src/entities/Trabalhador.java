package entities;
import entitiesEnum.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
    private String nome;
    private WorkerLevel nivel;
    private double baseSalarial;
    private Departamento departamento;
    private List<ContratoDeHoras> contratos=new ArrayList<>();

    public Trabalhador() {}

    public Trabalhador(String nome, WorkerLevel nivel, double baseSalarial, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.baseSalarial = baseSalarial;
        this.departamento = departamento;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public WorkerLevel getNivel() {
        return nivel;
    }

    public void setNivel(WorkerLevel nivel) {
        this.nivel = nivel;
    }

    public double getBaseSalarial() {
        return baseSalarial;
    }

    public void setBaseSalarial(double baseSalarial) {
        this.baseSalarial = baseSalarial;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoDeHoras> getContratos() {
        return contratos;
    }

    public void addContrato(ContratoDeHoras contrato) {
        this.contratos.add(contrato);
    }
    public void removeContrato(ContratoDeHoras contrato) {
        this.contratos.remove(contrato);
    }
     public double income(int year, int month) {
        double soma = baseSalarial;
        Calendar calendar = Calendar.getInstance();
        for (ContratoDeHoras c : contratos) {
            calendar.setTime(c.getData());
            int c_month=calendar.get(Calendar.MONTH)+1;
            int c_year= calendar.get(calendar.YEAR);
            if (c_year == year && c_month == month) {
                soma+=c.calcularValorTotal();
            }
        }return soma;
     }
}
