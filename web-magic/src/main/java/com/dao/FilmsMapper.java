package com.dao;

import com.entity.Films;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FilmsMapper {
    int deleteByPrimaryKey(Integer idfilm);

    int insert(Films record);

    Films selectByPrimaryKey(Integer idfilm);

    List<Films> selectAll();

    int updateByPrimaryKey(Films record);
}