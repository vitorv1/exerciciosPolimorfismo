package Ex1_Polimorfismo;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void menu (){
        System.out.println("Caso deseje cadastrar cd, digite 1");
        System.out.println("Caso deseje cadastrar dvd, digite 2");
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       menu();
       int menu = sc.nextInt();
       if( menu == 1){
           CD cd = new CD();
           cd.inserirDados();
           CDRepository.salvar(cd);
       }else{
           DVD dvd = new DVD();
           dvd.inserirDados();
           DVDRepository.salvar(dvd);
       }
    }
}
