public class Anagram {
	
	public static void main(String[] args){

		String originalWord = "angel";
		String anagram = "glean";
		Boolean isAnagram = false;

		if( originalWord.length() == anagram.length() ){
		
			for(int x = 0 ; x < anagram.length(); x++ ){
				
				if(!originalWord.contains( Character.toString( anagram.charAt(x) ) )){
					isAnagram = false;
					break;
				}else{
					isAnagram = true;
				}
			}
		}
		
		System.out.println("Is anagram? " + isAnagram);
	}

}
