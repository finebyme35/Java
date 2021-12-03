import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		
		System.out.println("Lütfen faktöriyel hesaplamak için bir değer giriniz: ");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		faktoriel(number);
		
		
		
	}
	
	public static void faktoriel(int n) {

		int answer = 1;
		if(n == 0 || n < 0) {
			System.out.println("Lütfen sıfırdan farklı veya eksi değer girmeyiniz");
			
		}
		else {
			for(int i = n; i > 0; i--) {
				answer = answer * i;
				
				
			}
			System.out.println(answer);
			
		}
		
		
		
	}
	
	
}
