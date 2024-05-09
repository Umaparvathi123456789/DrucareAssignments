package com.drucare.task2;
import java.time.DayOfWeek;
import java.time.LocalDate;
public class Weeks {
public static void main(String[] args) {
	
//Scanner name=new Scanner(System.in);
//System.out.println("enter the day: ");
//String day=name.nextLine();
//if(day=="Saturday" || day=="Sunday")
//{
//System.out.println("its weekend")	;
//}
//else
//	System.out.println("its weekday")	;
//
//name.close();

    LocalDate today = LocalDate.now();
    DayOfWeek dayOfWeek = today.getDayOfWeek();

    if(dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
        System.out.println("It's weekend :)  :- "+today);
    } 
    else {
        System.out.println("It's weekday :(  :- "+today);
}
}}
