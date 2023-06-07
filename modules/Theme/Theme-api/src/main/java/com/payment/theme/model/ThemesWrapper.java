/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.payment.theme.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Themes}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Themes
 * @generated
 */
public class ThemesWrapper
	extends BaseModelWrapper<Themes> implements ModelWrapper<Themes>, Themes {

	public ThemesWrapper(Themes themes) {
		super(themes);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("colorsId", getColorsId());
		attributes.put("userId", getUserId());
		attributes.put("neutralBlack", getNeutralBlack());
		attributes.put("neutralWhite", getNeutralWhite());
		attributes.put("neutralGray1", getNeutralGray1());
		attributes.put("primaryBg", getPrimaryBg());
		attributes.put("primaryLight", getPrimaryLight());
		attributes.put("primaryDark", getPrimaryDark());
		attributes.put("primaryDefault", getPrimaryDefault());
		attributes.put("primaryDisabled", getPrimaryDisabled());
		attributes.put("secondaryBg", getSecondaryBg());
		attributes.put("secondaryLight", getSecondaryLight());
		attributes.put("secondaryDark", getSecondaryDark());
		attributes.put("secondaryDefault", getSecondaryDefault());
		attributes.put("secondaryDisabled", getSecondaryDisabled());
		attributes.put("successBg", getSuccessBg());
		attributes.put("successLight", getSuccessLight());
		attributes.put("successDark", getSuccessDark());
		attributes.put("successDefault", getSuccessDefault());
		attributes.put("successDisabled", getSuccessDisabled());
		attributes.put("errorBg", getErrorBg());
		attributes.put("errorLight", getErrorLight());
		attributes.put("errorDark", getErrorDark());
		attributes.put("errorDefault", getErrorDefault());
		attributes.put("errorDisabled", getErrorDisabled());
		attributes.put("warningBg", getWarningBg());
		attributes.put("warningLight", getWarningLight());
		attributes.put("warningDark", getWarningDark());
		attributes.put("warningDefault", getWarningDefault());
		attributes.put("warningDisabled", getWarningDisabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long colorsId = (Long)attributes.get("colorsId");

		if (colorsId != null) {
			setColorsId(colorsId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String neutralBlack = (String)attributes.get("neutralBlack");

		if (neutralBlack != null) {
			setNeutralBlack(neutralBlack);
		}

		String neutralWhite = (String)attributes.get("neutralWhite");

		if (neutralWhite != null) {
			setNeutralWhite(neutralWhite);
		}

		String neutralGray1 = (String)attributes.get("neutralGray1");

		if (neutralGray1 != null) {
			setNeutralGray1(neutralGray1);
		}

		String primaryBg = (String)attributes.get("primaryBg");

		if (primaryBg != null) {
			setPrimaryBg(primaryBg);
		}

		String primaryLight = (String)attributes.get("primaryLight");

		if (primaryLight != null) {
			setPrimaryLight(primaryLight);
		}

		String primaryDark = (String)attributes.get("primaryDark");

		if (primaryDark != null) {
			setPrimaryDark(primaryDark);
		}

		String primaryDefault = (String)attributes.get("primaryDefault");

		if (primaryDefault != null) {
			setPrimaryDefault(primaryDefault);
		}

		String primaryDisabled = (String)attributes.get("primaryDisabled");

		if (primaryDisabled != null) {
			setPrimaryDisabled(primaryDisabled);
		}

		String secondaryBg = (String)attributes.get("secondaryBg");

		if (secondaryBg != null) {
			setSecondaryBg(secondaryBg);
		}

		String secondaryLight = (String)attributes.get("secondaryLight");

		if (secondaryLight != null) {
			setSecondaryLight(secondaryLight);
		}

		String secondaryDark = (String)attributes.get("secondaryDark");

		if (secondaryDark != null) {
			setSecondaryDark(secondaryDark);
		}

		String secondaryDefault = (String)attributes.get("secondaryDefault");

		if (secondaryDefault != null) {
			setSecondaryDefault(secondaryDefault);
		}

		String secondaryDisabled = (String)attributes.get("secondaryDisabled");

		if (secondaryDisabled != null) {
			setSecondaryDisabled(secondaryDisabled);
		}

		String successBg = (String)attributes.get("successBg");

		if (successBg != null) {
			setSuccessBg(successBg);
		}

		String successLight = (String)attributes.get("successLight");

		if (successLight != null) {
			setSuccessLight(successLight);
		}

		String successDark = (String)attributes.get("successDark");

		if (successDark != null) {
			setSuccessDark(successDark);
		}

		String successDefault = (String)attributes.get("successDefault");

		if (successDefault != null) {
			setSuccessDefault(successDefault);
		}

		String successDisabled = (String)attributes.get("successDisabled");

		if (successDisabled != null) {
			setSuccessDisabled(successDisabled);
		}

		String errorBg = (String)attributes.get("errorBg");

		if (errorBg != null) {
			setErrorBg(errorBg);
		}

		String errorLight = (String)attributes.get("errorLight");

		if (errorLight != null) {
			setErrorLight(errorLight);
		}

		String errorDark = (String)attributes.get("errorDark");

		if (errorDark != null) {
			setErrorDark(errorDark);
		}

		String errorDefault = (String)attributes.get("errorDefault");

		if (errorDefault != null) {
			setErrorDefault(errorDefault);
		}

		String errorDisabled = (String)attributes.get("errorDisabled");

		if (errorDisabled != null) {
			setErrorDisabled(errorDisabled);
		}

		String warningBg = (String)attributes.get("warningBg");

		if (warningBg != null) {
			setWarningBg(warningBg);
		}

		String warningLight = (String)attributes.get("warningLight");

		if (warningLight != null) {
			setWarningLight(warningLight);
		}

		String warningDark = (String)attributes.get("warningDark");

		if (warningDark != null) {
			setWarningDark(warningDark);
		}

		String warningDefault = (String)attributes.get("warningDefault");

		if (warningDefault != null) {
			setWarningDefault(warningDefault);
		}

		String warningDisabled = (String)attributes.get("warningDisabled");

		if (warningDisabled != null) {
			setWarningDisabled(warningDisabled);
		}
	}

	/**
	 * Returns the colors ID of this themes.
	 *
	 * @return the colors ID of this themes
	 */
	@Override
	public long getColorsId() {
		return model.getColorsId();
	}

	/**
	 * Returns the error bg of this themes.
	 *
	 * @return the error bg of this themes
	 */
	@Override
	public String getErrorBg() {
		return model.getErrorBg();
	}

	/**
	 * Returns the error dark of this themes.
	 *
	 * @return the error dark of this themes
	 */
	@Override
	public String getErrorDark() {
		return model.getErrorDark();
	}

	/**
	 * Returns the error default of this themes.
	 *
	 * @return the error default of this themes
	 */
	@Override
	public String getErrorDefault() {
		return model.getErrorDefault();
	}

	/**
	 * Returns the error disabled of this themes.
	 *
	 * @return the error disabled of this themes
	 */
	@Override
	public String getErrorDisabled() {
		return model.getErrorDisabled();
	}

	/**
	 * Returns the error light of this themes.
	 *
	 * @return the error light of this themes
	 */
	@Override
	public String getErrorLight() {
		return model.getErrorLight();
	}

	/**
	 * Returns the neutral black of this themes.
	 *
	 * @return the neutral black of this themes
	 */
	@Override
	public String getNeutralBlack() {
		return model.getNeutralBlack();
	}

	/**
	 * Returns the neutral gray1 of this themes.
	 *
	 * @return the neutral gray1 of this themes
	 */
	@Override
	public String getNeutralGray1() {
		return model.getNeutralGray1();
	}

	/**
	 * Returns the neutral white of this themes.
	 *
	 * @return the neutral white of this themes
	 */
	@Override
	public String getNeutralWhite() {
		return model.getNeutralWhite();
	}

	/**
	 * Returns the primary bg of this themes.
	 *
	 * @return the primary bg of this themes
	 */
	@Override
	public String getPrimaryBg() {
		return model.getPrimaryBg();
	}

	/**
	 * Returns the primary dark of this themes.
	 *
	 * @return the primary dark of this themes
	 */
	@Override
	public String getPrimaryDark() {
		return model.getPrimaryDark();
	}

	/**
	 * Returns the primary default of this themes.
	 *
	 * @return the primary default of this themes
	 */
	@Override
	public String getPrimaryDefault() {
		return model.getPrimaryDefault();
	}

	/**
	 * Returns the primary disabled of this themes.
	 *
	 * @return the primary disabled of this themes
	 */
	@Override
	public String getPrimaryDisabled() {
		return model.getPrimaryDisabled();
	}

	/**
	 * Returns the primary key of this themes.
	 *
	 * @return the primary key of this themes
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the primary light of this themes.
	 *
	 * @return the primary light of this themes
	 */
	@Override
	public String getPrimaryLight() {
		return model.getPrimaryLight();
	}

	/**
	 * Returns the secondary bg of this themes.
	 *
	 * @return the secondary bg of this themes
	 */
	@Override
	public String getSecondaryBg() {
		return model.getSecondaryBg();
	}

	/**
	 * Returns the secondary dark of this themes.
	 *
	 * @return the secondary dark of this themes
	 */
	@Override
	public String getSecondaryDark() {
		return model.getSecondaryDark();
	}

	/**
	 * Returns the secondary default of this themes.
	 *
	 * @return the secondary default of this themes
	 */
	@Override
	public String getSecondaryDefault() {
		return model.getSecondaryDefault();
	}

	/**
	 * Returns the secondary disabled of this themes.
	 *
	 * @return the secondary disabled of this themes
	 */
	@Override
	public String getSecondaryDisabled() {
		return model.getSecondaryDisabled();
	}

	/**
	 * Returns the secondary light of this themes.
	 *
	 * @return the secondary light of this themes
	 */
	@Override
	public String getSecondaryLight() {
		return model.getSecondaryLight();
	}

	/**
	 * Returns the success bg of this themes.
	 *
	 * @return the success bg of this themes
	 */
	@Override
	public String getSuccessBg() {
		return model.getSuccessBg();
	}

	/**
	 * Returns the success dark of this themes.
	 *
	 * @return the success dark of this themes
	 */
	@Override
	public String getSuccessDark() {
		return model.getSuccessDark();
	}

	/**
	 * Returns the success default of this themes.
	 *
	 * @return the success default of this themes
	 */
	@Override
	public String getSuccessDefault() {
		return model.getSuccessDefault();
	}

	/**
	 * Returns the success disabled of this themes.
	 *
	 * @return the success disabled of this themes
	 */
	@Override
	public String getSuccessDisabled() {
		return model.getSuccessDisabled();
	}

	/**
	 * Returns the success light of this themes.
	 *
	 * @return the success light of this themes
	 */
	@Override
	public String getSuccessLight() {
		return model.getSuccessLight();
	}

	/**
	 * Returns the user ID of this themes.
	 *
	 * @return the user ID of this themes
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user uuid of this themes.
	 *
	 * @return the user uuid of this themes
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this themes.
	 *
	 * @return the uuid of this themes
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the warning bg of this themes.
	 *
	 * @return the warning bg of this themes
	 */
	@Override
	public String getWarningBg() {
		return model.getWarningBg();
	}

	/**
	 * Returns the warning dark of this themes.
	 *
	 * @return the warning dark of this themes
	 */
	@Override
	public String getWarningDark() {
		return model.getWarningDark();
	}

	/**
	 * Returns the warning default of this themes.
	 *
	 * @return the warning default of this themes
	 */
	@Override
	public String getWarningDefault() {
		return model.getWarningDefault();
	}

	/**
	 * Returns the warning disabled of this themes.
	 *
	 * @return the warning disabled of this themes
	 */
	@Override
	public String getWarningDisabled() {
		return model.getWarningDisabled();
	}

	/**
	 * Returns the warning light of this themes.
	 *
	 * @return the warning light of this themes
	 */
	@Override
	public String getWarningLight() {
		return model.getWarningLight();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the colors ID of this themes.
	 *
	 * @param colorsId the colors ID of this themes
	 */
	@Override
	public void setColorsId(long colorsId) {
		model.setColorsId(colorsId);
	}

	/**
	 * Sets the error bg of this themes.
	 *
	 * @param errorBg the error bg of this themes
	 */
	@Override
	public void setErrorBg(String errorBg) {
		model.setErrorBg(errorBg);
	}

	/**
	 * Sets the error dark of this themes.
	 *
	 * @param errorDark the error dark of this themes
	 */
	@Override
	public void setErrorDark(String errorDark) {
		model.setErrorDark(errorDark);
	}

	/**
	 * Sets the error default of this themes.
	 *
	 * @param errorDefault the error default of this themes
	 */
	@Override
	public void setErrorDefault(String errorDefault) {
		model.setErrorDefault(errorDefault);
	}

	/**
	 * Sets the error disabled of this themes.
	 *
	 * @param errorDisabled the error disabled of this themes
	 */
	@Override
	public void setErrorDisabled(String errorDisabled) {
		model.setErrorDisabled(errorDisabled);
	}

	/**
	 * Sets the error light of this themes.
	 *
	 * @param errorLight the error light of this themes
	 */
	@Override
	public void setErrorLight(String errorLight) {
		model.setErrorLight(errorLight);
	}

	/**
	 * Sets the neutral black of this themes.
	 *
	 * @param neutralBlack the neutral black of this themes
	 */
	@Override
	public void setNeutralBlack(String neutralBlack) {
		model.setNeutralBlack(neutralBlack);
	}

	/**
	 * Sets the neutral gray1 of this themes.
	 *
	 * @param neutralGray1 the neutral gray1 of this themes
	 */
	@Override
	public void setNeutralGray1(String neutralGray1) {
		model.setNeutralGray1(neutralGray1);
	}

	/**
	 * Sets the neutral white of this themes.
	 *
	 * @param neutralWhite the neutral white of this themes
	 */
	@Override
	public void setNeutralWhite(String neutralWhite) {
		model.setNeutralWhite(neutralWhite);
	}

	/**
	 * Sets the primary bg of this themes.
	 *
	 * @param primaryBg the primary bg of this themes
	 */
	@Override
	public void setPrimaryBg(String primaryBg) {
		model.setPrimaryBg(primaryBg);
	}

	/**
	 * Sets the primary dark of this themes.
	 *
	 * @param primaryDark the primary dark of this themes
	 */
	@Override
	public void setPrimaryDark(String primaryDark) {
		model.setPrimaryDark(primaryDark);
	}

	/**
	 * Sets the primary default of this themes.
	 *
	 * @param primaryDefault the primary default of this themes
	 */
	@Override
	public void setPrimaryDefault(String primaryDefault) {
		model.setPrimaryDefault(primaryDefault);
	}

	/**
	 * Sets the primary disabled of this themes.
	 *
	 * @param primaryDisabled the primary disabled of this themes
	 */
	@Override
	public void setPrimaryDisabled(String primaryDisabled) {
		model.setPrimaryDisabled(primaryDisabled);
	}

	/**
	 * Sets the primary key of this themes.
	 *
	 * @param primaryKey the primary key of this themes
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the primary light of this themes.
	 *
	 * @param primaryLight the primary light of this themes
	 */
	@Override
	public void setPrimaryLight(String primaryLight) {
		model.setPrimaryLight(primaryLight);
	}

	/**
	 * Sets the secondary bg of this themes.
	 *
	 * @param secondaryBg the secondary bg of this themes
	 */
	@Override
	public void setSecondaryBg(String secondaryBg) {
		model.setSecondaryBg(secondaryBg);
	}

	/**
	 * Sets the secondary dark of this themes.
	 *
	 * @param secondaryDark the secondary dark of this themes
	 */
	@Override
	public void setSecondaryDark(String secondaryDark) {
		model.setSecondaryDark(secondaryDark);
	}

	/**
	 * Sets the secondary default of this themes.
	 *
	 * @param secondaryDefault the secondary default of this themes
	 */
	@Override
	public void setSecondaryDefault(String secondaryDefault) {
		model.setSecondaryDefault(secondaryDefault);
	}

	/**
	 * Sets the secondary disabled of this themes.
	 *
	 * @param secondaryDisabled the secondary disabled of this themes
	 */
	@Override
	public void setSecondaryDisabled(String secondaryDisabled) {
		model.setSecondaryDisabled(secondaryDisabled);
	}

	/**
	 * Sets the secondary light of this themes.
	 *
	 * @param secondaryLight the secondary light of this themes
	 */
	@Override
	public void setSecondaryLight(String secondaryLight) {
		model.setSecondaryLight(secondaryLight);
	}

	/**
	 * Sets the success bg of this themes.
	 *
	 * @param successBg the success bg of this themes
	 */
	@Override
	public void setSuccessBg(String successBg) {
		model.setSuccessBg(successBg);
	}

	/**
	 * Sets the success dark of this themes.
	 *
	 * @param successDark the success dark of this themes
	 */
	@Override
	public void setSuccessDark(String successDark) {
		model.setSuccessDark(successDark);
	}

	/**
	 * Sets the success default of this themes.
	 *
	 * @param successDefault the success default of this themes
	 */
	@Override
	public void setSuccessDefault(String successDefault) {
		model.setSuccessDefault(successDefault);
	}

	/**
	 * Sets the success disabled of this themes.
	 *
	 * @param successDisabled the success disabled of this themes
	 */
	@Override
	public void setSuccessDisabled(String successDisabled) {
		model.setSuccessDisabled(successDisabled);
	}

	/**
	 * Sets the success light of this themes.
	 *
	 * @param successLight the success light of this themes
	 */
	@Override
	public void setSuccessLight(String successLight) {
		model.setSuccessLight(successLight);
	}

	/**
	 * Sets the user ID of this themes.
	 *
	 * @param userId the user ID of this themes
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user uuid of this themes.
	 *
	 * @param userUuid the user uuid of this themes
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this themes.
	 *
	 * @param uuid the uuid of this themes
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the warning bg of this themes.
	 *
	 * @param warningBg the warning bg of this themes
	 */
	@Override
	public void setWarningBg(String warningBg) {
		model.setWarningBg(warningBg);
	}

	/**
	 * Sets the warning dark of this themes.
	 *
	 * @param warningDark the warning dark of this themes
	 */
	@Override
	public void setWarningDark(String warningDark) {
		model.setWarningDark(warningDark);
	}

	/**
	 * Sets the warning default of this themes.
	 *
	 * @param warningDefault the warning default of this themes
	 */
	@Override
	public void setWarningDefault(String warningDefault) {
		model.setWarningDefault(warningDefault);
	}

	/**
	 * Sets the warning disabled of this themes.
	 *
	 * @param warningDisabled the warning disabled of this themes
	 */
	@Override
	public void setWarningDisabled(String warningDisabled) {
		model.setWarningDisabled(warningDisabled);
	}

	/**
	 * Sets the warning light of this themes.
	 *
	 * @param warningLight the warning light of this themes
	 */
	@Override
	public void setWarningLight(String warningLight) {
		model.setWarningLight(warningLight);
	}

	@Override
	protected ThemesWrapper wrap(Themes themes) {
		return new ThemesWrapper(themes);
	}

}