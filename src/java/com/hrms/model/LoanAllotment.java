package com.hrms.model;
// Generated Dec 16, 2016 10:52:21 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * LoanAllotment generated by hbm2java
 */
public class LoanAllotment  implements java.io.Serializable {


     private Integer id;
     private EmployeeProfile employeeProfile;
     private Departments deptlId;
     private LoansMaster loansMaster;
     private String loanType;
     private Integer gasLoan;
     private Integer traLoan;
     private Integer cashLoan;
     private Integer requestedAmt;
     private Integer sanctionedAmt;
     private String status;
     private Date loanApprovalDate;
     private String householdThings;
     private Date loanCreationDate;

    public LoanAllotment() {
    }

    public Departments getDeptlId() {
        return deptlId;
    }

    public void setDeptlId(Departments deptlId) {
        this.deptlId = deptlId;
    }

    public LoanAllotment(EmployeeProfile employeeProfile, LoansMaster loansMaster, String loanType, Integer gasLoan, Integer traLoan, Integer cashLoan, Integer requestedAmt, Integer sanctionedAmt, String status, Date loanApprovalDate, String householdThings) {
       this.employeeProfile = employeeProfile;
       this.loansMaster = loansMaster;
       this.loanType = loanType;
       this.gasLoan = gasLoan;
       this.traLoan = traLoan;
       this.cashLoan = cashLoan;
       this.requestedAmt = requestedAmt;
       this.sanctionedAmt = sanctionedAmt;
       this.status = status;
       this.loanApprovalDate = loanApprovalDate;
       this.householdThings = householdThings;
    }

    public Date getLoanCreationDate() {
        return loanCreationDate;
    }

    public void setLoanCreationDate(Date loanCreationDate) {
        this.loanCreationDate = loanCreationDate;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public EmployeeProfile getEmployeeProfile() {
        return this.employeeProfile;
    }
    
    public void setEmployeeProfile(EmployeeProfile employeeProfile) {
        this.employeeProfile = employeeProfile;
    }
    public LoansMaster getLoansMaster() {
        return this.loansMaster;
    }
    
    public void setLoansMaster(LoansMaster loansMaster) {
        this.loansMaster = loansMaster;
    }
    public String getLoanType() {
        return this.loanType;
    }
    
    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }
    public Integer getGasLoan() {
        return this.gasLoan;
    }
    
    public void setGasLoan(Integer gasLoan) {
        this.gasLoan = gasLoan;
    }
    public Integer getTraLoan() {
        return this.traLoan;
    }
    
    public void setTraLoan(Integer traLoan) {
        this.traLoan = traLoan;
    }
    public Integer getCashLoan() {
        return this.cashLoan;
    }
    
    public void setCashLoan(Integer cashLoan) {
        this.cashLoan = cashLoan;
    }
    public Integer getRequestedAmt() {
        return this.requestedAmt;
    }
    
    public void setRequestedAmt(Integer requestedAmt) {
        this.requestedAmt = requestedAmt;
    }
    public Integer getSanctionedAmt() {
        return this.sanctionedAmt;
    }
    
    public void setSanctionedAmt(Integer sanctionedAmt) {
        this.sanctionedAmt = sanctionedAmt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Date getLoanApprovalDate() {
        return this.loanApprovalDate;
    }
    
    public void setLoanApprovalDate(Date loanApprovalDate) {
        this.loanApprovalDate = loanApprovalDate;
    }
    public String getHouseholdThings() {
        return this.householdThings;
    }
    
    public void setHouseholdThings(String householdThings) {
        this.householdThings = householdThings;
    }




}


