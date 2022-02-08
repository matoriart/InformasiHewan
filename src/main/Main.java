/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pilih;
        hewanjinak JK = new hewanjinak();
        hewanbuas BS = new hewanbuas();
        Scanner input = new Scanner(System.in);
        System.out.println("Informasi Hewan");
        System.out.println("1. Ayam");
        System.out.println("2. Ular");
        System.out.print("Pilih Salah Satu : ");
        pilih = input.nextInt();
        switch (pilih) {
            case 1:
                JK.End();
                break;
            case 2:
                BS.EndZ();
                break;
            case 3:
                System.out.println("Error...");

                break;
            default:

        }
    }
}
