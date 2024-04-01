## Commandes Docker sur Windows

### Gestion des conteneurs :

- `docker ps` : Affiche la liste des conteneurs en cours d'exécution.
  
- `docker ps -a` : Affiche tous les conteneurs, y compris ceux qui sont arrêtés.
  
- `docker run <Image>` : Lance un nouveau conteneur à partir de l'image spécifiée.
  
- `docker start <ContainerID>` : Démarre un conteneur arrêté.
  
- `docker stop <ContainerID>` : Arrête un conteneur en cours d'exécution.

### Gestion des images :

- `docker images` : Affiche la liste des images Docker téléchargées localement.
  
- `docker pull <Image>` : Télécharge une image Docker à partir d'un registre.
  
- `docker rmi <Image>` : Supprime une image Docker localement.
  
- `docker tag <SourceImage> <TargetImage>` : Ajoute une étiquette à une image Docker.

### Gestion des volumes :

- `docker volume ls` : Affiche la liste des volumes Docker.
  
- `docker volume create <VolumeName>` : Crée un nouveau volume Docker.
  
- `docker volume rm <VolumeName>` : Supprime un volume Docker.

### Gestion des réseaux :

- `docker network ls` : Affiche la liste des réseaux Docker.
  
- `docker network create <NetworkName>` : Crée un nouveau réseau Docker.
  
- `docker network rm <NetworkName>` : Supprime un réseau Docker.

### Autres commandes utiles :

- `docker info` : Affiche des informations sur le système Docker.
  
- `docker version` : Affiche la version de Docker installée.
  
- `docker inspect <Object>` : Affiche des détails sur un objet Docker spécifique (conteneur, image, volume, réseau, etc.).
  
- `docker exec <ContainerID> <Command>` : Exécute une commande à l'intérieur d'un conteneur en cours d'exécution.
