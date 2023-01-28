package com.javamicro.model;

import java.io.Serializable;

//DAR FORMATO					       	 Ctrl + Shift + F
//ELIMINAR LA SIGUIENTE PALABRA       	 Ctrl + Supr
//ELIMINAR LINEA				      	 Ctrl + D
//IMPORTAR LIBRERIA  					 Ctrl + Shift + O
//COPIAR LINE/AS   						 Ctrl + Alt + {flechas]
//COMENTAR 		   	 					 Ctrl + Shift + C || Ctrl + 7
public class ModelData implements Serializable {

	private static final long serialVersionUID = 9045599350765968110L;
	private int code;
	private String mensaje;
	private boolean status;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean statrus) {
		this.status = statrus;
	}

}
