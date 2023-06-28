import java.util.Scanner;
public class Sandglass {
public static void main(String[] args)  
{  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the size:");  
int size = sc.nextInt();              
for (int i= 0; i<= size-1 ; i++)  
{  
for (int j=0; j<i; j++)  
{  
System.out.print(" ");  
}  
for (int k=i; k<=size-1; k++)   
{   
System.out.print("*" + " ");   
}   
System.out.println("");   
}   
for (int i= size-1; i>= 0; i--)  
{  
for (int j=0; j<i; j++)  
{  
System.out.print(" ");  
}  
for (int k=i; k<=size-1; k++)  
{  
System.out.print("*" + " ");  
}  
System.out.println("");  
}  
}
}