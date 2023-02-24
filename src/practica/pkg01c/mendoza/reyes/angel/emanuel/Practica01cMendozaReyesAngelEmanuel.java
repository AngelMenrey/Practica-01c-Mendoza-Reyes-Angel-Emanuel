
package practica.pkg01c.mendoza.reyes.angel.emanuel;

import java.util.Scanner;

public class Practica01cMendozaReyesAngelEmanuel {

    public static void main(String[] args) {
        int opc=0;
        String color, marca, placa, modelo;
        int NumCilindros, NumAsientos, Kilometros,precio;
        
        Scanner leer = new Scanner(System.in);
         Deportivo deportivo = new Deportivo();
        
         do{
        System.out.println("1-INGRESAR DATOS DEL AUTO DEPORTIVO");
        System.out.println("2-MOSTRAR DATOS DEL AUTO DEPORTIVO");
        System.out.println("3-SALIR");
        opc =leer.nextInt();
            
             switch(opc){
              case 1:
                  System.out.println("INGRESE EL COLOR DEL AUTO DEPORTIVO");
                  color = leer.next();
                  System.out.println("INGRESE NUMERO DE CILINDROS DEL AUTO DEPORTIVO");
                  NumCilindros = leer.nextInt();
                  System.out.println("INGRESE EL NUMERO DE ASIENTOS DEL AUTO DEPORTIVO");
                  NumAsientos = leer.nextInt();
                  System.out.println("INGRESE EL KILOMETRAJE RECORRIDO DEL AUTO DEPORTIVO");
                  Kilometros = leer.nextInt();
                  System.out.println("INGRESE LA MARCA DEL AUTO DEPORTIVO");
                  marca = leer.next();
                  System.out.println("INGRESE EL MODELO DEL AUTO DEPORTIVO");
                  modelo = leer.next();
                  System.out.println("INGRESE LA PLACA DEL AUTO DEPORTIVO");
                  placa = leer.next();
                  System.out.println("INGRESE EL PRECIO DEL AUTO DEPORTIVO");
                  precio = leer.nextInt();
                  break;
              case 2:
                   System.out.println("EL COLOR ES:  "+ deportivo.getColor());
                   System.out.println("EL NUMERO DE CILINDRO ES:  "+ deportivo.getNumCilindros());
                   System.out.println("EL NUMERO DE ASIENTOS ES:  "+ deportivo.getNumAsientos());
                   System.out.println("EL KILOMETRAJE RECORRIDO ES:  "+ deportivo.getKilometros());
                   System.out.println("LA MARCA ES:  "+ deportivo.getMarca());
                   System.out.println("EL MODELO ES:  "+ deportivo.getModelo());
                   System.out.println("LA PLACA ES:  "+ deportivo.getPlaca());
                   System.out.println("EL PRECIO ES:  "+ deportivo.getPrecio());
                  break;
           }
         }while(opc!=3);
          
         System.out.println("USTED A SALIDO DEL MENU");
    }
    
}
