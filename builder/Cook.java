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
public class Cook {
    
    private MealBuilder mealBuilder;
    
    public Cook(MealBuilder mealBuilder){
        this.mealBuilder = mealBuilder;
    }
    
    public Meal getMeal(){
        
        return this.mealBuilder.getMeal();
    }
    
    public void buildMeal(){
        
        this.mealBuilder.buildBurger();
        this.mealBuilder.buildDrink();
        this.mealBuilder.buildFries();
    }
}
