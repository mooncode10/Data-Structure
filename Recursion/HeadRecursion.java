class HeadRecursion{
    public static void main(String[] args){
		HeadRecursion obj = new HeadRecursion();
		//print 10 to 1 using recursion
		obj.printDes(10);
	}

    void printDes(int n){
		
		if(n>0){
			System.out.println(n);
			printDes(n-1);
		}
	}
}