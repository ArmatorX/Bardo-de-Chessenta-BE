/* EMOCIÓN GENERAL */
INSERT INTO emocion_general (nombre) VALUES 
	('Felicidad'),
	('Ira'),
	('Miedo'),
	('Sorpresa'),
	('Tristeza');


/* EMOCIÓN ESPECÍFICA */
INSERT INTO emocion_especifica (nombre) VALUES 
	('Aburrimiento'),
	('Agresividad'),
	('Alegría'),
	('Amenaza'),
	('Ansiedad'),
	('Asombro'),
	('Comedia'),
	('Confusión'),
	('Culpa'),
	('Decepción'),
	('Desesperación'),
	('Distante'),
	('Esperanzador'),
	('Exaltación'),
	('Frustración'),
	('Horror'),
	('Incomodidad'),
	('Inseguridad'),
	('Locura'),
	('Melancolía'),
	('Odio'),
	('Soledad'),
	('Tensión'),
	('Terror'),
	('Tranquilidad'),
	('Tristeza'),
	('Valentía');

/* EMOCIÓN GENERAL EMOCIÓN ESPECÍFICA */
INSERT INTO emocion_general_emociones (emocion_general_id, emociones_id) VALUES 
	(5, 1),
	(2, 2),
	(1, 3),
	(2, 4),
	(3, 5),
	(4, 6),
	(1, 7),
	(4, 8),
	(5, 9),
	(3, 10),
	(5, 11),
	(2, 12),
	(1, 13),
	(1, 14),
	(2, 15),
	(3, 16),
	(3, 17),
	(3, 18),
	(2, 19),
	(5, 20),
	(2, 21),
	(3, 22),
	(4, 23),
	(3, 24),
	(1, 25),
	(5, 26),
	(1, 27);
	
/* LUGAR */
INSERT INTO lugar (nombre) VALUES
	('Taberna'),
	('Ciudad'),
	('Puerto'),
	('Villa'),
	('Dungeon'),
	('Mágico'),
	('Lluvia');
	
/* CANCION */
INSERT INTO cancion (extras, link, nombre, origen, emocion_id, lugar_id) VALUES
	('', 'https://www.youtube.com/watch?v=olmhqonMXBo', 'Lament of the Angel', 'The Binding of Isaac OST', 11, 5),
	('Moksha Ramas', 'https://www.youtube.com/watch?v=Isl-EY2dn1Y', 'Phobos Anomaly (Cover)', 'Doom OST', 19, 5),
	('Guerra/Batalla', 'https://www.youtube.com/watch?v=k4zh8RwhjZ0', 'The Beast', 'Sicario OST', 24, 5),
	('', 'https://www.youtube.com/watch?v=wEWF2xh5E8s', 'Sadness and Sorrow', 'Naruto OST', 9, 7),
	('', 'https://www.youtube.com/watch?v=v712NiVK5uY', 'Waterfall', 'Undertale OST', 20, 7),
	('', 'https://www.youtube.com/watch?v=OQ-kyWlislA', 'We''re Hungry Because we''re Alive', 'Kono Subarashi ni Shukufuku Wo! OST', 7, 1);