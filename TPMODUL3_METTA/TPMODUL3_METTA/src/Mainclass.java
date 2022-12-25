import java.util.Scanner;
public class Mainclass {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        Restaurant machine = new Restaurant();
        int customerID, orderQty;
        try {

            System.out.println("Masukkan ID pelanggan: ");
            customerID = input.nextInt();

            System.out.println("Masukkan berapa jumlah yang ingin dipesan: ");
            orderQty = input.nextInt();

            Thread t1 = new Thread(machine);
            Waiters waiter = new Waiters(customerID, orderQty);
            Thread t2 = new Thread(waiter);

            t1.start();
            t2.start();
            t1.join();
            t2.join();

        } catch (Exception e) {
            System.out.println("Data type yang dimasukkan harus Integer");
        }

    }
}