package com.bean.override;

public class EqualsOverride {

    @Override
    public boolean equals(Object obj) {
        EqualsOverride e = (EqualsOverride) obj;
        EqualsOverride e1 = (EqualsOverride) obj;

        return e.equals(e1);
    }

    public static void main(String[] args) {
        EqualsOverride ob = new EqualsOverride();
        EqualsOverride ob1 = new EqualsOverride();

        if (ob.equals(ob1))
            System.out.println("Equals method overridden");
        else
            System.out.println("Equals method not overridden");
    }
}
