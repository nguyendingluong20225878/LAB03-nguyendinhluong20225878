public class Aims {
    public static void main(String[] args) {
        Cart cart = new Cart();

        cart.addDigitalVideoDisc(new DigitalVideoDisc("DVD1", "Animation", "A", 80, 14.80f));
        cart.addDigitalVideoDisc(new DigitalVideoDisc("DVD2", "Science", "B", 120, 25.50f));
        cart.addDigitalVideoDisc(new DigitalVideoDisc("DVD3", "Animation", "C", 122, 17.00f));

        System.out.println("Total cost: " + cart.totalCost());

        cart.removeDigitalVideoDisc("DVD1");
        System.out.println("Total cost after removal: " + cart.totalCost());
    }
}
