package javaWeek1;

public class ReCapDemo1 {

	public static void main(String[] args) {
		int sayi1 = 27;
		int sayi2 = 35;
		int sayi3 = 273;
		int enBuyuk = sayi1;
		
		if (enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
		
		if(enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		
		System.err.println("En buyuk = "+enBuyuk);
	}
}
