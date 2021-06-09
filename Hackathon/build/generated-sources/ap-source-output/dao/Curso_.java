package dao;

import dao.Disciplina;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-09T15:22:25")
@StaticMetamodel(Curso.class)
public class Curso_ { 

    public static volatile ListAttribute<Curso, Disciplina> disciplinas;
    public static volatile SingularAttribute<Curso, Integer> hora;
    public static volatile SingularAttribute<Curso, Long> id;

}