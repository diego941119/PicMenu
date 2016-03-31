/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.picmenu.jpa.sessions;

import com.picmenu.jpa.entities.Ciudades;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author adsi
 */
@Stateless
public class CiudadSession {

 
    @PersistenceContext
    private EntityManager entityManager;

    public void create(Ciudades ciudad) {
        entityManager.persist(ciudad);
    }

    public void edit(Ciudades ciudad) {
        entityManager.merge(ciudad);
    }

    public void remove(Ciudades ciudad) {
        entityManager.remove(ciudad);
    }

    public List<Ciudades> findAll() {
        CriteriaQuery cq = entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Ciudades.class));
        return entityManager.createQuery(cq).getResultList();
    }
}
