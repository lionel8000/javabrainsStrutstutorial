package com.dizan.start;

import com.dizan.start.service.FinderService;
import com.dizan.start.service.FinderServiceInterface;

public class TutorialAction {
    private String bestService;
    private String lang;
    
	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getBestService() {
		return bestService;
	}

	public void setBestService(String bestService) {
		this.bestService = bestService;
	}
    
	public String execute(){
		FinderServiceInterface service = new FinderService();
		String bestService = service.getPassTutorialService(lang);
		setBestService(bestService);
		return "success";
	}
	
}
