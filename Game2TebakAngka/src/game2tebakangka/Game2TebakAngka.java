/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game2tebakangka;

/**
 *
 * @author pratiwiajs
 */
public class Game2TebakAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("\t \t \t \t \t Selamat Datang di Game Tebak Angka");
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// \n \n");
        System.out.println("_________________________________________________________________________________________________________________________");
        System.out.println("\nHaiiiiiiiii... Saya Pratiwi Cantiqs, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100.\nSilahkan tebak yaaa!!!");
        System.out.println("\nScore Awal = 100.");
        System.out.println("Score Akhir Minimal = 0. Jika tidak permainan akan berakhir !!!!!");
        System.out.println("\nApabila Anda menebak dengan salah, maka score akan berkurang 2.\nJika Anda berhasil menebak dengan benar, tidak lebih dari 5 tebakan maka Score Anda akan bertambah 50.");
        System.out.println("_________________________________________________________________________________________________________________________\n");
        
        Tebak2 T2 = new Tebak2();
        T2.nebakRandom();
        T2.jawabTebakan();
        T2.bonus();
        T2.totalScore();
    }

}
