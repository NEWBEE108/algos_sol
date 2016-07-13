/*
 * We are playing the Guess Game. The game is as follows:

 * I pick a number from 1 to n. You have to guess which 
 * number I picked.
 * 
 * Every time you guess wrong, I'll tell you whether the 
 * number is higher or lower.
 * 
 * You call a pre-defined API guess(int num) which returns 
 * 3 possible results (-1, 1, or 0):
 * 
 * -1 : My number is lower
 *  1 : My number is higher
 *  0 : Congrats! You got it!
 * Example:
 * n = 10, I pick 6.
 * 
 * Return 6.
 */
public class GuessNumberHigherOrLower {

    public int guessNumber(int n) {
        return guessNumber(1, n);
    }

    // iteration
    public int guessNumber(int low, int high) {
        if (low <= 0 || low > high) {
            throw new IllegalArgumentException("illegal input");
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            int guess = guess(mid);
            if (guess == 0) {
                return mid;
            } else if (guess == -1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    // recursion
    public int guessNumber(int low, int high) {
        if (low <= 0 || low > high) {
            throw new IllegalArgumentException("illegal input");
        }
        int mid = low + (high - low) / 2;
        if (guess(mid) == 0) {
            return mid;
        } else if (guess(mid) == -1) {
            return guessNumber(low, mid - 1);
        } else {
            return guessNumber(mid + 1, high);
        }
    }

}
