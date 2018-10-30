import java.util.*;
import java.io.*;

public class TwoDimensionalParityCheck{
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

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int length;
		char [][] a = new char[5][9];
		String bin;
		TwoDimensionalParityCheck test = new TwoDimensionalParityCheck();

		boolean validBinaryNum = true;

		do{
			System.out.println(">Input A: ");			
			bin = sc.nextLine();
			validBinaryNum = test.checkBin(bin);
		
			if(validBinaryNum == false)
				System.out.println("Input a must be a bit(1 or 0) string");
			
			length = bin.length();
			if(length!=45)
				System.out.println("Input a must be an 45-bit string");
		}while((validBinaryNum==false) || (length!=45));


		System.out.println("\n");

 		//101100111101010111010110100110101011100101111
		char[] elements = bin.toCharArray();
 		
 		for(int i=0; i<a.length; i++){
 			for(int j=0;j<9;j++)
 				a[i][j] = elements[i*9+j];

 			System.out.println(a[i]);
 		}

 		//row count

		int error_count =0;

		int row_one_count = 0;
		/*
		if(a[0][8]=='1')
			row_one_count += 1;
		if (a[1][8]=='1')
    		row_one_count += 1;
		if (a[2][8]=='1')
  			row_one_count += 1;
		if (a[3][8]=='1')
  		    row_one_count += 1;
		if (a[4][8]=='1')
			row_one_count += 1;
		*/
		//if(row_one_count%2==1)
		//	error_count += 1;

		//column count
		//for(int i=0;i<a.length;i++)
		//	if(a[4][i] == "1")
		//		column_one_count+=1;
		System.out.println("\n");

		int flag1=0,flag2=0,flag3=0,flag4=0,flag5=0,flag6=0;
		int flag7=0,flag8=0,flag9=0,flag10=0,flag11=0;
		int flag12=0,flag13=0,flag14=0;


		for(int i=0;i<9;i++)
			if(a[0][i]=='1')
				row_one_count += 1;

		System.out.println(row_one_count);	
			if(row_one_count%2==1){
				error_count += 1;
				flag1= 1;
						System.out.println("flag1");
			}
		
		 row_one_count = 0;

		for(int i=0;i<9;i++)
			if(a[1][i]=='1')
				row_one_count += 1;
			System.out.println(row_one_count);	
			
			if(row_one_count%2==1){
				error_count += 1;
				flag2= 1;	
						System.out.println("flag2");
			}

		 row_one_count = 0;
		
		for(int i=0;i<9;i++)
			if(a[2][i]=='1')
				row_one_count += 1;
			System.out.println(row_one_count);	

			if(row_one_count%2==1){
				error_count += 1;	
				flag3= 1;
						System.out.println("flag3");
			}

		 row_one_count = 0;	
		
		for(int i=0;i<9;i++)
			if(a[3][i]=='1')
			row_one_count += 1;
		System.out.println(row_one_count);	
			
			if(row_one_count%2==1){
				error_count += 1;	
				flag4= 1;
						System.out.println("flag4");
			}

		 row_one_count = 0;	
	
		for(int i=0;i<9;i++)	
			if(a[4][i]=='1')
				row_one_count += 1;
			System.out.println(row_one_count);	

		 row_one_count = 0;	

		if(row_one_count%2==1){
			error_count += 1;
			flag5= 1;
					System.out.println("flag5");
		}

		System.out.println("\n");
		System.out.println("\n");
		int column_one_count = 0;

		for(int i=0;i<5;i++)	
			if(a[i][0]=='1')
				column_one_count+=1;

			System.out.println(column_one_count);

			if(column_one_count%2==1){
				error_count+=1;
				flag6= 1;
						System.out.println("flag6");
			}

		 column_one_count = 0;	

		for(int i=0;i<5;i++)	
			if(a[i][1]=='1')
				column_one_count+=1;
			System.out.println(column_one_count);

			if(column_one_count%2==1){
				error_count+=1;
				flag7= 1;
						System.out.println("flag7");
			}

		 column_one_count = 0;	
		
		for(int i=0;i<5;i++)	
			if(a[i][2]=='1')
				column_one_count+=1;
			System.out.println(column_one_count);

			if(column_one_count%2==1){
				error_count+=1;
				flag8= 1;
						System.out.println("flag8");
			}
		
