class TailRecursion{
    public static void main(String[] args){
		TailRecursion obj = new TailRecursion();
		//print 1 to 10 using recursion
		obj.printAsc(10);
	}
    void printAsc(int n){
		
		if(n>0){
			printAsc(n-1);
			System.out.println(n);
		}
	}
}