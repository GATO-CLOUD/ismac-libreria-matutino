package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.FacturaDetalle;



@Repository
public class FacturaDetalleDAOImpl implements FacturaDetalleDAO {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	@Transactional
	public List<FacturaDetalle> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("FROM Factura", FacturaDetalle.class).getResultList();
	}

	@Override
	@Transactional
	public FacturaDetalle findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(FacturaDetalle.class, id);
	}

	@Override
	@Transactional
	public void add(FacturaDetalle factura_detalle) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(factura_detalle);
	}

	@Override
	@Transactional
	public void up(FacturaDetalle factura_detalle) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(factura_detalle);
	}
	
	@Override
	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(findOne(id));

	}

	



}
