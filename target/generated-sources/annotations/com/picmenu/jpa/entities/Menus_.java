package com.picmenu.jpa.entities;

import com.picmenu.jpa.entities.Producto;
import com.picmenu.jpa.entities.Sedes;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-31T14:53:47")
@StaticMetamodel(Menus.class)
public class Menus_ { 

    public static volatile SingularAttribute<Menus, String> nombreMenu;
    public static volatile SingularAttribute<Menus, Integer> idMenus;
    public static volatile ListAttribute<Menus, Producto> productoList;
    public static volatile SingularAttribute<Menus, Sedes> idSede;

}