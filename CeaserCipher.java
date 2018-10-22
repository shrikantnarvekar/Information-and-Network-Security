
import java.util.*;


public class CeaserCipher{
    public static StringBuffer encrypt(String text,int s){
		
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<text.length();i++){
			if(Character.isUpperCase(text.charAt(i))){
				char ch=(char)(((int)text.charAt(i)+s-65)%26+65);
				sb.append(ch);
			}
			else if(Character.isLowerCase(text.charAt(i))){
				char ch=(char)(((int)text.charAt(i)+s-65)%26+65);
				sb.append(ch);
				}
			else{
				sb.append(" ");
			}
		
		}
                return sb;
	}


	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the text");
		String text=sc.next();
		System.out.println("Enter the key");
		int s=sc.nextInt();
        StringBuffer enc=encrypt(text,s);
       System.out.println("Encrypted Cipher is " + enc );
		
	}
}

		