package it.inps.bricks.model;
// Generated 27-gen-2017 16.29.52 by Hibernate Tools 4.3.2-SNAPSHOT



/**
 * DocumentoView generated by hbm2java
 */
public class DocumentoView  implements java.io.Serializable {


     private Integer id;
     private String testo;
     private Integer codiceTipoTask;
     private String descrizioneTipoTask;
     private String codiceCapitolo;
     private Integer codiceServizio;
     private Integer codiceAttivita;
     private long numeroAttachment;

    public DocumentoView() {
    }

	
    public DocumentoView(Integer id, String testo, Integer codiceTipoTask, String descrizioneTipoTask, Integer codiceServizio, Integer codiceAttivita, long numeroAttachment) {
        this.id = id;
        this.testo = testo;
        this.codiceTipoTask = codiceTipoTask;
        this.descrizioneTipoTask = descrizioneTipoTask;
        this.codiceServizio = codiceServizio;
        this.codiceAttivita = codiceAttivita;
        this.numeroAttachment = numeroAttachment;
    }
    public DocumentoView(Integer id, String testo, Integer codiceTipoTask, String descrizioneTipoTask, String codiceCapitolo, Integer codiceServizio, Integer codiceAttivita, long numeroAttachment) {
       this.id = id;
       this.testo = testo;
       this.codiceTipoTask = codiceTipoTask;
       this.descrizioneTipoTask = descrizioneTipoTask;
       this.codiceCapitolo = codiceCapitolo;
       this.codiceServizio = codiceServizio;
       this.codiceAttivita = codiceAttivita;
       this.numeroAttachment = numeroAttachment;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTesto() {
        return this.testo;
    }
    
    public void setTesto(String testo) {
        this.testo = testo;
    }
    public Integer getCodiceTipoTask() {
        return this.codiceTipoTask;
    }
    
    public void setCodiceTipoTask(Integer codiceTipoTask) {
        this.codiceTipoTask = codiceTipoTask;
    }
    public String getDescrizioneTipoTask() {
        return this.descrizioneTipoTask;
    }
    
    public void setDescrizioneTipoTask(String descrizioneTipoTask) {
        this.descrizioneTipoTask = descrizioneTipoTask;
    }
    public String getCodiceCapitolo() {
        return this.codiceCapitolo;
    }
    
    public void setCodiceCapitolo(String codiceCapitolo) {
        this.codiceCapitolo = codiceCapitolo;
    }
    public Integer getCodiceServizio() {
        return this.codiceServizio;
    }
    
    public void setCodiceServizio(Integer codiceServizio) {
        this.codiceServizio = codiceServizio;
    }
    public Integer getCodiceAttivita() {
        return this.codiceAttivita;
    }
    
    public void setCodiceAttivita(Integer codiceAttivita) {
        this.codiceAttivita = codiceAttivita;
    }
    public long getNumeroAttachment() {
        return this.numeroAttachment;
    }
    
    public void setNumeroAttachment(long numeroAttachment) {
        this.numeroAttachment = numeroAttachment;
    }




}


