import java.util.*;


public class RemoveDuplicateCharacter{

	public static void main(String[] args){
		
		String s = "abbcd";

		String duplicateCharacters = "";

		for(int x = 0; x < s.length() ; x++){
			
			Character charAtIndex = s.charAt(x);	
	
			
			if(!duplicateCharacters.contains(charAtIndex.toString())){
			      
                               duplicateCharacters += charAtIndex.toString();
			}

			
		}       


		System.out.println(duplicateCharacters);         
	      
	}

}
