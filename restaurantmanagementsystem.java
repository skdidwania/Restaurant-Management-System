import java.util.*;
public class Restaurant_Management
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
{
int vstr,tvstr=0;
int nvstr,tnvstr=0;
int vfd,tvfd=0;
int nvfd,tnvfd=0;
int fd,tfd=0;
int tamt=0;
int amt=0;int totalamt=0;
int d,totald;int damt=0;int ch=0;
double vat=0;
String str="";
String ans;
String choice="Y";
System.out.println("Welcome to the multicuisine restaurant!!");
System.out.println("Starter Corner:1");
System.out.println("Main Course: 2");
System.out.println("Deserts....3");
System.out.println();  
System.out.println("Press 1 for starter");
System.out.println("Press 2 for Main Course");
System.out.println("Press 3 for Cool with Deserts");
System.out.println();
System.out.println("Enter your choice");
ch=in.nextInt();
switch(ch)
{
case 1:
System.out.println("Welcome to the starter menu");
System.out.println("Enter 'VS' for veg starter and 'NVS' for non veg starter");
str=in.next();
if(str.equalsIgnoreCase("VS"))
{
System.out.println("Starters\t\t\tPrice in Rs.");
System.out.println("1.Paneer Tikka\t\t\t110");
System.out.println("2.Veg Seekh kabab\t\t\t110");
System.out.println("3.Hara Bhara kebab\t\t\t110");
System.out.println("4.Shanghai Spring roll\t\t\t150");
System.out.println("5.American corn ball\t\t\t150");
System.out.println("6.Crispy american corn\t\t\t140");
System.out.println("7.Crispy baby corn\t\t\t140");
System.out.println("8.Crispy mushroom\t\t\t120");
System.out.println("9.Crispy chilly potato\t\t\t120");
System.out.println("10.Crispy chilly channa\t\t\t150");
System.out.println();
while(choice.equalsIgnoreCase("Y"))
{
System.out.println("Choose your starter from the above list by entering number");
vstr=in.nextInt();
System.out.println("Enter the total number of starters you want");
tvstr=in.nextInt();
if(vstr>=1&&vstr<=3)
amt=tvstr*110;
if(vstr==4||vstr==5)
amt=tvstr*150;
if(vstr==6||vstr==7)
amt=tvstr*140;
if(vstr==8||vstr==9)
amt=tvstr*120;
if(vstr==10)
amt=tvstr*150;
tamt =tamt+amt;
System.out.println("Do you want to place more order?EnterY/N");
choice=in.next();
}
}
if(str.equalsIgnoreCase("NVS"))
{
System.out.println("Non vegetarian Starter");
System.out.println();
System.out.println("Non veg starters\t\t\t Price in Rs");  
System.out.println("1.Chicken Tikka\t\t\t170");
System.out.println("Murg Reshmi Kebab\t\t\t170");
System.out.println("Murg Chilli Kebab\t\t\t170");
System.out.println("Chicken seekh kebab\t\t\t180");
System.out.println("Tangdi kebab\t\t\t180");
System.out.println("Murg Tandoori\t\t\t190");
System.out.println("Fish Ajwani Tikka\t\t\t190");
System.out.println("Chilli Chicken\t\t\t160");
System.out.println("Drums of Heaven\t\t\t180");
System.out.println("Shanghai Chicken\t\t\t180");
while(choice.equalsIgnoreCase("Y"))
{
System.out.println("choose your starter from the above list by entering nuumber");
nvstr=in.nextInt();
System.out.println("Enter the total no of starters you want");
tnvstr=in.nextInt();
if(nvstr==1||nvstr==2)
amt =tnvstr*170;
if(nvstr==3)
amt=tnvstr*160;
if(nvstr==4||nvstr==5)
amt=tnvstr*180;
if(nvstr==6||nvstr==7)
amt=tnvstr*190;
if(nvstr==8)
amt=tnvstr*160;
if(nvstr==9||nvstr==10)
amt=tnvstr*180;
 tamt=tamt+amt;
System.out.println("Do you want to place more order?Enter Y/N");
choice=in.next();
}
}
System.out.println("*******Multi Cuisine Restaurant********");
System.out.println("*********Bill*********");
System.out.println("Total cost=Rs."+tamt);
vat=Math.round(14.5/100*tamt);
System.out.println("VAT=14.5%");
System.out.println("Total VAT=Rs."+vat);
System.out.println("Amount to be psid=Rs"+(tamt+vat));
System.out.println();
break;
case 2:
System.out.println("Main Course:Indian and Chinese Dishes!");
System.out.println("Enter 'v' for veg indian Dishes,'NV' for non-veg indian dishes and 'c' for chinese dishes");
str=in.next();
if(str.equalsIgnoreCase("V"))
{
System.out.println("Welcome to  Indian Veg Dishes");
System.out.println("Indian Veg dishes\t\t\t\t:Price in Rs");
System.out.println("1.Shahi paneer\t\t\t\t\\t180");
System.out.println("2.Navratan korma\t\t\t\t\t180");
System.out.println("3.Kadahi paneer\t\t\t\t\t150");
System.out.println("4.Malai kofta \t\t\t\t\t140");
System.out.println("5.Kadahi vegetable\t\t\t\t\t140");
System.out.println("6.Vegetable pakeeza\t\t\t\t\t140");
System.out.println("7.Shabnam cury\t\t\t\t\t150");
System.out.println("8.Makai corn palak\t\t\t\t\t150");
System.out.println("9.veg pulao\t\t\t\t\t110");
System.out.println("10.Kashmiri pulao\t\t\t\t140");
System.out.println("11.Butter Naan\t\t\t\t40");
System.out.println("12.Stuffed naan\t\t\t\t60");
while(choice.equalsIgnoreCase("Y"))
{
System.out.println("Choose your main veg course by entering nunber");
vfd=in.nextInt();
System.out.println("how many plates do you want to place from the above list?");
tvfd=in.nextInt();
if(vfd==1||vfd==2)
{
amt=tvfd*180;
if(vfd==3)
amt=tvfd*150;
if(vfd==4||vfd==5||vfd==6)
amt=tvfd*140;
if(vfd==7||vfd==8)
amt=tvfd*150;
if(vfd==9)
amt=tvfd*110;
if(vfd==10)
amt=tvfd*140;
if(vfd==11)
amt=tvfd*40;
if(vfd==12)
amt=tvfd*60;
totalamt=totalamt+amt;
System.out.println("Do you want to place more order?Enter Y/N");
choice=in.next();
}
}
if(str.equalsIgnoreCase("NV"))
{
System.out.println("Welcome to Indian non veg dishes");
System.out.println("Indian non veg dishes\t\t\t\tPrice in Rs");
System.out.println("1.Chicken tikka masaala\t\t\t\t180");
System.out.println("2.Chicken tikka labadar\t\t\t\t\t180");
System.out.println("3.Chicken bharta\t\t\t\t\t150");
System.out.println("4.kadahi chicken\t\t\t\t\t160");
while(choice.equalsIgnoreCase("Y"))
{
System.out.println("choose your main non veg course from the above list by entering nuumber");
vfd=in.nextInt();
System.out.println("How many plates do u want from the above list");
tvfd=in.nextInt();
if(vfd==1||vfd==2)
amt=tvfd*160;
if(vfd==3)
amt=tvfd*150;
if(vfd==4)
amt=tvfd*160;
totalamt=totalamt+amt;
System.out.println("Do you want to place more order?Enter Y/N");
choice=in.next();
}
}
if(str.equalsIgnoreCase("C")) 
{
System.out.println("Welcome to chinese dishes");
System.out.println("Chinese dishes\t\t\t\tPricein Rs");
System.out.println("1.Schewzwan fried rice\t\t\t\t240");
System.out.println("2.Chilly chicken\t\t\t\t280");
System.out.println("3.chicken noodle\t\t\t\t210");
System.out.println("4.veg hakka noodle\t\t\t\t210");
while(choice.equalsIgnoreCase("Y"))
{
System.out.println("choose your main  course from the above list by entering nuumber"); 
fd=in.nextInt();
System.out.println("How many plates do u want from the above list");
tfd=in.nextInt();
if(fd==1)
amt=tfd*240;
if(fd==2)
amt=tfd*280;
if(fd==3||fd==4)
amt=tfd*210;
totalamt=totalamt+amt;
System.out.println("Do you want to place more order?Enter Y/N");
choice=in.next();
}
}
System.out.println();
System.out.println("********Multicuisine restaurant********");
System.out.println("********Bill********");
System.out.println("Total cost=Rs."+totalamt);
vat=Math.round(14.5/100*totalamt);
System.out.println("VAT=14.5%");
System.out.println("Total VAT=Rs."+vat);
System.out.println("Amount to be psid=Rs"+(totalamt+vat));
System.out.println();
break;}
case 3:
System.out.println("Cool with deserts");
System.out.println("deserts\t\t\t\t\t\tPrice in Rs");
System.out.println();
System.out.println("1.Softy pineapple\t\t\t\t110");
System.out.println("2.Walnut brownie\t\t\t\t110");
System.out.println("3.Marble cake\t\t\t\t\t70");
System.out.println("4.mocha magic\t\t\t\t\t90");
 while(choice.equalsIgnoreCase("Y"))
{
System.out.println("choose your desert from the above list by entering nuumber"); 
d=in.nextInt();
System.out.println("enter the total no items u want to buy");
totald=in.nextInt();
if(d==1||d==2)
damt=totald*110;
if(d==3)
damt=totald*70;
if(d==4)
damt=totald*90;
totalamt=totalamt+damt;
System.out.println("Do u want to place more order?Enter Y/N");
choice=in.next();
}
System.out.println();
System.out.println("********Multicuisine restaurant********");
System.out.println("********Bill********");
System.out.println("Total cost=Rs."+totalamt);
vat=Math.round(14.5/100*totalamt);
System.out.println("VAT=14.5%");
System.out.println("Total VAT=Rs."+vat);
System.out.println("Amount to be psid=Rs"+(totalamt+vat));
break;
default:
System.out.println("You have entered wrong choice");
System.out.println("You can enter the multicuisne restaurant by executing the program again with the correct choice");
System.out.println("Now,'Quit' the program");
}
System.out.println("to exit the multicuisine restaurant world,enter the word 'Quit'");
ans=in.next();
if(ans.equals("quit")||ans.equals("QUIT")||ans.equals("Quit"))
{
System.out.println("Thanks for coming to the multicuisine restaurant");
System.out.println("Your pleasure Our Comfort");
System.out.println("Visit again");
System.out.println();
}
}
}
}

   

