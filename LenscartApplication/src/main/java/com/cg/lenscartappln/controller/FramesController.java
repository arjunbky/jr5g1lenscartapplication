package com.cg.lenscartappln.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.lenscartappln.entity.Frames;
import com.cg.lenscartappln.service.FramesService;
import com.cg.lenscartappln.utils.FrameNotFoundException;


@RestController
@RequestMapping("/frames")
public class FramesController {
	@Autowired
		FramesService service;
		
		@PostMapping("/insertframes")
		public ResponseEntity<String> addFrames(@RequestBody Frames frames){
			service.addFrames(frames);
			return new ResponseEntity<String>("Frames Added",HttpStatus.OK);
		}
		@GetMapping
		public ResponseEntity<List<Frames>> getAllFrames(){
			List<Frames> framesList=service.getAllFrames();
			return new ResponseEntity<List<Frames>>(framesList,HttpStatus.OK);
		}
		
		@DeleteMapping("/deleteframes")
		public ResponseEntity<String> deleteFrames(@RequestBody int frame_id) throws FrameNotFoundException{
			String str=service.deleteFrames(frame_id);
			return new ResponseEntity<String>(str,HttpStatus.OK);
		}
		@PutMapping("/updateframes/{code}")
		public ResponseEntity<String> modifyFrames(@PathVariable int frame_id,@RequestBody Frames frames){
			String str=service.modifyFrames(frame_id, frames);
			return new ResponseEntity<String>(str,HttpStatus.OK);
		}
	}

