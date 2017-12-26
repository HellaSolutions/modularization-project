${pojo.getPackageDeclaration()?replace("model", "persistence.dao")}

<#assign declarationName = pojo.importType(pojo.getDeclarationName())>
/**
 * Hibernate Dao object for domain model class ${declarationName}.
 * @see ${pojo.getQualifiedDeclarationName()}
 * @author Paola Greco
 */
import ${pojo.getQualifiedDeclarationName()};
import ${pojo.getPackageDeclaration()?replace("package", "")?replace(";", "")}.dao.GenericDao;

public interface ${declarationName}Dao extends GenericDao<${declarationName}, ${c2j.getJavaTypeName(clazz.identifierProperty, jdk5)}>{}
