package chap_06;

public class Study603 {

}
class Student{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int getTotal(){
        return kor + eng + math;
    }

    float getAverage(){
        float result = (float)getTotal()/3;
        return Math.round(result * 10.0) / 10.0f;
    }
}
