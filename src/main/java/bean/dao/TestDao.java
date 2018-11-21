package bean.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Author: yunxiang.yang
 * @Date: 2018/11/21 11:45
 */

@Repository
public class TestDao {

    @Autowired
    JdbcTemplate jdbcTemplate;
}
