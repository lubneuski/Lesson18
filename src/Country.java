import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class Country {

    @XmlElement
    private String countryName;
    @XmlElement
    private String startyear;
    @XmlElement
    private String type;

    public Country() {
    }

    public Country(String country, String year, String type) {
        this.countryName = country;
        this.startyear = year;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Country{" +
                "'Страна - " + countryName + '\'' +
                ", 'Год начала действий: " + startyear + '\'' +
                ", 'Сторона - " + type + '\'' +
                '}';
    }
}