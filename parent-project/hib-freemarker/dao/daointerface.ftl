${pojo.getPackageDeclaration()?replace("model", "dao")}
// Generated ${date} by Hibernate Tools ${version}

<#assign declarationName = pojo.importType(pojo.getDeclarationName())>
/**
 * Hibernate Dao object for domain model class ${declarationName}.
 * @see ${pojo.getQualifiedDeclarationName()}
 * @author Paola Greco
 */
import ${pojo.getQualifiedDeclarationName()};

public interface ${declarationName}Dao extends GenericDao<${declarationName}, ${c2j.getJavaTypeName(clazz.identifierProperty, jdk5)}>{}
