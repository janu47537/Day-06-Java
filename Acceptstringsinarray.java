import java.util.*;
public class Acceptstringsinarray{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String arr[]=new String[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.next();
        }
        for(int i=0;i<a;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}