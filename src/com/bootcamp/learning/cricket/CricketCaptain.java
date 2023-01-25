package com.bootcamp.learning.cricket;

import java.util.Scanner;

public class CricketCaptain {
	
	Match match ;
	public static void main(String[] args) {
				
		Match match = new Match( new Team("Pakistan"), new Team("India"));
		
		match.play();
		
	}
}