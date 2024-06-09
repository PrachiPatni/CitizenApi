package in.prachi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.prachi.entity.Citizen;
import in.prachi.repository.CitizenRepo;
@Service
public class CitizenServiceImpl implements CitizenService {
	@Autowired
	public CitizenRepo citizenRepo;
	@Override
	public String saveCitizen(Citizen c) {
	    try {
	        citizenRepo.save(c);
	        return "Citizen Saved Successfully.";
	    } catch (Exception e) {
	        return "Failed to save Citizen. Please try again.";
	    }
	}


    
	@Override
	public Citizen getCitizenById(Integer id) {
		Optional<Citizen> findById = citizenRepo.findById(id);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Citizen> getAllCitizens() {
		return citizenRepo.findAll();
		
	}

	@Override
	public String deleteCitizen(Integer id) {
		if(citizenRepo.existsById(id)) {
			citizenRepo.deleteById(id);
			return "Delete Success";
		}else {
			return "No record Found!!";
					
		}
		
	}

}
