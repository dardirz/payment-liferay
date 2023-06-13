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
public class ThemesLocalServiceWrapper
	implements ServiceWrapper<ThemesLocalService>, ThemesLocalService {

	public ThemesLocalServiceWrapper(ThemesLocalService themesLocalService) {
		_themesLocalService = themesLocalService;
	}

	@Override
	public com.payment.color.colorobjects.MainColor adaptColors() {
		return _themesLocalService.adaptColors();
	}

	/**
	 * Adds the themes to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ThemesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param themes the themes
	 * @return the themes that was added
	 */
	@Override
	public com.payment.theme.model.Themes addThemes(
		com.payment.theme.model.Themes themes) {

		return _themesLocalService.addThemes(themes);
	}

	@Override
	public com.payment.theme.model.Themes createColors() {
		return _themesLocalService.createColors();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _themesLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new themes with the primary key. Does not add the themes to the database.
	 *
	 * @param colorsId the primary key for the new themes
	 * @return the new themes
	 */
	@Override
	public com.payment.theme.model.Themes createThemes(long colorsId) {
		return _themesLocalService.createThemes(colorsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _themesLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the themes with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ThemesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param colorsId the primary key of the themes
	 * @return the themes that was removed
	 * @throws PortalException if a themes with the primary key could not be found
	 */
	@Override
	public com.payment.theme.model.Themes deleteThemes(long colorsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _themesLocalService.deleteThemes(colorsId);
	}

	/**
	 * Deletes the themes from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ThemesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param themes the themes
	 * @return the themes that was removed
	 */
	@Override
	public com.payment.theme.model.Themes deleteThemes(
		com.payment.theme.model.Themes themes) {

		return _themesLocalService.deleteThemes(themes);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _themesLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _themesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.payment.theme.model.impl.ThemesModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _themesLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.payment.theme.model.impl.ThemesModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _themesLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _themesLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _themesLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.payment.theme.model.Themes fetchThemes(long colorsId) {
		return _themesLocalService.fetchThemes(colorsId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _themesLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _themesLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _themesLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _themesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the themes with the primary key.
	 *
	 * @param colorsId the primary key of the themes
	 * @return the themes
	 * @throws PortalException if a themes with the primary key could not be found
	 */
	@Override
	public com.payment.theme.model.Themes getThemes(long colorsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _themesLocalService.getThemes(colorsId);
	}

	/**
	 * Returns a range of all the themeses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.payment.theme.model.impl.ThemesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of themeses
	 * @param end the upper bound of the range of themeses (not inclusive)
	 * @return the range of themeses
	 */
	@Override
	public java.util.List<com.payment.theme.model.Themes> getThemeses(
		int start, int end) {

		return _themesLocalService.getThemeses(start, end);
	}

	/**
	 * Returns the number of themeses.
	 *
	 * @return the number of themeses
	 */
	@Override
	public int getThemesesCount() {
		return _themesLocalService.getThemesesCount();
	}

	/**
	 * Updates the themes in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ThemesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param themes the themes
	 * @return the themes that was updated
	 */
	@Override
	public com.payment.theme.model.Themes updateThemes(
		com.payment.theme.model.Themes themes) {

		return _themesLocalService.updateThemes(themes);
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