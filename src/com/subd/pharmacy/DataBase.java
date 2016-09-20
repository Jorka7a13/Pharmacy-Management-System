package com.subd.pharmacy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DataBase {

		private static String dbURL = "jdbc:derby:pharmacy1;create=true;user=me;password=mine";
		private static String tableName = "pharmacy1";
		private Connection conn = null;
		private Statement stmt = null;
		
		public DataBase() {
			createConnection();
			createStatement();
		}
		
		private void createConnection() {
			try {
				Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
				conn = DriverManager.getConnection(dbURL);
			} catch (Exception except) {
				System.out.println("Error in creating connection!");
				except.printStackTrace();
			}
		}
		
		private void createStatement() {
			try {
				stmt = conn.createStatement();
			} catch(Exception ex) {
				System.out.println("Error in creating statement!");
				ex.printStackTrace();
			}
			createTable();
		}
		
		private void createTable() {
			try {
				stmt.executeUpdate("create table " + tableName + " (userName varchar(20), password varchar(20), gender varchar(10), hairColor varchar(10), location varchar(10), age varchar(3), lookingForGender varchar(10), lookingForLocation varchar(10))");
			} catch(Exception ex) {
			}
		}
			
		public void insertValues(User user) {
			//createConnection();
			//createStatement();
			try {
				
					stmt.executeUpdate("insert into " + tableName + " values (" + user.getUserName() + ",'" + user.getPassword() + ",'" + user.getGender() + ",'" + user.getHairColor() + ",'"  + user.getLocation() + ",'" + user.getAge() + ",'" + user.getLookingForGender() + ",'" + user.getLookingForLocation() + "')");

			} catch(Exception ex) {
				System.out.println("Error in adding data!");
			}
		}
		
		public ArrayList<User> findMatches(User user) {

			ArrayList<User> list = new ArrayList<User>();
			
			//createConnection();
			//createStatement();
			
			
			try {
				ResultSet rs = stmt.executeQuery("select * from " + tableName + " where " + user.getLookingForGender() + "=" + match.getGender() + " and " + match.getLookingForGender() + "=" + user.getGender() + " and " + );
				while(rs.next()) {
					list.add(rs.getString(1));
				}
			} catch(Exception ex) {
				System.out.println("Error in getting data!");
			}
			return list;
		}
		
		public void clearDB() {
			try {
				stmt.executeUpdate("delete from " + tableName);
			} catch(Exception ex) {
				System.out.println("Error in deleting data!");
			}
		}


}
