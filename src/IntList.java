import java.util.ArrayList;
public class IntList 
{
	private ArrayList<Integer> list;
	public IntList()
	{
		list = new ArrayList<Integer>();
	}
	public void add(int num)
	{
		list.add(num);
	}
	public boolean isAscending()
	{
		// a loop has 3 essential pieces.
		// the first is the declaration of your index variable, commonly called "index" or just "i"
		int index = 1;
		// the second part of a loop is testing the variable, which means you write a parameter for you loop that incorporates your variable.
		while(index < list.size())
		{
			if(list.get(index-1) < list.get(index))
			{
				return false;
			}
			//the last part of a loop is modifying the variable.  idk if you know what the ++ means but 
			//it is a faster form of writing this equals itself plus one.
			index++;
		//this loops purpose is to determine if the list object, which contains integers, is strictly ascending. the if statement compares the
		// previous index to the current one and if it isnt ascending it returns false. if it goes through the loop until the last index variable, 
		// the loop ends and it returns true, because the if statement that checks if it doesnt ascend was never triggered.
		}
		return true;
	}
	public int largest()
	{
		//this loop has similar structure, a declaration of variable, testing said variable, then modifying that variable WITHIN the loop. writing
		// a loop that doesnt modify the variable will result in an endless loop, and is particularly nasty to end the program if you dont know how.
		int index = 0;
		//the purpose of this loop is to determine the largest number in my array list that contains integers. the first number is the largest
		int largest = list.get(index);
		while(index < list.size())
		{
			//this if statement compares the current largest to the current number selected by the index, and if it is true...
			if(list.get(index) > largest)
			{
				//it makes the new number the new largest number, since it was bigger than the previous.
				largest = list.get(index);
			}
			//remember to modify the index variable...
			index++;
		}
		//after the loop has ended return what should now be the largest number in your list.
		return largest;
	}
	//you can ignore these commented methods, they are merely recursive versions of some of these methods.
	/*public int largest(int i, int large)
	{
		if(list.get(i) > large || i == 0)
		{
			large = list.get(i);
		}
		if((i > list.size()))
		{
			return large;
		}
		return largest(i++, large);
	}*/
	public int numOdds()
	{
		//this loop goes through the list and counts the number of odds in the list.
		int numodd = 0;
		int index = 0;
		while(index < list.size())
		{
			//if you dont know what this if statement says, its saying that if the number selected has a remainder of 1 when divided by 2
			//then its odd, which is true, and to add one to the count of odd numbers in the list.
			if(list.get(index)%2 == 1)
			{
				numodd++;
			}
			//regardless of if the loop triggered, go to the next number.
			index++;
		}
		//after the loop has ended, return the number of odd numbers counted on the list.
		return numodd;
	}
	/*public int numOdds(int i, int numodd)
	{
		if(i == 0)
		{
			numodd = 0;
		}
		if(list.get(i)%2 == 1)
		{
			numodd++;
		}
		if(i > list.size())
		{
			return numodd;
		}
		return numOdds(i++, numodd);
	}*/
	public void removeEvens()
	{
		int index = 0;
		while(index < list.size())
		{
			if(list.get(index)%2 == 0)
			{
				list.remove(index);
				//as you might have noticed, array lists of objects have 4 native methods that you can call on any array list.
				//they are .get("integer") .remove("integer") .size() and .set("integer", "object")
				//when you remove an object from your list. the rest of the list shifts to the "left" the fill the hole. this means that
				//your index number will remain the same but the number its "pointing" at will have shifted to the left by one, meaning you 
				//need to do --, which is the opposite of ++. taking away one. 
				//notice this only happens if the object is removed, and it remains the same if the statement doesnt trigger.
				index--;
			}
			//always index++, except for when it isnt.
			index++;
		}
	}
	public int indexOfSeven()
	{
		int index = 0;
		while(index < list.size())
		{
			if(list.get(index)%7 == 0 )
			{
				return index;
			}
			index++;
		}
		return -1;
	}
	//this may be above you, but a toString() method lets you print the object and be able to see it in console, because the default toString
	//is a hexidecimal that tells your computer what it is, but doesnt tell you anything. 
	@Override
	public String toString()
	{
		int index = 0;
		String start = "{";
		String end = "}"; 
		String num = "";
		num = num + start;
		while(index < list.size())
		{
			if(index ==(list.size())-1)
			{
				num = num + list.get(index);
			}
			else
			{
				num = num + list.get(index) + ", ";
			}
			index++;
		}
		num = num + end;
		return num;
	} 
}
//this is it for the back end, the runner actually tells the methods to run and will print out the list, as well as all the return statements 
//for the methods listed here.





