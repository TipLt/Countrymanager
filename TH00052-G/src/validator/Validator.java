/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validator;

import java.util.Scanner;

/**
 *
 * @author TUF F15
 */
public class Validator {
    private static final Scanner SCANNER = new Scanner(System.in);

    public Validator() {
    }
    
    public static int getInt(String promptMessage, String outOfRangeMessage,
            String invalidNumberMessage, int min, int max){
        do {            
            try {
                System.out.print(promptMessage);
                int number = Integer.parseInt(SCANNER.nextLine());
                if(number >= min && number <= max){
                    System.out.println(outOfRangeMessage);
                }
            } catch (NumberFormatException e) {
                System.out.println(invalidNumberMessage);
            }
        } while (true);
    }
    
    public static String getString(String promptMessage, final String REGEX){
        do {            
            System.out.print(promptMessage);
            String str = SCANNER.nextLine();
            if(str.matches(REGEX)){
                return str;
            }
        } while (true);
    }
    
    public static float getFloat(String promptMessage, String outOfRangeMessage,
            String invalidNumberMessage, float min, float max){
        do {            
            try {
                System.out.print(promptMessage);
                float number = Float.parseFloat(SCANNER.nextLine());
                if(number >= min && number <= max){
                    System.out.println(outOfRangeMessage);
                }
            } catch (NumberFormatException e) {
                System.out.println(invalidNumberMessage);
            }
        } while (true);
    }
}
