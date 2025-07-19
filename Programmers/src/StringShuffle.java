class Shuffler {
    public String solution(String str1, String str2) {
        String answer = "";
        for (int i = 0; i < str1.length() + str2.length(); i++) {
            if (i >= str1.length()) {
                continue;
            }else {
                answer += str1.charAt(i);
            }if (i >= str2.length()) {
                continue;
            }else {
                answer += str2.charAt(i);
            }
        }
        return answer;
    }
}

public class StringShuffle {
    public static void main(String[] args) {
        Shuffler shu = new Shuffler();
        System.out.println(shu.solution("aaaaaaaa", "bbbbb"));
    }
}
