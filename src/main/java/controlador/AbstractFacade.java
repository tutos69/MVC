/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import Utilss.JPAUtils;
import static Utilss.JPAUtils.getEntityManager;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author edwin
 * @param <T>
 */
public abstract class AbstractFacade<T> {

    private Class<T> entityClass;
    protected EntityManager getEntityManager;

    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
        this.getEntityManager = JPAUtils.getEntityManager();
    }

    public EntityManager getGetEntityManager() {
        return getEntityManager;
    }

    public void setGetEntityManager(EntityManager getEntityManager) {
        this.getEntityManager = getEntityManager;
    }

    public void create(T entity) {
        getEntityManager.getTransaction().begin();
        getEntityManager.persist(entity);
        getEntityManager.getTransaction().commit();

    }

    public void edit(T entity) {
        getEntityManager.getTransaction().begin();
        getEntityManager.merge(entity);
        getEntityManager.getTransaction().commit();
    }

    public void remove(T entity) {
        getEntityManager.getTransaction().begin();
        getEntityManager.remove(getEntityManager.merge(entity));
        getEntityManager.getTransaction().commit();

    }

    public T find(Object id) {
        return getEntityManager.find(entityClass, id);

    }

//    public abstract List<T> findAll();
//    public List<T> findAll() {
//        CriteriaQuery cq = getEntityManager;       
////        CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
////
//        cq.select(cq.from(entityClass));
//        return getEntityManager().createQuery(cq).getResultList();
//    }   
    public List<T> findAll() {
        CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }
}
