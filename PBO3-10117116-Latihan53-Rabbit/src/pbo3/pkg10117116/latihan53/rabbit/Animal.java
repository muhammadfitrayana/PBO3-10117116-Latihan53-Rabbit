/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117116.latihan53.rabbit;

/**
 *
 * @author Muhammad Fitrayana
 */
public class Animal {
  protected boolean vegetarian;
  protected String eats;
  protected int noOfLegs;

    public Animal(boolean vegetarian, String food, int legs) {
        this.vegetarian = vegetarian;
        this.eats = food;
        this.noOfLegs = legs;
    }
    
    public boolean isVegetarian() {
      return false;
        
    }
    
    public String getEats() {
      return null;
        
    }

    public int getNoOfLegs() {
      return 0;
        
    }  
    
}
