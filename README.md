Cette application est un système d'information d'une bibliothèque d'une grande ville.

Cette application est destinée aux usagers pour rechercher des livres et voir le nombre d'exemplaires disponibles, de suivre leurs prêts en cours et de pouvoir prolonger le prêt d'un ouvrage qu'une seule fois.



*Configuration du serveur Tomcat :
La configuration du serveur s'effectue dans l'IDE Eclipse ; Configuration du path ; Configuration du Server Runtime Environnement : Apache Tomcat v8.5 et récupération du fichier d'installation Tomcat à la racine du disque dur de l'ordinateur. Le serveur est déployé en local sur le port http://localhost:8080.

*Déploiement de l'application :
Compilation des sources du projet avec la commande en console mvn compile. Génération d'un fichier WAR pour le déploiement de l'application web. Ajout du plugin maven-war-plugin dans le pom.xml parent du projet. On pourra réaliser un export pour créer un fichier WAR sous l'IDE Eclipse ou packager en ligne de commande dans la console : mvn package. Les codes source de l'application se situent pour chaques modules dans src/main/java.

*La base de données nommée db_library est stockée sur le serveur pgadminIII. 
URL : jdbc:postgresql://localhost:5432/db_library

*Le web service utilise le serveur GlassFish pour le déploiement des différents services, 
accessible avec l'URL : http://localhost:4848

*Module batch : fichier jar : library-batch-1.0-SNAPSHOT.jar
Le batch envoie un mail de relance tous les jours à l'utilisateur qui n'a pas rendu le livre à temps.
