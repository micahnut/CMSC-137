import java.util.*;
import java.io.*;

public class CheckSum{
	public boolean checkBin(String bin){
		boolean result = true;
		for (int i = 0; i < bin.length(); i++) {
          char currentChar = bin.charAt(i);
          if (currentChar == '1' || currentChar == '0')
          	result = true;
          else{
           	result = false;	
           	return result;
           }
      }
      return result;
	}
	public static String binaryAddition(String s1, String s2) {
    if (s1 == null || s2 == null) return "";
    int first = s1.length() - 1;
    int second = s2.length() - 1;
    StringBuilder sb = new StringBuilder();
    int carry = 0;
    while (first >= 0 || second >= 0) {
        int sum = carry;
        if (first >= 0) {
            sum += s1.charAt(first) - '0';
            first--;
        }
        if (second >= 0) {
            sum += s2.charAt(second) - '0';
            second--;
        }
        carry = sum >> 1;
        sum = sum & 1;
        sb.append(sum == 0 ? '0' : '1');
    }
    if (carry > 0)
        sb.append('1');

    sb.reverse();
    return String.valueOf(sb);
}
	
	public static String addOverflow(String string1){
		int l = string1.length();
		if(l>8){
		String s1 = string1.substring(0,1);
		String s2 = string1.substring(1,9);

		System.out.println(s1);
		System.out.println(s2);

       	String result = binaryAddition(s2,s1);

       	return result;
       }
       else
       	return string1;
	}

	public static boolean checkIfZero(String bin){
		boolean result = true;
		for (int i = 0; i < bin.length(); i++) {
          char currentChar = bin.charAt(i);
          if (currentChar == '0')
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
		
		CheckSum test = new CheckSum();

		boolean validBinaryNum = true;
		do{
			System.out.println(">Input A: ");			
			a = sc.nextLine();
			validBinaryNum = test.checkBin(a);
		
			if(validBinaryNum == false)
				System.out.println("Input a must be a bit(1 or 0) string");
			
			length = a.length();
			if(length!=40)
				System.out.println("Input a must be an 40-bit string");
		}while((validBinaryNum==false) || (length!=40));

		int [][] intArray = new int[5][8];

		String[] elements = a.split("");
 		for(int i=0; i<intArray.length; i++){
 			for(int j=0;j<8;j++)
 				intArray[i][j] = Integer.parseInt(elements[i*8+j]);

 			System.out.println(Arrays.toString(intArray[i]));
 		}
 		//1001100111100010001001001000010011011010

		//10011001 11 1 0 0 0 1 0  0 0 1 0 0 1 0 0  1 0 0 0 0 1 0 0  1 1 0 1 1 0 1 0
        //12345678 910111213141516 1718192021222324 2526272829303132 3334353637383940  
 		

 		String[] e = a.split("");
 		String bit1 = "";
 		String bit2 = "";
 		String bit3 = "";
 		String bit4 = "";
 		String bit5 = "";

 		for(int i=0; i<8;i++)
 			bit1 = bit1+e[i];

 		for(int i=8; i<16;i++)
 			bit2 = bit2+e[i];

 		for(int i=16; i<24;i++)
 			bit3 = bit3+e[i];

		for(int i=24; i<32;i++)
 			bit4 = bit4+e[i];

 		for(int i=32; i<40;i++)
 			bit5 = bit5+e[i];


 		System.out.println(bit1);
 		System.out.println(bit2);
 		System.out.println(bit3);
 		System.out.println(bit4);

 		System.out.println("\n");
 		String result1,result2,result3,result4,sum,checksum;

 		result1 = binaryAddition(bit1,bit2);
 		System.out.println("result1:"+result1);
 		System.out.println("\n");
 	
 		//if(result1.length()>8)
 		//result2 = addOverflow(result1);
 		result1 = addOverflow(result1);
 		System.out.println("\n");
		//after overflow
		System.out.println("result1w/add:"+result1);

		System.out.println("\n");
		result2 = binaryAddition(result1,bit3);
		System.out.println("result2:"+result2);

		System.out.println("\n");
 		result2 = addOverflow(result2);
 		System.out.println("result2w/add:"+result2);

 		System.out.println("\n");
		//afteroverflow
		//System.out.println(result2);
		

 		//if(result3.length()>8)
 		result3 = binaryAddition(result2,bit4);
		
		System.out.println("result3:"+result3);
		System.out.println("\n");
		
		//if(result4.length()>8)
		result3 = addOverflow(result3);
		System.out.println("result3w/add:"+result3);
		//after overflow
		//System.out.println(result3);

		/*
		sum = result3;
		String s = result3;
		s = s.replaceAll("0", "2");
		s = s.replaceAll("1", "0");
		s = s.replaceAll("2", "1");

		checksum = s;
		System.out.println("checksum: "+checksum);*/
		System.out.println("bit5/checksum: "+bit5);

		checksum = bit5;

		String final_sum = binaryAddition(result3,checksum);
		
		System.out.println("finalsum:"+ final_sum);
		
		String answer = final_sum;
		answer = answer.replaceAll("0", "2");
		answer = answer.replaceAll("1", "0");
		answer = answer.replaceAll("2", "1");

		System.out.println("\n");
		System.out.println("answer:"+ answer);

		if(checkIfZero(answer))
			System.out.println("Accept data.");
		else
			System.out.println("Checksum error detected");

	}
}