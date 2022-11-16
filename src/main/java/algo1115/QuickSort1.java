package algo1115;

import java.util.ArrayList;
import java.util.List;

// 퀵정렬
public class QuickSort1 {

    // left, mid, right를 합쳐주는 function
    public List<Integer> merge(List<Integer> left, List<Integer> mid, List<Integer> right){
        List<Integer> answer = new ArrayList<>();
        answer.addAll(left);
        answer.addAll(mid);
        answer.addAll(right);
        return answer;
    }

    public List<Integer> sort(List<Integer> arr){
        //1. 기준값 뽑는 로직
        int pivot = arr.get(arr.size() / 2);
        System.out.println(pivot);

        //2. 기준값 기준으로 왼쪽, 오른쪽으로 나누어 담는 로직(hint List 사용)
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();

        // 재귀 -> 탈출조건 필수 (pivot 보다 작거나 같은게 없는 빈칸이 나올 수 있음)
        if (arr.size() <= 1) return arr;

        for (int i = 0; i < arr.size(); i++) {
            if (pivot > arr.get(i)) left.add(arr.get(i));
            else if (pivot < arr.get(i)) right.add(arr.get(i));
            else mid.add(arr.get(i));
        }
        System.out.println(left);
        System.out.println(right);

        // list를 합치는 연산이 return 전에 들어가줘야한다
        return merge(sort(left), mid, sort(right));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{20, 18, 5, 19, 5, 25, 40, 50};
        List<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            al.add(arr[i]);
        }
        QuickSort1 q1 = new QuickSort1();
        q1.sort(al);

    }
}
