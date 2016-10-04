import java.util.ArrayList;
public class FruitsRunner 
{
	public static void main(String[] args)
	{
		ArrayList <Fruit> basket = new ArrayList <Fruit>();
		basket.add(new Banana());
		for (Fruit a : basket)
		{	
		a.isColor();
		}
	}
}
