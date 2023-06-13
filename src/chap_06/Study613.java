package chap_06;

public class Study613 {
    long add(int a, int b){
        return a + b;
    }

//    위에 add()랑 똑같은 method - 중복. 오버로딩 x
//    long add(int x, int y) {
//        return x + y;
//    }

    long add(long a, long b) { // 매개변수 타입 달라서 오버로딩 o
        return a + b;
    }

    int add(byte a, byte b) { // 매개변수 타입 달라서 오버로딩 o
        return a + b;
    }

    int add(long a, int b) { // 매개변수 타입 달라서 오버로딩 o
        return (int) (a + b);
    }

}
