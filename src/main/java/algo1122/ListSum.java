package algo1122;

import java.util.ArrayList;
import java.util.List;

// 재귀
// 리스트에 있는 모든 값 더하기
// array를 사용하지 않고 list를 사용한이유 -> remove() 사용가능 ex)stack
// 탈출조건은 list가 빌떄까지
public class ListSum {
    public static int sum(List<Integer> nums){
        if (nums.isEmpty()) return 0; // 탈출조건 -> 0을 return 해주는 이유 : 더하는 로직이기 때문에 곱하는 로직이라면 0으로 return하면 안됨
        return nums.remove(nums.size() - 1) + sum(nums);
    }
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(3);
        nums.add(2);
        nums.add(9);
        // {7, 3, 2, 9}
        System.out.println(nums);
//        int n = sum(nums);
//        System.out.println(n);

    }
}
