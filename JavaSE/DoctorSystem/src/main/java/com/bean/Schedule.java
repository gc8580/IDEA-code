package com.bean;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @BelongsProject: JavaSE
 * @BelongsPackage: com
 * @Author: Jove
 * @CreateTime: 2023-07-28  11:24
 * @Description: TODO
 */

public class Schedule {
    private LocalDate today;
    private boolean update; // 是否排班过，默认是未排班
    // 上午
    private boolean morning; // 是否看诊
    private LocalTime mstart;
    private LocalTime mend;
    private int mTotalNumber;
    private int mAppointNumbe;

    // 下午
    private boolean afternoon; // 是否看诊
    private LocalTime astart;
    private LocalTime aend;
    private int aTotalNumber;
    private int aAppointNumber;

    public Schedule() {
    }

    public Schedule(LocalDate today, boolean update, boolean morning, LocalTime mstart, LocalTime mend, int mTotalNumber, int mAppointNumbe, boolean afternoon, LocalTime astart, LocalTime aend, int aTotalNumber, int aAppointNumber) {
        this.today = today;
        this.update = update;
        this.morning = morning;
        this.mstart = mstart;
        this.mend = mend;
        this.mTotalNumber = mTotalNumber;
        this.mAppointNumbe = mAppointNumbe;
        this.afternoon = afternoon;
        this.astart = astart;
        this.aend = aend;
        this.aTotalNumber = aTotalNumber;
        this.aAppointNumber = aAppointNumber;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "today=" + today +
                ", update=" + update +
                ", morning=" + morning +
                ", mstart=" + mstart +
                ", mend=" + mend +
                ", mTotalNumber=" + mTotalNumber +
                ", mAppointNumbe=" + mAppointNumbe +
                ", afternoon=" + afternoon +
                ", astart=" + astart +
                ", aend=" + aend +
                ", aTotalNumber=" + aTotalNumber +
                ", aAppointNumber=" + aAppointNumber +
                '}';
    }

    public LocalDate getToday() {
        return today;
    }

    public void setToday(LocalDate today) {
        this.today = today;
    }

    public boolean isUpdate() {
        return update;
    }

    public void setUpdate(boolean update) {
        this.update = update;
    }

    public boolean isMorning() {
        return morning;
    }

    public void setMorning(boolean morning) {
        this.morning = morning;
    }

    public LocalTime getMstart() {
        return mstart;
    }

    public void setMstart(LocalTime mstart) {
        this.mstart = mstart;
    }

    public LocalTime getMend() {
        return mend;
    }

    public void setMend(LocalTime mend) {
        this.mend = mend;
    }

    public int getmTotalNumber() {
        return mTotalNumber;
    }

    public void setmTotalNumber(int mTotalNumber) {
        this.mTotalNumber = mTotalNumber;
    }

    public int getmAppointNumbe() {
        return mAppointNumbe;
    }

    public void setmAppointNumbe(int mAppointNumbe) {
        this.mAppointNumbe = mAppointNumbe;
    }

    public boolean isAfternoon() {
        return afternoon;
    }

    public void setAfternoon(boolean afternoon) {
        this.afternoon = afternoon;
    }

    public LocalTime getAstart() {
        return astart;
    }

    public void setAstart(LocalTime astart) {
        this.astart = astart;
    }

    public LocalTime getAend() {
        return aend;
    }

    public void setAend(LocalTime aend) {
        this.aend = aend;
    }

    public int getaTotalNumber() {
        return aTotalNumber;
    }

    public void setaTotalNumber(int aTotalNumber) {
        this.aTotalNumber = aTotalNumber;
    }

    public int getaAppointNumber() {
        return aAppointNumber;
    }

    public void setaAppointNumber(int aAppointNumber) {
        this.aAppointNumber = aAppointNumber;
    }
}


