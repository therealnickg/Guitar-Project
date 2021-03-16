/* 
 * The notes in music
 */
import java.util.Scanner;

class MusicNotes extends CurbYourAnswers {
  
  String[] musicalnotes = {"C","C#","D","D#","E","F","F#","G","G#","A","A#","B"};
  Scanner scan = new Scanner(System.in);
    
  // Asks the user to identify what not comes either before or after
  public void askHalfStepNote() {
    
    // Both look into the array of Strings of notes
    int targetNumber = (int) (Math.random()*12) + 1; // The offset number of the note you're trying to figure out
    int note = (int) (Math.random()*12); // The number of the actual note you're comparing against
    int aboveorbelow = (int) (Math.random()*2); // Is the target note above or below the one you're comparing against?
    
    if (aboveorbelow == 0) {
      System.out.println("What is the note " + targetNumber + " half-steps below an " + musicalnotes[note] + "?");
      targetNumber *= -1;
    } else {
      System.out.println("What is the note " + targetNumber + " half-steps above an " + musicalnotes[note] + "?");
    }
    String targetNote = findNote(note, targetNumber); // The actual note we are trying to find, as a String
    
    String user = scan.nextLine();
    System.out.println(checkAnswer(user, targetNote));
    
  }
  
  // Finds the target note that the user is trying to identify
  public String findNote(int note, int target) {
    if (note + target < 0) {
      return musicalnotes[12+note+target];
    } else if (note + target > 12) {
      return musicalnotes[note-12+target];
    }
    return musicalnotes[note+target];
  }
  
}