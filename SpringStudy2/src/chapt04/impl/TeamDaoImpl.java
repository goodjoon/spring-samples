package chapt04.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import chapt04.dao.TeamDao;
import chapt04.model.Team;

public class TeamDaoImpl extends JdbcDaoSupport implements TeamDao {

	@Override
	public List<Team> getTeamList() throws DataAccessException {
		RowMapper rowMapper = new TeamRowMapper();
		return getJdbcTemplate().query("SELECT team_id, name FROM team", rowMapper);
	}
	
	protected class TeamRowMapper implements RowMapper {

		@Override
		public Team mapRow(ResultSet rs, int rowNum) throws SQLException {
			Team team = new Team();
			team.setId(rs.getInt("team_id"));
			team.setName(rs.getString("name"));
			
			return team;
		}
		
	}

}
