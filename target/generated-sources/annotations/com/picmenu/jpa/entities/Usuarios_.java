package com.picmenu.jpa.entities;

import com.picmenu.jpa.entities.Ciudades;
import com.picmenu.jpa.entities.Pedidos;
import com.picmenu.jpa.entities.Restaurantes;
import com.picmenu.jpa.entities.Roles;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-31T14:53:47")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, String> apellidos;
    public static volatile SingularAttribute<Usuarios, Integer> idUsuario;
    public static volatile SingularAttribute<Usuarios, String> direccion;
    public static volatile ListAttribute<Usuarios, Restaurantes> restaurantesList;
    public static volatile SingularAttribute<Usuarios, String> nombres;
    public static volatile SingularAttribute<Usuarios, Date> fechaNac;
    public static volatile SingularAttribute<Usuarios, String> password;
    public static volatile ListAttribute<Usuarios, Roles> rolesList;
    public static volatile SingularAttribute<Usuarios, String> telefono;
    public static volatile SingularAttribute<Usuarios, Character> sexo;
    public static volatile ListAttribute<Usuarios, Pedidos> pedidosList;
    public static volatile SingularAttribute<Usuarios, String> email;
    public static volatile SingularAttribute<Usuarios, Ciudades> ciudades;

}