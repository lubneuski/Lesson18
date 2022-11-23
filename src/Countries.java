import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Countries {
    @XmlElement(name = "country")
    private List<Country> countryList = new ArrayList<>();

    public Countries() {
    }

    public Countries(List<Country> countryList) {
        this.countryList = countryList;
    }

    public void setCountryList(List<Country> countryList) {
        this.countryList = countryList;
    }

   public void add(Country country){
        this.countryList.add(country);
   }

    @Override
    public String toString() {
        return  this.countryList.toString();
    }

}