import java.util.*;
class A
{
static Scanner hi = new Scanner (System.in);
	int date = hi.nextInt();


static void m1(int b,int a)
{
	
int t;
int m;

if(a<=0||a>12)
{
System.out.print("There is no Month for given input");
System.out.print("\n3 - Re-enter \n	4 - Go to yearly calender\n	5 - EXIT\n");

}
else
{
if((b%400==0)||(b%4==0 && b%100!=0))
{
t=3;
m=1095;
for(int k = 8;k<=b;k=k+4)
{
		if((k%400==0)||(k%4==0 && k%100!=0))
		{
			t=t+5;
			m = m +1095+(366);
		}
		else
		{
			t=t+4;
			m = m+1095+(365);
		}	
}

if(a==1)
{
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=((0+t)%7);j++)
		{
			System.out.print("	");
		}
	for(int i = 1+m;i<=31+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-m));
		}
		else
		{
			System.out.print("	"+(i-m));
		}
	}
}
if(a==2)
{
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=((3+t)%7);j++)
		{
			System.out.print("	");
		}
	for(int i = 32+m;i<=60+m;i++)
	{

		if(i%7==0)
		{
			System.out.println("	"+(i-(31+m)));
		}
		else
		{
			System.out.print("	"+(i-(31+m)));
		}
	}
}
if(a==3)
{
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=((4+t)%7);j++)
		{
			System.out.print("	");
		}
	for(int i = 61+m;i<=91+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(60+m)));
		}
		else
		{
			System.out.print("	"+(i-(60+m)));
		}
	}
}
if(a==4)
{
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=((0+t)%7);j++)
		{
			System.out.print("	");
		}
	for(int i = 92+m;i<=121+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(91+m)));
		}
		else
		{
			System.out.print("	"+(i-(91+m)));
		}
	}
}
if(a==5)
{
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=((2+t)%7);j++)
		{
			System.out.print("	");
		}
	for(int i =122+m;i<=152+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(121+m)));
		}
		else
		{
			System.out.print("	"+(i-(121+m)));
		}
	}
}
if(a==6)
{
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=((5+t)%7);j++)
		{
			System.out.print("	");
		}
	for(int i = 153+m;i<=182+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(152+m)));
		}
		else
		{
			System.out.print("	"+(i-(152+m)));
		}
	}
}
if(a==7)
{
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=((0+t)%7);j++)
		{
			System.out.print("	");
		}
	for(int i = 183+m;i<=213+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(182+m)));
		}
		else
		{
			System.out.print("	"+(i-(182+m)));
		}
	}
}
if(a==8)
{
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=((3+t)%7);j++)
		{
			System.out.print("	");
		}
	for(int i = 214+m;i<=244+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(213+m)));
		}
		else
		{
			System.out.print("	"+(i-(213+m)));
		}
	}
}
if(a==9)
{
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=((6+t)%7);j++)
		{
			System.out.print("	");
		}
	for(int i = 245+m;i<=274+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(244+m)));
		}
		else
		{
			System.out.print("	"+(i-(244+m)));
		}
	}
}
if(a==10)
{
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=((1+t)%7);j++)
		{
			System.out.print("	");
		}
	for(int i = 275+m;i<=305+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(274+m)));
		}
		else
		{
			System.out.print("	"+(i-(274+m)));
		}
	}
}
if(a==11)
{
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=((4+t)%7);j++)
		{
			System.out.print("	");
		}
	for(int i = 306+m;i<=335+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(305+m)));
		}
		else
		{
			System.out.print("	"+(i-(305+m)));
		}
	}
}
if(a==12)
{
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=((6+t)%7);j++)
		{
			System.out.print("	");
		}
	for(int i = 336+m;i<=366+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(335+m)));
		}
		else
		{
			System.out.print("	"+(i-(335+m)));
		}
	}
}
}
else
{
t=0;
m=0;
for(int k = 2;k<=b;k++)
{
	if((k%400==0)||(k%4==0 && k%100!=0))
	{
		t = t+2;
		m = m + 366;
	}
	else
	{
		m = m +365;
		t=t+1;
	}
}


if(a==1)
{
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=((0+t)%7);j++)
		{
			System.out.print("	");
		}
	for(int i = m+1;i<=31+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-m));
		}
		else
		{
			System.out.print("	"+(i-m));
		}
	}
}
if(a==2)
{
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=((3+t)%7);j++)
		{
			System.out.print("	");
		}
	for(int i = 32+m;i<=59+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(31+m)));
		}
		else
		{
			System.out.print("	"+(i-(31+m)));
		}
	}
}
if(a==3)
{
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=(3+t)%7;j++)
		{
			System.out.print("	");
		}
	for(int i = 60+m;i<=90+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(59+m)));
		}
		else
		{
			System.out.print("	"+(i-(59+m)));
		}
	}
}
if(a==4)
{
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=(6+t)%7;j++)
		{
			System.out.print("	");
		}
	for(int i = 91+m;i<=120+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(90+m)));
		}
		else
		{
			System.out.print("	"+(i-(90+m)));
		}
	}
}
if(a==5)
{
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=(1+t)%7;j++)
		{
			System.out.print("	");
		}
	for(int i =121+m;i<=151+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(120+m)));
		}
		else
		{
			System.out.print("	"+(i-(120+m)));
		}
	}
}
if(a==6)
{
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=(4+t)%7;j++)
		{
			System.out.print("	");
		}
	for(int i = 152+m;i<=181+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(151+m)));
		}
		else
		{
			System.out.print("	"+(i-(151+m)));
		}
	}
}
if(a==7)
{
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=(6+t)%7;j++)
		{
			System.out.print("	");
		}
	for(int i = 182+m;i<=212+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(181+m)));
		}
		else
		{
			System.out.print("	"+(i-(181+m)));
		}
	}
}
if(a==8)
{
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=(2+t)%7;j++)
		{
			System.out.print("	");
		}
	for(int i = 213+m;i<=243+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(212+m)));
		}
		else
		{
			System.out.print("	"+(i-(212+m)));
		}
	}
}
if(a==9)
{
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=(5+t)%7;j++)
		{
			System.out.print("	");
		}
	for(int i = 244+m;i<=273+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(243+m)));
		}
		else
		{
			System.out.print("	"+(i-(243+m)));
		}
	}
}
if(a==10)
{
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=(0+t)%7;j++)
		{
			System.out.print("	");
		}
	for(int i = 274+m;i<=304+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(273+m)));
		}
		else
		{
			System.out.print("	"+(i-(273+m)));
		}
	}
}
if(a==11)
{
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=(3+t)%7;j++)
		{
			System.out.print("	");
		}
	for(int i = 305+m;i<=334+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(304+m)));
		}
		else
		{
			System.out.print("	"+(i-(304+m)));
		}
	}
}
if(a==12)
{
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=(5+t)%7;j++)
		{
			System.out.print("	");
		}
	for(int i = 335+m;i<=365+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(334+m)));
		}
		else
		{
			System.out.print("	"+(i-(334+m)));
		}
	}
}
}
	System.out.print("\n	1-Precedor				2-Successor\n	3 - Go to yearly calender			4 - Day of the Date\n5 - Re-enter	6 - EXIT\n");
}
A.m3(b,a);
}

