package javaWeek1;

public class StringsDemo {

	public static void main(String[] args) {
		String mesaj = "Bugun hava cok guzel.";
		System.out.println(mesaj);
		
		/*
		System.out.println("Eleman sayisi : "+mesaj.length());
		System.out.println("5. eleman : "+mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yasasin!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
		char [] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a'));
		System.out.println(mesaj.lastIndexOf('a'));
		*/
		
		String yeniMesaj = mesaj.replace(' ','-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,4)); // 2 ve 3 alır
		
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase()); // tüm harfleri küçük yapar
		System.out.println(mesaj.toUpperCase()); // tüm harfleri büyük yapar		
		System.out.println(mesaj.trim()); // başındaki ve sonundaki boşlukları siler
	}

}
