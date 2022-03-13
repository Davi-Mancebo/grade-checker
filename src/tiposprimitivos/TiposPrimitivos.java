/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner recebe = new Scanner(System.in);
        
        System.out.println("VERIFICADOR DE NOTAS");
        System.out.print("Insira seu nome: ");
        String nome = recebe.nextLine();
        System.out.print("Digite sua nota: ");
        float nota = recebe.nextFloat();

        if (nota > 10 | nota < 1){
            System.out.println("Nota Invalida");
            System.exit(0);
        }
        
        System.out.printf("%s sua nota é: %.2f\n", nome, nota);
        if(nota >= 6){
            System.out.println("Você foi aprovado!");
        } else {
            System.out.println("Você foi Reprovado!");
        }
    }
    
}
