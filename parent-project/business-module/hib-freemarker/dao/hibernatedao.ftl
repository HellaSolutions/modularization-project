${pojo.getPackageDeclaration()?replace("model", "persistence.dao.hibernate")}

<#assign declarationName = pojo.importType(pojo.getDeclarationName())>
<#assign lowerPrefix = declarationName[0]?lower_case + declarationName[1..] >
/**
 * Hibernate Dao object for domain model class ${declarationName}.
 * @see ${pojo.getQualifiedDeclarationName()}
 * @author Paola Greco
*/ 
import org.springframework.stereotype.Repository;
import ${pojo.getQualifiedDeclarationName()};
import ${pojo.getQualifiedDeclarationName()?replace("model", "persistence.dao")}Dao;
import ${pojo.getPackageDeclaration()?replace("package", "")?replace(";", "")}.dao.hibernate.HibernateDao;

@Repository("${lowerPrefix}Dao")
public class ${declarationName}HibernateDao extends HibernateDao<${declarationName}, ${c2j.getJavaTypeName(clazz.identifierProperty, jdk5)}> implements ${declarationName}Dao{}