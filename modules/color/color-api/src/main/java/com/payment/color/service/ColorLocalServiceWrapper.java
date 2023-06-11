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
 * Provides a wrapper for {@link ColorLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ColorLocalService
 * @generated
 */
public class ColorLocalServiceWrapper
	implements ColorLocalService, ServiceWrapper<ColorLocalService> {

	public ColorLocalServiceWrapper(ColorLocalService colorLocalService) {
		_colorLocalService = colorLocalService;
	}

	@Override
	public com.payment.color.colorobjects.MainColor adaptColors() {
		return _colorLocalService.adaptColors();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _colorLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public ColorLocalService getWrappedService() {
		return _colorLocalService;
	}

	@Override
	public void setWrappedService(ColorLocalService colorLocalService) {
		_colorLocalService = colorLocalService;
	}

	private ColorLocalService _colorLocalService;

}