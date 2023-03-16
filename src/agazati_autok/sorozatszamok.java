
package agazati_autok;

import java.util.Random;
public class sorozatszamok {
   
    public static void main(String[] args) {
  
    int[] szamlista = listakeszito();
    szamokkiiir(szamlista);
    int egyjegyuekszama = egyjegyuekszama(szamlista);
    System.out.println("\n Egyjegyűek száma: " + egyjegyuekszama);
    }

    private static int[] listakeszito() {
        int[] szamlista= new int[5];
        int index=0;  
        Random rnd= new Random();
        while (index<szamlista.length) {
            int velszam=rnd.nextInt(80-1)+1;  
            szamlista[index]=velszam;
            index++;
        }
        return szamlista;
       
    }

    private static void szamokkiiir(int[] szamlista) {
        for (int i = 0; i < szamlista.length; i++) {
            System.out.print(szamlista[i]);
            if (i!= szamlista.length-1){
                System.out.print("-");
                
            }
            
        }
            
        }

    private static int egyjegyuekszama(int[] szamlista) {
        int szamlalo=0;
        for (int i = 0; i < szamlista.length; i++) {
            if(szamlista[i] >-10 && szamlista[i] <10 ){
            szamlalo+=1;
        }
            
        }
        return szamlalo;
    }
    
    
}
