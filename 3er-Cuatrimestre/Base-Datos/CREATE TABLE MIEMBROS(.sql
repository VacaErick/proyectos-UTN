commit;

CREATE TABLE reclusorios(
  cod_ce VARCHAR2(2) CONSTRAINT cod_ce_nn NOT NULL,
  nom_ce VARCHAR2(50) CONSTRAINT nom_ce_nn NOT NULL,
  subcidio NUMBER(10) CONSTRAINT subcidio_nn NOT NULL,
  nom_edo VARCHAR2(50) CONSTRAINT nom_edo_nn NOT NULL,
  clave_cede NUMBER(2) CONSTRAINT clave_cede_nn NOT NULL,
  CONSTRAINT cod_ce_pk PRIMARY KEY(cod_ce)
)

INSERT INTO reclusorios VALUES('S1','Cerezos',1414620,'Sinaloa',10);
INSERT INTO reclusorios VALUES('G2','Alto Cumbres',914450,'Guanajuato',20);
INSERT INTO reclusorios VALUES('M3','Zitacuaro Centro',823123,'Michoacán',30);
INSERT INTO reclusorios VALUES('M4','Apatzingo',838729,'Michoacán',10);
INSERT INTO reclusorios VALUES('G5','Norte Cerro',910643,'Guanajuato',20);
INSERT INTO reclusorios VALUES('S6','Sureste',1915200,'Sinaloa',30);
INSERT INTO reclusorios VALUES('m7','Lázaro Cárdenas',905100,'Michoacán',10);