/**
 *  Copyright 2012 Society for Health Information Systems Programmes, India (HISP India)
 *
 *  This file is part of Dms module.
 *
 *  Dms module is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.

 *  Dms module is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Dms module.  If not, see <http://www.gnu.org/licenses/>.
 *
 **/

package com.onlinebanking.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.onlinebanking.dao.OnlinebankingDAO;
import com.onlinebanking.model.Employee;

/**
 * It is a default implementation of {@link OnlinebankingDAO}.
 */
@Repository("onlinebankingDAO")
@Transactional
public class OnlinebankingDAOImpl implements OnlinebankingDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public Employee saveOrUpdateEmployee(Employee employee){
		sessionFactory.getCurrentSession().saveOrUpdate(employee);
		return employee;
	}
}