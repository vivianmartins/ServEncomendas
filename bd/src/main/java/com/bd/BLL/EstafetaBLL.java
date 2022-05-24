package com.bd.BLL;

import com.bd.DAL.Estafeta;
import com.bd.DAL.Estafetas;
import com.bd.DAL.Users;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
public class EstafetaBLL {

        private  static final String PERSISTENCE_UNIT_NAME = "default";
        private static EntityManagerFactory factory = null;
        @PersistenceContext
        private static EntityManager em = null;

        public static void create(Estafeta est){
            if(factory == null) {
                factory = Persistence.createEntityManagerFactory("default");
            }


            if (em == null) em = factory.createEntityManager();

            em.getTransaction().begin(); //iniciando a transação com bd
            em.persist(est); //Persistindo os dados
            em.getTransaction().commit();//guardou
        }

    public void merge(Estafeta est) {
        try {
           em.getTransaction().begin();
           em.merge(est);
           em.getTransaction().commit();
        } catch (Exception ex) {
          em.getTransaction().rollback();
        }
    }

/*    public  static  void  insert (Estafeta es){

        if(factory == null)
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

        if (em == null) em = factory.createEntityManager();


        Query q1 = em.createNamedQuery("Estafeta.insert");

        em.getTransaction().begin();
        em.merge(es);
        em.getTransaction().commit();



    }*/

        public static Estafeta read(int id_estafeta){
            Estafeta est = null;
            if(factory == null)
                factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

            if (em == null) em = factory.createEntityManager();

            Query q1 = em.createNamedQuery("Estafeta.findById_estafeta");
            q1.setParameter("id_estafeta",id_estafeta);
            Object obj = q1.getSingleResult();

            if(obj != null){
                est = ((Estafeta)obj);
            }
            else
                return null;


            return est;
        }

        public static List<Estafetas> readAll(){
            List<Estafetas> listaEst = new ArrayList<>();
            if(factory == null)
                factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

            if (em == null) em = factory.createEntityManager();

            TypedQuery<Estafetas> q1 = em.createNamedQuery("Estafeta.findAllPass", Estafetas.class);
            List<Estafetas> result = q1.getResultList();

            for(Estafetas est : result){
                listaEst.add((Estafetas) est);
            }

            return listaEst;
        }

        public static List<Estafeta> readAll(String nome){
            List<Estafeta> listaEst = new ArrayList<>();
            if(factory == null)
                factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

            if (em == null) em = factory.createEntityManager();

            Query q1 = em.createNamedQuery("Estafeta.findAllByNome");
            q1.setParameter("nome", "%"+nome+"%");
            List<Object> result = q1.getResultList();

            for(Object est : result){
                listaEst.add((Estafeta) est);
            }

            return listaEst;
        }

        public static void update(Estafeta est){
            if(factory == null)
                factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

            if (em == null) em = factory.createEntityManager();

            em.getTransaction().begin();
            em.merge(est);
            em.getTransaction().commit();

        }

        public static void delete(int idEst){
            if(factory == null)
                factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

            if (em == null) em = factory.createEntityManager();

            Estafeta e = read(idEst);

            em.getTransaction() .begin();
            em.remove(e);
            em.getTransaction().commit();
        }





    }





