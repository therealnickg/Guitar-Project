/* Created by Nicolas Guardado on 5/16/2020
 * 
 * Tester class that will test string knowledge and maybe
 * even more in the future!
 * 
 * Takes advantage of the Guitar class.
 */
public class Tester {
  
  public static void main(String args[]) {
    
    System.out.println("Music Tester!");
    System.out.println("EADGBA, hope it helps :)");
    
    Guitar g = new Guitar();
    MusicNotes m = new MusicNotes();
    int score = 0;
    int tally = 0;
    
    //g.printNote(4,6);
    //g.printNote(3,9);
    
    System.out.println("\t1\t2\t3\t4");
    System.out.println("\t\\/\t/\\\t\\/\t\\/");
    while (true) {
      if (tally > 10)
        break;
      tally++;
      
      if (g.askRandomNote()) {
        score++;
      }
        
      //g.askRandomNote();
      //g.askRandomNote5and6();
      //m.askHalfStepNote();
    }
    
    System.out.println(score + " / " + tally + " = " +  ( (double) score/tally) + "%");
    
  }
  
}