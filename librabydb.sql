
CREATE SEQUENCE public.livre_id_livre_seq;

CREATE TABLE public.livre (
                id_livre INTEGER NOT NULL DEFAULT nextval('public.livre_id_livre_seq'),
                titre VARCHAR NOT NULL,
                auteur VARCHAR NOT NULL,
                isbn VARCHAR NOT NULL,
                genre VARCHAR NOT NULL,
                disponible BOOLEAN NOT NULL,
                nombre_exemplaire INTEGER NOT NULL,
                editeur VARCHAR NOT NULL,
                CONSTRAINT livre_pk PRIMARY KEY (id_livre)
);


ALTER SEQUENCE public.livre_id_livre_seq OWNED BY public.livre.id_livre;

CREATE SEQUENCE public.utilisateur_id_utilisateur_seq;

CREATE TABLE public.utilisateur (
                id_utilisateur INTEGER NOT NULL DEFAULT nextval('public.utilisateur_id_utilisateur_seq'),
                nom VARCHAR NOT NULL,
                prenom VARCHAR NOT NULL,
                adresse VARCHAR NOT NULL,
                code_postal INTEGER NOT NULL,
                ville VARCHAR NOT NULL,
                mot_de_passe VARCHAR NOT NULL,
                mail VARCHAR NOT NULL,
                CONSTRAINT utilisateur_pk PRIMARY KEY (id_utilisateur)
);


ALTER SEQUENCE public.utilisateur_id_utilisateur_seq OWNED BY public.utilisateur.id_utilisateur;

CREATE SEQUENCE public.pret_id_pret_seq;

CREATE TABLE public.pret (
                id_pret INTEGER NOT NULL DEFAULT nextval('public.pret_id_pret_seq'),
                date_debut DATE NOT NULL,
                date_fin DATE NOT NULL,
                etat VARCHAR NOT NULL,
                prolongation BOOLEAN NOT NULL,
                id_utilisateur INTEGER NOT NULL,
                id_livre INTEGER NOT NULL,
                CONSTRAINT pret_pk PRIMARY KEY (id_pret)
);


ALTER SEQUENCE public.pret_id_pret_seq OWNED BY public.pret.id_pret;

ALTER TABLE public.pret ADD CONSTRAINT livre_pret_fk
FOREIGN KEY (id_livre)
REFERENCES public.livre (id_livre)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.pret ADD CONSTRAINT user_pret_fk
FOREIGN KEY (id_utilisateur)
REFERENCES public.utilisateur (id_utilisateur)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;
