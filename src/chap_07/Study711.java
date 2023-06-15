package chap_07;
// Q. 문제 7-10에서 작성한 MyTv2 클래스에 이전 채널(previous channel)로 이동하는 기능의 메서드를 추가
// 이전 채널의 값을 저장할 멤버변수를 정의
public class Study711 {
    public static void main(String[] args) {
        MyTv2 myTv2 = new MyTv2();

        myTv2.setChannel(10);
        System.out.println(myTv2.getChannel()); // 10
        myTv2.setChannel(20);
        System.out.println(myTv2.getChannel()); // 20
        myTv2.gotoPrevChannel(); // 이전 채널로 이동하는 method
        System.out.println(myTv2.getChannel()); // 20 -> 10
        myTv2.gotoPrevChannel(); // 이전 채널로 이동하는 method
        System.out.println(myTv2.getChannel()); // 10 -> 20

    }
}
