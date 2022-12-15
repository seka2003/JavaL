class test2 {
	public static void main(String[] args) {

			int a,b,c;
			
            a=b=c=10;
			//this line get number from line 6 
            System.out.println("a = "+ a +","+"b ="+ b +", c = "+c);
            
            a = (b=(c = c+1)+2)+3;
            //c = 10 + 1, b = b + 1 +2, a = a + 1 + 2 + 3
            //this line get number from line 10
            System.out.println("a = "+ a +","+"b ="+ b +", c = "+c);
            
            a =(a=10)+(b=10);
	}
}