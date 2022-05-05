package com.example.bd.BLL;

import com.example.bd.DAL.Encomendas;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class EncomendaBLL {


        private  static final String PERSISTENCE_UNIT_NAME = "default";
        private static EntityManagerFactory factory = null;
        @PersistenceContext
        private static EntityManager em = null;

        public static void create( Encomendas enc){
            if(factory == null) {
                factory = Persistence.createEntityManagerFactory("default");
            }


            if (em == null) em = factory.createEntityManager();

            em.getTransaction().begin(); //iniciando a transação com bd
            em.persist(enc); //Persistindo os dados
            em.getTransaction().commit();//guardou
        }

        public static Encomendas read(int idEncomenda){
            Encomendas enc = null;
            if(factory == null)
                factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

            if (em == null) em = factory.createEntityManager();

            Query q1 = em.createNamedQuery("Encomendas.findByIdencomenda");
            q1.setParameter("id_encomenda",idEncomenda);
            Object obj = q1.getSingleResult();

            if(obj != null){
                enc= ((Encomendas)obj);
            }
            else
                return null;


            return enc;
        }

        public static List<Encomendas> readAll(){
            List<Encomendas> listaEnc = new ArrayList<>();
            if(factory == null)
                factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

            if (em == null) em = factory.createEntityManager();

            Query q1 = em.createNamedQuery("Encomendas.findAll");
            List<Object> result = q1.getResultList();

            for(Object enc : result){
                listaEnc.add((Encomendas) enc);
            }

            return listaEnc;
        }

        public static List<Encomendas> readAll(String tipoPagamento ){
            List<Encomendas> listaEnc = new ArrayList<>();
            if(factory == null)
                factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

            if (em == null) em = factory.createEntityManager();

            Query q1 = em.createNamedQuery("Encomendas.findAllByTipoPagamento");
            q1.setParameter("id_tipopagamento" , "%"+tipoPagamento+"%");
            List<Object> result = q1.getResultList();

            for(Object cli : result){
                listaEnc.add((Encomendas) cli);
            }

            return listaEnc;
        }

        public static void update(Encomendas enc){
            if(factory == null)
                factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

            if (em == null) em = factory.createEntityManager();

            em.getTransaction().begin();
            em.merge(enc);
            em.getTransaction().commit();
        }

        public static void delete(int idenc){
            if(factory == null)
                factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

            if (em == null) em = factory.createEntityManager();
                Encomendas e = read(idenc);
            em.getTransaction().begin();
            em.remove(e);
            em.getTransaction().commit();
        }
    }