		 column_one_count = 0;
		for(int i=0;i<5;i++)	
			if(a[i][3]=='1')
				column_one_count+=1;
			System.out.println(column_one_count);
			
			if(column_one_count%2==1){
				error_count+=1;
				flag9= 1;
						System.out.println("flag9");
			}

		 column_one_count = 0;	

		for(int i=0;i<5;i++)	
			if(a[i][4]=='1')
				column_one_count+=1;
			System.out.println(column_one_count);

			if(column_one_count%2==1){
				error_count+=1;
				flag10= 1;
						System.out.println("flag10");
			}
		
		 column_one_count = 0;
		for(int i=0;i<5;i++)	
			if(a[i][5]=='1')
				column_one_count+=1;
			System.out.println(column_one_count);

			if(column_one_count%2==1){
				error_count+=1;
				flag11= 1;
					System.out.println("flag11");
			}

		 column_one_count = 0;	
		
		for(int i=0;i<5;i++)	
			if(a[i][6]=='1')
				column_one_count+=1;
			System.out.println(column_one_count);

			if(column_one_count%2==1){
				error_count+=1;
				flag12=1;
					System.out.println("flag12");	
			}

		 column_one_count = 0;
		for(int i=0;i<5;i++)	
			if(a[i][7]=='1')
				column_one_count+=1;
			System.out.println(column_one_count);

			if(column_one_count%2==1){
				error_count+=1;
				flag13 =1;
				System.out.println("flag13");
			}

		 column_one_count = 0;
		for(int i=0;i<5;i++)	
			if(a[i][8]=='1')
				column_one_count+=1;	
			System.out.println(column_one_count);

				if(column_one_count%2==1){
					error_count+=1;	
					flag14= 1;
					System.out.println("flag14");
				}

		
		if(flag1 == 1 && flag6 ==1)
			error_count-=1;
		if(flag5 == 1 && flag6 ==1)
			error_count-=1;
		if(flag13 == 1 && flag6 ==1)
			error_count-=1;
		if(flag3 == 1 && flag14 ==1)
			error_count-=1;
		//if(flag3 == 1 && flag14 ==1)
		//	error_count-=1;
			

		
/*
		if(flag2 == 1 && flag7 ==1)
			error_count-=1;

		if(flag3 == 1 && flag8 ==1)
			error_count-=1;

		if(flag4 == 1 && flag9 ==1)
			error_count-=1;

		if(flag5 == 1 && flag10 ==1)
			error_count-=1;

/*

		if(flag1 == 1 && flag7 ==1)
			error_count-=1;

		if(flag1 == 1 && flag8 ==1)
			error_count-=1;

		if(flag1 == 1 && flag9 ==1)
			error_count-=1;
		
		if(flag1 == 1 && flag8 ==1)
			error_count-=1;
		if(flag1 == 1 && flag9 ==1)
			error_count-=1;
		if(flag1 == 1 && flag10 ==1)
			error_count-=1;

		if(flag1 == 1 && flag11 ==1)
			error_count-=1;

		if(flag1 == 1 && flag12 ==1)
			error_count-=1;
		if(flag1 == 1 && flag13 ==1)
			error_count-=1;
		if(flag1 == 1 && flag14 ==1)
			error_count-=1;



		if(flag2 == 1 && flag6 ==1)
			error_count-=1;

		if(flag2 == 1 && flag8 ==1)
			error_count-=1;

		if(flag2 == 1 && flag9 ==1)
			error_count-=1;
		
		if(flag2 == 1 && flag8 ==1)
			error_count-=1;
		if(flag2 == 1 && flag9 ==1)
			error_count-=1;
		if(flag2 == 1 && flag10 ==1)
			error_count-=1;

		if(flag2 == 1 && flag11 ==1)
			error_count-=1;

		if(flag2 == 1 && flag12 ==1)
			error_count-=1;
		if(flag2 == 1 && flag13 ==1)
			error_count-=1;
		
		if(flag2 == 1 && flag14 ==1)
			error_count-=1;

		*/




				//System.out.println("yay");
			
			//System.out.println(a[4][i]);
		//if(column_one_count%2==1)
		//	error_count+=1;

		System.out.println("Error count: "+ error_count);

	}
}