import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;
 
public class muunnin {
 
	public static void main(String[] args) {

        // VARIABLES
		double maara, dollari, euro, punta;
        DecimalFormat f = new DecimalFormat("##.##");
        Scanner sc = new Scanner(System.in);

        // TITLE OF THE PROGRAM
        System.out.println("--- VALUUTANMUUNNIN ---");
        System.out.println("(Valuuttakurssit ovat laskettu 29.4.2020.)");
		System.out.println("Anna luku: ");

        // CORE OF THE PROGRAM
		maara = sc.nextFloat();
            System.out.println(" ");
            System.out.println("----------------------------------");
 
            dollari = maara * 0.92;
			System.out.println(maara + " dollaria on: " + f.format(dollari) + " euroa.");
            euro = maara * 1.09;
			System.out.println(maara + " euroa on: " + f.format(euro) + " dollaria.");

			System.out.println("----------------------------------");

			punta = maara * 1.15;
			System.out.println(maara + " puntaa on: " + f.format(punta) + " euroa.");
			punta = maara * 1.25;
			System.out.println(maara + " puntaa on: " + f.format(punta) + " dollaria.");

            System.out.println("----------------------------------");

            dollari = maara * 0.80;
			System.out.println(maara + " dollaria on: " + f.format(dollari) + " puntaa.");
            euro = maara * 0.87;
			System.out.println(maara + " euroa on: " + f.format(euro) + " puntaa.");

            System.out.println("----------------------------------");
            System.out.println(" ");

        // ARRAYLIST OF FUN FACTS
        ArrayList<String> randomiLause = new ArrayList<>();
        randomiLause.add("Fun fact: On olemassa yli 100 erilaista virusta, jotka aiheuttavat normaalin flunssan.");
        randomiLause.add("Fun fact: Bermudan kolmiossa ei tilastollisesti tapahdu normaalia enemmän onnettomuuksia.");
        randomiLause.add("Fun fact: 40% maailman viineistä valmistetaan Italiassa ja Ranskassa.");
        randomiLause.add("Fun fact: Bill Gates aloitti ohjelmoinnin 13-vuotiaana.");
        
        // GENERATES RANDOMLY ONE OF THOSE FOUR FUN FACTS
        int x = (int) (Math.random() * randomiLause.size());
        String y = randomiLause.get(x);
        System.out.println(y);
        System.out.println(" ");

		}
		
	}
 