package iterator;

public class Course {
     private Assignment [] assignments = new Assignment [5];
     private int count = 0;
     private String name;
     private String title;
    /**
     * Represents the Course in code
     */
    public Course(String name, String title)
    {
        this.name = name;
        this.title = title;
    }
    /**
     * Adds a new assignment to the array of assignments
     */
    public void addAssignment(String title, String description, Topic topic)
    {
        Assignment assignment = new Assignment(title, description, topic);
        assignments[count] = assignment;
        count++;
        assignments = growArray(assignments);
    }
    /**
     * Doubles the Assignment array
     */
    private Assignment[] growArray(Assignment[] first)
    {
        Assignment[] second;
        second = new Assignment[first.length*2];
        
        for(int j = 0; j < first.length; j++)
        {
            second[j] = first[j];
        }
        return second;
    }
   
    public AssignmentIterator createIterator()
    {
        return new AssignmentIterator(assignments);
    }

    public String toString()
    {
        return " CSCE 247: Software Engineering ";
    }

}
