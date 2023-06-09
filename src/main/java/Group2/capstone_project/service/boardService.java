package Group2.capstone_project.service;

import Group2.capstone_project.domain.Board;
import Group2.capstone_project.repository.BoardRepository;

public class boardService {
    private final BoardRepository boardRepository;

    public boardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public void saveBoard(Board board){
        boardRepository.saveBoard(board);
    }
}
