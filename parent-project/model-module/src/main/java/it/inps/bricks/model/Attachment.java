package it.inps.bricks.model;
// Generated 27-gen-2017 16.29.52 by Hibernate Tools 4.3.2-SNAPSHOT


import java.util.Date;

/**
 * Attachment generated by hbm2java
 */
public class Attachment  implements java.io.Serializable {


     private Integer id;
     private Task task;
     private String nome;
     private byte[] bytes;
     private String mimeType;
     private Date created;
     private Date updated;
     private String user;

    public Attachment() {
    }

	
    public Attachment(String nome, byte[] bytes, String mimeType, Date created, Date updated) {
        this.nome = nome;
        this.bytes = bytes;
        this.mimeType = mimeType;
        this.created = created;
        this.updated = updated;
    }
    public Attachment(Task task, String nome, byte[] bytes, String mimeType, Date created, Date updated, String user) {
       this.task = task;
       this.nome = nome;
       this.bytes = bytes;
       this.mimeType = mimeType;
       this.created = created;
       this.updated = updated;
       this.user = user;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Task getTask() {
        return this.task;
    }
    
    public void setTask(Task task) {
        this.task = task;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public byte[] getBytes() {
        return this.bytes;
    }
    
    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }
    public String getMimeType() {
        return this.mimeType;
    }
    
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
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




}


