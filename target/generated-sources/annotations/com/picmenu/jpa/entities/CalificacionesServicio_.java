package com.picmenu.jpa.entities;

import com.picmenu.jpa.entities.Sedes;
import com.picmenu.jpa.entities.Servicios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-31T14:53:47")
@StaticMetamodel(CalificacionesServicio.class)
public class CalificacionesServicio_ { 

    public static volatile SingularAttribute<CalificacionesServicio, Servicios> servicios;
    public static volatile SingularAttribute<CalificacionesServicio, Date> fecha;
    public static volatile SingularAttribute<CalificacionesServicio, Short> puntuacion;
    public static volatile SingularAttribute<CalificacionesServicio, Integer> idServicio;
    public static volatile SingularAttribute<CalificacionesServicio, Sedes> idSede;
    public static volatile SingularAttribute<CalificacionesServicio, String> comentario;

}