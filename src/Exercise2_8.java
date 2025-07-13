public class Exercise2_8 { // 변수 x, y, z간의 값을 서로 바꾸는 문제
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;

        int tmp = 0; //값을 바꾸기 위해 임시로 저장해둘 변수 선언

        tmp = x;
        x = y;
        y = z;
        z = tmp;

        System.out.println("x=" + x); // 2
        System.out.println("y=" + y); // 3
        System.out.println("z=" + z); // 1
    }
}
