package LeetcodeQ.Easy;

public class validperfectsquareLeetcode367 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }

    static boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        int start = 2;
        int end = num / 2;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == num/(double)mid) {
                return true;
            } else if (mid > num/(double)mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}
