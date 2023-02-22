
package com.mycompany.enkapsulasi_yafao;

/**
 *
 * @author YAFAO
 */
public class sks {
    public static void main (String[] args)
    {
        Enkapsulasi_yafao sksku = new Enkapsulasi_yafao();
        sksku.sksSekarang=23;
        sksku.setSksaktif (sksku.sksSekarang);
        sksku.totalsks();
        sksku.nama = "YAFAO MABE LAMBOE";
        sksku.angkatan = 2021;
        sksku.nim = "21090095";
        System.out.println ("DATA SKS MAHASISWA");
        System.out.println ("Nama : " +sksku.nama);
        System.out.println ("NIM : " +sksku.nim);
        System.out.println ("Tahun Masuk : " +sksku.angkatan);
        System.out.println ("SKS Semester ini : " +sksku.sksSekarang);
        System.out.println ("Total SKS yang Diambil : " +sksku.getTotalsks());
    }

}
