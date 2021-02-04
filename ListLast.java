//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListLast
{
	public static boolean go(List<Integer> ray)
	{

    //create a Boolean variable b and set it to false
    boolean b = false;
    //create a for loop that will iterate for the length of the array
    for(int i=0; i<ray.size()-1; i++)
    {
      //create an if statement that checks the loops value and the variable to see if they are equivalent
      if(ray.get(i) == ray.get(ray.size()-1))
      {
        //inside the if Statement, b = true
        b = true;
      }
    }
    //return b
    return b;
	}
}