static void m3(int a,int b)
{
		int x = hi.nextInt();
		if(x==1)
		{
			A.m1(a,b-1);
		}
		else if(x==2)
		{
			A.m1(a,b+1);
		}
		else if(x==4)
		{
				System.out.println("Enter Year you would like to visit");
			int head = hi.nextInt();

				System.out.println("Please enter month to view calender (in numerals)");
			int eye = hi.nextInt();

				System.out.print("Enter number to view Day of the date\n");
			new A(eye,head);
		}
		else if(x==5)
		{
			System.out.println("Enter Year you would like to visit");
			System.out.println("Please enter month to view calender (in numerals)");			
			A.m1(hi.nextInt(),hi.nextInt());
		}
		else if(x==3)
		{
			System.out.println("Enter Year you would like to visit");
			A.m2(hi.nextInt());
		}
		else if(x==6)
		{
			System.exit(0);
		}
		else
		{
			System.out.print("Sorry i can't find from what you entered");
			System.exit(0);
		}
}

static void m2(int b)
{

int t;
int m;

if((b%400==0)||(b%4==0 && b%100!=0))
{
t=3;
m=1095;
for(int k = 8;k<=b;k=k+4)
{
		if((k%400==0)||(k%4==0 && k%100!=0))
		{
			t=t+5;
			m = m +1095+(366);
		}
		else
		{
			t=t+4;
			m = m+1095+(365);
		}	
}
for(int a = 1;a<=12;a++)
{
if(a==1)
{
	System.out.println("JANUARY");
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=((0+t)%7);j++)
		{
			System.out.print("	");
		}
	for(int i = 1+m;i<=31+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-m));
		}
		else
		{
			System.out.print("	"+(i-m));
		}
	}
}
if(a==2)
{
	System.out.println("\nFEBUARY");
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=((3+t)%7);j++)
		{
			System.out.print("	");
		}
	for(int i = 32+m;i<=60+m;i++)
	{

		if(i%7==0)
		{
			System.out.println("	"+(i-(31+m)));
		}
		else
		{
			System.out.print("	"+(i-(31+m)));
		}
	}
}
if(a==3)
{
	System.out.println("\nMARCH");
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=((4+t)%7);j++)
		{
			System.out.print("	");
		}
	for(int i = 61+m;i<=91+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(60+m)));
		}
		else
		{
			System.out.print("	"+(i-(60+m)));
		}
	}
}
if(a==4)
{
	System.out.println("\nAPRIL");
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=((0+t)%7);j++)
		{
			System.out.print("	");
		}
	for(int i = 92+m;i<=121+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(91+m)));
		}
		else
		{
			System.out.print("	"+(i-(91+m)));
		}
	}
}
if(a==5)
{
	System.out.println("\nMAY");
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=((2+t)%7);j++)
		{
			System.out.print("	");
		}
	for(int i =122+m;i<=152+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(121+m)));
		}
		else
		{
			System.out.print("	"+(i-(121+m)));
		}
	}
}
if(a==6)
{
	System.out.println("\nJUNE");
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=((5+t)%7);j++)
		{
			System.out.print("	");
		}
	for(int i = 153+m;i<=182+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(152+m)));
		}
		else
		{
			System.out.print("	"+(i-(152+m)));
		}
	}
}
if(a==7)
{
	System.out.println("\nJULY");
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=((0+t)%7);j++)
		{
			System.out.print("	");
		}
	for(int i = 183+m;i<=213+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(182+m)));
		}
		else
		{
			System.out.print("	"+(i-(182+m)));
		}
	}
}
if(a==8)
{
	System.out.println("\nAUGUST");
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=((3+t)%7);j++)
		{
			System.out.print("	");
		}
	for(int i = 214+m;i<=244+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(213+m)));
		}
		else
		{
			System.out.print("	"+(i-(213+m)));
		}
	}
}
if(a==9)
{
	System.out.println("\nSEPTEMBER");
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=((6+t)%7);j++)
		{
			System.out.print("	");
		}
	for(int i = 245+m;i<=274+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(244+m)));
		}
		else
		{
			System.out.print("	"+(i-(244+m)));
		}
	}
}
if(a==10)
{
	System.out.println("\nOCTOBER");
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=((1+t)%7);j++)
		{
			System.out.print("	");
		}
	for(int i = 275+m;i<=305+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(274+m)));
		}
		else
		{
			System.out.print("	"+(i-(274+m)));
		}
	}
}
if(a==11)
{
	System.out.println("\nNOVEMBER");
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=((4+t)%7);j++)
		{
			System.out.print("	");
		}
	for(int i = 306+m;i<=335+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(305+m)));
		}
		else
		{
			System.out.print("	"+(i-(305+m)));
		}
	}
}
if(a==12)
{
	System.out.println("\nDECEMBER");
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=((6+t)%7);j++)
		{
			System.out.print("	");
		}
	for(int i = 336+m;i<=366+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(335+m)));
		}
		else
		{
			System.out.print("	"+(i-(335+m)));
		}
	}
}
}
}
else
{
t=0;
m=0;
for(int k = 2;k<=b;k++)
{
	if((k%400==0)||(k%4==0 && k%100!=0))
	{
		t = t+2;
		m = m + 366;
	}
	else
	{
		m = m +365;
		t=t+1;
	}
}
for(int a = 1;a<=12;a++)
{
if(a==1)
{
	System.out.println("JANUARY");
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=((0+t)%7);j++)
		{
			System.out.print("	");
		}
	for(int i = m+1;i<=31+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-m));
		}
		else
		{
			System.out.print("	"+(i-m));
		}
	}
}
if(a==2)
{
	System.out.println("\nFEBUARY");
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=((3+t)%7);j++)
		{
			System.out.print("	");
		}
	for(int i = 32+m;i<=59+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(31+m)));
		}
		else
		{
			System.out.print("	"+(i-(31+m)));
		}
	}
}
if(a==3)
{
	System.out.println("\nMARCH");
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=(3+t)%7;j++)
		{
			System.out.print("	");
		}
	for(int i = 60+m;i<=90+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(59+m)));
		}
		else
		{
			System.out.print("	"+(i-(59+m)));
		}
	}
}
if(a==4)
{
	System.out.println("\nAPRIL");
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=(6+t)%7;j++)
		{
			System.out.print("	");
		}
	for(int i = 91+m;i<=120+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(90+m)));
		}
		else
		{
			System.out.print("	"+(i-(90+m)));
		}
	}
}
if(a==5)
{
	System.out.println("\nMAY");
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=(1+t)%7;j++)
		{
			System.out.print("	");
		}
	for(int i =121+m;i<=151+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(120+m)));
		}
		else
		{
			System.out.print("	"+(i-(120+m)));
		}
	}
}
if(a==6)
{
	System.out.println("\nJUNE");
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=(4+t)%7;j++)
		{
			System.out.print("	");
		}
	for(int i = 152+m;i<=181+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(151+m)));
		}
		else
		{
			System.out.print("	"+(i-(151+m)));
		}
	}
}
if(a==7)
{
	System.out.println("\nJULY");
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=(6+t)%7;j++)
		{
			System.out.print("	");
		}
	for(int i = 182+m;i<=212+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(181+m)));
		}
		else
		{
			System.out.print("	"+(i-(181+m)));
		}
	}
}
if(a==8)
{
	System.out.println("\nAUGUST");
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=(2+t)%7;j++)
		{
			System.out.print("	");
		}
	for(int i = 213+m;i<=243+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(212+m)));
		}
		else
		{
			System.out.print("	"+(i-(212+m)));
		}
	}
}
if(a==9)
{
	System.out.println("\nSEPTEMBER");
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=(5+t)%7;j++)
		{
			System.out.print("	");
		}
	for(int i = 244+m;i<=273+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(243+m)));
		}
		else
		{
			System.out.print("	"+(i-(243+m)));
		}
	}
}
if(a==10)
{
	System.out.println("\nOCTOBER");
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=(0+t)%7;j++)
		{
			System.out.print("	");
		}
	for(int i = 274+m;i<=304+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(273+m)));
		}
		else
		{
			System.out.print("	"+(i-(273+m)));
		}
	}
}
if(a==11)
{
	System.out.println("\nNOVEMBER");
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=(3+t)%7;j++)
		{
			System.out.print("	");
		}
	for(int i = 305+m;i<=334+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(304+m)));
		}
		else
		{
			System.out.print("	"+(i-(304+m)));
		}
	}
}
if(a==12)
{
	System.out.println("\nDECEMBER");
	System.out.println("	MON	TUE	WED	THUR	FRI	SAT	SUN");
		for(int j=1;j<=(5+t)%7;j++)
		{
			System.out.print("	");
		}
	for(int i = 335+m;i<=365+m;i++)
	{
		if(i%7==0)
		{
			System.out.println("	"+(i-(334+m)));
		}
		else
		{
			System.out.print("	"+(i-(334+m)));
		}
	}
}
}
}

