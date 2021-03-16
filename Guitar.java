/* Guitar class that consists of six strings.
 * Asks the user which note is played on what string.
 */
import java.util.Scanner;

public class Guitar extends CurbYourAnswers {
  
  Scanner scan = new Scanner(System.in);
  GuitarString[] s;
  
  // Creates a guitar with six strings
  public Guitar() {
    
    s = new GuitarString[6];
    for (int i = 0; i < 6; i++) {
      s[i] = new GuitarString();
    }
    initializeGuitar();
    
  }
  
  // Asks the user to identify a random note anywhere on the guitar neck
  public boolean askRandomNote() {
    
    int fret = (int) (Math.random()*25);
    int number = (int) (Math.random()*6);
    
    System.out.println("What is the note on the " + fret + " fret off of the " +
                       (number+1) + " string?");
    String user = scan.nextLine();
    
    if (checkAnswer(user, s[number].getNote(fret)))
      return true; 
    return false;
  }
  
  // Asks the user to identify a random note somewhere on the fifth or
  // sixth string on the guitar
  public boolean askRandomNote5and6() {
    
    int fret = (int) (Math.random()*25);
    int number = ((int) (Math.random()*2)) + 4;
    
    System.out.println("What is the note on the " + fret + " fret off of the " +
                       (number+1) + " string?");
    String user = scan.nextLine();
    
    if (checkAnswer(user, s[number].getNote(fret)))
      return true; 
    return false;
  }
  
  // Prints the note on a particular fret from a string
  public void printNote(int number, int fret) {
    System.out.println("The note on the " + fret + " fret off the " + number +
                       " string is the " + s[number].getNote(fret));
  }
  
  public void initializeGuitar() {
    // Creates first and sixth string: E
    String[] estring = {
      "E","F","F#","G","G#","A","A#","B","C","C#","D","D#",
      "E","F","F#","G","G#","A","A#","B","C","C#","D","D#",
      "E"};
    s[0].setString(estring);
    s[5].setString(estring);
    
    // Creates second string: B
    String[] bstring = {
      "B","C","C#","D","D#","E","F","F#","G","G#","A","A#",
      "B","C","C#","D","D#","E","F","F#","G","G#","A","A#",
      "B"};
    s[1].setString(bstring);
    
    // Creates third string: G
    String[] gstring = {
      "G","G#","A","A#","B","C","C#","D","D#","E","F","F#",
      "G","G#","A","A#","B","C","C#","D","D#","E","F","F#",
      "G"};
    s[2].setString(gstring);
    
    // Creates fourth string: D
    String[] dstring = {
      "D","D#","E","F","F#","G","G#","A","A#","B","C","C#",
      "D","D#","E","F","F#","G","G#","A","A#","B","C","C#",
      "D"};
    s[3].setString(dstring);
    
    // Creates fifth string: A
    String[] astring = {
      "A","A#","B","C","C#","D","D#","E","F","F#","G","G#",
      "A","A#","B","C","C#","D","D#","E","F","F#","G","G#",
      "A"};
    s[4].setString(astring);
  }
  
}