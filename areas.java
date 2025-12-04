import java.util.Scanner;
public class area_de_un_triangulo {
    public static void main (String[]args){
        //DATOS DEL CODIGO
      double baset, alturat, areat, baser, alturar, arear, areah, apotemah, perimetroh, areac, pic, radioc ;

        Scanner val  = new Scanner(System.in);

        System.out.print("Ingrese la base del triangulo: ");
        baset = val.nextFloat();
        
        System.out.print("Ingrese la altura del triangulo: ");
        alturat = val.nextFloat();

        areat = (baset * alturat)/2;
       

        System.out.println("Área del rectángulo: " + areat);   
        
        System.out.print("Ingrese la base del rectángulo: ");

        baser = val.nextDouble();
        
        System.out.print("Ingrese la altura del rectángulo: ");
        alturar = val.nextDouble();

        arear = baser * alturar;

        System.out.println("Área del rectángulo: " + arear);


        System.out.print("Ingrese el valor del apotema hexagono: ");
        apotemah = val.nextFloat();
        
        System.out.print("Ingrese el perimetro del hexagono : ");
        perimetroh = val.nextFloat();

        areah = (apotemah * perimetroh)/2;
       
        System.out.println("Área del Hexagono: " + areah);   

        System.out.print("Ingrese el radio del circulo: ");
        radioc = val.nextFloat();
        
        pic=3.1416;
        area = (radio * pi)**2 ;
      

        System.out.println("Área del rectángulo: " + areac);
     
    }    
}