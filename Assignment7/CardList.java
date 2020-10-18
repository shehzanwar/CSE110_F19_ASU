//***********************************************************
// Name: Shehzad Anwar
// Title: CardList.java
// Description: Write the description in your words.
// Time spent:  how long it took you to complete the assignment
// Date: 11/21/19
//**********************************************************

/*** Part #1 Answer
 * a) public int[] swapEnds(int[] nums) {
 *      int temp = nums[0];
 * 	    nums[0] = nums[nums.length-1];
 * 	    nums[nums.length-1] = temp;
 * 	    return nums;}
 *
 * b) public boolean commonEnd(int[] a, int[] b) {
 *      return (a[0] == b[0] || a[a.length-1] == b[b.length-1]);}
 *
 * c) public int countEvens(int[] nums) {
 * 	    int count = 0;
 * 	    for(int i = 0; i < nums.length; i++)
 *          {
 * 		    if(nums[i] % 2 == 0)
 * 			count++;
 *          }
 * 	    return count;}
 *
 * d) public int sum13(int[] nums) {
 * 	    int sum = 0;
 * 	    for(int i = 0; i < nums.length; i++)
 *          {
 * 		    if(nums[i] == 13)
 * 			i++;
 * 	    else
 * 			sum += nums[i];
 *    }
 * 	  return sum;}
 *
 * e) public int[] fix34(int[] nums)
 * {
 * 	int k = 1;
 * 	for(int i = 0; i < nums.length - 1; i++)
 *        {
 * 		if(nums[i] == 3 && nums[i+1] != 4)
 *        {
 * 			for(; nums[k] != 4; k++);
 * 			nums[k] = nums[i+1];
 * 			nums[i+1] = 4;
 *        }
 *    }
 * 	return nums;}
 ***/

import java.util.Arrays;
import java.util.Random;

public class CardList {

    private char[] cards;
    private String history;

    public CardList(int numberOfCard) {
        history = "";
        String cardTypes = "A23456789JQK";
        cards = new char[numberOfCard];
        Random randNumGen = new Random();
        for (int i = 0; i < cards.length; i++) {
            int randInt = randNumGen.nextInt(cardTypes.length());
            cards[i] = cardTypes.charAt(randInt);
            if (randInt != 0 || randInt != cardTypes.length() - 1) {
                cardTypes = cardTypes.substring(0, randInt) + cardTypes.substring(randInt + 1);
            }
        }
        for (int j=0;j<cards.length;j++) {
            System.out.print(cards[j]+" ");
        }

    }

    public void flip() {
        int start = 0;
        int end = cards.length - 1;

        while( start < end ) {
            char temp = cards[start];
            cards[start] = cards[end];
            cards[end] = temp;

            start++;
            end--;
        }

        history += Arrays.toString(cards) + ": Flip\n";

    }

    public void shift() {
        char firstElement = cards[0];
        for (int i = 0; i < cards.length -1; i++) {
            cards[i] = cards[i + 1];
        }
        cards[cards.length - 1] = firstElement;

        history += Arrays.toString(cards) + ": Shift\n";
    }

    public void shuffle() {
        String preShuffleCards = "";
        int[] shuffledIndeces = shuffleIndex();
        for(int i = 0; i < cards.length; i++) {
            preShuffleCards += cards[i] + "";
        }

        for(int j = 0; j < cards.length; j++) {
            cards[j] = preShuffleCards.charAt(shuffledIndeces[j]);
        }

        history += Arrays.toString(cards) + ": Shuffle\n";
    }

    public void change(int size) {
        if(size < 0 || size >= cards.length) {
            return;
        }
        String cardTypes = "A23456789JQK";
        Random randNumGen = new Random();
        for (int i = 0; i < size; i++) {
            int randInt = randNumGen.nextInt(cards.length);
            cards[i] = cardTypes.charAt(randInt);
        }

        history += Arrays.toString(cards) + ": Change\n";
    }

    private int[] shuffleIndex() {
        int[] toReturn = new int[cards.length];
        for(int i = 0; i < toReturn.length; i++) {
            toReturn[i] = i;
        }
        System.out.println(Arrays.toString(toReturn));
        Random randNumGen = new Random();
        for(int j = 0; j < toReturn.length; j++) {
            int randIndex = randNumGen.nextInt(j + 1);
            int a = toReturn[randIndex];
            toReturn[randIndex] = toReturn[j];
            toReturn[j] = a;
        }
        return toReturn;
    }

    public String getHistory() {
        return history;
    }

}
