# Améliorez le système d'information de la bibliothèque

### Ajout de nouvelles fonctionnalités pour cette application

### Déploiement de l'application avec Docker :

* Créer le fichier datasource.properties :

url=jdbc:postgresql://localhost:5432/db_library_reservations
driverClassName=org.postgresql.Driver
username=postgres
password=innelec

* Créer le fichier application.properties pour le batch :

spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=terragef@gmail.com	
spring.mail.password=Innelec_27
spring.mail.protocol=smtp
spring.mail.test-connection=false
spring.mail.default-encoding=UTF-8

#mail properties
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true

spring.datasource.url=jdbc:postgresql://localhost:5432/db_library_reservations
spring.main.allow-bean-definition-overriding=true

* Démarrage de Docker et de la base de données :

sudo service docker start (daemon de Linux)
sudo docker-compose f docker-compose.yml up
docker exec -it "numéro du container" psql U postgres db_library_reservations
