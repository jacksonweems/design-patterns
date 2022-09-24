package iterator;

public class Assignment {
    private String description;
    private String title;
    private Topic topic;
    /**
     * Represents the Assignment in code
     */
    public Assignment(String title, String description, Topic topic)
    {
        this.title = title;
        this.description = description;
        this.topic = topic;
    }
    /**
     * Checks topic value
     */
    public boolean hasTopic(Topic topic)
    {
        return this.topic == topic;
    }
    /**
     * Returns the title and description of the assignment
     */
    public String toString()
    {
        return this.title+": "+this.description;
    }
}
