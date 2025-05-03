package com.java.creational.singleton.Atendente;

public class Atendente {
    private static Atendente instence = new Atendente(); // Instância única pré-criada
    
    private Atendente() {} // Construtor privado para evitar instanciação externa
    
    public static Atendente getInstance() { 
        return instence; // Retorna sempre a mesma instância
    }
    
    public static void main(String[] args) {
        Atendente garcon1 = Atendente.getInstance();
        System.out.println(garcon1); // Saída: mesma referência de memória
        
        Atendente garcon2 = Atendente.getInstance();
        System.out.println(garcon2); // Saída: mesma referência que garcon1
        
        Atendente garcon3 = Atendente.getInstance();
        System.out.println(garcon3); // Saída: mesma referência que garcon1 e garcon2
    }
}