import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;

public class Main {
    static String fileXml="src/Resources/Countries.xml";

    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        unmarshal(fileXml);
        marshal();
    }

    private static void unmarshal(String file) throws JAXBException{
        JAXBContext context = JAXBContext.newInstance(Countries.class);
        Unmarshaller unmarshaler=context.createUnmarshaller();
        Countries countries = (Countries) unmarshaler.unmarshal(new File(file));
        System.out.println(countries);
    }

    private static void marshal() throws JAXBException, FileNotFoundException {
        JAXBContext contmar=JAXBContext.newInstance(Countries.class);
        Marshaller mar=contmar.createMarshaller();
        Countries cs=new Countries(){
            {
                Country country1 = new Country("Беларусь", "1 января 1919", "Возникновения белорусской государственности");
                this.add(country1);
                Country country2 = new Country("Польша", "11 ноября 1918", "Возникновение независимости");
                this.add(country2);
            }
        };
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
        mar.marshal(cs, new FileOutputStream("src/Resources/Out.xml"));
    }
}