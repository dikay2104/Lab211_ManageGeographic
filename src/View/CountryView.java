package View;

import Common.Input;
import Model.EastAsiaCountry;

import java.util.ArrayList;
import java.util.Collections;

public class CountryView {
    ArrayList<EastAsiaCountry> countryList = new ArrayList<>();
    Input input = new Input();
    public void addCountry(ArrayList<EastAsiaCountry> countryList){
        String id = input.inputString("Enter code of country: ");
        String name = input.inputString("Enter name of country: ");
        float area = input.inputFloatnotMax("Enter total area: ", 0);
        String terrain = input.inputString("Enter terrain of country: ");
        countryList.add(new EastAsiaCountry(id, name, area, terrain));
        System.out.println("Add country successfully");
    }

    public void displayRecentlyCountry(ArrayList<EastAsiaCountry> countryList){
        int size = countryList.size();
        if (size > 0) {
            EastAsiaCountry lastCountry = countryList.get(size - 1);
            System.out.println(lastCountry.toString());
        } else {
            System.out.println("The country list is empty.");
        }
    }

    public void searchCountryByName (ArrayList<EastAsiaCountry> list, String criteria){
        ArrayList<EastAsiaCountry> searchResult = new ArrayList<>();
        for (EastAsiaCountry country : list){
            if (country.getCountryName().toLowerCase().equals(criteria.toLowerCase())){
                searchResult.add(country);
            }
        }
        for (EastAsiaCountry country : searchResult){
            System.out.println(country.toString());
        }
    }

    public void displayCountrySorted (ArrayList<EastAsiaCountry> countryList){
        Collections.sort(countryList);
        for(EastAsiaCountry country : countryList){
            System.out.println(country.toString());
        }
    }


}
