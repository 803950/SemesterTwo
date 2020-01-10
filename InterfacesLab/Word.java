//© A+ Computer Science
// www.apluscompsci.com

//generic comparable example

public class Word implements Comparable<Word>
{
  private String orig;
  public Word(String s) { orig = s; };

  public int compareTo(Word other) 
  {
     String ostring = other.toString();
     if(orig.length() > ostring.length()){
         return 1;
     }
     if(orig.length() < ostring.length()){
         return -1;
     } else{
         return 0;
     }
  }

  public String toString() { return orig; }
}
