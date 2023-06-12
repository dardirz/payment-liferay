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

package com.payment.color.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.payment.color.model.Color;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Color in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ColorCacheModel implements CacheModel<Color>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ColorCacheModel)) {
			return false;
		}

		ColorCacheModel colorCacheModel = (ColorCacheModel)object;

		if (colorId == colorCacheModel.colorId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, colorId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", colorId=");
		sb.append(colorId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Color toEntityModel() {
		ColorImpl colorImpl = new ColorImpl();

		if (uuid == null) {
			colorImpl.setUuid("");
		}
		else {
			colorImpl.setUuid(uuid);
		}

		colorImpl.setColorId(colorId);

		colorImpl.resetOriginalValues();

		return colorImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		colorId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(colorId);
	}

	public String uuid;
	public long colorId;

}