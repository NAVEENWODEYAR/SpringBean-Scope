package com.bean.override;

public class EqualsOverride {
    int i;
    int i1;

    public static void main(String[] args) {
        EqualsOverride ob = new EqualsOverride();
        if (ob.i == ob.i1)
            System.out.println("\nTrue");
        else
            System.out.println("\n False");
    }
}
