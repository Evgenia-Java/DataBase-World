package entity;

import javax.persistence.*;

@Entity
@Table(name = "Country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String code;
    private String name;
    private String continent; //TODO ENUM
    private String region;
    private Float surfaceArea;
    private Integer indepYear;
    private Integer population;
    private Float lifeExpectancy;
    private Float GNP;
    private Float GNPOld;
    private String localName;
    private String governmentForm;
    private String headOfState;
    private Integer capital;
    private String code2;

    public Country() {
    }

//    public Country(String code, String name, String continent, String region, Float surfaceArea, Integer indepYear, Integer population, Float lifeExpectancy, Float GNP, Float GNPOld, String localName, String governmentForm, String headOfState, Integer capital, String code2) {
//        this.code = code;
//        this.name = name;
//        this.continent = continent;
//        this.region = region;
//        this.surfaceArea = surfaceArea;
//        this.indepYear = indepYear;
//        this.population = population;
//        this.lifeExpectancy = lifeExpectancy;
//        this.GNP = GNP;
//        this.GNPOld = GNPOld;
//        this.localName = localName;
//        this.governmentForm = governmentForm;
//        this.headOfState = headOfState;
//        this.capital = capital;
//        this.code2 = code2;
//    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Float getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(Float surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public Integer getIndepYear() {
        return indepYear;
    }

    public void setIndepYear(Integer indepYear) {
        this.indepYear = indepYear;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Float getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(Float lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public Float getGNP() {
        return GNP;
    }

    public void setGNP(Float GNP) {
        this.GNP = GNP;
    }

    public Float getGNPOld() {
        return GNPOld;
    }

    public void setGNPOld(Float GNPOld) {
        this.GNPOld = GNPOld;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getGovernmentForm() {
        return governmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        this.governmentForm = governmentForm;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
    }

    public Integer getCapital() {
        return capital;
    }

    public void setCapital(Integer capital) {
        this.capital = capital;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    @Override
    public String toString() {
        return String.format("%-3s %-30s %-25s %-3d %-30s",
                code, name, region, population, capital);
    }
    @Override
    public boolean equals(Object o){
        if (o == this) {
            return  true;
        }
        if (o == null || o.getClass() != this.getClass()){
            return false;
        }
        Country country = (Country) o;
        return (code == country.code || (code != null && code.equals(getCode()))) &&
                (name == country.name || (name != null) && name.equals(country.getName())) &&
                (continent == country.continent || (continent != null && continent.equals(getContinent()))) &&
                (region == country.region || (region != null && region.equals(getRegion()))) &&
                (surfaceArea == country.surfaceArea || (surfaceArea != null && surfaceArea.equals(getSurfaceArea()))) &&
                (indepYear == country.indepYear || (indepYear != null && indepYear.equals(getIndepYear()))) &&
                (population == country.population || (population != null && population.equals(getPopulation()))) &&
                (lifeExpectancy == country.lifeExpectancy || (lifeExpectancy != null && lifeExpectancy.equals(getLifeExpectancy()))) &&
                (GNP == country.GNP || (GNP != null && GNP.equals(getGNP()))) &&
                (GNPOld == country.GNPOld || (GNPOld != null && GNPOld.equals(getGNPOld()))) &&
                (localName == country.localName || (localName != null && localName.equals(getLocalName()))) &&
                (governmentForm == country.governmentForm || (governmentForm != null && governmentForm.equals(getGovernmentForm()))) &&
                (headOfState == country.headOfState || (headOfState != null && headOfState.equals(getHeadOfState()))) &&
                (capital == country.capital || (capital != null && capital.equals(getCapital()))) &&
                (code2 == code2 || (code2 != null && code2.equals(getCode2())));
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime*result + ((code == null)?0:code.hashCode());
        result = prime * result + ((name == null)?0:name.hashCode());
        result = prime * result + ((continent == null)?0:continent.hashCode());
        result = prime * result + ((region == null)?0:region.hashCode());
        result = prime * result + ((surfaceArea == null) ? 0 : surfaceArea.hashCode());
        result = prime * result + ((indepYear == null)?0:indepYear.hashCode());
        result = prime * result + ((population == null) ? 0 : population.hashCode());
        result = prime * result + ((lifeExpectancy == null)?0:lifeExpectancy.hashCode());
        result = prime * result + ((GNP == null)?0:GNP.hashCode());
        result = prime * result + ((GNPOld == null)?0:GNPOld.hashCode());
        result = prime * result + ((localName == null)?0:localName.hashCode());
        result = prime * result + ((governmentForm == null)?0:governmentForm.hashCode());
        result = prime * result + ((headOfState == null)?0:headOfState.hashCode());
        result = prime * result + ((capital == null)?0:capital.hashCode());
        result = prime * result + ((code2 == null)?0:code2.hashCode());
        return result;
    }
}
