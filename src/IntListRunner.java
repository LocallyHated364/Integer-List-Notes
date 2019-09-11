public class IntListRunner 
{

	public static void main(String[] args) 
	{
		IntList list = new IntList();
		int count = 15;
		while(count > 0 )
		{
			list.add((int)(Math.random()*20+1));
			count--;
		}
		System.out.println(list);
		boolean asc = list.isAscending();
		System.out.println("Is this list ascending? " + asc );
		int largest = list.largest();
		System.out.println("The largest number in this list is " + largest );
		int numodd = list.numOdds();
		System.out.println("The number of odd numbers in this list is " + numodd);
		list.removeEvens();
		System.out.println("The list without even numbers = " + list );
		int index7 = list.indexOfSeven();
		System.out.println("the position of the first number in the list that is divisible by 7 is " + index7);
			
	}

}
