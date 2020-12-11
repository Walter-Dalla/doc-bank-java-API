package br.com.dalla.ezdevs.bank.accont;

import java.util.ArrayList;

public class AccontRepository {
	
	private static ArrayList<AccontModel> accontModelList = new ArrayList<AccontModel>();
	
	public AccontRepository(){
		AccontModel accontModel1 = new AccontModel(1, 100);
		AccontModel accontModel2 = new AccontModel(2, 100);
		
		accontModelList.add(accontModel1);
		accontModelList.add(accontModel2);
	}
	
	public ArrayList<AccontModel> getAccontModelList(){
		return accontModelList;
	}
	
	public AccontModel findById(Integer id) {
	    for (AccontModel accont : this.accontModelList) {
	        if (accont.getId().equals(id)) {
	            return accont;
	        }
	    }
	    return null;
	}
	
}
