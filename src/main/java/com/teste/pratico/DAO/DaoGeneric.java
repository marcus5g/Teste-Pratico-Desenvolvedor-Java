package com.teste.pratico.DAO;

import com.teste.pratico.hibernate.HibernateUtil;
import com.teste.pratico.jpautil.JPAUtil;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class DaoGeneric <T> {

    public void salvar(T entity){
        EntityManager entityManager = JPAUtil.getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {

            session.beginTransaction();
            session.save(entity);
            session.flush();
            session.getTransaction().commit();
            session.close();
//            transaction.begin();
//            entityManager.persist(entity);
//            entityManager.flush();
//            transaction.commit();
//            entityManager.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
//            session.getTransaction().rollback();
            transaction.rollback();
        }

    }
}
