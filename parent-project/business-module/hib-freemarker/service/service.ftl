${pojo.getPackageDeclaration()?replace("model", "business.service")}
<#assign declarationName = pojo.importType(pojo.getDeclarationName())>
<#assign lowerPrefix = declarationName[0]?lower_case + declarationName[1..] >
/**
 * Service class for domain model class ${declarationName}.
 * @see ${pojo.getQualifiedDeclarationName()}
 * @author Paola Greco
*/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ${pojo.getQualifiedDeclarationName()?replace("model", "persistence.dao")}Dao;

@Service("${lowerPrefix}Service")
@Transactional
public class ${declarationName}Service {
	
	private static final Logger log = LoggerFactory.getLogger(${declarationName}Service.class);

	private	${declarationName}Dao ${lowerPrefix}Dao;

	@Autowired
	public void set${declarationName}Dao(${declarationName}Dao ${lowerPrefix}Dao){
		this.${lowerPrefix}Dao = ${lowerPrefix}Dao;
	}

}
 