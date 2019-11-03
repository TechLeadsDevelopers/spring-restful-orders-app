package com.spring.restful.orders.app.common;

public interface DbQueries {
	String INSERT_ORDER="INSERT INTO ORDER1( ID, NAME, DESCRIPTION, STATUS, ORDERDATE,LASTUPDATED) VALUES (ORDER_ID_SEQ.NEXTVAL,?,?,?,?,?)";
	String GET_ALL_ORDERS="SELECT ID, NAME, DESCRIPTION, STATUS, ORDERDATE,LASTUPDATED FROM ORDER1";
	String GET_ORDER_BY_ID="SELECT ID, NAME, DESCRIPTION, STATUS, ORDERDATE,LASTUPDATED FROM ORDER1 WHERE ID=?";
	String UPDATE_ORDER_BY_ID="UPDATE ORDER1 SET NAME =?, DESCRIPTION  =?, STATUS =?, LASTUPDATED  =? WHERE ID =? ";
	String DELETE_ORDER_BY_ID="DELETE FROM ORDER1 WHERE ID =?";
}