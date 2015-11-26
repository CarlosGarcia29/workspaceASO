
package com.bbva.zic.accountsv02.business.dto;

import java.util.Date;
import java.util.List;


public class DTOIntAccount {
		
    private String id;
        
    private DTOIntContractFormat formats;
    
    private DTOIntProduct product;
    
    private DTOIntProduct subproduct;
    
    private DTOIntCurrency currency;
    
    private DTOIntMoney currentBalance;
    
    private DTOIntMoney availableBalance;
    
    private DTOIntMoney valuedBalance;
    
    private String valuedBalanceDate;
    
    private DTOIntOptionsList status;
    
    private DTOIntContractBlock block;
    
    private DTOIntBranch branch;
    
    private String managementUnit;
    
    private Date openingDate;
    
    private Date expirationDate;
    
    private Date cancelationDate;
    
    private Boolean hasCheckBooks;
    
    private DTOIntAccount asociateCCC;
    
    private DTOIntAccountBlocking blockings;
    
    private String ownershipType; 
    
    private DTOIntMoney pendingBalance;
    
    private DTOIntMoney bookingBalance;
    
    private String accountNumber;
    
    private String checkDigit;
    
    
    private String asoCCC;
    
    private List<DTOIntAccountBlocking> blocking;
    
	
	public List<DTOIntAccountBlocking> getBlocking() {
		return blocking;
	}
	public void setBlocking(List<DTOIntAccountBlocking> blocking) {
		this.blocking = blocking;
	}
	
	public String getAsoCCC() {
		return asoCCC;
	}
	public void setAsoCCC(String asoCCC) {
		this.asoCCC = asoCCC;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public DTOIntContractFormat getFormats() {
		return formats;
	}
	public void setFormats(DTOIntContractFormat formats) {
		this.formats = formats;
	}

	public DTOIntProduct getProduct() {
		return product;
	}
	public void setProduct(DTOIntProduct product) {
		this.product = product;
	}

	public DTOIntProduct getSubproduct() {
		return subproduct;
	}
	public void setSubproduct(DTOIntProduct subproduct) {
		this.subproduct = subproduct;
	}

	public DTOIntCurrency getCurrency() {
		return currency;
	}
	public void setCurrency(DTOIntCurrency currency) {
		this.currency = currency;
	}

	public DTOIntMoney getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(DTOIntMoney currentBalance) {
		this.currentBalance = currentBalance;
	}

	public DTOIntMoney getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(DTOIntMoney availableBalance) {
		this.availableBalance = availableBalance;
	}

	public DTOIntMoney getValuedBalance() {
		return valuedBalance;
	}
	public void setValuedBalance(DTOIntMoney valuedBalance) {
		this.valuedBalance = valuedBalance;
	}

	public DTOIntOptionsList getStatus() {
		return status;
	}
	public void setStatus(DTOIntOptionsList status) {
		this.status = status;
	}

	public DTOIntContractBlock getBlock() {
		return block;
	}
	public void setBlock(DTOIntContractBlock block) {
		this.block = block;
	}

	public DTOIntBranch getBranch() {
		return branch;
	}
	public void setBranch(DTOIntBranch branch) {
		this.branch = branch;
	}

	public String getManagementUnit() {
		return managementUnit;
	}
	public void setManagementUnit(String managementUnit) {
		this.managementUnit = managementUnit;
	}

	public Date getOpeningDate() {
		return openingDate;
	}
	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Date getCancelationDate() {
		return cancelationDate;
	}
	public void setCancelationDate(Date cancelationDate) {
		this.cancelationDate = cancelationDate;
	}
	
	public Boolean getHasCheckBooks() {
		return hasCheckBooks;
	}
	public void setHasCheckBooks(Boolean hasCheckBooks) {
		this.hasCheckBooks = hasCheckBooks;
	}
	
	public DTOIntAccount getAsociateCCC() {
		return asociateCCC;
	}
	public void setAsociateCCC(DTOIntAccount asociateCCC) {
		this.asociateCCC = asociateCCC;
	}
	public String getValuedBalanceDate() {
		return valuedBalanceDate;
	}
	public void setValuedBalanceDate(String valuedBalanceDate) {
		this.valuedBalanceDate = valuedBalanceDate;
	}
	public DTOIntAccountBlocking getBlockings() {
		return blockings;
	}
	public void setBlockings(DTOIntAccountBlocking blockings) {
		this.blockings = blockings;
	}
	public String getOwnershipType() {
		return ownershipType;
	}
	public void setOwnershipType(String ownershipType) {
		this.ownershipType = ownershipType;
	}
	public DTOIntMoney getPendingBalance() {
		return pendingBalance;
	}
	public void setPendingBalance(DTOIntMoney pendingBalance) {
		this.pendingBalance = pendingBalance;
	}
	public DTOIntMoney getBookingBalance() {
		return bookingBalance;
	}
	public void setBookingBalance(DTOIntMoney bookingBalance) {
		this.bookingBalance = bookingBalance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountrNumber) {
		this.accountNumber = accountrNumber;
	}
	public String getCheckDigit() {
		return checkDigit;
	}
	public void setCheckDigit(String checkDigit) {
		this.checkDigit = checkDigit;
	}
	
	
		
}