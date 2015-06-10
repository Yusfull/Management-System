package dao;

import java.util.List;

import com.java.web.model.Marks;

public interface MarksDao {

	public void addMarks(Marks marks);

    public void updateMarks(Marks marks);

    public void removeMarks(int id);

    public List<Marks> getAllMarks();
}
