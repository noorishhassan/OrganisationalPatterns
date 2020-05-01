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
public interface MealBuilder {
    
    public void buildBurger();
    
    public void buildDrink();
    
    public void buildFries();
    
    public Meal getMeal();
}