System.out.print("\n	1-Precedor				2-Successor\n3 - Go to monthly calender	4 - Day for the date\n5 - re enter		6 - EXIT\n");
A.m4(b);
}

static void m4(int a)
{
		int x = hi.nextInt();
		if(x==1)
		{
			A.m2(a-1);
		}
		else if(x==2)
		{
			A.m2(a+1);
		}
		else if(x==5)
		{
			System.out.println("Enter Year you would like to visit");
			A.m2(hi.nextInt());
		}
		else if(x==3)
		{
			System.out.println("Enter Year you would like to visit");
			int he = hi.nextInt();
			System.out.println("Please enter month to view calender (in numerals)");
			int she = hi.nextInt();
			A.m1(he,she);
		}
		else if(x==4)
		{
				System.out.println("Enter Year you would like to visit");
			int h = hi.nextInt();

				System.out.println("Please enter month to view calender (in numerals)");
			int i = hi.nextInt();

				System.out.print("Enter number to view Day of the date\n");
			new A(i,h);
		}

		else if(x==6)
		{
			System.exit(0);
		}
		else
		{
			System.out.print("Sorry i can't find from what you entered");
			System.exit(0);
		}

}

void m5()
{
	int x = hi.nextInt();
		if(x==3)
		{
			System.out.println("Enter Year you would like to visit");
			A.m2(hi.nextInt());
		}
		else if(x==2)
		{
			System.out.println("Enter Year you would like to visit");
			int bd = hi.nextInt();
			System.out.println("Please enter month to view calender (in numerals)");
			int dc = hi.nextInt();
			A.m1(bd,dc);
		}
		else if(x==1)
		{
				System.out.println("Enter Year you would like to visit");
			int h = hi.nextInt();

				System.out.println("Please enter month to view calender (in numerals)");
			int i = hi.nextInt();

				System.out.print("Enter number to view Day of the date\n");
			new A(i,h);
		}

		else if(x==4)
		{
			System.exit(0);
		}
		else
		{
			System.out.print("Sorry i can't find from what you entered");
			System.exit(0);
		}
}


