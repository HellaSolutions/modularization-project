${pojo.getPackageDeclaration()?replace("model", "dao.hibernate")}
// Generated ${date} by Hibernate Tools ${version}

<#assign declarationName = pojo.importType(pojo.getDeclarationName())>
/**
 * Hibernate Dao object for domain model class ${declarationName}.
 * @see ${pojo.getQualifiedDeclarationName()}
 * @author Paola Greco
*/ 
import org.springframework.stereotype.Repository;
import ${pojo.getQualifiedDeclarationName()};
import ${pojo.getQualifiedDeclarationName()?replace("model", "dao")}Dao;

@Repository("${declarationName}Dao")
public class ${declarationName}HibernateDao extends HibernateDao<${declarationName}, ${c2j.getJavaTypeName(clazz.identifierProperty, jdk5)}> implements ${declarationName}Dao{}