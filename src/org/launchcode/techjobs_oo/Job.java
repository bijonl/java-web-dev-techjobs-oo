package org.launchcode.techjobs_oo;

import java.util.Objects;

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

    public Job(String name, Employer employer, Location location, PositionType positionType,CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Create the toString Method
    public String toString(){
        String noData = "Data Not Available";
        String id = "ID: " + this.id;
        String name = "Name: ";
        if(this.name==null|| this.name.length()<1) {
            name = name.concat(noData);
        }
            else {
                name = name.concat(this.name);
            }
        String employer = "Employer: ";
            if(this.getEmployer()==null || this.getEmployer().getValue().length()<1){
                employer = employer.concat(noData);
            } else {
                employer=employer.concat(this.getEmployer().getValue());
            }
        String location = "Location: ";
        if(this.getLocation()==null || this.getLocation().getValue().length()<1){
            location = location.concat(noData);
        } else {
            location=location.concat(this.getLocation().getValue());
        }
        String position = "Position Type: ";
        if(this.getPositionType()==null || this.getPositionType().getValue().length()<1){
            position = position.concat(noData);
        } else {
            position = position.concat(this.getPositionType().getValue());
        }
        String core = "Core Competency: ";
        if(this.getCoreCompetency()==null || this.getCoreCompetency().getValue().length()<1){
            core = core.concat(noData);
        } else {
            core=core.concat(this.getCoreCompetency().getValue());
        }
        return "\n" + id + "\n" + name + "\n" + employer + "\n" + location + "\n" + position + "\n" + core + "\n";
        };


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer(){
        return employer;
    }

    public void setEmployer(Employer employer){
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}
