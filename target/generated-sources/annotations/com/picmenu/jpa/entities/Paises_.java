package com.picmenu.jpa.entities;

import com.picmenu.jpa.entities.Departamentos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-31T14:53:47")
@StaticMetamodel(Paises.class)
public class Paises_ { 

    public static volatile SingularAttribute<Paises, String> idPais;
    public static volatile ListAttribute<Paises, Departamentos> departamentosList;
    public static volatile SingularAttribute<Paises, String> nombrePais;

}