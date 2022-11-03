package week1.day1;

public class Car {
public void applyBreak() {
	System.out.println("Applied Break");
}
public void soundHorn() {
	System.out.println("Sound Horn");
}
public static void main(String[] args) {
	Car obj3 = new Car();
	
	obj3.applyBreak();
	obj3.soundHorn();
}
}