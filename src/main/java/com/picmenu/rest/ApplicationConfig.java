/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.picmenu.rest;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author adsi1
 */
@javax.ws.rs.ApplicationPath("api")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.picmenu.rest.CiudadesFacadeREST.class);
        resources.add(com.picmenu.rest.DepartamentosFacadeREST.class);
        resources.add(com.picmenu.rest.MenusFacadeREST.class);
        resources.add(com.picmenu.rest.PaisesFacadeREST.class);
        resources.add(com.picmenu.rest.RestaurantesFacadeREST.class);
        resources.add(com.picmenu.rest.SedesFacadeREST.class);
        resources.add(com.picmenu.rest.UsuariosFacadeREST.class);
    }
    
}
