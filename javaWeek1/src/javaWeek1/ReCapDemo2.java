package javaWeek1;

public class ReCapDemo2 {

	public static void main(String[] args) {
		double[] myList = {1.2,1.3,4.3,5.6};
		double total=0;
		double max =myList[0];
		for(double numbers:myList) {
			if(max<numbers) {
				max=numbers;
			}
			total += numbers;
			System.out.println(numbers);
		}
		System.out.println("Toplam  : "+total);
		System.out.println("En buyuk : "+max);
	}

}
