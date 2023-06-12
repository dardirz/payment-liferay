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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Color service. Represents a row in the &quot;COLORS_Color&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.payment.color.model.impl.ColorModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.payment.color.model.impl.ColorImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Color
 * @generated
 */
@ProviderType
public interface ColorModel extends BaseModel<Color> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a color model instance should use the {@link Color} interface instead.
	 */

	/**
	 * Returns the primary key of this color.
	 *
	 * @return the primary key of this color
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this color.
	 *
	 * @param primaryKey the primary key of this color
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this color.
	 *
	 * @return the uuid of this color
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this color.
	 *
	 * @param uuid the uuid of this color
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the color ID of this color.
	 *
	 * @return the color ID of this color
	 */
	public long getColorId();

	/**
	 * Sets the color ID of this color.
	 *
	 * @param colorId the color ID of this color
	 */
	public void setColorId(long colorId);

}