A(int a,int b)
{
	int t;
	int m;
	int c;
if(a<=0||a>12)
{
System.out.print("There is no Month for given input");
}
else
{
if((b%400==0)||(b%4==0 && b%100!=0))
{
t=3;
m=1095;
c=0;
for(int k = 8;k<=b;k=k+4)
{
		if((k%400==0)||(k%4==0 && k%100!=0))
		{
			t=t+5;
			m = m +1095+(366);
		}
		else
		{
			t=t+4;
			m = m+1095+(365);
		}	
}

if(a==1)
{

	for(int i = 1+m;i<=31+m;i++)
	{
		if(i-m==date)
		{
			m6(i);
		}
	}
}
if(a==2)
{

	for(int i = 32+m;i<=60+m;i++)
	{
		if(i-(31+m)==date)
		{
			m7(i);
		}
	}
}
if(a==3)
{

	for(int i = 61+m;i<=91+m;i++)
	{
		if(i-(60+m)==date)
		{
			m6(i);
		}
	}
}
if(a==4)
{
	for(int i = 92+m;i<=121+m;i++)
	{
		if(i-(91+m)==date)
		{
			m7(i);
		}
	}
}
if(a==5)
{
	for(int i =122+m;i<=152+m;i++)
	{
		if(i-(121+m)==date)
		{
			m6(i);
		}
	}
}
if(a==6)
{

	for(int i = 153+m;i<=182+m;i++)
	{
		if(i-(152+m)==date)
		{
			m7(i);
		}

	}
}
if(a==7)
{

	for(int i = 183+m;i<=213+m;i++)
	{
		if(i-(182+m)==date)
		{
			m6(i);
		}
	}
}
if(a==8)
{

	for(int i = 214+m;i<=244+m;i++)
	{
		if(i-(213+m)==date)
		{
			m7(i);
		}

	}
}
if(a==9)
{

	for(int i = 245+m;i<=274+m;i++)
	{
		if(i-(244+m)==date)
		{
			m6(i);
		}
	}
}
if(a==10)
{

	for(int i = 275+m;i<=305+m;i++)
	{
		if(i-(274+m)==date)
		{
			m7(i);
		}
	}
}
if(a==11)
{

	for(int i = 306+m;i<=335+m;i++)
	{
		if(i-(305+m)==date)
		{
			m6(i);
		}
	}
}
if(a==12)
{

	for(int i = 336+m;i<=366+m;i++)
	{
		if(i-(335+m)==date)
		{
			m7(i);
		}
	}
}


}
else
{
t=0;
m=0;
c=0;
for(int k = 2;k<=b;k++)
{
	if((k%400==0)||(k%4==0 && k%100!=0))
	{
		t = t+2;
		m = m + 366;
	}
	else
	{
		m = m +365;
		t=t+1;
	}
}


if(a==1)
{
	for(int i = m+1;i<=31+m;i++)
	{
		if(i-m==date)
		{
			m7(i);
		}
	}
}
if(a==2)
{
	for(int i = 32+m;i<=59+m;i++)
	{
		if(i-(31+m)==date)
		{
			m6(i);
		}
	}
}
if(a==3)
{
	for(int i = 60+m;i<=90+m;i++)
	{
		if(i-(59+m)==date)
		{
			m7(i);
		}
	}
}
if(a==4)
{
	for(int i = 91+m;i<=120+m;i++)
	{
		if(i-(90+m)==date)
		{
			m6(i);
		}
	}
}
if(a==5)
{
	for(int i =121+m;i<=151+m;i++)
	{
		if(i-(120+m)==date)
		{
			m7(i);
		}
	}
}
if(a==6)
{
	for(int i = 152+m;i<=181+m;i++)
	{
		if(i-(151+m)==date)
		{
			m6(i);
		}
	}
}
if(a==7)
{
	for(int i = 182+m;i<=212+m;i++)
	{
		if(i-(181+m)==date)
		{
			m7(i);
		}
		
	}
}
if(a==8)
{
	for(int i = 213+m;i<=243+m;i++)
	{
		if(i-(212+m)==date)
		{
			m6(i);

		}
	}
}
if(a==9)
{

	for(int i = 244+m;i<=273+m;i++)
	{
		if(i-(243+m)==date)
		{
			m7(i);
		}
	}
}
if(a==10)
{
		
	for(int i = 274+m;i<=304+m;i++)
	{
		if(i-(273+m)==date)
		{
			m6(i);
		}
			
	}
}
if(a==11)
{

	for(int i = 305+m;i<=334+m;i++)
	{
		if(i-(304+m)==date)
		{
			m7(i);
		}			
	}
}
if(a==12)
{
	for(int i = 335+m;i<=365+m;i++)
	{
		if(i-(334+m)==date)
		{
			m6(i);
		}
	}
}

	
}
}
System.out.print("\n	1 -> Re-enter date\n2 -> monthly calendar		3 -> yearly calendar\n4 -> EXIT\n");
m5();
}



	void m6(int a)
	{		
		if(a%7==0)
		{
			System.out.print("You can take rest it's SUNday");
		}
		
		else if(a%7==1)
		{
			System.out.print("Its working MONday");
		}
		else if(a%7==2)
		{
			System.out.print("tricking TUESday");
		}
		else if(a%7==3)
		{
			System.out.print("Have a wonderful WEDNESday");
		}
		else if(a%7==4)
		{
			System.out.print("Tea THURSday");
		}
		else if(a%7==5)
		{
			System.out.print("FRIday film day");
		}
		else if(a%7==6)
		{
			System.out.print("Chill out SATURday");
		}	
	}
	void m7(int b)
	{
		if(b%7==0)
		{
			System.out.print(date+" is SUNDAY");
		}
		else if(b%7==1)
		{
			System.out.print("MONDAY Minds");
		}
		else if(b%7==2)
		{
			System.out.print("TUESDAY Times reporting sir");
		}
		else if(b%7==3)
		{
			System.out.print("Welcome to WEDNESDAY");
		}
		else if(b%7==4)
		{
			System.out.print("Treasured THURSDAY");
		}
		else if(b%7==5)
		{
			System.out.print("Focus FRIDAY");
		}
		else if(b%7==6)
		{
			System.out.print("Sentimental SATURDAY");
		}
	}



public static void main(String[] args)
{
	System.out.println("Choose the Calender you like to view\n1 - Monthly\n2 - Yearly\n3 - Day for date\n4 - For Exit");
	int z = hi.nextInt();

	if(z==1)
	{
		System.out.println("Enter Year you would like to visit");
		int f = hi.nextInt();
		System.out.println("Please enter month to view calender (in numerals)");
		int g = hi.nextInt();
		A.m1(f,g);
	}
	else if(z==2)
	{
		System.out.println("Enter Year you would like to visit");
		A.m2(hi.nextInt());
	}
	else if(z==3)
	{
			System.out.println("Enter Year you would like to visit");
		int b = hi.nextInt();

			System.out.println("Please enter month to view calender (in numerals)");
		int a = hi.nextInt();

			System.out.print("Enter number to view Day of the date\n");
		new A(a,b);

	}
	else if(z==4)
	{
		System.exit(0);
	}

	else
	{
		System.out.print("Sorry you choosed wrong option \n(*but we are considering it as exit*)");
	}
}
}