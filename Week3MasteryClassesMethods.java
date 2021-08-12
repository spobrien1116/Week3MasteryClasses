public class Week3MasteryClassesMethods {

	// static int sumOfDigits(int digits) {
	// 	// Write your code below 
	// 	int digitsSum = 0;
	// 	while(digits > 0) {
	// 		digitsSum += digits % 10;
	// 		digits /= 10;
	// 	}
	// 	return digitsSum;
    // }

    // // Do not change the code below this line 
	// public static void main(String[] args) {
	// 	int digits = 245;
	// 	int sumAll = sumOfDigits(digits);
	// 	System.out.println("The sum of all digits for the value " + digits + " is " + sumAll);
	// }

	// static String repeatWord(String userWord, int numTimes) {
	// 	// Write your code in here 
	// 	String finalWord = userWord;
	// 	for (int i = 0; i < numTimes - 1; i++) {
	// 	    finalWord += userWord;
	// 	}
	// 	return finalWord;
	// }

    // // Do not change any code below this line 
	// public static void main(String[] args) {
	// 	int numTimes = 3;
	// 	String userWord = "stop";
	// 	System.out.println(repeatWord(userWord,numTimes));
	// }

    // static void fizzBuzz(int num1) {
	// 	// Write your code here
	// 	if (num1 % 3 == 0 && num1 % 5 == 0) {
	// 	    System.out.println("FizzBuzz");
	// 	} else if (num1 % 3 == 0) {
	// 	    System.out.println("Fizz");
	// 	} else if (num1 % 5 == 0) {
	// 	    System.out.println("Buzz");
	// 	} else {
	// 	    System.out.println("Hello world!");
	// 	}
	// }

    // //Do not change any thing below this line
	// public static void main(String[] args) {
	// 	int num1 = 35;
	// 	fizzBuzz(num1);
	// }

    // public static void main(String[] args) {
	// 	String[] names = {"Joey", "James", "Robert", "Theodore", "Fred"};
	// 	int avgLength = avgNameLength(names);
	// 	System.out.println("The average name length is " + avgLength);
    // }

    // static int avgNameLength(String[] names) {
	// 	// Write your code below this line
	// 	int stringAverage = 0;
	// 	for (String name : names) {
	// 	    stringAverage += name.length();
	// 	}
	// 	return stringAverage / names.length;
	// }

    static boolean passwordChecker(String password) {
		// Write your code below this line 
		if (password.length() >= 8) {
		    for (int i = 0; i < password.length(); i++) {
                if (password.charAt(i) == '!' || password.charAt(i) == '$' || password.charAt(i) == '%' || password.charAt(i) == '&') {
                    return true;
                }    
            }
            return false;
        } else {
            return false;
        }
		// Apparently this following method could have also worked, as this was the instructor solution
		// if (password.length() >= 8 && 
		//     (password.contains("!") ||
		//      password.contains("$") ||
		//      password.contains("%") || 
		//      password.contains("&"))) {
		//          return true;
		//      }
		// return false;
	}

    // Do not change the code below this line
	public static void main(String[] args) {
		String password = "password%";
        boolean meetsRequirement = passwordChecker(password);
		if (meetsRequirement) {
		    System.out.println(password + " meets the requirements.");
		} else {
		    System.out.println(password + " does not meet the requirements.");
		}
	}
}