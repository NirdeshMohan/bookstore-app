package com.ishnit.bookstoreapp.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.ToString;

@Entity
@Table(name="tbl_book")
@Getter
@ToString
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String sku;
	
	private String title;
	
	private String description;
	
	@Column(name="unit_price")
	private BigDecimal unitPrice;
	
	@Column(name="image_url")
	private String imageURL;
	
	@Column(name="units_in_stock")
	private int unitsInStock;
	
	private boolean active;
	
	@Column(name="date_created")
	private Date createdDT;
	
	@Column(name="last_updated")
	private Date updatedDT;
	
	@ManyToOne	
	@JoinColumn(name="category_id", nullable = false)
	private Category category;	
}
