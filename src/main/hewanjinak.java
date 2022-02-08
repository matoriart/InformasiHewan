/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author user
 */
public class hewanjinak extends dataPrivate {

    void End() {
        dataPrivate wq = new dataPrivate();
        System.out.print("Nama : ");
        wq.name();
        System.out.print("Makanan : ");
        wq.food();
        System.out.print("Status : ");
        wq.type();
        System.out.print("Jenis Hewan : ");
        wq.type3();
        System.out.print("Berat : ");
        wq.weight();

    }
}
