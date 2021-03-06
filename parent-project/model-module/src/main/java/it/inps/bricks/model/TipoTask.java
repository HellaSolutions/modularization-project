package it.inps.bricks.model;
// Generated 27-gen-2017 16.29.52 by Hibernate Tools 4.3.2-SNAPSHOT


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TipoTask generated by hbm2java
 */
public class TipoTask  implements java.io.Serializable {


     private Integer id;
     private Servizio servizio;
     private String codice;
     private String descrizione;
     private String capitolo;
     private Date created;
     private Date updated;
     private String user;
     private Set<Tag> tags = new HashSet<Tag>(0);
     private Set<Task> tasks = new HashSet<Task>(0);

    public TipoTask() {
    }

	
    public TipoTask(Servizio servizio, String codice, String descrizione, Date created, Date updated) {
        this.servizio = servizio;
        this.codice = codice;
        this.descrizione = descrizione;
        this.created = created;
        this.updated = updated;
    }
    public TipoTask(Servizio servizio, String codice, String descrizione, String capitolo, Date created, Date updated, String user, Set<Tag> tags, Set<Task> tasks) {
       this.servizio = servizio;
       this.codice = codice;
       this.descrizione = descrizione;
       this.capitolo = capitolo;
       this.created = created;
       this.updated = updated;
       this.user = user;
       this.tags = tags;
       this.tasks = tasks;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Servizio getServizio() {
        return this.servizio;
    }
    
    public void setServizio(Servizio servizio) {
        this.servizio = servizio;
    }
    public String getCodice() {
        return this.codice;
    }
    
    public void setCodice(String codice) {
        this.codice = codice;
    }
    public String getDescrizione() {
        return this.descrizione;
    }
    
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    public String getCapitolo() {
        return this.capitolo;
    }
    
    public void setCapitolo(String capitolo) {
        this.capitolo = capitolo;
    }
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }
    public Date getUpdated() {
        return this.updated;
    }
    
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }
    public Set<Tag> getTags() {
        return this.tags;
    }
    
    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }
    public Set<Task> getTasks() {
        return this.tasks;
    }
    
    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }




}


