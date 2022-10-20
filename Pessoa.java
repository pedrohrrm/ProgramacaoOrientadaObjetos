/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pedro
 */
import java.util.Scanner;
public class Pessoa {
    
    
    
    public static void main(String[] args) {
       displayMessage();
        
    }
//    public static void displayMessage(){
//        System.out.println("eu sou uma pessoa");
//    }
    public static void displayMessage(){
        var nome = "Pedro";
        System.out.println("Olá, eu sou uma pessoa e meu nome é:" + nome); 
        
        
    }
//
//    public static void PessoaTest(){
//        displayMessage();
//    }
      public static void Scanner(){
          Scanner texto = new Scanner(System.in);
          String str;
          System.out.println("Digite o seu nome:");
          str = texto.nextLine();
          System.out.println("O nome digitado foi:" + str);
          texto.close();
}
 }

