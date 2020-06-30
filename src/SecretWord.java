
/**
 * @author Thien Nguyen
 * @since May 31,2020
 * 
 * Class SecretWord:
 * This class represents the secret word as well as providing methods for different user interation
 * scenarios
 */


public class SecretWord {
	//SecretWord variable contains the secret word that the user trying to guess
	private String secretWord;
	//displayedWord variable contains the string that the GUI return to the user
	private String displayedWord;
	 /**
	  * Getter method that allows GUI to get displayedWord
	  * @return displayedWord
	  */
	public String getDisplayedWord() {
		return(displayedWord);
	}
	/**
	 * Getter method that allows GUI to get secretWord
	 * @return secretWord
	 */
	public String getSecretWord() {
		return (secretWord);
	}
	
	/**
	 * replaceChars method allows GUI to replace every character of a word with another specified character
	 * @param word
	 * @param letter
	 * @return replacedString
	 */
	public String replaceChars(String word, char letter) {
		//StringBuffer object was used instead of String to reduced processing power 
		StringBuffer replacedString = new StringBuffer();
		for(int i = 0; i < word.length(); i++) {
			replacedString.append(letter);
		}
		//toString() was used to change replacedString back to a string type
		return(replacedString.toString());
	}
	/**
	 * Constructor method that assigns a string literal to secretWord, then invoke replaceChars() method to
	 * replace all letter in secretWord with '*'
	 */
	public SecretWord() {
		secretWord = "downtown";
		displayedWord  = this.replaceChars(this.secretWord
			, '*');
	}
	/**
	 * This method replaces in s2 every occurrences of ch in s1.
	 * @overload replaceChars(String word, char letter)
	 * @param s1
	 * @param s2
	 * @param ch
	 * @return newString
	 */
	public String replaceChars(String s1, String s2, char ch) {
		//StringBuffer object was used instead of String to reduced processing power.
		StringBuffer newString = new StringBuffer();
		for (int i = 0; i < s2.length(); i++) {
			if (s1.charAt(i) == ch) {
				newString.append(ch);
			}
			else {
				newString.append(s2.charAt(i));
			}
		}
		return(newString.toString());
	}
	
	/**
	 * This method tests whether ch exists in secretWord, if so it will update secretWord, if not return false
	 * @param ch
	 * @return isit
	 */
	public boolean makeGuess(char ch) {
		boolean isit;
		if (secretWord.indexOf(ch) > -1) {
			displayedWord = replaceChars(secretWord, displayedWord, ch);
			isit = true;
		}
		else {
			isit = false;
		}
		return (isit);
	}
}
