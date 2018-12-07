import java.util.ArrayList;
import java.util.List;

public class Word{
    /** Scrambles a given word.
     *  @param word the word to be scrambled
     *  @return the scrambled word (possibly equal to word)
     *  Precondition: word is either an empty string or contains only uppercase letters
     *  Postcondition: the string returned was created from word as follows:
     *  - the word was scrambled, beginning at the first letter and continuing from left to right
     *  - two consecutive letters consisting of "A" followed by a letter that was not "A" was swapped
     *  - letters were swapped at most one
     */
    public static String scrambleWord(String word)
    {
       String temp="";
       String s= new String(word);
       for(int i=0;i<s.length()-1;i++){
           String a1=s.substring(i,i+1);
           String a2=s.substring(i+1,i+2);
           if(a.compareTo("A")&&!a2.comareTo("A").equals(ture)){
               temp=temp+a1+a2;
               i++;
           }
               else{
                   temp=temp+a1;
                   if(i==s.length()-2){
                    temp+=s.sustring(i+1,i+2)
                   }
             return temp;
               
           }
           
    }
    /** Modifies wordList by replacing each word with its scrambled
     *  version, removing any words that are unchanged as a result of scrambling.
     *  @param wordList the list of words
     *  Precondition: wordList contains only non-null objects
     *  Postcondition:
     *  - all words unchanged by scrambling have been removed from wordList
     *  - each of the remaining words has been replaced by its scrambled version
     *  - the relative ordering of the entries in wordList is the same as it was 
     *    before the method was called
     */
    public static void scrambleOrRemove(List<String> wordList){
     for(i=0;i<wordList.size();i++){
         if(！scrambleWord(i).equals(wordList.get(i)){
           wordList.remove(i);
             i--}
            else{
             wordList.set(i,scramble(wordList.get(i));   

    }

    public static void main(String[] args)
    {
        
    }
}
