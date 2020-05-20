package com.org.Strings;

import javax.swing.JOptionPane;

public class Palindrome {


	public static boolean isPalindrome(String read){
		String newStr="";
		int length=read.length();
		for(int i=length-1;i>=0;i--){
			newStr+=read.charAt(i);
		}
		return read.equalsIgnoreCase(newStr);
	}
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null,"","Bir şeyler yazın..");
		int length=input.length();
		char kaynakDizi[]=new char[length];
		String toStringDizisi="";
		kaynakDizi=input.toCharArray();
		for(int i=length-1;i>=0;i--){
			toStringDizisi+=kaynakDizi[i];
		}

		if(isPalindrome(input))
                    
			System.out.println(input.toUpperCase());
                
		else{
			System.out.println("Palindorme değil "+input+"!="+toStringDizisi);
			System.out.println(input.toLowerCase());
		}
	}

}