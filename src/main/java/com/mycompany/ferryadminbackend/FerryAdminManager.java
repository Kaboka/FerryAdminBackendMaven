/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ferryadminbackend;

import dk.cphbusiness.entities.Ferry;
import ferry.contract.AdminContract;
import ferry.dto.FerryDetail;
import ferry.dto.FerryIdentifier;
import ferry.dto.RouteDetail;
import ferry.dto.ScheduleDetail;
import ferry.dto.ScheduleIdentifier;
import ferry.eto.DataAccessException;
import ferry.eto.NoSuchFerryException;
import ferry.eto.NoSuchHarbourException;
import ferry.eto.NoSuchScheduleException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author martin
 */
@Stateless
public class FerryAdminManager implements AdminContract{
 //   @PersistenceContext(name="FerryAdminBackendPU")
    private EntityManager em;
    
    
    public void setEntityManager(EntityManager manager){
        this.em = manager;
    }
    
    public FerryAdminManager() {
    
    }

    public void businessMethod() {
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void delayFerry(FerryIdentifier fi, Date date, int i, int i1) throws NoSuchFerryException, DataAccessException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<FerryDetail> showFerries() throws DataAccessException {
        List<Ferry> ferries = (List<Ferry>)em.createNamedQuery("Ferry.findAll").getResultList();
        Collection<FerryDetail> ferries2 = new ArrayList<>();
        ferries2.add(new FerryDetail(1,"test",null));
        return ferries2;
    }

    @Override
    public void addSchedule(ScheduleDetail sd) throws DataAccessException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<ScheduleDetail> showSchedules() throws NoSuchScheduleException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<ScheduleDetail> showSchedulesForDate(Date date) throws NoSuchScheduleException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<RouteDetail> showRoutes() throws NoSuchHarbourException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void assignFerryToSchedule(FerryIdentifier fi, ScheduleIdentifier si) throws DataAccessException, NoSuchFerryException, NoSuchScheduleException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
