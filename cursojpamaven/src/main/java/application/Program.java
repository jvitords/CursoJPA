package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		/*Pessoa p1 = new Pessoa(null, "João", "joao@gmail.com");
		Pessoa p2 = new Pessoa(null, "Vitor", "vitor@gmail.com");
		Pessoa p3 = new Pessoa(null, "Duarte", "duarte@gmail.com");
		Pessoa p4 = new Pessoa(null, "Ana", "ana@gmail.com");*/
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		/* Como inserir dados no BD:
		em.getTransaction().begin(); // inicia a transação 
		em.persist(p1);
		em.persist(p2); // insere os dados
		em.persist(p3);
		em.persist(p4);
		em.getTransaction().commit();*/ // finaliza a transação 
		
		//Pessoa p5 = em.find(Pessoa.class, 1); // filtro para encontrar um certo objeto
		
		Pessoa p6 = em.find(Pessoa.class, 6); // primeiramente monitorar ela para dps excluir
		em.getTransaction().begin();
		em.remove(p6);
		em.getTransaction().commit();
		
		
		System.out.println("Transação finalizada!!!");
		em.close();
		emf.close();
	}
}
