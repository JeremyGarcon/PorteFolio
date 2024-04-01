


Le Protocole OSPF(Open Shortest Path First) : 

![[reseau-modele-osi-infographie.webp]]
Le protocole OSPF est protocole de couche 3.




Topologie avec Adressage dynamique OSPF : 

	![[Pasted image 20231127202601.png]]

![[Pasted image 20231127204820.png]]
![[Pasted image 20231127205718.png]]
Routeur : ABR (Area Border Router), (R4).

Routeur : ASBR (Autonomous System Broder Routers), (R1 et R7).

Autre routeur : routeur appartenant as un seule air OSPF.

Limite de routeur par Air OSPF = 15 

![[Pasted image 20231127205312.png]]

Base de donné OSPF : 

LSA ( Link state Advertisment)

LSDB (Link State DataBase)

Détermination des route à prendre via à l'algorithme de Dijlstra

Caractéristique principale du protocole : 

- **Hiérarchie :** OSPF utilise une structure hiérarchique avec des zones pour simplifier la gestion des grands réseaux
- **Calcul SPF :** L'algorithme SPF est utilisé pour déterminer les chemins les plus courts.
- **Mise à Jour Dynamique :** OSPF réagit rapidement aux changements de topologie en mettant à jour les informations de routage en temps réel.
- **Sécurité :** OSPF prend en charge l'authentification pour garantir la sécurité des échanges entre les routeurs OSPF.
- optimisation des ressources avec le masque inversé.


