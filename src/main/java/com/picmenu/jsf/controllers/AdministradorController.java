/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.picmenu.jsf.controllers;

//import com.picmenu.jpa.entities.Ciudades;
//import com.picmenu.jpa.entities.Departamentos;
import com.picmenu.jpa.entities.Restaurantes;
import com.picmenu.jpa.sessions.AdministradorSession;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AdministradorController implements Serializable {
     @EJB
    private AdministradorSession administradorSession;
    private Restaurantes administrador;
    private List<Restaurantes> usuarioList;
    private int ciudad;
    private int departamento;
    
//    public void create() {
//        administrador.setCiudades(new Ciudades(ciudad, new Departamentos(departamento)));
//        getAdministradorSession().create(administrador);
//    }
    
}
