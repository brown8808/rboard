package com.brown8808.rboard.controller;

import com.brown8808.rboard.entity.Board;
import com.brown8808.rboard.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;

    @GetMapping("board/write")
    public String boardWriteForm() {
        return "boardwrite";
    }

    @PostMapping("board/writepro")
    public String boardWritePro(Board board) {
        boardService.write(board);

        return "";
    }
}
