package in.prachi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.prachi.entity.Citizen;
import in.prachi.service.CitizenService;

@RestController
public class CitizenController {
	@Autowired
  public CitizenService citizenService;
	private Citizen citizenById ;
	@PostMapping("/save")
	public ResponseEntity<String> saveCitizen(@RequestBody Citizen citizen) {
	    String saveResult = citizenService.saveCitizen(citizen);

	    if ("Citizen saved successfully.".equals(saveResult)) {
	        return new ResponseEntity<>(saveResult, HttpStatus.OK);
	    } else {
	        return new ResponseEntity<>(saveResult, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}

	@GetMapping("/citizen/{id}")
	public ResponseEntity<Citizen> getCitizenById(@PathVariable Integer id) {
	    citizenById = citizenService.getCitizenById(id);
	    if (citizenById != null) {
	        return new ResponseEntity<>(citizenById, HttpStatus.OK);
	    } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}

	
	@GetMapping("/citizens")
	public ResponseEntity <List<Citizen>> getAllCitizen(){
		List<Citizen> allCitizens = citizenService.getAllCitizens();
		return new ResponseEntity<>(allCitizens, HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteCitizen(@PathVariable Integer id) {
        String status = citizenService.deleteCitizen(id);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }
}
