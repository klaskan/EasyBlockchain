package com.company;

import java.util.ArrayList;



public class Main {

    public static ArrayList<Block> blockchain = new ArrayList<>();

    public static void main(String[] args) {

        blockchain.add(new Block("The Times 03/Jan/2009 Chancellor on brink of second bailout for banks", "0"));


        blockchain.add(new Block("Second block", blockchain.get(blockchain.size() -1).getHash()));


        blockchain.add(new Block("Block numbero 3", blockchain.get(blockchain.size() -1).getHash()));

        printBlockchain();




    }

    public static void printBlockchain(){
        for(int i = 0; i < blockchain.size(); i++){
            System.out.println("Hash for blokk " + (i+1) + " : " + blockchain.get(i).getHash());
        }
    }


}
