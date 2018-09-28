/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author asus
 */
public class Aeroplan extends Vechile {
    public void walk(){
        System.out.println("Aeroplan is Flying");
    }
    public static void main(String[] args){
        Aeroplan garuda = new Aeroplan();
        garuda.fuction();
        garuda.abstrac();
        garuda.walk();
    }
}
