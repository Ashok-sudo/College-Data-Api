package com.xtglobal;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/college")
public class CollegeController 
{
	@GetMapping("/{collegeId}")
	public ResponseEntity<College> getCollegeDetails(@PathVariable("collegeId") Long collegeId)
	{
		College c1 = new College();
		c1.setCollegeId(1l);
		c1.setCollegeName("Corporate College");
		c1.setAddress("Guntur");
		
	return new ResponseEntity<College>(c1,HttpStatus.OK);
		
	}

}
