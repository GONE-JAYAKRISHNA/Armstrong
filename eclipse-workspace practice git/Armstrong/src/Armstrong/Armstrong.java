package Armstrong;

public class Armstrong {
	
	public static void main(String[]args)
	{
	int num=15,rem,sum=0,temp=num;
	while(num>0)
	{
	rem=num%10;
	sum=rem*rem+sum;
	num=num/10;
	}
	if(temp==sum)
	System.out.println(temp+"is an Armstrong no containing 2digits");
	else
	System.out.println(temp+"is not an Armstrong no containing 2digits");
	}
	}
