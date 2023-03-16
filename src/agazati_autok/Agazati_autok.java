/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agazati_autok;

import java.util.Scanner;

public class Agazati_autok {

    public static void main(String[] args) {
        autobeker();
        evvizsgalo(evbeker());
    }

    private static String autobeker() {
        Scanner sc = new Scanner(System.in,"latin2");
        System.out.print(" Autó neve: ");
        String auto=sc.nextLine();
        return auto;
        

    }
    private static int evbeker() {
        Scanner sc = new Scanner(System.in,"latin2");
        System.out.print("Gyártási dátuma: ");
        int gyartev=sc.nextInt();
        sc.nextLine();
        return gyartev;
    }

    private static void evvizsgalo(int ev) {
        if (ev>=2023){
            System.out.println("Friss gyártás");
        }
        else if (ev<2023){
            System.out.println("Régi autó");
        }
    }

  
    
          
}
