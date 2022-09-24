package iterator;

import java.util.Iterator;

public class AssignmentIterator implements Iterator 
{
    private Assignment[] assignments;
	private int position = 0;
	/**
     * Represents the AssignmentIterator in code
     */
	public AssignmentIterator(Assignment[] assignments) 
    {
		this.assignments = assignments;
    }
	/**
     * Goes to next assignmment
     */
    public Assignment next() 
    {
		Assignment assignmentS = assignments[position];
		position = position + 1;
		return assignmentS;
	}
	
	public boolean hasNext() 
    {
		return position<=assignments.length&&assignments[position]!=null;
	}
}
