import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userInput;

		System.out.println("Enter a sentence to translate it to Pig Latin: ");
		userInput = scan.nextLine();
		userInput = userInput.toLowerCase();
	// check if starts with vowel
		if (startsWithVowel(userInput)) {
			System.out.println(userInput + "way");
			// if vowel add way to the end
		} else {
			int vowIndex = indexOfFirstVowel(userInput);
//				String consonants = firstConsonant(vowIndex, userInput);
			System.out.println(userInput.substring(vowIndex) + userInput.substring(0, vowIndex) + "ay");
		}

		// check if starts with consonant
		// if true process pig Latin

		scan.close();

	}

	public static int indexOfFirstVowel(String word) {
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'a' || word.charAt(i) == 'o' || word.charAt(i) == 'e' || word.charAt(i) == 'u'
					|| word.charAt(i) == 'i') {
				return i;
			}
		}
		return -1;
	}

	public static String firstConsonant(int vowelIndex, String word) {
		String consonants = word.substring(0, vowelIndex);
		return consonants;
	}

	public static boolean startsWithVowel(String word) {
		if (word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'o' || word.charAt(0) == 'u') {
			return true;
		}
		return false;
	}

}

//}
