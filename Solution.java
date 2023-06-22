class Solution {
    public static int ternarySearch(int[] array, int key, int l, int r) {
        int mid1 = l + (r - l) / 3;
        int mid2 = r - (r - l) / 3;
        
        if (array[mid1] == key) {
            return mid1;
        }
        if (array[mid2] == key) {
            return mid2;
        }
        
        if (key < array[mid1]) {
            r = mid1 - 1;
            return ternarySearch(array, key, l, r);
        } else if (key > array[mid2]) {
            l = mid2 + 1;
            return ternarySearch(array, key, l, r);
        }
        //if found in center
        l = mid1 + 1;
        r = mid2 - 1;
        return ternarySearch(array, key, l, r);
    }
    
    public static void main(String args[]) {
    int[] array = {3, 16, 18, 42, 52, 57, 61, 66, 83, 90};
    int key = 57;
    
    int ret = ternarySearch(array, key, 0, array.length);
    System.out.println("Key positioned in " + ret);
    }
}