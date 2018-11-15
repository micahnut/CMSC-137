#include <stdio.h>
#include <conio.h>
#include <string.h>

 int main() {
	int i,j,keylen,codewordlen;
	char input[100], key[30],temp[30],quot[100],rem[30],key1[30];

	printf(">Data: ");
	gets(input);
	printf("Enter Key: ");
	gets(key);
	
	keylen=strlen(key);
	codewordlen=strlen(input);
	
	strcpy(key1,key);
	
	for (i=0;i<keylen-1;i++) {
		input[codewordlen+i]='0';
	}
	
	for (i=0;i<keylen;i++)
	 	temp[i]=input[i];
	
	for (i=0;i<codewordlen;i++) { //division 
		quot[i]=temp[0];
		if(quot[i]=='0')
			for (j=0;j<keylen;j++)
		 		key[j]='0'; 
		else
			 for (j=0;j<keylen;j++)
		 		key[j]=key1[j];
		
		for (j=keylen-1;j>0;j--) {
			if(temp[j]==key[j])
			 	rem[j-1]='0'; 
			else
				rem[j-1]='1';
		}
		
		rem[keylen-1]=input[i+keylen];
		strcpy(temp,rem);
	}
	
	strcpy(rem,temp);

	printf("\nQuotient is ");
	for (i=0;i<codewordlen;i++)
	   printf("%c",quot[i]);
	
	printf("\nRemainder is "); //Syndrome
	for (i=0;i<keylen-1;i++)
	 printf("%c",rem[i]);

	//getch();
	 int flag=0;       //if there is a 1 in remainder then flag error
        for(i=0;i<keylen-1;i++){
            if(rem[i]!='0'){
                flag=1;
                //printf("inside2");
            }
            //printf("inside");
        }
        //printf("flag: %d", flag);
        
        if(flag==0){
            printf("\n Accept data.");
        }
        else{
            printf("\n CRC error detected. \n");
        }
	
	return 0;
}



/*CRC

1. 1000110 - Error r101
2. 0100100 - Error r101
3. 0111010 - No Error
4. 0011101 - No Error
5. 1101001 - No Error*/
