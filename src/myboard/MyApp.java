package myboard;

import java.sql.Connection;
import java.util.ArrayList;

import myboard.domain.boards.Boards;
import myboard.domain.boards.BoardsDao;
import myboard.domain.comments.Comments;
import myboard.domain.comments.CommentsDao;
import myboard.domain.members.Members;
import myboard.domain.members.MembersDao;
import myboard.dto.BoardListDto;
import myboard.service.BoardsService;
import myboard.service.CommentsService;
import myboard.service.MembersService;
import service.DbConnection;

public class MyApp {

	public static void main(String[] args) {
		Connection conn = DbConnection.connection();
		BoardsDao boadrsDao = new BoardsDao(conn);
		MembersDao membersDao = new MembersDao(conn);
		CommentsDao commentsDao = new CommentsDao(conn);
		BoardsService boardsService = new BoardsService(conn,boadrsDao);
		MembersService membersService = new MembersService(conn,membersDao);
		CommentsService commentsService = new CommentsService(conn, commentsDao);
		
		BoardListDto list = new BoardListDto();
		list = boardsService.게시글별댓글수(3);
		System.out.println(list.getTitle());
		System.out.println(list.getUsername());
		System.out.println(list.getContent());
		
		

	}

}
