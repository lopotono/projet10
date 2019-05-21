--- ================================================================================								
--- livre								
--- ================================================================================
INSERT INTO public.livre
(titre, auteur, isbn, genre, disponible, nombre_exemplaire, editeur, personnemax)
VALUES
('Frankenstein ou Le Prométhée moderne', 'Mary Shelley', 9782070468089, 'Science fiction', 'false', 5, 'Folio', 10),
('Nord', 'Louis-Ferdinand Céline', 20702013129, 'Roman', 'false', 10, 'Gallimard', 20),
('Au revoir là-haut', 'Pierre Lemaitre', 9782253194613, 'Roman', 'false', 15, 'Albin Michel', 30),
('Le temps des regrets', 'Mary Higgins Clark', 9782253014539, 'Policier', 'false', 25, 'Pocket', 50),
('Lolita', 'Vladimir Nabokov', 2070368998, 'Roman', 'false', 25, 'Olympia Press', 50),
('Bienvenue au club', 'Jonathan Coe', 9782070317233, 'Roman', 'false', 62, 'Gallimard', 124),
('Au pays de Dieu', 'Douglas Kennedy', 2714441084, 'Récit', 'false', 50, 'Pocket', 100),
('Germinal', 'Emile Zola', 9780451519757, 'Roman', 'false', 8, 'Gil Blas', 16),
('Chaos', 'Patricia Cornwell', 9782848932606, 'Policier', 'true', 78, 'Pocket', 156),
('Madame Bovary', 'Gustave Flaubert', 9782253004868, 'Roman', 'true', 95, 'Michel Lévy frères', 190),
('Les savants de Bonaparte', 'Robert Solét', '2020338459', 'Histoire', 'false', 5, 'Hachette', 10),
('Le Colonel Chabert', 'Honoré de Balzac', '9782253098041', 'Roman', 'false', 15, 'Mame-Delaunay', 30),
('Fahrenheit 451', 'Ray Bradbury', '9780764586507', 'Science fiction', 'true', 15, 'Ballantine Books', 30),
('22-11-63', 'Stephen King', '9781444727296', 'Science fiction', 'true', 2, 'Pocket', 4),
('Les Robots', 'Isaac Asimov', '9782290044032', 'Science fiction', 'true', 38, 'Gnome Press', 76),
('L’horizon', 'Patrick Modiano', '9782070128471', 'Roman', 'false', 8, 'Gallimard', 16),
('Les Trois Mousquetaires. Tome 1, Les ferrets de la reine', 'Alexandre Dumas', '9782080721426', 'Histoire', 'true', 9, 'Flammarion', 18),
('Les trois mousquetaires tome 2', 'Alexandre Dumas', '9782010116506', 'Histoire', 'true', 1, 'Flammarion', 2),
('Hello, goodbye', 'David Lloyd, Louise Voce', '9780688076986', 'Jeunesse', 'false', 15, 'Actes Sud', 30),
('Astérix chez les Bretons', 'René Goscinny, Albert Uderzo', '9782012101401', 'BD', 'true', 26, 'Dargaud', 52),
('James Bond', 'Ian Fleming', '2221101359', 'Espionnage', 'true', 29, 'Pocket', 58),
('Le Port des brumes', 'Georges Simenon', '9782266004879', 'Policier', 'false', 9, 'Fayard', 18),
('Un homme dans la nuit', 'Gaston Leroux', '9782856160442', 'Policier', 'true', 95, 'Fayard', 190),
('La planète des singes', 'Pierre Boulle', '2266118285', 'Science fiction', 'true', 95, 'Julliard', 190),
('The Shining', 'Stephen King', '9780385121675', 'Horreur', 'true', 19, 'Alta', 38),
('Croc-Blanc', 'Jack London', '201002348X', 'Aventure', 'true', 25, 'Macmillan', 25),
('Les fleurs du mal', 'Charles Baudelaire', '2253007102', 'Poésie', 'true', 50, 'Auguste Poulet-Malassis', 100),
('Une vie', 'Guy de Maupassant', '2253004243', 'Roman', 'true', 10, 'Ollendorff', 20),
('La peste', 'Albert Camus', '2070360423', 'Roman', 'true', 10, 'Gallimard', 20),
('Fables choisies tome 1', 'Jean de La Fontaine', '2070409147', 'Poésie', 'false', 1, 'Gallimard', 2),
('L’école des femmes', 'Molière', '2038713065', 'Théatre', 'true', 18, 'Pocket', 36),
('Le parfum d’Adam', 'Jean-Christophe Rufin', '9782744199677', 'Roman', 'false', 12, 'Flammarion', 24);



--- ================================================================================								
--- utilisateur								
--- ================================================================================
INSERT INTO public.utilisateur
(nom, prenom, adresse, code_postal, ville, mot_de_passe, mail, option)
VALUES
('ROUX', 'Jeanne', '4 rue de la Tour', 75019, 'PARIS', 'defdg45862', 'roux.j@orange.fr', null),
('LEROY', 'Merlin', '95 avenue du Général de Gaulle', 77400, 'MELUN', 'goHome', 'leroy.merlin@orange.fr', null),
('GIRARD', 'Caroline', '105 avenue de la victoire', 93100, 'PANTIN', 'labas', 'gi.car@free.fr', null),
('FOURNIER', 'Denis', '72 rue des belles fleurs', 13100, 'MARSEILLE', 'boulanger', 'fournier.denis@free.fr', null),
('SAPIN', 'Jacques', '56 rue du Commandant Arnaud', 77250, 'COULOMMIERS', '14789563*+k', 'sapin.jack@orange.fr', null),
('DUPONT', 'Roger', '2 rue des champs', 75019, 'PARIS', 'bftg12', 'roger.dup@orange.fr', null),
('MACRON', 'Albert', '26 avenue du Général de Gaulle', 77300, 'CHELLES', 'AdieuLami', 'macron.albert@orange.fr', null),
('FONTON', 'Alain', '85 avenue de la victoire', 93100, 'PANTIN', '1478hu', 'fonton.alain@orange.fr', null),
('LEE', 'Paul', '2 rue Trevet', 93100, 'AUBERVILLIERS', 'popo', 'lee.paul@free.fr', null),
('AUTINO', 'Monique', '30 rue du Commandant Arnaud', 77000, 'MELUN', 'pourquoipas', 'autino.monique@orange.fr', null),
('TERRAGE', 'Frédéric', '75 Avenue de Gaulle', 93140, 'BONDY', 'astro', 'terragef@gmail.com', null);


--- ================================================================================								
--- pret								
--- ================================================================================
INSERT INTO pret (date_debut, date_fin, etat, prolongation, id_utilisateur, id_livre) 
VALUES 
('20-02-2019', '20-03-2019', 'en cours', 'false', 9, 2),
('29-03-2019', '29-04-2019', 'en cours', 'false', 11, 32),
('28-03-2019', '28-04-2019', 'en cours', 'false', 1, 3),
('02-04-2019', '02-05-2019', 'en cours', 'false', 3, 5),
('25-03-2019', '25-04-2019', 'en cours', 'false', 4, 6),
('26-03-2019', '26-04-2019', 'en cours', 'false', 6, 11),
('13-03-2019', '13-04-2019', 'en cours', 'false', 10, 19),
('02-02-2019', '03-03-2019', 'en cours', 'false', 5, 8),
('12-02-2019', '12-03-2019', 'en cours', 'false', 7, 12),
('21-02-2019', '21-03-2019', 'en cours', 'false', 10, 22);
