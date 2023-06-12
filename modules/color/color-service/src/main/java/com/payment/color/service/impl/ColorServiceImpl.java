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

package com.payment.color.service.impl;

import com.liferay.portal.aop.AopService;
import com.payment.color.colorobjects.MainColor;
import com.payment.color.service.ColorLocalServiceUtil;
import com.payment.color.service.base.ColorServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the color remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.payment.color.service.ColorService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ColorServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=colors",
		"json.web.service.context.path=Color"
	},
	service = AopService.class
)
public class ColorServiceImpl extends ColorServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.payment.color.service.ColorServiceUtil</code> to access the color remote service.
	 */
	
	public MainColor adaptColors() {
		
		return ColorLocalServiceUtil.adaptColors();
	}
	
}