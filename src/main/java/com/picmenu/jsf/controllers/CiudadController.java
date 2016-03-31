/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.picmenu.jsf.controllers;

import com.picmenu.jpa.entities.Ciudades;
import com.picmenu.jpa.sessions.CiudadSession;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class CiudadController implements Serializable{

    @EJB
    private CiudadSession ciudadSession;
    private Ciudades ciudad;
    private List<Ciudades> ciudadList;
  

    public void create() {
       
        getCiudadSession().create(ciudad);
    }

    public void update() {
        getCiudadSession().edit(ciudad);
    }

    public void remove() {
        getCiudadSession().remove(ciudad);
    }

    public CiudadSession getCiudadSession() {
        return ciudadSession;
    }

    public void setCiudadSession(CiudadSession ciudadSession) {
        this.ciudadSession = ciudadSession;
    }

    public Ciudades getCiudad() {
        if (this.ciudad == null) {
            this.ciudad = new Ciudades();
        }
        return ciudad;
    }

    public void setCiudad(Ciudades ciudad) {
        this.ciudad = ciudad;
    }

    public List<Ciudades> getCiudadList() {
        if (this.ciudadList == null) {
            this.ciudadList = getCiudadSession().findAll();
        }
        return ciudadList;
    }

    public void setCiudadList(List<Ciudades> ciudadList) {
        this.ciudadList = ciudadList;
    }

    
    

}
