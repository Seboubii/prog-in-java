package agh.ii.prinjava.lab01.lst01_10;

import java.util.Objects;

public class HashCodeOK {
    private final String s1;
    private final String s2;

    public HashCodeOK(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    /**
     * Generated by IntelliJ
     */
    @Override
    public String toString() {
        return "HashCodeOK{" +
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                '}';
    }

    /**
     * Generated by IntelliJ (Objects.equals() utility method + defaults)
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashCodeOK that = (HashCodeOK) o;
        return Objects.equals(s1, that.s1) && Objects.equals(s2, that.s2);
    }

    /**
     * Generated by IntelliJ (Objects.hash() utility method + defaults)
     */
    @Override
    public int hashCode() {
        return Objects.hash(s1, s2);
    }

}