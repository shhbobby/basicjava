package map;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class StartPoint {
    public static void main(String[] args) {
        //aboutLength();
//        nomal();
        interesting();
        HashMap
    }

    static void interesting() {
        mapHash("aa");
        mapHash("bb");
        mapHash("cc");
        mapHash("dd");
        mapHash("ee");
        mapHash("ff");
        mapHash("gg");
        mapHash("hh");
        mapHash("ii");
        mapHash("jj");
        mapHash("kk");
        mapHash("ll");
        mapHash("mm");
        mapHash("nn");
    }

    static void nomal() {
        mapHash("a121");
        mapHash("b1112");
        mapHash("c34");
        mapHash("d56");
        mapHash("e7");
        mapHash("f888");
        mapHash("g9");
        mapHash("h00");
        mapHash("i876");
        mapHash("j564");
        mapHash("k556");
        mapHash("l46");
        mapHash("m568");
        mapHash("n784");
    }

    //相当于取模运算
    static void mapHash(String key) {
        int h = key.hashCode();
        int hash = h ^ (h >>> 16);
        int index = 15 & hash;
        System.out.println(h + "   " + hash + "   " + index + "  " + hash % 16);
    }

    //2的幂次方-1正好是bit位都为1
    static void aboutLength() {
        int length = (int) Math.pow(2, 10);
        int mask = length - 1;
        System.out.println((255 & mask) == 255);
    }
}
