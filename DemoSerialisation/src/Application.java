import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class Application {

    public static void main(String[] args) throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance(Personne.class);
        Personne p_1 = new Personne("Cipriani", "Mael", new Date(1,1,2001));

        Marshaller m = jc.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.marshal(p_1, new File("resultat.xml"));

    }

}
