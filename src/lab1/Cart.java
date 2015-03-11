/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import java.util.*;
/**
 *
 * @author Student
 */
public class Cart {
   
    private Map<Product, Integer> products = new HashMap<Product,Integer>(100);
    
    public Cart()
    {
        
    }
    
    public void addToCart(Product product, Integer quantity)
    {
        products.put(product,quantity);
    }
    
    public float getTotalPrice()
    {
        float price = 0;
        for (Map.Entry<Product, Integer> entry : products.entrySet())
        {
            price = entry.getKey().getprice(entry.getValue()) + price;
        }
        return price;
    }
    
    public String toString()
    {
        String allOfIt = new String("");
         for (Map.Entry<Product, Integer> entry : products.entrySet())
         {
             allOfIt = allOfIt + entry.getKey().toString()+"\n";
         }
        return allOfIt;
    }
}
