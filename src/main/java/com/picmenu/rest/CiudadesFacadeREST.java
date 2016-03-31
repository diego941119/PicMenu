/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.picmenu.rest;

import com.picmenu.jpa.entities.Ciudades;
import com.picmenu.jpa.entities.CiudadesPK;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.PathSegment;

/**
 *
 * @author adsi1
 */
@Stateless
@Path("ciudades")
public class CiudadesFacadeREST extends AbstractFacade<Ciudades> {

    @PersistenceContext(unitName = "com.test_PicMenu_war_1.0PU")
    private EntityManager em;

    private CiudadesPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;idCiudad=idCiudadValue;idDepartamento=idDepartamentoValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        com.picmenu.jpa.entities.CiudadesPK key = new com.picmenu.jpa.entities.CiudadesPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> idCiudad = map.get("idCiudad");
        if (idCiudad != null && !idCiudad.isEmpty()) {
            key.setIdCiudad(new java.lang.Integer(idCiudad.get(0)));
        }
        java.util.List<String> idDepartamento = map.get("idDepartamento");
        if (idDepartamento != null && !idDepartamento.isEmpty()) {
            key.setIdDepartamento(new java.lang.Integer(idDepartamento.get(0)));
        }
        return key;
    }

    public CiudadesFacadeREST() {
        super(Ciudades.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Ciudades entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") PathSegment id, Ciudades entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        com.picmenu.jpa.entities.CiudadesPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Ciudades find(@PathParam("id") PathSegment id) {
        com.picmenu.jpa.entities.CiudadesPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Ciudades> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Ciudades> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
