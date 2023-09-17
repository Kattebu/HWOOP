package HW3HW4.Domen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Comparable<StudentGroup>, Iterable<Student>{
    private List<Student> group;
    private int groupId;

    public StudentGroup(List<Student> group, int groupId) {
        this.group = group;
        this.groupId = groupId;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    // @Override
    // public String toString() {
    // return "Student = " + groupId;
    // }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(group);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Group ID: ").append(groupId).append("\n");
        sb.append("Number of students: ").append(group.size()).append("\n");
        sb.append("Students: \n");
        for (Student s : group) {
            sb.append(s.toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public int compareTo(StudentGroup o) {
        if (this.group.size() == o.group.size()) {
            return Integer.compare(this.groupId, o.groupId);
        }
        return Integer.compare(this.group.size(), o.group.size());
    }
}
