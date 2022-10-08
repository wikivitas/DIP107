import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double x, y;
    Scanner sc = new Scanner(System.in);
    
    try{
    x = sc.nextDouble();
    y = sc.nextDouble();
    sc.close();
    }
      
    catch(Exception ex){
      System.out.println("input-output error");
      System.out.println(ex.getMessage());
      sc.close();
      return;
    }
   
    if(( ((x>=3 && x<=7) && (y>=3 && y<=4 || y>=6 && y<=7)) || (x>=3 && x<=4 && y>4 && y<6) || (x>=6 && x<=7 && y>4 && y<6)))
    System.out.println("red");
    
    else if( Math.pow((x-5),2)<=(1-Math.pow((y-8),2)) && y>=8){ 
      System.out.println("green");
    }
    else if( y<=(x+5) && y<=(-x+15) && y>7 ){ 
      System.out.println("blue");
    }
    else System.out.println("white");
  }
}
