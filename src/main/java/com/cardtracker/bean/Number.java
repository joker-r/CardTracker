package com.cardtracker.bean;

public class Number {
	 private int length;
	    private boolean luhn;
		/**
		 * @return the length
		 */
		public int getLength() {
			return length;
		}
		/**
		 * @param length the length to set
		 */
		public void setLength(int length) {
			this.length = length;
		}
		/**
		 * @return the luhn
		 */
		public boolean isLuhn() {
			return luhn;
		}
		@Override
		public String toString() {
			return "Number [length=" + length + ", luhn=" + luhn + "]";
		}
		/**
		 * @param luhn the luhn to set
		 */
		public void setLuhn(boolean luhn) {
			this.luhn = luhn;
		}
}
