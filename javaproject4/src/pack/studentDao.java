package pack;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import com.mysql.jdbc.ResultSet;
import java.sql.SQLException;
import java.util.*;	

public class studentDao
{
private JdbcTemplate jdbcTemplate;
public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
{
	this.jdbcTemplate=jdbcTemplate;
}
public int savestudent(student e)
{
	String query="insert into student values('"+e.getId()+"','"+e.getName()+"')";
	return jdbcTemplate.update(query);
}
public int updatestudent(student e)
{
	String query="update student set name='"+e.getName()+"'where id='"+e.getId()+"'";
			return jdbcTemplate.update(query); 
}
public int deletestudent(student e)
{
	String query="delete from student where id='"+e.getId()+"'";
	return jdbcTemplate.update(query); 
} 
public List<student>getAllstudent()
{
	return jdbcTemplate.query("select *from student",new ResultSetExtractor<List<student>>() 
			{
			@Override
			public List<student>extractData(java.sql.ResultSet rs)throws SQLException,DataAccessException
			{
				List<student> list=new ArrayList<student>();
				while(rs.next())
				{
					student e=new student();
					e.setId(rs.getInt(1));
					e.setName(rs.getString(2));
					list.add(e);
				}
				return list;
			}
			});
}

}

