/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import validator.Validator;
import bo.ManageEastAsiaCountries;
import model.

/**
 *
 * @author TUF F15
 */
public class Main {
    
    private static void displayMenu(){
        System.out.println("                              MENU                             \n"
                + "============================================================================\n"
                + "1. Input the information of 11 countries in East Asia\n"
                + "2. Display the infomation of country you've just input\n"
                + "3. Search the information of country by user-entered name\n"
                + "4. Display the information of countries sorted name is ascending order\n"
                + "5. Exit\n"
                + "============================================================================");
    }
    
    public static void main(String[] args){
        ManageEastAsiaCountries manager = new ManageEastAsiaCountries();
        while (true) { 
            // Display the menu
            displayMenu();
            
            // Choose option from the menu
            int option = Validator.getInt("Enter option: ",
                    "Option must be 1->5", "Invalid", 1, 5);
            
            switch (option) {
                case 1:
                    // Input information of country
                    manager.addCounty(list);
                    break;
                case 2:
                    manager.displayCountriesRecently();
                    break;
                case 3:
                    manager.searchCountry();
                    break;
                case 4:
                    manager.sortCountry();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
