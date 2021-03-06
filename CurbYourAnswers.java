/*
 * Checks your answers and their enharmonic equivalent.
 */
class CurbYourAnswers {
  
  // Compares the user input to the actual note
  public boolean checkAnswer(String user, String note) {
    
    user = user.toUpperCase(); // *****
    String equivalent = checkEquivalent(note);
    
    if (user.equals(note) || user.equals(equivalent)) {
      System.out.println("true");
      return true;
    }
    
    System.out.println("false");
    if (note.equals(equivalent)) {
      System.out.println("The correct note is: " + note);
    } else {
      System.out.println("The correct note is: " + note + " or " + equivalent);    
    }
    return false;
    
  }
  
  // Finds the enharmonic equivalent of the # notes
  public String checkEquivalent(String note) {
    
    switch(note) {
      case "A#":
        return "Bb";
      case "C#":
        return "Db";
      case "D#":
        return "Eb";
      case "F#":
        return "Gb";
      case "G#":
        return "Ab";
    //-------------------- Just a spacing line
      case "Bb":
        return "A#";
      case "Db":
        return "C#";
      case "Eb":
        return "D#";
      case "Gb":
        return "F#";
      case "Ab":
        return "G#";
    }
    return note;
    
  }
  
}