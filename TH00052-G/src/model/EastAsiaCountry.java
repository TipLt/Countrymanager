/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author TUF F15
 */
public class EastAsiaCountry extends Country{
    private String countryTerrain;

    public EastAsiaCountry() {
        super();
    }

    public EastAsiaCountry( String countryCode, String countryName, float totalArea,String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.printf("%-20s",countryTerrain);
    }
}
