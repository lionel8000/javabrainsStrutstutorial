package com.dizan.start;

import com.dizan.start.service.FinderService;
import com.dizan.start.service.FinderServiceInterface;

public class TutorialAction {
    private String bestService;
    
	public String getBestService() {
		return bestService;
	}

	public void setBestService(String bestService) {
		this.bestService = bestService;
	}

	public String execute(){
		FinderServiceInterface service = new FinderService();
		String bestService = service.getPassTutorialService();
		setBestService(bestService);
		return "success";
	}
	
}
