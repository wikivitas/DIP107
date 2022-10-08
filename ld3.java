import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, c;
    System.out.print("a=");
    a = sc.nextInt();
    System.out.print("b=");
    b = sc.nextInt();
    System.out.print("c=");
    c = sc.nextInt();
  
    // TODO: atrast un izvadīt mediānu
    if((b>a && b<c) || (b>c && b<a)){
      a=b;
    }
    else{
      if((c>a && c<b) || (c>b && c<a)){
        a=c;
      }
    }
    System.out.println(a);
    sc.close();
  }
}
