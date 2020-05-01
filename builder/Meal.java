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
public class Meal implements MealPlan{
    
    private String burger;
    private String drink;
    private String fries;

    public String getBurger() {
        return burger;
    }

    public String getDrink() {
        return drink;
    }

    public String getFries() {
        return fries;
    }

    @Override
    public void setBurger(String burger) {
        this.burger = burger;
    }

    @Override
    public void setDrink(String drink) {
        this.drink = drink;
    }
    
    @Override
    public void setFries(String fries) {
        this.fries = fries;
    }
    
    

}
