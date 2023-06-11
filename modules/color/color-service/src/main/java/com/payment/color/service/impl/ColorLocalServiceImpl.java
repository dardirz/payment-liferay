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
import com.payment.color.colorobjects.ErrorColor;
import com.payment.color.colorobjects.MainColor;
import com.payment.color.colorobjects.NeutralColor;
import com.payment.color.colorobjects.PrimaryColor;
import com.payment.color.colorobjects.SecondaryColor;
import com.payment.color.colorobjects.SuccessColor;
import com.payment.color.colorobjects.WarningColor;
import com.payment.color.service.base.ColorLocalServiceBaseImpl;
import com.payment.theme.model.Themes;
import com.payment.theme.model.impl.ThemesImpl;
import com.payment.theme.service.persistence.impl.ThemesPersistenceImpl;

import java.util.ArrayList;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * The implementation of the color local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.payment.color.service.ColorLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ColorLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.payment.color.model.Color",
	service = AopService.class
)
public class ColorLocalServiceImpl extends ColorLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.payment.color.service.ColorLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.payment.color.service.ColorLocalServiceUtil</code>.
	 */
	public MainColor adaptColors() {
		MainColor colors =new MainColor();
		Themes theme = _themesPersistenceImpl.findAll().get(0);
		
		ErrorColor error = new ErrorColor();
		error.setBg(theme.getErrorBg());
		error.setDark(theme.getErrorDark());
		error.setDefaultPrimary(theme.getErrorDefault());
		error.setDisabled(theme.getErrorDisabled());
		error.setLight(theme.getErrorLight());
		
		NeutralColor neutral = new NeutralColor();
		neutral.setBlack(theme.getNeutralBlack());
		neutral.setGray1(theme.getNeutralGray1());
		neutral.setWhite(theme.getNeutralWhite());
		
		PrimaryColor primary = new PrimaryColor();
		primary.setBg(theme.getPrimaryBg());
		primary.setDark(theme.getPrimaryDark());
		primary.setDefaultPrimary(theme.getPrimaryDefault());
		primary.setDisabled(theme.getPrimaryDisabled());
		primary.setLight(theme.getPrimaryLight());
		
		SecondaryColor secondary = new SecondaryColor();
		secondary.setBg(theme.getSecondaryBg());
		secondary.setDark(theme.getSecondaryDark());
		secondary.setDefaultPrimary(theme.getSecondaryDefault());
		secondary.setDisabled(theme.getSecondaryDisabled());
		secondary.setLight(theme.getSecondaryLight());
		
		SuccessColor success = new SuccessColor();
		success.setBg(theme.getSuccessBg());
		success.setDark(theme.getSuccessDark());
		success.setDefaultPrimary(theme.getSuccessDefault());
		success.setDisabled(theme.getSuccessDisabled());
		success.setLight(theme.getSuccessLight());
		
		WarningColor warning = new WarningColor();
		warning.setBg(theme.getWarningBg());
		warning.setDark(theme.getWarningDark());
		warning.setDefaultPrimary(theme.getWarningDefault());
		warning.setDisabled(theme.getWarningDisabled());
		warning.setLight(theme.getWarningLight());
		
		MainColor main = new MainColor();
		main.setError(error);
		main.setNeutral(neutral);
		main.setPrimary(primary);
		main.setSecondary(secondary);
		main.setSuccess(success);
		main.setWarning(warning);
		
		
		return colors;
		
	}
	
	
	
	
	@Reference
	ThemesPersistenceImpl _themesPersistenceImpl;
	
}