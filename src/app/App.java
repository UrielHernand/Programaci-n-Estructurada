package app;
import java.io.*;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in); 
        int lugar;
        

        

       Agenda <Integer> s = new  Agenda <>();
       String Name,primerApellido,segApellidoString; //Declaración de las variables 
       System.out.println("Primer nombre");
       Name=leer.nextLine();
                             

      System.out.println("Primer Apellido");
      primerApellido=leer.nextLine();
      
      System.out.println("Segundo  Apellido");
      segApellidoString=leer.nextLine();
      

      s.nombresString(Name,primerApellido,segApellidoString);
      
      Contact[] friends= new Contact[7];


        friends[0]= new Contact("Sergio", "Mendez", "123456789");
        friends[1]= new Contact("Juan", "López", "123456799");
        friends[2]= new Contact("Ivan", "Valencia", "123453389");
        friends[3]= new Contact("Rocio", "Saldaña", "1555556789");
        friends[4]= new Contact("Pedro", "Martinez", "1289999989");
        friends[5]= new Contact("Diana", "Martinez", "1258744444");
        friends[6]= new Contact("Luis", "Perez", "5887422584");





      do{  

         System.out.println("Menú de opcines");
         System.out.print("Elige un a opción ");
         System.out.println("(1)------1. Sin orden (Tal como esta dentro del arreglo) ");
         System.out.println("(2) ---- 2. Ordenación por selección ");
         System.out.println("(3) ---- 3. Ordenación por inserción ");       //Estructura de un menú de opciones 
         System.out.println("(4) -----4. Ordenación por método burbuja  ");
         System.out.println("(5) -----5. Búsqueda lineal");
         System.out.println("6  ------6  Búsqueda binaria");
         lugar=leer.nextInt();
        
         
         

         //Switch sentencia de control para elegir entre varias opciones
         //Evalúa una variable , en este caso evalúa la variable Lugar
                      //evaluará 
                
      
         switch(lugar)
         {

          case 1:

          for (int i=0; i< numeros.length; i++){
            System.out.println(numeros[i]);
     
         }

          
           
          break;                     
          case 2:      
          Integer[] numeros3={2,5,100,6,4,3,0,9,20,8,69,44};
            Agenda<Integer> orden=new Agenda<>();

          System.out.println("Ordenamiento por seleccion");
          orden.selectionSort(numeros3);

          for (int i=0; i< numeros3.length; i++){
            System.out.println(numeros3[i]);
       
        
         }              
          
          break;
                                     ////El objeto creado actuará con su respectivo método en cada caso  
          case 3:     
          s.insertionSort(numeros);
          System.out.println("Ordenamiento por insercion");

         for (int i=0; i< numeros.length; i++){
            System.out.println(numeros[i]);
     
         }
           
         
          break;
          case 4:
          System.out.println("Ordenamiento por burbuja");
            s.bubbleSort(numeros);

           for (int i=0; i< numeros.length; i++){
            System.out.println(numeros[i]);
           }

          
          break;
          case 5:
          System.out.println(s.lineaSearch(numeros,0,7,100));

          
          break;

          case 6:
          System.out.println(s.binarySearch(numeros2,0,numeros2.length-1,500));
          break;
          
          default:
          System.out.println("Elige una opción, revísa revisa  ");
          
         


         }

         

      } while(lugar>0);   //este ciclo de podría seguir siempre y cuando la variable lugar sea mayor que 0 

      
        
    }
    
}