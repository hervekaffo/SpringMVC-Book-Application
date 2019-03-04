package edu.herve.spring.mvc.domain;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * 1. Entity class using standard JPA annotations.
 * A new transient property  called birthDateString is added, which will 
 * be used for front-end presentation later.
 * For the "photo" attribute, we use a byte array as the Java data type, 
 * which corresponds to the BLOB data type in the RDBMS. In addition, the
 *  getter method is annotated with @Lob (indicates to the JPA provider that 
 *  it’s a large object column),and @Basic(fetch=FetchType.LAZY) that improves 
 *  performance.
 */

import java.io.Serializable;
import java.math.BigDecimal;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.NotBlank;
import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull; 

@Entity
@Table(name = "book")
public class Book implements Serializable{
	
	private Long id;
    private String isbn;
    private String title;
    private BigDecimal price;
    private String categoryName;
    private String publisher;
    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@NotEmpty(message="{validation.isbn.NotEmpty.message}")
    @Size(min=3, max=60, message="{validation.isbn.Size.message}")
	@Column(name = "ISBN")
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	@NotEmpty(message="{validation.title.NotEmpty.message}")
    @Size(min=3, max=100, message="{validation.title.Size.message}")
	@Column(name = "TITLE")
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@NotNull(message="{validation.price.NotNull.message}")
	@Column(name = "PRICE")
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	@Column(name = "CATEGORY_NAME")
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	@Column(name = "PUBLISHER")
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", isbn=" + isbn + ", title=" + title + ", price=" + price + ", categoryName="
				+ categoryName + ", publisher=" + publisher + "]";
	}


}
