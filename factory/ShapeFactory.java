/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author noorishhassan
 */
public  class ShapeFactory {
    
    public Shape getShape(String name){
        
        if (name.equalsIgnoreCase("circle"))
            return new Circle();
        else if (name.equalsIgnoreCase("square"))
            return new Square();
        else if (name.equalsIgnoreCase("triangle"))
            return new Triangle();
        return null;
            
    }
}
