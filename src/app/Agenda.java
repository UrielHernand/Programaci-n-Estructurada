package app;

/**
 * Agenda
 */
public class Agenda <T extends Comparable> {

   public String name;
   public  String primerApe;
   public String segundoApeM;

 public Agenda() {


 }
 public void  nombresString(String name ,String primerApe,String segundoApeM) {
     this.name= name;
     this.primerApe= primerApe;
     this.segundoApeM=segundoApeM;

     System.out.print("Hola : " + name + ".."+ primerApe + "..."+ segundoApeM);

 }

    

        //Busqueda lineal   
public boolean lineaSearch(T[] data, int min,int max, T target){
    int index=min;
    boolean found=false;

    while(!found && index<=max){
        if (data[index].compareTo(target)==0){  //0=igual -1=menor 1=mayor
            found=true;
        }
        index++;
    }
    return found;
}

//Busqueda binaria
public boolean binarySearch(T[] data, int min, int max, T target){

    boolean found=false;

    int midpoint=(min+max)/2;

    if (data[midpoint].compareTo(target)==0){
        found=true;
    }else if(data[midpoint].compareTo(target) > 0){
        if (min<=midpoint-1){
            found= binarySearch(data, min, midpoint-1, target);
        }
    }else if(midpoint+1 <= max){
            found= binarySearch(data,  midpoint+1, max, target);
    }

    return found;

}//metodo binario

//Ordenamiento por seleccion

public void selectionSort(T[] data){
    int min;
    T temp;

    for (int index=0; index<data.length-1; index++){
        min=index;
        for (int scan=index+1; scan<data.length;scan++){

            if(data[scan].compareTo(data[min])<0){
                min=scan;
            }

        }

        temp=data[min];
        data[min]=data[index];
        data[index]=temp;

    }
}

//Ordenamiento por insercion

public void insertionSort(T[] data){

for (int index=1;index<data.length; index++){

    T key=data[index];
    int position=index;

    while(position>0 && data[position-1].compareTo(key)>0){
        data[position]= data[position-1];
        position--;
    }

    data[position]=key;
}

}


//metodo burbuja

public void bubbleSort(T[] data){
     
    int position, scan;
    T temp;

    for(position=data.length-1; position>=0; position --){
    
        for (scan=0; scan<=position-1; scan++){

            if(data[scan].compareTo(data[scan+1])>0){

                temp=data[scan];
                data[scan]=data[scan+1];
                data[scan+1]=temp;

            }

        }

    }
}


//ordenacion rapida

public void quickSort(T[] data, int min, int max){

    int indexofPartition;

    if(max-min>0){
        indexofPartition=findPartition(data, min, max);

        quickSort(data, min, indexofPartition-1);
        quickSort(data, indexofPartition+1, max);

    }
}

     
private int findPartition(T[] data, int min, int max){
 
        int left, right;
        T temp, partitionelement;

        partitionelement=data[min];
        left=min;
        right=max;

        while(left<right){

            while(data[left].compareTo(partitionelement)<=0 && left<right){
                left ++;
            }       

            while(data[right].compareTo(partitionelement)>0){
                right --;
            }

            if (left<right){
                temp=data[left];
                data[left]=data[right];
                data[right]=temp;
            }
        }

        temp=data[min];
        data[min]=data[right];
        data[right]=temp;

        return right;

}






    
}