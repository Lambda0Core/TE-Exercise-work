package com.techelevator.projects.dao;

import com.techelevator.projects.model.Timesheet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Time;
import java.time.LocalDate;
import java.util.List;

public class JdbcTimesheetDaoTests extends BaseDaoTests {

    private static final Timesheet TIMESHEET_1 = new Timesheet(1, 1, 1,
            LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet 1");
    private static final Timesheet TIMESHEET_2 = new Timesheet(2, 1, 1,
            LocalDate.parse("2021-01-02"), 1.5, true, "Timesheet 2");
    private static final Timesheet TIMESHEET_3 = new Timesheet(3, 2, 1,
            LocalDate.parse("2021-01-01"), 0.25, true, "Timesheet 3");
    private static final Timesheet TIMESHEET_4 = new Timesheet(4, 2, 2,
            LocalDate.parse("2021-02-01"), 2.0, false, "Timesheet 4");

    private Timesheet timesheetTest;

    private JdbcTimesheetDao dao;

    @Before
    public void setup() {
        dao = new JdbcTimesheetDao(dataSource);
        timesheetTest = new Timesheet(1, 1, 1,
                LocalDate.parse("2000-01-01"), 0.0, false, "Timesheet Test");
    }

    @Test
    public void getTimesheet_returns_correct_timesheet_for_id() {
        dao = new JdbcTimesheetDao(dataSource);
        timesheetTest = new Timesheet(4, 2, 2, LocalDate.parse("2000-01-01"), 2.0, false, "Timesheet Test");
    }

    @Test
    public void getTimesheet_returns_null_when_id_not_found() {
        Timesheet timesheet = dao.getTimesheet(99);
        Assert.assertNull(timesheet);
    }


    @Test
    public void getTimesheetsByEmployeeId_returns_list_of_all_timesheets_for_employee() {
        List<Timesheet> timesheets = dao.getTimesheetsByEmployeeId(1);
        Assert.assertEquals(2, timesheets.size());
    }
    @Test
    public void getTimesheetsByProjectId_returns_list_of_all_timesheets_for_project() {
        List<Timesheet> timesheets = dao.getTimesheetsByProjectId(1);
        Assert.assertEquals(3, timesheets.size());
    }

    @Test
    public void createTimesheet_returns_timesheet_with_id_and_expected_values() {
        Timesheet createdTimesheet = dao.createTimesheet(timesheetTest);

        Integer newId = createdTimesheet.getTimesheetId();
        Assert.assertTrue(newId > 0);

        timesheetTest.setTimesheetId(newId);
        assertTimesheetsMatch(timesheetTest, createdTimesheet);
    }

    @Test
    public void created_timesheet_has_expected_values_when_retrieved() {
        Timesheet createdTimesheet = dao.createTimesheet(timesheetTest);
        Integer newId = createdTimesheet.getTimesheetId();
        Timesheet retrievedTimesheet = dao.getTimesheet(newId);

        assertTimesheetsMatch(createdTimesheet, retrievedTimesheet);

    }

    @Test
    //bug fixed
    public void updated_timesheet_has_expected_values_when_retrieved() {
        Timesheet timesheetToUpdate = dao.getTimesheet(1);

        timesheetToUpdate.setEmployeeId(1);
        timesheetToUpdate.setProjectId(1);
        timesheetToUpdate.setDateWorked(LocalDate.parse("2021-02-01"));
        timesheetToUpdate.setHoursWorked(1.0);
        timesheetToUpdate.setBillable(false);
        timesheetToUpdate.setDescription("Updated description");

        dao.updateTimesheet(timesheetToUpdate);

        Timesheet retrievedTimesheet = dao.getTimesheet(1);
        assertTimesheetsMatch(timesheetToUpdate, retrievedTimesheet);
    }

    @Test
    public void deleted_timesheet_cant_be_retrieved() {
        dao.deleteTimesheet(1);

        Timesheet retrievedTimesheet = dao.getTimesheet(1);
        Assert.assertNull(retrievedTimesheet);
    }

    @Test
    //bug fixed
    public void getBillableHours_returns_correct_total() {
        double time = dao.getBillableHours(1, 1);
        Assert.assertEquals(2.5, time, 0.1);
    }

    private void assertTimesheetsMatch(Timesheet expected, Timesheet actual) {
        Assert.assertEquals(expected.getTimesheetId(), actual.getTimesheetId());
        Assert.assertEquals(expected.getEmployeeId(), actual.getEmployeeId());
        Assert.assertEquals(expected.getProjectId(), actual.getProjectId());
        Assert.assertEquals(expected.getDateWorked(), actual.getDateWorked());
        Assert.assertEquals(expected.getHoursWorked(), actual.getHoursWorked(), 0.001);
        Assert.assertEquals(expected.isBillable(), actual.isBillable());
        Assert.assertEquals(expected.getDescription(), actual.getDescription());
    }

}
