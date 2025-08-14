package aplicacao;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Aplicacao {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
       // Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
       // Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();
        //transacao para adicionar as pessoa criadas no banco
        //obs sempre usar ama transaçao quando nao for uma simple consulta
       em.getTransaction().begin();
       // em.persist(p1);
       // em.persist(p2);
       // em.persist(p3);
        // o jpa so remove objetos monitorados
        //entidade monitorada sao os que acabar de ser inseridos ou recuperada do bd
        em.remove(em.find(Pessoa.class, 1));
        em.getTransaction().commit();
        //procurara pessoa no banco de dados
        //Pessoa p = em.find(Pessoa.class, 2);
        //System.out.println(p);




        em.close();
        emf.close();

    }
}
