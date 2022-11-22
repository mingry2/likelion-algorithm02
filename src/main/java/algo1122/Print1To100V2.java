package algo1122;


// 재귀
// 1~100까지 숫자 출력하기
public class Print1To100V2 {
    public static void print1To100(int n){
        if (n > 100) return; // 무한루프를 돌지 않게 탈출조건 달기
        System.out.println(n);
        print1To100(n + 1);
        // 자기 자신을 호출 -> 재귀 (StackOverflowError가 남 : 무한루프)
        // n + 1을 해서 조건을 만들어줌
    }
    public static void main(String[] args) {
        print1To100(1);
    }
}
