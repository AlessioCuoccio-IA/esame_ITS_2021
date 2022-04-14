package calcolaMedia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Calcolatore {
	public static void inizia() {
		System.out.println("Inserisci 10 numeri, uno per volta: ");
		Scanner scan = new Scanner(System.in);
		ArrayList<Float> numeri = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			numeri.add(scan.nextFloat());
		};
		scan.close();
		System.out.println("La media dell'array è " + calcolaMedia(numeri));
		rimuovi5NumeriPiuBassi(numeri);
		System.out.println("La media dell'array dopo aver rimosso i 5 numeri più bassi è " + calcolaMedia(numeri));
	};
	
	public static float calcolaMedia(ArrayList<Float> numeri) {
		float somma = 0;
		float media = 0; 
		
		for (Float fl : numeri) {
			somma += fl;
			
		}
		media = somma/numeri.size();
		return media;
	};
	
	public static  void rimuovi5NumeriPiuBassi(ArrayList<Float> numeri) {
		Collections.sort(numeri);
		for (int i = 0; i< 5; i++) {
			numeri.remove(0);
		};		
	};

	public static void main(String[] args) {
		try {
			inizia();
		} catch (Exception e) {
			System.err.println("Puoi inserire solo numeri, comincia di nuovo");
			inizia();
		}
	}

}
