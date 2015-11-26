package com.bbva.zic.accountsv02.facade.v02.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.wordnik.swagger.annotations.ApiModelProperty;

@XmlRootElement(name = "Account", namespace = "urn:com:bbva:zic:accountsv02:facade:v02:dto")
@XmlType(name = "Account", namespace = "urn:com:bbva:zic:accountsv02:facade:v02:dto")
@XmlAccessorType(XmlAccessType.FIELD)
public class Account implements Serializable{
	
public final static long serialVersionUID = 1L;
    
    
    @ApiModelProperty("Corresponde con la codificaci\u00f3n de un contrato de  BBVA")
    private String id;
    
    @ApiModelProperty("Corresponde con la codificación externa de un contrato")
    private ContractFormat formats;
    
    @ApiModelProperty("Producto del catálogo comercial del banco asociado al contrato")
    private Product product;
    
    @ApiModelProperty("Subproducto")
    private Product subproduct;
    
    @ApiModelProperty("Divisa de la cuenta: MXN, EUR, USD…")
    private Currency currency;
    
    @ApiModelProperty("Saldo real o actual de la cuenta de la divisa asociada a la cuenta ")
    private Money currentBalance;
    
    @ApiModelProperty("Saldo disponible en la cuenta de la divisa asociada a la cuenta")
    private Money availableBalance;
    
    @ApiModelProperty("Saldo valorado de la cuenta.")
    private Money valuedBalance;
    
    @ApiModelProperty(".")
    private String valuedBalanceDate;
    
    @ApiModelProperty("Estado en el que se encuentra el contrato: propuesta, en vigor, ...")
    private OptionsList status;
    
    @ApiModelProperty("Información de bloqueo de un contrato. Algunos ejemplos de bloqueos son: Robo, Extravio, Mora")
    private ContractBlock block;
    
    @ApiModelProperty("Oficina")
    private Branch branch;
    
    @ApiModelProperty("Unidad de gestión")
    private String managementUnit;
    
    @ApiModelProperty("Fecha de apertura de la cuenta")
    private Date openingDate;
    
    @ApiModelProperty("Fecha en la que el contrato ha finalizado su vigencia.")
    private Date expirationDate;
    
    @ApiModelProperty("Fecha en la que el contrato se ha cancelado")
    private Date cancelationDate;
    
    @ApiModelProperty("Indicador de si la cuenta tiene talonarios")
    private Boolean hasCheckBooks;
    
    @ApiModelProperty("Objeto de posibles cuentas asociadas")
    private Account asociateCCC;
    
    @ApiModelProperty("Cuenta Asociada")
    private String asoCCC;
    
    @ApiModelProperty("Indicador de bloqueo automatico por inactividad")
    private List<AccountBlocking> blockings;
    
    @ApiModelProperty("Indicador de bloqueo automatico por inactividad")
    private String ownershipType;
    
    @ApiModelProperty("Cantidad pendiente de pago")
    private Money pendingBalance;
    
    @ApiModelProperty("Saldo de la libreta")
    private Money bookingBalance;
    
    @ApiModelProperty("Saldo de la libreta")
    private String accountNumber;
    
    @ApiModelProperty("Digito verificador almacenado en tablas corporativas," 
    				  +"con el cual los front pueden correr un algoritmo para saber que el número"
    				  +"de cuenta no se ha repetido o asignado.")
    private String checkDigit;
    
    public List<AccountBlocking> getBlocking() {
		return blockings;
	}
	public void setBlocking(List<AccountBlocking> blockings) {
		this.blockings = blockings;
	}
	
	public Account getAsociateCCC() {
		return asociateCCC;
	}
	public void setAsociateCCC(Account asociateCCC) {
		this.asociateCCC = asociateCCC;
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

	public ContractFormat getFormats() {
		return formats;
	}
	public void setFormats(ContractFormat formats) {
		this.formats = formats;
	}

	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}

	public Product getSubproduct() {
		return subproduct;
	}
	public void setSubproduct(Product subproduct) {
		this.subproduct = subproduct;
	}

	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public Money getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(Money currentBalance) {
		this.currentBalance = currentBalance;
	}

	public Money getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(Money availableBalance) {
		this.availableBalance = availableBalance;
	}
	
	public Money getValuedBalance() {
		return valuedBalance;
	}
	public void setValuedBalance(Money valuedBalance) {
		this.valuedBalance = valuedBalance;
	}

	public OptionsList getStatus() {
		return status;
	}
	public void setStatus(OptionsList status) {
		this.status = status;
	}

	public ContractBlock getBlock() {
		return block;
	}
	public void setBlock(ContractBlock block) {
		this.block = block;
	}

	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
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
	public String getValuedBalanceDate() {
		return valuedBalanceDate;
	}
	public void setValuedBalanceDate(String valuedBalanceDate) {
		this.valuedBalanceDate = valuedBalanceDate;
	}
	public List<AccountBlocking> getBlockings() {
		return blockings;
	}
	public void setBlockings(List<AccountBlocking> blockings) {
		this.blockings = blockings;
	}
	public String getOwnershipType() {
		return ownershipType;
	}
	public void setOwnershipType(String ownershipType) {
		this.ownershipType = ownershipType;
	}
	public Money getPendingBalance() {
		return pendingBalance;
	}
	public void setPendingBalance(Money pendingBalance) {
		this.pendingBalance = pendingBalance;
	}
	public Money getBookingBalance() {
		return bookingBalance;
	}
	public void setBookingBalance(Money bookingBalance) {
		this.bookingBalance = bookingBalance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCheckDigit() {
		return checkDigit;
	}
	public void setCheckDigit(String checkDigit) {
		this.checkDigit = checkDigit;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
