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
public abstract class Product {
    protected String name;
    protected int price;
    
    public Product(String nume, int price)
    {
        name = new String(nume);
        this.price = price;
    }
    
    public abstract float getprice(int quantity);
}
