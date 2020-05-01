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
public class McCrispyMediumMealBuilder implements MealBuilder{

    private Meal meal;
    
    public McCrispyMediumMealBuilder(){
        this.meal = new Meal();
    }
    
    @Override
    public void buildBurger() {
        meal.setBurger("McCrispy");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("Coke");
    }

    @Override
    public void buildFries() {
        meal.setFries("Curly Fries");
    }

    @Override
    public Meal getMeal() {
        return this.meal;
    }
    
}
