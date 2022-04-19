import java.util.*;
class Upitransanction
{
	static int bal=10000;
	static void credit(int amount)
	{
		bal=bal+amount;
		System.out.println("Transanction completed");
System.out.println("remaining bal"+bal);
	}
	static void debit(int amount)
		{
			if(bal>amount)
			{
			bal=bal-amount;
		System.out.println("Transanction completed");
System.out.println("remaining bal"+bal);
	}
	else
	System.out.println("Insufficient balance");
	}
	static void checkbalance()
		{
			System.out.println("Balance amount:"+bal);
	}
public static void main(String args[])
{
	int op,x;
	int amount;
	Scanner sc=new Scanner(System.in);
	System.out.println("1.Phonepay\n2.Googlepay");
	System.out.print("Choose anyone merchant for banking:");
	op=sc.nextInt();
	switch(op)
	{
		case 1:
		System.out.println("Welcome to Phonepay banking");
		System.out.println("1.Credit\n2.Debit\n3.CheckBalance");
				do
				{
				System.out.print("Enter your option");
				x=sc.nextInt();
				switch(x)
				{
					case 1:
					System.out.print("Enter amount:");
					amount=sc.nextInt();
					credit(amount);break;
					case 2:
					System.out.print("Enter amount:");
								amount=sc.nextInt();
					debit(amount);break;
					case 3:
					checkbalance();break;
					default:System.out.print("invalid option");
			}
		}
while(x<4);

		break;
		case 2:
		System.out.println("Welcome to Googlepay banking");
		System.out.println("1.Credit\n2.Debit\n3.CheckBalance");
				do
				{
				System.out.print("Enter your option");
				x=sc.nextInt();
				switch(x)
				{
					case 1:
					System.out.print("Enter amount:");
					amount=sc.nextInt();
					credit(amount);break;
					case 2:
					System.out.print("Enter amount:");
								amount=sc.nextInt();
					debit(amount);break;
					case 3:
					checkbalance();break;
					default:System.out.print("invalid option");
			}
		}
while(x<4);
		break;
		default:System.out.print("Invalid option");
	}
}
}


		
