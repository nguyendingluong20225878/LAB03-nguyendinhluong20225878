import java.util.ArrayList;

public class Cart {
    public static final int MAX_CAPACITY = 20;
    private ArrayList<DigitalVideoDisc> item = new ArrayList<>();

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (item.size() < MAX_CAPACITY) {
            item.add(disc);
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }

    public void removeDigitalVideoDisc(String title) {
        for (DigitalVideoDisc disc : item) {
            if (disc.getTitle().equals(title)) {
                item.remove(disc);
                System.out.println("The disc has been removed.");
                return;
            }
        }
        System.out.println("The disc is not in the cart.");
    }

    public float totalCost() {
        float total = 0;
        for (DigitalVideoDisc disc : item) {
            total += disc.getCost();
        }
        return total;
    }

    public void viewCart() {
        System.out.println("Cart Contents:");
        for (DigitalVideoDisc disc : item) {
            System.out.println(disc);
        }
    }
}
