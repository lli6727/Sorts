public class Test
{
    public static void main(String[] args)
    {
        int[] arr1 = {328, 812, 1018,329,630,915,1105,204,626};
        Sorts.printArr(arr1);
        System.out.println();

        Sorts.ascendingSort(arr1);
        Sorts.printArr(arr1);
        System.out.println();

        String[] arr2 = {"Andrew","Sandra","Linda","Calvin","Jordan"};
        Sorts.printArr(arr2);
        System.out.println();

        Sorts.ascendingSort(arr2);
        Sorts.printArr(arr2);
        System.out.println();
    }
}
