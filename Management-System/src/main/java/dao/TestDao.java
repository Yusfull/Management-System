package dao;

import java.util.List;

import com.java.web.model.Test;

public interface TestDao {

	public void addTest(Test test);

    public void updateTest(Test test);

    public void removeTest(int id);

    public List<Test> getAllTest();

    public Test getTestById(int id);

    public Test getTestByName(Test name);
}
