package entities;

import java.util.Objects;

public class Candidate {

    private String name;
    private Integer votes;


    @Override
    public String toString() {
        return "Name: " + name + " Vote: " + votes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        return Objects.equals(name, candidate.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Candidate(String name, Integer votes) {
        this.name = name;
        this.votes = votes;
    }

    public Candidate() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }
}
