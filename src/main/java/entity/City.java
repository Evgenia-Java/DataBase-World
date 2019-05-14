package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String district;
    private Integer population;

    @ManyToOne
    @JoinColumn(name = "code")
    private Country countryCode;

    public City() {
    }

    public City(String name, String district, Integer population) {
        this.name = name;
        this.district = district;
        this.population = population;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Country countryCode) {
        this.countryCode = countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return String.format("%-3d %-30s %-5s %-25s %-3d",
                id, name, countryCode, district, population);
    }

    @Override
    public boolean equals(Object object){
        if (object == this) {
            return true;
        }
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }
        City city = (City) object;
        return id == city.id &&
                (name == city.name || (name ==null && name.equals(getName()))) &&
                (countryCode == city.countryCode || (countryCode == null && countryCode.equals(getCountryCode()))) &&
                (district == city.district || (district == null && district.equals(getDistrict()))) &&
                (population == city.population || (population != 0 && population.equals(getPopulation())));
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null)? 0 : name.hashCode());
        result = prime * result + ((countryCode == null)? 0 : countryCode.hashCode());
        result = prime * result + ((district == null)? 0 : district.hashCode());
        result = prime * result + population;
        return result;
    }
}
