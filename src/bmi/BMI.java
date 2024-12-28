package bmi;
import java.util.Scanner;
public class BMI {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);		

String Name;
int age;
String sex;
float weight, height, BMI;


System.out.print("Name : ");
Name=s.next();
System.out.print("Age : ");
age=s.nextInt();
System.out.print("Sex : ");
sex=s.next();

System.out.print("Weight in Kgs : ");
weight=s.nextFloat();

System.out.print("Height in M : ");
height=s.nextFloat();

BMI=weight/(height*height);

System.out.print("Your BMI is : " + BMI + " ");

if(BMI <= 18.5) 
{System.out.print("Underweight");}
if(BMI >= 18.6 && BMI <=24.9) 	
{System.out.print("Normal");}
if (BMI >= 25.0 && BMI <= 34.9)
{System.out.print("Overweight");}



}
}
