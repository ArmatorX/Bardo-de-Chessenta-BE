/* EMOCIÓN GENERAL */
INSERT INTO emocion_general (id, nombre) VALUES 
	(hibernate_sequence.nextval, 'Felicidad'),
	(hibernate_sequence.nextval, 'Ira'),
	(hibernate_sequence.nextval, 'Miedo'),
	(hibernate_sequence.nextval, 'Sorpresa'),
	(hibernate_sequence.nextval, 'Tristeza');


/* EMOCIÓN ESPECÍFICA */
INSERT INTO emocion_especifica (id, nombre) VALUES 
	(hibernate_sequence.nextval, 'Aburrimiento'),
	(hibernate_sequence.nextval, 'Agresividad'),
	(hibernate_sequence.nextval, 'Alegría'),
	(hibernate_sequence.nextval, 'Amenaza'),
	(hibernate_sequence.nextval, 'Ansiedad'),
	(hibernate_sequence.nextval, 'Asombro'),
	(hibernate_sequence.nextval, 'Comedia'),
	(hibernate_sequence.nextval, 'Confusión'),
	(hibernate_sequence.nextval, 'Culpa'),
	(hibernate_sequence.nextval, 'Decepción'),
	(hibernate_sequence.nextval, 'Desesperación'),
	(hibernate_sequence.nextval, 'Distante'),
	(hibernate_sequence.nextval, 'Esperanzador'),
	(hibernate_sequence.nextval, 'Exaltación'),
	(hibernate_sequence.nextval, 'Frustración'),
	(hibernate_sequence.nextval, 'Horror'),
	(hibernate_sequence.nextval, 'Incomodidad'),
	(hibernate_sequence.nextval, 'Inseguridad'),
	(hibernate_sequence.nextval, 'Locura'),
	(hibernate_sequence.nextval, 'Melancolía'),
	(hibernate_sequence.nextval, 'Odio'),
	(hibernate_sequence.nextval, 'Soledad'),
	(hibernate_sequence.nextval, 'Tensión'),
	(hibernate_sequence.nextval, 'Terror'),
	(hibernate_sequence.nextval, 'Tranquilidad'),
	(hibernate_sequence.nextval, 'Tristeza'),
	(hibernate_sequence.nextval, 'Valentía');

/* EMOCIÓN GENERAL EMOCIÓN ESPECÍFICA */
INSERT INTO emocion_general_emociones (emocion_general_id, emociones_id) VALUES 
	(5, 6),
	(2, 7),
	(1, 8),
	(2, 9),
	(3, 10),
	(4, 11),
	(1, 12),
	(4, 13),
	(5, 14),
	(3, 15),
	(5, 16),
	(2, 17),
	(1, 18),
	(1, 19),
	(2, 20),
	(3, 21),
	(3, 22),
	(3, 23),
	(2, 24),
	(5, 25),
	(2, 26),
	(3, 27),
	(4, 28),
	(3, 29),
	(1, 30),
	(5, 31),
	(1, 32);
	
/* LUGAR */
INSERT INTO lugar (id, nombre) VALUES
	(hibernate_sequence.nextval, 'Taberna'),
	(hibernate_sequence.nextval, 'Ciudad'),
	(hibernate_sequence.nextval, 'Puerto'),
	(hibernate_sequence.nextval, 'Villa'),
	(hibernate_sequence.nextval, 'Dungeon'),
	(hibernate_sequence.nextval, 'Mágico'),
	(hibernate_sequence.nextval, 'Lluvia'),
	(hibernate_sequence.nextval, 'General');
	
/* CANCION */
INSERT INTO cancion (id, extras, link, nombre, origen, emocion_id, lugar_id) VALUES
	(hibernate_sequence.nextval, '', 'https://www.youtube.com/watch?v=olmhqonMXBo', 'Lament of the Angel', 'The Binding of Isaac OST', 16, 37),
	(hibernate_sequence.nextval, 'Moksha Ramas', 'https://www.youtube.com/watch?v=Isl-EY2dn1Y', 'Phobos Anomaly (Cover)', 'Doom OST', 24, 37),
	(hibernate_sequence.nextval, 'Guerra/Batalla', 'https://www.youtube.com/watch?v=k4zh8RwhjZ0', 'The Beast', 'Sicario OST', 29, 37),
	(hibernate_sequence.nextval, '', 'https://www.youtube.com/watch?v=wEWF2xh5E8s', 'Sadness and Sorrow', 'Naruto OST', 14, 39),
	(hibernate_sequence.nextval, '', 'https://www.youtube.com/watch?v=v712NiVK5uY', 'Waterfall', 'Undertale OST', 25, 39),
	(hibernate_sequence.nextval, '', 'https://www.youtube.com/watch?v=OQ-kyWlislA', 'We''re Hungry Because we''re Alive', 'Kono Subarashi ni Shukufuku Wo! OST', 12, 33);