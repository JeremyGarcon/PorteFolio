-Table des matières :

## Découvrez les terminaux Linux:

### Partie histoire:

Dans la grande majorité des cas, les serveurs Linux que vous allez administrer sont dépourvus d'interfaces graphiques, car elles ne sont pas nécessaires pour exploiter les services hébergés sur ces machines. Pour interagir avec le système et le matériel, l'administrateur Linux utilise alors un **terminal**. 

Mais figurez-vous que, dans les années 60-70, un ordinateur occupait l'espace d'une pièce entière :

### Appréhendez la virtualisation des terminaux de commande.

Le protocole VNC ([**Virtual Network Computing**](https://openclassrooms.com/fr/courses/1733046-prenez-le-controle-a-distance-dun-poste-linux-windows-avec-vnc)) permet notamment de prendre la main à distance sur un ordinateur. C’est un protocole de terminal virtuel graphique.

Le protocole RDP ([**Remote Desktop Protocol**](https://fr.wikipedia.org/wiki/Remote_Desktop_Protocol)) qui permet de se connecter sur des serveurs Windows Terminal Serveur en est un également.

**Définition d’une console sur linux :** La console sous Linux est un périphérique gérant le clavier et l’écran de l’ordinateur et propose d’interagir avec l’utilisateur en terminal en mode texte.

**Définition d’un terminale :**permet juste de rentré des commande en ligne de commande.

À vrai dire, la console de Linux propose 7 terminaux en mode texte, appelés aussi les **terminaux physiques**. Ils sont directement sur le clavier branché à l'ordinateur et disponibles à partir des combinaisons de touches : “CTRL+ALT+F1” ; “CTRL+ALT+F2” ; … jusqu’à “CTRL+ALT+F7”.

## **Découvrez les principaux émulateurs de terminal.**

**Putty sur Windows.**

**MacOS sur mac.**

**Et Extern pour Linux.**

  

  

## **Comprenez les interactions entre les terminaux virtuels et les hyperviseurs de type 1 et 2.**

|   |   |
|---|---|
|![[Pasted image 20231123235156.png]]|1.    L'une étant la console, elle “capture” votre souris lorsque vous cliquez dedans, et vous êtes virtuellement considéré devant le serveur Linux avec le clavier et l'écran géré par la console et 7 terminaux physiques à votre disposition.<br><br>Exemple : ESXI|
|![[Pasted image 20231123235217.png]]|2.    L'autre est l'émulateur de terminal, intégré nativement dans l'environnement graphique de votre poste de travail, qui ne “capture” pas votre souris, mais permet au contraire le copier/coller etc.<br><br>     Exemple : Virtuel BOX|

## **Initiez-vous au shell, l’interpréteur de commandes.**

|   |
|---|
|Le libellé shell, signifiant “coquille”, désigne probablement la première couche logicielle entourant le noyau, comme une coquille de noix entoure sa noix.|

**Fonctionnalité du shell:** Le rôle principal du shell est d'exécuter les commandes saisies par l'administrateur lui permettant d'effectuer des appels systèmes vers le noyau.

![[Pasted image 20231123235245.png]]
### Partie histoire :

IL existe plusieurs : Shell :

·         le **C Shell**, qui dispose d'un langage très proche du langage C (le langage natif des systèmes Unix/Linux) et donc très populaire pour cette raison ;

·         le **KornShell**, développé plus tard, début des années 80, apporte de son côté une amélioration du C Shell avec une intégration d'autres langages comme le Perl, le TCL par exemple, le support de tableaux associatifs, etc.

## **Découvrez Bash, le shell standard de Linux($SHELL).**

![[Pasted image 20231123235327.png]]

La variable **$SHELL** détermine sur qu’elle interpréteur de commande vous utiliser actuellement.

![[Pasted image 20231123235418.png]]

On peut voir le contenue de cet variable avec la commande **echo $SHELL****.**

## **Pourquoi utiliser le Bash?**

Car le Bash rassemble l’ensemble de ses fonctionnalité ci-dessous des ancien Shell anciennement utiliser couramment.

![[Pasted image 20231123235451.png]]

## **Manipuler le prompt et consultez la variables(PS1 ).**

Exemple de prompt:

![[Pasted image 20231123235547.png]]

Seb = le nom d’utilisateur

@ = séparateur

Thor = nom du serveur

:= séparateur

$ = utilisateur sans privilège

utilisateur avec privilège = #

Variable qui détermine le prompt ce nomme «PS1»

- Commande pour consulter une variable  d'environnement : `echo $PS1`

- Commande pour modifier la variable : `export $PS1="Bonjour"`

`écho` permet de consulter le contenue d’une variable.

La commande export PS1= « \u-\h :$»,(- est un séparateur) permet de modifier cet variable, mais pas de la sauvegarder.)

-Pour la sauvegarder il faut modifier le fichier suivant :bahsrc.



## **Listez le contenu d’un répertoire avec la commande «(ls).**

Commande :Ls : pour afficher le contenue d’un répertoire.

**Syntaxe: Commande(ls) + Argument + répertoire cible.**

![[Pasted image 20231123235619.png]]

## **Comprenez les différents types de commandes Linux.**

![[Pasted image 20231123235635.png]]

### Commande `type` :

permet d’obtenir des information sur une commande. Par exemple si la commande est une commande interne ou externe a bash, qu’elle soit d’origine d’un fichier exécutable par exemple.

### La variable `PATH` :

L’ensemble des commandes sont référencer dans la variable PATH, de ce faite quand on tape echo PATH,

**exemple concret :**

On voie ou son stocker l’ensemble des commandes exécutables. Pour ajouter une commande exécutable il faut ajouter l’exécutable dans la variable :  `export PATH="/chemin/vers/mon_repertoire:$PATH"`

Par exemple si on copie le fichier exécutable d’une commande pour la mettre dans un autre répertoire, on ne pourra l’exécuter seulement si on indique ou ce site le fichier exe de cet même commande copié. On pourra l’exécuter.

### **_Consultez la documentation des commandes sous Linux fonction de la nature de la commande :_**

### Commande interne:

La Commande help: Taper help permet d’obtenir sur toute  les commande interne du Shell, et taper `help + Commande en question d’obtenir des informations sur une commande en questions`.

### Commande externe:

La Commande `–-help` :

Taper `--help` permet d’obtenir des informations sur toute  les commandes externe du Shell, et taper Commande en question + --help  d’obtenir des informations sur une commande en questions.

### Manuel Linux:

La Commande `man +Commande en question Taper `man permet d’obtenir des informations sur toute  les commandes du Manuel Unix ou taper.
de manière général le manuel offre plus de détaille sur le fonctionnement de la commande.
## **Comprenez l’arborescence Linux.**

[**La fondation Linux**](https://www.linuxfoundation.org/) est l'organisme responsable du maintien de la norme définissant l'arborescence des systèmes Unix/Linux. Cette norme est appelée [**FHS pour Filesystem Hierarchy Standard et est disponible sous plusieurs formats**](http://refspecs.linuxfoundation.org/fhs.shtml). 

-Ce document référence l'objectif primaire de tous les répertoires standard du système Linux pour faciliter leur exploitation. L’avantage de cet norme c’est qu’elle uniformise l’arborescence commune et connue pour déployer, installer ou configurer les programmes qu'ils éditent. Sur toute les distribution Linux.

### Les différent type de répertoire sous Linux:
!!!! Important !!!!
`shareable` : Les répertoires contenant des informations stockées sur un équipement mais utilisées par d'autres équipements seront identifiés par le mot-clé "shareable". Exemple : `/home`

`unshareable` : Les répertoires contenant des fichiers qui ne peuvent pas ou ne doivent pas être partagés entre plusieurs équipements seront marqués "unshareable" (non partageables en français).

Exemple : `/boot`

`Static` : Les répertoires contenant des données qui ne peuvent pas changer d'elles-mêmes, ou sans l'intervention de l'administrateur, avec nécessité d'une élévation de privilèges. Exemple :  `/boot /stc`

`variable` : a l’inverse d’un répertoire static le répertoire variable peut être modifier sans passer par le root.

## **Exemple de répertoire à connaître.**

`/home` : contient les fichier des utilisateur, ce répertoire n’est pas obligatoire tout dépend du contexte "`shareable`"  "`variable".

#### `/etc` qui contient traditionnellement les fichiers de configuration du système et des services.

 répertoire de type :`static`

`/root` :est créé pour stocker “les données personnelles de l'administrateur”, mais il n'est pas indispensable pour faire démarrer le système et l'exploiter. Et stocker dans ce répertoire des données critiques pour le système est effectivement une erreur.

`/boot` :  qui contient notamment le noyau Linux exploité sur l'équipement. "unshareable".

### **_Le répertoire `/usr` :_**

 répertoire de type : `shareable` et `static`,

Ce répertoire est devenu avec le temps une arborescence majeure des distributions Linux. Il contient lui-même des répertoires bin et sbin dans lesquels se situent également des commandes !

![[Pasted image 20231123235712.png]]

`/usr /local/bin` :Ce dernier de la famille va contenir tous les binaires qui sont compilés manuellement par l'administrateur après l'installation du système.

### **_Le répertoire `/var`:_**

L'objectif de ce répertoire est simple : stocker toutes les informations utilisateurs, administrateurs et systèmes variables.

Normalement, avec une utilisation classique de /var,/usr devrait pouvoir être utilisé en lecture seule ! Ce qui est un gage de sécurité très important. 

![[Pasted image 20231123235731.png]]

![[Pasted image 20231123235742.png]]

## **Identifiez le rôle des systèmes de fichiers virtuels de Linux (fichier virtuels).**

-Traditionnellement, il existe aussi sur les systèmes Linux des arborescences un peu particulières. Elles correspondent à une organisation des informations maintenues en temps réel par le noyau Linux, sous la forme d'une arborescence.

Il est ainsi possible de changer certaines variables du noyau, et donc certains comportements du système global en modifiant le contenu de ces fichiers “virtuels” placés dans ces arborescences.

Ces arborescences n'existent pas sur périphérique physique de type bloc, et l'analyse indépendante du disque d'un système Linux ne les fera pas apparaître. Elles existent uniquement parce que le noyau vous les propose gracieusement.

### **_Le répertoire `/proc` :_**

Cette arborescence contient toutes les informations concernant les processus  ! Et il y en a beaucoup…

On peut consulter tout ses processus avec la commande `ls /proc`.

On peut également voir ses processus avec la commande `ps` ou `top`.

Les processus sont organiser par chiffre décimal(PID) en comment par le premier processus lancer par le noyaux.

![[Pasted image 20231124000323.png]]
![[Pasted image 20231124000329.png]]
On peut voir le premier processus lancer par le noyau ce nomme `systemd` .

Dans le répertoire `/proc/cpuinfo` contient des informations maintenue par le noyau (en cours d’exécution) utiliser la commande cat `/proc/cpuinfo``.

(la commande cat permet de consulter un fichier texte en lecture seule).
![[Pasted image 20231124000434.png]]

-On peut constater que ce fichier contient des informations sur le CPU.

Mais à contrario si on fait `file /proc/cpuinfo`  on castatere que le fichier est vide (exemple de fichier virtuel) et ces fichiers étant virtuels, ils ont une taille de 0.  Ce qui fait son stocker dans RAM et non sur de la mémoire morte.

![[Pasted image 20231124000450.png]]

![[Pasted image 20231124000504.png]]

### Le répertoire `/SYS` :

![[Pasted image 20231124000514.png]]
![[Pasted image 20231124000521.png]]
### **_Visualiser des fichier :_**

Etant donné que Linux est un système d'exploitation dont la conception initiale est très orientée fichier, vous allez passer votre temps à consulter ces fichiers pour administrer votre serveur.

### Affichez le contenu des fichiers:

![[Pasted image 20231124000535.png]]

`cat` est une  commande externe au SHELL, elle permet de consulter un fichier en lecture seule.

![[Pasted image 20231124000548.png]]

![[Pasted image 20231124000557.png]]

L’argument `-n` permet de numéroter les ligne d’un fichier `/home/adminprin/.bashrc` permet de d’appliquer cet commande a un fichier ciblé.

`Rouge : la commande`,   `bleu : un argument`

Une commande est l’exécution d’un script, un argument permet influencer le comportement d’une commande. Fait la commande `man cat` pour connaître l’ensemble des arguments associé a cet commande.

`Less` est une  commande externe au SHELL, elle permet de consulter un fichier en lecture seule.

A la  différence prêt qu’elle permet d’afficher de manière pratique pour les long fichier

par exemple après avoir rentré votre commande on passer les page du ficher en appuyant sur la touche `espace` et revenir a la page précédente en appuyant sur la `touche B`

et également afficher le numéro des lignes avec -N tout après avoir rentré la commande

on peut aussi faire des recherche directement dans le fichier sans taper une nouvel commande exemple /le mot rechercher et naviguer pour voir les résultat avec n et N  .

Et `q` pour quitter.  ![[Pasted image 20231124000617.png]]

On peut aussi sité la commande more pour consulter un ficher, mais elle est superflue.

## **Utilisez les canaux de Linux :**
![[Pasted image 20231124000640.png]]
![[Pasted image 20231124000713.png]]
**_Pour comprendre les redirection de flux regarder la vidéo suivant :_**

https://openclassrooms.com/fr/courses/7274161-administrez-un-systeme-linux/7529326-visualisez-des-fichiers

## Filtrez le contenu dans l'arborescent

Commande `grep` pour filtrer le contenue d’un fichier. 

`grep +argument facultative + caractère rechercher  + arborescence du fichier de recherche`

Argument facultative:

![[Pasted image 20231124000743.png]]-o afficher uniquement les caractère rechercher et non la ligne correspondante

Commande pratique, pour compter le nombre de résultat de la recherche:

 `grep -lr  jeremy /répertoire de la recherche | wc -l ) wc est un outil de comptage`

Pour rechercher un fichier spécifique avec la commande `find`, utilisez la syntaxe suivante :

```bash
find [chemin] [options] -name "nom_du_fichier"
```

- `[chemin]` : L'arborescence où vous souhaitez démarrer la recherche.
- `[options]` : Des options facultatives pour spécifier des critères de recherche supplémentaires.
- `"nom_du_fichier"` : Le nom du fichier que vous recherchez. Vous pouvez utiliser des caractères génériques pour des correspondances partielles.

Exemple :

1. Recherche de tous les fichiers `exemple.txt` dans le répertoire `/home/utilisateur` et ses sous-répertoires :
```bash
find /home/utilisateur -name "exemple.txt"
```

2. Recherche de fichiers `*.log` modifiés il y a moins de 7 jours dans tout le système :
```bash
find / -name "*.log" -mtime -7
```

3. Recherche de fichiers `*.mp3` de plus de 10 Mo dans le répertoire `/musique` :
```bash
find /musique -name "*.mp3" -size +10M
```

4. Recherche de fichiers `*.jpg` appartenant à l'utilisateur `utilisateur1` dans le répertoire `/images` :
```bash
find /images -name "*.jpg" -user utilisateur1
```

5. Recherche de fichiers `*.conf` dans le répertoire `/etc` avec une profondeur maximale de 2 niveaux :
```bash
find /etc -maxdepth 2 -name "*.conf"
```

6. Recherche de fichiers `*.txt` ou `*.jpg` dans le répertoire `/documents` :
```bash
find /documents \( -name "*.txt" -o -name "*.jpg" \)
```

7. Suppression de tous les fichiers `*.tmp` dans le répertoire `/tmp` :
```bash
find /tmp -name "*.tmp" -delete
```

8. Recherche de fichiers de plus de 1 Mo modifiés il y a moins de 30 jours :
```bash
find / -size +1M -mtime -30
```

9. Recherche de fichiers `*.txt` contenant le texte "motif" dans le contenu :
```bash
find / -name "*.txt" -exec grep -l "motif" {} \;
```

Vous pouvez également combiner plusieurs options pour affiner votre recherche selon vos besoins.

## **Les base de L’outil SED :**

`Syntaxe : sed [OPTIONS] 'expression' [fichier(s)]`

définition: Bien sûr ! La commande sed (éditeur de flux) est un outil puissant utilisé pour manipuler et transformer du texte dans les systèmes d'exploitation Linux et Unix. Elle fonctionne en appliquant des expressions régulières à un flux de texte d'entrée, puis effectue des opérations de remplacement, de suppression, de substitution ou d'autres transformations en fonction des motifs spécifiés.

Exemple avec l’argument `-i`:

il permet de modifier le fichier sans utiliser d’éditeur de texte.

sed +argument facultative(ex -i) + ‘s/caractère à modifier/caractère modifier/’ + /fichier cible

![[Pasted image 20231124000802.png]]

ce qui rend cet outil si puissant et flexible c’est qu’il s’appuis sur ce qu’on appelle les exprésion regulière :

![[Pasted image 20231124000815.png]]

## Le pipe:

Le principe est simple : il s'agit ici de rediriger un flux, en sortie d'une commande, vers le canal d'entrée de la commande suivante. Et ainsi de suite.
![[Pasted image 20231124000834.png]]

Il est symboliser par `|`.

## La Commande `sort` :

La  commande `sort` permet de trier rapidement les lignes d'un fichier ou d'une entrée en ordre alphabétique ou numérique, avec des options pour inverser l'ordre, supprimer les doublons et spécifier des clés de tri. C'est un outil essentiel pour organiser et analyser les données textuelles de manière efficace.

Exemple :`sort exemple.txt`


I = indifférence entre les minuscule et les majuscule

## La commande `cut` :

![[Pasted image 20231124000847.png]]
Exemple : `cut -c 1-2 donnees.txt`
![[Pasted image 20231124155213.png]]


## Éditez et supprimez des fichiers(vim) :

vim est un éditeur de texte permettant de modifier un fichier texte ou bien de scripte.

Cet éditeur a 2 mode un mode Commande qui permet de lancer le programme

et l’aitre le mode saisie qui permet d’interagir avec le ficher non par le bash mais par vi le processus.

![[Pasted image 20231124001118.png]]
## Utilisez `emacs`(les base), l’autre éditeur phare de Linux :

emacs est éditeur de texte plus utiliser pour les fichier de grand volume souvant utiliser par les DEV qui s’en servant comme iDE.

Le fonctionnement d’emacs s'appuie également sur un jeu de commandes, mais les combinaisons de touches sont toujours associées aux touches CTRL et ALT du clavier, permettant ainsi d'utiliser les touches classiques alphanumériques pour à la fois saisir du texte et déclencher des commandes. 

Liste les commande de base de emacs.

![[Pasted image 20231124001201.png]]  

**On peut ajouter**  CTRL x CTRL Enregistre les éventuelles modifications et quitte le programme.

## Utilisez `nano`, l’autre éditeur phare de Linux :

nano est éditeur de texte qui viens de Windows

il est moins complexe que ses copains vi par exemple surtout muni d’une interface en bas de la page une voie la commande lancé.
Exemple : `nano + fichier cible`

Raccourcie : 
![[Pasted image 20231126181621.png]]
`ctrl + 1 : permet d'aller la fin de la ligne.`
`ctrl +7 : permet d'aller du début de la ligne.`
`ctrl + 9 :  permet d'aller au début du document.`
`ctrl + 3 : permet d'aller à la fin du document.`
`ctrl + k permet de supprimer la ligne `
`ctrl + b pour réguler le curseur`
`ctrl + f pour avancer le curseur`
`ctrl + w pour chercher`
## Les Inodes sur Linux( à compléter):

## Gérez les droits sur les fichiers et des répertoire avec chmod :

Linux fonctionne avec uniquement des fichier et des répertoire.

Par conséquent il primordiale de bien administrer les droit d’accès, d’écriture et d’exécution. Et l’utilisateur le groupe et les autre(comprend autre système et tout les autre utilisateur).

R= read

w= write

X = exe

-----------------

u= user

g = group

o = other

![[Pasted image 20231124001341.png]]

### La commande Chmod :

pour voir les droit des fichier dans un repertoire il faut utiliser la commande ls -l :

exemple :

![[Pasted image 20231124001352.png]]
bleu = utilisateur
rouge = groupe
jaune = autre
fichier1 = l’utilisateur peut écrire et lire. Le groupe seulement lire le fichier et les autre on aucun droit sur le fichier


### les différente façon, d’utiliser la commande chmod 1er méthode :

![[Pasted image 20231124001420.png]]On peut uiliser les caractère présenter plus haut pour modifier les droit des utilisateur des groupe et des autre

de manière indépendante.

On peut également atribuer un droit a l’utilisateur au groupe et aux autre en une seule commande par exemple

chmod +x fichier ou bien enlever un droit a l’utilisateur au groupe et aux autre en fessant  chmod -x fichier cible

### 2ème méthode en utilisant les chiffres décimal compris en 0 et 7:

![[Pasted image 20231124001433.png]]

0 = aucun droit = --- , 7 = rwx.

Donc en utilisant la 2 ème méthode on peut attribuer les droit de cet façon par exemple :

chmod 7 4 1 fichier cible

le premier chiffre correspond au droit de l’utilisateur(u=rwx) le 2ème au groupe de l’utilisateur(r=4 et le dernier aux autre(x=1).

## Changez le propriétaire d’un fichier sous Linux(chown et chrp):

Ces commandes permet de modifier les utilisateurs prolétaires et du groupe au qu’elle est rattacher un fichier ou bien un répertoire.
### `chown` (Change Owner) permet de changer le propriétaire et le groupe d'un fichier ou d'un répertoire :

La syntaxe générale de `chown` est la suivante :


`chown [argument] utilisateur:groupe fichier_ou_repertoire`

- `utilisateur` : Le nouvel utilisateur propriétaire du fichier ou du répertoire.
- `groupe` : Le nouvel utilisateur du groupe associé au fichier ou au répertoire.
- `fichier_ou_repertoire` : Le chemin du fichier ou du répertoire dont vous souhaitez changer le propriétaire.
`argument -R` cet argument permet d’appliquer cet commande dans tout les sous répertoire présent par rapport a l’origine cible de la commande.

Exemple : 
permet de Changer le propriétaire : 
`chown nouveau_proprietaire fichier.txt`

permet de changer le propriétaire et le groupe :
`chown nouveau_proprietaire:nouveau_groupe fichier.txt`

permet d'utiliser la récursivité   : 
`chown -R nouveau_proprietaire:nouveau_groupe /chemin/vers/repertoire`
## `chgrp`, permet de changer de groupe  d'un fichier ou d'un répertoire : 

La syntaxe générale de `chgrp` est la suivante :

`chgrp [OPTIONS] nouveau_groupe fichier_ou_repertoire`

Changer le groupe d'un fichier :

`chgrp nouveau_groupe fichier.txt`

Changer récursivement le groupe d'un répertoire et de son contenu :

`chgrp -R nouveau_groupe /chemin/vers/repertoire`




## Commande pour la gestion des groupes sous linux :

- Créer un groupe
`sudo groupadd nom_du_groupe`

- Afficher les informations sur un groupe
`groupinfo nom_du_groupe`

- Ajouter un utilisateur à un groupe
`sudo usermod -aG nom_du_groupe nom_utilisateur`
- Assurez-vous de déconnecter et de vous reconnecter pour que les modifications prennent effet

- Retirer un utilisateur d'un groupe
`sudo deluser nom_utilisateur nom_du_groupe`

- Afficher les groupes auxquels un utilisateur appartient
`groups nom_utilisateur`

- Changer le groupe propriétaire d'un fichier ou répertoire
`sudo chown :nom_du_groupe fichier_ou_repertoire`

- Afficher tous les groupes existants
`cat /etc/group`

- Ajouter des utilisateurs existants à un groupe
`sudo gpasswd -a nom_utilisateur nom_du_groupe`

- Supprimer un utilisateur d'un groupe
`sudo gpasswd -d nom_utilisateur nom_du_groupe`

- Modifier le nom d'un groupe
`sudo groupmod -n nouveau_nom_du_groupe ancien_nom_du_groupe`


### _Manipulez les droits spéciaux sous Linux:_

il existe 3 droit spéciaux : SetUID bit , SetGID et le Sticky bit.

## Attribution des droits spéciaux :

SetUID bit : chmod u+s fichier_executable

SetGID : chmod g+s repertoire

Sticky bit : chmod +t repertoire

Sticky bit est un droit qui permet a tout le monde de modifier un fichier mais seule le propriétaire peut le supprimer.

SetGID et SetUID est une élévation  des privilège par rapport au compte propriétaire du fichier ou bien du répertoire en   question. 

la différence entre ses 2 droit spéciaux c'est que le SetUID prend eu compte une élévation des privilège sur le propriétaire d'un fichier.
et  SetGID prend en compte l'élévation de privilège au niveaux du groupe du fichier. 

si les droit spéciaux sont mis sur un répertoire se sont les fichier crée dans ce répertoires qui hériterons 

## (Bonus)Alias de Commande :

  
Les alias sur Ubuntu (et dans les systèmes basés sur Linux en général) sont des raccourcis personnalisés pour les commandes du terminal. Ils vous permettent de créer des noms plus courts ou plus intuitifs pour exécuter des commandes fréquemment utilisées ou complexes.

Voici un résumé rapide des alias sur Ubuntu :

•      Les alias sont définis dans des fichiers de configuration tels que `~/.bashrc` ou `~/.bash_aliases` pour chaque utilisateur. Ils peuvent également être définis dans des fichiers système tels que `/etc/bash.bashrc`

•      Les alias sont créés en utilisant la syntaxe alias `nom_alias='commande'`. Par exemple, `alias ll='ls -alF`' crée un alias ll pour exécuter la commande `ls -alF` qui affiche les fichiers et répertoires avec des détails. 

•      Les alias sont activés dans un terminal une fois que les fichiers de configuration correspondants sont chargés. Vous pouvez recharger les configurations en utilisant la commande `source ~/.bashrc` (ou le fichier de configuration approprié) ou en ouvrant un nouveau terminal.

•      Les alias peuvent inclure des options, des paramètres et des séquences de commandes plus complexes. Par exemple, vous pouvez créer un alias pour effectuer plusieurs actions en une seule commande.

•      Les alias peuvent être organisés dans des fichiers séparés tels que `~/.bash_aliases` pour une meilleure gestion et une plus grande clarté.

•      Les alias peuvent être utilisés pour personnaliser votre expérience du terminal, simplifier les commandes fréquemment utilisées et augmenter votre productivité.

Il est important de noter que les alias sont spécifiques à chaque utilisateur et ne sont pas partagés avec d'autres utilisateurs du système.

J'espère que cela vous donne un aperçu rapide des alias sur Ubuntu. N'hésitez pas à poser d'autres questions si vous en avez.


##  Configurez les cartes réseaux sous linux


La configuration du réseau sous Linux est un aspect qui varie fortement entre les distributions. En effet, chaque distribution aura tendance à installer les outils qui lui sont propres pour gérer le réseau. Vous pourrez notamment trouver **NetworkManager**, **Connection-Manager**, ou encore `**dhcpcd**`.

ou bien Net-tools et iproute2 sur Ubuntu LTS.

### configuration du nom réseaux du serveur :

Le nom réseau d'un serveur Linux (aussi appelé "**system hostname**") sert d'identifiant par défaut de la machine pour tous les services et applications qui s'exécutent en local et pour beaucoup de services et d'applications lorsque ceux-ci communiquent sur le réseau.

Si tous les serveurs de logs ont le même nom réseau (par exemple `**localhost**` qui est proposé pendant le processus d'installation), difficile de reconnaître l'origine des fichiers communiqués.

#### les différent façon de voir le nom réseaux d'une machine linux : 

- Il y a 2 fichier fichier responsable de la nomination du nom réseaux sous linux : 

`cat /proc/sys/kernel/hostname`
ou `cat /etc/hostname`

La différance entre ses 2 fichiers : c'est le fichier `/proc/sys/kernel/hostname`, 
est un fichier virtuel, initio au démarrage par le fichier non virtuels : `/etc/hostname`



### **Détectez les interfaces réseaux de votre système**


 `dmesg`signifie "display message" permet d'afficher les messages du noyau :

- pendant le processus de démarrage.
- et notamment lorsque ce dernier charge les pilotes des périphériques qui vérifient si un matériel connecté leur est compatible.
les lien symbolique  des carte réseaux détecter ce trouve dans le répertoire  `sys/class/net`


## Packet de configuration réseaux 

Toutes les configurations de réseau sur les cartes gérées par la commande **`ip`** sont dynamiques. Elles seront donc perdues entre chaque "reboot" du serveur.

tools nécessaire : `net-tools`
`ou iproute2`


`net Tools` est l'enciens pakcet très utiliser  les Année 2009 maintenant pour son manque d'optimisation on utilise `iproutte2` qui un peu comme son successeur. 


net Tools :` ifconfig -a` permet de voir la configuration des interface up. 

iproute2 : `ip` permet également de voir la configuration réseaux. 
`ip link` show permet également de faire mais de manière plus synthétiser. 
sans leurs configuration. 

## Liste des commandes de base de iproute2 : 

- Afficher toutes les interfaces réseau
`ip link show`

- Activer une interface
`ip link set dev eth0 up`

- Désactiver une interface
`ip link set dev eth0 down`

- Afficher les adresses IP de toutes les interfaces
`ip addr show`

- Ajouter une adresse IP à une interface
`ip addr add 192.168.1.2/24 dev eth0`

- Supprimer une adresse IP d'une interface
`ip addr del 192.168.1.2/24 dev eth0`

## Liste des commandes de routage de  iproute2 :

- Afficher les règles de routage
`ip rule show`


-  Ajouter une route
`ip route add 192.168.2.0/24 via 192.168.1.1 dev eth0`

- Supprimer une route
`ip route del 192.168.2.0/24 via 192.168.1.1 dev eth0`

- Ajouter une règle de routage sur une table précise 
`ip rule add from 192.168.1.2/32 table 1`

- Supprimer une règle de routage une table précise 
`ip rule del from 192.168.1.2/32 table 1`

- Ajouter une route sur une table de routage personnalisée
`ip route add 192.168.1.0/24 via 10.0.0.1 table 100`

- Afficher la table de routage d'une table personnalisée
`ip route show table 100`

- Afficher les règles de routage
`ip rule show`

-  Supprimer une règle de routage
`ip rule del from 192.168.2.2 table 100`
ou 
`ip route del 192.168.1.0/24 via 10.0.0.1 table 100`

- Vider toutes les tables de routage et les règles
`ip route flush cache` `supprimer les information du cache de route `
`ip route flush table all` `suprime toute les règle de routage de tout les tables`
`ip rule flush`


### Commande ip route ARP 

- Afficher la table ARP
`ip neigh show`

- Ajouter une entrée ARP statique (nud permanent signifie qu'elle ne ce suprimera pas si l'ôte n'est pas assecible) 

`ip neigh add 192.168.1.2 lladdr 00:11:22:33:44:55 dev eth0 nud permanent`

- Ajouter une entrée ARP

`ip neigh add 192.168.1.2 lladdr 00:11:22:33:44:55 dev eth0`

- Supprimer une entrée ARP
`ip neigh del 192.168.1.2 dev eth0`




## Configurer une table de  routage personnalisée avec iproute2

- Configurer une route personnalisée (syntaxe)
ip route add [destination] via [passerelle] table [table_number]

- Exemple :
ip route add 10.0.0.0/24 via 192.168.1.1 table 100

- Créer une règle pour utiliser la table personnalisée
sudo ip rule add from [adresse_source] table [table_number]

- Exemple :
sudo ip rule add from 192.168.2.2 table 100

- Vérifier les routes de la table personnalisée
ip route show table [table_number]

- Exemple :
ip route show table 100

- Vérifier les règles de routage
ip rule show

- Créer un script d'initialisation pour rendre les changements persistants
sudo nano /etc/network/if-up.d/custom-route

- Ajouter au script :
#!/bin/bash
ip rule add from 192.168.2.2 table 100

- Rendre le script exécutable
sudo chmod +x /etc/network/if-up.d/custom-route

- Tester en activant/désactivant une interface réseau
sudo ifdown [interface]
sudo ifup [interface]

- Vérifier que la règle est toujours présente après un redémarrage
ip rule show
ip route show table 100
## Configuration réseau sur Debian (/etc/network/interfaces) 

1. Ouvrez le fichier `/etc/network/interfaces` en utilisant un éditeur de texte (par exemple, nano) :
auto [nom_de_l_interface]
iface [nom_de_l_interface] inet static
    address [adresse_IP]
    netmask [masque_de_sous-reseau]
    gateway [passerelle]
    dns-nameservers [serveurs_DNS]


- pour enregistré  et appliqué les modifications : 
`sudo systemctl restart networking`


## Configuration réseau sur Ubuntu LTS (utilisant Netplan)

`sudo nano /etc/netplan/01-network-manager-all.yaml. `


- pour configuration en DHCP : 

network:
  version: 2
  ethernets:
    eth0:
      dhcp4: true

- Pour une configuration statique(ancienne version) : 

network:
  version: 2
  renderer: networkd
  ethernets:
    nom_de_l_interface:
      addresses:
        - VOTRE_ADRESSE_IP/MASQUE_DE_SOUS_RESEAU
      gateway4: ADRESSE_IP_PASSERELLE
      nameservers:
        addresses:
          - ADRESSE_IP_DNS


- pour une  configuration statique (dernière version): 
network:
  version: 2
  renderer: networkd
  ethernets:
    enp6s0:
      addresses:
        - 192.168.1.2/24  # Remplacez par votre adresse IP statique et masque de sous-réseau
      routes:
        - to: default
          via: 192.168.1.1  # Remplacez par l'adresse IP de votre passerelle par défaut
      nameservers:
        addresses:
          - 8.8.8.8  # Remplacez par l'adresse IP de votre serveur DNS



pour appliquer les modifications : 

`sudo netplan apply`


## Explication d'une communication  SSH  

1. **Établissement de la Connexion :**
    
    - Un client initie une connexion SSH vers un serveur distant.
2. **Négociation des Algorithmes :**
    
    - Le client et le serveur négocient les algorithmes de chiffrement et d'authentification à utiliser.
3. **Authentification :**
    
    - Si l'authentification par clé SSH est utilisée, le client envoie sa clé publique au serveur.
    - Le serveur vérifie si la clé publique est autorisée dans le fichier `authorized_keys`.
4. **Échange de Clés de Session :**
    
    - Une fois l'authentification réussie, une clé de session symétrique est générée.
5. **Communication Chiffrée :**
    
    - Toute la communication ultérieure entre le client et le serveur est chiffrée à l'aide de la clé de session.
6. **Authentification par Mot de Passe (Optionnelle) :**
    
    - Si l'authentification par mot de passe est autorisée, le client peut également fournir un mot de passe.
7. **Tunnels et Transfert de Fichiers :**
    
    - SSH permet la création de tunnels sécurisés et prend en charge le transfert de fichiers sécurisé (SFTP).
8. **Sécurité et Journalisation :**
    
    - SSH offre des mécanismes de sécurité tels que la désactivation de l'accès root direct et la surveillance des journaux d'authentification.

En résumé, SSH établit une connexion sécurisée entre un client et un serveur, utilisant des clés publiques/privées(Asymétrique) pour l'authentification et chiffrant toutes les données échangées. Cela garantit une communication sûre et confidentielle sur un réseau, éliminant les risques associés à l'utilisation de protocoles non sécurisés, une l'échange faite des clé de session la communication est par défaut symétrique.


 ##  Mise en  Pratique d'une communication SSH : 

Algorithmes ssh : 
![[Pasted image 20231130093356.png]]


## Mise en pratique d'une communication SSH


Côté Serveur : 

Commande pour installer le package SSH sur Ubuntu : `apt install openssh-server`.


Commande pour voir si le ssh est installer et le status : `systemctl status ssh`.


Commande pour voir les port d'écoute du ssh : `ss -lptun | grep ssh`


Fichier responsable du paramétrage du ssh :` sudo vim /etc/ssh/sshd_config`


appliqué les potentiel modification : `sudo service ssh restart`


Côté Client : 

Sur Windows : 
Le Soft Putty prend en charge le protocole SSH mais également le Telnet, le protocole non chiffé. 
Il est disponible sur Windows : https://www.putty.org/

Sur Ubuntu : 
Côté Client :
Commande pour installer le packet client du SSH : `apt install openssh-client`
Côté Serveur
Côté Serveur pour onstaller le tools Serveur du SSH :  `apt install openssh-server`


Commande pour ce connecter à un serveur SSH en ligne de commande : `ssh nom_utilisateur@adresse_serveur`

## Configuration SSH par authentification par mot de passe : 

#### Étape 1: Autoriser l'Authentification par Mot de Passe

1. Ouvrez le fichier de configuration SSH avec un éditeur de texte.
    
    `sudo nano /etc/ssh/sshd_config`
    
2. Assurez-vous que la ligne suivante est configurée comme suit :
    
    `PasswordAuthentication yes`
    
3. Sauvegardez les modifications et redémarrez le service SSH pour appliquer les changements.
    
    `sudo service ssh restart`
    

#### Avantages de l'Authentification par Mot de Passe :

- **Facilité d'utilisation :** Les utilisateurs peuvent se connecter en fournissant simplement un mot de passe.
- **Pas besoin de clés externes :** Aucune nécessité de gérer des paires de clés publiques/privées.
- **Influence sur la Communication Symétrique/Asymétrique :** L'authentification par mot de passe n'a pas d'influence directe sur le mode de chiffrement utilisé pendant la session. Cependant, la phase initiale d'échange de clés lors de la première connexion reste asymétrique.




## Configuration SSH par authentification de clé Public : 

#### Étape 1: Générer une Paire de Clés sur le Client

1. Générez une paire de clés sur le client (si elle n'existe pas déjà).
    
    bashCopy code
    
    `ssh-keygen -t rsa -b 2048`
    

#### Étape 2: Copier la Clé Publique sur le Serveur

1. Copiez la clé publique vers le serveur.
    
    
    `ssh-copy-id utilisateur@adresse-du-serveur`
    
2. Assurez-vous que la ligne suivante est configurée comme suit dans le fichier de configuration SSH du serveur :
    
    `PasswordAuthentication no`
    
3. Sauvegardez les modifications et redémarrez le service SSH.
    
    
    `sudo service ssh restart`
    

#### Avantages de l'Authentification de Clé Publique :

- **Sécurité améliorée :** Les clés offrent une méthode d'authentification plus sécurisée que les mots de passe.
- **Pas besoin de mot de passe :** Une fois configurée, l'authentification se fait sans entrer de mot de passe.
- **Possibilité de désactiver l'authentification par mot de passe :** Vous pouvez renforcer la sécurité en désactivant complètement l'authentification par mot de passe.
- **Influence sur la Communication Symétrique/Asymétrique :** La phase initiale d'échange de clés utilise une méthode asymétrique. Cependant, une fois la clé de session établie, la communication durant la session est généralement symétrique pour des raisons de performance. L'authentification par clé publique n'affecte pas directement ce choix.


#  Transférez des fichiers par le réseaux
### Commande wget et curl 
- Commande pour télécharger un fichier ou autre via à une URL : `wget + URL`
ou `curl http://www.example.com`.


### Utilisation du protocole FTP et SFTP  sur Windows : 

lien du Client FTP Windows : https://filezilla-project.org/.

Par défaut le FTP est sur le 22 et le SFTP es sur le port 21. 

![[Pasted image 20231130162204.png]]


Entré les informations d'utilisateur ainsi que l'ip dans les différant champ si dessus. avec le port en fonction du protocole de transfert souhaité. 

-Attention les permission accordé la connexion FTP dépend des droit du système d'exploitation pour l'ensemble de l'arborescent. 

### Transférer les fichier via la commande SCP encalsuler dans le protocole SSH. 

![[Pasted image 20231130162736.png]]
# Analysez les principaux fichiers de traces


consulter les **fichiers de traces**, comme nous allons le voir dans la première section de ce chapitre avec les fichiers contenus dans le répertoire**`/var/log`**.

## **Consultez les répertoires des fichiers de traces de  `rsyslog`**

Chacun des processus du système proposant au noyau Linux de tracer ses activités déclenche le traitement de ses informations par un service particulier :**`rsyslog`**.

sur Ubuntu les log sont dans le répertoire suivant :  ``/var/log``

Ce dernier présente l'avantage de centraliser la configuration des fichiers de traces et donc de regrouper dans les fichiers concernés les informations de même nature.
Dans le répertoire : `/etc/rsyslog.d`

l'ensemble des canaux de Logs centraliser par rsyslog selon la configuration des fichier du répertoire ``/etc/rsyslog.d/``  sont visible en temps réelle avec la commande ``tail -f /var/log/syslog``
## Configuration d'un serveur rsyslog sur Ubuntu


Tools :`rsyslog`,`apt install rsyslog`

#### Côté Serveur :


Dans le fichier de configuration : ``/etc/rsyslog.conf``

1. **Activer la réception des logs distants** :

Pour activer la réception des logs distants, recherchez les lignes suivantes dans le fichier `rsyslog.conf` et assurez-vous qu'elles sont décommentées :

```bash
# provides UDP syslog reception 
module(load="imudp") 
input(type="imudp" port="514") 
# provides TCP syslog reception 
module(load="imtcp") 
input(type="imtcp" port="514")
```

2. **Redémarrer le service rsyslog**
``sudo systemctl restart rsyslog``

3. Vérification de l'écoute réseaux :
	``sudo netstat -tuln | grep 514``

Les fichiers à la réception sont stocker dans le fichier : ``**/var/log/syslog**``

#### Côté Client :

Dans le fichier de configuration : ``/etc/rsyslog.conf``

1. Ajoute cet ligne dans le fichier de configuration 
	``*.* @adresse_ip_serveur:514``
	@@ = TCP
	@ = UDP

1. **Redémarrer le service rsyslog**
	``sudo systemctl restart rsyslog``

Attention: Cet configuration n'est que une démonstration, elle n'est pas optimiser pour l'organisation des Logs.
## Commande utile pour de l'audit 

### Commande `w` :

La commande `w` affiche des informations sur les utilisateurs actuellement connectés au système. Elle fournit également des détails tels que les commandes en cours d'exécution, la charge système, et le temps écoulé depuis le dernier démarrage.

Exemple :

bashCopy code

`w`

### Commande `who` :

La commande `who` affiche une liste des utilisateurs actuellement connectés, avec des détails tels que le nom d'utilisateur, le terminal utilisé, l'adresse IP et l'heure de connexion.

Exemple :

bashCopy code

`who`

### Commande `last` :

La commande `last` montre une liste des connexions précédentes, des tentatives de connexion et des arrêts du système. Elle affiche des informations telles que le nom d'utilisateur, l'adresse IP, le terminal, l'heure de connexion et de déconnexion.

Exemple :

`last`

Options couramment utilisées :

- `-n num` : Affiche les num dernières entrées.
    
    `last -n 10`
    
- `-a` : Affiche également les adresses IP.
    
    `last -a`
    
- `-i` : Affiche les adresses IP au lieu des noms d'hôte.
    
    `last -i`
    

Ces commandes sont utiles pour surveiller l'activité des utilisateurs sur un système Unix ou Linux et pour obtenir des informations sur les connexions en cours et passées.


### Commande journalctl 

`   journalctl` est l'outil principal pour consulter et gérer les journaux du système sur les distributions Linux utilisant systemd comme gestionnaire de système et de services. Voici quelques-unes des commandes principales pour utiliser `journalctl` :

### 1. Afficher les journaux système

`journalctl`

Cela affichera les journaux système depuis le démarrage actuel du système jusqu'à la fin. Il s'agit de la commande la plus basique pour consulter les journaux.

### 2. Afficher les derniers journaux


`journalctl -n`

Cela affichera les derniers messages du journal.

### 3. Afficher les journaux à partir d'un certain moment



`journalctl --since "YYYY-MM-DD HH:MM:SS"`

Cela affichera les journaux à partir de la date et de l'heure spécifiées.

### 4. Afficher les journaux jusqu'à un certain moment


`journalctl --until "YYYY-MM-DD HH:MM:SS"`

Cela affichera les journaux jusqu'à la date et l'heure spécifiées.

### 5. Afficher les journaux d'un service spécifique


`journalctl -u nom_du_service`

Cela affichera les journaux du service spécifié.

### 6. Afficher les journaux avec un niveau de priorité spécifique


`journalctl -p level`

Replacez `level` par le niveau de priorité souhaité (par exemple, "err", "warning", "info", etc.).

### 7. Afficher les journaux avec un motif spécifique


`journalctl -k -p err`

Cela affichera les messages du noyau avec une priorité d'erreur.

### 8. Afficher les journaux en temps réel


`journalctl -f`

Cela affichera les nouveaux messages du journal en temps réel, comme `tail -f`.

### 9. Exporter les journaux vers un fichier texte


`journalctl > logs.txt`

Cela exportera tous les journaux dans un fichier texte nommé "logs.txt".

### 10. Afficher les journaux d'une unité spécifique (service, socket, etc.)

`journalctl -u nom_de_l_unite`

Cela affichera les journaux de l'unité (par exemple, un service) spécifiée.

### 11. Afficher les journaux du démarrage actuel


`journalctl -b`


## Analysez l’activité du processeur et des processus


##  **Utilisez les gestionnaires de tâches sous Linux en mode terminal**


packet utile : `procps`

Commande Utile pour l'analyse : 
-ps
-pstree
-top
-htop


`ps` Permet de voir tout les processus Principale lancer par Ubuntu.

`pstree` Permet de voir une hiérarchie  des processus.
`top` Permet de voir tout les processus en premier plan et en demon et actualiser en temp réel.
`htop` Est comment la commande `top` mais permet est plus graphique, c'est l'équivalent du Gestionnaire des tâches sur Ubuntu.

explication des colonne de `htop` 

1. **PID (Process ID)** : L'identifiant unique du processus.
    
2. **USER (User)** : Le nom de l'utilisateur propriétaire du processus.
    
3. **PR (Priority)** : La priorité du processus. Les valeurs les plus élevées sont affichées en haut.
    
4. **NI (Nice value)** : La valeur nice du processus. Les processus avec une valeur nice plus élevée sont exécutés avec une priorité réduite.
    
5. **VIRT (Virtual Memory)** : La quantité totale de mémoire virtuelle utilisée par le processus.
    
6. **RES (Resident Memory)** : La quantité de mémoire résidente utilisée par le processus (c'est-à-dire la mémoire physique).
    
7. **SHR (Shared Memory)** : La quantité de mémoire partagée utilisée par le processus.
    
8. **S (State)** : L'état actuel du processus (par exemple, S pour dormir, R pour en cours d'exécution, Z pour zombie, etc.).
    
9. **%CPU (CPU Usage)** : Le pourcentage de temps CPU utilisé par le processus depuis le dernier rafraîchissement.
    
10. **%MEM (Memory Usage)** : Le pourcentage de mémoire physique utilisé par le processus par rapport à la mémoire totale du système.
    
11. **TIME+ (CPU Time)** : Le temps CPU total utilisé par le processus depuis son démarrage, en tenant compte de tous les threads du processus.
    
12. **COMMAND (Command)** : La commande ou le nom du processus.



### **Modifiez la priorité d’un processus**

En effet, le noyau gère l'allocation du temps CPU pour chaque processus en fonction d'un facteur de priorité.

Le champ **`NI`** correspond à l'affichage de la valeur numérique de ce facteur de priorité et sous Linux :
L'intervalle numérique de priorité va de **-20 à 20.

Le `NI` peut être modifier par l'utilisateur `root`.

##  Altérer le déroulement  d’un processus

Les Processus fonctionne à l'aide de signale, par la ou on envoie des informations

- Le noyau Linux peut envoyer des signaux à ces processus
    
- Un processus peut envoyer un signal à un autre processus
    
- Et un processus peut même s’envoyer à lui-même un signal

Sous Linux, il existe 30 signaux principaux normalisés, numérotés de 1 à 30. Ainsi lorsqu'un processus reçoit un signal, en fonction de sa nature, il peut l’"**écouter**" et appliquer son message ou bien **l’ignorer**.


#### Il existe 3 Signal qui nous permet de stopper le dérouillement d'un processus :

1. SIGINT (signal numéro 2)
    
2. SIGTERM (signal numéro 15)
    
3. SIGKILL (signal numéro 9)

#### SIGINT et SIGTERM

Ces deux signaux indiquent au processus sa terminaison de façon propre. Autrement dit : il y a ici une volonté à ce que ce soit le processus lui-même qui se termine, en libérant correctement toutes les ressources qu'il occupe à cet instant.


Notez que ces deux signaux peuvent être ignorés par le processus cible (je pense notamment au processus parent de tous les autres, **`init`** ou **`systemd`**

c'est quoi `init` et `systemd ? 

`init` et `systemd` sont des systèmes d'initialisation utilisés dans les systèmes d'exploitation basés sur UNIX/Linux pour démarrer et arrêter les processus système et les services lors du démarrage du système.

#### SIGKILL

C’est le signal destructeur par définition. Souvent, il est envoyé lorsque les deux précédents n'ont pas fonctionné. Le processus ciblé est terminé brutalement :

- pas forcément aussi proprement qu'avec SIGINT ou SIGTERM,
    
- et les ressources associées ne sont pas libérées proprement.

Les processus ne peuvent pas ignorer ce signal. Tout simplement parce qu'il ne leur est pas adressé directement. SIGKILL est envoyé au processus principal de Linux (**`init`** ou **`systemd`**) qui se charge, lui, de tuer le processus cible.

#### Commande Nice : 

exemple : 

````bash
nice -n 10 python calculs.py
`````

`-n` l'argument qui permet d'attribuer un `NI`a un processus. 



#### Commande KILL : 

-**SIGTERM (15)** : Ce signal demande poliment à un processus de se terminer.

````bash
kill PID
`````

**SIGKILL (9)** : Ce signal force un processus à se terminer immédiatement, sans donner au processus la possibilité de nettoyer quoi que ce soit.
````bash
kill -9 PID
`````

**SIGINT (2)** : Ce signal est généralement envoyé par le clavier lorsque vous appuyez sur `Ctrl+C`. Il est utilisé pour interrompre un processus en cours d'exécution.

````bash
kill -2 PID
`````

##  Analysez l’activité réseau


1. Nous utiliserons les commandes **`ss`** et **`lsof`** pour relever les ports en écoute de la machine,
2.  Nous explorerons les outils **`bmon`** et **`iptraf`** qui affichent l'activité en temps réel des interfaces,
	La Commande `ss` viens du paquet **`iproute2`**. 

Qu'elle est la différent entre ss et lsof ? 

- La commande `ss` fournit des informations sur les connexions réseau, y compris les adresses IP, les ports, les états de connexion, etc.
- La commande `lsof` fournit des informations sur les fichiers ouverts, y compris les noms de fichiers, les descripteurs de fichiers, les processus associés, etc.
### La commande ss :

La commande `ss`  est un outil en ligne de commande utilisé pour afficher des informations détaillées sur les sockets réseau sur un système Linux. Voici une explication générale de la commande `ss` .

Définition Socket : En résumé, les sockets sont des éléments fondamentaux de la programmation réseau, permettant aux applications de communiquer à travers un réseau de manière fiable et efficace.

Exemple des argument principale: 
#### ss -lptun

La commande : `ss -lptun`

- Arguments : 
1. **-l** : Cet argument signifie "listen" (écoute). Il filtre la sortie pour afficher uniquement les sockets en mode écoute (listening), c'est-à-dire les sockets qui attendent des connexions entrantes.
    
2. **-p** : Cet argument signifie "processes". Il affiche les informations sur les processus qui utilisent les sockets réseau, y compris leur PID (identifiant du processus) et leur nom.
    
3. **-t** : Cet argument signifie "tcp". Il filtre la sortie pour afficher uniquement les sockets TCP.
    
4. **-u** : Cet argument signifie "udp". Il filtre la sortie pour afficher uniquement les sockets UDP.
    
5. **-n** : Cet argument signifie "numeric". Il désactive la résolution DNS et affiche les adresses IP numériques plutôt que les noms de domaine.

- En résumer la commande `ss` est extrêmement  complète mais la commande qui permet de visualiser de manière efficace sur l'activité réseaux de la machine avec l'argument `I`: 

````bash
ss -lptun 
`````
#### explication de la sortie `ss -lptun` : 

1. **State (État)** : L'état de la connexion TCP. Cela peut inclure des états tels que `LISTEN` (en écoute) pour les sockets en mode écoute, `ESTABLISHED` (établi) pour les sockets avec une connexion établie, `TIME_WAIT` (en attente de temporisation) pour les sockets qui attendent d'être fermés après avoir terminé la communication, etc.
    
2. **Recv-Q (File d'attente de réception)** : La longueur de la file d'attente de réception, c'est-à-dire le nombre de segments TCP non lus en attente dans la file d'attente de réception de la socket.
    
3. **Send-Q (File d'attente d'envoi)** : La longueur de la file d'attente d'envoi, c'est-à-dire le nombre de segments TCP en attente d'être envoyés dans la file d'attente d'envoi de la socket.
    
4. **Local Address (Adresse locale)** : L'adresse IP et le numéro de port de la socket sur votre système.
    
5. **Peer Address (Adresse distante)** : L'adresse IP et le numéro de port de la socket distante avec laquelle la socket locale communique.
    
6. **User (Utilisateur)** : Le nom de l'utilisateur propriétaire du processus utilisant la socket.
    
7. **Command (Commande)** : Le nom de la commande ou du processus utilisant la socket.
    
8. **PID (Identifiant du processus)** : L'identifiant du processus utilisant la socket.


####  ss -t  state established

La commande : `ss -t  state established`

- Arguments : 
1. - `-t` : Affiche uniquement les sockets TCP.
2. `-a` : Affiche toutes les sockets.
3. `state established` : Filtre pour afficher uniquement les connexions TCP établies.

permet de voir l'ensemble des connexion établies 

#### explication de la sortie `ss -t  state established`

- **Recv-Q (File d'attente de réception)** : La longueur de la file d'attente de réception pour la socket. Cela représente le nombre de segments TCP non lus en attente dans la file d'attente de réception de la socket. Un nombre élevé dans cette colonne peut indiquer un trafic entrant important ou des problèmes de traitement du côté réception.
    
- **Send-Q (File d'attente d'envoi)** : La longueur de la file d'attente d'envoi pour la socket. Cela représente le nombre de segments TCP en attente d'être envoyés dans la file d'attente d'envoi de la socket. Un nombre élevé dans cette colonne peut indiquer un trafic sortant important ou des problèmes de traitement du côté envoi.



### La Commande l`lsof`


Cet commande permet une diagnostique sur l'activité réseaux de la machine, mais ce concentre sur les processus responsable de l'activité réseaux : 

#### Les arguments Principale : 

c \<commande> : Affiche les fichiers ouverts par une commande spécifique.
  
u \<utilisateur> : Affiche les fichiers ouverts par un utilisateur spécifique.
  
p \<PID> : Affiche les fichiers ouverts par un processus spécifique, identifié par son PID (identifiant de processus).
  
i : Affiche les fichiers ouverts utilisant un réseau, y compris les sockets réseau (IPv4 et IPv6).
  
t : Affiche uniquement les identifiants de processus (PID) plutôt que les noms de processus.
  
n : Désactive la résolution des noms d'hôte pour les adresses IP, ce qui accélère l'exécution de la commande.
  
i \<protocole> : Affiche les fichiers ouverts pour un protocole réseau spécifique. Par exemple, -iTCP pour les sockets TCP.
  
b : Affiche les informations sur les blocs de périphériques.
  
h : Affiche l'aide et la liste des options de la commande.


#### Exemple: 

1. `lsof -u username`
2. `lsof -p PID`
3. ` lsof -Pi `


### Le tools Bmon 

Installation `apt-get install bmon`

Commande `bmon`

Explication : Bmon permet de voir via as une interface le trafique réseaux sur jacques interface. 
### Le tools tcpdump

Le tools tcp dump : permet de faire de l'écoute réseaux. 

Installation `apt-get install tcpdump`

Commande `tcpdump`


#### Exemple : 

- Permet spécifier une interface pour l'écoute réseaux.
`sudo tcpdump -i interface`

- Permet de d'exporter l'écoute réseaux vers un fichier importable vers Wireshark. 
`wireshark capture.pcap`


- Permet spécifier une interface pour ensuite l'exporter vers un fichier qu'on pourras importer dans Wireshark. 
`sudo tcpdump -i interface -w capture.pcap`
