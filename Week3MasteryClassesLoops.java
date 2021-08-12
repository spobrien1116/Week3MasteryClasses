public class Week3MasteryClassesLoops {

    // //Create your method below this line 
    // public static void findMinMax(int[] array) {
    //     int lowest = array[0];
    //     int highest = array[0];
    //     for (int i = 0; i < array.length; i++) {
    //         if (array[i] < lowest) {
    //             lowest = array[i];
    //         }
    //         if (array[i] > highest) {
    //             highest = array[i];
    //         }
    //     }
    //     System.out.println("The highest number is " + highest);
    //     System.out.println("The lowest number is " + lowest);
    // }
    
    
    // //Create your method above this line

	// public static void main(String[] args) {
	    
	//     //Do not change this code
	// 	int a,b,c,d,e,f,g,h;
	// 	a = -1;
	// 	b = -2;
	// 	c = -3;
	// 	d = -4;
	// 	e = -5;
	// 	f = -6;
	// 	g = -7;
	// 	h = -8;
	// 	int[] nums = {a,b,c,d,e,f,g,h};
	// 	//Do not change the code above this line
		
		
	// 	// Add your method call below this line 
	// 	findMinMax(nums);
	// }

    // public static void main(String[] args) {
    //     String[] arrWords = {"Java", "JavaScript", "Python", "CSS", "React"};
    //     int[] wordLengths = findLengths(arrWords);
    //     for (int i : wordLengths) {
    //         System.out.println(i);
    //     }
    // }
    
    // private static int[] findLengths(String[] arrWords) {
    //     int[] arr = new int[arrWords.length];
    //     int counter = 0;
    //     for (String str : arrWords) {
    //         arr[counter] = str.length();
    //     }
    //     return arr;
    // }

    // Apparently the answer to this question is that the code will run just fine. If left undefined, it seems that the other numbers
    // in the int array arr will be set to 0. I thought this would cause an exception to having undefined variables, but I was wrong.


    // Create your methods below this line 
	// public static String[] wordsToArray(String a, String b, String c, String d, String e) {
	//     String[] wordArray = {a, b, c, d, e};
	//     return wordArray;
	// }
	
	// public static double arrayAverageLetters(String[] stringInput) {
	//     double letterAverage = 0;
	//     for (String word : stringInput) {
	//         letterAverage += word.length();
	//     }
	//     return letterAverage / stringInput.length;
	// }
	
	// // Create your methods above this line

	// public static void main(String[] args) {
	//     //DO NOT CHANGE THIS CODE
	// 	String a,b,c,d,e;
	// 	a = "Java";
	// 	b = "C++";
	// 	c = "Javascript";
	// 	d = "HTML5";
	// 	e = "jQuery";
	// 	//DO NOT CHANGE THIS CODE
		
		
	// 	// Create your method calls and variables below this line
	// 	String[] myNewArray = (wordsToArray(a, b, c, d, e));
	// 	System.out.println("The average length of the words entered is: " + (arrayAverageLetters(myNewArray)));
		
	// 	// Create your method calls and variables above this line
	// }
    
    
    // //Create your method below this line
    // public static void findShortestLongest(String[] wordArray) {
    //     String shortest = wordArray[0];
    //     String longest = wordArray[0];
    //     for (String word : wordArray) {
    //         if (word.length() < shortest.length()) {
    //             shortest = word;
    //         }
    //         if (word.length() > longest.length()) {
    //             longest = word;
    //         }
    //     }
    //     System.out.println("The longest word is " + longest);
    //     System.out.println("The shortest word is " + shortest);
    // }
    // //Create your method above this line
    
    
	// public static void main(String[] args) {
	    
	//     //Do not change this code
	// 	String a,b,c,d,e,f,g,h;
	// 	a = "C++";
	// 	b = "Java";
	// 	c = "Pearl";
	// 	d = "PHP";
	// 	e = "HTML";
	// 	f = "CSS";
	// 	g = "JavaScript";
	// 	h = "MySQL";
	// 	String[] words = {a,b,c,d,e,f,g,h};
	// 	//Do not change this code
		
	// 	//Write your method calls below this line
	// 	findShortestLongest(words);
	// }


    // // Create your methods below this line 
	// public static int doubleThisInt(int startingValue) {
	//     int timesTwo1 = startingValue * 2;
	//     return timesTwo1;
	// }
	
	// public static int doubleItAgain(int aDoubledValue) {
	//     int timesTwo2 = aDoubledValue * 2;
	//     return timesTwo2;
	// }
	
	// public static int doubledLastTime(int doubledDoubleValue) {
	//     int timesTwo3 = doubledDoubleValue * 2;
	//     return timesTwo3;
	// }
	
	
	// // Create your methods above this line

	// public static void main(String[] args) {
	// 	int a,b,c;
	// 	a = 10;
    //     b = 5;
    //     c = 1;
	// 	//create your variables and call your methods 
	//     int firstDouble = doubleThisInt(a);
	//     int secondDouble = doubleItAgain(firstDouble);
	// 	// print the final value to the console
	// 	System.out.println(doubledLastTime(secondDouble));
	// }

    // Here is the instructor solution, which does seem much cleaner. It even calls to methods within methods.
    // To test: delete the scanner, create and replace values a through c with 10, 5, and 1.
    // static int method1(int a) {
	// 	// Provide inline hints or outlines for your students
	// 	return a + a;
	// }
	
	// static int method2(int b) {
	//     return b + b;
	// }
	
	// static int method3(int c) {
	//     return c + c;
	// }

	// public static void main(String[] args) {
	// 	Scanner in = new Scanner(System.in);
	// 	int a,b,c;
	// 	a = in.nextInt();
	// 	c = method3(method2(method1(a)));
	
	// 	System.out.println(c);
	// }
    
    
    // //Build your methods below this line
    // public static int stringLength(String word) {
    //     return word.length();
    // }
    
    // public static int numberSquared(int wordLength) {
    //     return wordLength * wordLength;
    // }
    
    
    // //Build your methods above this line

	// public static void main(String[] args) {
	// 	String word = "Good morning!";
	// 	// Declare any variables you may need below this line
	// 	int wordLength = 0;
	// 	int lengthSquared = 0;
	// 	// Call your methods below this line
	// 	wordLength = stringLength(word);
	// 	lengthSquared = numberSquared(wordLength);
	// 	System.out.println(lengthSquared);
	// }
}