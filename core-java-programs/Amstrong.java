public class Amstrong{
	public static void main(String[] args) {
		int sum=0;
		int n=Integer.parseInt(args[0]);
		int p=n;
		while(n>0){
			int d=n % 10;
			sum=sum+d*d*d;
			n=n/10;
		}
		if(sum==p)
		System.out.println(sum+" is an Amstrong number.");
	else
		System.out.println((sum+" is not an Amstrong number."));
	}
}
