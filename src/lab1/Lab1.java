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
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cart cart = new Cart();
        Laptop prod1 = new Laptop("HP",1000);
        Mobile prod2 = new Mobile("iPhone",3500);
	Mobile prod3 = new Mobile("Samsung g6",3232);
        prod1.setProcessor("2.4 GHZ");
        prod1.setScreenSize(19);
        prod2.setMemory(100);
        prod2.setOS("Winbdows 10");
	prod3.setMemory(32);
	prod3.setOS("Android");
        cart.addToCart(prod1,2);
        cart.addToCart(prod2,2);
        System.out.println("Pretul este "+cart.getTotalPrice());
        System.out.println("Configuratii: ");
        System.out.println(cart.toString());
    }
    
}
