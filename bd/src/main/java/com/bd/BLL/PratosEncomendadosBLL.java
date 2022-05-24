package com.bd.BLL;

import com.bd.DAL.PratosEncomendados;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class PratosEncomendadosBLL {
        private  static final String PERSISTENCE_UNIT_NAME = "default";
        private static EntityManagerFactory factory = null;
        @PersistenceContext
        private static EntityManager em = null;

        public static PratosEncomendados read(int id_encomendas){
           PratosEncomendados PratEn = null;
            if(factory == null)
                factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

            if (em == null) em = factory.createEntityManager();

            Query q1 = em.createNamedQuery("PratosEncomendado.findById_encomendas");
            q1.setParameter("id_encomendas",id_encomendas);
            Object obj = q1.getSingleResult();

            if(obj != null){
                PratEn = ((PratosEncomendados)obj);
            }
            else
                return null;


            return PratEn;
        }

        public static List<PratosEncomendados> readAll(){
            List<PratosEncomendados> listaPratEn = new ArrayList<>();
            if(factory == null)
                factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

            if (em == null) em = factory.createEntityManager();

            Query q1 = em.createNamedQuery("PratosEncomendados.findAll");
            List<Object> result = q1.getResultList();

            for(Object PratEn : result){
                listaPratEn.add((PratosEncomendados) PratEn);
            }

            return listaPratEn;
        }


    public static List<PratosEncomendados> readAll(Number idPrato){
        List<PratosEncomendados> listaPratEn = new ArrayList<>();
        if(factory == null)
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

        if (em == null) em = factory.createEntityManager();

        Query q1 = em.createNamedQuery("PratosEncomendados.findAllByIdprato");
        q1.setParameter("ID_PRATO", "%"+idPrato+"%");
        List<Object> result = q1.getResultList();

        for(Object PratEn : result){
            listaPratEn.add((PratosEncomendados) PratEn);
        }

        return listaPratEn;
    }



}






