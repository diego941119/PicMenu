package com.picmenu.jpa.sessions;

import com.picmenu.jpa.entities.Usuarios;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author adsi
 */
@Stateless
public class UsuarioSession {

 
    @PersistenceContext
    private EntityManager entityManager;
    
    
    protected EntityManager getEntityManager() {
        return entityManager;
    }

    public void create(Usuarios ciudad) {
        entityManager.persist(ciudad);
    }

    public void edit(Usuarios ciudad) {
        entityManager.merge(ciudad);
    }

    public void remove(Usuarios ciudad) {
        entityManager.remove(ciudad);
    }

    public List<Usuarios> findAll() {
        CriteriaQuery cq = entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Usuarios.class));
        return entityManager.createQuery(cq).getResultList();
    }
    
    public List<Usuarios> findByNombre(String nombre){
    return getEntityManager().createNamedQuery("Usuarios.findByNombres")
            .setParameter("nombres",nombre)
            .getResultList();
}
    
     //Metodo Validar
    public Usuarios findByCorreoElectronico (String correoelectronico){
        try{
            return (Usuarios) entityManager.createNamedQuery("Usuarios.findByEmail")
                    .setParameter("email", correoelectronico)
                    .getSingleResult();
            
        }catch(NonUniqueResultException ex){
            throw ex;
        }catch(NoResultException ex){
            return null;
        }
    }
}
