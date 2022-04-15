package cl.icap.fullstackjava2022.modulo6.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Producto {
	@Column(name = "id_prod")
	@Id
	private Integer idProd;
	@Column(name = "descrip_prod")
	private String descProd;
	@Column(name = "unid_medida")
	private String unidMed;
	@Column(name = "id_tprod")
    private Integer idTprod;

	public Producto() {
	}
		

	public Producto(Integer idProd, String descProd, String unidMed, Integer idTprod) {
		this.idProd = idProd;
		this.descProd = descProd;
       	this.unidMed = unidMed;
        this.idTprod = idTprod;
	}

	public Integer getId_prod() {
		return idProd;
	}

	public void setId_prod(Integer idProd) {
		this.idProd = idProd;
	}

	public String getDescrip_prod() {
		return descProd;
	}

	public void setDescrip_prod(String descProd) {
		this.descProd = descProd;
	}

    public String getUnid_medida() {
		return unidMed;
	}

	public void setUnid_medida(String unidMed) {
		this.unidMed = unidMed;
	}

    public Integer getId_tprod() {
		return idTprod;
	}

	public void setId_tprod(Integer idTprod) {
		this.idTprod = idTprod;
	}
	
}