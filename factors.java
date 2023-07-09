public class Factors{
	public static void main(String args[]){
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		int pc=0;
		for (int i=x;i<=y;i++){
		int count=0;
		for(int j=1;j<=i/2;j++){
       if(i%j==0){
          count++;
          if(count>1)
            break;
      }
  }
	if(count==1){
		System.out.print(i+ " ");
		pc++;
	}
}
	System.out.println("\nTotal no of primes="+pc);

}
}
