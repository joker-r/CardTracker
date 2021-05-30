package com.cardtracker.bean;

import java.util.Map;


public class CardHitResponnseDto {
	  private boolean success = false;
	    private int start;
	    private int limit;
	    private long size;
	    private Map<String, Object> payload;

	    public CardHitResponnseDto() {
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

		/**
		 * @return the start
		 */
		public int getStart() {
			return start;
		}

		/**
		 * @param start the start to set
		 */
		public void setStart(int start) {
			this.start = start;
		}

		/**
		 * @return the limit
		 */
		public int getLimit() {
			return limit;
		}

		/**
		 * @param limit the limit to set
		 */
		public void setLimit(int limit) {
			this.limit = limit;
		}

		/**
		 * @return the size
		 */
		public long getSize() {
			return size;
		}

		/**
		 * @param size the size to set
		 */
		public void setSize(long size) {
			this.size = size;
		}

		/**
		 * @return the payload
		 */
		public Map<String, Object> getPayload() {
			return payload;
		}

		/**
		 * @param payload the payload to set
		 */
		public void setPayload(Map<String, Object> payload) {
			this.payload = payload;
		}

		@Override
		public String toString() {
			return "CardHitResponnseDto [success=" + success + ", start=" + start + ", limit=" + limit + ", size="
					+ size + ", payload=" + payload + "]";
		}
	    
	    
}
