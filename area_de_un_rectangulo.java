    package itsoeh;
import java.util.Scanner;
public class area_de_un_rectangulo {
    public static void main (String[]args){
        //DATOS DEL CODIGO
      double base, altura, area, perimetro;

        Scanner val = new Scanner(System.in);

        System.out.print("Ingrese la base del rectángulo: ");
        base = val.nextDouble();
        
        System.out.print("Ingrese la altura del rectángulo: ");
        altura = val.nextDouble();

        area = base * altura;
        perimetro = 2 * (base + altura);

        System.out.println("Área del rectángulo: " + area);
        System.out.println("Perímetro del rectángulo: " + perimetro);   
    }    
}

