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

package com.payment.theme.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.payment.theme.model.Themes;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Themes in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ThemesCacheModel implements CacheModel<Themes>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ThemesCacheModel)) {
			return false;
		}

		ThemesCacheModel themesCacheModel = (ThemesCacheModel)object;

		if (colorsId == themesCacheModel.colorsId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, colorsId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(63);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", colorsId=");
		sb.append(colorsId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", neutralBlack=");
		sb.append(neutralBlack);
		sb.append(", neutralWhite=");
		sb.append(neutralWhite);
		sb.append(", neutralGray1=");
		sb.append(neutralGray1);
		sb.append(", primaryBg=");
		sb.append(primaryBg);
		sb.append(", primaryLight=");
		sb.append(primaryLight);
		sb.append(", primaryDark=");
		sb.append(primaryDark);
		sb.append(", primaryDefault=");
		sb.append(primaryDefault);
		sb.append(", primaryDisabled=");
		sb.append(primaryDisabled);
		sb.append(", secondaryBg=");
		sb.append(secondaryBg);
		sb.append(", secondaryLight=");
		sb.append(secondaryLight);
		sb.append(", secondaryDark=");
		sb.append(secondaryDark);
		sb.append(", secondaryDefault=");
		sb.append(secondaryDefault);
		sb.append(", secondaryDisabled=");
		sb.append(secondaryDisabled);
		sb.append(", successBg=");
		sb.append(successBg);
		sb.append(", successLight=");
		sb.append(successLight);
		sb.append(", successDark=");
		sb.append(successDark);
		sb.append(", successDefault=");
		sb.append(successDefault);
		sb.append(", successDisabled=");
		sb.append(successDisabled);
		sb.append(", errorBg=");
		sb.append(errorBg);
		sb.append(", errorLight=");
		sb.append(errorLight);
		sb.append(", errorDark=");
		sb.append(errorDark);
		sb.append(", errorDefault=");
		sb.append(errorDefault);
		sb.append(", errorDisabled=");
		sb.append(errorDisabled);
		sb.append(", warningBg=");
		sb.append(warningBg);
		sb.append(", warningLight=");
		sb.append(warningLight);
		sb.append(", warningDark=");
		sb.append(warningDark);
		sb.append(", warningDefault=");
		sb.append(warningDefault);
		sb.append(", warningDisabled=");
		sb.append(warningDisabled);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Themes toEntityModel() {
		ThemesImpl themesImpl = new ThemesImpl();

		if (uuid == null) {
			themesImpl.setUuid("");
		}
		else {
			themesImpl.setUuid(uuid);
		}

		themesImpl.setColorsId(colorsId);
		themesImpl.setUserId(userId);

		if (neutralBlack == null) {
			themesImpl.setNeutralBlack("");
		}
		else {
			themesImpl.setNeutralBlack(neutralBlack);
		}

		if (neutralWhite == null) {
			themesImpl.setNeutralWhite("");
		}
		else {
			themesImpl.setNeutralWhite(neutralWhite);
		}

		if (neutralGray1 == null) {
			themesImpl.setNeutralGray1("");
		}
		else {
			themesImpl.setNeutralGray1(neutralGray1);
		}

		if (primaryBg == null) {
			themesImpl.setPrimaryBg("");
		}
		else {
			themesImpl.setPrimaryBg(primaryBg);
		}

		if (primaryLight == null) {
			themesImpl.setPrimaryLight("");
		}
		else {
			themesImpl.setPrimaryLight(primaryLight);
		}

		if (primaryDark == null) {
			themesImpl.setPrimaryDark("");
		}
		else {
			themesImpl.setPrimaryDark(primaryDark);
		}

		if (primaryDefault == null) {
			themesImpl.setPrimaryDefault("");
		}
		else {
			themesImpl.setPrimaryDefault(primaryDefault);
		}

		if (primaryDisabled == null) {
			themesImpl.setPrimaryDisabled("");
		}
		else {
			themesImpl.setPrimaryDisabled(primaryDisabled);
		}

		if (secondaryBg == null) {
			themesImpl.setSecondaryBg("");
		}
		else {
			themesImpl.setSecondaryBg(secondaryBg);
		}

		if (secondaryLight == null) {
			themesImpl.setSecondaryLight("");
		}
		else {
			themesImpl.setSecondaryLight(secondaryLight);
		}

		if (secondaryDark == null) {
			themesImpl.setSecondaryDark("");
		}
		else {
			themesImpl.setSecondaryDark(secondaryDark);
		}

		if (secondaryDefault == null) {
			themesImpl.setSecondaryDefault("");
		}
		else {
			themesImpl.setSecondaryDefault(secondaryDefault);
		}

		if (secondaryDisabled == null) {
			themesImpl.setSecondaryDisabled("");
		}
		else {
			themesImpl.setSecondaryDisabled(secondaryDisabled);
		}

		if (successBg == null) {
			themesImpl.setSuccessBg("");
		}
		else {
			themesImpl.setSuccessBg(successBg);
		}

		if (successLight == null) {
			themesImpl.setSuccessLight("");
		}
		else {
			themesImpl.setSuccessLight(successLight);
		}

		if (successDark == null) {
			themesImpl.setSuccessDark("");
		}
		else {
			themesImpl.setSuccessDark(successDark);
		}

		if (successDefault == null) {
			themesImpl.setSuccessDefault("");
		}
		else {
			themesImpl.setSuccessDefault(successDefault);
		}

		if (successDisabled == null) {
			themesImpl.setSuccessDisabled("");
		}
		else {
			themesImpl.setSuccessDisabled(successDisabled);
		}

		if (errorBg == null) {
			themesImpl.setErrorBg("");
		}
		else {
			themesImpl.setErrorBg(errorBg);
		}

		if (errorLight == null) {
			themesImpl.setErrorLight("");
		}
		else {
			themesImpl.setErrorLight(errorLight);
		}

		if (errorDark == null) {
			themesImpl.setErrorDark("");
		}
		else {
			themesImpl.setErrorDark(errorDark);
		}

		if (errorDefault == null) {
			themesImpl.setErrorDefault("");
		}
		else {
			themesImpl.setErrorDefault(errorDefault);
		}

		if (errorDisabled == null) {
			themesImpl.setErrorDisabled("");
		}
		else {
			themesImpl.setErrorDisabled(errorDisabled);
		}

		if (warningBg == null) {
			themesImpl.setWarningBg("");
		}
		else {
			themesImpl.setWarningBg(warningBg);
		}

		if (warningLight == null) {
			themesImpl.setWarningLight("");
		}
		else {
			themesImpl.setWarningLight(warningLight);
		}

		if (warningDark == null) {
			themesImpl.setWarningDark("");
		}
		else {
			themesImpl.setWarningDark(warningDark);
		}

		if (warningDefault == null) {
			themesImpl.setWarningDefault("");
		}
		else {
			themesImpl.setWarningDefault(warningDefault);
		}

		if (warningDisabled == null) {
			themesImpl.setWarningDisabled("");
		}
		else {
			themesImpl.setWarningDisabled(warningDisabled);
		}

		themesImpl.resetOriginalValues();

		return themesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		colorsId = objectInput.readLong();

		userId = objectInput.readLong();
		neutralBlack = objectInput.readUTF();
		neutralWhite = objectInput.readUTF();
		neutralGray1 = objectInput.readUTF();
		primaryBg = objectInput.readUTF();
		primaryLight = objectInput.readUTF();
		primaryDark = objectInput.readUTF();
		primaryDefault = objectInput.readUTF();
		primaryDisabled = objectInput.readUTF();
		secondaryBg = objectInput.readUTF();
		secondaryLight = objectInput.readUTF();
		secondaryDark = objectInput.readUTF();
		secondaryDefault = objectInput.readUTF();
		secondaryDisabled = objectInput.readUTF();
		successBg = objectInput.readUTF();
		successLight = objectInput.readUTF();
		successDark = objectInput.readUTF();
		successDefault = objectInput.readUTF();
		successDisabled = objectInput.readUTF();
		errorBg = objectInput.readUTF();
		errorLight = objectInput.readUTF();
		errorDark = objectInput.readUTF();
		errorDefault = objectInput.readUTF();
		errorDisabled = objectInput.readUTF();
		warningBg = objectInput.readUTF();
		warningLight = objectInput.readUTF();
		warningDark = objectInput.readUTF();
		warningDefault = objectInput.readUTF();
		warningDisabled = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(colorsId);

		objectOutput.writeLong(userId);

		if (neutralBlack == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(neutralBlack);
		}

		if (neutralWhite == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(neutralWhite);
		}

		if (neutralGray1 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(neutralGray1);
		}

		if (primaryBg == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(primaryBg);
		}

		if (primaryLight == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(primaryLight);
		}

		if (primaryDark == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(primaryDark);
		}

		if (primaryDefault == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(primaryDefault);
		}

		if (primaryDisabled == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(primaryDisabled);
		}

		if (secondaryBg == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secondaryBg);
		}

		if (secondaryLight == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secondaryLight);
		}

		if (secondaryDark == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secondaryDark);
		}

		if (secondaryDefault == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secondaryDefault);
		}

		if (secondaryDisabled == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secondaryDisabled);
		}

		if (successBg == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(successBg);
		}

		if (successLight == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(successLight);
		}

		if (successDark == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(successDark);
		}

		if (successDefault == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(successDefault);
		}

		if (successDisabled == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(successDisabled);
		}

		if (errorBg == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(errorBg);
		}

		if (errorLight == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(errorLight);
		}

		if (errorDark == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(errorDark);
		}

		if (errorDefault == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(errorDefault);
		}

		if (errorDisabled == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(errorDisabled);
		}

		if (warningBg == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(warningBg);
		}

		if (warningLight == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(warningLight);
		}

		if (warningDark == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(warningDark);
		}

		if (warningDefault == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(warningDefault);
		}

		if (warningDisabled == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(warningDisabled);
		}
	}

	public String uuid;
	public long colorsId;
	public long userId;
	public String neutralBlack;
	public String neutralWhite;
	public String neutralGray1;
	public String primaryBg;
	public String primaryLight;
	public String primaryDark;
	public String primaryDefault;
	public String primaryDisabled;
	public String secondaryBg;
	public String secondaryLight;
	public String secondaryDark;
	public String secondaryDefault;
	public String secondaryDisabled;
	public String successBg;
	public String successLight;
	public String successDark;
	public String successDefault;
	public String successDisabled;
	public String errorBg;
	public String errorLight;
	public String errorDark;
	public String errorDefault;
	public String errorDisabled;
	public String warningBg;
	public String warningLight;
	public String warningDark;
	public String warningDefault;
	public String warningDisabled;

}