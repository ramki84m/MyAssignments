package week1.day1;

public class Mobile {
public void makeCall() {
String mobileModel="Nokia";
float mobileWeight=150.00f;
System.out.println("Make Call");
}
private void sendMsg() {
boolean FullCharged=true;
int MobileCost=10000;
System.out.println("Send SMS");
}
public static void main(String[] args) {
	Mobile obj= new Mobile();
	obj.makeCall();
	obj.sendMsg();
	System.out.println();
}
}