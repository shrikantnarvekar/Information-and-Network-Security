
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YP
 */
class SCT{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your plain text");
		String accept=br.readLine();
		System.out.println("Enter the no of rows ");
		int r=Integer.parseInt(br.readLine());
		System.out.println("Enter the no of cols");
		int c=Integer.parseInt(br.readLine());
		char[][] ch=new char[r][c];
		
		int count=0;
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				
				if(count>=accept.length()){
					ch[i][j]=' ';
					count++;
				}
				else{
					ch[i][j]=accept.charAt(count);
					count++;
				}
			}
		}
		for(int i=0;i<r;i++){
		for(int j=0;j<c;j++){
			System.out.print(ch[i][j] +" ");	
		}
		System.out.println(" ");
		}
	
			System.out.println("\nEnter the order of cols you want to view them in");
		 int choice[]=new int[c];
		 for(int k=0;k<c;k++)
		 {
		  System.out.println("Choice "+k+"-> ");
		  choice[k]=Integer.parseInt(br.readLine());
		 }
		 
		System.out.println("\nCipher text in matrix is ->");
		 String cipher="";
		 for(int j=0;j<c;j++)
		 {
		  int k=choice[j];
		  for(int i=0;i<r;i++)
		  {
		  cipher+=ch[i][k];  
		  }
		 }
		 cipher=cipher.trim();
		 System.out.println(cipher);
		 }
}
