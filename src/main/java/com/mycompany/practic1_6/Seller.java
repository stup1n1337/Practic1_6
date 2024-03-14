package com.mycompany.practic1_6;

public class Seller {
    public void modify(Telephone telephone){
        String newhehe = telephone.gethehe().replace("o", "a");
        if (!((newhehe.startsWith("n")) || (newhehe.startsWith("N")))){
            newhehe = newhehe.toLowerCase();
        }
        telephone.sethehe(newhehe);
    }
}

