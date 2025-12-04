import java.util.Scanner;
public class area_de_un_triangulo {
    public static void main (String[]args){
        //DATOS DEL CODIGO
      double base, altura, area;

        Scanner val  = new Scanner(System.in);

        System.out.print("Ingrese la base del triangulo: ");
        base = val.nextFloat();
        
        System.out.print("Ingrese la altura del triangulo: ");
        altura = val.nextFloat();

        area = (base * altura)/2;
       

        System.out.println("Área del rectángulo: " + area);   
    }    
}