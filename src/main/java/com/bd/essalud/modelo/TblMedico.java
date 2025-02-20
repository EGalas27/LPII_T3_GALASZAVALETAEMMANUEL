package com.bd.essalud.modelo;


import java.util.Date;

public class TblMedico {
	
	private int idmedicot3;
	private String nombret3;
	private String apelldiot3;
	private String emailt3;
	private int dnit3;
	private String estadocivilt3;
	private Date fechanacimt3;
	
	
	public TblMedico(int idmedicot3, String nombret3, String apelldiot3, String emailt3, int dnit3,
			String estadocivilt3, Date fechanacimt3) {
		//super();
		this.idmedicot3 = idmedicot3;
		this.nombret3 = nombret3;
		this.apelldiot3 = apelldiot3;
		this.emailt3 = emailt3;
		this.dnit3 = dnit3;
		this.estadocivilt3 = estadocivilt3;
		this.fechanacimt3 = fechanacimt3;
	}


	public TblMedico() {
		//super();
	}
	
	
	
	
	
}
