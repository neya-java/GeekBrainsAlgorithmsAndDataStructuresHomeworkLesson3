package lesson3;

public class FindingMissingNumber {
	public static void main(String[] args) {
		int [] arr1 = {1,2,3,4,5,7,8,9,10,11,12,13,14,15};
		testArr(arr1, 6);

	}

	public static int doTest(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end){
			int base = (start + end) /2;
			if (arr[base] - base == 1) {
			start = base +1;
			} else {
				end = base - 1;
			}
		} return start+1;
	}

	public static void testArr(int [] arr, int findingNumber){
		System.out.println("Массив: ");
		for (int j : arr) {
			System.out.print(j);
		}
		System.out.println("/ Нет в массиве:" + findingNumber + " / Найдено:" + doTest(arr));
	}


}
