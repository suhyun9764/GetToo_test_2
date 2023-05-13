package Group2.capstone_project.repository;

import Group2.capstone_project.domain.Board;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class MysqlBoardRepository implements BoardRepository{
    private final JdbcTemplate jdbcTemplate;

    public MysqlBoardRepository(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    @Override
    public void saveBoard(Board board) {
        String sql = "INSERT INTO board(title, content, writer) VALUES (?, ?, ?)";
        Object[] params = new Object[] {board.getTitle(), board.getContent(), board.getWriter()};
        jdbcTemplate.update(sql, params);
    }

    @Override
    public List<Board> getBoard() {
        return null;
    }
}
