package com.bd.BLL;

import com.bd.DAL.Clientes;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


public class ClienteBLL {

    private static final String PERSISTENCE_UNIT_NAME = "default";
    private static EntityManagerFactory factory = null;
    @PersistenceContext
    private static EntityManager em = null;

    /**
     * @Create criar os cliente
     */
    public static void create(Clientes cli) {
        if (factory == null) {
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }


        if (em == null) em = factory.createEntityManager();

        em.getTransaction().begin(); //iniciando a transação com bd
       em.persist(cli); //Persistindo os dados
        em.getTransaction().commit();//guardou
    }

    /**
     * @param idCliente
     * @read permite listar os clientes
     */
    public static Clientes read(int idCliente) {
        Clientes cli = null;
        if (factory == null)
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

        if (em == null) em = factory.createEntityManager();

        Query q1 = em.createNamedQuery("Clientes.findByIdcliente");
        q1.setParameter("id_cliente", idCliente);
        Object obj = q1.getSingleResult();

        if (obj != null) {
            cli = ((Clientes) obj);
        } else
            return null;


        return cli;
    }


    /**
     * @return
     * @read listar todos os clientes
     */
    public static List<Clientes> readAll() {
        List<Clientes> listaCli = new ArrayList<>();
        if (factory == null)
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

        if (em == null) em = factory.createEntityManager();

        Query q1 = em.createNamedQuery("Clientes.findAll");
        List<Object> result = q1.getResultList();

        for (Object cli : result) {
            listaCli.add((Clientes) cli);
        }

        return listaCli;
    }

    /**
     * @param nome
     * @return
     * @read listar todos os cliente por nome
     * @clientes
     */
    public static List<Clientes> readAll(String nome) {
        List<Clientes> listaCli = new ArrayList<>();
        if (factory == null)
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

        if (em == null) em = factory.createEntityManager();

        Query q2 = em.createNamedQuery("Clientes.findAllByNome");
        q2.setParameter("nome", "%" + nome + "%");
        List<Object> result = q2.getResultList();

        for (Object cli : result) {
            listaCli.add((Clientes) cli);
        }

        return listaCli;
    }

    /**
     * @param cli
     * @update de todos os cliente
     */

    public static void update(Clientes cli) {
        if (factory == null)
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

        if (em == null) em = factory.createEntityManager();

        em.getTransaction().begin();
        em.merge(cli);
        em.getTransaction().commit();

    }

    /**
     *
     */

   public static void delete(int idCliente){
            if(factory == null)
                factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
            if (em == null) em = factory.createEntityManager();

            Clientes C = read(idCliente);
        em.getTransaction().begin();
        em.remove(C);
        em.getTransaction().commit();
        }
}















