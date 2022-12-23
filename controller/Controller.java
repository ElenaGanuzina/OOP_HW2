package Seminar2.controller;

import Seminar2.data.Student;
import Seminar2.service.DataService;
import Seminar2.service.StudentServiceImple;

public class Controller {

    private DataService studentService;
    private DataService studentGroupService;

    

    public DataService getStudentGroupService() {
        return studentGroupService;
    }

    public void setStudentGroupService(DataService studentGroupService) {
        this.studentGroupService = studentGroupService;
    }

    public DataService getStudentService() {
        return studentService;
    }

    public void setStudentService(DataService studentService) {
        this.studentService = studentService;
    }

    public Controller(StudentServiceImple studentService){
        this.studentService = studentService;
    }

    public Student createStudent(Student student){
        studentService.create(student);
        return (Student) studentService.read(student);
        
    }

    public Controller(StudentGroupServiceImple studentGroupService){
        this.studentGroupService = studentGroupService;
    }

    public StudentGroup createGroup(int groupNumber){
        studentGroup.create(studentGroup);
        return (StudentGroup) studentGroup;
    }
}
