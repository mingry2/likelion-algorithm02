package algo1114;


// 에라토스테네스의 체
public class sieveOfEratosthenes {
    public static void main(String[] args) {
        // n-1개의 arr 생성
        int N = 50;
        int[] arr = new int[N - 1]; // idx는 0~48(숫자 0과 1은 제외), 숫자는 2~50
//        System.out.println(arr.length);

        // 2부터 50까지 arr에 채우기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 2;
        }

//        System.out.printf("%d %d\n", 0, arr[0]);
//        System.out.printf("%d %d\n", arr.length - 1, arr[arr.length - 1]);

        for (int i = 0; i * i <= N ; i++) {
            System.out.println("i:" + i);
            if (arr[i] != 0){
                for (int j = i * 2 + 2; j < arr.length; j += arr[i]) {
                    System.out.println(j);
                    arr[j] = 0;
                }
            }

        }

//        int i = 0;
//        for (int j = 0; j < arr.length; j++) { // 5,47은 소수인데 결과가 0이 나옴, 오류)
//            arr[j] = 0;
//        }
//        // 2를 제외한 2의 배수를 0으로 만들기
//        i = 0;
//        for (int j =arr[i]; j < arr.length; j+=2) { // 위의 문제는 수정됨
//            arr[j] = 0;
//        }
        // 3을 제외한 3의 배수를 0으로 만들기
//        int i = 1;
//        for (int j = (i * 2)+2; j < arr.length; j+=arr[i]) {
//            arr[j] = 0;
//        }
//        // 4을 제외한 3의 배수를 0으로 만들기
//        i = 2;
//        for (int j = 4; j < arr.length; j+=arr[i]) {
//            arr[j] = 0;
//        }
//
//        System.out.printf("%d %d\n", 2, arr[2]);
//        System.out.printf("%d %d\n", 4, arr[4]);
//        System.out.printf("%d %d\n", 5, arr[5]);
//        System.out.printf("%d %d\n", 7, arr[7]);
//        System.out.printf("%d %d\n", 47, arr[47]);
//        System.out.printf("%d %d\n", 48, arr[48]);

    }

}
