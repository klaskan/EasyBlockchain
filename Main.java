package com.company;

public class Main {

    public static void main(String[] args) {

        Block genesisBlock = new Block("The Times 03/Jan/2009 Chancellor on brink of second bailout for banks", "0");
        System.out.println("Hash for block 1 : " + genesisBlock.getHash());

        Block blockTwo = new Block("Second block", genesisBlock.getHash());
        System.out.println("Hash for block 2 : " + blockTwo.getHash());

        Block blockTree = new Block("Block numbero 3", blockTwo.getHash() );
        System.out.println("Hash for block 3 : " + blockTree.getHash());





    }
}
