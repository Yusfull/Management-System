package dao;

import java.util.List;

import com.java.web.model.Students;

public interface StudentDao {

	public void addStudent(Students student);

    public void updateStudents(Students students);

    public void removeStudents(int id);

    public List<Students> getAllStudents();

    public Students getStudentsById(int id);

    public Students grtStudentsByName(Students name);
}
