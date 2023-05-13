package Group2.capstone_project.controller;
import Group2.capstone_project.domain.Board;
import Group2.capstone_project.dto.client.BoardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import Group2.capstone_project.service.boardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class boardController {

    private final boardService boardService;

    @Autowired
    public boardController(boardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping("/board/create")
    public String saveBoard(BoardDto boardDto){
        Board board = new Board();
        board.setContent(boardDto.getContent());
        board.setId(boardDto.getId());
        board.setTitle(boardDto.getTitle());
        board.setModdate(boardDto.getModdate());
        board.setRegdate(boardDto.getRegdate());
        boardService.saveBoard(board);
        System.out.println(board.getId());
        System.out.println(board.getContent());
        return "loginClient/login_index.html";
    }
}
