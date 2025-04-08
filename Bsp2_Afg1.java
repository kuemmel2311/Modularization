package Tag07_fkt;

import java.util.Scanner;

public class Bsp2_Afg1 {

	public static void main(String[] args) {
		// EINGABE
		double umsatz = eingabe();
			
		// VERARBEITUNG
		
		// Rabattsatzberechnung
		double rabattsatz = rabattsatz(umsatz);
		// Wie viel Rabatt bekommt der Kunde?
		double rabatt = rabatt(umsatz,rabattsatz);
		// Wie viel zahlt der Kunden abzgl. Rabatt?
		double zahlbetrag = zahlbetrag(umsatz,rabatt);
		
		// AUSGABE
		ausgabe(umsatz,rabattsatz,rabatt,zahlbetrag);
	}
		
	public static double eingabe() {
		Scanner input = new Scanner(System.in);
		System.out.print("Bitte Ihren Umsatz in EUR eingeben: ");
		double umsatz = input.nextDouble();
		input.close();
		return umsatz;
	}
		
	public static double rabattsatz(double umsatz) {
		double rabattsatz;
		if (umsatz<=1000) {
			rabattsatz=1.0;
		} else if (umsatz<=2500) {
			rabattsatz=3.0;
		} else if (umsatz<=5000) {
			rabattsatz=5.0;
		} else if (umsatz<10000) {
			rabattsatz=7.0;
		} else {
			rabattsatz=10.0;
		}
		return rabattsatz;
	}
	
	public static double zahlbetrag(double umsatz, double rabatt) {
		double zahlbetrag =  umsatz-rabatt;
		return zahlbetrag;
	}
		
	public static double rabatt(double umsatz, double rabattsatz) {
		double rabatt = umsatz*rabattsatz/100;
		return rabatt;
	}
		
	public static void ausgabe(double umsatz, double rabattsatz, double rabatt, double zahlbetrag) {
		System.out.println("Für den Umsatz "+umsatz+" EUR erhalten sie "+rabattsatz+" % Rabatt.");
		System.out.println("Der Rabatt beträgt "+rabatt+" EUR.");
		System.out.println("Sie zahlen nur "+zahlbetrag+" EUR.");
	}

}
