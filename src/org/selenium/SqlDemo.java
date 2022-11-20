package org.selenium;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.checkerframework.common.reflection.qual.ForName;

import graphql.relay.Connection;

public class SqlDemo {
public static void main(String[] args) throws Exception {
	Class.forName("oracle.jdbc.driver.oracleDriver");
Connection c = DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:xe","hr","Kambli@15");
String s = "select * from employes";

}
}
