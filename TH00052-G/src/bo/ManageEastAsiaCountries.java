/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;
import java.util.ArrayList;
import validator.Validator;

public class ManageEastAsiaCountries {

    public void addCounty(ArrayList<EastAsiaCountry> list){
        if(list.size() >= 11){
            System.out.println("EastAsia have 11 countries");
            return;
        }
        String countryCode, countryName, countryTerrain;
        float totalArea;
        
        while (true) {            
            countryCode = Validator.getString("Enter country code: ", "[a-zA-Z0-9]+");
            if(checkID(countryCode, list)){
                System.out.println("Duplicate country code, please enter again");
            }else{
                break;
            }
        }
        countryName = Validator.getString("Enter name of country: ", "[a-zA-Z ]+");
        totalArea = Validator.getFloat("Enter area country: ", "Area country must be number greater than 0",
                "Area invalid!", Float.MIN_VALUE, Float.MAX_VALUE);
        countryTerrain = Validator.getString("Enter terrain country: ", "[a-zA-Z ]+");
        EastAsiaCountry country = new EastAsiaCountry(countryCode, countryName, totalArea, countryTerrain);
        list.add(country);
    }
    
    private boolean checkID(String countryCode, ArrayList<EastAsiaCountry> list){
        for (EastAsiaCountry e : list) {
            if(e.getCountryCode().equalsIgnoreCase(countryCode)){
                return true;
            }
        }
        return false;
    }
    
    public void displayLastCountry(ArrayList<EastAsiaCountry> list){
        if(list.isEmpty()){
            System.out.println("No countries in the list");
        }else{
            System.out.printf("%-20s%-20s%-20s%-20s\n","ID","Name","Total Area","Terrain");
            list.get(list.size()-1).display();
        }
    }
    
}
