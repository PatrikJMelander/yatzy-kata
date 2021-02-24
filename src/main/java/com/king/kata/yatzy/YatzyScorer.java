package com.king.kata.yatzy;

public class YatzyScorer {
	public int calculateScore(Category category, YatzyRoll roll) {

		return switch (category) {
			case CHANCE -> roll.getSum();
			case YATSY -> roll.getYatzy();
			case ONES -> roll.getOneToSix(1);
			case TWOS -> roll.getOneToSix(2);
			case THREES -> roll.getOneToSix(3);
			case FOURS -> roll.getOneToSix(4);
			case FIVES -> roll.getOneToSix(5);
			case SIXES -> roll.getOneToSix(6);
			case PAIR -> roll.getPair();
			case TWOPAIRS -> roll.getTwoPair();
			case THREEOFACIND -> roll.getThreeOfAKind();
			case FOUROFACIND -> roll.getFourOfAKind();
			case SMALLSTRAIT -> roll.getSmallStrait();
			case LARGESTRAIT -> roll.getLargeStrait();
			case FULLHOUSE -> roll.getFullHouse();
		};
	}
}
