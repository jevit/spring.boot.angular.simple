# Spring boot + Angular
##Serveur - Java
spring-boot:run

##Client - Angular 
installer npm =
sudo apt-get install npm

installer angular-cli =
sudo npm install -g @angular/cli@latest

Générer la structure de l'application Angular =
ng new angularclient

Démarrer le serveur  = 
ng serve --open

#Docker
docker build -t ng-notes .

docker run -p 4200:80 ng-notes


#Références : 
https://www.baeldung.com/spring-boot-angular-web 