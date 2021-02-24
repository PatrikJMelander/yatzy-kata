package com.king.kata.yatzy;

import java.util.Arrays;

public class YatzyRoll {
	private final int[] dice;

	public YatzyRoll(int d1, int d2, int d3, int d4, int d5) {

		dice = new int[]{d1, d2, d3, d4, d5};
	}

	public int getSum (){
		return Arrays.stream(dice).sum();
	}

	public int getPair (){
		int sum = 0;
		Arrays.sort(dice);
		for (int i = 4; i < dice.length; i--) {

		if (dice[i] == dice[i-1]){
				sum = dice[i] + dice[i-1];
				return sum;
			}
		else sum = 0;

			if (i==1)
				break;
		}

		return sum;
	}
	public int getTwoPair (){
		int sum = 0;
		int counter = 0;
		Arrays.sort(dice);
		for (int i = 4; i < dice.length; i--) {

			if (dice[i] == dice[i-1]){
				sum += dice[i] + dice[i-1];
				i--;
				counter++;
				if (counter==2)
					return sum;
			}
			else sum = 0;

			if (i==1)
				break;
		}
		return sum;
	}

	public int getYatzy (){
		int sum = 0;

		for (int i = 0; i < dice.length; i++) {
			if (i==4){
				if (dice[i] == dice[i-1]){
					sum += dice[i];
				}
				else return sum = 0;
			}else if (dice[i] == dice[i+1]){
				sum += dice[i];
			}
			else return sum = 0;
		}
		if (sum > 0)
			return 50;
		return sum;
	}
	public int getOneToSix (int value){
		int sum = 0;

		for (int i = 0; i < dice.length; i++) {
			if (dice[i] == value){
				sum += dice[i];
			}
		}
		return sum;
	}
	public int getThreeOfAKind (){
		int sum = 0;
		Arrays.sort(dice);
		for (int i = 4; i < dice.length; i--) {

			if (dice[i] == dice[i-1] && dice[i] == dice[i-2]){
				sum = dice[i] + dice[i-1] + dice[i-2];
				return sum;
			}
			else sum = 0;

			if (i==2)
				break;
		}

		return sum;
	}
	public int getFourOfAKind(){
		int sum = 0;
		Arrays.sort(dice);
		for (int i = 4; i < dice.length; i--) {

			if (dice[i] == dice[i-1] && dice[i] == dice[i-2] && dice[i] == dice[i-3]){
				sum = dice[i] + dice[i-1] + dice[i-2]+ dice[i-3];
				return sum;
			}
			else sum = 0;

			if (i==3)
				break;
		}

		return sum;
	}
	public int getSmallStrait (){
		int counter = 0;
		Arrays.sort(dice);
		for (int i = 0; i < dice.length; i++) {
			if (dice[i]==i+1)
				counter++;
		}
		if (counter == 5)
			return 15;
		else return 0;
	}
	public int getLargeStrait (){
		int counter = 0;
		Arrays.sort(dice);
		for (int i = 0; i < dice.length; i++) {
			if (dice[i]==i+2)
				counter++;
		}
		if (counter == 5)
			return 20;
		else return 0;
	}
	public int getFullHouse(){
		int collect3 = getThreeOfAKind();
		int collect2 =0;
		Arrays.sort(dice);
		if (!(collect3 ==0)){
			for (int i = 0; i < dice.length; i++) {
				if (dice[i]==(collect3/3)){
					continue;
				}else if (dice[i]==dice[i+1]){
					collect2 = dice[i]+dice[i+1];
					break;
				}
				else return 0;
			}
		}else return 0;
		if (collect2 == 0){
			return 0;
		}
		return collect2+collect3;
	}
}

