public class DNA {
    // DNA Sequencing
  
      String dna1 = "ATGCGATACGCTTGA";
      String dna2 = "ATGCGATACGTGA";
      String dna3 = "ATTAATATGTACTGA";
  
      String dna = dna2;
    public static void main(String[] args){
      DNA dnaObject = new DNA();
     int length = dnaObject.dna.length();
  System.out.println("Length: " + length);
  
   int start = dnaObject.dna.indexOf("ATG");
   System.out.println("Start: " + start);
   
    int stop = dnaObject.dna.indexOf("TGA");
  System.out.println("Stop: " + stop);
  
  if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
   
    String protein = dnaObject.dna.substring(start, stop+3); 
    System.out.println("Condition 1 and 2 are satisfied.");
   
  } else {
   
      System.out.println("No protein.");
  }
  if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
   
    System.out.println("Condition 1 and 2 and 3 are satisfied.");
   
  }
    }
  
  }