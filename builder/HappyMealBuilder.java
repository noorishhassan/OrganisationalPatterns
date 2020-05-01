/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author noorishhassan
 */
public class HappyMealBuilder implements MealBuilder{

    private Meal meal;
    
    public HappyMealBuilder(){
        this.meal = new Meal();
    }
    
    @Override
    public void buildBurger() {
        meal.setBurger("Happy Meal Burger");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("Milo");
    }

    @Override
    public void buildFries() {
        meal.setFries("Regular Fries");
    }

    @Override
    public Meal getMeal() {
        return this.meal;
    }
    
    
}
