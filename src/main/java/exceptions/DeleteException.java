package exceptions;

import util.Utility;

/**
 * Class for a delete exception.
 */
public class DeleteException extends MizzException {
    public DeleteException(String msg) {
        super(msg);
    }

    @Override
    public String toString() {
        return Utility.INDENT + "OOPs bad delete!: " + super.getMessage() + Utility.NEW_LINE
                + Utility.INDENT + "Example usage: delete <valid_idx_from_1>";
    }
}
