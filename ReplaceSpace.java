public class ReplaceSpace{

	public static void main(String[] args){
		
		String stringWithSpace = "a b c";
        	String newString = "";

		for( int i = 0; i < stringWithSpace.length(); i++ ){
		
			Character currentCharacter = stringWithSpace.charAt(i);

			if ( currentCharacter.toString().trim().length() == 0 ){
				newString += "%20";
			}
			else{
			 	newString += currentCharacter.toString(); 
			}
		}

		System.out.println(newString);
	}
}
