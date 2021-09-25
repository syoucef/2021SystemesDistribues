# **Systèmes Distribués**



# Travail à faire le mercredi 29 septembre



# Cours du mardi 28 septembre 


Pour que Maven génère un war au lieu d'un jar, on ajoute les deux plugings suivants, dans bien sûr le pom.xml.  

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


Il existe deux approches pour développer un service web SOAP : (i) l'approche Bottomp-up et (ii) l'approche top-down. La première approche consite à définir d'abord les méthodes du service en question et puis générer son fichier de description wsdl (wWb Service Description Language). La deuxième approche consiste à définir d'abord  le contrat du service. 


# Travail à faire le mercredi 22 septembre 

1. Finir les tutoriels sur Maven que vous trouverez sur Arche ou en utilisant ce lien [https://drive.google.com/drive/folders/1oNl4g0TTMgDSUMWt8V_Z2Z0ubSXtjUFG](https://drive.google.com/drive/folders/1oNl4g0TTMgDSUMWt8V_Z2Z0ubSXtjUFG) <br>
Les vesrions pdf se trouvent sur le site du cours <br> A partir de la vidéo 6, vous aurez besoin d'un concept important en prgrammation web (le modèle **MVC, Modèle-Vue-Contrôleur**). Vous pouvez vous contenter de rafaire les manipulations, sans vraiemnet saisir tout son sens. En cas de difficulté à les réliser, vous pouvez laisser les vidéos 6 à 10, pour une autre séance, une fois qu'on aura discuté et présenté ce concept.  
2. Prise en main de Markdown (vos rapports doivent être rédigés avec Markdown)
3. Réfléchir sur le cas d'application de votre projet (exemples : application e-commerce, application de gestion des adhérents d'une association,  )
5. Installer IntelliJ IDEA
6. Renseigner les noms et prénoms des groupes et un lien vers votre dépôt GIT (utiliser le lien Noms des groupes du bloc-notes collaboratif que vous trouverez sur le site du cours)

