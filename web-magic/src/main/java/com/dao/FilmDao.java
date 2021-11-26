package com.dao;

import com.entity.Films;

import java.sql.*;

public class FilmDao {
    private Connection conn = null;
    private Statement stmt = null;

    public FilmDao(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/movie?"
                    + "user=root&password=yu925546103&useUnicode=true&characterEncoding=UTF8";
            conn = DriverManager.getConnection(url);
            stmt = conn.createStatement();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int insert(Films films) throws SQLException {
        String SQL = "INSERT INTO films (title,yr,poster,avgRating,description,director,leadactors,typelist,backpost) VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(SQL);
        //ps.setInt(1,null);
        ps.setString(1,films.getTitle());
        ps.setString(2,films.getYr());
        ps.setString(3,films.getPoster());
        ps.setDouble(4,films.getAvgrating());
        ps.setString(5,films.getDescription());
        ps.setString(6,films.getDirector());
        ps.setString(7,films.getLeadactors());
        ps.setString(8,films.getTypelist());
        ps.setString(9,films.getPoster());
        return ps.executeUpdate();
    }

}
