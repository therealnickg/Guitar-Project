/* Guitar string class that consists of 25 notes including
 * the open string
 */
public class GuitarString {
  
  String[] n;
  
  // Creates a string with 25 notes
  public GuitarString() {
    
    n = new String[25];
    
  }
  
  // Adds the notes for a particular string
  public void setString(String[] t) {
    n = t;
  }
  
  // Returns the note from a particular fret
  public String getNote(int fret) {
    
    return n[fret];
      
  }
  
}