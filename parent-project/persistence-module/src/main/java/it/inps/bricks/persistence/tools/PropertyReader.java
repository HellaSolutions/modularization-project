package it.inps.bricks.persistence.tools;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PropertyReader {
	
	private static Logger log = LoggerFactory.getLogger(PropertyReader.class);
	
	private PropertyReader(){}
	
	public static Properties loadPropertyFile(String path) {

		InputStream mapperFile = PropertyReader.class.getClassLoader().getResourceAsStream(path);
		if(mapperFile == null){
			throw new IllegalStateException("Unable to find mapper properties file: " + path);
		}
		Properties p = new Properties();
		try {
			
			p.load(mapperFile);
			return p;
			
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}finally{
			try {
				mapperFile.close();
			} catch (IOException e) {
				log.error(e.getMessage(), e);
			}
		}
	}

}
