/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap_assignment4;

import builder.*;
import factory.*;
import singleton.*;
import java.util.Scanner;

/**
 *
 * @author noorishhassan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape(in.next());
        shape.draw();
                

        MealBuilder mealBuilder = new HappyMealBuilder();
        Cook cook = new Cook(mealBuilder);
        
        cook.buildMeal();
        Meal meal = cook.getMeal();

        System.out.println("Your meal has " + meal.getBurger() + " " + meal.getDrink() + " " + meal.getFries());
        
        AudioDriver.getAudioDriver();
        
        
    }
    
}
