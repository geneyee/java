package chap_03;

public class Study302 {
    public static void main(String[] args) {
        // 사과의 수
        int numOfApples = 123;
        // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
        int sizeOfBucket = 10;
        // 모든 사과를 담는데 필요한 바구니의 수
        int numOfBucket
                = numOfApples % sizeOfBucket > 0 ? (numOfApples/sizeOfBucket)+1 : numOfApples/sizeOfBucket;

        System.out.println("필요한 바구니의 수 : " + numOfBucket);
    }
}
