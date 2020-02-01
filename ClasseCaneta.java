/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo1;

/**
 *
 * @author gabrielmendonca
 */
public class ClasseCaneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;   
    
    void status(){ 
        System.out.println("o modelo: " + this.modelo);
        System.out.println("a cor: " + this.cor);
        System.out.println("a ponta: " + this.ponta);
        System.out.println("a carga: " + this.carga);
        System.out.println("a caneta esta tampada? " + this.tampada);
    }
   void rabiscar() {
       if ( this.tampada == true){
           System.out.println("ERRO: nao consigo rabiscar ");
           
       }else { 
           System.out.println("OK, entao posso rabiscar");
       }
       
    
} 
   void tampada(){
       this.tampada = false;

}
 void destampada(){ 
     this.tampada = true;

}
}
