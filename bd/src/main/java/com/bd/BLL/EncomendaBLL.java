package com.bd.BLL;

import com.bd.DAL.*;

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

        public static List<listaPedidos> readAll(){
            List<listaPedidos> listaPed = new ArrayList<>();
            if(factory == null)
                factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

            if (em == null) em = factory.createEntityManager();

            TypedQuery<listaPedidos> q1 = em.createNamedQuery("Encomendas.findAllPed", listaPedidos.class);
            List<listaPedidos> result = q1.getResultList();

            for(listaPedidos lp : result){
                listaPed.add((listaPedidos) lp);
            }

            return listaPed;
        }

    public static List<listaPedidos> readAllCanc(){
        List<listaPedidos> listaPedcanc = new ArrayList<>();
        if(factory == null)
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

        if (em == null) em = factory.createEntityManager();

        TypedQuery<listaPedidos> q1 = em.createNamedQuery("Encomendas.findAllPedCancelados", listaPedidos.class);
        List<listaPedidos> result = q1.getResultList();

        for(listaPedidos lp : result){
            listaPedcanc.add((listaPedidos) lp);
        }

        return listaPedcanc;
    }

    public static List<listaPedidos> readAllMarc(){
        List<listaPedidos> listaPedmarc = new ArrayList<>();
        if(factory == null)
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

        if (em == null) em = factory.createEntityManager();

        TypedQuery<listaPedidos> q1 = em.createNamedQuery("Encomendas.findAllPedMarcados", listaPedidos.class);
        List<listaPedidos> result = q1.getResultList();

        for(listaPedidos lp : result){
            listaPedmarc.add((listaPedidos) lp);
        }

        return listaPedmarc;
    }

    public static List<listaPedidos> readAllConc(){
        List<listaPedidos> listaPedconc = new ArrayList<>();
        if(factory == null)
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

        if (em == null) em = factory.createEntityManager();

        TypedQuery<listaPedidos> q1 = em.createNamedQuery("Encomendas.findAllPedConcluidos", listaPedidos.class);
        List<listaPedidos> result = q1.getResultList();

        for(listaPedidos lp : result){
            listaPedconc.add((listaPedidos) lp);
        }

        return listaPedconc;
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


