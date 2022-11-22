package algo1122;


// 재귀
// 1~100까지 숫자 출력하기
public class Print1To100V2 {
    public static void print1To100(int n){
        System.out.println(n);
        print1To100(n); // 자기 자신을 호출 -> 재귀 (StackOverflowError가 남 : 무한루프)
    }
    public static void main(String[] args) {
        print1To100(1);
    }
}
