package testksrabhilash;
import java.lang.String;
public class CountDuplicateCharactersInAString {
	//String string1;
	public static void main(String[] args) {
		findDuplicateCharactersInAString("Programming");
	}
	
	public static void  findDuplicateCharactersInAString(String string1) {
		
		
		//string1 = "";
		char string [] = string1.toCharArray();	
		int count;
		//String res = "";
		
		for(int i=0;i<string1.length();i++) {
			
			count =1;
			for(int j=i+1;j<string1.length();j++) {
				
				if(string[i]==string[j]) {
					count++;
				
					string[j]=0;
				}
				
			}
			if(count>1 && string[i]!='0')
				System.out.println(string[i]);
		}
	}

}
