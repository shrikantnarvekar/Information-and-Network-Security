/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YP
 */
import java.io.*;
import java.util.*;

class monoalphabetic{
	public static String doEncrypt(String PT,String key)
	{
		int idx;
		char c;
		StringBuffer sb=new StringBuffer(PT);
		for(int i=0;i<sb.length();i++){
			idx=sb.charAt(i)-65;
			c=key.charAt(idx);
			sb.setCharAt(i,c);
		}
		return new String(sb);
	}
	public static String doDecrypt(String PT,String key)
	{
		int idx;
		char c;
		StringBuffer sb=new StringBuffer(PT);
		for(int i=0;i<sb.length();i++){
			c=sb.charAt(i);
			idx=getIndex(c,key);
			c=(char)(idx+65);
			sb.setCharAt(i,c);
		}
		return new String(sb);
	}
	public static int getIndex(char c,String key){
		int idx=0;
		for(int i=0;i<key.length();i++){
			if(key.charAt(i)==c){
				idx=i;
			}
		}
		return idx;
	}
	
		public static void main(String args[]) throws Exception{
			
			InputStreamReader is=new InputStreamReader(System.in);
			BufferedReader sc=new BufferedReader(is);
			System.out.println("Enter the text");
			String text=sc.readLine().toUpperCase();
			String key="QWERTYUIOPASDFGHJKLZXCVBNM";
			System.out.println("Cipher is " + doEncrypt(text,key));
		    System.out.println("After Decrytion : "+doDecrypt(doEncrypt(text,key),key));
		
	}
}