package codewars;
 
public class RemoveFirstandLastCharacter {
 
 	public static void main(String[] args) {
 		String result = removeChars("exemplo");
        System.out.println(result);
 
 	}
 
 	
 	public static String removeChars(String input) {
        if (input.length() < 2) {
            return input;
        }
        return input.substring(1, input.length() - 1);
    }
}
