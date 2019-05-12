package entity;

import javax.persistence.*;

@Entity
@Table(name = "countrylanguage")
public class CountryLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ManyToOne
    @JoinColumn(name = "code")
    private String countryCode;
    private String language;
    private String isOfficial;  //ENUM
    private float percentage;

    public CountryLanguage() {
    }

    public CountryLanguage(String countryCode, String language, String isOfficial, float percentage) {
        this.countryCode = countryCode;
        this.language = language;
        this.isOfficial = isOfficial;
        this.percentage = percentage;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String isOfficial() {
        return isOfficial;
    }

    public void setOfficial(String official) {
        isOfficial = official;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return String.format("%-5s %-20s %-3s %-10f",
                countryCode, language, isOfficial, percentage);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }
        CountryLanguage countryLanguage = (CountryLanguage) object;
        return (countryCode == countryLanguage.countryCode || (countryCode != null && countryCode.equals(getCountryCode()))) &&
                (language == countryLanguage.language || (language == null && language.equals(getLanguage()))) &&
                (isOfficial == countryLanguage.isOfficial) &&                                         //???????????
                (percentage == countryLanguage.percentage);
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((countryCode == null) ? 0 : countryCode.hashCode());
        result = prime * result + ((language == null)? 0 : language.hashCode());
        result = prime * result + ((isOfficial == null)? 0 : isOfficial.hashCode());
        result = prime * result + (int)percentage;                                                    //??????????
        return result;
    }

    }
