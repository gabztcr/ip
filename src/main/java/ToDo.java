public class ToDo extends Task {
    /**
     * Constructs new Todo object.
     *
     * @param description Description of the Todo task.
     */
    public ToDo(String description) {
        super(description);
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }

    /**
     * Returns the task string to be written to the duke.txt storage file.
     *
     * @return task string.
     */
    public String toStorageString() {
        return "[T]" + super.toStorageString();
    }
}
