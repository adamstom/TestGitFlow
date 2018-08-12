package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        wyswietlTekst("TEST z innej metody");
        int [] testowaTablica = new int[] {3,4,5};
        int wynik = sumowanieTab(testowaTablica);
        wyswietlTekst(Integer.toString(wynik));
    }



    public static void wyswietlTekst(String napis) {
        System.out.println("Tekst: "+napis);
    }
    public static int sumowanieTab(int [] tab){
        int suma=0;
        for(int i=0; i<tab.length; i++){
            suma=suma+tab[i];
        }
        return suma;
    }

}
