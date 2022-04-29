package org.ibm.springboot.model;

import java.util.Date;

public class Employee {
	
	private String _rev;
	private String _id;
	
	private String todayDate;
	private String  title;
	private String  workphone;
	private String  emailAddress;
	private String  fullName;
	private String  personalAddress;
	private String  homePhone;
	private String  cellPhone;
	private String  personalEmailAddress;
	private String  first;
	private String  last;
	private String  address;
	private String  city;
	private String  state;
	private String  zipcode;
	private String  primaryPhone;
	private String  alternatePhone;
	private String  relationship;
	private String  ecifirst;
	private String  ecilast;
	private String  eciaddress;
	private String  ecicity;
	private String  ecistate;
	private String  ecizipcode;
	private String  eciprimaryPhone;
	private String  ecialternatePhone;
	private String  ecirelationship;
	
	private Employee() {
		
	}
	
	public Employee(String _rev, String _id, String todayDate, String title, String workphone, String emailAddress,
			String fullName, String personalAddress, String homePhone, String cellPhone, String personalEmailAddress,
			String first, String last, String address, String city, String state, String zipcode, String primaryPhone,
			String alternatePhone, String relationship, String ecifirst, String ecilast, String eciaddress,
			String ecicity, String ecistate, String ecizipcode, String eciprimaryPhone, String ecialternatePhone,
			String ecirelationship) {
		super();
		this._rev = _rev;
		this._id = _id;
		this.todayDate = todayDate;
		this.title = title;
		this.workphone = workphone;
		this.emailAddress = emailAddress;
		this.fullName = fullName;
		this.personalAddress = personalAddress;
		this.homePhone = homePhone;
		this.cellPhone = cellPhone;
		this.personalEmailAddress = personalEmailAddress;
		this.first = first;
		this.last = last;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.primaryPhone = primaryPhone;
		this.alternatePhone = alternatePhone;
		this.relationship = relationship;
		this.ecifirst = ecifirst;
		this.ecilast = ecilast;
		this.eciaddress = eciaddress;
		this.ecicity = ecicity;
		this.ecistate = ecistate;
		this.ecizipcode = ecizipcode;
		this.eciprimaryPhone = eciprimaryPhone;
		this.ecialternatePhone = ecialternatePhone;
		this.ecirelationship = ecirelationship;
	}
	public String get_rev() {
		return _rev;
	}
	public void set_rev(String _rev) {
		this._rev = _rev;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getTodayDate() {
		return todayDate;
	}
	public void setTodayDate(String todayDate) {
		this.todayDate = todayDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWorkphone() {
		return workphone;
	}
	public void setWorkphone(String workphone) {
		this.workphone = workphone;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPersonalAddress() {
		return personalAddress;
	}
	public void setPersonalAddress(String personalAddress) {
		this.personalAddress = personalAddress;
	}
	public String getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	public String getPersonalEmailAddress() {
		return personalEmailAddress;
	}
	public void setPersonalEmailAddress(String personalEmailAddress) {
		this.personalEmailAddress = personalEmailAddress;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getPrimaryPhone() {
		return primaryPhone;
	}
	public void setPrimaryPhone(String primaryPhone) {
		this.primaryPhone = primaryPhone;
	}
	public String getAlternatePhone() {
		return alternatePhone;
	}
	public void setAlternatePhone(String alternatePhone) {
		this.alternatePhone = alternatePhone;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public String getEcifirst() {
		return ecifirst;
	}
	public void setEcifirst(String ecifirst) {
		this.ecifirst = ecifirst;
	}
	public String getEcilast() {
		return ecilast;
	}
	public void setEcilast(String ecilast) {
		this.ecilast = ecilast;
	}
	public String getEciaddress() {
		return eciaddress;
	}
	public void setEciaddress(String eciaddress) {
		this.eciaddress = eciaddress;
	}
	public String getEcicity() {
		return ecicity;
	}
	public void setEcicity(String ecicity) {
		this.ecicity = ecicity;
	}
	public String getEcistate() {
		return ecistate;
	}
	public void setEcistate(String ecistate) {
		this.ecistate = ecistate;
	}
	public String getEcizipcode() {
		return ecizipcode;
	}
	public void setEcizipcode(String ecizipcode) {
		this.ecizipcode = ecizipcode;
	}
	public String getEciprimaryPhone() {
		return eciprimaryPhone;
	}
	public void setEciprimaryPhone(String eciprimaryPhone) {
		this.eciprimaryPhone = eciprimaryPhone;
	}
	public String getEcialternatePhone() {
		return ecialternatePhone;
	}
	public void setEcialternatePhone(String ecialternatePhone) {
		this.ecialternatePhone = ecialternatePhone;
	}
	public String getEcirelationship() {
		return ecirelationship;
	}
	public void setEcirelationship(String ecirelationship) {
		this.ecirelationship = ecirelationship;
	}

	@Override
	public String toString() {
		return "Employee [_rev=" + _rev + ", _id=" + _id + ", todayDate=" + todayDate + ", title=" + title
				+ ", workphone=" + workphone + ", emailAddress=" + emailAddress + ", fullName=" + fullName
				+ ", personalAddress=" + personalAddress + ", homePhone=" + homePhone + ", cellPhone=" + cellPhone
				+ ", personalEmailAddress=" + personalEmailAddress + ", first=" + first + ", last=" + last
				+ ", address=" + address + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode
				+ ", primaryPhone=" + primaryPhone + ", alternatePhone=" + alternatePhone + ", relationship="
				+ relationship + ", ecifirst=" + ecifirst + ", ecilast=" + ecilast + ", eciaddress=" + eciaddress
				+ ", ecicity=" + ecicity + ", ecistate=" + ecistate + ", ecizipcode=" + ecizipcode
				+ ", eciprimaryPhone=" + eciprimaryPhone + ", ecialternatePhone=" + ecialternatePhone
				+ ", ecirelationship=" + ecirelationship + "]";
	}	
	
}
