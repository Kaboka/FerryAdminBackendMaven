/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ferryadminbackend;

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
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author martin
 */
@Stateless
public class NewSessionBean implements AdminContract{

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
        Collection<FerryDetail> ferries = new ArrayList<>();
        ferries.add(new FerryDetail());
        return ferries;
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
