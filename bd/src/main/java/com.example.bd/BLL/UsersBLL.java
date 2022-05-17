package com.example.bd.BLL;

import com.example.bd.DAL.Users;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class UsersBLL {


        private  static final String PERSISTENCE_UNIT_NAME = "default";
        private static EntityManagerFactory factory = null;
        @PersistenceContext
        private static EntityManager em = null;

        /**
         *
         */
        public static void create(Users user){
            if(factory == null) {
                factory = Persistence.createEntityManagerFactory("default");
            }


            if (em == null) em = factory.createEntityManager();

            em.getTransaction().begin(); //iniciando a transação com bd
            em.persist(user); //Persistindo os dados
            em.getTransaction().commit();//guardou
        }

        /**
         *
         *
         *
         */
        public static Users read(int id_user){
            Users user = null;
            if(factory == null)
                factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

            if (em == null) em = factory.createEntityManager();

            Query q1 = em.createNamedQuery("Users.findByUser");
            q1.setParameter("id_user", id_user);
            Object obj = q1.getSingleResult();

            if(obj != null){
                user = ((Users)user);
            }
            else
                return null;


            return user;
        }



    public static Users gestor(boolean is_gestor){
        Users user = null;
        if(factory == null)
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

        if (em == null) em = factory.createEntityManager();

        Query q1 = em.createNamedQuery("Users.findByGestor");
        q1.setParameter("is_gestor", is_gestor);
        System.out.println(q1.getMaxResults());
        Object obj = q1.getSingleResult();


        if(obj != null){
            user = ((Users)user);
        }
        else
            return null;


        return user;
    }


    public static Users login(String email, String password){
        Users user = null;
        if(factory == null)
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

        if (em == null) em = factory.createEntityManager();

        Query q1 = em.createNamedQuery("Users.findByLogin");
        q1.setParameter("emailUser", email);
        q1.setParameter("pass",password);
        System.out.println(q1.getMaxResults());
        Object obj = q1.getSingleResult();

        if(obj != null) {
            user = ((Users) obj);
        }

        return user;
    }





        /**
         * @read listar todos os user
         * @return
         */
        public static List<Users> readAll(){
            List<Users> listaUser = new ArrayList<>();
            if(factory == null)
                factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

            if (em == null) em = factory.createEntityManager();

            Query q1 = em.createNamedQuery("Users.findAll");
             List<Object> result = q1.getResultList();

            for(Object user : result){
                listaUser.add((Users) user);
            }

            return listaUser;
        }





        public static void update(Users user){
            if(factory == null)
                factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

            if (em == null) em = factory.createEntityManager();

            em.getTransaction().begin();
            em.merge(user);
            em.getTransaction().commit();

        }

        /**
         *
         *Delete
         */

        public static void delete(int userID ){
            if(factory == null)
                factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

            if (em == null) em = factory.createEntityManager();
                Users u = read(userID);
            em.getTransaction().begin();
            em.remove(u);
            em.getTransaction().commit();
        }
    }








