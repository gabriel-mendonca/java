
package aulapoo1;

import java.util.Scanner;


public class AulaPOO1 {

    public static void main(String[] args) {
        ClasseCaneta c1 = new ClasseCaneta();
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("digite a cor");
        
        c1.cor = teclado.nextLine();
        System.out.println("digite a ponta");
        c1.ponta = teclado.nextFloat();
        System.out.println("digite a carga");
        c1.carga = teclado.nextInt();
        c1.tampada = false;
        c1.tampada();
        c1.status();
        c1.rabiscar();
    }
    
}
