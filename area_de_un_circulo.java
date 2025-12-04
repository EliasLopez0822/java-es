import java.util.Scanner;
public class area_de_un_circulo {
    public static void main (String[]args){
     
      double area, pi, radio ;

        Scanner val = new Scanner(System.in);

        System.out.print("Ingrese el radio del circulo: ");
        radio = val.nextFloat();
        
        pi=3.1416;
        area = (radio * pi*pi) ;
      

        System.out.println("Área del rectángulo: " + area);
     
    }    
}