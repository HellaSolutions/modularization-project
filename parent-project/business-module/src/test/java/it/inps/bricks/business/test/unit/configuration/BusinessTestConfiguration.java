package it.inps.bricks.business.test.unit.configuration;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import it.inps.bricks.persistence.dao.AttachmentDao;
import it.inps.bricks.persistence.dao.AttivitaDao;
import it.inps.bricks.persistence.dao.AttivitaViewDao;
import it.inps.bricks.persistence.dao.AvanzamentoDao;
import it.inps.bricks.persistence.dao.DocumentoViewDao;
import it.inps.bricks.persistence.dao.ServizioDao;
import it.inps.bricks.persistence.dao.TaskDao;
import it.inps.bricks.persistence.dao.TipoContrattoDao;
import it.inps.bricks.persistence.dao.TipoTaskDao;
import it.inps.bricks.persistence.dao.TipoValoreEconomicoDao;
import it.inps.bricks.persistence.dao.ValoreEconomicoDao;

@Configuration
@ComponentScan(basePackages = { "it.inps.bricks.business.service" })
public class BusinessTestConfiguration {

	@Bean
	public AttachmentDao attachmentDao() {
		return Mockito.mock(AttachmentDao.class);
	}

	@Bean
	public AttivitaDao attivitaDao() {
		return Mockito.mock(AttivitaDao.class);
	}

	@Bean
	public AttivitaViewDao attivitaViewDao() {
		return Mockito.mock(AttivitaViewDao.class);
	}

	@Bean
	public AvanzamentoDao avanzamentoDao() {
		return Mockito.mock(AvanzamentoDao.class);
	}

	@Bean
	public DocumentoViewDao documentoViewDao() {
		return Mockito.mock(DocumentoViewDao.class);
	}

	@Bean
	public ServizioDao servizioDao() {
		return Mockito.mock(ServizioDao.class);
	}

	@Bean
	public TaskDao taskDao() {
		return Mockito.mock(TaskDao.class);
	}

	@Bean
	public TipoContrattoDao tipoContrattoDao() {
		return Mockito.mock(TipoContrattoDao.class);
	}

	@Bean
	public TipoTaskDao tipoTaskDao() {
		return Mockito.mock(TipoTaskDao.class);
	}

	@Bean
	public TipoValoreEconomicoDao tipoValoreEconomicoDao() {
		return Mockito.mock(TipoValoreEconomicoDao.class);
	}

	@Bean
	public ValoreEconomicoDao valoreEconomicoDao() {
		return Mockito.mock(ValoreEconomicoDao.class);
	}

}
