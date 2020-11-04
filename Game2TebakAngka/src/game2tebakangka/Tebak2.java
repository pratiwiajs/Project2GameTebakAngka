/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game2tebakangka;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pratiwiajs
 */
public class Tebak2 {
    
    //membuatAtribut//
    int komputer; int jawab; int scoreAwal=100; int bonus; int jumlahTebakan; int jumlahScore;
    
    
    //membuatMethod//
    void nebakRandom() {
        Random randomAngka = new Random();
        this.komputer = randomAngka.nextInt(101);
    }
    
    void totalScore(){
        this.jumlahScore = this.scoreAwal + this.bonus;
        System.out.println("Total Score : "+ this.jumlahScore);
    }
    
    void bonus(){
        if (this.jumlahTebakan <= 5){
            this.bonus += 50;
        }
        System.out.println("Bonus : " + this.bonus);
    }
    
    void jawabTebakan(){
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Masukkan Tebakan Anda : ");
            this.jawab = input.nextInt();
            jumlahTebakan += 1;
            if (jawab == komputer) {
                System.out.println("Yaayyyyy... Selamat Tebakan Anda BENAR !!! Bilangan yang Saya Maksud Adalah "+ this.komputer);
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Score : " + this.scoreAwal);
            }else {
                if (this.scoreAwal > 0) {
                    this.scoreAwal -= 2;
                    if (jawab < komputer) {
                        System.out.println("Hehehe... Bilangan Tebakan Anda Terlalu Kecil :(");
                    }else if (jawab > komputer){
                        System.out.println("Hehehe... Tebakan Anda Terlalu Besar :(");
                    }
                }else {
                    System.out.println("Sayang Sekali Anda GAGAL Memecahkan Permainan Ini.\nBilangan yang Saya Maksud Adalah " + this.komputer + "\nAnda telah menebak sebanyak " + this.jumlahTebakan + " kali. Dan Permainan BERAKHIR");
                    System.out.println("*******************************************************************************************************************");
                    break;
                }
            }
        }while (jawab != komputer);
    }
    
}
