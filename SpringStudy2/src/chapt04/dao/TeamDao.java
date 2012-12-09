package chapt04.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import chapt04.model.Team;

public interface TeamDao {
	List<Team> getTeamList() throws DataAccessException;
}
