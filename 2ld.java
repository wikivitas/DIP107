import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double litersPer100km;
    double milesPerGallon;

    System.out.print("liters-per-100km: ");
    litersPer100km = sc.nextDouble();
    sc.close();

    // TODO
    // Pārveidojiet litrus uz simts kilometriem
    // (kas atrodas mainīgā litersPer100km)
    // par jūdzēm uz galonu un izvadiet rezultatu 
    // (ar 2 cipariem aiz komata)

    // Pieņemsim: 
    // 1 galons ir 3.8 litri un 
    // 1 jūdze ir 1.6 kilometri
    
    milesPerGallon = 2.5*litersPer100km;
    
    System.out.printf("miles-per-gallon: %.2f", milesPerGallon);
  }
}
