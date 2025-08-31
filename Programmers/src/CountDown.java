package src;

//정수 start_num와 end_num가 주어질 때, start_num에서 end_num까지 1씩 감소하는 수들을
//차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

import java.util.Arrays;

class CountDownSolution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num - end_num + 1];

        //start_num이 end_num과 같아질때까지 1씩 줄이며 반복
        for (int i = start_num; i >= end_num; i--) {
            answer[start_num - i] = i; //0번부터 넣기위해 start_num에서 i를 빼줌
        }
        return answer;
    }
}

public class CountDown {
    public static void main(String[] args) {
        //Solution 클래스를 사용하기 위해 메모리상에 올린다
        CountDownSolution c = new CountDownSolution();

        //Solution 클래스의 메서드에 전달할 인자값을 입력하여 사용.
        System.out.println(Arrays.toString(c.solution(10,3)));

    }
}
