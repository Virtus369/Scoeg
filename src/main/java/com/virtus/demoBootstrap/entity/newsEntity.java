package com.virtus.demoBootstrap.entity;


import java.util.Date;
import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "TSB_TB_CORE_SYSTEM_NEWS", schema = "dbo")
public class newsEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "SN")
  private Long sn;

  @Column(name = "NEWS")
  private String news;


  @Column(name = "CREATE_USER")
  private String createUser;

  @Column(name = "CREATE_DATA")
  private Date createDate;

}
