package javaWeek1;

public class SwitchDemo {

	public static void main(String[] args) {
		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("Mukemmel : Gectiniz");
			break;
		case 'B':
			System.out.println("Cok guzel : Gectiniz");
			break;
		case 'C':
			System.out.println("Iyı : Gectiniz");
			break;
		case 'D':
			System.out.println("Fena degil : Gectiniz");
			break;
		case 'F':
			System.out.println("Maalesef kaldiniz");
			break;
		default:
			System.out.println("Gecersiz not girdiginz");

		}
	}
}
