import javax.persistence.*;

public class main {

    public static void main (String[] args)
    {
        EntityManagerFactory entityManagerFactory  = Persistence.createEntityManagerFactory("test");
        client c = new client();
        c.setId(2);
        c.setName("abc");

        bank b = new bank();
        b.setId(0);
        b.setName("HSBC");


        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(c);
        entityManager.persist(b);
        entityManager.getTransaction().commit();
        entityManagerFactory.close();
    }
}
