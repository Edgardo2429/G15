import java.util.Scanner;

public class Calcular_Vacaciones{
  public static void main(String args[]){

    Scanner in = new Scanner(System.in);
    String nombre = "";
    int clave = 0;
    float antiguedad = 0;
    System.out.println("*******************************************************");
    System.out.println("*Bienvenido al Sistema Vacacional de Coca-Cola Company*");
    System.out.println("*******************************************************");
    System.out.println("");
    System.out.println("");
	
    System.out.print("Ingrese el nombre del trabajador: ");
    nombre = in.nextLine();
    System.out.println("");

    System.out.print("Ingrese los años de servicio: ");
    antiguedad = in.nextFloat();
    System.out.println("");

    System.out.print("Ingrese el numero de clave de su departamento: ");
    clave = in.nextInt();
    System.out.println("");

    if(clave == 1){
      
      if(antiguedad == 1){
        System.out.println("El Trabajador " + nombre + " tiene derecho a 6 dias de vacaciones");
      } else if(antiguedad >= 2 && antiguedad <= 6){
        System.out.println("El Trabajador " + nombre + " tiene derecho a 14 dias de vacaciones");
      } else if(antiguedad >= 7){
        System.out.println("El Trabajador " + nombre + " tiene derecho a 20 dias de vacaciones");
      }

    }  else if(clave == 2){
 
       if(antiguedad == 1){
        System.out.println("El Trabajador " + nombre + " tiene derecho a 10 dias de vacaciones");
      } else if(antiguedad >= 2 && antiguedad <= 6){
        System.out.println("El Trabajador " + nombre + " tiene derecho a 20 dias de vacaciones");
      } else if(antiguedad >= 7){
        System.out.println("El Trabajador " + nombre + " tiene derecho a 30 dias de vacaciones");
      }
    }  else if(clave == 3){
       if(antiguedad == 1){
        System.out.println("El Trabajador " + nombre + " tiene derecho a 10 dias de vacaciones");
      } else if(antiguedad >= 2 && antiguedad <= 6){
        System.out.println("El Trabajador " + nombre + " tiene derecho a 20 dias de vacaciones");
      } else if(antiguedad >= 7){
        System.out.println("El Trabajador " + nombre + " tiene derecho a 30 dias de vacaciones");
      }

    }  else {
      System.out.println("¡Error!, La clave de departamento es incorrecta");
    }
 }
}   