/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.picmenu.jsf.controllers;

import com.picmenu.jpa.entities.Ciudades;
import com.picmenu.jpa.entities.Roles;
import com.picmenu.jpa.entities.Usuarios;
import com.picmenu.jpa.sessions.UsuarioSession;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
@RequestScoped
public class UsuarioController implements Serializable {

    private static final long serialVersionUID = 1L;

    @EJB //Enterprise Java Beans
    private UsuarioSession usuarioSession;
    private Usuarios usuario;
    private List<Usuarios> usuarioList;
    private int ciudad;
    private int departamento;
    private String idRol;
    
    
    

    public void create() {
        if(isUserEstandar()==true){
            idRol="USER";
        }else{
            idRol="ADMIN";
        }
        usuario.setRolesList(new ArrayList<Roles>());
        usuario.getRolesList().add(new Roles(idRol));
        usuario.setCiudades(new Ciudades(ciudad, departamento));
        //usuario.setCiudades(new Ciudades(ciudad, new Departamentos(departamento)));
        getUsuarioSession().create(usuario);
        usuario=new Usuarios();
    }

    public void update() {
        getUsuarioSession().edit(usuario);
    }

    public void remove() {
        getUsuarioSession().remove(usuario);
    }

    public UsuarioSession getUsuarioSession() {
        return usuarioSession;
    }

    public void setUsuarioSession(UsuarioSession usuarioSession) {
        this.usuarioSession = usuarioSession;
    }

    public Usuarios getUsuario() {
        if (this.usuario == null) {
            this.usuario = new Usuarios();
        }
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public List<Usuarios> getUsuarioList() {
        if (this.usuarioList == null) {
            this.usuarioList = getUsuarioSession().findAll();
        }
        return usuarioList;
    }

    public void setUsuarioList(List<Usuarios> usuarioList) {
        this.usuarioList = usuarioList;
    }

    //Metodo Validar
    public void validarCorreo(FacesContext context, UIComponent component, Object value)
            throws ValidatorException {

        String correoelectronico = (String) value;
        if (usuarioSession.findByCorreoElectronico(correoelectronico) != null) {

            throw new ValidatorException(new FacesMessage(
                    FacesMessage.SEVERITY_ERROR, "El Correo Electonico Ya Se Encuentra Registrado", ""));
        }
        usuario.setEmail(correoelectronico);
    }

    public String getCiudad() {
        return ciudad + "," + departamento;
    }

    public void setCiudad(String ciudad) {
        StringTokenizer token = new StringTokenizer(ciudad, ",");
        this.ciudad = Integer.parseInt(token.nextToken());
        this.departamento = Integer.parseInt(token.nextToken());

    }
    
        public boolean isUserEstandar() {
        Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        String form = params.get("formRegistroUser");
        if (form == null) {
            return false;
        } else {
            return true;
        }

    }

}
