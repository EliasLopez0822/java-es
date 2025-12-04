    import java.util.Scanner;
public class area_de_un_hexagono {
    public static void main (String[]args){
        //DATOS DEL CODIGO
      double  area, apotema, perimetro ;
        
        Scanner val  = new Scanner(System.in);

        System.out.print("Ingrese el valor de apotema hexagono: ");
        apotema = val.nextFloat();
        
        System.out.print("Ingrese el perimetro del hexagono : ");
        perimetro = val.nextFloat();

        area = (apotema * perimetro)/2;
       

        System.out.println("Área del Hexagono: " + area);   
    }    
}

