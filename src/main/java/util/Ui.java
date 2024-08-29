package util;

import java.util.Scanner;

/**
 * Utility class to interact with the user.
 */
public class Ui {
    private final Scanner sc;

    /**
     * Constructor for a new Ui object.
     */
    public Ui() {
        this.sc = new Scanner(System.in);
    };

    /**
     * Prints the response by prepending the indent to the msgs and wrapping the final msg in
     * between horizontal lines with pretty print.
     * 
     * @param strArr The array of strings that make up the msg, each element will be separated with
     *        a \n in the printed msg.
     */
    public void printResponse(String... strArr) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strArr.length - 1; i++) {
            sb.append(Utility.INDENT + strArr[i] + Utility.NEW_LINE);
        }
        if (strArr.length >= 1) {
            sb.append(Utility.INDENT + strArr[strArr.length - 1]);
        }
        Utility.prettyPrint(sb.toString());
    }

    /**
     * Utility method to get input from std::in.
     * 
     * @return Input from std::in.
     */
    public String getNextLine() {
        return this.sc.nextLine();
    }
}
