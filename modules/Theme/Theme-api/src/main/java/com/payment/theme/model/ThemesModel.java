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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Themes service. Represents a row in the &quot;THEMES_Themes&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.payment.theme.model.impl.ThemesModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.payment.theme.model.impl.ThemesImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Themes
 * @generated
 */
@ProviderType
public interface ThemesModel extends BaseModel<Themes> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a themes model instance should use the {@link Themes} interface instead.
	 */

	/**
	 * Returns the primary key of this themes.
	 *
	 * @return the primary key of this themes
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this themes.
	 *
	 * @param primaryKey the primary key of this themes
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this themes.
	 *
	 * @return the uuid of this themes
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this themes.
	 *
	 * @param uuid the uuid of this themes
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the colors ID of this themes.
	 *
	 * @return the colors ID of this themes
	 */
	public long getColorsId();

	/**
	 * Sets the colors ID of this themes.
	 *
	 * @param colorsId the colors ID of this themes
	 */
	public void setColorsId(long colorsId);

	/**
	 * Returns the user ID of this themes.
	 *
	 * @return the user ID of this themes
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this themes.
	 *
	 * @param userId the user ID of this themes
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this themes.
	 *
	 * @return the user uuid of this themes
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this themes.
	 *
	 * @param userUuid the user uuid of this themes
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the neutral black of this themes.
	 *
	 * @return the neutral black of this themes
	 */
	@AutoEscape
	public String getNeutralBlack();

	/**
	 * Sets the neutral black of this themes.
	 *
	 * @param neutralBlack the neutral black of this themes
	 */
	public void setNeutralBlack(String neutralBlack);

	/**
	 * Returns the neutral white of this themes.
	 *
	 * @return the neutral white of this themes
	 */
	@AutoEscape
	public String getNeutralWhite();

	/**
	 * Sets the neutral white of this themes.
	 *
	 * @param neutralWhite the neutral white of this themes
	 */
	public void setNeutralWhite(String neutralWhite);

	/**
	 * Returns the neutral gray1 of this themes.
	 *
	 * @return the neutral gray1 of this themes
	 */
	@AutoEscape
	public String getNeutralGray1();

	/**
	 * Sets the neutral gray1 of this themes.
	 *
	 * @param neutralGray1 the neutral gray1 of this themes
	 */
	public void setNeutralGray1(String neutralGray1);

	/**
	 * Returns the primary bg of this themes.
	 *
	 * @return the primary bg of this themes
	 */
	@AutoEscape
	public String getPrimaryBg();

	/**
	 * Sets the primary bg of this themes.
	 *
	 * @param primaryBg the primary bg of this themes
	 */
	public void setPrimaryBg(String primaryBg);

	/**
	 * Returns the primary light of this themes.
	 *
	 * @return the primary light of this themes
	 */
	@AutoEscape
	public String getPrimaryLight();

	/**
	 * Sets the primary light of this themes.
	 *
	 * @param primaryLight the primary light of this themes
	 */
	public void setPrimaryLight(String primaryLight);

	/**
	 * Returns the primary dark of this themes.
	 *
	 * @return the primary dark of this themes
	 */
	@AutoEscape
	public String getPrimaryDark();

	/**
	 * Sets the primary dark of this themes.
	 *
	 * @param primaryDark the primary dark of this themes
	 */
	public void setPrimaryDark(String primaryDark);

	/**
	 * Returns the primary default of this themes.
	 *
	 * @return the primary default of this themes
	 */
	@AutoEscape
	public String getPrimaryDefault();

	/**
	 * Sets the primary default of this themes.
	 *
	 * @param primaryDefault the primary default of this themes
	 */
	public void setPrimaryDefault(String primaryDefault);

	/**
	 * Returns the primary disabled of this themes.
	 *
	 * @return the primary disabled of this themes
	 */
	@AutoEscape
	public String getPrimaryDisabled();

	/**
	 * Sets the primary disabled of this themes.
	 *
	 * @param primaryDisabled the primary disabled of this themes
	 */
	public void setPrimaryDisabled(String primaryDisabled);

	/**
	 * Returns the secondary bg of this themes.
	 *
	 * @return the secondary bg of this themes
	 */
	@AutoEscape
	public String getSecondaryBg();

	/**
	 * Sets the secondary bg of this themes.
	 *
	 * @param secondaryBg the secondary bg of this themes
	 */
	public void setSecondaryBg(String secondaryBg);

	/**
	 * Returns the secondary light of this themes.
	 *
	 * @return the secondary light of this themes
	 */
	@AutoEscape
	public String getSecondaryLight();

	/**
	 * Sets the secondary light of this themes.
	 *
	 * @param secondaryLight the secondary light of this themes
	 */
	public void setSecondaryLight(String secondaryLight);

	/**
	 * Returns the secondary dark of this themes.
	 *
	 * @return the secondary dark of this themes
	 */
	@AutoEscape
	public String getSecondaryDark();

	/**
	 * Sets the secondary dark of this themes.
	 *
	 * @param secondaryDark the secondary dark of this themes
	 */
	public void setSecondaryDark(String secondaryDark);

	/**
	 * Returns the secondary default of this themes.
	 *
	 * @return the secondary default of this themes
	 */
	@AutoEscape
	public String getSecondaryDefault();

	/**
	 * Sets the secondary default of this themes.
	 *
	 * @param secondaryDefault the secondary default of this themes
	 */
	public void setSecondaryDefault(String secondaryDefault);

	/**
	 * Returns the secondary disabled of this themes.
	 *
	 * @return the secondary disabled of this themes
	 */
	@AutoEscape
	public String getSecondaryDisabled();

	/**
	 * Sets the secondary disabled of this themes.
	 *
	 * @param secondaryDisabled the secondary disabled of this themes
	 */
	public void setSecondaryDisabled(String secondaryDisabled);

	/**
	 * Returns the success bg of this themes.
	 *
	 * @return the success bg of this themes
	 */
	@AutoEscape
	public String getSuccessBg();

	/**
	 * Sets the success bg of this themes.
	 *
	 * @param successBg the success bg of this themes
	 */
	public void setSuccessBg(String successBg);

	/**
	 * Returns the success light of this themes.
	 *
	 * @return the success light of this themes
	 */
	@AutoEscape
	public String getSuccessLight();

	/**
	 * Sets the success light of this themes.
	 *
	 * @param successLight the success light of this themes
	 */
	public void setSuccessLight(String successLight);

	/**
	 * Returns the success dark of this themes.
	 *
	 * @return the success dark of this themes
	 */
	@AutoEscape
	public String getSuccessDark();

	/**
	 * Sets the success dark of this themes.
	 *
	 * @param successDark the success dark of this themes
	 */
	public void setSuccessDark(String successDark);

	/**
	 * Returns the success default of this themes.
	 *
	 * @return the success default of this themes
	 */
	@AutoEscape
	public String getSuccessDefault();

	/**
	 * Sets the success default of this themes.
	 *
	 * @param successDefault the success default of this themes
	 */
	public void setSuccessDefault(String successDefault);

	/**
	 * Returns the success disabled of this themes.
	 *
	 * @return the success disabled of this themes
	 */
	@AutoEscape
	public String getSuccessDisabled();

	/**
	 * Sets the success disabled of this themes.
	 *
	 * @param successDisabled the success disabled of this themes
	 */
	public void setSuccessDisabled(String successDisabled);

	/**
	 * Returns the error bg of this themes.
	 *
	 * @return the error bg of this themes
	 */
	@AutoEscape
	public String getErrorBg();

	/**
	 * Sets the error bg of this themes.
	 *
	 * @param errorBg the error bg of this themes
	 */
	public void setErrorBg(String errorBg);

	/**
	 * Returns the error light of this themes.
	 *
	 * @return the error light of this themes
	 */
	@AutoEscape
	public String getErrorLight();

	/**
	 * Sets the error light of this themes.
	 *
	 * @param errorLight the error light of this themes
	 */
	public void setErrorLight(String errorLight);

	/**
	 * Returns the error dark of this themes.
	 *
	 * @return the error dark of this themes
	 */
	@AutoEscape
	public String getErrorDark();

	/**
	 * Sets the error dark of this themes.
	 *
	 * @param errorDark the error dark of this themes
	 */
	public void setErrorDark(String errorDark);

	/**
	 * Returns the error default of this themes.
	 *
	 * @return the error default of this themes
	 */
	@AutoEscape
	public String getErrorDefault();

	/**
	 * Sets the error default of this themes.
	 *
	 * @param errorDefault the error default of this themes
	 */
	public void setErrorDefault(String errorDefault);

	/**
	 * Returns the error disabled of this themes.
	 *
	 * @return the error disabled of this themes
	 */
	@AutoEscape
	public String getErrorDisabled();

	/**
	 * Sets the error disabled of this themes.
	 *
	 * @param errorDisabled the error disabled of this themes
	 */
	public void setErrorDisabled(String errorDisabled);

	/**
	 * Returns the warning bg of this themes.
	 *
	 * @return the warning bg of this themes
	 */
	@AutoEscape
	public String getWarningBg();

	/**
	 * Sets the warning bg of this themes.
	 *
	 * @param warningBg the warning bg of this themes
	 */
	public void setWarningBg(String warningBg);

	/**
	 * Returns the warning light of this themes.
	 *
	 * @return the warning light of this themes
	 */
	@AutoEscape
	public String getWarningLight();

	/**
	 * Sets the warning light of this themes.
	 *
	 * @param warningLight the warning light of this themes
	 */
	public void setWarningLight(String warningLight);

	/**
	 * Returns the warning dark of this themes.
	 *
	 * @return the warning dark of this themes
	 */
	@AutoEscape
	public String getWarningDark();

	/**
	 * Sets the warning dark of this themes.
	 *
	 * @param warningDark the warning dark of this themes
	 */
	public void setWarningDark(String warningDark);

	/**
	 * Returns the warning default of this themes.
	 *
	 * @return the warning default of this themes
	 */
	@AutoEscape
	public String getWarningDefault();

	/**
	 * Sets the warning default of this themes.
	 *
	 * @param warningDefault the warning default of this themes
	 */
	public void setWarningDefault(String warningDefault);

	/**
	 * Returns the warning disabled of this themes.
	 *
	 * @return the warning disabled of this themes
	 */
	@AutoEscape
	public String getWarningDisabled();

	/**
	 * Sets the warning disabled of this themes.
	 *
	 * @param warningDisabled the warning disabled of this themes
	 */
	public void setWarningDisabled(String warningDisabled);

}