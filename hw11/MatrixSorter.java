//Huanlun Li [CSE02-110] Dec.5 MatrixSorter.java
import java.util.Random;
public class MatrixSorter{
	public static void main(String args[]){
		int[][][] mat3d;
		mat3d = buildMat3d();
		show(mat3d);
		System.out.println("The smallest entry in the 3D matrix is "+findMin(mat3d));
		System.out.println("After sorting the 3rd matrix we get");
		sort(mat3d[2]);
		show(mat3d);
	}
	
	public static int[][][] buildMat3d(){//return random 3d array
		int[][][] m3 = new int[3][][];
		for(int s=0; s<3;s++){
			m3[s] = new int[3+2*s][]; //num of rows are 3,5,7
		}
		for(int s=0;s<3;s++){
			for(int j=0;j<m3[s].length;j++){
				m3[s][j] = new int[s+j+1]; //the length of jth row is s+j+1
			}
		}
		Random MS = new Random();
		for(int s=0;s<m3.length;s++){
			for(int j=0;j<m3[s].length;j++){
				for(int i=0;i<m3[s][j].length;i++){
					m3[s][j][i] = MS.nextInt(98)+1;//give every element a random value in range
				}
			}
		}
		return m3;
	}
	
	public static void show(int[][][] mp){ //print out the array
		for(int s=0;s<mp.length;s++){
			System.out.println("---------------------------Slab "+(s+1));
			for(int j=0;j<mp[s].length;j++){
				for(int i=0;i<mp[s][j].length;i++){
					System.out.print(mp[s][j][i]+" ");
				}
				System.out.println("");
			}
		}
		System.out.println("---------------------------");
	}
	
	public static int findMin(int[][][] mm){ //return the min value
		int min = mm[0][0][0]; //min=the first element
		for(int s=0;s<mm.length;s++){
			for(int j=0;j<mm[s].length;j++){
				for(int i=0;i<mm[s][j].length;i++){
					if(mm[s][j][i]<min){
						min=mm[s][j][i];
					}
					else {continue;}
				}
			}
		}
		return min;
	}
	
	public static void selSort(int[] intArray){ //selection sort method
		int temp;
		for(int i=0;i<intArray.length;i++){
			for(int j=i+1;j<intArray.length;j++){
				if(intArray[j]<intArray[i]){
					temp=intArray[i];
					intArray[i]=intArray[j];
					intArray[j]=temp;
				}
			}
		}
	}
	public static void sort(int entries[][]){
		for(int i=0;i<entries.length;i++){
			selSort(entries[i]);
		}
		int i=0;
		for (int j=1;j<entries.length;j++){  //j is the num of element which has been sorted
           int key = entries[j][0]; //key element is inserted
			for(i=j-1;i>=0&&entries[i][0]>key;i--){   // Smaller values are moving up
               int[] temp = entries[i+1];
               entries[i+1] = entries[i];
               entries[i] = temp;
			}
			entries[i+1][0]= key; //swap the position of the key	
		}
	}
}//end
