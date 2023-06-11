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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for Themes. This utility wraps
 * <code>com.payment.theme.service.impl.ThemesServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see ThemesService
 * @generated
 */
public class ThemesServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.payment.theme.service.impl.ThemesServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static ThemesService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ThemesService, ThemesService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ThemesService.class);

		ServiceTracker<ThemesService, ThemesService> serviceTracker =
			new ServiceTracker<ThemesService, ThemesService>(
				bundle.getBundleContext(), ThemesService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}