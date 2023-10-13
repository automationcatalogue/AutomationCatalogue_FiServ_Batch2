package JavaTeachings.Assessment_3;

public class Subject {
    public int getSubjectId() {
        return subjectId;
    }

    public char[] getSubjectNames() {
        return subjectNames;
    }

    private int subjectId;
    private char[] subjectNames;

    Subject(int x, char ch[]){
        this.subjectId=x;
        this.subjectNames=ch;
    }
}
