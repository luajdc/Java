package org.bigbird.note.controller.note;

import javax.annotation.Resource;

import org.bigbird.note.entity.NoteResult;
import org.bigbird.note.service.NoteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/note")
public class LoadDeleteController {

	@Resource
	private NoteService noteService;
	
	@RequestMapping("/loadDelete.do")
	@ResponseBody
	public NoteResult execute(String userId){
			NoteResult result = noteService.loadDelete(userId);
			return result;
		
	}
}
