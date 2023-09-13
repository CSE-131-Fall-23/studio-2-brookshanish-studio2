package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		int startAmount;
		double winChance;
		int winLimit;

		Scanner in = new Scanner(System.in);
		System.out.println("Start Amount: ");
		startAmount = in.nextInt();
		System.out.println("Win Chance: ");
		winChance = in.nextDouble();
		System.out.println("Win Limit: ");
		winLimit = in.nextInt();

		//		while(startAmount < winLimit && startAmount > 0) {
		//			if (Math.random() < winChance) {
		//				System.out.println("WIN");
		//				startAmount++;
		//			}else{
		//			System.out.println("LOSE");
		//				startAmount--;
		//			}
		//		}

		int totalSimulations;
		System.out.println("Total Simulations: ");
		totalSimulations = in.nextInt();
		int newAmount = startAmount;
		int plays = 0;
		int ruins = 0;


		for (int i = 0; i < totalSimulations; i++) {
			newAmount = startAmount;
			plays = 0;
			while (newAmount < winLimit && newAmount > 0) {
				if (Math.random() < winChance) {
					newAmount++; 
					plays++;
				}else{
					newAmount--; 
					plays++;
				}
			}
			if(newAmount == 0) {
				System.out.println("Simulation " + i + ": " + plays + " RUIN");
				ruins++;
			}else {
				System.out.println("Simulation " + i + ": " + plays + " SUCCESS");
			}
		}
		double ruinRate = (double)ruins/totalSimulations;
		System.out.print("Ruin Rate from Simulation: " + ruinRate);
		double expectedRuin = 0.0
				if(winChance = 0.5) {
					expectedRuin = 1 - (startAmount/winLimit);
				}else {
					(((1-winChance)/winChance)^startAmount) - (((1-winChance)/winChance)^winLimit) / 1 - (((1-winChance)/winChance)^winLimit);
				}
	}
}
