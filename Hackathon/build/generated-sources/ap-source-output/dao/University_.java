package dao;

import dao.Curso;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-09T17:36:17")
@StaticMetamodel(University.class)
public class University_ { 

    public static volatile ListAttribute<University, Curso> cursos;
    public static volatile SingularAttribute<University, String> address;
    public static volatile SingularAttribute<University, String> name;
    public static volatile SingularAttribute<University, String> description;
    public static volatile SingularAttribute<University, Long> id;

}