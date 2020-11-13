/**
 * Matthew Ozoroski
 * Module 08 Problem 1
 * BeerSong constructor takes number of beers initially on the wall. Returns the Beer Song lyrics starting from that number.
 **/






public class BeerSong      //Creates BeerSong class
{

	private int bottlesOfBeer;                   
	private static final String[] tensNames = {        //returns tens names. Did not use a switch statement. Online Tutor showed me how to do this part.
			    "",
			    "ten",
			    "twenty",
			    "thirty",
			    "forty",
			    "fifty",
			    "sixty",
			    "seventy",
			    "eighty",
			    "ninety"
			  };

	  private static final String[] numNames = {      //returns numbers 1-19
	    " ",
	    "one",
	    "two",
	    "three",
	    "four",
	    "five",
	    "six",
	    "seven",
	    "eight",
	    "nine",
	    "ten",
	    "eleven",
	    "twelve",
	    "thirteen",
	    "fourteen",
	    "fifteen",
	    "sixteen",
	    "seventeen",
	    "eighteen",
	    "nineteen"
	  };

   
   
   public BeerSong(int n){     //constructor takes an integer parameter 
	   if (n < 0){                          //number less than 0 returns 0
		   bottlesOfBeer = 0;
	   }else if(n > 99){                    //number greater than 99 will return 99
		   bottlesOfBeer = 99;
	   }else{              
		   bottlesOfBeer = n;                //bottlesOfBeer will be equal to the number
	   }
   }
   
   public String convert(int number){                         //Converts a number to a number in English.
	   String str = "";                                        //Initialized with a blank String variable named str
	   if(number == 0){                                        //Converts 0 to zero
		   str = "zero";
	   }else if(number < 20){
		   str = numNames[number];                              //numbers 1-19 will be converted to English
	   }else{
		   int tens = number/10;                                //divides number by 10 and determines which one of the tens number to use
		   int ones = number%10;                                //Gives remainder when dividing by 10 and determines which number 1-9 will be put after the tens number
		   if (ones == 0){
			   str = tensNames[tens];
		   }else{                                               //Converts numbers 20-99 to English
			   str = tensNames[tens] +"-"+numNames[ones];        //Puts the tens and ones together. For Example, twenty-one
		   }
		   
	   }
	   
	   return str;                                             //str is returned to the method convert()
   }
   
   public void PrintSong(){
	   for(int i = bottlesOfBeer; i > 0; i--){                                                      //Method prints song lyrics using printf
		   String word = convert(i);                                                                 //there are two words used in each verse. For Example, 99 and 98 are used in the first verse 
		   String nextWord = convert(i-1);                                                           //The nextWord refers to 98 in our example 
		   if(i==1){
			   System.out.printf("%s bottle of beer on the wall, %s bottle of beer.%n", word, word);                 //Lyrics must be changed when there's only 1 bottle of beer. The word "bottles" is changed to "bottle"

		   }else{
			   System.out.printf("%s bottles of beer on the wall, %s bottles of beer.%n", word, word);               //Lyrics use bottles for the rest
		   }
		   if(i-1 == 1){
			   System.out.printf("Take one down and pass it around, %s bottle of beer on the wall.%n", nextWord);    //only when there's 1 bottle of beer left, the word "bottles" is changed to "bottle"

		   }else{
			   System.out.printf("Take one down and pass it around, %s bottles of beer on the wall.%n", nextWord);   //Lyrics use bottles for the rest

		   }
		   System.out.println();      
	   }
   }
   
   public static void main(String[] args){                                                                       //Main method used to start program
	   BeerSong b = new BeerSong(99);                                                                             //Creates new BeerSong object named b that inputs 99 beers to start with
	   b.PrintSong();                                                                                             //Prints lyrics
	   
   }
}

   
   