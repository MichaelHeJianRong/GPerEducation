package com.patten.template.jdbc;

import javax.sql.DataSource;

public abstract class JdbcTemplate {

   private DataSource dataSource;

   private JdbcTemplate(DataSource dataSource){
       this.dataSource = dataSource;
   }


}
