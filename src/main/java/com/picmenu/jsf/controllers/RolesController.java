/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.picmenu.jsf.controllers;

import com.picmenu.jpa.entities.Roles;
import com.picmenu.jpa.sessions.RolesSession;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class RolesController implements Serializable {
    private static final long serialVersionUID = 1L;

   @EJB
   private RolesSession rolesSession;
   private Roles roles;
  
    
}
