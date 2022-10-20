/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaiv;

/**
 *
 * @author pedro
 */
public class ListaIV {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(); 
        Pessoa p2 = new Pessoa("Pedro", "Henrique", "000.000.000-00", 33, "XXXXX");
        System.out.println(p2.getEndereco());
        System.out.println(p2.getNome());
        System.out.println(p2.getSobrenome());
        System.out.println(p2.getIdade());
        System.out.println(p2.getCpf());
        p1.setNome("Joao");
        p2.setNome("Maria");
        System.out.println(p1.getNome());
        System.out.println(p2.getNome());
       
       
        
    }
    
}
