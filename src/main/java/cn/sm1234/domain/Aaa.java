package cn.sm1234.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
/**
 * 一方
 * @author lenovo
 *
 */
@Entity
@Table(name="aaa")
@Data
public class Aaa {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="a_rfnbr")
	private Integer aRfnbr;
	
	@Column(name="a_uid")
	private String aUid;
	
	@Column(name="a_name")
	private String aName;
	
}
