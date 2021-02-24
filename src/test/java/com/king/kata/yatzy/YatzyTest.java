package com.king.kata.yatzy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest {

	private YatzyScorer yatzyScorer;

	@BeforeEach
	public void setUp() {
		yatzyScorer = new YatzyScorer();
	}

	@Test
	public void chanceScoresCorrectly() {
		int score = yatzyScorer.calculateScore(Category.CHANCE, new YatzyRoll(5, 2, 1, 4, 6));
		assertEquals(18, score);
	}
	@Test
	public void YATSYScoresCorrectly() {
		int score = yatzyScorer.calculateScore(Category.YATSY, new YatzyRoll(5, 5, 5, 5, 5));
		assertEquals(50, score);
	}
	@Test
	public void NotYATSYScoresCorrectly() {
		int score = yatzyScorer.calculateScore(Category.YATSY, new YatzyRoll(4, 5, 5, 5, 5));
		assertEquals(0, score);
	}
	@Test
	public void ONESScoresCorrectly() {
		int score = yatzyScorer.calculateScore(Category.ONES, new YatzyRoll(1, 1, 1, 5, 5));
		assertEquals(3, score);
	}
	@Test
	public void NotONESScoresCorrectly() {
		int score = yatzyScorer.calculateScore(Category.ONES, new YatzyRoll(3, 3, 3, 5, 5));
		assertEquals(0, score);
	}
	@Test
	public void TWOSScoresCorrectly() {
		int score = yatzyScorer.calculateScore(Category.TWOS, new YatzyRoll(2, 2, 2, 5, 5));
		assertEquals(6, score);
	}
	@Test
	public void NotTWOSScoresCorrectly() {
		int score = yatzyScorer.calculateScore(Category.TWOS, new YatzyRoll(1, 1, 1, 5, 5));
		assertEquals(0, score);
	}
	@Test
	public void THREESScoresCorrectly() {
		int score = yatzyScorer.calculateScore(Category.THREES, new YatzyRoll(3, 3, 3, 5, 5));
		assertEquals(9, score);
	}
	@Test
	public void notTHREESScoresCorrectly() {
		int score = yatzyScorer.calculateScore(Category.THREES, new YatzyRoll(1, 1, 1, 5, 5));
		assertEquals(0, score);
	}
	@Test
	public void FOURSScoresCorrectly() {
		int score = yatzyScorer.calculateScore(Category.FOURS, new YatzyRoll(4, 4, 1, 5, 5));
		assertEquals(8, score);
	}
	@Test
	public void NotFOURSScoresCorrectly() {
		int score = yatzyScorer.calculateScore(Category.FOURS, new YatzyRoll(1, 1, 1, 5, 5));
		assertEquals(0, score);
	}
	@Test
	public void FIVESScoresCorrectly() {
		int score = yatzyScorer.calculateScore(Category.FIVES, new YatzyRoll(5, 5, 5, 1, 1));
		assertEquals(15, score);
	}
	@Test
	public void notFIVESScoresCorrectly() {
		int score = yatzyScorer.calculateScore(Category.FIVES, new YatzyRoll(1, 1, 1, 1, 1));
		assertEquals(0, score);
	}
	@Test
	public void SIXESScoresCorrectly() {
		int score = yatzyScorer.calculateScore(Category.SIXES, new YatzyRoll(6, 6, 6, 6, 5));
		assertEquals(24, score);
	}
	@Test
	public void NotSIXESScoresCorrectly() {
		int score = yatzyScorer.calculateScore(Category.SIXES, new YatzyRoll(1, 1, 1, 1, 5));
		assertEquals(0, score);
	}
	@Test
	public void PAIRScoresCorrectly() {
		int score = yatzyScorer.calculateScore(Category.PAIR, new YatzyRoll(5, 5, 1, 1, 6));
		assertEquals(10, score);
	}
	@Test
	public void NotPAIRScoresCorrectly() {
		int score = yatzyScorer.calculateScore(Category.PAIR, new YatzyRoll(1, 2, 3, 4, 6));
		assertEquals(0, score);
	}
	@Test
	public void TWOPAIRScoresCorrectly() {
		int score = yatzyScorer.calculateScore(Category.TWOPAIRS, new YatzyRoll(5, 5, 6, 6, 1));
		assertEquals(22, score);
	}
	@Test
	public void NotTWOPAIRScoresCorrectly() {
		int score = yatzyScorer.calculateScore(Category.TWOPAIRS, new YatzyRoll(1, 2, 3, 4, 6));
		assertEquals(0, score);
	}
	@Test
	public void THREEOFACINDScoresCorrectly() {
		int score = yatzyScorer.calculateScore(Category.THREEOFACIND, new YatzyRoll(5, 5, 5, 1, 6));
		assertEquals(15, score);
	}
	@Test
	public void NotTHREEOFACINDScoresCorrectly() {
		int score = yatzyScorer.calculateScore(Category.THREEOFACIND, new YatzyRoll(5, 5, 1, 1, 6));
		assertEquals(0, score);
	}
	@Test
	public void FOUROFACINDScoresCorrectly() {
		int score = yatzyScorer.calculateScore(Category.FOUROFACIND, new YatzyRoll(5, 5, 5, 5, 6));
		assertEquals(20, score);
	}
	@Test
	public void NotFOUROFACINDScoresCorrectly() {
		int score = yatzyScorer.calculateScore(Category.FOUROFACIND, new YatzyRoll(5, 5, 5, 1, 6));
		assertEquals(0, score);
	}
	@Test
	public void SMALLSTRAITScoresCorrectly() {
		int score = yatzyScorer.calculateScore(Category.SMALLSTRAIT, new YatzyRoll(1, 2, 3, 4, 5));
		assertEquals(15, score);
	}
	@Test
	public void NotSMALLSTRAITScoresCorrectly() {
		int score = yatzyScorer.calculateScore(Category.SMALLSTRAIT, new YatzyRoll(2, 2, 3, 4, 5));
		assertEquals(0, score);
	}
	@Test
	public void LARGESTRAITScoresCorrectly() {
		int score = yatzyScorer.calculateScore(Category.LARGESTRAIT, new YatzyRoll(2, 3, 4, 5, 6));
		assertEquals(20, score);
	}
	@Test
	public void NotLARGESTRAITScoresCorrectly() {
		int score = yatzyScorer.calculateScore(Category.LARGESTRAIT, new YatzyRoll(2, 3, 4, 5, 3));
		assertEquals(0, score);
	}
	@Test
	public void FULLHOUSEScoresCorrectly() {
		int score = yatzyScorer.calculateScore(Category.FULLHOUSE, new YatzyRoll(2, 2, 2, 5, 5));
		assertEquals(16, score);
	}
	@Test
	public void notFULLHOUSEScoresCorrectly() {
		int score = yatzyScorer.calculateScore(Category.FULLHOUSE, new YatzyRoll(3, 2, 2, 5, 5));
		assertEquals(0, score);
	}
}
