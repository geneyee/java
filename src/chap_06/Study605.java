package chap_06;

public class Study605 {
    public static void main(String[] args) {
        Student2 s = new Student2("홍길동", 1, 1, 100, 60, 76);
        System.out.println(s.info());
    }
}
class Student2{

    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student2(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal(){
        return kor + eng + math;
    }

    float getAverage(){
        float result = (float)getTotal()/3;
        return Math.round(result * 10.0) / 10.0f;
    }

    public String info() {
        return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + getTotal() + ", " + getAverage();
    }
}