package ung.mccb.csci.csci3300.model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Student {

    private String firstname;
    private String lastname;
    private String cardinfo;
    private String carmake;
    private String carmodel;
    private String caryear;
    private String carcolor;
    private String cartag;






    public String getCartag() {
        return cartag;
    }

    public void setCartag(String cartag) {
        this.cartag = cartag;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCardinfo() {
        return cardinfo;
    }

    public void setCardinfo(String cardinfo) {
        this.cardinfo = cardinfo;
    }

    public String getCarmake() {
        return carmake;
    }

    public void setCarmake(String carmake) {
        this.carmake = carmake;
    }

    public String getCarmodel() {
        return carmodel;
    }

    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
    }

    public String getCaryear() {
        return caryear;
    }

    public void setCaryear(String caryear) {
        this.caryear = caryear;
    }

    public String getCarcolor() {
        return carcolor;
    }

    public void setCarcolor(String carcolor) {
        this.carcolor = carcolor;
    }



    public int saveRecord(){
        int affectedRow=0;
        String query = "insert into student" + "( firstname, lastname, cardinfo, carmake, carmodel, caryear, carcolor, cartag)"
                + "values(?,?,?,?,?,?,?,?)";

        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement sqlStatement = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);) {

            sqlStatement.setString(1, getFirstname());
            sqlStatement.setString(2, getLastname());
            sqlStatement.setString(3, getCardinfo());
            sqlStatement.setString(4, getCarmake());
            sqlStatement.setString(5, getCarmodel());
            sqlStatement.setString(6, getCaryear());
            sqlStatement.setString(7, getCarcolor());
            sqlStatement.setString(8, getCartag());


            // get the number of return rows
            affectedRow = sqlStatement.executeUpdate();



        } catch (Exception e) {
            System.out.println("Status: operation failed due to " + e);

        }


        return affectedRow;

    }
}



