package com.cardtracker.bean;

public class BListResponse {
	 private Number number;

	    private String scheme;

	    private String type;

	    private String brand;

	    private boolean prepaid;

	    private Country country;

	    private Bank bank;

		/**
		 * @return the number
		 */
		public Number getNumber() {
			return number;
		}

		/**
		 * @param number the number to set
		 */
		public void setNumber(Number number) {
			this.number = number;
		}

		/**
		 * @return the scheme
		 */
		public String getScheme() {
			return scheme;
		}

		/**
		 * @param scheme the scheme to set
		 */
		public void setScheme(String scheme) {
			this.scheme = scheme;
		}

		/**
		 * @return the type
		 */
		public String getType() {
			return type;
		}

		/**
		 * @param type the type to set
		 */
		public void setType(String type) {
			this.type = type;
		}

		/**
		 * @return the brand
		 */
		public String getBrand() {
			return brand;
		}

		/**
		 * @param brand the brand to set
		 */
		public void setBrand(String brand) {
			this.brand = brand;
		}

		/**
		 * @return the prepaid
		 */
		public boolean isPrepaid() {
			return prepaid;
		}

		/**
		 * @param prepaid the prepaid to set
		 */
		public void setPrepaid(boolean prepaid) {
			this.prepaid = prepaid;
		}

		/**
		 * @return the country
		 */
		public Country getCountry() {
			return country;
		}

		/**
		 * @param country the country to set
		 */
		public void setCountry(Country country) {
			this.country = country;
		}

		/**
		 * @return the bank
		 */
		public Bank getBank() {
			return bank;
		}

		/**
		 * @param bank the bank to set
		 */
		public void setBank(Bank bank) {
			this.bank = bank;
		}

		@Override
		public String toString() {
			return "BListResponse [number=" + number + ", scheme=" + scheme + ", type=" + type + ", brand=" + brand
					+ ", prepaid=" + prepaid + ", country=" + country + ", bank=" + bank + "]";
		}

}
