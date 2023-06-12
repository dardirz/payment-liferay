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

package com.payment.theme.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ThemesService}.
 *
 * @author Brian Wing Shun Chan
 * @see ThemesService
 * @generated
 */
public class ThemesServiceWrapper
	implements ServiceWrapper<ThemesService>, ThemesService {

	public ThemesServiceWrapper(ThemesService themesService) {
		_themesService = themesService;
	}

	@Override
	public com.payment.theme.model.Themes createColors() {
		return _themesService.createColors();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _themesService.getOSGiServiceIdentifier();
	}

	@Override
	public ThemesService getWrappedService() {
		return _themesService;
	}

	@Override
	public void setWrappedService(ThemesService themesService) {
		_themesService = themesService;
	}

	private ThemesService _themesService;

}