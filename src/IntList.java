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
		int index = 1;
		while(index < list.size())
		{
			if(list.get(index-1) < list.get(index))
			{
				return false;
			}
			index++;
		}
		return true;
	}
	public int largest()
	{
		int index = 0;
		int largest = list.get(index);
		while(index < list.size())
		{
			if(list.get(index) > largest)
			{
				largest = list.get(index);
			}
			index++;
		}

		return largest;
	}
	public int numOdds()
	{
		int numodd = 0;
		int index = 0;
		while(index < list.size())
		{
			if(list.get(index)%2 == 1)
			{
				numodd++;
			}
			index++;
		}


		return numodd;
	}
	public void removeEvens()
	{
		int index = 0;
		while(index < list.size())
		{
			if(list.get(index)%2 == 0)
			{
				list.remove(index);
				index--;
			}
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
			num = num + list.get(index) + ", ";
			index++;
		}
		num = num + end;
		return num;
	} 
}
