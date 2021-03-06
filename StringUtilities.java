import java.util.*;
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        
        return input;
        
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        
        return (  baseValue  +  valueToBeAdded  );
        
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        
        String reverse = new StringBuffer (valueToBeReversed) .reverse() .toString();
        return reverse;
        
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        return word.charAt( (word.length() -1 ) /2 );
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        
       String strNew = value.replace(String.valueOf(charToRemove) ,""); 
       return strNew;
       
         /*StringBuffer r = new StringBuffer( value.length() );       
         r.setLength( value.length() );
       int current = 0;
      for (int i = 0; i < value.length()-1; i ++) {
         char cur = value.charAt(i);
         if (cur != charToRemove) r.setCharAt( current++, cur );
      }
      return r.toString();*/
    }
    

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
       String  lastword = sentence.substring (sentence.lastIndexOf(" ") + 1 );
        return lastword;
    }
}
