package org.generation.farmacia.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "produto")
public class Produto {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@NotBlank
		@Size(min = 5, max= 100, message = "O nome deve conter entre 5 e 100 caracteres não podendo ser preenchido apenas por espaços")
		private String nome;
		
		@NotBlank
		@Size(min = 10, max= 100, message = "O nome do fabricante deve conter entre 5 e 100 caracteres não podendo ser preenchido apenas por espaços")
		private String fabricante;
		
		@JsonFormat(shape = JsonFormat.Shape.STRING)
		@NotNull(message = "Preço é obrigatório!")
		@Positive(message = "O preço deve ser maior do que zero!")
		private BigDecimal preco;
		
		@Temporal(TemporalType.TIMESTAMP)
		private Date dataChegada = new java.sql.Date(System.currentTimeMillis());
		
		@NotBlank
		@Size(message = "A data de validade não pode estar em branco.")
		private String dataValidade;
		
		private boolean generico;
		
		@ManyToOne
		@JsonIgnoreProperties("produto")
		private Categoria categoria;
		
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getFabricante() {
			return fabricante;
		}

		public void setFabricante(String fabricante) {
			this.fabricante = fabricante;
		}
		
		public BigDecimal getPreco() {
			return preco;
		}

		public void setPreco(BigDecimal preco) {
			this.preco = preco;
		}

		public Date getDataChegada() {
			return dataChegada;
		}

		public void setDataChegada(Date dataChegada) {
			this.dataChegada = dataChegada;
		}

		public String getDataValidade() {
			return dataValidade;
		}

		public void setDataValidade(String dataValidade) {
			this.dataValidade = dataValidade;
		}

		public boolean isGenerico() {
			return generico;
		}

		public void setGenerico(boolean generico) {
			this.generico = generico;
		}

		public Categoria getCategoria() {
			return categoria;
		}

		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}
		
}


