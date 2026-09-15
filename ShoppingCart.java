import java.util.Scanner;
public class ShoppingCart
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items in the shopping cart: ");
        int itemCount = scanner.nextInt();
        double total = 0.0;

        for (int i = 1; i <= itemCount; i++)
        {
            System.out.print("\nitem " + i + "details ");
            System.out.print("Enter item name: ");
            String itemName = scanner.next();
            System.out.print("Enter item price per unit: ");
            double price = scanner.nextDouble();
            System.out.print("Enter item quantity: ");
            int qty = scanner.nextInt();
            double itemTotal = price * qty;
            total+= itemTotal;
            System.out.println("Total cost for " + itemName + ": $" + itemTotal);
        }
        double tax=total*0.05;
        double grandtotal=total+tax;
        double deliveryCharge;
        if(grandtotal<=500)
        {
            deliveryCharge=50;
        }
        else if(grandtotal<=1000)
        {
            deliveryCharge=30;   
        }
        else
        {
            deliveryCharge=0;
        }

            grandtotal+=deliveryCharge;
            System.out.println("total including all tax=" + (total+tax));
            System.out.println("Delivery charge: $" + deliveryCharge);
            System.out.println("Final amount to pay: $" + grandtotal);
    }
            
        

        
    
}