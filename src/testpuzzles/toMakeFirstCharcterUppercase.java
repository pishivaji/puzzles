//implementation 'org.apache.commons:commons-lang3:3.6'


package testpuzzles;

public class toMakeFirstCharcterUppercase {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//System.out.println(StringUtils.capitalize("ram"));
		
		String name = "rammohan";
		
		//name = name.substring(0,2).toUpperCase() + name.substring(2).toLowerCase();
		//name = name.substring(0,1).toUpperCase();
		//name = name.substring(0,3).toUpperCase() + name.substring(0,3).toLowerCase();
		
		//name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
		name =  name.substring(0,4).toLowerCase() + name.substring(4,5).toUpperCase()+ name.substring(8).toLowerCase();
		
		System.out.println(name);

	}

}
