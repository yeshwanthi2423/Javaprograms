public class Perfectnumber{
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int sum=0;
		for(int i=1;i<=n/2;i++){
			if(n%i==0){
				sum += i;
			}
		}
		if (sum==n)
			System.out.println(n+" is perfect number");
		else
			System.out.println(n+" is not a perfect number");
	}
}