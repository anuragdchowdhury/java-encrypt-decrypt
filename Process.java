package com.encdec;
import java.util.Scanner;
//import java.util.Random;

// Class handling Encryption Function
class Encrypt {
	double number;
	double randomNumber = Math.random();
	
	void encryptCalculate(float n) {
		number = n + randomNumber;
	}
	
	void encrypytResult() {
		System.out.println("The Encypted Number is: " + number);
		System.out.println("The Encryption Key is: " + randomNumber);
	}
}

// Class Handling Decryption Function
class Decrypt {
	double number;
	double key;
	double answer;
	
	void decryptCalculate(float n,float k) {
		answer = n - k;
	}
	void decryptResult() {
		System.out.println("The Decrypted Number is: " + answer);
	}
}

// Main Class
public class Process {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encrypt enc = new Encrypt();
		Decrypt dec = new Decrypt();
		
		// Menu Section
		Scanner val = new Scanner(System.in);
      System.out.println("Choose corresponsing number for fucntion:");
      System.out.println("Choose 1 for Encryption");
      System.out.println("Choose 2 for Decryption");
      
      int option = val.nextInt();
      
      if (option == 1) {
    	  System.out.println("Welcome to Key Encryption");
    	  Scanner num = new Scanner(System.in);
    	  System.out.println("Enter the Number you want to encrypt");
    	  float number = num.nextFloat();
    	  enc.encryptCalculate(number);
    	  enc.encrypytResult();
      }
      else if (option == 2) {
    	  System.out.println("Welcome to Key Decryption");
    	  Scanner num = new Scanner(System.in);
    	  System.out.println("Enter the Encrypted Number");
    	  float number = num.nextFloat();
    	  Scanner key = new Scanner(System.in);
    	  System.out.println("Enter the Decryption Key");
    	  float decKey = key.nextFloat();
    	  dec.decryptCalculate(number, decKey);
    	  dec.decryptResult();
      }
      else
    	  System.out.println("Invalid Option Selection");
	}

}
