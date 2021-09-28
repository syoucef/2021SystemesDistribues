import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "etudiant")
public class Personne implements Serializable {
    // tous les atributs doivent être de type private ....
    // la classe est dotée forcément d'un constructeur sans paramètre ...
    // des gettres et setters ....

    private String nom;
    private String prenom;
    private Date dateNaissance;

    public Personne() {
    }

    public Personne(String nom, String prenom, Date dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }


    @XmlAttribute
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}
