CREATE SCHEMA yw_ecl_esercizio ;

SET SCHEMA yw_ecl_esercizio ;

   create table yw_ecl_esercizio.attivitaview (
        idAttivita integer not null,
        codiceTipoContratto varchar(250) not null,
        codiceServizio varchar(45) not null,
        identificativoIntervento varchar(25) not null,
        codiceGecoSSU varchar(25) not null,
        nomeScheda varchar(255) not null,
        numeroTask bigint not null,
        totalEffort integer not null,
        primary key (idAttivita, codiceTipoContratto, codiceServizio, identificativoIntervento, codiceGecoSSU, nomeScheda, numeroTask, totalEffort)
    );

    create table yw_ecl_esercizio.taskperdocumentoview (
        idTask integer not null,
        testo varchar(255) not null,
        codiceTipoTask integer not null,
        descrizioneTipoTask varchar(512) not null,
        codiceCapitolo varchar(45) not null,
        codiceServizio integer not null,
        codiceAttivita integer not null,
        numeroAttachment bigint not null,
        primary key (idTask, testo, codiceTipoTask, descrizioneTipoTask, codiceCapitolo, codiceServizio, codiceAttivita, numeroAttachment)
    );

    create table yw_ecl_esercizio.tb_ywatc_attachment_cl (
        YWATC_COD_ATTACHMENT_PK integer generated by default as identity,
        YWATC_YWTSK_COD_TASK_PK integer,
        YVATC_DESCS_NOME varchar(120) not null,
        YWATC_BLOB_DATA blob(32M) not null,
        YWATC_COD_MIME varchar(150) not null,
        YWATC_DATA_CREAZ timestamp not null,
        YWATC_DATA_UPDATE timestamp not null,
        YWATC_COD_USER varchar(45),
        primary key (YWATC_COD_ATTACHMENT_PK)
    );

    create table yw_ecl_esercizio.tb_ywatt_attivita_cl (
        YWATT_COD_ATTIVITA_PK integer generated by default as identity,
        YWATT_YWAVA_COD_AVA_PK integer,
        YWATT_YWSER_COD_SER_PK integer not null,
        YWATT_YWTCN_COD_TIPOCONT_PK integer not null,
        YWATT_COD_WBSCOGE varchar(12),
        YWATT_COD_INTERVENTO varchar(25),
        YWATT_DESCS_AREACONTR varchar(45),
        YWATT_DESCS_AREAAPP varchar(45),
        YWATT_DESCS_AREAINPS varchar(45),
        YWATT_DENOM_AMBAPP varchar(255),
        YWATT_COD_DIREZIONE varchar(5),
        YWATT_DENOM_LINEAINT varchar(25),
        YWATT_DESCS_AMBFUNZ varchar(255),
        YWATT_COD_PIANOFORN varchar(12),
        YWATT_COD_GECOSSU varchar(25),
        YWATT_DESCS_NMSCHEDA varchar(255),
        YWATT_DESCR_PROGETTO varchar(4000),
        YWATT_DENOM_RESPINPS varchar(25),
        YWATT_DENOM_REFINPS varchar(25),
        YWATT_DESCS_SERVIZIO varchar(45),
        YWATT_DENOM_TIPSERV varchar(45),
        YWATT_DENOM_CAPPRG varchar(25),
        YWATT_DENOM_CAPPRGRIF varchar(25),
        YWATT_COD_STATOLAV varchar(25),
        YWATT_DATA_APERTSSU timestamp,
        YWATT_DATA_CHIUSSSU timestamp,
        YWATT_DATA_RIPIANWBS varchar(255),
        YWATT_NUM_SEMATTIVAZ varchar(255),
        YWATT_DATA_CONSRQPIAN timestamp,
        YWATT_DATA_CONSRQEFF timestamp,
        YWATT_DATA_COLLPIAN timestamp,
        YWATT_DATA_COLLEFF timestamp,
        YWATT_DATA_INIZCOLL timestamp,
        YWATT_DATA_FINECOLL timestamp,
        YWATT_DATA_AVVESEEFF timestamp,
        YWATT_COD_TIPOINT varchar(5),
        YWATT_NOTE_TECNICHE varchar(255),
        YWATT_NOTE_GENERALI varchar(255),
        YWATT_DESCR_SCADIST varchar(255),
        YWATT_NUM_ID varchar(255),
        YWATT_NUM_PRIORITA varchar(255),
        YWATT_DESCS_MACROATT varchar(25),
        YWATT_DESCS_PRESCOGE smallint,
        YWATT_DATA_SAL varchar(12),
        YWATT_IMP_CONSUNTIVO varchar(12),
        YWATT_PERC_FASECONS integer,
        YWATT_DATA_CREAZ timestamp not null,
        YWATT_DATA_UPDATE timestamp not null,
        YWATT_COD_USER varchar(45),
        primary key (YWATT_COD_ATTIVITA_PK)
    );

    create table yw_ecl_esercizio.tb_ywava_avanzamento_ct (
        YWAVA_COD_AVA_PK integer generated by default as identity,
        YWAVA_DESCS_GECO varchar(45),
        YVAVA_DESCS_ALMAVIVA varchar(45),
        YVAVA_DESCS_DEFAULT varchar(45) not null unique,
        YVAVA_DATA_CREAZ timestamp not null,
        YVAVA_DATA_UPDATE timestamp not null,
        YVAVA_COD_USER varchar(45),
        primary key (YWAVA_COD_AVA_PK)
    );

    create table yw_ecl_esercizio.tb_ywser_servizio_ct (
        YWSER_COD_SER_PK integer generated by default as identity,
        YWSE_YWTCN_COD_TIPOCONT_PK integer not null,
        YWSER_COD_CODICE varchar(45) not null unique,
        YWSER_DESCS_DESCRIZIONE varchar(250) not null unique,
        YWSER_DATA_CREAZ timestamp not null,
        YWSER_DATA_UPDATE timestamp not null,
        YWSER_COD_USER varchar(45),
        primary key (YWSER_COD_SER_PK)
    );

    create table yw_ecl_esercizio.tb_ywtcn_tipocont_ct (
        YWTCN_COD_TIPOCONT_PK integer generated by default as identity,
        YWTCN_COD_CODICE varchar(45) not null,
        YWTCN_DESCS_DESCRIZIONE varchar(250) not null,
        YWTCN_DATA_CREAZ timestamp not null,
        YWTCN_DATA_UPDATE timestamp not null,
        YWTCN_COD_USER varchar(45),
        primary key (YWTCN_COD_TIPOCONT_PK)
    );

    create table yw_ecl_esercizio.tb_ywtsk_task_cl (
        YWTSK_COD_TASK_PK integer generated by default as identity,
        YWTSK_YWATT_COD_ATTIVITA_PK integer not null,
        YWTSK_YWTTS_COD_TIPOTASK_PK integer not null,
        YWTSK_NOTE_NOTA varchar(1024) not null,
        YWTSK_NUM_EFFORT integer,
        YWTSK_DATA_CREAZ timestamp not null,
        YWTSK_DATA_UPDATE timestamp not null,
        YWTSK_COD_USER varchar(45),
        primary key (YWTSK_COD_TASK_PK)
    );

    create table yw_ecl_esercizio.tb_ywtts_tipotask_ct (
        YWTTS_COD_TIPOTASK_PK integer generated by default as identity,
        YWTTS_YWSER_COD_SER_PK integer not null,
        YWTTS_COD_CODICE varchar(100) not null unique,
        YWTTS_DESCS_DESCRIZIONE varchar(1024) not null,
        YWTTS_COD_CAPITOLO varchar(45),
        YWTTS_DATA_CREAZ timestamp not null,
        YWTTS_DATA_UPDATE timestamp not null,
        YWTTS_COD_USER varchar(45),
        primary key (YWTTS_COD_TIPOTASK_PK)
    );

    create table yw_ecl_esercizio.tb_ywtve_tipovaleco_ct (
        YWTVE_COD_TIPOVALECO_PK integer generated by default as identity,
        YWTVE_COD_CODICE varchar(45) not null unique,
        YWTVE_DESC_DESCRIZIONE varchar(250) not null unique,
        YWTVE_DATA_CREAZ timestamp not null,
        YWTVE_DATA_UPDATE timestamp not null,
        YWTVE_COD_USER varchar(45),
        primary key (YWTVE_COD_TIPOVALECO_PK)
    );

    create table yw_ecl_esercizio.tb_ywvec_valeco_cl (
        YWVEC_COD_VALECO_PK integer generated by default as identity,
        YWVEC_YWATT_COD_ATTIVITA_PK integer not null,
        YWVEC_YWTVE_COD_TIPOVALECO_PK integer not null,
        YWVEC_NUM_FTE integer,
        YWVEC_NUM_FPE varchar(255),
        YWVEC_NUM_FPADD integer,
        YWVEC_NUM_FPCHG integer,
        YWVEC_NUM_FPDEL varchar(255),
        YWVEC_DATA_CREAZ timestamp not null,
        YWVEC_DATA_UPDATE timestamp not null,
        YWVEC_COD_USER varchar(45),
        primary key (YWVEC_COD_VALECO_PK)
    );

    alter table yw_ecl_esercizio.tb_ywatc_attachment_cl 
        add constraint FK4F5A5AE7B9DDE8FB 
        foreign key (YWATC_YWTSK_COD_TASK_PK) 
        references yw_ecl_esercizio.tb_ywtsk_task_cl;

    alter table yw_ecl_esercizio.tb_ywatt_attivita_cl 
        add constraint FKF2E082B3AF96445E 
        foreign key (YWATT_YWAVA_COD_AVA_PK) 
        references yw_ecl_esercizio.tb_ywava_avanzamento_ct;

    alter table yw_ecl_esercizio.tb_ywatt_attivita_cl 
        add constraint FKF2E082B3FC92C8DA 
        foreign key (YWATT_YWTCN_COD_TIPOCONT_PK) 
        references yw_ecl_esercizio.tb_ywtcn_tipocont_ct;

    alter table yw_ecl_esercizio.tb_ywatt_attivita_cl 
        add constraint FKF2E082B3C95F6A69 
        foreign key (YWATT_YWSER_COD_SER_PK) 
        references yw_ecl_esercizio.tb_ywser_servizio_ct;

    alter table yw_ecl_esercizio.tb_ywser_servizio_ct 
        add constraint FKDDB332F5F0319847 
        foreign key (YWSE_YWTCN_COD_TIPOCONT_PK) 
        references yw_ecl_esercizio.tb_ywtcn_tipocont_ct;

    alter table yw_ecl_esercizio.tb_ywtsk_task_cl 
        add constraint FK1B0F6801C895134D 
        foreign key (YWTSK_YWTTS_COD_TIPOTASK_PK) 
        references yw_ecl_esercizio.tb_ywtts_tipotask_ct;

    alter table yw_ecl_esercizio.tb_ywtsk_task_cl 
        add constraint FK1B0F680125B26101 
        foreign key (YWTSK_YWATT_COD_ATTIVITA_PK) 
        references yw_ecl_esercizio.tb_ywatt_attivita_cl;

    alter table yw_ecl_esercizio.tb_ywtts_tipotask_ct 
        add constraint FKE43050FC35D07157 
        foreign key (YWTTS_YWSER_COD_SER_PK) 
        references yw_ecl_esercizio.tb_ywser_servizio_ct;

    alter table yw_ecl_esercizio.tb_ywvec_valeco_cl 
        add constraint FKB3CB11EE7208655 
        foreign key (YWVEC_YWTVE_COD_TIPOVALECO_PK) 
        references yw_ecl_esercizio.tb_ywtve_tipovaleco_ct;

    alter table yw_ecl_esercizio.tb_ywvec_valeco_cl 
        add constraint FKB3CB11E147060C9 
        foreign key (YWVEC_YWATT_COD_ATTIVITA_PK) 
        references yw_ecl_esercizio.tb_ywatt_attivita_cl;
