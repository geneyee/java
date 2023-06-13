package chap_06;

class Study619 {
    public static void change(String str) {
        str += "456";
    }
    public static void main(String[] args) {
        String str = "ABC123";
        System.out.println(str);
        change(str);
        System.out.println("After change : " + str);
    }

    // Q. 실행결과 예측 -> ABC123
    // change() - str 와 main() - str는 각각 다른 지역변수이다.
    // String은 참조형 변수라는것 주의
    // 책 참고해서 다시보기

}
