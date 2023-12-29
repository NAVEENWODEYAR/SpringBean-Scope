package com.bean.override;

public class EqualsOverride {
    private int i;
    private String s;

    public EqualsOverride(int i,String s) {
        this.i = i;
        this.s = s;
    }

    @Override
    public boolean equals(Object obj) {
        EqualsOverride e = (EqualsOverride) obj;
        EqualsOverride e1 = (EqualsOverride) obj;

        if(e.i == e1.i || e.s ==e1.s)
        return true;
        return false;
    }

    public static void main(String[] args) {
        EqualsOverride ob = new EqualsOverride(1,"1");
        EqualsOverride ob1 = new EqualsOverride(1,"1");

        if (ob.equals(ob1))
            System.out.println("Equals method overridden");
        else
            System.out.println("Equals method not overridden");
    }
}
