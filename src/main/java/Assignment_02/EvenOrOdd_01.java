 package Assignment_02;
import java.util.Scanner;


class EvenOrOdd_01{
public static void main(String args[]){

Scanner s=new Scanner(System.in);

System.out.println("Enter your number\t");
short num=s.nextShort();

if(num%2==0){
System.out.println(num+" is even");

}
else{
System.out.println(num+" is odd");
}

}
}