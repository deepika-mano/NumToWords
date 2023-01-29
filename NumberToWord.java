import java.util.*;
class NumberToWord{ 
static void words(char num[]){
int len = num.length;  
if (len == 0){  
System.out.println("\n Enter a valid number.");  
return;  
}  
if (len > 4){  
System.out.println("\n Enter a 4-digit number.");  
return;  
}  
String[] onedigit = new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};  
String[] twodigit = new String[] {"", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};  
String[] tys = new String[] {"",  "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};  
String[] hunth = new String[] {"Hundred", "Thousand"};
System.out.print(String.valueOf(num) + ": ");  
if (len == 1){
System.out.println(onedigit[num[0]-'0']);  
return;  
}
else if(len==4 && num[len-3]-'0'!=0) {
    if(num[len-1]-'0'==0 && num[len-2]-'0'==0){
        if(num[0]-'0'==1){
            int sum = num[0] - '0' + num[1] - '0';
            System.out.print(twodigit[sum]); 
            System.out.print(" Hundred");
        }
        else{
       int i = (num[0] - '0');  
       System.out.print(tys[i]+ "-");
       System.out.print(onedigit[i+1]);
       System.out.print(" Hundred");
        }
    }
}
else{
int x = 0;  
while (x < num.length){  
if (len >= 3)   {  
if (num[x] - '0' != 0){
System.out.print(onedigit[num[x] - '0'] + " ");  
System.out.print(hunth[len - 3]+ " ");  
}  
len--;
}  
else   {  
if (num[x] - '0' == 1){  
int sum = num[x] - '0' + num[x + 1] - '0';  
System.out.println(twodigit[sum]);  
return;  
}  
else if (num[x] - '0' == 2 && num[x + 1] - '0' == 0)   
{  
System.out.println("Twenty");  
return;  
}  
else   
{  
int i = (num[x] - '0');  
if (i > 0)  
System.out.print(tys[i]+ "-");  
else  
System.out.print("");  
x++;  
if (num[x] - '0' != 0)  
System.out.println(onedigit[num[x] - '0']);  
}  
}  
x++;  
}  
}
}
public static void main(String args[])  
{  
    Scanner sc=new Scanner (System.in);
    System.out.println("NUMBERS INTO WORDS CONVERTOR");
    System.out.println("Enter a number:");
    String n=sc.nextLine();
    words(n.toCharArray());  
}  
}
