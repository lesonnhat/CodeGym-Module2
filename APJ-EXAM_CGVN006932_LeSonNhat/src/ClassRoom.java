import java.util.List;

public class ClassRoom {
    private String classId;
    private String className;

    public ClassRoom() {
    }

    public ClassRoom(String classId, String className, String teacherId) {
        this.classId = classId;
        this.className = className;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
