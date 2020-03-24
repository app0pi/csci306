//Kenny Lieu 9/1/2019 Coding Bat Individual
public class CodingBatIndividual {
	//Author: Kenny Lieu
	//Exercise: Array-2 > tenRun
	public int[] tenRun(int[] nums) {
		int[] arr = nums;
		boolean multipleTen = false;
		for(int i=0; i<arr.length; i++){
			if(arr[i]%10==0)
				multipleTen = true;
			else if(multipleTen)
				arr[i] = arr[i-1];
		}
		return arr;
	}
	/*
	 * Expected	Run		
	tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]	[2, 10, 10, 10, 20, 20]	OK	
	tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]	[10, 10, 20, 20]	OK	
	tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]	[10, 10, 10, 20]	OK	
	tenRun([1, 2, 50, 1]) → [1, 2, 50, 50]	[1, 2, 50, 50]	OK	
	tenRun([1, 20, 50, 1]) → [1, 20, 50, 50]	[1, 20, 50, 50]	OK	
	tenRun([10, 10]) → [10, 10]	[10, 10]	OK	
	tenRun([10, 2]) → [10, 10]	[10, 10]	OK	
	tenRun([0, 2]) → [0, 0]	[0, 0]	OK	
	tenRun([1, 2]) → [1, 2]	[1, 2]	OK	
	tenRun([1]) → [1]	[1]	OK	
	tenRun([]) → []	[]	OK	
	other tests	OK	
	 */
	
	
	//Author: Kenny Lieu
	//Exercise: AP-1 > scoresIncreasing
	public boolean scoresIncreasing(int[] scores) {
		int i=0;
		while(i+1 < scores.length){
			if(scores[i]>scores[i+1])
				return false;
			i++;
		}
		return true;
	}
	/*
	 * Expected	Run		
	scoresIncreasing([1, 3, 4]) → true	true	OK	
	scoresIncreasing([1, 3, 2]) → false	false	OK	
	scoresIncreasing([1, 1, 4]) → true	true	OK	
	scoresIncreasing([1, 1, 2, 4, 4, 7]) → true	true	OK	
	scoresIncreasing([1, 1, 2, 4, 3, 7]) → false	false	OK	
	scoresIncreasing([-5, 4, 11]) → true	true	OK	
	 */
	
	
	//Author: Kenny Lieu
	//Exercise: String-2 > repeatEnd
	public String repeatEnd(String str, int n) {
		String ans = "";
		for(int i=0; i<n; i++){
			ans += str.substring(str.length()-n);
		}
		return ans;
	}
	/*
	 * Expected	Run		
	repeatEnd("Hello", 3) → "llollollo"	"llollollo"	OK	
	repeatEnd("Hello", 2) → "lolo"	"lolo"	OK	
	repeatEnd("Hello", 1) → "o"	"o"	OK	
	repeatEnd("Hello", 0) → ""	""	OK	
	repeatEnd("abc", 3) → "abcabcabc"	"abcabcabc"	OK	
	repeatEnd("1234", 2) → "3434"	"3434"	OK	
	repeatEnd("1234", 3) → "234234234"	"234234234"	OK	
	repeatEnd("", 0) → ""	""	OK	
	other tests	OK
	 */
	
	
	//Author: Kenny Lieu
	//Exercise: Array-3 > canBalance
	public boolean canBalance(int[] nums) {
		for(int i=0; i<nums.length; i++){
			if(balanced(nums,i))
				return true;
		}
		return false;
	}
	public boolean balanced(int[] nums, int point){
		int a = 0;
		int b = 0;
		for(int i=0; i<point; i++)
			a += nums[i];
		for(int i=point; i<nums.length; i++)
			b += nums[i];
		return (a==b ? true : false);
	}
	/*
	 * Expected	Run		
	canBalance([1, 1, 1, 2, 1]) → true	true	OK	
	canBalance([2, 1, 1, 2, 1]) → false	false	OK	
	canBalance([10, 10]) → true	true	OK	
	canBalance([10, 0, 1, -1, 10]) → true	true	OK	
	canBalance([1, 1, 1, 1, 4]) → true	true	OK	
	canBalance([2, 1, 1, 1, 4]) → false	false	OK	
	canBalance([2, 3, 4, 1, 2]) → false	false	OK	
	canBalance([1, 2, 3, 1, 0, 2, 3]) → true	true	OK	
	canBalance([1, 2, 3, 1, 0, 1, 3]) → false	false	OK	
	canBalance([1]) → false	false	OK	
	canBalance([1, 1, 1, 2, 1]) → true	true	OK	
	other tests	OK
	 */
}
