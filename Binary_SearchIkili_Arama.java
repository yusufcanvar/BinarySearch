class App {
    public static void main(String[] args) throws Exception {
        int[] numBin = { 10, 20, 30, 40, 50, 60 };

        System.out.println(binarySearch(numBin, 0, 60, numBin.length - 1));
    }

    public static boolean binarySearch(int[] numBin, int lowerPos, int searchItem, int higherPos) {
        int median;

        if (lowerPos <= higherPos) {
            median = lowerPos + (higherPos - lowerPos) / 2;

            if (numBin[median] == searchItem){
                return true;
            }

            if (numBin[median] < searchItem) {
                return binarySearch(numBin, lowerPos = median + 1, searchItem, higherPos);
            }

            else {
               return binarySearch(numBin,  lowerPos, searchItem, higherPos = median - 1);
            }
        }

        return false;
    }
}