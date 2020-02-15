package com.kons.dao.impl;

import com.kons.App;
import com.kons.bean.User;
import com.kons.dao.IUserDao;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDaoImpl implements IUserDao {
    @Override
    public List<User> findUserById(List<Integer> ids) {
//        User user;
//        try (SqlSession sqlSession= App.getSqlSession()){
//            user =sqlSession.selectOne("findUserById",1);
//        }
        return null;
    }
}
