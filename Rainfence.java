/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YP
 */
import java.util.*;
import java.io.*;

class Railfence{
		public static void main(String args[]) throws IOException{
			int i,j;
			InputStreamReader is=new InputStreamReader(System.in);
			BufferedReader sc=new BufferedReader(is);
			System.out.println("Enter the text");
			String a=sc.readLine();
			String even="";
			String odd="";
			int len=a.length();
			for(i=0;i<len;i++){
				if(i%2==0){
					even=even+a.charAt(i);
				}
			    if(i%2!=0){
					odd=odd+a.charAt(i);
				}
		
			}

			System.out.println(even+odd);
			}
		}
