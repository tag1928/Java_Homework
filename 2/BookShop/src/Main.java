public class Main {

    public static void main(String[] args) throws Exception{
        BookShop shop = new BookShop();
        shop.addBooksInStore(7500);

        Customer peter = new Customer("Peter", shop);
        Customer paul = new Customer("Pauls", shop);

        Thread t1 = new Thread(() -> peter.buy5000Books());
        Thread t2 = new Thread(() -> paul.buy5000Books());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        shop.printSummary();
        peter.printSummary();
        paul.printSummary();
    }
}