import java.util.Scanner;
public class Function{
    public static void Sum_Of_Digits(int num){
        int sum=0,dig;
        while(num!=0)
        {
            dig=num%10;
            sum=sum+dig;
            num=num/10;
        }
        system.out.println("Sum="+sum);
        }
    public static void main(String[] args)
    {
        int onum;
        Scanner sc=new Scanner(System.in);
        system.out.println("Enter a number:");
        onum=sc.nextInt();
        Sum_Of_Digits(onum);

}    
}
