package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {
//    common fields: private int id, private static int nextId, private String value
    private int id;
    private static int nextId = 1;
    private String value;
//    common constructors: public ClassName (), public ClassName (String value)
    public JobField() {
    id = nextId;
    nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }
//    common getters & setters: getId, getValue, setValue
    public int getId() { return id; }

    public String getValue() { return value; }

    public void setValue(String value) { this.value = value; }
    //    common identical custom methods: toString, equals, hashCode
    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
