
package lab05;
import java.util.Scanner;
public class Lab05 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Enter the product Name: ");
        String pname = scan.nextLine();
        
        System.out.println("Enter the product Code: ");
        Scanner code = new Scanner(System.in);
        long c = code.nextLong();
        
        System.out.println("Enter the quantity in stock: ");
        Scanner quantity = new Scanner(System.in);
        int q = quantity.nextInt();
        
        System.out.println("Enter the product price per unit: ");
        Scanner price = new Scanner(System.in);
        int p = price.nextInt();
        
        System.out.println("Enter the suplier name: ");
        Scanner sname = new Scanner(System.in);
        String s = sname.nextLine();
        
        System.out.println("Enter the product expiration date: ");
        Scanner date = new Scanner(System.in);
        int d = date.nextInt();
        
        System.out.println("Enter the number of products sold today: ");
        Scanner pst = new Scanner(System.in);
        int p1 = pst.nextInt();
        
        System.out.println("Enter the discount percentage: ");
        Scanner dp = new Scanner(System.in);
        int d1 = dp.nextInt();
        
        System.out.println("Enter the reorder threshold quantity: ");
        Scanner rtq = new Scanner(System.in);
        int r = rtq.nextInt();
        
        System.out.println("Enter the store location: ");
        Scanner location = new Scanner(System.in);
        String l = location.nextLine();
        
        System.out.println("Enter the product Name: " + pname);
        System.out.println("Enter the product Code: " + c);
        System.out.println("Enter the quantity in stock: " + q);
        System.out.println("Enter the product price per unit: " + p);
        System.out.println("Enter the suplier name: " + s);
        System.out.println("Enter the product expiration date: " + d);
        System.out.println("Enter the number of products sold today: " + p1);
        System.out.println("Enter the discount percentage: " + d1);
        System.out.println("Enter the reorder threshold quantity: " + r);
        System.out.println("Enter the store location: " + l);
        

    }
    
}
