
package trabalho1;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        
        FiguraGeometrica listaDeFiguras[] = new FiguraGeomatrica[4];
        double somaPerimetro = 0;
        double somaArea = 0;
        
        Scanner scan = new Scanner(System.in);
        
        for(int i=0; i<listaDeFiguras.length;i++) {
            if(i<2) {
                System.out.println("Digite o raio do circulo" +(i+1));
                Circulo c= new Circulo();
                
                c.setR(scan.nextDouble());
                listaDeFiguras[i] = c;
                
            }else {
                System.out.println("\ndugute a base4 do retangulo" + (i-1));
                
            }
        }
    }
    
}
