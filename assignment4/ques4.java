// 02220902719
// Sai Prashant Saxena

/**
 * Write a program to show use of throw and trhows keyword. Create your own
 * exception class AgeException. Also create two subclassess TooYoungException
 * and InvalidAgeException of AgeExcep-tion as discussed in class.
 */

class AgeException extends Exception {
    AgeException() {
        super();
    }

    public String getMessage() {
        return "Age Exception";
    }
}

class TooYoungException extends AgeException {
    TooYoungException() {
        super();
    }

    public String getMessage() {
        return "TooYoungException: Age is small";
    }
}

class InvalidAgeException extends AgeException {
    InvalidAgeException() {
        super();
    }

    public String getMessage() {
        return "InvalidAgeException: Age is invalid";
    }
}

public class ques4 {
    public static void main(String[] args) {
        try {
            validateAge(-1);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
        try {
            validateAge(5);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
        try {
            validateAge(25);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateAge(int age) throws AgeException {
        if (age < 0) {
            throw new InvalidAgeException();
        }
        if (age < 18) {
            throw new TooYoungException();
        }
        System.out.println("Age is validated");
    }
}
