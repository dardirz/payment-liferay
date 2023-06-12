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

package com.payment.color.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.payment.color.service.http.ColorServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class ColorSoap implements Serializable {

	public static ColorSoap toSoapModel(Color model) {
		ColorSoap soapModel = new ColorSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setColorId(model.getColorId());

		return soapModel;
	}

	public static ColorSoap[] toSoapModels(Color[] models) {
		ColorSoap[] soapModels = new ColorSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ColorSoap[][] toSoapModels(Color[][] models) {
		ColorSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ColorSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ColorSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ColorSoap[] toSoapModels(List<Color> models) {
		List<ColorSoap> soapModels = new ArrayList<ColorSoap>(models.size());

		for (Color model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ColorSoap[soapModels.size()]);
	}

	public ColorSoap() {
	}

	public long getPrimaryKey() {
		return _colorId;
	}

	public void setPrimaryKey(long pk) {
		setColorId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getColorId() {
		return _colorId;
	}

	public void setColorId(long colorId) {
		_colorId = colorId;
	}

	private String _uuid;
	private long _colorId;

}