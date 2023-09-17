package HW3HW4.Domen;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup>{
    private List<StudentGroup> groups;
    private int streamNumber;

    public StudentStream(List<StudentGroup> groups, int streamNumber) {
        this.groups = groups;
        this.streamNumber = streamNumber;
    }

    public void addGroup(StudentGroup group) {
        groups.add(group);
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<StudentGroup> groups) {
        this.groups = groups;
    }

    public int getStreamNumber() {
        return streamNumber;
    }

    public void setStreamNumber(int streamNumber) {
        this.streamNumber = streamNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stream number: ").append(streamNumber).append("\n");
        sb.append("Number of groups: ").append(groups.size()).append("\n");
        sb.append("Groups: \n");
        for (StudentGroup group : groups) {
            sb.append(group.toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return groups.iterator();
    }

    public void sortGroups() {
        Collections.sort(groups);
    }

    public void sortGroupsById() {
        Collections.sort(groups, (g1, g2) -> Integer.compare(g1.getGroupId(), g2.getGroupId()));
    }
}
