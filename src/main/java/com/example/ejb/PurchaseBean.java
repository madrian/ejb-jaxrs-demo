package com.example.ejb;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;


@Singleton
public class PurchaseBean {
	private final static Logger logger = Logger.getLogger(PurchaseBean.class.getName());
	private String name;
	
	@PostConstruct
	public void init() {
		logger.info("Initializing PurchaseBean... ");
		setName("Purchase Singleton EJB");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String purchaseById(String id) {
		return "Item " + id + " purchased successfully.";
	}
	
	
}
