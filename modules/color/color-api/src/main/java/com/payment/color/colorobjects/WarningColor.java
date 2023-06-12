package com.payment.color.colorobjects;

public class WarningColor {

	private String bg;
	private String light;
	private String dark;
	private String defaultPrimary;
	private String disabled;

	public String getBg() {
		return bg;
	}

	public void setBg(String bg) {
		this.bg = bg;
	}

	public String getLight() {
		return light;
	}

	public void setLight(String light) {
		this.light = light;
	}

	public String getDark() {
		return dark;
	}

	public void setDark(String dark) {
		this.dark = dark;
	}

	public String getDefaultPrimary() {
		return defaultPrimary;
	}

	public void setDefaultPrimary(String defaultPrimary) {
		this.defaultPrimary = defaultPrimary;
	}

	public String getDisabled() {
		return disabled;
	}

	public void setDisabled(String disabled) {
		this.disabled = disabled;
	}

	@Override
	public String toString() {
		return "PrimaryColor [bg=" + bg + ", light=" + light + ", dark=" + dark + ", default=" + defaultPrimary
				+ ", disabled=" + disabled + "]";
	}
}
