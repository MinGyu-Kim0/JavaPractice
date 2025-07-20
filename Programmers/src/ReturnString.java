
class Returner {
    String Return(String[] arr) {
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }
}

public class ReturnString {
    public static void main(String[] args) {
        Returner sol = new Returner();
        System.out.println(sol.Return(new String[]{"abs","bcd","def"}));
    }
}
