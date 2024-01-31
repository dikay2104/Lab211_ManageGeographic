package Controller;

import Model.EastAsiaCountry;
import View.CountryView;

import java.util.ArrayList;
import java.util.Scanner;

import View.Menu;

public class ManageEastAsiaCountry extends Menu{
    Scanner scanner = new Scanner(System.in);
    ArrayList<EastAsiaCountry> countryList = new ArrayList<>();
    CountryView view = new CountryView();

    public ManageEastAsiaCountry(){
        super("Country Management", new String[]{"Input country", "Display just input", "Search country by name", "Display all country", "Exit"});
    }
    @Override
    public void execute(int choice){
        String name;
            switch (choice){
                case 1:
                    view.addCountry(countryList);
                    break;
                case 2:
                    view.displayRecentlyCountry(countryList);
                    break;
                case 3:
                    System.out.println("Enter country name to search: ");
                    name = scanner.nextLine();
                    view.searchCountryByName(countryList, name);
                    break;
                case 4:
                    view.displayCountrySorted(countryList);
                    break;
                case 5:
                    System.exit(0);
            }
    }
}
