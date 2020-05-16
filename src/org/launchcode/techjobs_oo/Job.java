package org.launchcode.techjobs_oo;

import java.util.Objects;

//ex: to get employer name (job instance of Job) - String employerName = job.getEmployer().getValue();
//ex: to print data stored in value of Employer class - System.out.println(job.getEmployer); - this works b/c the toString() method of Employer returns the value field
public class Job {
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
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency) {
        this();
        this.name = aName;
        this.employer = aEmployer;
        this.location = aLocation;
        this.positionType = aPositionType;
        this.coreCompetency = aCoreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public String toString() {
        String jobId = Integer.toString(id);
        String jobName = name;
        String jobEmployer = employer.toString();
        String jobLocation = location.toString();
        String jobPositionType = positionType.toString();
        String jobCoreCompetency = coreCompetency.toString();
//        check if data is available, if not return error message
        if (jobId.isEmpty()) { jobId = "Data not available"; }
        if (jobName.isEmpty()) { jobName = "Data not available"; }
        if (jobEmployer.isEmpty()) { jobEmployer = "Data not available"; }
        if (jobLocation.isEmpty()) { jobLocation = "Data not available"; }
        if (jobPositionType.isEmpty()) { jobPositionType = "Data not available"; }
        if (jobCoreCompetency.isEmpty()) { jobCoreCompetency = "Data not available"; }

        return "\n" +
                "ID: " + jobId + "\n" +
                "Name: " + jobName + "\n" +
                "Employer: " + jobEmployer + "\n" +
                "Location: " + jobLocation + "\n" +
                "Position Type: " + jobPositionType + "\n" +
                "Core Competency: " + jobCoreCompetency +
                "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() { return Objects.hash(getId()); }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public int getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Employer getEmployer() { return employer; }

    public void setEmployer(Employer employer) { this.employer = employer; }

    public Location getLocation() { return location; }

    public void setLocation(Location location) { this.location = location; }

    public PositionType getPositionType() { return positionType; }

    public void setPositionType(PositionType positionType) { this.positionType = positionType; }

    public CoreCompetency getCoreCompetency() { return coreCompetency; }

    public void setCoreCompetency(CoreCompetency coreCompetency) { this.coreCompetency = coreCompetency; }
}
