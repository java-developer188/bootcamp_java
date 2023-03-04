package com.bootcamp.learning.cricket;

import java.util.Scanner;

public class Toss {

	Scanner scanner;
	Team teamToBatFirst;
	Team teamToBowlFirst;

	public enum Values {
		HEADS, TAILS;
	}

	public Toss(Scanner scanner) {
		this.scanner = scanner;
	}

	public void doToss(Team teamA, Team teamB) {
		Team[] teams = new Team[] {teamA , teamB};
		int call, tossResult, tossWinner = 0;
		
		int teamToCall = (int) (Math.random() * 2);
		System.out.println(teams[teamToCall].getName() + " to call;\n Press \n  0 for Head\n  1 for Tail\n\n");
		
		try {
			boolean continueLoop;
			do {
				continueLoop = false;
				call = scanner.nextInt();
				if ((call != 0) && (call != 1)) {
					System.out.println("Invalid input.\n Press \n  0 for Head\n  1 for Tail\n\n");
					continueLoop = true;
				}
			} while (continueLoop);
			System.out.println("\r" + teams[teamToCall].getName() + " calls "
					+ (call == Values.HEADS.ordinal() ? "HEADS" : "TAILS"));
			
			Thread.sleep(2000);
			tossResult = (int) (Math.random() * 2);
			System.out.println("Its " + (tossResult == Values.HEADS.ordinal() ? "HEADS" : "TAILS"));
			
			if (call == tossResult) {
				System.out.println(teams[teamToCall].getName() + " win the toss..!");
				tossWinner = teamToCall;
			} else {
				System.out.println(teams[1 - teamToCall].getName() + " win the toss..!");
				tossWinner = 1 - teamToCall;
			}

			// hard coded logic
			teamToBatFirst = teams[tossWinner];
			teamToBowlFirst = teams[1 - tossWinner];

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public Team getTeamToBatFirst() {
		return teamToBatFirst;
	}

	public Team getTeamToBowlFirst() {
		return teamToBowlFirst;
	}

}
