package org.launchcode.techjobs_oo;
//ex: to get employer name (job instance of Job) - String employerName = job.getEmployer().getValue();
//ex: to print data stored in value of Employer class - System.out.println(job.getEmployer); - this works b/c the toString() method of Employer returns the value field
public class Job {
//creates unique identifiers for each Job object
    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;


    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
