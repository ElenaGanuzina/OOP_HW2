import Seminar2.data.Teacher;

public class StudentGroup extends User{

    private List<Student> studentList;
    private Teacher teacher;
    private int groupNumber;

    public StidentGroup(List<Student> studentList, Teacher teacher){
        this.studentList = studentList;
        this.teacher = teacher;
    }

    public StudentGroup(List<Student> studentList, Teacher teacher, int groupNumber){ 
        this.studentList = studentList;
        this.teacher = teacher;
        this.groupNumber = groupNumber;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    } 
    
     
}