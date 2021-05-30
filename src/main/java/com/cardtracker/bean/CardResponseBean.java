package com.cardtracker.bean;


public class CardResponseBean {

    private boolean success;
    private Payload payload;
	
	/**
	 * @return the payload
	 */
	public Payload getPayload() {
		return payload;
	}
	/**
	 * @param payload the payload to set
	 */
	public void setPayload(Payload payload) {
		this.payload = payload;
	}
	/**
	 * @return the success
	 */
	public boolean isSuccess() {
		return success;
	}
	/**
	 * @param success the success to set
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}
	@Override
	public String toString() {
		return "CardResponseBean [success=" + success + ", payload=" + payload + "]";
	}
	
    
   

}
