package Model;

public class EastAsiaCountry extends Country{
    private String countryTerrain;

    public EastAsiaCountry(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    public EastAsiaCountry(String countryCode, String countryName, float totalArea, String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    @Override
    public String toString() {
        return "EastAsiaCountry{" +
                "Country Code = '" + countryCode + '\'' +
                ", Country Name = '" + countryName + '\'' +
                ", Total Area = '" + totalArea + '\'' +
                ", Country Terrain = " + countryTerrain +
                '}';
    }
}
