public class BubbleSort{ //digunakan untuk mengurutkan bilangan 1 dengan sampingnya secara berurutan
	public static void main(String args[]){
		int[] arrNumbs = new int[args.length];

		for(int i=0; i<args.length; i++){
			arrNumbs[i] = Integer.parseInt(args[i]);
		}

		for(int i=0; i<arrNumbs.length; i++){
			for(int j=i+1; j<arrNumbs.length; j++){
				if(arrNumbs[j] < arrNumbs[i]){
					int temp = arrNumbs[j];
					arrNumbs[j] = arrNumbs[i];
					arrNumbs[i] = temp;
				}
			}
		}

		for(int i=0; i<arrNumbs.length; i++){
			System.out.println(arrNumbs[i] + " ");
		}

	}
}