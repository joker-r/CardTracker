package com.cardtracker.bean;

public class Country {
	  private String numeric;

	    private String alpha2;

	    private String name;

	    private String emoji;

	    private String currency;

	    private long latitude;

	    private long longitude;

		/**
		 * @return the numeric
		 */
		public String getNumeric() {
			return numeric;
		}

		/**
		 * @param numeric the numeric to set
		 */
		public void setNumeric(String numeric) {
			this.numeric = numeric;
		}

		/**
		 * @return the alpha2
		 */
		public String getAlpha2() {
			return alpha2;
		}

		/**
		 * @param alpha2 the alpha2 to set
		 */
		public void setAlpha2(String alpha2) {
			this.alpha2 = alpha2;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the emoji
		 */
		public String getEmoji() {
			return emoji;
		}

		/**
		 * @param emoji the emoji to set
		 */
		public void setEmoji(String emoji) {
			this.emoji = emoji;
		}

		/**
		 * @return the currency
		 */
		public String getCurrency() {
			return currency;
		}

		/**
		 * @param currency the currency to set
		 */
		public void setCurrency(String currency) {
			this.currency = currency;
		}

		/**
		 * @return the latitude
		 */
		public long getLatitude() {
			return latitude;
		}

		/**
		 * @param latitude the latitude to set
		 */
		public void setLatitude(long latitude) {
			this.latitude = latitude;
		}

		/**
		 * @return the longitude
		 */
		public long getLongitude() {
			return longitude;
		}

		/**
		 * @param longitude the longitude to set
		 */
		public void setLongitude(long longitude) {
			this.longitude = longitude;
		}

		@Override
		public String toString() {
			return "Country [numeric=" + numeric + ", alpha2=" + alpha2 + ", name=" + name + ", emoji=" + emoji
					+ ", currency=" + currency + ", latitude=" + latitude + ", longitude=" + longitude + "]";
		}

}
