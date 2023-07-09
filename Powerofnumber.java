public class Powerofnumber{
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int p=Integer.parseInt(args[1]);
		int power=1;
		for(int i=1;i<=p;i++)
			power = power*n;
		System.out.println(power);
	}
}