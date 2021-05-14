package calculadora;

import java.util.Scanner;

public class Calculadora {
 public static void main(String[] args){
   Double memoria = 0.0;
   int menu = 6;
   Scanner teclado = new Scanner(System.in);

   do {
     System.out.println("Memoria "+ memoria);
     print_menu();
     System.out.print("Digite sua opção: ");
     menu = teclado.nextInt();
     switch(menu) {
      case 1:
        memoria = soma(memoria);
        break;
      case 2:
        memoria = subtrair(memoria);
        break;
      case 3:
        memoria = multiplicar(memoria);
        break;
      case 4:
        memoria = dividir(memoria);
        break;
      case 5:
        memoria = 0.0;  
        break;
      default:
          System.out.println("Opção ");
        break;
     }
   }while(menu != 6);

 }

public static void print_menu(){
    System.out.println("(1) Somar");
    System.out.println("(2) Subtrair");
    System.out.println("(3) Multiplicar");
    System.out.println("(4) Dividir");
    System.out.println("(5) Limpar memoria");
    System.out.println("(6) Sair");
}

 public static double soma(Double x){
  return x + entrada("somar");
 }

 public static double subtrair(Double x){
  return x - entrada("subtrair");
 }

 public static double multiplicar(Double x){
   return x * entrada("multiplicar");
 }

  public static double dividir(Double x){
    return (double) (x / entrada("dividir"));
  }
 
  public static double entrada(String className){
    System.out.print("Digite o numero que deseja " + className + ":");
    Scanner teclado = new Scanner(System.in);
    return teclado.nextDouble();
  }
}