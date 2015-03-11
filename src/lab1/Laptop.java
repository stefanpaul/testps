/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Student
 */
public class Laptop extends Product{
    
    private String processor;
    private int screenSize; 
    
    Laptop(String name, int price)
    {
        super(name,price);
    }
    
    public void setProcessor(String frecventa)
    {
        processor = new String(frecventa);
    }
    
    public void setScreenSize(int size)
    {
        this.screenSize = size;
    }
 
    @Override
    public float getprice(int quantity) {
        if(quantity < 3 )
            return quantity * price;
        else if(quantity > 3 && quantity < 5)
            return  (float) (quantity* price * 0.8);
        else return (float) (quantity*price*0.65);
    }

    @Override
    public String toString() {
        return "Laptopul are un procesor de "+processor+" si un ecran de marimea "+screenSize;
    }
    
}
