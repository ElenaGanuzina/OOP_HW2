package Seminar2.service;

import Seminar2.data.User;
import Seminar2.util.ReaderFromTxt;
import Seminar2.util.WriterToTxt;

public class StudentServiceImple implements DataService {
    
    @Override
    public void create(User user){
        WriterToTxt.write(user);    
    }

    @Override
    public User read(User user){
        return ReaderFromTxt.read(user);    
    }
}
