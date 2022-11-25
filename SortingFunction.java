package day;

/*
* created by: Bridge Labz

*
* Perpose: Providing functionality related to Array
	1: Read string and int array.
	2: Display string and int array
	3: sorting algo (bubble, insertaion sort, binary serach)
	4: Statement to array of word	 
**/

import java.util.Scanner;


  
public class SortingFunction{

	
	
	public SortingFunction(){
		Scanner sc = new Scanner(System.in);

	}
	//Take 1D Array Input
	public int[] input1DArray(int arraySize){
		int array[]=new int[arraySize];
		for(int i=0;i<arraySize;i++){
			System.out.println("Enter array["+i+"] : ");
			
		}
		return array;
	}

	//Insertation sort for String
	public String[] insertationSort4String(String words[]){
		String temp;
		for(int i=1;i<words.length;i++){
			for(int j=i;j>0;j--){
				if(words[j].compareTo(words[j-1])<0){
					temp=words[j];
					words[j]=words[j-1];
					words[j-1]=temp;
				}
				else
					break;
			}
		}
		return words;
	}

	//Insertation sort
	public int[] insertationSort(int words[]){
		int temp;
		for(int i=1;i<words.length;i++){
			for(int j=i;j>0;j--){
				if((words[j]-words[j-1])<0){
					temp=words[j];
					words[j]=words[j-1];
					words[j-1]=temp;
				}
				else
					break;
			}
		}
		return words;
	}
}

	