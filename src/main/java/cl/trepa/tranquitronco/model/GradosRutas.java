package cl.trepa.tranquitronco.model;

import java.io.Serializable;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.lang.NonNull;

@Entity
@Table(name = "grados_rutas")
@EntityListeners(AuditingEntityListener.class)
public class GradosRutas implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@NonNull
	@Column(name = "GRADO_ID", unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer gradoId;
	
	@Column(name = "GRADO_FR", length = 10)
	private String gradoFr;
	
	@Column(name = "GRADO_YS")
	private String gradoYs;
	
	@Column(name = "GRADO_ID_PADRE")
	private String gradoIdPadre;

	public Integer getGradoId() {
		return gradoId;
	}

	public void setGradoId(Integer gradoId) {
		this.gradoId = gradoId;
	}

	public String getGradoFr() {
		return gradoFr;
	}

	public void setGradoFr(String gradoFr) {
		this.gradoFr = gradoFr;
	}

	public String getGradoYs() {
		return gradoYs;
	}

	public void setGradoYs(String gradoYs) {
		this.gradoYs = gradoYs;
	}

	public String getGradoIdPadre() {
		return gradoIdPadre;
	}

	public void setGradoIdPadre(String gradoIdPadre) {
		this.gradoIdPadre = gradoIdPadre;
	}
	
}
