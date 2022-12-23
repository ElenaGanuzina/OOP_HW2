import Seminar2.data.Teacher;
import Seminar2.service.DataService;

public class StudentGroupServiceImple implements DataService {
    
    @Override
    public Teacher read(Teacher teacher){
        return ReaderFromTxt.read(teacher);
    }

    @Override
    public Student read(Student student){
        return ReaderFromTxt.read(student);
    }

    @Override
    public void create(User user){
        WriterToTxt.write(user);
    }

    @Override
    public User read(User user){
        return ReaderFromTxt.read(user);    
    }
}
