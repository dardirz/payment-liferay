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
	 * Adds the color to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ColorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param color the color
	 * @return the color that was added
	 */
	@Override
	public com.payment.color.model.Color addColor(
		com.payment.color.model.Color color) {

		return _colorLocalService.addColor(color);
	}

	/**
	 * Creates a new color with the primary key. Does not add the color to the database.
	 *
	 * @param colorId the primary key for the new color
	 * @return the new color
	 */
	@Override
	public com.payment.color.model.Color createColor(long colorId) {
		return _colorLocalService.createColor(colorId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _colorLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the color from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ColorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param color the color
	 * @return the color that was removed
	 */
	@Override
	public com.payment.color.model.Color deleteColor(
		com.payment.color.model.Color color) {

		return _colorLocalService.deleteColor(color);
	}

	/**
	 * Deletes the color with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ColorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param colorId the primary key of the color
	 * @return the color that was removed
	 * @throws PortalException if a color with the primary key could not be found
	 */
	@Override
	public com.payment.color.model.Color deleteColor(long colorId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _colorLocalService.deleteColor(colorId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _colorLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _colorLocalService.dynamicQuery();
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

		return _colorLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.payment.color.model.impl.ColorModelImpl</code>.
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

		return _colorLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.payment.color.model.impl.ColorModelImpl</code>.
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

		return _colorLocalService.dynamicQuery(
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

		return _colorLocalService.dynamicQueryCount(dynamicQuery);
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

		return _colorLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.payment.color.model.Color fetchColor(long colorId) {
		return _colorLocalService.fetchColor(colorId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _colorLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the color with the primary key.
	 *
	 * @param colorId the primary key of the color
	 * @return the color
	 * @throws PortalException if a color with the primary key could not be found
	 */
	@Override
	public com.payment.color.model.Color getColor(long colorId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _colorLocalService.getColor(colorId);
	}

	/**
	 * Returns a range of all the colors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.payment.color.model.impl.ColorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of colors
	 * @param end the upper bound of the range of colors (not inclusive)
	 * @return the range of colors
	 */
	@Override
	public java.util.List<com.payment.color.model.Color> getColors(
		int start, int end) {

		return _colorLocalService.getColors(start, end);
	}

	/**
	 * Returns the number of colors.
	 *
	 * @return the number of colors
	 */
	@Override
	public int getColorsCount() {
		return _colorLocalService.getColorsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _colorLocalService.getIndexableActionableDynamicQuery();
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

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _colorLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the color in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ColorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param color the color
	 * @return the color that was updated
	 */
	@Override
	public com.payment.color.model.Color updateColor(
		com.payment.color.model.Color color) {

		return _colorLocalService.updateColor(color);
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