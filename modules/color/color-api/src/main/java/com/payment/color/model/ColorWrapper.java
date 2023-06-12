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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Color}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Color
 * @generated
 */
public class ColorWrapper
	extends BaseModelWrapper<Color> implements Color, ModelWrapper<Color> {

	public ColorWrapper(Color color) {
		super(color);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("colorId", getColorId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long colorId = (Long)attributes.get("colorId");

		if (colorId != null) {
			setColorId(colorId);
		}
	}

	/**
	 * Returns the color ID of this color.
	 *
	 * @return the color ID of this color
	 */
	@Override
	public long getColorId() {
		return model.getColorId();
	}

	/**
	 * Returns the primary key of this color.
	 *
	 * @return the primary key of this color
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this color.
	 *
	 * @return the uuid of this color
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the color ID of this color.
	 *
	 * @param colorId the color ID of this color
	 */
	@Override
	public void setColorId(long colorId) {
		model.setColorId(colorId);
	}

	/**
	 * Sets the primary key of this color.
	 *
	 * @param primaryKey the primary key of this color
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this color.
	 *
	 * @param uuid the uuid of this color
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected ColorWrapper wrap(Color color) {
		return new ColorWrapper(color);
	}

}