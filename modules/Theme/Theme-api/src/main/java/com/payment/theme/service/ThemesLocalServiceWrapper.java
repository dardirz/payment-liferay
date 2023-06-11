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
 * Provides a wrapper for {@link ThemesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ThemesLocalService
 * @generated
 */
public abstract class ThemesLocalServiceWrapper
	implements ServiceWrapper<ThemesLocalService>, ThemesLocalService {

	public ThemesLocalServiceWrapper(ThemesLocalService themesLocalService) {
		_themesLocalService = themesLocalService;
	}

	@Override
	public ThemesLocalService getWrappedService() {
		return _themesLocalService;
	}

	@Override
	public void setWrappedService(ThemesLocalService themesLocalService) {
		_themesLocalService = themesLocalService;
	}

	private ThemesLocalService _themesLocalService;

}