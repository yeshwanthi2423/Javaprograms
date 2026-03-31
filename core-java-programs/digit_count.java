public class Digits{
	public static void main(String[] args) {
		int A=Integer.parseInt(args[0]);
		int Z=A;
		int sum=0;
		int Am=0;
		while(A>0){
			int d=A%10;
			System.out.println("last digit="+A+" is "+d);
			sum+=d*d*d;
			A=A/10;
	}
            System.out.println("sum of digits ="+sum);
            if(sum==Z)
            System.out.println(Z+" "+"is an Amstrong number");
        else
        	System.out.println(Z+" "+"is not an Amstrong number");	
	}
}
