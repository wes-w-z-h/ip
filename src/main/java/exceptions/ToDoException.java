package exceptions;

import util.Utility;

/**
 * Class for a todo exception.
 */
public class ToDoException extends MizzException {
    public ToDoException(String msg) {
        super(msg);
    }

    @Override
    public String toString() {
        return Utility.INDENT + "Uh oh what did you to the to do?: " + super.getMessage()
                + Utility.NEW_LINE + Utility.INDENT + "Example usage: todo <description>";
    }
}
