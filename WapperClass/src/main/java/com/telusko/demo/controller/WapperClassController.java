package com.telusko.demo.controller;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.demo.entity.Players;
import com.telusko.demo.entity.Students;
import com.telusko.demo.entity.Teachers;
import com.telusko.demo.entity.Workers;
import com.telusko.demo.repo.PlayerRepo;
import com.telusko.demo.repo.StudentRepo;
import com.telusko.demo.repo.TeacherRepo;
import com.telusko.demo.repo.WorkerRepo;
@RestController
@RequestMapping("/wapper")
public class WapperClassController {
	
	@Autowired
	private TeacherRepo teacher;
	
	@Autowired
	private PlayerRepo player;
	
	@Autowired
	private StudentRepo student;
	
	@Autowired
	private WorkerRepo worker;
	
@GetMapping("/{entity}/{id}")

public ResponseEntity<?> getEntity(@PathVariable String entity, @PathVariable Long id){
	Object result;
	switch(entity.toLowerCase()) {
	case"teacher":
		result=teacher.findById(id);
		break;
	case"player":
		result=player.findById(id);
		break;
	case"student":
		result=student.findById(id);
		break;
	case"worker":
		result=worker.findById(id);
		break;
		default:
			return  ResponseEntity.badRequest().body("NoEntity");
	}
	return result!=null?ResponseEntity.ok(result):ResponseEntity.notFound().build();
}
@PutMapping("/{entity}/{id}")

		public ResponseEntity<?> updateEntity(@PathVariable String entity,@PathVariable int id,@RequestBody Object updatedEntity){
Optional<?> existing;
switch(entity.toLowerCase()) {
case"teacher":
	existing=teacher.findById((long) id);
	break;
case"player":
	existing=player.findById((long) id);
	break;
case"student":
	existing=student.findById((long) id);
	break;
case"worker":
	existing=worker.findById((long) id);
	break;
	default:
		return  ResponseEntity.badRequest().body("No Entity");
}

if(existing.isPresent()) {
	
	Map<String,Object> updatedFields=(Map<String, Object>)updatedEntity;
	Object entityToUpdate=existing.get();
	
	for(Map.Entry<String,Object> entry : updatedFields.entrySet()) {
		String fieldName=entry.getKey();
		Object updatedValue=entry.getValue();
		
		try {
			Field field=entityToUpdate.getClass().getDeclaredField(fieldName);
			field.setAccessible(true);
			field.set(entityToUpdate, updatedValue);
		}
		catch(NoSuchFieldException |IllegalAccessException e) {
			return ResponseEntity.badRequest().body("no field"+ fieldName);
		}}
	
	switch(entity.toLowerCase()) {
	case"teacher":
		teacher.save((Teachers) entityToUpdate);
		break;
	case"player":
		player.save((Players) entityToUpdate);
		break;
	case"student":
		student.save((Students) entityToUpdate);
		break;
	case"worker":
		worker.save((Workers) entityToUpdate);
		break;
	}
	return ResponseEntity.ok("updated");
}
return ResponseEntity.notFound().build();
}
@DeleteMapping("{entity}/{id}")
public ResponseEntity<?> deleteEntity(@PathVariable String entity, @PathVariable Long id){
	
	switch(entity.toLowerCase()) {
	case"teacher":
		teacher.deleteById(id);
		break;
	case"player":
		player.deleteById(id);
		break;
	case"student":
		student.deleteById(id);
		break;
	case"worker":
		worker.deleteById(id);
		break;
		default:
			return  ResponseEntity.badRequest().body("NoEntity");
	}
	return ResponseEntity.ok("deleted");
}
}




























