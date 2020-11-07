/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author FAHRIH FATAHILAH
 */
class Petugas {
    public String namaPetugas;
    DaftarNilai dafNilai = new DaftarNilai();
    Scanner scn = new Scanner(System.in);

    public void inputPetugas() {
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scn.next();
    } 
}
