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

package com.payment.color.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ColorService}.
 *
 * @author Brian Wing Shun Chan
 * @see ColorService
 * @generated
 */
public class ColorServiceWrapper
	implements ColorService, ServiceWrapper<ColorService> {

	public ColorServiceWrapper(ColorService colorService) {
		_colorService = colorService;
	}

	@Override
	public com.payment.color.colorobjects.MainColor adaptColors() {
		return _colorService.adaptColors();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _colorService.getOSGiServiceIdentifier();
	}

	@Override
	public ColorService getWrappedService() {
		return _colorService;
	}

	@Override
	public void setWrappedService(ColorService colorService) {
		_colorService = colorService;
	}

	private ColorService _colorService;

}