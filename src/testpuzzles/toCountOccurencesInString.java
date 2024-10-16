package testpuzzles;

import java.util.HashMap;
import java.util.Map;

public class toCountOccurencesInString 
{
    
	
	public static void getCharCount (String str)
	{
		
		Map <Character,Integer> charMap = new HashMap <Character,Integer>();
		
		char strArray[] = str.toCharArray();
		
		for(char c: strArray)
		{
		if(!String.valueOf(c).isBlank())
		{
			
			if(charMap.containsKey(c))
			{
				charMap.put(c, charMap.get(c)+1);
			}
			else
			{
				charMap.put(c, 1);
			}
			
		}
		}
		
		
		System.out.println(str + ":" + charMap);
		
		
		
		
		
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
         getCharCount("Apple");
	}

}
