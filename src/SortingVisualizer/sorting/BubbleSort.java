package SortingVisualizer.sorting;


public class BubbleSort {
	
	private static int index = 0;
	private static boolean swapsMade = false;
	
	public static boolean sort(Pixel[] pixels) {
		//out of bound check
		if(index+1 >= pixels.length) {
			if(swapsMade) {
				index = 0;
				swapsMade = false;
			}
			else {
				return true;
			}
		}
		//current
		Pixel p1 = pixels[index];
		//adjacent
		Pixel p2 = pixels[index + 1];
		if(p1.id > p2.id) {
			pixels[index] = p2;
			pixels[index + 1] = p1;
			swapsMade = true;
		}
		
		index++;
		
		return false;
	}

}
