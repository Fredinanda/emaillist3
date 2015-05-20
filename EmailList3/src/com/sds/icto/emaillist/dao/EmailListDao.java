package com.sds.icto.emaillist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.pool.OracleDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.sds.icto.emaillist.vo.EmailListVo;

@Repository
public class EmailListDao {
	@Autowired
	SqlMapClientTemplate sqlMapClientTemplete;
	
	
	
	
	public void insert( EmailListVo vo ){
		sqlMapClientTemplete.insert
		("emaillist.insert",vo);
	}

	public void delete( Long id ) {
	}
	
	public void delete(){
	}
	
	
	@SuppressWarnings("unchecked")
	public List<EmailListVo> fetchList()  {
		List<EmailListVo> list = 
				sqlMapClientTemplete.queryForList("emaillist.list");
		
		return list;
	}
}
