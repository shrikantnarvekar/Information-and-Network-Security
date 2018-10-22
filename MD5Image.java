/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YP
 */
import java.io.File;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author user
 */
public class MD5Image {

 
    public static String getHash(byte[] inputBytes,String algorithm) throws NoSuchAlgorithmException{
        String hashvalue="";
        try{
            MessageDigest messagedigest=MessageDigest.getInstance(algorithm);
            messagedigest.update(inputBytes);
            byte[] digestedBytes=messagedigest.digest();
            //printHexBinary return the value in uppercase
            hashvalue=DatatypeConverter.printHexBinary(digestedBytes).toLowerCase();
            
        }
        catch(Exception e)
        {
            
        }
        return hashvalue;
    }
    public static void main(String[] args) throws NoSuchAlgorithmException {
        // TODO code application logic here
        try{
            File image=new File("D:\\TYCS\\INS\\java.jpg");
            byte [] imageBytes=Files.readAllBytes(image.toPath());
            System.out.println(getHash(imageBytes,"MD5"));
        }
        catch(Exception e){
            System.out.println("No File Found");
            
        }
    }
    
}