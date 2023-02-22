
package com.mycompany.enkapsulasi_yafao;

public class Enkapsulasi_yafao {
public String nama;
    public int angkatan;
    public String nim;
    private int sks, skskemarin;
    public int sksSekarang;
   
    public void setSksaktif(int sksSekarang)
    {
        sks=sksSekarang;
    }
   
    public void totalsks()
    {
        skskemarin=45;
        sks+=skskemarin;
    }
   
    public int getTotalsks()
    {
        return sks;
    }

}
