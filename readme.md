
# Travail à faire le mercredi 29 septembre

1. terminer l'exercice n°2 sur la (dé)sérialisation XML/Objet. **Ne pas faire la partie sur Json.**
2. 

# Cours du mardi 28 septembre 


## Mise en place de l'environnement de développement

Pour réaliser les manipulations suivantes, vous aurez besoin d'un IDE et d'un serveur d'application. Pour l'IDE, j'utilise Intellij (libre à vous d'utiliser votre IDE préféré). Pour le déploiement d'un service web, j'utilise le serveur d'application Glassfish.  La version de Java que j'utilise est la version 8. Attention : l'utilisation d'une version ultérieur ne permet de reproduire les manipulation suivante, car elle intègre pas les utilitaires, entre autre, de génération ni de **stub** (proxy) ni de **skeleton** (voir plus loin, bien saisir l'objectif de ces deux artefacts). 


Pour que Maven génère un war au lieu d'un jar (**attention : on peut générer un war sans ajouter ces deux plugings mais le service sera inaccessible**), on ajoute les deux plugings suivants, dans bien sûr le pom.xml 😁.  

```xml 
<plugin>
        <artifactId>maven-war-plugin</artifactId>
        <configuration>
          <failOnMissingWebXml>false</failOnMissingWebXml>
        </configuration>
      </plugin>

      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.7.0</version>
        <configuration>
          <source>1.8</source>
          <target>1.8</target>
        </configuration>
      </plugin>
```


Il existe deux approches pour développer un service web SOAP : (i) l'approche Bottomp-up et (ii) l'approche top-down. La première approche consiste à définir d'abord les méthodes (opérations) du service en question et puis générer son fichier de description wsdl (Web Service Description Language). C'est la méthode la plus intuitive. La génération du fichier de description du service se fait l'aide de l'utilitaire ``wsgen``.  La deuxième approche consiste à définir d'abord  le contrat du service. 

###  Définition d'un service web SOAP avec l'approche bottomp-up

Commençons d'abord par générer un projet web, en utilisant Maven. Choisissez l'archetype ``org.apache.maven.archetype:maven-archetype-webapp``. Soit demoSoap, ``l'ArtifactId`` de ce projet et ``fr.polytech`` son  ``GroupId``.  Une fois le projet généré , supprimer le fichier de configuration ``web.xml``qui se trouve dans ``webapp/WEB-INF``. Ajouter le sous-répertoire ``main/java`` et préciser que vos code sources sont sauvegardés dans répertoire. Cliquer sur ``Project structure``. Définir le répertoire ``java``comme ressources, comme illustré par les deux figures suivantes. 



![figures/fig1.PNG](figures/fig1.PNG)

![figures/fig2.PNG](figures/fig2.PNG)




Un exemple d'un service web (``testsoap``), exposant une seule méthode appelée ``affichageBonjour``, prenant en paramètre une chaîne de caractère, est donné par le code suivant. 


```java    
package com.test;
import javax.jws.WebMethod;
import javax.jws.WebService;
@WebService(serviceName = "testsoap", targetNamespace = "http://www.polytech.fr")
public class MonService {

    @WebMethod(operationName = "affichageBonjour")
    public String afficherBonjour(String nom){
        return "Bonjour " + nom;
    }
}
```

# Travail à faire le mercredi 22 septembre 

1. Finir les tutoriels sur Maven que vous trouverez sur Arche ou en utilisant ce lien [https://drive.google.com/drive/folders/1oNl4g0TTMgDSUMWt8V_Z2Z0ubSXtjUFG](https://drive.google.com/drive/folders/1oNl4g0TTMgDSUMWt8V_Z2Z0ubSXtjUFG) <br>
Les vesrions pdf se trouvent sur le site du cours <br> A partir de la vidéo 6, vous aurez besoin d'un concept important en prgrammation web (le modèle **MVC, Modèle-Vue-Contrôleur**). Vous pouvez vous contenter de rafaire les manipulations, sans vraiemnet saisir tout son sens. En cas de difficulté à les réliser, vous pouvez laisser les vidéos 6 à 10, pour une autre séance, une fois qu'on aura discuté et présenté ce concept.  
2. Prise en main de Markdown (vos rapports doivent être rédigés avec Markdown)
3. Réfléchir sur le cas d'application de votre projet (exemples : application e-commerce, application de gestion des adhérents d'une association,  )
5. Installer IntelliJ IDEA
6. Renseigner les noms et prénoms des groupes et un lien vers votre dépôt GIT (utiliser le lien Noms des groupes du bloc-notes collaboratif que vous trouverez sur le site du cours)

