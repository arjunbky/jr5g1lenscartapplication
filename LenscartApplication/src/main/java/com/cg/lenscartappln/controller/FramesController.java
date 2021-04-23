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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.lenscartappln.entity.Frames;
import com.cg.lenscartappln.entity.Lenses;
import com.cg.lenscartappln.service.FramesService;
import com.cg.lenscartappln.utils.FrameNotFoundException;


@RestController
@RequestMapping("/frames")
public class FramesController {
	@Autowired
		FramesService service;
		
//		@PostMapping("/insertframes")
//		public ResponseEntity<String> addFrames(@RequestParam("frame_shape") String frame_shape,@RequestParam("frame_colour") String frame_colour,
//				@RequestParam("frame_brand") String frame_brand,@RequestParam("frame_price") double frame_price)
	@PostMapping("/insertframes")	
	public ResponseEntity<String> addLenses(@RequestBody Frames frames){
//			Frames frame=new Frames();
//			frame.setFrame_shape(frame_shape);
//			frame.setFrame_colour(frame_colour);
//			frame.setFrame_brand(frame_brand);
//			frame.setFrame_price(frame_price);
//			service.addFrames(frame);
//			return new ResponseEntity<String>("Frames Added",HttpStatus.OK);
		service.addFrames(frames);
		return new ResponseEntity<String>("frames Added",HttpStatus.OK);
		}
		@GetMapping
		public ResponseEntity<List<Frames>> getAllFrames(){
			List<Frames> framesList=service.getAllFrames();
			return new ResponseEntity<List<Frames>>(framesList,HttpStatus.OK);
		}
		
		@DeleteMapping("/deleteframes")
		public ResponseEntity<String> deleteFrames(@RequestParam int frame_id) throws FrameNotFoundException{
			service.deleteFrames(frame_id);
			return new ResponseEntity<String>("frame deleted",HttpStatus.OK);
		}
		@PutMapping("/updateframes/{code}")
		public ResponseEntity<String> modifyFrames(@PathVariable int frame_id,@RequestBody Frames frames){
			String str=service.modifyFrames(frame_id, frames);
			return new ResponseEntity<String>(str,HttpStatus.OK);
		}
	}

