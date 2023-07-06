package com.github.zipcodewilmington;
import java.util.Arrays;


import java.util.Random;
import java.util.Scanner;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */

public class Hangman {
    public static void main(String[] args) {
        String [] words={"dog","cat","redpanda","chicken","giant","correct","picture","coffee","tea","bread"};
        //words to guess
        Random rd =new Random();
        //random num to choose word
        int guesses;
        //gameover status
        boolean gameover=false;
        //users guess
        String guess;

        //new scanner
        Scanner userGuess=new Scanner(System.in);
        //set bound of random num
        int rand=(rd.nextInt(10));

        //word to guess sets random word
        String wordToGuess = (words[rand]);
        //the letters user has guessed
        StringBuilder lettersGuessed = new StringBuilder();
        String lettersGuessedstring = "";
        //set length of letters guess to word to gueess
        lettersGuessed.setLength(wordToGuess.length());
        //initialize guesses
        guesses = wordToGuess.length();
        //char array to store guesses
        char[] makeWord = new char[guesses];
        //runs program
        while (!gameover) {
            System.out.println("Guess the word!!!\nyou have "+guesses+" guesses");
            //gets use input
            String g = userGuess.nextLine();
            for (int i = 0; i < wordToGuess.length(); i++) {
                //guess=char at i
                guess= String.valueOf(wordToGuess.charAt(i));

                //
                //guessCompare= g;
                if(guess.equals(g)){

                    makeWord [i]=wordToGuess.charAt(i);
                    
                    lettersGuessed.replace(i,i+1, String.valueOf(makeWord[i]));
                    lettersGuessedstring= String.valueOf(lettersGuessed);
                }
                //System.out.print(str.charAt(i) + " ");
            }
            System.out.println("word guessed so far "+ lettersGuessedstring);
            guesses--;
            if(lettersGuessedstring.equals(wordToGuess)){
                System.out.println("congrats you won");
                gameover=true;
            }
            else if(guesses==0){
                gameover=true;
                System.out.println("Game Over no more guesses");
                System.out.println("word was "+wordToGuess);
            }


        }


    }


}
