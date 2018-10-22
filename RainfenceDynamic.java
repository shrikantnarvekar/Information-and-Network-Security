
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YP
 */
class RailfenceDynamic
{
 public static void main(String [] args) 
	{
		 Scanner  sc=new Scanner(System.in);
		System.out.println("1.Encrypt \n 2.Decryption");
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("Encryption");
			cipherEncryption();
		}
		else if(choice==2)
		{
			System.out.println("Decryption");
		}
		else
		{
			System.out.println("Incorrect choice");
		}
   }
		public static void cipherEncryption() 
			{
			
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Message:");
			String message=sc.next();
			message+=sc.next();
			int l=message.length();
			
		message=message.replaceAll("\\s","");
		sc.nextLine();
		System.out.print("Enter Key:");
		int key=sc.nextInt();
		char[][]rail=new char[key][l];
		//matrix
		for(int i=0;i<key;i++)
		{
			for(int j=0;j<l;j++)
			{
				rail[i][j]='_';
			}
		}
	
	int row=0;
	int check=0;
	for(int i=0;i<l;i++)
	{
		if(check==0)
		{
			rail[row][i]=message.charAt(i);
			row++;
			if(row==key)
			{
				check=1;
				row--;
			}
		}
			else if(check==1)
			{
				row--;
				rail[row][i]=message.charAt(i);
				if(row==0)
				{
					check=0;
					row=1;
				}
			}
		
	}

	String encrypText="";
	for(int i=0;i<key;i++)
	{
		for(int j=0;j<l;j++)
		{
			encrypText+=rail[i][j];
			System.out.print(rail[i][j]);
			
		}
	System.out.println();
	}
encrypText=encrypText.replaceAll("_","");
System.out.println("Encrypted message:"+encrypText);
	
	
}
	public static void Decryptcipher(){
		Scanner sc=new Scanner(System.in);
			System.out.print("Enter CT:");
			String message=sc.next();
			
	}
}