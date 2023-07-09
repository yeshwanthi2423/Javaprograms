class First{
	public static void main(String[] args) {
		int m=Integer.parseInt(args[0]);
		int n=Integer.parseInt(args[1]);
		System.out.println("Before Swapping = "+m+" "+n);
		int z=m;
		m=n;
		n=z;
		System.out.println("After  Swapping = "+m+" "+n);
	}
}