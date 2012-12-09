package com.dizan.start.service;

public class FinderService implements FinderServiceInterface {
    /**
     * 
     */
	@Override
	public String getPassTutorialService(String lang) {
		return "Values return from the Services" + lang;
	}
    
}
