package com.company;


import java.util.Date;

/**
 * Blokk i blokkkjeden.
 * Hver blokk vil ha sig egen digitale signatur, og signaturen til den forrige blokken.
 * Hashen til en blokk blir kalkulert fra en annen blokk.
 *
 *
 * @Klas Kanestrøm
 */

public class Block {

    private String data;            //data blokken inneholder
    private long time;              //tid blokk ble opprettet
    private String hash;            //Hash til gjeldene blokk
    private String previousHash;    //Hash til forrige blokk


    public Block(String data, String previousHash){
        this.data = data;
        this.time = new Date().getTime();
        this.hash = kalkulerHash();
        this.previousHash = previousHash;
    }

    /**
     *
     * @return String i hashformen av den forrige hashen, tiden(da denne blokken ble opprettet) og dataen i denne blokken
     */

    private String kalkulerHash(){
        String kalkulerhash = Kryptografi.sha256(previousHash + Long.toString(time) + data);
        return kalkulerhash;


    }





}
