class InvalidPasswordException extends Exception {
    int passwordConditionViolated = 0;

    public InvalidPasswordException(int conditionViolated) {
        super("Invalid Password: ");
        passwordConditionViolated = conditionViolated;
    }

    public String printMessage() {
        switch (passwordConditionViolated) {
            case 1:
                return ("password length should be between 8 to 15 characters");

            case 2:
                return ("password should not contain any space");

            case 3:
                return ("password should contain at least one digit(0-9)");

            case 4:
                return ("password should contain at least one special character");

            case 5:
                return ("password should contain at least one uppercase letter(A-Z)");

            case 6:
                return ("password should contain at least one lowercase letter(a-z)");
        }
        return ("");
    }
}

public class PasswordValidator {
    public static void isValid(String password) throws InvalidPasswordException {
        if (!((password.length() >= 8) && (password.length() <= 15))) {
            throw new InvalidPasswordException(1);
        }

        if (password.contains(" ")) {
            throw new InvalidPasswordException(2);
        }

        int count = 0;
        for (int i = 0; i <= 9; i++) {
            String str1 = Integer.toString(i);
            if (password.contains(str1)) {


                count = 1;
                break;
            }
        }
        if (count == 0) {
            throw new InvalidPasswordException(3);
        }

        if (!(password.contains("@") || password.contains("#") || password.contains("$") || password.contains("!"))) {
            throw new InvalidPasswordException(4);
        }

        count = 0;
        for (int i = 65; i <= 90; i++) {
            char c = (char) i;
            String str1 = Character.toString(c);
            if (password.contains(str1)) {
                count = 1;
                break;
            }
        }
        if (count == 0) {
            throw new InvalidPasswordException(5);
        }

        count = 0;
        for (int i = 97; i <= 122; i++) {
            char c = (char) i;
            String str1 = Character.toString(c);
            if (password.contains(str1)) {
                count = 1;
                break;
            }
        }
        if (count == 0) {
            throw new InvalidPasswordException(6);
        }
    }

    public static void main(String[] args) {
        String passWord1 = "LpuVertosJalandhar";
        try {
            System.out.println("Is Password " + passWord1 + " valid?");
            isValid(passWord1);
            System.out.println("Valid Password");
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
            System.out.println(e.printMessage());
        }

        String password2 = "Check007@LPU";
        try {
            System.out.println("\nIs password " + password2 + " valid?");
            isValid(password2);
            System.out.println("Valid Password");
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
            System.out.println(e.printMessage());
        }
    }
}
