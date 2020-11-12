/* SECUENCIA HIBERNATE */
DROP SEQUENCE IF EXISTS hibernate_sequence;

CREATE SEQUENCE hibernate_sequence
	START WITH 1
	INCREMENT BY 1;

/* TABLAS */
DROP TABLE IF EXISTS emocion_especifica;
 
CREATE TABLE emocion_especifica (
	id INTEGER NOT NULL,
	nombre VARCHAR(128) NOT NULL,
	PRIMARY KEY (id)
);
	
DROP TABLE IF EXISTS emocion_general;
 
CREATE TABLE emocion_general (
	id INTEGER NOT NULL,
	nombre VARCHAR(128) NOT NULL,
	PRIMARY KEY (id)
);

DROP TABLE IF EXISTS emocion_general_emociones;
 
CREATE TABLE emocion_general_emociones (
	emocion_general_id INTEGER NOT NULL,
	emociones_id INTEGER NOT NULL
);

ALTER TABLE emocion_general_emociones
    ADD FOREIGN KEY (emocion_general_id) 
    REFERENCES emocion_general(id);
	
ALTER TABLE emocion_general_emociones
    ADD FOREIGN KEY (emociones_id) 
    REFERENCES emocion_especifica(id);

DROP TABLE IF EXISTS lugar;
 
CREATE TABLE lugar (
	id INTEGER NOT NULL,
	nombre VARCHAR(128) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE cancion (
	id INTEGER NOT NULL,
	extras VARCHAR(128) NOT NULL,
	link VARCHAR(128) NOT NULL,
	nombre VARCHAR(128) NOT NULL,
	origen VARCHAR(128) NOT NULL,
	emocion_id INTEGER NOT NULL,
	lugar_id INTEGER NOT NULL,
	PRIMARY KEY (id)
);
	
ALTER TABLE cancion
    ADD FOREIGN KEY (emocion_id) 
    REFERENCES emocion_especifica(id);
	
ALTER TABLE cancion
    ADD FOREIGN KEY (lugar_id) 
    REFERENCES lugar(id);