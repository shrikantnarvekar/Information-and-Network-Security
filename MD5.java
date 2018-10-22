/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YP
 */
import java.security.MessageDigest;
import javax.xml.bind.DatatypeConverter;

public class MD5 {

    public static String getHash(byte[] inputBytes,String algorithm) 
    { 
        String hashvalue="";
        try{
            MessageDigest messagedigest=MessageDigest.getInstance(algorithm);
            messagedigest.update(inputBytes);
            byte [] digestedBytes=messagedigest.digest();
            hashvalue=DatatypeConverter.printHexBinary(digestedBytes).toLowerCase();
			
        }
        catch(Exception e){
            System.out.println(e);
        }
        return hashvalue;
    }
    public static void main(String []args){
        
        String somestring="this is some String";
        System.out.println(getHash(somestring.getBytes(),"SHA-512"));
    }
    
}
