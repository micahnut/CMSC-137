import java.util.*;
import java.io.*;


 public class ParityCheck{

 	public boolean checkBin(String bin){ //check if input is binary
		boolean result = true;
		for (int i = 0; i < bin.length(); i++) {
          char currentChar = bin.charAt(i);
          if (currentChar == '1' || currentChar == '0') //onlt 1s and 0s
          	result = true;
          else{
           	result = false;	
           	return result;
           }
      }
      return result;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int length;
		String a, b;
		String parity,codeword,status;
		ParityCheck test = new ParityCheck();

		boolean validBinaryNum = true;
		do{
			System.out.println(">Input A: ");			
			a = sc.nextLine();
			validBinaryNum = test.checkBin(a);
		
			if(validBinaryNum == false)
				System.out.println("Input a must be a bit(1 or 0) string");
			
			length = a.length();
			if(length!=8)
				System.out.println("Input a must be an 8-bit string");
		}while((validBinaryNum==false) || (length!=8));

		

		do{
			System.out.println(">Input B: ");			
			b = sc.nextLine();
			validBinaryNum = test.checkBin(b);
		
			if(validBinaryNum == false)
				System.out.println("Input b must be a bit(1 or 0) string");
			
			length = b.length();
			if(length!=9)
				System.out.println("Input a must be an 9-bit string");

		}while((validBinaryNum==false) || (length!=9));


		int count=0;
		for (int i = 0; i < a.length(); i++) {
          char currentChar = a.charAt(i);
          if (currentChar == '1' )
         	count = count + 1;
      	}	
      	
      	if((count % 2 ) == 1)
      		parity = "1";
      	else
      		parity = "0";


      	codeword = a+parity;

      	//calculate syndrome;

      	count=0;
		for (int i = 0; i < b.length(); i++) {
          char currentChar = b.charAt(i);
          if (currentChar == '1' )
         	count = count + 1;
      	}

      	if((count % 2 ) == 1)
      		status = "discarded";

      	System.out.println("@Sender\nCodeword:" + codeword);

      	if((count % 2 ) == 1)
      		status = "discarded";
      	else
      		status = b.substring(0,8);


      	System.out.println("@Receiver\nData Word:" +status);


	}


}