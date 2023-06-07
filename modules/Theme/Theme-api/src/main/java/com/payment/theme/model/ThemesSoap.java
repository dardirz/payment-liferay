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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.payment.theme.service.http.ThemesServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class ThemesSoap implements Serializable {

	public static ThemesSoap toSoapModel(Themes model) {
		ThemesSoap soapModel = new ThemesSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setColorsId(model.getColorsId());
		soapModel.setUserId(model.getUserId());
		soapModel.setNeutralBlack(model.getNeutralBlack());
		soapModel.setNeutralWhite(model.getNeutralWhite());
		soapModel.setNeutralGray1(model.getNeutralGray1());
		soapModel.setPrimaryBg(model.getPrimaryBg());
		soapModel.setPrimaryLight(model.getPrimaryLight());
		soapModel.setPrimaryDark(model.getPrimaryDark());
		soapModel.setPrimaryDefault(model.getPrimaryDefault());
		soapModel.setPrimaryDisabled(model.getPrimaryDisabled());
		soapModel.setSecondaryBg(model.getSecondaryBg());
		soapModel.setSecondaryLight(model.getSecondaryLight());
		soapModel.setSecondaryDark(model.getSecondaryDark());
		soapModel.setSecondaryDefault(model.getSecondaryDefault());
		soapModel.setSecondaryDisabled(model.getSecondaryDisabled());
		soapModel.setSuccessBg(model.getSuccessBg());
		soapModel.setSuccessLight(model.getSuccessLight());
		soapModel.setSuccessDark(model.getSuccessDark());
		soapModel.setSuccessDefault(model.getSuccessDefault());
		soapModel.setSuccessDisabled(model.getSuccessDisabled());
		soapModel.setErrorBg(model.getErrorBg());
		soapModel.setErrorLight(model.getErrorLight());
		soapModel.setErrorDark(model.getErrorDark());
		soapModel.setErrorDefault(model.getErrorDefault());
		soapModel.setErrorDisabled(model.getErrorDisabled());
		soapModel.setWarningBg(model.getWarningBg());
		soapModel.setWarningLight(model.getWarningLight());
		soapModel.setWarningDark(model.getWarningDark());
		soapModel.setWarningDefault(model.getWarningDefault());
		soapModel.setWarningDisabled(model.getWarningDisabled());

		return soapModel;
	}

	public static ThemesSoap[] toSoapModels(Themes[] models) {
		ThemesSoap[] soapModels = new ThemesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ThemesSoap[][] toSoapModels(Themes[][] models) {
		ThemesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ThemesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ThemesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ThemesSoap[] toSoapModels(List<Themes> models) {
		List<ThemesSoap> soapModels = new ArrayList<ThemesSoap>(models.size());

		for (Themes model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ThemesSoap[soapModels.size()]);
	}

	public ThemesSoap() {
	}

	public long getPrimaryKey() {
		return _colorsId;
	}

	public void setPrimaryKey(long pk) {
		setColorsId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getColorsId() {
		return _colorsId;
	}

	public void setColorsId(long colorsId) {
		_colorsId = colorsId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getNeutralBlack() {
		return _neutralBlack;
	}

	public void setNeutralBlack(String neutralBlack) {
		_neutralBlack = neutralBlack;
	}

	public String getNeutralWhite() {
		return _neutralWhite;
	}

	public void setNeutralWhite(String neutralWhite) {
		_neutralWhite = neutralWhite;
	}

	public String getNeutralGray1() {
		return _neutralGray1;
	}

	public void setNeutralGray1(String neutralGray1) {
		_neutralGray1 = neutralGray1;
	}

	public String getPrimaryBg() {
		return _primaryBg;
	}

	public void setPrimaryBg(String primaryBg) {
		_primaryBg = primaryBg;
	}

	public String getPrimaryLight() {
		return _primaryLight;
	}

	public void setPrimaryLight(String primaryLight) {
		_primaryLight = primaryLight;
	}

	public String getPrimaryDark() {
		return _primaryDark;
	}

	public void setPrimaryDark(String primaryDark) {
		_primaryDark = primaryDark;
	}

	public String getPrimaryDefault() {
		return _primaryDefault;
	}

	public void setPrimaryDefault(String primaryDefault) {
		_primaryDefault = primaryDefault;
	}

	public String getPrimaryDisabled() {
		return _primaryDisabled;
	}

	public void setPrimaryDisabled(String primaryDisabled) {
		_primaryDisabled = primaryDisabled;
	}

	public String getSecondaryBg() {
		return _secondaryBg;
	}

	public void setSecondaryBg(String secondaryBg) {
		_secondaryBg = secondaryBg;
	}

	public String getSecondaryLight() {
		return _secondaryLight;
	}

	public void setSecondaryLight(String secondaryLight) {
		_secondaryLight = secondaryLight;
	}

	public String getSecondaryDark() {
		return _secondaryDark;
	}

	public void setSecondaryDark(String secondaryDark) {
		_secondaryDark = secondaryDark;
	}

	public String getSecondaryDefault() {
		return _secondaryDefault;
	}

	public void setSecondaryDefault(String secondaryDefault) {
		_secondaryDefault = secondaryDefault;
	}

	public String getSecondaryDisabled() {
		return _secondaryDisabled;
	}

	public void setSecondaryDisabled(String secondaryDisabled) {
		_secondaryDisabled = secondaryDisabled;
	}

	public String getSuccessBg() {
		return _successBg;
	}

	public void setSuccessBg(String successBg) {
		_successBg = successBg;
	}

	public String getSuccessLight() {
		return _successLight;
	}

	public void setSuccessLight(String successLight) {
		_successLight = successLight;
	}

	public String getSuccessDark() {
		return _successDark;
	}

	public void setSuccessDark(String successDark) {
		_successDark = successDark;
	}

	public String getSuccessDefault() {
		return _successDefault;
	}

	public void setSuccessDefault(String successDefault) {
		_successDefault = successDefault;
	}

	public String getSuccessDisabled() {
		return _successDisabled;
	}

	public void setSuccessDisabled(String successDisabled) {
		_successDisabled = successDisabled;
	}

	public String getErrorBg() {
		return _errorBg;
	}

	public void setErrorBg(String errorBg) {
		_errorBg = errorBg;
	}

	public String getErrorLight() {
		return _errorLight;
	}

	public void setErrorLight(String errorLight) {
		_errorLight = errorLight;
	}

	public String getErrorDark() {
		return _errorDark;
	}

	public void setErrorDark(String errorDark) {
		_errorDark = errorDark;
	}

	public String getErrorDefault() {
		return _errorDefault;
	}

	public void setErrorDefault(String errorDefault) {
		_errorDefault = errorDefault;
	}

	public String getErrorDisabled() {
		return _errorDisabled;
	}

	public void setErrorDisabled(String errorDisabled) {
		_errorDisabled = errorDisabled;
	}

	public String getWarningBg() {
		return _warningBg;
	}

	public void setWarningBg(String warningBg) {
		_warningBg = warningBg;
	}

	public String getWarningLight() {
		return _warningLight;
	}

	public void setWarningLight(String warningLight) {
		_warningLight = warningLight;
	}

	public String getWarningDark() {
		return _warningDark;
	}

	public void setWarningDark(String warningDark) {
		_warningDark = warningDark;
	}

	public String getWarningDefault() {
		return _warningDefault;
	}

	public void setWarningDefault(String warningDefault) {
		_warningDefault = warningDefault;
	}

	public String getWarningDisabled() {
		return _warningDisabled;
	}

	public void setWarningDisabled(String warningDisabled) {
		_warningDisabled = warningDisabled;
	}

	private String _uuid;
	private long _colorsId;
	private long _userId;
	private String _neutralBlack;
	private String _neutralWhite;
	private String _neutralGray1;
	private String _primaryBg;
	private String _primaryLight;
	private String _primaryDark;
	private String _primaryDefault;
	private String _primaryDisabled;
	private String _secondaryBg;
	private String _secondaryLight;
	private String _secondaryDark;
	private String _secondaryDefault;
	private String _secondaryDisabled;
	private String _successBg;
	private String _successLight;
	private String _successDark;
	private String _successDefault;
	private String _successDisabled;
	private String _errorBg;
	private String _errorLight;
	private String _errorDark;
	private String _errorDefault;
	private String _errorDisabled;
	private String _warningBg;
	private String _warningLight;
	private String _warningDark;
	private String _warningDefault;
	private String _warningDisabled;

}