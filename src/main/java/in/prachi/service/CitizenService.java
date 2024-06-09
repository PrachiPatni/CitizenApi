package in.prachi.service;

import java.util.List;

import in.prachi.entity.Citizen;

public interface CitizenService {

	String saveCitizen(Citizen c) ;
	Citizen getCitizenById(Integer id);
	
  List<Citizen> getAllCitizens();
  String deleteCitizen(Integer id);
  
  
	
	
}
  