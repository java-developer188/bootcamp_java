package com.bootcamp.learning.cricket;

import java.lang.annotation.Target;
import java.util.Scanner;

public class Match {
	public Team team1;
	public Team team2;
	public Toss toss;
	public boolean Config_SHOWEACH_BALL = false;

	protected Match(Team team1, Team team2) {
		super();
		this.team1 = team1;
		this.team2 = team2;
	}

	public void play() {
		this.toss = new Toss(new Scanner(System.in));
		toss.doToss(team1, team2);
		int target = firstInnings();
		int secondInningsScore = secondInnings(target);
		if (target > secondInningsScore) {
			System.out.println("Congratulations " + toss.getTeamToBatFirst().getName() + " wins...!");
		} else if (target < secondInningsScore) {
			System.out.println("Congratulations " + toss.getTeamToBowlFirst().getName() + " wins...!");
		} else {
			System.out.println("Match Draw");
		}

	}

	private Integer firstInnings() {
		return play(toss.getTeamToBatFirst(), false, 0);
	}

	private Integer secondInnings(Integer target) {
		return play(toss.getTeamToBowlFirst(), true, target);
	}

	private Integer play(Team team, boolean isSecondInnings, int target) {
		int totalBalls = 300;
		int runs = 0;
		int wickets = 0;
		int overs = 0;
		int balls = 0;
		int ballsDone = 0;

		for (ballsDone = 0; (ballsDone < totalBalls && wickets < 10); ballsDone++) {
			int num = (int) (Math.random() * 8);
			if (num > 6) {
				ballsDone--;
				runs += num - 6;
				if (Config_SHOWEACH_BALL) {
				System.out.println("Extra run : " + (num - 6));
				}
			} else if (num == 5) {
				wickets++;
				if (Config_SHOWEACH_BALL) {
				System.out.println("Wicket down");
				}
			} else {
				runs += num;
				if (Config_SHOWEACH_BALL) {
					System.out.println("Got " + num + " run/s..!");
				}
			}
			if (isSecondInnings && runs >= target) {
				break;
			}
		}

		System.out.println("Runs : " + runs);
		System.out.println("Wickets : " + wickets);
		balls = ballsDone % 6;
		overs = (ballsDone - balls) / 6;
		System.out.println("Overs : " + overs + "." + balls);
		return runs;
	}

	@Override
	public String toString() {
		return "Match [" + team1 + " VS " + team2 + "]";
	}
}