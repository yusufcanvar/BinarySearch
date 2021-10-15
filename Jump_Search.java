import java.lang.Math;

public class Main{
    public static void main(String[] args){
        int[] numberArray = {3, 4, 5, 6, 7, 8, 9};

        System.out.format("Is contains? %b", jumpSearch(numberArray, 8));
    }

    public static boolean jumpSearch(int[] numberArray, int searchItem){
        int lowerPos = 0;
        int upperPos = (int)Math.floor(Math.sqrt(numberArray.length));

        while (searchItem > numberArray[upperPos - 1]){
            lowerPos = upperPos;
            upperPos += (int)Math.floor(Math.sqrt(numberArray.length));

            if (upperPos >= numberArray.length) return false;
        }

        while (searchItem > numberArray[lowerPos]){
            lowerPos += 1;

            if (lowerPos == upperPos) return false;
        }

        if (numberArray[lowerPos] == searchItem) return true;

        System.out.printf("lowerPos %d, upperPos %d", lowerPos, upperPos);

        return false;
    }
}