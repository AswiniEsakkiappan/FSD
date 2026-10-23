
package Day_6;

public class FoodDelivery_Interface {
    public static void main(String[] args) {
        PizzaRestaurant p = new PizzaRestaurant();
        BurgerRestaurant b = new BurgerRestaurant();

        p.displayMenu();
        p.calculateBill();

        b.displayMenu();
        b.calculateBill();
    }
}

abstract class Restaurant {
    abstract void displayMenu();
    abstract void calculateBill();
}

class PizzaRestaurant extends Restaurant {
    @Override
    void displayMenu() {
        System.out.println("Pizza Restaurant Menu");
        System.out.println("Pizza - Rs.200");
        System.out.println("Garlic Bread - Rs.100");
    }

    @Override
    void calculateBill() {
        int pizza = 200;
        int garlicBread = 100;
        System.out.println("Pizza Restaurant Bill: Rs." + (pizza + garlicBread));
    }
}

class BurgerRestaurant extends Restaurant {
    @Override
    void displayMenu() {
        System.out.println("Burger Restaurant Menu");
        System.out.println("Burger - Rs.150");
        System.out.println("French Fries - Rs.80");
    }

    @Override
    void calculateBill() {
        int burger = 150;
        int fries = 80;
        System.out.println("Burger Restaurant Bill: Rs." + (burger + fries));
    }
}
