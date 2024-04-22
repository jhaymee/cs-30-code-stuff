public class SumRunner
{
	public static void main( String[] args )
	{
		Sum test = new Sum();				
		test.setNums(2,6);
		test.sum( );
		test.print();
		
		Sum test2 = new Sum();
		test.setNums(3,7);
		test.sum();
		test.print();
		
		//add more test cases		
	}
}