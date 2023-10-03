package Assessment_3;

public class ClassRoom {
    private int classId;

    public int getClassId() {
        return classId;
    }

    public char[] getClassNames() {
        return classNames;
    }

    private char classNames[];

    ClassRoom(int a, char ch[]){
        this.classId=a;
        this.classNames=ch;
    }
}
