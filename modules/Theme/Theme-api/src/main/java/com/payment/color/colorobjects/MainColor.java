package com.payment.color.colorobjects;

public class MainColor {

	private ErrorColor error;
	private SecondaryColor secondary;
	private NeutralColor neutral;
	private PrimaryColor primary;
	private SuccessColor success;
	private WarningColor warning;

	public ErrorColor getError() {
		return error;
	}

	public void setError(ErrorColor error) {
		this.error = error;
	}

	public SecondaryColor getSecondary() {
		return secondary;
	}

	public void setSecondary(SecondaryColor secondary) {
		this.secondary = secondary;
	}

	public NeutralColor getNeutral() {
		return neutral;
	}

	public void setNeutral(NeutralColor neutral) {
		this.neutral = neutral;
	}

	public PrimaryColor getPrimary() {
		return primary;
	}

	public void setPrimary(PrimaryColor primary) {
		this.primary = primary;
	}

	public SuccessColor getSuccess() {
		return success;
	}

	public void setSuccess(SuccessColor success) {
		this.success = success;
	}

	public WarningColor getWarning() {
		return warning;
	}

	public void setWarning(WarningColor warning) {
		this.warning = warning;
	}

	@Override
	public String toString() {
		return "MainColor [error=" + error + ", secondary=" + secondary + ", neutral=" + neutral + ", primary="
				+ primary + ", success=" + success + ", warning=" + warning + "]";
	}

}
