package dao;

import dao.Curso;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-09T17:36:17")
@StaticMetamodel(Disciplina.class)
public class Disciplina_ { 

    public static volatile SingularAttribute<Disciplina, String> numeroCredito;
    public static volatile SingularAttribute<Disciplina, Curso> curso;
    public static volatile SingularAttribute<Disciplina, Integer> totalHora;
    public static volatile SingularAttribute<Disciplina, String> nome;
    public static volatile SingularAttribute<Disciplina, Long> id;
    public static volatile SingularAttribute<Disciplina, String> coneudoProgramatico;

}