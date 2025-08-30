package src;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        //넘어오는 배열의 길이만큼 값을 가질 수 있도록 length사용
        int[] answer = new int[num_list.length];

        int num = 0; //배열의 앞에 값을 넣을 수 있게 변수 선언

        //끝에서부터 1자리씩 answer의 앞에 값 입력
        for (int i = num_list.length-1; i >= 0; i--) {
            answer[num] = num_list[i];
            num++;
        }
        return answer;
    }
}

public class ReverseArray {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] num_list = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(s.solution(num_list)));
    }
}
