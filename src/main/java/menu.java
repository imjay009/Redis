import java.util.Scanner;

public class menu {

    public static Integer id =0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("1.Add product.");
            System.out.println("2.View product.");
            System.out.println("3.Add to cart.");
            System.out.println("4.Order Product.");
            System.out.println("5.New Arrivals.");
            System.out.println("6.Top Selling.");
            System.out.println("7.Trending.");
            System.out.println("8.Under Performing.");
            System.out.println("9.Exit.");

            choice = scanner.nextInt();

            AddProduct ap = new AddProduct();
            ViewProduct vp = new ViewProduct();
            NewArrivals na = new NewArrivals();
            AddToCart atc = new AddToCart();
            OrderProduct op = new OrderProduct();
            TopSelling ts = new TopSelling();
            Trending trend = new Trending();
            UnderPerforming up = new UnderPerforming();
            switch(choice) {
                case 1: ap.product();
                        break;

                case 2: System.out.println("Please enter product Id: ");
                        String id = scanner.next();
                        vp.product(id);
                        break;

                case 3: System.out.println("Please enter product Id: ");
                        String id2 = scanner.next();
                        atc.cart(id2);
                        break;

                case 4: na.product();
                        break;

                case 5: System.out.println("Please enter product Id: ");
                        String id3 = scanner.next();
                        op.product(id3);
                        break;

                case 6: ts.product();
                        break;

                case 7: trend.product();
                        break;

                case 8: up.product();
                        break;

                case 9: break;
            }
        } while(choice != 9);
    }
}